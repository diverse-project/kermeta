/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.loader.kmt.scala.internal.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import junit.framework.TestCase;

import org.kermeta.language.loader.kmt.scala.KMTparser;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.helpers.FileHelpers;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.helper.tests.utils.FileHelper;
import org.kermeta.language.helper.tests.utils.ModelingUnitBaseUtil;
import org.kermeta.language.helper.tests.utils.EMFCompareModelHelper;



public class ScalaKMTParserTest extends TestCase {
	File kmtFile;
	boolean mustBeValid;
	
	ResourceSet resourceSet;


    public ScalaKMTParserTest(File kpFile, boolean mustBeValid) {
		super();
		this.kmtFile = kpFile;
		this.mustBeValid = mustBeValid;
		 this.resourceSet = new ResourceSetImpl();
		 
		 // Register KM model
		 Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String,Object> m = f.getExtensionToFactoryMap();
		m.put("km",new XMIResourceFactoryImpl());
	}

    


	public void test() throws IOException  {
		 System.out.println("Test parsing "+ (mustBeValid ? "valid " : "invalid ") + kmtFile);
        
        
        java.net.URL url = FileHelpers.FileToURL(kmtFile);
        KMTparser parser = new KMTparser();
        ErrorAwareMessagingSystem messagingSystem = new ErrorAwareMessagingSystem();
        ModelingUnit mu = parser.load(url, "", messagingSystem);
                
		if(mustBeValid){
	        if(!messagingSystem.errorTrace.isEmpty()){
	        	assertTrue(messagingSystem.errorTrace.get(0), messagingSystem.errorTrace.isEmpty());
	        }
			assertTrue("Failure: ModelingUnit is null ", mu != null);
		}
		else{
			assertTrue("Expecting parse error but none found", !messagingSystem.errorTrace.isEmpty());
		}
		
		
		// Test annotations by comparing result and expected result
				String path = url.getPath();
				String fileName = FileHelper.getFileName(path);
				fileName = fileName + ".km";
		
				if (path.contains("/internal/valid/")){
			
					// Retrieve expected_output folder path
					String expected_output_folder = path.substring(0, path.lastIndexOf("/internal/valid/") + "/internal/valid/".length());
					expected_output_folder = expected_output_folder + "expected_output/";
					File file = new File(expected_output_folder);
			
					// Tests files in the expected_output folder
					for ( File f : file.listFiles()) {
						if (f.getName().equals(fileName)) {
							// Create modeling unit for the expected result
							URL fileURL = FileHelpers.FileToURL(f);
							try {
							ModelingUnit expectedResult = ModelingUnitBaseUtil.loadModelingUnit(fileURL.getPath());
							
							// Compare this file to the current modeling unit load by the parser (mu)
							assertTrue("parsed result model not equals to expected output", EMFCompareModelHelper.isSimilarAndSaveDiff(mu, expectedResult, f.getPath()+".diff"));
							} catch (URISyntaxException e) {
								e.printStackTrace();
							}
					 
							
					 
						}
					}
				}
    }
    
    @Override
    public String getName() {
        return kmtFile.getParentFile().getParentFile().getName() +"."+ kmtFile.getParentFile().getName()+"."  + kmtFile.getName();
    }

    @Override
    public void runTest() throws Throwable  {
        test();
    }

    @Override
    protected void tearDown() throws Exception {
        //
    }
}

