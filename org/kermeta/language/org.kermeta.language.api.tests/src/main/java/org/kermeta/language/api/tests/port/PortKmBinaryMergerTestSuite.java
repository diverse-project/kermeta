/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.language.api.tests.port;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Class;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.kermeta.language.api.tests.Util;

/**
 *
 * @author ffouquet
 */
public class PortKmBinaryMergerTestSuite extends TestSuite {


    public static Class mergerClass = null;

    public static Test suite() {

        System.out.println("Getting KmBinaryMerger test suite  "+mergerClass);
        

        TestSuite suite = new TestSuite("PortKmBinaryMergerTestSuite");
        try {
            populate(suite, "KmBinaryMerger_Valid", true, mergerClass,".kmt");
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

    public static void populate(TestSuite ts, String folder, Boolean valid,Class p,String filter) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] vfiles;
        try {
            String folderFullURI = PortKmBinaryMergerTestSuite.class.getClassLoader().getResource(folder).getPath();
            vfiles = Util.getResourceListingFullURI(PortResourceLoaderTestSuite.class, folder);

            // make sure the aspect, expected_output and primary are always in the same order
            Arrays.sort(vfiles);
            System.out.println("full URI: " + folderFullURI);
            System.out.println("Entries list size: " + vfiles.length);

            String currentTestName = "";
            String currentAspectFilePath = "";
            String currentPrimaryFilePath = "";
            String currentExpectedOutputFilePath = "";

            for (String uri : vfiles) {
               /* if (uri.endsWith(filter)) {
                    InputStream is = PortResourceLoaderTestSuite.class.getClassLoader().getResourceAsStream(uri);
                    File f = Util.convertStreamToFile(is,uri.substring(uri.lastIndexOf("/")+1));

                    ts.addTest(new PortResourceLoaderTest(f, valid,p));
                } */
            	System.out.println("Entries list : " + uri);

                if(uri.endsWith("/aspect/")){
                    currentTestName = uri.replaceFirst("aspect/", "").replaceFirst(folder, "");
                }
                if(uri.contains("/aspect/") && uri.endsWith(".km")){
                    currentAspectFilePath = uri;
                }
                if(uri.contains("/expected_output/") && uri.endsWith(".km")){
                    currentExpectedOutputFilePath = uri;
                }
                if(uri.contains("/primary/") && uri.endsWith(".km")){
                    currentPrimaryFilePath = uri;
                    // this is also the last entry called for a given test
                    // create the test for it
                    //this.getClass();
                    String outputFolder = "";// p.getClassLoader().getResource("test_output").getPath();
                    ts.addTest(new PortKmBinaryMergerTest(currentTestName+"_pa",
                             currentPrimaryFilePath, 
                             currentAspectFilePath, 
                             outputFolder+"/"+currentTestName+"_pa.km",
                             currentExpectedOutputFilePath,
                             valid,p));
                     ts.addTest(new PortKmBinaryMergerTest(currentTestName+"_ap",
                             currentPrimaryFilePath,
                             currentAspectFilePath,
                             outputFolder+"/"+currentTestName+"_ap.km",
                             currentExpectedOutputFilePath,
                             valid,p));
                }

            }

        } catch (URISyntaxException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
}
