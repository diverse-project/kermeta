/*
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : January 2011
 * Authors :
 *			Arnaud Blouin
 */
package org.kermeta.language.loader.ecore;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcoreFactoryWrapper;
import org.kermeta.language.api.port.PortEcoreLoader;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.api.tests.port.PortEcoreLoaderTestSuite;
import org.kermeta.language.loader.ecore.art.impl.Art2ComponentEcoreLoader;
import runner.MainRunner;

public class EcoreLoaderTestSuite extends TestSuite {
    public static Test suite() {
    	((EcoreFactoryWrapper)EcoreFactory.eINSTANCE).setWrap(ScalaAspect.org.eclipse.emf.ecore.RichFactory$.MODULE$);
        MainRunner.init();

        PortEcoreLoaderTestSuite.portEcoreLoaderfactory = new PortAbstractFactory<PortEcoreLoader>(){
            @Override
            public PortEcoreLoader create() throws IllegalArgumentException, SecurityException, InstantiationException, 
            										IllegalAccessException, InvocationTargetException {
                Art2ComponentEcoreLoader comp = new Art2ComponentEcoreLoader();
                comp.simulatedStart(comp.getClass().getCanonicalName());
                return comp;
            }
        };
        File dir1 = new File (".");
        try {
            System.out.println("outputFolder ? : " + dir1.getCanonicalPath());
        } catch (IOException ex) {
            Logger.getLogger(EcoreLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }

        return PortEcoreLoaderTestSuite.suite();
    }
}
