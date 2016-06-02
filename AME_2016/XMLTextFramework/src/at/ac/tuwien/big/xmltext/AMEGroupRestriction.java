package at.ac.tuwien.big.xmltext;

import java.util.Collection;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.Grammar;

public class AMEGroupRestriction {

	public static void doRestriction(Resource ecore, EcoreXSDMapper mapper) {
		EPackage pack = (EPackage) ecore.getAllContents().next();
		Collection<EObject> all = EcoreUtil2.allContents(pack);
		all.forEach(itm -> {
			if (itm instanceof EDataTypeImpl) {
				EDataTypeImpl edataType = (EDataTypeImpl) itm;
				EAnnotation anno = edataType.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);
				if(edataType.getName().equals("NameType")){
					anno.getDetails().put("NameTypeMaxLength", "self.nameType < 32");
				}
				System.out.println(edataType.getName());

			}
		});
	}

	public static void doRestrictionXText(Grammar g, EcoreXSDMapper mapper) {

	}
}
