package at.ac.tuwien.big.xmltext;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ParserRuleReturnScope;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.typesystem.emf.EDataTypeType;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.generator.parser.antlr.debug.services.SimpleAntlrGrammarAccess.AlternativesElements;
import org.eclipse.xtext.generator.parser.antlr.debug.simpleAntlr.impl.AlternativesImpl;
import org.eclipse.xtext.generator.parser.antlr.debug.simpleAntlr.impl.RuleCallImpl;
import org.eclipse.xtext.impl.AbstractElementImpl;
import org.eclipse.xtext.impl.ParserRuleImpl;
import org.eclipse.xtext.impl.TypeRefImpl;
import org.eclipse.xtext.impl.XtextFactoryImpl;

public class AMEGroupDatatypes {

	public static void implDatatypesXText(Grammar g, EcoreXSDMapper mapper) {
		List<AbstractRule> rules = g.getRules();
		for (AbstractRule r : rules) {
			String instanceTypeName = r.getType().getClassifier().getInstanceTypeName();
			if (instanceTypeName == null) {
				continue;
			}

			switch (instanceTypeName) {
			case "java.math.BigInteger":
				r.setAlternatives(callTerminal(g, "INT"));
				break;
			case "int": {
				r.setAlternatives(callTerminal(g, "INT"));
				break;
			}
			case "java.lang.String": {
				r.setAlternatives(callTerminal(g, "STRING"));
				break;
			}
			case "javax.xml.datatype.XMLGregorianCalendar": {
				r.setAlternatives(createDateGroup(g));
				break;
			}
			default:
				System.out.println(instanceTypeName);
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
	
	private static Keyword createKeyword(String s){
		Keyword keyword = XtextFactory.eINSTANCE.createKeyword();
		keyword.setValue(s);
		return keyword;
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
