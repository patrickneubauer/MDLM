package at.ac.tuwien.big.xmltext;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.impl.RuleCallImpl;

public class AMEGroupIdIdref {
	
	// Name of Common ID EClass
	private final static String ECLASS_ID_NAME = "IdValues";
	// EStructuralFeature Attribute Name of Common ID EClass
	private final static String ECLASS_ID_ATTRIBUTE_NAME = "name";
	
	public static void implIdIdref(Resource ecore, EcoreXSDMapper mapper) {
		// TODO Test with multiple IDs
		refactorIdIdref(ecore);
	}

	public static void implIdIdrefXText(Grammar g, EcoreXSDMapper mapper) {
		refactorIdIdrefXText(g, mapper);
	}

	
	/**
	 * Create common EClass for ID and IDREF. Reference all ID elements by containment and all IDREF elements by non-containment EReference.
	 * @param ecore
	 */
	private static void refactorIdIdref(Resource ecore) {

		
		EPackage pack = (EPackage) ecore.getAllContents().next();
				
		//create the common ID-EClass and add to Ecore
		//TODO test if name exists
		EAttribute esa = EcoreFactory.eINSTANCE.createEAttribute();
			esa.setName(ECLASS_ID_ATTRIBUTE_NAME);
			esa.setEType(XMLTypePackage.Literals.ID);
			esa.setUpperBound(1);
			esa.setID(true);
		EClass eClassIdValues = EcoreFactory.eINSTANCE.createEClass();
			eClassIdValues.setName(ECLASS_ID_NAME);
			eClassIdValues.getEStructuralFeatures().add(esa);
		pack.getEClassifiers().add(eClassIdValues);
		

		//search all ID or IDREF EStructuralFeatures and replace with EReference to eClassIdValues
		Collection<EObject> all = EcoreUtil2.allContents(pack);

		for(EObject itm : all) {
			if (itm instanceof EClass && ((EClass) itm).getName() != ECLASS_ID_NAME) {
				EClass eclass = (EClass) itm;
				
				for (EStructuralFeature esf : eclass.getEAllStructuralFeatures()) {

					if (esf.getEType().equals(XMLTypePackage.Literals.ID)) {
						
						EReference erf = EcoreFactory.eINSTANCE.createEReference();

						AMEGroupUtil.copyEStructuralFeature(esf, erf);
						erf.setContainment(true);
						erf.setEType(eClassIdValues);					
						
						AMEGroupUtil.replaceEStructuralFeature(eclass, esf, erf);
				
					} else if (esf.getEType().equals(XMLTypePackage.Literals.IDREF)) {
						
						EReference erf = EcoreFactory.eINSTANCE.createEReference();

						AMEGroupUtil.copyEStructuralFeature(esf, erf);
						
						erf.setContainment(false);
						erf.setEType(eClassIdValues);
						
						AMEGroupUtil.replaceEStructuralFeature(eclass, esf, erf);
					
					}
				}
			}
		}
	}
	

	/**
	 * Removes RuleCalls to null.
	 * Ecore2Xtext creates [IdValues|EString] for IDREF. EString is not valid for IDREF and furthermore undefined and has to be removed.
	 * @param g
	 * @param mapper
	 */
	private static void refactorIdIdrefXText(Grammar g, EcoreXSDMapper mapper) {
		

//		EPackage pack = mapper.getEcorePackage();

		
		// iterate over all CrossReferences and remove RullCales to null
		g.getRules().forEach(rule -> {
			TreeIterator<Object> allContents = EcoreUtil.getAllContents(rule.getAlternatives(), true);
			allContents.forEachRemaining(elm -> {
				if(elm instanceof CrossReference){
					CrossReference ass = (CrossReference) elm;
					

					
					
					
					EList<EObject> a = ass.eContents();
					
					a.forEach(e -> {
//						System.err.println(e.getClass());
						
						if(e.getClass() == RuleCallImpl.class) {
							RuleCallImpl t = (RuleCallImpl) e;
							if (t.getRule() == null) {
			//TODO only remove if CrossReference contains TypeRef to IdValues EClass (has eType XMLTypePackage.Literals.ID)
								EcoreUtil.remove(t);
							}
						}

					});
				}
			});
			
			
		});
		
	}
}