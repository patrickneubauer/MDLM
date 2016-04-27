package at.ac.tuwien.big.xmltext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;

public class AMEGroupUtil {
	/*
	 * 0. Properties 1 to n AnyGenericConstructs
	 * 1. AnyGenericConstruct
	 * 2. AnyGenericElement extends AnyGenericConstruct
	 * 3. AnyGenericText extend AnyGenericConstruct
	 * 4. AnyGenericElement contains mutliple AnyGenericAttribute
	 */
	public static void createAnyGenericStructure(EPackage pack){

		if(pack.getEClassifier("AnyGenericConstruct") != null)
			return;
		
		// AnyGenericConstruct
		EClass anyGConstruct = EcoreFactory.eINSTANCE.createEClass();
		anyGConstruct.setName("AnyGenericConstruct");
		anyGConstruct.setAbstract(true);
		anyGConstruct.setInterface(true);
		pack.getEClassifiers().add(anyGConstruct);
		
		// AnyGenericText
		EClass anyGText = EcoreFactory.eINSTANCE.createEClass();
		anyGText.setName("AnyGenericText");
		anyGText.getESuperTypes().add(anyGConstruct);
		pack.getEClassifiers().add(anyGText);
		
		// AnyGenericAttribute
		EClass anyGAttribute = EcoreFactory.eINSTANCE.createEClass();
		anyGAttribute.setName("AnyGenericAttribute");
		pack.getEClassifiers().add(anyGAttribute);
		
		// AnyGenericElement
		EClass anyGElement = EcoreFactory.eINSTANCE.createEClass();
		anyGElement.setName("AnyGenericElement");
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
		anyGElement.getESuperTypes().add(anyGConstruct);
		pack.getEClassifiers().add(anyGElement);
		
	}
}
