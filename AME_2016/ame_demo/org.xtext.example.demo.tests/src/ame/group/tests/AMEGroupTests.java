package ame.group.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.junit.Test;
import org.xtext.example.demo.serializer.AMEGroupMyDslSerializer;

public class AMEGroupTests {

	/*
	 * FIXME: Test only works when in IdIdrefRuntimeModule.configure()
	 * Dependency Injection for AbstractAntlrTokenToAttributeIdMapper is disabled
	 */
	@Test
	public void runMyDslToXML() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File("dsl-examples/test.mydsl").getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File("dsl-examples/test.xml").getAbsolutePath());
		AMEGroupMyDslSerializer serializer = new AMEGroupMyDslSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}
}
