package at.ac.tuwien.big.xmltext;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xsd.XSDComponent;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xtext.Grammar;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.google.common.base.Strings;

public class AMEGroupEnhance {

	
	public static void refractorGrammarAME(Grammar g, EcoreXSDMapper mapper) {
		//AME-Gruppe: Bitte hier die Punkte implementieren
	}
	
	public static void refractorEcore(Resource ecore, EcoreXSDMapper mapper) {
		printAllXSD((XSDComponent)mapper.getXSDRoot(), 0);
		
		
		//AME-Gruppe: Bitte hier die Punkte implementieren
	}
	
	private static void printAllXSD(XSDComponent obj, int level){
		String tab = Strings.repeat("  ", level);
		String attrs = "";
		if(obj.getElement() != null){
			NamedNodeMap attributes = obj.getElement().getAttributes();
			attrs += "[";
			for (int i = 0; i < attributes.getLength(); i++) {
				Node item = attributes.item(i);
				attrs += (i==0 ?"":",") + item.getNodeName() + ":" + item.getNodeValue();
			}
			attrs += "]";
		}
		System.out.println(tab + obj.getClass().getName() + " " + attrs);
		obj.eContents().forEach(c -> {
			printAllXSD((XSDComponent)c, level + 1);
		});
	}
}
