package at.ac.tuwien.big.xmltext;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Keyword;

public class AMEGroupCustomizeSyntax {

	private final static String DEFAULT_OPENING_BRACKET = "{";
	private final static String DEFAULT_CLOSING_BRACKET = "}";
	
	private final static String OPENING_BRACKET = "["; // begin
	private final static String CLOSING_BRACKET = "]"; // end
	
	public static void customizeSyntax(Grammar g){
		g.getRules().forEach(rule -> {
			TreeIterator<Object> allContents = EcoreUtil.getAllContents(rule.getAlternatives(), true);
			allContents.forEachRemaining(elm -> {
				if(elm instanceof Keyword){
					Keyword key = (Keyword) elm;
					if(key.getValue().equals(DEFAULT_OPENING_BRACKET))
						key.setValue(OPENING_BRACKET);
					if(key.getValue().equals(DEFAULT_CLOSING_BRACKET))
						key.setValue(CLOSING_BRACKET);
				}
			});
			
			
		});
	}
}
