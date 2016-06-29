package at.ac.tuwien.big.xmltext;

import java.util.List;

import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.XtextFactory;


public class AMEGroupDatatypes {

	public static void implDatatypesXText(Grammar g, EcoreXSDMapper mapper) {
		List<AbstractRule> rules = g.getRules();
		for (AbstractRule r : rules) {
			String instanceTypeName = r.getType().getClassifier().getInstanceTypeName();
			String classifierName = r.getType().getClassifier().getName();
			if (classifierName == null) {
				continue;
			}

			switch (classifierName) {
			case "java.math.BigInteger":
				r.setAlternatives(callTerminal(g, "INT"));
				break;
			case "Decimal": {
				r.setAlternatives(createDecimalGroup(g));
				break;
			}
			case "Integer": {
				r.setAlternatives(callTerminal(g, "INT"));
				break;
			}
			case "String": {
				r.setAlternatives(callTerminal(g, "STRING"));
				break;
			}
			case "EString": {
				r.setAlternatives(callTerminal(g, "STRING"));
				break;
			}
			case "Date": {
				r.setAlternatives(createDateGroup(g));
				break;
			}
			case "Time": {
				r.setAlternatives(createTimeGroup(g));
				break;
			}
			/*case "DateTime": {
				r.setAlternatives(createDateTimeGroup(g));
				break;
			}*/
			case "Boolean": {
				r.setAlternatives(createBooleanRule(g));
				break;
			}
			default:
				System.out.println("instanceTypeName: "+instanceTypeName);
				System.out.println("classifier: "+classifierName);
				break;
			}

			if (r.getName().equals("ID0")) {
				r.setAlternatives(callTerminal(g, "ID"));
			}
		}

	}

	private static Group createDateGroup(Grammar g) {
		Group group = XtextFactory.eINSTANCE.createGroup();
		List<AbstractElement> groupElements = group.getElements();
		groupElements.add(callTerminal(g, "INT"));
		groupElements.add(createKeyword("-"));
		groupElements.add(callTerminal(g, "INT"));
		groupElements.add(createKeyword("-"));
		groupElements.add(callTerminal(g, "INT"));
		return group;
	}
	
	private static Group createTimeGroup(Grammar g) {
		Group group = XtextFactory.eINSTANCE.createGroup();
		List<AbstractElement> groupElements = group.getElements();
		groupElements.add(callTerminal(g, "INT"));
		groupElements.add(createKeyword(":"));
		groupElements.add(callTerminal(g, "INT"));
		groupElements.add(createKeyword(":"));
		groupElements.add(callTerminal(g, "INT"));
		return group;
	}
	
	private static Group createDateTimeGroup(Grammar g) {
		Group group = XtextFactory.eINSTANCE.createGroup();
		List<AbstractElement> groupElements = group.getElements();
		groupElements.add(callTerminal(g, "INT"));
		groupElements.add(createKeyword("-"));
		groupElements.add(callTerminal(g, "INT"));
		groupElements.add(createKeyword("-"));
		groupElements.add(callTerminal(g, "INT"));
		groupElements.add(createKeyword("T"));
		groupElements.add(callTerminal(g, "INT"));
		groupElements.add(createKeyword(":"));
		groupElements.add(callTerminal(g, "INT"));
		groupElements.add(createKeyword(":"));
		groupElements.add(callTerminal(g, "INT"));
		return group;
	}
	
	private static Group createDecimalGroup(Grammar g) {
		Group group = XtextFactory.eINSTANCE.createGroup();
		List<AbstractElement> groupElements = group.getElements();
		groupElements.add(callTerminal(g, "INT"));
		groupElements.add(createKeyword("."));
		groupElements.add(callTerminal(g, "INT"));
		return group;
	}
	
	private static Keyword createKeyword(String s){
		Keyword keyword = XtextFactory.eINSTANCE.createKeyword();
		keyword.setValue(s);
		return keyword;
	}
	
	private static Alternatives createBooleanRule(Grammar g){
		Alternatives booleanAl = XtextFactory.eINSTANCE.createAlternatives();
		List<AbstractElement> alternativesEl = booleanAl.getElements();
		alternativesEl.add(createKeyword("true"));
		alternativesEl.add(createKeyword("false"));
		return booleanAl;
	}
	

	/* smaller example for paper */
	public static void implDatatypesXText(Grammar g) {
		List<AbstractRule> rules = g.getRules();
		for (AbstractRule r : rules) {
			String instanceTypeName = r.getType().getClassifier().getInstanceTypeName();
			if (instanceTypeName.equals("java.lang.String")) {
				r.setAlternatives(callTerminal(g, "STRING"));
			}
		}
	}

	private static RuleCall callTerminal(Grammar g, String name) {
		Grammar terminals = g.getUsedGrammars().get(0);
		TerminalRule term = (TerminalRule) terminals.getRules().stream().filter(x -> x.getName().equals(name))
				.findFirst().get();
		RuleCall ruleCall = XtextFactory.eINSTANCE.createRuleCall();
		ruleCall.setRule(term);
		return ruleCall;
	}

}
