/*
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : January 2011
 * Authors :
 *			Arnaud Blouin
 */
package org.kermeta.language.api.tests.port;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortEcore2Km;
import org.kermeta.language.api.tests.Util;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;

public class PortEcore2KmTestSuite extends TestSuite {
	public static PortAbstractFactory<PortEcore2Km> portEcore2Kmfactory = null;
	
	
    public static Test suite() {
        System.out.println("Getting Ecore2Km test suite  ");

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        TestSuite suite = new TestSuite("PortEcore2KmTestSuite");
        
        try {
            populate(suite, "Ecore2Km_Valid", true, portEcore2Kmfactory);
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
    
    
    public static void populate(final TestSuite ts, final String folder, final Boolean valid, 
    							final PortAbstractFactory<PortEcore2Km> factory)
    							throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] vfiles;
        try {
            String folderFullURI = PortEcore2KmTestSuite.class.getClassLoader().getResource(folder).toString();
            folderFullURI =folderFullURI.replace("file:/", "file:///");
            vfiles = Util.getResourceListingFullURI(PortResourceLoaderTestSuite.class, folder);

            System.out.println("full URI: " + folderFullURI);

            String jarPath = folderFullURI.substring(0, folderFullURI.indexOf("!")); // get only the jar url

            List<EPackage> pkgs = new ArrayList<EPackage>();
            List<String> uris = new ArrayList<String>();
            
            for(String uri : vfiles)
            	if(uri.endsWith(".ecore")) {
            		System.out.println("Entries list : " + uri);
            		pkgs.add(PortEcore2KmTest.loadEcoreModel(jarPath+"!/"+ uri));
            		uris.add(uri);
            	}
            
            int i=0;
            for(EPackage pkg : pkgs) {
            	String uri = uris.get(i);
                String outputFolder = "";
                File dir1 = new File (".");

                try {
                    outputFolder = dir1.getCanonicalPath() + "/target/tests/"+PortEcore2KmTestSuite.class.getName()+"/output";
                    int index = uri.lastIndexOf('/');
                    
                    if(index!=-1 && index!=0)
                    	new File(outputFolder + "/" + uri.substring(0, index)).mkdirs();
                } catch (IOException ex) {
                    Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                ts.addTest(new PortEcore2KmTest(
                        jarPath+"!/"+ uri.replace(".ecore", ""),
                        outputFolder+"/"+uri.replace(".ecore", "")+".km",
                        pkg, valid, factory));
                
                i++;
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
