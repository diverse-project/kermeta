/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.merger.binarymerger.tests;

import java.io.File;
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
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl;
import org.kermeta.language.merger.binarymerger.api.KmBinaryMerger;
import org.kermeta.language.helper.tests.utils.FailedTest;

/**
 *
 */
public class KmBinaryMergerTestSuite extends TestSuite {


    

    public static Test suite() {

        System.out.println("Getting KmBinaryMerger test suite  ");

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",          new XMIResourceFactoryImpl());

        TestSuite suite = new TestSuite("KmBinaryMergerTestSuite");
        try {
            populate(suite, "KmBinaryMerger_Valid", true,".kmt");
            populate(suite, "KmBinaryMerger_Invalid", false,".kmt");
           // Util.populate(suite, "KMTLoader_Invalid", false, mergerClass,".kmt");
           // Util.populate(suite, "Checker_Valid", true, loaderClass,".kmt");
           // Util.populate(suite, "Checker_Invalid", true, loaderClass,".kmt");

        } catch (InstantiationException ex) {
            Logger.getLogger(KmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(KmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(KmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(KmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }
        return suite;
    }

    public static void populate(TestSuite ts, String folder, Boolean valid,String filter) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    
    	
    	File currentDir = new File(".");
    	String outputFolder = "";
        try {
            outputFolder = "file://" + currentDir.getCanonicalPath() + "/target/tests/"+KmBinaryMergerTestSuite.class.getName()+"/output";
        } catch (IOException ex) {
            Logger.getLogger(KmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } 
    	
        //KmBinaryMergerTestSuite.class.getClassLoader().getResource(folder).getFile();
        File folderFile = new File(KmBinaryMergerTestSuite.class.getClassLoader().getResource(folder).getFile());
        
        for (File subFolder : folderFile.listFiles()){
        	String currentTestName = subFolder.getName();
        	File aspectFolder = new File(KmBinaryMergerTestSuite.class.getClassLoader().getResource(folder + "/" +subFolder.getName() +"/aspect").getFile());
        	File primaryFolder = new File(KmBinaryMergerTestSuite.class.getClassLoader().getResource(folder + "/" +subFolder.getName() +"/primary").getFile());
        	File expectedOutputFolder = new File(KmBinaryMergerTestSuite.class.getClassLoader().getResource(folder + "/" +subFolder.getName() +"/expected_output").getFile());
        	
        	if(!aspectFolder.exists()){ 
        		ts.addTest(new FailedTest(folder+"/"+currentTestName+"_pa", " cannot find "+folder + "/" +subFolder.getName() +"/aspect"));
        		ts.addTest(new FailedTest(folder+"/"+currentTestName+"_ap", " cannot find "+folder + "/" +subFolder.getName() +"/aspect"));
        		continue;
        	}
        	if(!primaryFolder.exists()){ 
        		ts.addTest(new FailedTest(folder+"/"+currentTestName+"_pa", " cannot find "+folder + "/" +subFolder.getName() +"/primary"));
        		ts.addTest(new FailedTest(folder+"/"+currentTestName+"_ap", " cannot find "+folder + "/" +subFolder.getName() +"/primary"));
        		continue;
        	}
        	
        	
            String currentAspectFilePath = aspectFolder.listFiles().length > 0 ? aspectFolder.listFiles()[0].getAbsolutePath() : ""; 
            String currentPrimaryFilePath = primaryFolder.listFiles().length > 0 ? primaryFolder.listFiles()[0].getAbsolutePath() : ""; 
            String currentExpectedOutputFilePath = expectedOutputFolder.listFiles().length > 0 ? expectedOutputFolder.listFiles()[0].getAbsolutePath() : ""; 
            ts.addTest(new KmBinaryMergerTest(folder+"/"+currentTestName+"_pa",
                    "file:/"+currentPrimaryFilePath,
                    "file:/"+currentAspectFilePath,
                    outputFolder+"/"+currentTestName+"_pa.km",
                    "file:/"+currentExpectedOutputFilePath,
                    valid,
                    new KmBinaryMergerImpl()));
            ts.addTest(new KmBinaryMergerTest(folder+"/"+currentTestName+"_ap",
                    "file:/"+currentAspectFilePath,
                    "file:/"+currentPrimaryFilePath,
                    outputFolder+"/"+currentTestName+"_ap.km",
                    "file:/"+currentExpectedOutputFilePath,
                    valid,
                    new KmBinaryMergerImpl()));
        }
       

    }
    
}
