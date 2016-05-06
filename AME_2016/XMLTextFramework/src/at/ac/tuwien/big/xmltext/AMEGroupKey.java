package at.ac.tuwien.big.xmltext;

import java.security.interfaces.ECKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

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

import com.google.common.base.Strings;

public class AMEGroupKey {
	
	public static void doKey(Resource ecore, EcoreXSDMapper mapper) {
		
		
		System.out.println("TETETETETT");
		
		XSDComponent xsd = (XSDComponent)mapper.getXSDRoot();
		//XSDPackage xsdP = (XSDPackage)mapper.getXSDRoot();
		
	
		
		EPackage pack = (EPackage) ecore.getAllContents().next();
		
		
		// EObject test = EcoreUtil.getID(eObject) ???
	//	EObject test = EcoreUtil.getObjectByType(objects, );
//		EObject test = EcoreUtil.getObjectByType(objects, type)
		//EObject test = EcoreUtil2.
		
		
		
		Collection<EObject> all = EcoreUtil2.allContents(pack);
		//EObject test = EcoreUtil.getObjectByType(all, (ECLassifier)'passenger');

//		org.eclipse.xtext.EcoreUtil2.getEObject(rootEObject, relativeFragmentPath)
		
//		org.eclipse.xtext.EcoreUtil2.get
		
		all.forEach(itm -> {
			if (itm instanceof EClass ) { //&& !((EClass) itm).getName().equals("DocumentRoot") 
				EClass eclass = (EClass) itm;


				for (EStructuralFeature esf : eclass.getEAllStructuralFeatures()) {

					for(EAnnotation eano : esf.getEAnnotations()){
						
						EMap<String, String> eo = eano.getDetails();
						
						if ("Passengers".equalsIgnoreCase(eo.get("name"))) {
							System.err.println("UIUIUI");
							

							System.out.println(eclass.getName());
							System.out.println(esf.getName());
							System.out.println("eoooo - " + eo.get("name"));
							
							
		
							
							EAnnotation eaonnew = EcoreFactory.eINSTANCE.createEAnnotation();
							eaonnew.setSource("http://www.eclipse.org/emf/2002/Ecore");
							eaonnew.getDetails().put("constraints", "uniqueId");
							
							eclass.getEAnnotations().add(eaonnew);
							eaonnew = EcoreFactory.eINSTANCE.createEAnnotation();
							
							eaonnew.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
							eaonnew.getDetails().put("uniqueId", "self.passengers.passenger->forAll(c1, c2 | c1 <> c2 implies c1.iD <> c2.iD)");
							eclass.getEAnnotations().add(eaonnew);
							

							
						}						
					}
					


				}
				

			}
		});
		

		printAllXSD(xsd, 1, false);
		
		
		for (Map.Entry<String,Map<String,List<String>>> entry : storage.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		
		
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
	
	// TODO bessere struktur
	public static Map<String,Map<String,List<String>>> storage = new HashMap<>();
	
	private static void printAllXSD(XSDComponent obj,  int level, boolean showAttr){
		String tab = Strings.repeat("  ", level);
		String attrs = "";
		
		

		
//		if(showAttr && obj.getElement() != null){
//			NamedNodeMap attributes = obj.getElement().getAttributes();
//			List<String> details = new ArrayList<String>();
//			
//			
//			if ("xsd:selector".equalsIgnoreCase(obj.getElement().getNodeName())) {
//				details.add(0, attributes.item(0).getNodeValue());
//			} else if ("xsd:field".equalsIgnoreCase(obj.getElement().getNodeName())) {
//				details.add(attributes.item(0).getNodeValue());
//			}
//			
//			attrs += "[";
//			for (int i = 0; i < attributes.getLength(); i++) {
//				Node item = attributes.item(i);
//				attrs += (i==0 ?"":",") + item.getNodeName() + ":" + item.getNodeValue();
//			}
//			attrs += "]";
//			
//			System.out.println(tab + obj.getClass().getName() + attrs);
//			
//			System.out.println(obj.getElement().getNodeName());
			
			
			//storage
			
			// xsd:selector -> search in Ecore
			// xsd:field -> keyattribute over all field-attributes
			
//		}
		
		if (obj.getClass() == XSDIdentityConstraintDefinitionImpl.class && "xsd:key".equalsIgnoreCase(obj.getElement().getNodeName())) {
//			System.err.println(tab + obj.getContainer().getElement().getAttribute("name") + obj.getElement().getNodeName());
//			System.out.println(tab + obj.getClass().getName());
			
			Map<String,List<String>> keyElement = new HashMap<>();
			//storage.put(obj.getContainer().getElement().getAttribute("name"), keyElement);
			
			
			
			List<String> elements = new ArrayList<String>();
			
			obj.eContents().forEach(c -> {
				NamedNodeMap attributes = ((XSDComponent)c).getElement().getAttributes();
				if ("xsd:selector".equalsIgnoreCase(((XSDComponent)c).getElement().getNodeName())) {
					//System.out.println("xsd:selector" + attributes.item(0).getNodeValue());
					
					elements.add(0, attributes.item(0).getNodeValue());
				} else if ("xsd:field".equalsIgnoreCase(((XSDComponent)c).getElement().getNodeName())) {
					//System.out.println("xsd:field" + attributes.item(0).getNodeValue());
					elements.add(attributes.item(0).getNodeValue());
				}
			});
			
			System.out.println("dada" + obj.getElement().getAttribute("name") + elements.toString());
			keyElement.put(obj.getElement().getAttribute("name"), elements);
			storage.put(obj.getContainer().getElement().getAttribute("name"), keyElement);


			
			
		} else {
			
			obj.eContents().forEach(c -> {
				printAllXSD((XSDComponent)c, level + 1, false);
			});
		}

		

		
	}
	
	
	// get ecore path from key.selector to key.element
	private static void getKeyContainerPath(){
		
		
	}
	
	
	
}