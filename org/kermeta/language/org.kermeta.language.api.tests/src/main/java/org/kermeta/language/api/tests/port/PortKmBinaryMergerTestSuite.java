/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.tests.port;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.tests.Util;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;

/**
 *
 */
public class PortKmBinaryMergerTestSuite extends TestSuite {


    public static PortAbstractFactory<PortKmBinaryMerger> portKmBinaryMergerfactory = null;

    public static Test suite() {

        System.out.println("Getting KmBinaryMerger test suite  ");
        

        TestSuite suite = new TestSuite("PortKmBinaryMergerTestSuite");
        try {
            populate(suite, "KmBinaryMerger_Valid", true, portKmBinaryMergerfactory,".kmt");
            populate(suite, "KmBinaryMerger_Invalid", false, portKmBinaryMergerfactory,".kmt");
           // Util.populate(suite, "KMTLoader_Invalid", false, mergerClass,".kmt");
           // Util.populate(suite, "Checker_Valid", true, loaderClass,".kmt");
           // Util.populate(suite, "Checker_Invalid", true, loaderClass,".kmt");

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

    public static void populate(TestSuite ts, String folder, Boolean valid,PortAbstractFactory<PortKmBinaryMerger> factory,String filter) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] vfiles;
        try {
            String folderFullURI = PortKmBinaryMergerTestSuite.class.getClassLoader().getResource(folder).toString();
            vfiles = Util.getResourceListingFullURI(PortResourceLoaderTestSuite.class, folder);

            // make sure the aspect, expected_output and primary are always in the same order
            Arrays.sort(vfiles);
            System.out.println("full URI: " + folderFullURI);
            System.out.println("Entries list size: " + vfiles.length);

            String currentTestName = "";
            String currentAspectFilePath = "";
            String currentPrimaryFilePath = "";
            String currentExpectedOutputFilePath = "";
            String jarPath = folderFullURI.substring(0, folderFullURI.indexOf("!")); // get only the jar url
            // output goes into ./target/tests/ ...
            String outputFolder = "";
            File dir1 = new File (".");
            try {
                outputFolder = "file://" + dir1.getCanonicalPath() + "/target/tests/"+PortKmBinaryMergerTestSuite.class.getName()+"/output";
            } catch (IOException ex) {
                Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (String uri : vfiles) {
               /* if (uri.endsWith(filter)) {
                    InputStream is = PortResourceLoaderTestSuite.class.getClassLoader().getResourceAsStream(uri);
                    File f = Util.convertStreamToFile(is,uri.substring(uri.lastIndexOf("/")+1));

                    ts.addTest(new PortResourceLoaderTest(f, valid,p));
                } */
            	System.out.println("Entries list : " + uri);

                if(uri.endsWith("/aspect/")){
                    currentTestName = uri.replaceFirst("/aspect/", "").replaceFirst(folder, "").replaceAll("/", "");
                }
                if(uri.contains("/aspect/") && (uri.endsWith(".km") || uri.endsWith(".kmt"))){
                    currentAspectFilePath = uri;
                }
                if(uri.contains("/expected_output/") && uri.endsWith(".km")){
                    currentExpectedOutputFilePath = uri;
                }
                if(uri.contains("/primary/") && (uri.endsWith(".km") || uri.endsWith(".kmt"))){
                    currentPrimaryFilePath = uri;
                    // this is also the last entry called for a given test
                    // create the test for it
                    
                    ts.addTest(new PortKmBinaryMergerTest(folder+"/"+currentTestName+"_pa",
                             jarPath+"!/"+currentPrimaryFilePath,
                             jarPath+"!/"+currentAspectFilePath,
                             outputFolder+"/"+currentTestName+"_pa.km",
                             jarPath+"!/"+currentExpectedOutputFilePath,
                             valid,
                             factory));
                     ts.addTest(new PortKmBinaryMergerTest(folder+"/"+currentTestName+"_ap",
                             jarPath+"!/"+currentAspectFilePath,
                             jarPath+"!/"+currentPrimaryFilePath,
                             outputFolder+"/"+currentTestName+"_ap.km",
                             jarPath+"!/"+currentExpectedOutputFilePath,
                             valid,
                             factory));
                }

            }

        } catch (URISyntaxException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
}
