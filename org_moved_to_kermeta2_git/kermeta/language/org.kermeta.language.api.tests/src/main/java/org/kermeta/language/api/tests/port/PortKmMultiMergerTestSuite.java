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
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.api.tests.Util;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;

public class PortKmMultiMergerTestSuite extends TestSuite {

	public static PortAbstractFactory<PortKmMerger> portKmMultiMergerFactory = null;

	public static Test suite() {
		System.out.println("Getting KmMultiMerger test suite  ");

       Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",          new XMIResourceFactoryImpl());
		
		TestSuite suite = new TestSuite("PortKmMultiMergerTestSuite");
		try {
			populate(suite, "KmMultiMerger_Valid", true,
					portKmMultiMergerFactory, ".kmt");
			populate(suite, "KmMultiMerger_Invalid", false,
					portKmMultiMergerFactory, ".kmt");
			// populate(suite, "KmBinaryMerger_Invalid", false,
			// mergerClass,".kmt");
			// Util.populate(suite, "KMTLoader_Invalid", false,
			// mergerClass,".kmt");
			// Util.populate(suite, "Checker_Valid", true, loaderClass,".kmt");
			// Util.populate(suite, "Checker_Invalid", true,
			// loaderClass,".kmt");

		} catch (InstantiationException ex) {
			Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(
					Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(
					Level.SEVERE, null, ex);
		} catch (IllegalArgumentException ex) {
			Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(
					Level.SEVERE, null, ex);
		} catch (InvocationTargetException ex) {
			Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(
					Level.SEVERE, null, ex);
		}
		return suite;

	}

	public static void populate(TestSuite ts, String folder, Boolean valid,
			PortAbstractFactory<PortKmMerger> factory, String filter)
			throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		String[] vfiles;
		try {
			String folderFullURI = PortKmBinaryMergerTestSuite.class
					.getClassLoader().getResource(folder).toString();
			vfiles = Util.getResourceListingFullURI(
					PortResourceLoaderTestSuite.class, folder);

			// make sure the aspect, expected_output and primary are always in
			// the same order
			Arrays.sort(vfiles);
			System.out.println("full URI: " + folderFullURI);
			System.out.println("Entries list size: " + vfiles.length);

			String jarPath = folderFullURI.substring(0, folderFullURI
					.indexOf("!")); // get only the jar url
			// output goes into ./target/tests/ ...
			String outputFolder = "";
			File dir1 = new File(".");
			try {
				outputFolder = "file://" + dir1.getCanonicalPath()
						+ "/target/tests/"
						+ PortKmBinaryMergerTestSuite.class.getName()
						+ "/output";
			} catch (IOException ex) {
				Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName())
						.log(Level.SEVERE, null, ex);
			}

			List<TestData> testDataGroups = new ArrayList<TestData>();
			TestData currentTestData = new TestData(folder);
			// List<String> inputfiles = new ArrayList<String>();
			for (String uri : vfiles) {
				/*
				 * if (uri.endsWith(filter)) { InputStream is =
				 * PortResourceLoaderTestSuite
				 * .class.getClassLoader().getResourceAsStream(uri); File f =
				 * Util
				 * .convertStreamToFile(is,uri.substring(uri.lastIndexOf("/")
				 * +1));
				 * 
				 * ts.addTest(new PortResourceLoaderTest(f, valid,p)); }
				 */
				System.out.println("Entries list : " + uri);

				if (uri.endsWith("/") && !uri.contains("/expected_output/")) {
					// move to next test
					currentTestData = new TestData(uri.replaceFirst(folder, "").replaceAll("/", ""));
					testDataGroups.add(currentTestData);
				}
				/*
				 * if(uri.contains("/aspect/") && (uri.endsWith(".km") ||
				 * uri.endsWith(".kmt"))){ currentAspectFilePath = uri; }
				 */
				if (uri.contains("/expected_output/") && uri.endsWith(".km")) {
					currentTestData.expected_output_file = jarPath + "!/" + uri;
				}
				if (!uri.contains("/expected_output/")
						&& ((uri.endsWith(".km") || uri.endsWith(".kmt")))) {
					currentTestData.inputfiles.add(jarPath + "!/" + uri);

				}

			}
			// build tests with all data
			for(TestData td : testDataGroups){
				if(!td.inputfiles.isEmpty()){
					ts.addTest(new PortKmMultiMergerTest(folder + "/" + td.testName,
						 td.inputfiles, 
						 outputFolder + "/" + td.testName + ".km",
						 td.expected_output_file,
						 valid, factory));
				}
			}

		} catch (URISyntaxException ex) {
			Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(
					Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(
					Level.SEVERE, null, ex);
		}

	}

	public static class TestData {
		List<String> inputfiles = new ArrayList<String>();
		String expected_output_file = "";
		String testName = "";

		public TestData(String testName) {
			this.testName = testName;
		}
	}
}
