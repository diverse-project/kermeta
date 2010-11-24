/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.language.api.tests.port;

import java.lang.Class;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.kermeta.language.api.tests.Util;

/**
 *
 * @author ffouquet
 */
public class PortResourceLoaderTestSuite extends TestSuite {


    public static Class loaderClass = null;

    public static Test suite() {

        System.out.println("Getting test suite "+loaderClass);
        

        TestSuite suite = new TestSuite("PortResourceLoaderTestSuite");
        try {
            Util.populate(suite, "KMTLoader_Valid", true, loaderClass,".kmt");
            Util.populate(suite, "KMTLoader_Invalid", false, loaderClass,".kmt");
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

    
}
