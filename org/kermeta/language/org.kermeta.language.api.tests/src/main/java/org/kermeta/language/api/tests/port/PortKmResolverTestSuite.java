/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z cbouhour $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : December 2010
 * Authors :
 *			Cédric Bouhours <cedric.bouhours@inria.fr>
 */
package org.kermeta.language.api.tests.port;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortKmResolver;
import org.kermeta.language.api.tests.Util;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;

/**
 *
 */
public class PortKmResolverTestSuite extends TestSuite {

	public static PortAbstractFactory<PortKmResolver> portKmResolver = null;

	public static Test suite() {

		System.out.println("Getting KmResolver test suite  ");
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		TestSuite suite = new TestSuite("PortKmResolverTestSuite");

		try {
			populate(suite,"KmResolver_Valid",portKmResolver);
		} catch (IllegalArgumentException e) {
			Logger.getLogger(PortKmResolverTestSuite.class.getName()).log(Level.SEVERE, null, e);
		} catch (SecurityException e) {
			Logger.getLogger(PortKmResolverTestSuite.class.getName()).log(Level.SEVERE, null, e);
		} catch (InstantiationException e) {
			Logger.getLogger(PortKmResolverTestSuite.class.getName()).log(Level.SEVERE, null, e);
		} catch (IllegalAccessException e) {
			Logger.getLogger(PortKmResolverTestSuite.class.getName()).log(Level.SEVERE, null, e);
		} catch (InvocationTargetException e) {
			Logger.getLogger(PortKmResolverTestSuite.class.getName()).log(Level.SEVERE, null, e);
		}

		return suite;
	}

	public static void populate(TestSuite ts, String folder, PortAbstractFactory<PortKmResolver> factory) throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String[] vfiles;
		try {
			String folderFullURI = PortKmResolverTestSuite.class.getClassLoader().getResource(folder).toString();
			vfiles = Util.getResourceListingFullURI(PortResourceLoaderTestSuite.class, folder);

			// make sure the aspect, expected_output and primary are always in the same order
			Arrays.sort(vfiles);
			System.out.println("full URI: " + folderFullURI);
			System.out.println("Entries list size: " + vfiles.length);

			String jarPath = folderFullURI.substring(0, folderFullURI.indexOf("!")); // get only the jar url

			List<String> filesToTest = new ArrayList<String>();
			List<String> outputFiles = new ArrayList<String>();

            String outputFolder = "";
            File dir1 = new File (".");
            try {
                outputFolder = "file://" + dir1.getCanonicalPath() + "/target/tests/"+PortKmResolverTestSuite.class.getName()+"/output";
            } catch (IOException ex) {
                Logger.getLogger(PortKmResolverTestSuite.class.getName()).log(Level.SEVERE, null, ex);
            }
            
			for (String uri : vfiles) {
				if (uri.contains("/expected_output/") && uri.endsWith(".km")) {
					outputFiles.add(jarPath + "!/" + uri);
				}
				if (!uri.contains("/expected_output/") && (uri.endsWith(".km"))) {
					filesToTest.add(jarPath + "!/" + uri);
				}
			}

			// build tests with all data
			for(String td : filesToTest){
				String currentTestName = td.substring(td.lastIndexOf("/")+1);
				ts.addTest(new PortKmResolverTest(td,outputFiles,outputFolder,currentTestName,factory));
			}			

		} catch (URISyntaxException ex) {
			Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
