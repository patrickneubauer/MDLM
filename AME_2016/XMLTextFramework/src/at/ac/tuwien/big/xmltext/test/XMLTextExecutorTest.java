package at.ac.tuwien.big.xmltext.test;

import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.Ecore2XtextProjectInfo;
import org.junit.Test;

import at.ac.tuwien.big.xmltext.AMEGroupEnhance;
import at.ac.tuwien.big.xmltext.Settings;
import at.ac.tuwien.big.xmltext.XMLTextExecutor;

@SuppressWarnings("restriction")
public class XMLTextExecutorTest {
	
	private XMLTextExecutor xmlTextExecutor = new XMLTextExecutor();
	
		
	/**
	 * RUN AS JUNIT TEST
	 * 
	 * INPUT: XSD
	 * OUTPUT: Ecore
	 */
	@Test
	public void runExecutorPart1() {
		xmlTextExecutor.createEcoreFromXSD(Settings.XSD_FILE_NAME, Settings.ECORE_FILE_NAME);
	}
	
	/**
	 * RUN AS JUNIT TEST
	 * 
	 * INPUT: Ecore
	 * OUTPUT: Ecore (refactored), GenModel (refactored), Java Model Code, Java Edit Code, Java Editor Code, and Java Test Code
	 */
	@Test
	public void runExecutorPart1and2() {
		Resource ecoreResource = xmlTextExecutor.createEcoreFromXSD(Settings.XSD_FILE_NAME, Settings.ECORE_FILE_NAME);
		xmlTextExecutor.refactorEcore(ecoreResource);
		xmlTextExecutor.generateJavaCode(Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
	}
	
	/**
	 * RUN AS JUNIT PLUGIN TEST
	 * 
	 * INPUT: Ecore (refactored) and GenModel (refactored)
	 * OUTPUT: Xtext Grammar (refactored)
	 */
	@Test
	public void runExecutorPart3() {
		xmlTextExecutor.copyAntlrParser();
		Ecore2XtextProjectInfo ecore2XtextProjectInfo = xmlTextExecutor.generateXtextGrammarAndWorkflow(Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
		xmlTextExecutor.generateXtextProjects(ecore2XtextProjectInfo);
	}
	
	/**
	 * RUN AS JUNIT TEST
	 * 
	 * INPUT: Ecore
	 * OUTPUT: Ecore (refactored), GenModel (refactored), Java Model Code, Java Edit Code, Java Editor Code, and Java Test Code
	 */
	@Test
	public void runExecutorPartAME() {
		Resource ecoreResource = xmlTextExecutor.createEcoreFromXSD(Settings.XSD_FILE_NAME, Settings.ECORE_FILE_NAME);
		xmlTextExecutor.createGenModelFromEcore(Settings.ECORE_FILE_NAME, Settings.GENMODEL_FILE_NAME);
		AMEGroupEnhance.refractorEcore(ecoreResource, xmlTextExecutor.getMapper());
		try {
			ecoreResource.save(new FileOutputStream(Settings.ECORE_FILE_NAME),null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//xmlTextExecutor.generateJavaCode(Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
		Ecore2XtextProjectInfo ecore2XtextProjectInfo = xmlTextExecutor.generateXtextGrammarAndWorkflow(Settings.GENMODEL_FILE_NAME, Settings.ECORE_FILE_NAME);
	}
	
	/**
	 * Manual steps after step 3:
	 * (1) IMPORT PROJECTS GENERATED PROJECTS
	 * (2) ADD "[Settings.LANGUAGE_PROJECT_NAME]/scr" to project classpath
	 * (3) SELECT THIS PROJECT IN PROJECT BROWSER AND REFRESH IT
	 * (4) RUN THIS TEST AS JUNIT TEST
	 */
	@Test
	public void generateMwe2Workflow() {
		xmlTextExecutor.executeMwe2Workflow("file:///" + xmlTextExecutor.getWorkspaceLocation() + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/Generate" + Settings.LANGUAGE_NAME + ".mwe2");
	}
	
	private void setSettings(String name, String rootElement){
		String cap = name.substring(0, 1).toUpperCase() + name.substring(1);
		
		Settings.GENMODEL_NAME = cap + "-refactored";
		Settings.GENMODEL_PREFIX = cap;
		Settings.GENMODEL_FILE_NAME = name+".genmodel";
		Settings.ECORE_FILE_NAME = name+".ecore";
		Settings.XSD_FILE_NAME = name+".xsd";
		Settings.XTEXT_GRAMMAR_FILE_NAME = cap+".xtext";
		Settings.LANGUAGE_NAME = cap;
		Settings.LANGUAGE_PROJECT_NAME = "at.ac.tuwien.big.xmltext."+name;
		Settings.LANGUAGE_FILE_EXTENSION = name+"text";
		Settings.ROOT_ELEMENT_NAME = rootElement;
		
		Settings.XTEXT_OUTPUT_GRAMMAR_FILE_NAME = cap+"-refractored.xtext";
		Settings.REFACTORED_ECORE_FILE_NAME = Settings.ECORE_FILE_NAME.substring(0, Settings.ECORE_FILE_NAME.lastIndexOf(".")) + "-refactored.ecore";
		Settings.REFACTORED_GENMODEL_FILE_NAME = Settings.GENMODEL_FILE_NAME.substring(0, Settings.GENMODEL_FILE_NAME.lastIndexOf(".")) + "-refactored.genmodel";
	}
	
	

	@Test
	public void runMixedContentAME() {
		setSettings("mixedContent", "LibraryType");
		
		Resource ecoreResource = xmlTextExecutor.createEcoreFromXSD(Settings.XSD_FILE_NAME, Settings.ECORE_FILE_NAME);
		xmlTextExecutor.createGenModelFromEcore(Settings.ECORE_FILE_NAME, Settings.GENMODEL_FILE_NAME);
		AMEGroupEnhance.refractorEcore(ecoreResource, xmlTextExecutor.getMapper());
		try {
			ecoreResource.save(new FileOutputStream(Settings.ECORE_FILE_NAME),null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//xmlTextExecutor.generateJavaCode(Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
		Ecore2XtextProjectInfo ecore2XtextProjectInfo = xmlTextExecutor.generateXtextGrammarAndWorkflow(Settings.GENMODEL_FILE_NAME, Settings.ECORE_FILE_NAME);
	}
	
	@Test
	public void runDatatypeAME() {
		setSettings("library3_Datatype", "LibraryType");
		
		Resource ecoreResource = xmlTextExecutor.createEcoreFromXSD(Settings.XSD_FILE_NAME, Settings.ECORE_FILE_NAME);
		xmlTextExecutor.createGenModelFromEcore(Settings.ECORE_FILE_NAME, Settings.GENMODEL_FILE_NAME);
		AMEGroupEnhance.refractorEcore(ecoreResource, xmlTextExecutor.getMapper());
		try {
			ecoreResource.save(new FileOutputStream(Settings.ECORE_FILE_NAME),null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//xmlTextExecutor.generateJavaCode(Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
		Ecore2XtextProjectInfo ecore2XtextProjectInfo = xmlTextExecutor.generateXtextGrammarAndWorkflow(Settings.GENMODEL_FILE_NAME, Settings.ECORE_FILE_NAME);
	}
	
	
	@Test
	public void runRestrictionAME() {
		setSettings("w3schoolsRestriction", "RootType");
		
		Resource ecoreResource = xmlTextExecutor.createEcoreFromXSD(Settings.XSD_FILE_NAME, Settings.ECORE_FILE_NAME);
		xmlTextExecutor.createGenModelFromEcore(Settings.ECORE_FILE_NAME, Settings.GENMODEL_FILE_NAME);
		AMEGroupEnhance.refractorEcore(ecoreResource, xmlTextExecutor.getMapper());
		try {
			ecoreResource.save(new FileOutputStream(Settings.ECORE_FILE_NAME),null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//xmlTextExecutor.generateJavaCode(Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
		Ecore2XtextProjectInfo ecore2XtextProjectInfo = xmlTextExecutor.generateXtextGrammarAndWorkflow(Settings.GENMODEL_FILE_NAME, Settings.ECORE_FILE_NAME);
	}
	
	@Test
	public void runIdIdRefAME() {
		setSettings("idIdref", "EmployeeListType");
		
		Resource ecoreResource = xmlTextExecutor.createEcoreFromXSD(Settings.XSD_FILE_NAME, Settings.ECORE_FILE_NAME);
		xmlTextExecutor.createGenModelFromEcore(Settings.ECORE_FILE_NAME, Settings.GENMODEL_FILE_NAME);
		AMEGroupEnhance.refractorEcore(ecoreResource, xmlTextExecutor.getMapper());
		try {
			ecoreResource.save(new FileOutputStream(Settings.ECORE_FILE_NAME),null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//xmlTextExecutor.generateJavaCode(Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
		Ecore2XtextProjectInfo ecore2XtextProjectInfo = xmlTextExecutor.generateXtextGrammarAndWorkflow(Settings.GENMODEL_FILE_NAME, Settings.ECORE_FILE_NAME);
	}

	
}
