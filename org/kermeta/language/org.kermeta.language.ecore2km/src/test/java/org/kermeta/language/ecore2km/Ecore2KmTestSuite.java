/*
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : January 2011
 * Authors :
 *			Arnaud Blouin
 */
package org.kermeta.language.ecore2km;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.kermeta.language.api.port.PortEcore2Km;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.api.tests.port.PortEcore2KmTestSuite;
import org.kermeta.language.ecore2km.art2.impl.Art2ComponentEcore2Km;
import org.kermeta.language.language.ecore2kmrunner.MainRunner;

/**
 * Test suite for Ecore2Km port
 */
public class Ecore2KmTestSuite extends TestSuite {

    public static Test suite() {
        ((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.RichFactory$.MODULE$) ;
        // force to initialize the eInstance (required for correct serialisation
    	XMLNamespacePackage einstance = org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage.eINSTANCE;
    	EcoreFactory ef = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE;
    	EPackage p = org.eclipse.emf.ecore.EcorePackage.eINSTANCE;
    	
        MainRunner.init();

        PortEcore2KmTestSuite.portEcore2Kmfactory = new PortAbstractFactory<PortEcore2Km>(){
            @Override
            public PortEcore2Km create() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
                Art2ComponentEcore2Km comp = new Art2ComponentEcore2Km();
                comp.simulatedStart(comp.getClass().getCanonicalName());
                return comp;
            }
        };
        File dir1 = new File (".");
        try {
            System.out.println("outputFolder ? : " + dir1.getCanonicalPath());
        } catch (IOException ex) {
            Logger.getLogger(Ecore2KmTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }

        return PortEcore2KmTestSuite.suite();
    }
}
