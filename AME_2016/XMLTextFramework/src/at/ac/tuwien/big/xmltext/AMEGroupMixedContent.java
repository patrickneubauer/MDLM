package at.ac.tuwien.big.xmltext;

import java.security.interfaces.ECKey;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.common.Terminals;
import org.eclipse.xtext.impl.GroupImpl;
import org.eclipse.xtext.impl.ParserRuleImpl;
import org.eclipse.xtext.impl.XtextPackageImpl;

public class AMEGroupMixedContent {

	public static Map<String,EClass> storage = new HashMap<>();
	
	private final static String ANY_GENERIC_ELEMENT = "anyGenericElement";
	
	
	/*
	 * TODO: IDEA 1. First remove the mixed content with the EFeatureMap form
	 * the Ecore 2. Reinsert as AnyGenericConstruct or Introducte a new PCDATA
	 * class.
	 */
	public static void doMixedContent(Resource ecore, EcoreXSDMapper mapper) {
		EPackage pack = (EPackage) ecore.getAllContents().next();
		Collection<EObject> all = EcoreUtil2.allContents(pack);

		all.forEach(itm -> {
			if (itm instanceof EClass && !((EClass) itm).getName().equals("DocumentRoot")) {
				EClass eclass = (EClass) itm;
				System.err.println(eclass.getName());

				if (eclass.getEStructuralFeature("mixed") != null) {
					AMEGroupUtil.createAnyGenericStructure(pack);
					System.out.println("found mixed");

					// remove mixed feature
					EStructuralFeature foundMixed = eclass.getEStructuralFeature("mixed");
					eclass.getEStructuralFeatures().remove(foundMixed);
					EAnnotation anno = eclass.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);
					anno.getDetails().put("kind", "elementOnly");

					// remove derived, transient, volatile from features (set
					// when type is mixed)
					for (EStructuralFeature esf : eclass.getEAllStructuralFeatures()) {
						
						//esf.getEType().eClass().getESuperTypes().add((EClass) pack.getEClassifier(AMEGroupUtil.ANY_GENERIC_ELEMENT));
						System.out.println(esf.getName());
						esf.setDerived(false);
						esf.setTransient(false);
						esf.setVolatile(false);
					}

					//createMixedElement(pack, eclass);

					//eclass.getESuperTypes().add((EClass) pack.getEClassifier(AMEGroupUtil.MIXED_CONTENT_CLASS));
					
					
					
//					EReference ref = EcoreFactory.eINSTANCE.createEReference();
//					ref.setName(ANY_GENERIC_ELEMENT);
//					ref.setEType(pack.getEClassifier(AMEGroupUtil.ANY_GENERIC_ELEMENT));
//					ref.setLowerBound(0);
//					ref.setUpperBound(-1);
//					ref.setContainment(true);
//					eclass.getEStructuralFeatures().add(ref);
			

					EAttribute attrText = EcoreFactory.eINSTANCE.createEAttribute();
					eclass.getEStructuralFeatures().add(attrText);
					attrText.setName("texts");
					attrText.setEType(EcorePackage.Literals.ESTRING);
					attrText.setLowerBound(0);
					attrText.setUpperBound(-1);
					
					storage.put(eclass.getName(), eclass);
				}
			}
		});


	}
	
	private static Optional<Group> getMixedContentGroup(Group group){
		for(EObject x : group.eContents()){
			if(x instanceof Keyword){
				if(((Keyword) x).getValue().equals(ANY_GENERIC_ELEMENT)){
					return Optional.of((Group) x.eContainer());
				}
			}
			if(x instanceof Group){
				return getMixedContentGroup((Group) x);
				
			}
		}
		return Optional.empty();
	}
	
	private static Optional<Group> getMixedContentGroup(AbstractRule rule){
		for(EObject obj : rule.eContents()){
			if(obj instanceof Group){
				Optional<Group> group = getMixedContentGroup((Group) obj);
				if(group.isPresent())
					return group;
			}
		}
		return Optional.empty();
	}

	private static Group createTextGroup(){
		Group group = XtextFactory.eINSTANCE.createGroup();
		//Assignment ass = XtextFactory.eINSTANCE.createAssignment();
		Keyword keyword = XtextFactory.eINSTANCE.createKeyword();
		keyword.setValue("text");
		Keyword keyword2 = XtextFactory.eINSTANCE.createKeyword();
		keyword2.setValue("text2");
		group.getElements().add(keyword);
		group.getElements().add(keyword2);
		group.setFirstSetPredicated(false);
		group.setPredicated(false);
		group.setCardinality("?");
		
		return group;
	}
	
	public static void doMixedContentXText(Grammar g, EcoreXSDMapper mapper) {
		// TODO Auto-generated method stub
		for(Entry<String,EClass> entry: storage.entrySet()){
			
			// Find rule linked to the EClass
			Optional<AbstractRule> absRule = g.getRules().stream().filter(x->x.getName().equals(entry.getKey())).findFirst();
			if(absRule.isPresent()){
				ParserRuleImpl rule = (ParserRuleImpl)absRule.get();
				// what is rule.type and rule.alternatives
				
				// API XText Grammar or XText Grammar API
				// XPand Xtend
				
				//Optional<Group> mixedContentGroup = getMixedContentGroup(rule);
				
//				if(mixedContentGroup.isPresent()){
//					(mixedContentGroup.get()).getElements().forEach(e -> {
//						System.out.println(e);
//						
//						if(e instanceof Keyword && ((Keyword) e).getValue().equals(ANY_GENERIC_ELEMENT)){
//							((Keyword) e).setValue("mixed");
//							
//						}
//					});
//				}
				List<String> featuresInClass = Arrays.asList("title");
				
				
				rule.eContents().forEach(itm -> {
					if(itm instanceof Group){
						Group grp = (Group) itm;
						System.out.println(grp.getElements());
						Group insertGroup = null;
						int x = 0;
						for (int idx = 0; idx < grp.getElements().size(); idx++) {
							AbstractElement elm = grp.getElements().get(idx);
							if(elm instanceof Assignment){
								if(featuresInClass.contains(((Assignment) elm).getFeature())){
									
									insertGroup = createTextGroup();
									x = idx;
								}
							}
						}
						Keyword keyword = XtextFactory.eINSTANCE.createKeyword();
						keyword.setValue("test");
						grp.getElements().add(keyword);
						grp.getElements().add(insertGroup);

						System.out.println(insertGroup);
					}
				});
								
				System.out.println("-----");
				System.out.println(rule.eContents());
			}
				
			
		}
	}
}
