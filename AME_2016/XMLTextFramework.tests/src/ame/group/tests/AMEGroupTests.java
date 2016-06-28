package ame.group.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.junit.Test;

import at.ac.tuwien.big.xmltext.serializer.AMEGroupSerializer;

public class AMEGroupTests {

	@Test
	public void runMyDslToXML() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File("dsl-examples/test.mydsl").getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File("dsl-examples/test.xml").getAbsolutePath());
		AMEGroupSerializer serializer = new AMEGroupSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}
}
