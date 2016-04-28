package at.ac.tuwien.big.xmltext;

import java.security.interfaces.ECKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.impl.ParserRuleImpl;

public class AMEGroupMixedContent {

	public static Map<String,EClass> storage = new HashMap<>();
	
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
					System.out.println("found mixed");

					// remove mixed feature
					EStructuralFeature foundMixed = eclass.getEStructuralFeature("mixed");
					eclass.getEStructuralFeatures().remove(foundMixed);
					EAnnotation anno = eclass.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);
					anno.getDetails().put("kind", "elementOnly");

					// remove derived, transient, volatile from features (set
					// when type is mixed)
					for (EStructuralFeature esf : eclass.getEAllStructuralFeatures()) {
						System.out.println(esf.getName());
						esf.setDerived(false);
						esf.setTransient(false);
						esf.setVolatile(false);
					}

					//createMixedElement(pack, eclass);

					AMEGroupUtil.createAnyGenericStructure(pack);
					EReference ref = EcoreFactory.eINSTANCE.createEReference();
					ref.setName("anyGenericElement");
					ref.setEType(pack.getEClassifier("AnyGenericConstruct"));
					ref.setLowerBound(0);
					ref.setUpperBound(-1);
					ref.setContainment(true);
					eclass.getEStructuralFeatures().add(ref);
			
					storage.put(eclass.getName(), eclass);
				}
			}
		});


	}

	@Deprecated
	private static void createMixedElement(EPackage pack, EClass eclass) {
		// create key value elements
		EClass clazz = EcoreFactory.eINSTANCE.createEClass();
		clazz.setName("MixedElement");
		clazz.setAbstract(true);
		clazz.setInterface(true);
		pack.getEClassifiers().add(clazz);
		
		EClass pair = EcoreFactory.eINSTANCE.createEClass();
		pair.setName("Pair");
		EAttribute key = EcoreFactory.eINSTANCE.createEAttribute();
		key.setName("key");
		key.setEType(EcorePackage.Literals.ESTRING);
		pair.getEStructuralFeatures().add(key);
		EAttribute value = EcoreFactory.eINSTANCE.createEAttribute();
		value.setName("value");
		value.setEType(EcorePackage.Literals.ESTRING);
		pair.getEStructuralFeatures().add(value);
		pair.getESuperTypes().add(clazz);
		pack.getEClassifiers().add(pair);

		EClass pairs = EcoreFactory.eINSTANCE.createEClass();
		pairs.setName("Pairs");

		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		pairs.getEStructuralFeatures().add(ref);
		ref.setName("elements");
		ref.setContainment(true);
		ref.setEType(clazz);
		ref.setLowerBound(0);
		ref.setUpperBound(-1);
		pairs.getESuperTypes().add(clazz);
		pack.getEClassifiers().add(pairs);
		
		ref = EcoreFactory.eINSTANCE.createEReference();
		// always add to container first
		eclass.getEStructuralFeatures().add(ref);
		ref.setName("elements");
		ref.setContainment(true);
		ref.setEType(clazz);
		ref.setLowerBound(0);
		ref.setUpperBound(-1);
	}

	public static void doMixedContentXText(Grammar g, EcoreXSDMapper mapper) {
		// TODO Auto-generated method stub
		for(Entry<String,EClass> entry: storage.entrySet()){
			//g.getRules().forEach(x->System.out.println(x.getName()));
			Optional<AbstractRule> absRule = g.getRules().stream().filter(x->x.getName().equals(entry.getKey())).findFirst();
			if(absRule.isPresent()){
				ParserRuleImpl rule = (ParserRuleImpl)absRule.get();
				System.out.println(rule.eContents());
			}
				
			
		}
	}
}
