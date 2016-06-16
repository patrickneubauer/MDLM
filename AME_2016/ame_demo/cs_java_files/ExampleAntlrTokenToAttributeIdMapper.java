package at.ac.tuwien.big.xmltext.concretesyntax;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class ExampleAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper
{
    private static final Pattern QUOTED = Pattern.compile("(?:^'(\\w[^']*)'$)|(?:^\"(\\w[^\"]*)\")$", Pattern.MULTILINE);

    @Override
    protected String calculateId(String tokenName, int tokenType) {
    	System.out.println("tokenName: " + tokenName);
        if(tokenName.equals("RULE_INT")) {
            return ExampleHighlightingConfiguration.NUMBER_ID;
        }
        else if(tokenName.equals("RULE_STRING")){
        	return ExampleHighlightingConfiguration.GREEN_ID;
        }
        else if(tokenName.contains("!")){
        	return ExampleHighlightingConfiguration.MARKER_ID;
        }
        else if(tokenName.toLowerCase().contains("boss")){
        	return ExampleHighlightingConfiguration.BOSS_ID;
        }
        else if(tokenName.toLowerCase().contains("employee")){
        	return ExampleHighlightingConfiguration.EMPLOYEE_ID;
        }
        else if(QUOTED.matcher(tokenName).matches()) {
            return ExampleHighlightingConfiguration.KEYWORD_ID;
        }
        return ExampleHighlightingConfiguration.DEFAULT_ID;
    }
}