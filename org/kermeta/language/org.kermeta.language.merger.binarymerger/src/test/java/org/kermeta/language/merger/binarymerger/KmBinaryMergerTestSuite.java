/*$Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.merger.binarymerger;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.api.tests.port.PortKmBinaryMergerTestSuite;
import org.kermeta.language.merger.binarymerger.art2.impl.Art2ComponentKmBinaryMerger;
import runner.MainRunner;

/**
 * Test suite for KmBinaryMerger port
 */
public class KmBinaryMergerTestSuite extends TestSuite {

   // @Override
    public static Test suite() {

    	//Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl()); 
    	
        System.out.println("Initializing Registry...");
        ((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap(ScalaAspect.org.eclipse.emf.ecore.RichFactory$.MODULE$) ;
        // force to initialize the eInstance (required for correct serialisation
    	XMLNamespacePackage einstance = org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage.eINSTANCE;
    	
        MainRunner.init();
       // initRegistry();

        PortKmBinaryMergerTestSuite.portKmBinaryMergerfactory = new PortAbstractFactory<PortKmBinaryMerger>(){
            @Override
            public PortKmBinaryMerger create() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
                Art2ComponentKmBinaryMerger merger = new Art2ComponentKmBinaryMerger();
                merger.simulatedStart(merger.getClass().getCanonicalName());
                return merger;
            }
        };
        File dir1 = new File (".");
        try {
            System.out.println("outputFolder ? : " + dir1.getCanonicalPath());
        } catch (IOException ex) {
            Logger.getLogger(KmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }

        return PortKmBinaryMergerTestSuite.suite();
    }

    

    
}
