package at.ac.tuwien.big.xmltext;

import java.security.interfaces.ECKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xsd.XSDComponent;
import org.eclipse.xsd.util.XSDUtil;
import org.eclipse.xsd.XSDIdentityConstraintDefinition;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.impl.XSDIdentityConstraintDefinitionImpl;
import org.eclipse.xsd.impl.XSDXPathDefinitionImpl;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.impl.ParserRuleImpl;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.eclipse.xsd.util.XSDConstants;

import com.google.common.base.Strings;

public class AMEGroupKey {
	
	
	private final static int ECORE_OCL_NAME = 0;
	private final static int ECORE_SRC_ELEMENT = 1;
	private final static int ECORE_DST_ELEMENT = 2;
	private final static int ECORE_FLD_ELEMENT = 3;
	
	private final static String XSD_KEY = "xsd:key";
	private final static String XSD_SELECTOR = "xsd:selector";
	private final static String XSD_FIELD = "xsd:field";
	
	
	
	public static void doKey(Resource ecore, EcoreXSDMapper mapper) {
		
		
		XSDComponent xsd = (XSDComponent)mapper.getXSDRoot();
		EPackage pack = (EPackage) ecore.getAllContents().next();
		Collection<EObject> all = EcoreUtil2.allContents(pack);
	
		printAllXSD(xsd);
		
//		for (List<String> entry : storage) {
//		    System.out.println(entry.toString());
//		}	
//		

		storage.forEach(keyElement-> {
			List<String> featureNames = new ArrayList<String>();
			featureNames = getFeatureNames(all, keyElement);
			addKeyOcl(all, featureNames);
		});
		

		
//		key
//https://msdn.microsoft.com/en-us/library/ms256101%28v=vs.110%29.aspx?f=255&MSPPError=-2147217396
//selector 
// 
//The selector element contains an XML Path Language (XPath) expression specifying the set of elements across which the values specified by field must be unique.
// ---> XPath to OCL???
//There must be one and only one selector element.
// 
//
//field 
// 
//Each field element contains an XPath expression specifying the values (attribute or element values) that must be unique for the set of elements specified by the selector element.
//
//If there is more than one field element, the combination of the field elements must be unique. In this case, the values for a single field element may or may not be unique across the selected elements but the combination of all the fields must be unique.
//
//There must be one or more field element(s).

//		invariant uniquewIds: self.passengers.passenger->forAll(c1, c2 | c1 <> c2 implies c1.iD <> c2.iD);
		
		
//		kyeref
//https://msdn.microsoft.com/en-us/library/ms256478(v=vs.110).aspx
		
		
	}
	

	public static List<List<String>> storage = new ArrayList<List<String>>();
	
	private static void printAllXSD(XSDComponent obj){


		// find all key elements and save selector and field elements
		if (obj.getClass() == XSDIdentityConstraintDefinitionImpl.class && XSD_KEY.equalsIgnoreCase(obj.getElement().getNodeName())) {

			List<String> elements = new ArrayList<String>();
			
			obj.eContents().forEach(c -> {
				NamedNodeMap attributes = ((XSDComponent)c).getElement().getAttributes();
				if (XSD_SELECTOR.equalsIgnoreCase(((XSDComponent)c).getElement().getNodeName())) {
					
					//TODO evaluate XPath
					
					String selector = attributes.item(0).getNodeValue();
					
					elements.add(0, selector);
				} else if (XSD_FIELD.equalsIgnoreCase(((XSDComponent)c).getElement().getNodeName())) {
					
					//TODO evaluate XPath
					//TODO multiple fields possible
					String field = attributes.item(0).getNodeValue();
					field = field.substring(1);
					
					elements.add(field);
				}
			});

			String container = obj.getContainer().getElement().getAttribute("name");
			
			elements.add(0, container);								// container of key-element
			elements.add(0, obj.getElement().getAttribute("name")); // key-element name
			storage.add(elements);

		} else {
			
			obj.eContents().forEach(c -> {
				printAllXSD((XSDComponent)c);
			});
		}
	}
	
	
	// add invariant constraint (2 EAnnotations)	
	private static void addKeyOcl(Collection<EObject> all, List<String> featureNames) {
		EAnnotation eaonnew = EcoreFactory.eINSTANCE.createEAnnotation();					
		String constraints = "";
		
		for(EObject itm : all) {
			if (itm instanceof EClass ) {
				EClass eclass = (EClass) itm;

				if (eclass.getEStructuralFeature(featureNames.get(ECORE_SRC_ELEMENT).toString()) != null) {
				
					// constraints already exits
					for(EAnnotation eano : eclass.getEAnnotations()){
						
						EMap<String, String> eo = eano.getDetails();

						if (eo.containsKey("constraints")) {
							constraints = eo.get("constraints");
							// remove constraints
							eclass.getEAnnotations().remove(eano);
						}
					}
					
					if (constraints.isEmpty()) {
						constraints = featureNames.get(ECORE_OCL_NAME);
						
						eaonnew = EcoreFactory.eINSTANCE.createEAnnotation();
						eaonnew.setSource("http://www.eclipse.org/emf/2002/Ecore");
						eaonnew.getDetails().put("constraints", constraints);
						eclass.getEAnnotations().add(eaonnew);
						
						eaonnew = EcoreFactory.eINSTANCE.createEAnnotation();
						eaonnew.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
						eaonnew.getDetails().put(featureNames.get(ECORE_OCL_NAME), "self." 
								+ featureNames.get(ECORE_SRC_ELEMENT) + "." 
								+ featureNames.get(ECORE_DST_ELEMENT) 
								+ "->forAll(c1, c2 | c1 <> c2 implies c1." 
								+ featureNames.get(ECORE_FLD_ELEMENT) + " <> c2." 
								+ featureNames.get(ECORE_FLD_ELEMENT) + ")");
						eclass.getEAnnotations().add(eaonnew);
						
					} else {
						// concat constraints annotation
						constraints = constraints + (" ") + featureNames.get(ECORE_OCL_NAME);
						
						eaonnew = EcoreFactory.eINSTANCE.createEAnnotation();
						eaonnew.setSource("http://www.eclipse.org/emf/2002/Ecore");
						eaonnew.getDetails().put("constraints", constraints);
						eclass.getEAnnotations().add(eaonnew);
						
						// add new detail for invariant
						eaonnew = eclass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
						eaonnew.getDetails().put(featureNames.get(ECORE_OCL_NAME), "self." 
								+ featureNames.get(ECORE_SRC_ELEMENT) + "." 
								+ featureNames.get(ECORE_DST_ELEMENT) 
								+ "->forAll(c1, c2 | c1 <> c2 implies c1." 
								+ featureNames.get(ECORE_FLD_ELEMENT) + " <> c2." 
								+ featureNames.get(ECORE_FLD_ELEMENT) + ")");

					}
				}
			}
		}
	}
	
	private static List<String> getFeatureNames(Collection<EObject> all, List<String> keyElement) {
		List<String> featureNames = new ArrayList<String>();
		
		String esfSrc = "";
		String esfDst = "";
		String esfFld = "";
		String oclName = "";

		oclName = keyElement.get(ECORE_OCL_NAME);
		oclName = oclName.substring(0,1).toLowerCase() + oclName.substring(1);
		
		for(EObject itm : all) {
			if (itm instanceof EClass ) {
				EClass eclass = (EClass) itm;


				for (EStructuralFeature esf : eclass.getEAllStructuralFeatures()) {

					for(EAnnotation eano : esf.getEAnnotations()){
						
						EMap<String, String> eo = eano.getDetails();
						
						if (keyElement.get(ECORE_DST_ELEMENT).equalsIgnoreCase(eo.get("name"))) {
//							EObject esfSrc = EcoreFactory.eINSTANCE.createEObject();
							esfDst = esf.getName();

//							System.out.println(eclass.getName());
//							System.out.println(esf.getName());
//							System.out.println("dst - " + eo.get("name"));
							

							
						} else if (keyElement.get(ECORE_SRC_ELEMENT).equalsIgnoreCase(eo.get("name"))) {
							esfSrc = esf.getName();
						

//							System.out.println(eclass.getName());
//							System.out.println(esf.getName());
//							System.out.println("src - " + eo.get("name"));
														
							
						} else if (keyElement.get(ECORE_FLD_ELEMENT).equalsIgnoreCase(eo.get("name"))) {
							esfFld = esf.getName();
						

//							System.out.println(eclass.getName());
//							System.out.println(esf.getName());
//							System.out.println("src - " + eo.get("name"));
														
						}
					}
				}
			}
		}
		
		
		featureNames.add(oclName);
		featureNames.add(esfSrc);
		featureNames.add(esfDst);
		featureNames.add(esfFld);
		
		//System.out.println("+++" + featureNames);
		
		return featureNames;
	}
	
}