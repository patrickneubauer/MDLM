package at.ac.tuwien.big.xmltext.concretesyntax;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ExampleHighlightingConfiguration extends DefaultHighlightingConfiguration {

    public static final String DEFAULT_ID = "default";
    public static final String KEYWORD_ID = "keyword";
    public static final String METHOD_ID = "method";
    public static final String NUMBER_ID = "number";
    
    public static final String MARKER_ID = "marker";
    public static final String HELLO_ID = "hello";
    public static final String GREEN_ID = "green";
    public static final String PINK_ID = "pink";

    @Override
    public void configure(IHighlightingConfigurationAcceptor acceptor) {
        acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
        acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
        acceptor.acceptDefaultHighlighting(METHOD_ID, "Method", methodTextStyle());
        acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
        //acceptor.acceptDefaultHighlighting(HELLO_ID, "Hello", keywordTextStyle());
        acceptor.acceptDefaultHighlighting(GREEN_ID, "Green", greenTextStyle());
        acceptor.acceptDefaultHighlighting(PINK_ID, "Pink", pinkTextStyle());
        acceptor.acceptDefaultHighlighting(MARKER_ID, "Marker", markerTextStyle());
    }

    public TextStyle defaultTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(0, 0, 0));
        return textStyle;
    }

    public TextStyle greenTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(0, 102, 0));//127-255-0
        textStyle.setStyle(SWT.BOLD);
        FontData fd = new FontData();
        fd.setName("courier");
        fd.setHeight(30);
        textStyle.setFontData(fd);
        return textStyle;
    }
    
    public TextStyle pinkTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(202,0,204));//127-255-0
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
    }
    
    public TextStyle markerTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(0,0,255));//127-255-0
        textStyle.setStyle(SWT.UNDERLINE_DOUBLE);
        return textStyle;
    }
    
    public TextStyle keywordTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(255, 0, 0));//127-255-0
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
    }

    protected TextStyle methodTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(85, 0, 127));
        textStyle.setStyle(SWT.ITALIC);
        return textStyle;
    }

    public TextStyle numberTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(127, 127, 127));
        return textStyle;
    }
}
