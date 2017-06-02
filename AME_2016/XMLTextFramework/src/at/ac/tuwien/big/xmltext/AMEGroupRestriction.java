package at.ac.tuwien.big.xmltext;

import java.util.Collection;

import org.eclipse.emf.common.util.EMap;
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
				EMap<String, String> details = anno.getDetails();

				if (details.get("maxLength") != null) {
					transformAnnotation("maxLength", details, anno);
				}

				if (details.get("minLength") != null) {
					transformAnnotation("minLength", details, anno);
				}

				if (details.get("length") != null) {
					transformAnnotation("length", details, anno);
				}
			}
		});
	}

	private static void transformAnnotation(String value, EMap<String, String> details, EAnnotation anno) {
		String maxLength = details.get(value);
		details.remove(value);
		anno.getDetails().put(value, fixLength(maxLength));
	}

	private static String fixLength(String oldValue) {
		int value = Integer.parseInt(oldValue);
		value += 2;
		return String.valueOf(value);
	}

	public static void doRestrictionXText(Grammar g, EcoreXSDMapper mapper) {

	}
}
