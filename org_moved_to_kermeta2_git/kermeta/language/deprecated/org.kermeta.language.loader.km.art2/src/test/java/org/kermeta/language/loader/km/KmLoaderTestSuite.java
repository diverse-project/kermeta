/*
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : January 2011
 * Authors :
 *			Arnaud Blouin
 */
package org.kermeta.language.loader.km;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
//import org.eclipse.emf.ecore.EcoreFactoryWrapper;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.kermeta.language.api.port.PortKmLoader;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.api.tests.port.PortKmLoaderTestSuite;
import org.kermeta.language.loader.km.art.impl.Art2ComponentKmLoader;
//import runner.MainRunner;

public class KmLoaderTestSuite extends TestSuite {
    public static Test suite() {
  //  	((EcoreFactoryWrapper)EcoreFactory.eINSTANCE).setWrap(ScalaAspect.org.eclipse.emf.ecore.RichFactory$.MODULE$);
    	
    	XMLNamespacePackage einstance = org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage.eINSTANCE;
    	EcoreFactory ef = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE;
    	EPackage p = org.eclipse.emf.ecore.EcorePackage.eINSTANCE;
       // MainRunner.init();

        PortKmLoaderTestSuite.portKmLoaderfactory = new PortAbstractFactory<PortKmLoader>(){
            @Override
            public PortKmLoader create() throws IllegalArgumentException, SecurityException, InstantiationException, 
            										IllegalAccessException, InvocationTargetException {
                Art2ComponentKmLoader comp = new Art2ComponentKmLoader();
                comp.simulatedStart(comp.getClass().getCanonicalName());
                return comp;
            }
        };
        File dir1 = new File (".");
        try {
            System.out.println("outputFolder ? : " + dir1.getCanonicalPath());
        } catch (IOException ex) {
            Logger.getLogger(KmLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }

        return PortKmLoaderTestSuite.suite();
    }
}
