package at.ac.tuwien.big.xmltext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.impl.KeywordImpl;
import org.eclipse.xtext.impl.TypeRefImpl;

public class AMEGroupIdIdref {
	
	// Name of Common ID EClass
	private final static String ECLASS_COMMON_ID_NAME = "IdValues";
	// EStructuralFeature Attribute Name of Common ID EClass
	private final static String ECLASS_COMMON_ID_ATTRIBUTE_NAME = "name";
	
	public static void implIdIdref(Resource ecore, EcoreXSDMapper mapper) {
		refactorIdIdref(ecore);
	}

	public static void implIdIdrefXText(Grammar g, EcoreXSDMapper mapper) {
		refactorIdIdrefXText(g, mapper);
	}

	
	/**
	 * Create common EClass for ID and IDREF. Reference all ID elements by containment and all IDREF elements by non-containment EReference.
	 * @param ecore Resource
	 */
	private static void refactorIdIdref(Resource ecore) {

		
		EPackage pack = (EPackage) ecore.getAllContents().next();
		String eclassCommonIdName = findFreeEClassifier(pack, ECLASS_COMMON_ID_NAME, 0);
		
		//create the common ID-EClass and add to Ecore
		EAttribute esa = EcoreFactory.eINSTANCE.createEAttribute();
			esa.setName(ECLASS_COMMON_ID_ATTRIBUTE_NAME);
			esa.setEType(XMLTypePackage.Literals.ID);
			esa.setUpperBound(1);
			esa.setID(true);
		EClass eclassCommonId = EcoreFactory.eINSTANCE.createEClass();
			eclassCommonId.setName(eclassCommonIdName);
			eclassCommonId.getEStructuralFeatures().add(esa);
		pack.getEClassifiers().add(eclassCommonId);
		

		//search all ID or IDREF EStructuralFeatures and replace with EReference to eClassIdValues
		Collection<EObject> all = EcoreUtil2.allContents(pack);

		for(EObject itm : all) {
			if (itm instanceof EClass && ((EClass) itm).getName() != eclassCommonIdName) {
				EClass eclass = (EClass) itm;
				
				for (EStructuralFeature esf : eclass.getEAllStructuralFeatures()) {

					if (esf.getEType().equals(XMLTypePackage.Literals.ID)) {
						
						EReference erf = EcoreFactory.eINSTANCE.createEReference();

						AMEGroupUtil.copyEStructuralFeature(esf, erf);
						
						erf.setContainment(true);
						erf.setEType(eclassCommonId);					
						
						EcoreUtil.replace(esf, erf);
				
					} else if (esf.getEType().equals(XMLTypePackage.Literals.IDREF)) {
						
						EReference erf = EcoreFactory.eINSTANCE.createEReference();

						AMEGroupUtil.copyEStructuralFeature(esf, erf);
						
						erf.setContainment(false);
						erf.setEType(eclassCommonId);
						
						EcoreUtil.replace(esf, erf);
					
					}
				}
			}
		}
	}
	

	/**
	 * Removes TypeRef/RullCalles except to Common ID EClass TypeRef, for IDREF CrossReferences.
	 * 
	 * Ecore2Xtext creates [IdValues|EString] for EReference [containment = false] (xs:IDREF). 
	 * EString is not valid for IDREF and furthermore undefined, so it has to be removed.
	 * @param g XText Grammar
	 * @param mapper EcoreXSDMapper
	 */
	private static void refactorIdIdrefXText(Grammar g, EcoreXSDMapper mapper) {
		

		List<String> eclassCommonIdName = new ArrayList<String>();
		
		// iterate over all CrossReferences and remove TypeRef/RullCalles except to Common ID EClass TypeRef
		g.getRules().forEach(rule -> {
			TreeIterator<Object> allContents = EcoreUtil.getAllContents(rule.getAlternatives(), true);
			allContents.forEachRemaining(elm -> {
				if(elm instanceof CrossReference){
					CrossReference crossRef = (CrossReference) elm;
					EList<EObject> crossRefContents = crossRef.eContents();
					List<EObject> crossRefContentsToRemove = new ArrayList<EObject>();
					List<Boolean> isIdCrossRef = new ArrayList<Boolean>();
					
					crossRefContents.forEach(crossRefContent -> {

						// if Content is TypeRef to Common ID EClass
						if(crossRefContent.getClass() == TypeRefImpl.class) {

							((TypeRef) crossRefContent).getClassifier().eContents().forEach(esf -> {
								
								//TODO useless if only ID but no IDREF available
								eclassCommonIdName.add(((TypeRef) crossRefContent).getClassifier().getName());
								
								// if EStructuralFeature is an EAttribute and has eType XML ID -> it is the 
								if (esf.getClass().equals(EAttributeImpl.class) && ((EAttribute) esf).getEType().equals(XMLTypePackage.Literals.ID)) {
									isIdCrossRef.add(true);
									/* Alternative:
									 * //scan all elements of CrossReference again and remove RuleCalls to null
										crossRefContents.forEach(crc -> {
											if(crc.getClass() == RuleCallImpl.class) {
												RuleCall rc = (RuleCall) crc;
												if (rc.getRule() == null) {
													EcoreUtil.remove(rc);												
												}
											}
										});*/
								}
							});

						}
						else {
							// add CrossReferenceContents != Common ID EClass TypeRef
							crossRefContentsToRemove.add(crossRefContent);
						}
					});
					
					// remove all 
					if(!isIdCrossRef.isEmpty()) {
						crossRefContentsToRemove.forEach(crctr -> {
							EcoreUtil.remove(crctr);
						});
					}
				}
			});
		});
		
		// remove the extra keyword in common ID rule
		if (!eclassCommonIdName.isEmpty()) {
			g.getRules().forEach(rule -> {
				if (rule.getName().equals(eclassCommonIdName.get(0))) {
					TreeIterator<Object> allContents = EcoreUtil.getAllContents(rule.getAlternatives(), true);
					allContents.forEachRemaining(elm -> {
						if (elm.getClass().equals(KeywordImpl.class)) {
							Keyword kw = (Keyword) elm;
							org.eclipse.xtext.EcoreUtil2.remove(kw);
						}
					});
				}
			});
		}
		
		
		
	}
	
	
	private static String findFreeEClassifier(EPackage pack, String eclassIdName, int counter) {
		
		while (pack.getEClassifier(eclassIdName) != null) {
			
			counter++;
			eclassIdName = eclassIdName + counter;
			
		}
		
		return eclassIdName;
		
	}
}