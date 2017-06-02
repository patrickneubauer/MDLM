package at.ac.tuwien.big.xmltext.concretesyntax;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class ExampleSemanticHighlightingCalculator implements ISemanticHighlightingCalculator
{
    @Override
    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
    	System.out.println("--------------");
        // It gets a node model.
        INode root = resource.getParseResult().getRootNode();
        for(INode node : root.getAsTreeIterable()) {   
        	System.out.println(node);
            EObject grammarElement = node.getGrammarElement(); 
            if(grammarElement instanceof RuleCall) {
                RuleCall rc = (RuleCall)grammarElement;
                AbstractRule r = rc.getRule();
                EObject c = grammarElement.eContainer();

                // It tests whether the node represents a name of an element (class, method, parameter).
                if(r.getName().equals("ID") && c instanceof Assignment && ((Assignment)c).getFeature().equals("name")) {
                    INode p = node.getParent();
                    if (p != null && p.getGrammarElement() instanceof RuleCall) {
                        rc = (RuleCall)p.getGrammarElement();
                        AbstractRule ru = rc.getRule();

                        // It tests whether the parent node represents a method.
                        if(ru.getName().equals("Method")) {
                            acceptor.addPosition(node.getOffset(), node.getLength(), ExampleHighlightingConfiguration.GREEN_ID);
                        }else{
                        	acceptor.addPosition(node.getOffset(), node.getLength(), ExampleHighlightingConfiguration.PINK_ID);
//                        	acceptor.addPosition(node.getOffset(), 1, ExampleHighlightingConfiguration.HELLO_ID);
//                        	acceptor.addPosition(node.getOffset()+1, 2, ExampleHighlightingConfiguration.GREEN_ID);
//                        	acceptor.addPosition(node.getOffset()+2, 3, ExampleHighlightingConfiguration.MARKER_ID);
//                        	acceptor.addPosition(node.getOffset()+3, node.getLength() -3, ExampleHighlightingConfiguration.PINK_ID);
                        }
                    }
                }
            }
        }
    }
}