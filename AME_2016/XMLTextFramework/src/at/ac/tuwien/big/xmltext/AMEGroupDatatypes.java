package at.ac.tuwien.big.xmltext;

import java.util.List;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.XtextFactory;

public class AMEGroupDatatypes {

	public static void implDatatypesXText(Grammar g, EcoreXSDMapper mapper) {
		List<AbstractRule> rules = g.getRules();
		for (AbstractRule r : rules) {
			if (r.getName().equals("String0")) {
				r.setAlternatives(callTerminal(g, "STRING"));
			}
			else if (r.getName().equals("ID0")) {
				r.setAlternatives(callTerminal(g, "ID"));
			}
			else if (r.getName().equals("Int0")) {
				r.setAlternatives(callTerminal(g, "INT"));
			}
			else{
				String instanceTypeName = r.getType().getClassifier().getInstanceTypeName();
				if(instanceTypeName == null){
					continue;
				}
				ParserRule pr;
				TypeRef ref;
				switch (instanceTypeName) {
				case "java.math.BigInteger":
					r.setAlternatives(callTerminal(g, "INT"));
					/*
					ref = XtextFactory.eINSTANCE.createTypeRef();
					ref.setClassifier(EcorePackage.Literals.EBIG_INTEGER);
					pr.setType(ref);
					*/
					break;
				case "int":{
					r.setAlternatives(callTerminal(g, "INT"));
					break;
				}
				case "java.lang.String":{
					r.setAlternatives(callTerminal(g, "STRING"));
					break;
				}
				default:
					System.out.println(instanceTypeName);
					break;
				}
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
