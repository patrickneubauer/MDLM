package at.ac.tuwien.big.xmltext;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDComponent;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.google.common.base.Strings;

public class AMEGroupEnhance {

	/*
	 * Maybe instead of this with Xtend ... because might have limitations
	 * 
	 * ECore 2 Xtext Creator
	 */
	public static void refractorGrammarAME(Grammar g, EcoreXSDMapper mapper) {
		System.err.println("XTEXT");
		//AME-Gruppe: Bitte hier die Punkte implementieren
		
		AMEGroupMixedContent.doMixedContentXText(g, mapper);
		AMEGroupDatatypes.implDatatypesXText(g, mapper);
		
		clearDoubleEString(g);
		
		// Concrete Syntax - Customizing Syntax
		AMEGroupCustomizeSyntax.customizeSyntax(g);
	}
	
	public static void refractorEcore(Resource ecore, EcoreXSDMapper mapper) {
		System.err.println("ECORE");
		//printAllXSD((XSDComponent)mapper.getXSDRoot(), 0);
		
		AMEGroupMixedContent.doMixedContent(ecore, mapper);
		AMEGroupRestriction.doRestriction(ecore, mapper);
		
		//AME-Gruppe: Bitte hier die Punkte implementieren
	}
	
	/*
	 * clears double EString rule
	 */
	private static void clearDoubleEString(Grammar g){
		long count = g.getRules().stream().filter(x->"EString".equals(x.getName())).count();
		if(count >= 2){
			AbstractRule rule = g.getRules().stream().filter(x->"EString".equals(x.getName())).findFirst().get();
			g.getRules().remove(rule);
		}
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
