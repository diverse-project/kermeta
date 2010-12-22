package org.kermeta.language.api.tests.port;


import junit.framework.Test;
import junit.framework.TestSuite;
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;

public class PortKmMultiMergerTestSuite extends TestSuite {


        public static PortAbstractFactory<PortKmMerger> portKmMultiMergerFactory = null;

	public static Test suite() {
        System.out.println("Getting KmMultiMerger test suite  ");
        

        TestSuite suite = new TestSuite("PortKmMultiMergerTestSuite");
       /* try {
            populate(suite, "KmBinaryMerger_Valid", true, mergerClass,".kmt");
            populate(suite, "KmBinaryMerger_Invalid", false, mergerClass,".kmt");
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
        }*/
        return suite;

	}
}
