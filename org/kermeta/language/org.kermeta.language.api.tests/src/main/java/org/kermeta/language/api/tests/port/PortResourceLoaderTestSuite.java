/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *                  Francois Fouquet <ffouquet@irisa.fr>
 *                  Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.tests.port;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.tests.Util;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;

/**
 *
 */
public class PortResourceLoaderTestSuite extends TestSuite {


    //public static Class loaderClass = null;
    public static PortAbstractFactory<PortResourceLoader> portResourceLoaderFactory = null;

    public static Test suite() {

        //System.out.println("Getting test suite "+loaderClass);
        

        TestSuite suite = new TestSuite("PortResourceLoaderTestSuite");
        try {
            populate(suite, "KMTLoader_Valid", true, portResourceLoaderFactory,".kmt");
            populate(suite, "KMTLoader_Invalid", false, portResourceLoaderFactory,".kmt");
           // Util.populate(suite, "Checker_Valid", true, loaderClass,".kmt");
           // Util.populate(suite, "Checker_Invalid", true, loaderClass,".kmt");

        } catch (InstantiationException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }
        return suite;
    }

    public static void populate(TestSuite ts, String folder, Boolean valid, PortAbstractFactory<PortResourceLoader> factory, String filter) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] vfiles;
        try {
            vfiles = Util.getResourceListing(PortResourceLoaderTestSuite.class, folder);

            Arrays.sort(vfiles);

            String outputFolder = ".";
            File dir1 = new File (".");
            try {
                outputFolder = "file://" + dir1.getCanonicalPath() + "/target/tests/"+PortResourceLoaderTestSuite.class.getName()+"/"+folder+"/output/";
            } catch (IOException ex) {
                Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (String uri : vfiles) {
                if (uri.endsWith(filter) && !uri.contains("/expected_output/")) {
                    InputStream is = PortResourceLoaderTestSuite.class.getClassLoader().getResourceAsStream(uri);
                    File inputFile = Util.convertStreamToFile(is,uri.substring(uri.lastIndexOf("/")+1));

                    String fileName = uri.substring(uri.lastIndexOf("/")+1);
                    String expectedOutputResource = uri.replace(fileName, "")+"expected_output/"+fileName.replace(filter, ".km");
                    System.out.println("Looking for expectedOutput = " + expectedOutputResource);
                    if(PortResourceLoaderTestSuite.class.getClassLoader().getResource(expectedOutputResource) != null){

                       ts.addTest(new PortResourceLoaderTest(inputFile,outputFolder+fileName.replace(filter, ".km"), valid, factory, expectedOutputResource));
                    }
                    else{
                        ts.addTest(new PortResourceLoaderTest(inputFile,outputFolder+fileName.replace(filter, ".km"), valid, factory, null));
                    }
                }
            }

        } catch (URISyntaxException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
