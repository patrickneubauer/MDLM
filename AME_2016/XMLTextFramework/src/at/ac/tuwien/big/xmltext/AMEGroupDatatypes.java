package at.ac.tuwien.big.xmltext;

import java.util.List;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.XtextFactory;

public class AMEGroupDatatypes {

	public static void implDatatypesXText(Grammar g, EcoreXSDMapper mapper) {
		List<AbstractRule> rules = g.getRules();
		for (AbstractRule r : rules) {
			if (r.getName().equals("String0")) {
				r.setAlternatives(callTerminal(g, "STRING"));
			}
			if (r.getName().equals("ID0")) {
				r.setAlternatives(callTerminal(g, "ID"));
			}
			if (r.getName().equals("Int0")) {
				r.setAlternatives(callTerminal(g, "INT"));
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
