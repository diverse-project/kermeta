/*
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : January 2011
 * Authors :
 *			Arnaud Blouin
 */
package org.kermeta.language.api.tests.port;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortEcore2Km;
import org.kermeta.language.api.tests.Util;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;

public class PortEcore2KmTestSuite extends TestSuite {
	public static PortAbstractFactory<PortEcore2Km> portEcore2Kmfactory = null;
	
	
    public static Test suite() {
        System.out.println("Getting Ecore2Km test suite  ");

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        TestSuite suite = new TestSuite("PortEcore2KmTestSuite");
        
        try {
            populate(suite, "Ecore2Km_Valid", true, portEcore2Kmfactory);
        } catch (InstantiationException ex) {
            Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }
        return suite;
    }
    
    
    
    public static void populate(final TestSuite ts, final String folder, final Boolean valid, 
    							final PortAbstractFactory<PortEcore2Km> factory)//, final String filter) 
    							throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] vfiles;
        try {
            String folderFullURI = PortEcore2KmTestSuite.class.getClassLoader().getResource(folder).toString();
            folderFullURI =folderFullURI.replace("file:/", "file:///");
            vfiles = Util.getResourceListingFullURI(PortResourceLoaderTestSuite.class, folder);

            // make sure the aspect, expected_output and primary are always in the same order
            System.out.println("full URI: " + folderFullURI);

//            String currentTestName = "";
//            String currentPrimaryFilePath = "";
//            String currentExpectedOutputFilePath = "";
            String jarPath = folderFullURI.substring(0, folderFullURI.indexOf("!")); // get only the jar url
            // output goes into ./target/tests/ ...
//            String outputFolder = "";
//            File dir1 = new File(".");
//            try {
//                outputFolder = "file://" + dir1.getCanonicalPath() + "/target/tests/"+PortEcore2KmTestSuite.class.getName()+"/output";
//            } catch (IOException ex) {
//                Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
//            }
            for (String uri : vfiles) {
//            	File file = new File(uri);
//            	
//            	if(file.canRead() && !file.isDirectory()) {
	               /* if (uri.endsWith(filter)) {
	                    InputStream is = PortResourceLoaderTestSuite.class.getClassLoader().getResourceAsStream(uri);
	                    File f = Util.convertStreamToFile(is,uri.substring(uri.lastIndexOf("/")+1));
	
	                    ts.addTest(new PortResourceLoaderTest(f, valid,p));
	                } */
	
	//                if(uri.endsWith("/aspect/")){
	//                    currentTestName = uri.replaceFirst("/aspect/", "").replaceFirst(folder, "").replaceAll("/", "");
	//                }
	//                if(uri.contains("/aspect/") && (uri.endsWith(".km") || uri.endsWith(".kmt"))){
	//                    currentAspectFilePath = uri;
	//                }
	//                if(uri.contains("/expected_output/") && uri.endsWith(".km")){
	//                    currentExpectedOutputFilePath = uri;
	//                }
	//                if(uri.contains("/primary/") && (uri.endsWith(".km") || uri.endsWith(".kmt"))){
	//                    currentPrimaryFilePath = uri;
	                    // this is also the last entry called for a given test
	                    // create the test for it
	            	if(uri.endsWith(".ecore")) {
	            		System.out.println("Entries list : " + uri);
	            		
	                    ts.addTest(new PortEcore2KmTest(//folder+"/"+currentTestName+"_pa",
	                             jarPath+"!/"+ uri.replace(".ecore", ""), //currentPrimaryFilePath,
	//                             jarPath+"!/"+currentAspectFilePath,
	//                             outputFolder+"/"+currentTestName+"_pa.km",
	//                             jarPath+"!/"+currentExpectedOutputFilePath,
	                             valid,
	                             factory));
	//                     ts.addTest(new PortKmBinaryMergerTest(folder+"/"+currentTestName+"_ap",
	//                             jarPath+"!/"+currentAspectFilePath,
	//                             jarPath+"!/"+currentPrimaryFilePath,
	//                             outputFolder+"/"+currentTestName+"_ap.km",
	//                             jarPath+"!/"+currentExpectedOutputFilePath,
	//                             valid,
	//                             factory));
	//                }
	            	}
            	}
//            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
