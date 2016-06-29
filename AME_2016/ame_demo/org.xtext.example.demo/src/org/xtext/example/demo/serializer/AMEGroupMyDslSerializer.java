package org.xtext.example.demo.serializer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import IdIdref.IdIdrefPackage;
import at.ac.tuwien.big.xmltext.idIdref.IdIdrefStandaloneSetup;

public class MyDslSerializer {

	public void writeOutput(URI inputModelURI, URI outputModelURI, String... writeOptions) throws IOException {
		// TOSCA ML Standalone Setup if used in non-plugin project
		//ToscaDSLStandaloneSetup.doSetup();
		//ToscaPackage.eINSTANCE.eClass(); // instead of manually registering "tml"
		IdIdrefStandaloneSetup.doSetup();
		IdIdrefPackage.eINSTANCE.eClass();
		
		// enable load and save of XML documents (globally)			
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());

		
		// create the resource set and add extended meta data to read/write options
		ResourceSet resourceSet = new ResourceSetImpl();
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		Map<Object,Object> optionsMap = new HashMap<Object,Object>();
		for (String option : writeOptions) {
			optionsMap.put(option, extendedMetaData);
		}
		
		// load referenced model first?
//		URI referencedResourceModelURI = URI.createFileURI(new File("models/Moodle-by-Iaas/Definitions/modified/TOSCA-v1.0-BaseTypes-Definitions-modified.xml").getAbsolutePath());
//		Resource referencedResource = resourceSet.getResource(referencedResourceModelURI, true);
		
		// load input model from file
		Resource inputResource = resourceSet.getResource(inputModelURI, true);
		
		// resolve cross-references
		EcoreUtil.resolveAll(inputResource);		

		// create output model resource by copying contents of input model
		Resource outputResource = resourceSet.createResource(outputModelURI);
		outputResource.getContents().add(EcoreUtil.copy(inputResource.getContents().get(0)));
		
		// save output model to file
		outputResource.save(optionsMap);
	}
}
