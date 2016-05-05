package at.ac.tuwien.big.xmltext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class AMEGroupUtil {
	
	
	public static final String ANY_GENERIC_ATTRIBUTE = "AnyGenericAttribute";
	public static final String ANY_GENERIC_ELEMENT = "AnyGenericElement";
	public static final String ANY_GENERIC_TEXT = "AnyGenericText";
	public static final String ANY_GENERIC_CONSTRUCT = "AnyGenericConstruct";
	public static final String MIXED_CONTENT_CLASS = "MixedContentClass";

	/*
	 * 0. Properties 1 to n AnyGenericConstructs
	 * 1. AnyGenericConstruct
	 * 2. AnyGenericElement extends AnyGenericConstruct
	 * 3. AnyGenericText extend AnyGenericConstruct
	 * 4. AnyGenericElement contains mutliple AnyGenericAttribute
	 */
	public static void createAnyGenericStructure(EPackage pack){

		if(pack.getEClassifier(ANY_GENERIC_CONSTRUCT) != null)
			return;
		
		// AnyGenericConstruct
		EClass anyGConstruct = EcoreFactory.eINSTANCE.createEClass();
		anyGConstruct.setName(ANY_GENERIC_CONSTRUCT);
		anyGConstruct.setAbstract(true);
		anyGConstruct.setInterface(true);
		pack.getEClassifiers().add(anyGConstruct);
		
		// AnyGenericText
		EClass anyGText = EcoreFactory.eINSTANCE.createEClass();
		anyGText.setName(ANY_GENERIC_TEXT);
		EAttribute attrText = EcoreFactory.eINSTANCE.createEAttribute();
		anyGText.getEStructuralFeatures().add(attrText);
		attrText.setName("text");
		attrText.setEType(EcorePackage.Literals.ESTRING);
		attrText.setLowerBound(0);
		attrText.setUpperBound(1);
		anyGText.getESuperTypes().add(anyGConstruct);
		pack.getEClassifiers().add(anyGText);
		
		// AnyGenericAttribute
		EClass anyGAttribute = EcoreFactory.eINSTANCE.createEClass();
		anyGAttribute.setName(ANY_GENERIC_ATTRIBUTE);
		pack.getEClassifiers().add(anyGAttribute);
		
		// AnyGenericElement
		EClass anyGElement = EcoreFactory.eINSTANCE.createEClass();
		anyGElement.setName(ANY_GENERIC_ELEMENT);
		EReference childElements = EcoreFactory.eINSTANCE.createEReference();
		anyGElement.getEStructuralFeatures().add(childElements);
		childElements.setName("childElements");
		childElements.setContainment(true);
		childElements.setEType(anyGElement);
		childElements.setLowerBound(0);
		childElements.setUpperBound(-1);
		EReference attr = EcoreFactory.eINSTANCE.createEReference();
		anyGElement.getEStructuralFeatures().add(attr);
		attr.setName("anyGenericAttr");
		attr.setContainment(true);
		attr.setEType(anyGAttribute);
		attr.setLowerBound(0);
		attr.setUpperBound(-1);
		
		EAttribute attrElement = EcoreFactory.eINSTANCE.createEAttribute();
		anyGElement.getEStructuralFeatures().add(attrElement);
		attrElement.setName("element");
		attrElement.setEType(EcorePackage.Literals.ESTRING);
		
		
		anyGElement.getESuperTypes().add(anyGConstruct);
		pack.getEClassifiers().add(anyGElement);
	}
	
	
}
