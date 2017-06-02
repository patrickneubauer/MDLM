package ame.group.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.junit.Test;
import org.xtext.example.demo.serializer.AMEGroupDataTypeSerializer;

public class AMEGroupTests {

	@Test
	public void runDataTypeToXML() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File("dsl-examples/test.dtdsl").getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File("dsl-examples-output/test.xml").getAbsolutePath());
		AMEGroupDataTypeSerializer serializer = new AMEGroupDataTypeSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}
}
