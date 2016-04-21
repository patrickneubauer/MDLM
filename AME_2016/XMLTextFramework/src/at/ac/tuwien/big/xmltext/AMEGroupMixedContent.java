package at.ac.tuwien.big.xmltext;

import java.security.interfaces.ECKey;
import java.util.Collection;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;

public class AMEGroupMixedContent {

	/*
	 * TODO: IDEA
	 * 1. First remove the mixed content with the EFeatureMap form the Ecore
	 * 2. Reinsert as AnyGenericConstruct  or Introducte a new PCDATA class.
	 * 
	 */
	public static void doMixedContent(Resource ecore, EcoreXSDMapper mapper){

		EPackage pack = (EPackage) ecore.getAllContents().next();
		
		Collection<EObject> all = EcoreUtil2.allContents(pack);
		
		all.forEach(itm -> {
			if(itm instanceof EClass && !((EClass) itm).getName().equals("DocumentRoot")){
				EClass eclass = (EClass) itm;
				System.err.println(eclass.getName());
				
				
				
				if(eclass.getEStructuralFeature("mixed") != null){
					System.out.println("found mixed");
					
					//remove mixed feature 
					EStructuralFeature foundMixed = eclass.getEStructuralFeature("mixed");
					eclass.getEStructuralFeatures().remove(foundMixed);
					EAnnotation anno = eclass.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);
					anno.getDetails().put("kind", "elementOnly");
				
					//remove derived, transient, volatile from features (set when type is mixed)
					for(EStructuralFeature esf : eclass.getEAllStructuralFeatures()){
						System.out.println(esf.getName());
						esf.setDerived(false);
						esf.setTransient(false);
						esf.setVolatile(false);
					}
				}
				
			}
		});
		
	}
}
