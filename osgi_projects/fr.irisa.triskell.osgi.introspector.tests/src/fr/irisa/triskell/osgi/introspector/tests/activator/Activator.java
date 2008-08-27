package fr.irisa.triskell.osgi.introspector.tests.activator;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.tools.ant.taskdefs.optional.junit.JUnitTest;
import org.apache.tools.ant.taskdefs.optional.junit.JUnitTestRunner;
import org.apache.tools.ant.taskdefs.optional.junit.XMLJUnitResultFormatter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.osgi.introspector.manifest.tests.TranslationTest;
import fr.irisa.triskell.osgi.introspector.tests.OSGiIntrospectorDynamicTest;
import fr.irisa.triskell.osgi.introspector.tests.OSGiIntrospectorStaticTest;
import fr.irisa.triskell.osgi.introspector.util.tests.OSGiIntrospectorUtilDynamicTest;
import fr.irisa.triskell.osgi.introspector.util.tests.OSGiIntrospectorUtilStaticTest;
import fr.irisa.triskell.osgi.introspector.util.tests.OSGiIntrospectorUtilTest;

public class Activator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		File reportFolder = new File("reports");
		if (!reportFolder.exists()) {
			reportFolder.mkdir();
		} else if (reportFolder.isFile()) {
			System.err.println(reportFolder.getAbsolutePath() + " is already used");
		}
		
		JUnitTest junitTest = new JUnitTest(OSGiIntrospectorUtilTest.class.getName());
		junitTest.setOutfile(reportFolder.getAbsolutePath() +  File.separator + OSGiIntrospectorUtilTest.class.getName() + ".xml");
		
		XMLJUnitResultFormatter formatter = new XMLJUnitResultFormatter();
		formatter.setOutput(new FileOutputStream(junitTest.getOutfile()));
		
		JUnitTestRunner testRunner = new JUnitTestRunner(junitTest, false, false, false);
		testRunner.addFormatter(formatter);
		testRunner.run();
		
		junitTest = new JUnitTest(OSGiIntrospectorUtilStaticTest.class.getName());
		junitTest.setOutfile(reportFolder.getAbsolutePath() +  File.separator + OSGiIntrospectorUtilStaticTest.class.getName() + ".xml");
		
		formatter = new XMLJUnitResultFormatter();
		formatter.setOutput(new FileOutputStream(junitTest.getOutfile()));
		
		testRunner = new JUnitTestRunner(junitTest, false, false, false);
		testRunner.addFormatter(formatter);
		testRunner.run();
		
		junitTest = new JUnitTest(OSGiIntrospectorUtilDynamicTest.class.getName());
		junitTest.setOutfile(reportFolder.getAbsolutePath() +  File.separator + OSGiIntrospectorUtilDynamicTest.class.getName() + ".xml");
		
		formatter = new XMLJUnitResultFormatter();
		formatter.setOutput(new FileOutputStream(junitTest.getOutfile()));
		
		testRunner = new JUnitTestRunner(junitTest, false, false, false);
		testRunner.addFormatter(formatter);
		testRunner.run();
		
		junitTest = new JUnitTest(TranslationTest.class.getName());
		junitTest.setOutfile(reportFolder.getAbsolutePath() +  File.separator + TranslationTest.class.getName() + ".xml");
		
		formatter = new XMLJUnitResultFormatter();
		formatter.setOutput(new FileOutputStream(junitTest.getOutfile()));
		
		testRunner = new JUnitTestRunner(junitTest, false, false, false);
		testRunner.addFormatter(formatter);
		testRunner.run();
		
		junitTest = new JUnitTest(OSGiIntrospectorStaticTest.class.getName());
		junitTest.setOutfile(reportFolder.getAbsolutePath() +  File.separator + OSGiIntrospectorStaticTest.class.getName() + ".xml");
		
		formatter = new XMLJUnitResultFormatter();
		formatter.setOutput(new FileOutputStream(junitTest.getOutfile()));
		
		testRunner = new JUnitTestRunner(junitTest, false, false, false);
		testRunner.addFormatter(formatter);
		testRunner.run();
		
		junitTest = new JUnitTest(OSGiIntrospectorDynamicTest.class.getName());
		junitTest.setOutfile(reportFolder.getAbsolutePath() +  File.separator + OSGiIntrospectorDynamicTest.class.getName() + ".xml");
		
		formatter = new XMLJUnitResultFormatter();
		formatter.setOutput(new FileOutputStream(junitTest.getOutfile()));
		
		testRunner = new JUnitTestRunner(junitTest, false, false, false);
		testRunner.addFormatter(formatter);
		testRunner.run();
		
		System.out.println("Reports XML into :");
		System.out.println(reportFolder.getAbsolutePath());
		System.out.println("Reports HTML into :");
		System.out.println(reportFolder.getAbsolutePath() + File.separator + "html");
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
	}

}
