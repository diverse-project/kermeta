package org.kermeta.language.merger.multimerger;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.kermeta.language.api.tests.port.PortKmMultiMergerTestSuite;

//import org.kermeta.language.merger.binarymerger.KmBinaryMergerTestSuite;
//import org.kermeta.language.merger.binarymerger.art2.impl.Art2ComponentKmBinaryMerger;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test suite for KmMultiMerger port
 */
public class KmMultiMergerTestSuite extends TestSuite {

    public static Test suite() {

    	//Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl()); 
    	
        System.out.println("Initializing Registry...");
        ((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap(ScalaAspect.org.eclipse.emf.ecore.RichFactory$.MODULE$) ;
        // force to initialize the eInstance (required for correct serialisation
    	XMLNamespacePackage einstance = org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage.eINSTANCE;
    	
        //MainRunner.init();
       // initRegistry();

        //PortKmMultiMergerTestSuite.mergerClass = Art2ComponentKmMultiMerger.class;
        File dir1 = new File (".");
        try {
            System.out.println("outputFolder ? : " + dir1.getCanonicalPath());
        } catch (IOException ex) {
            Logger.getLogger(KmMultiMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return PortKmMultiMergerTestSuite.suite();
    }

    public  static void initRegistry(){
        org.OrgPackage pack = org.impl.OrgPackageImpl.init();
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.OrgPackage.eNS_URI, pack);
	//kermeta.persistence.EcorePackages().getPacks().put(org.OrgPackage.eNS_URI, pack);
	pack.setEFactoryInstance(ScalaAspect.org.RichFactory$.MODULE$);



    }

}
