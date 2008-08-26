package fr.irisa.triskell.osgi.introspector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.junit.FormatterElement;
import org.apache.tools.ant.taskdefs.optional.junit.JUnitTest;
import org.apache.tools.ant.taskdefs.optional.junit.JUnitTestRunner;
import org.apache.tools.ant.taskdefs.optional.junit.XMLJUnitResultFormatter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import framework.tests.FrameworkAllTests;

/**
 * 
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * @see BundleActivator This class is the {@link BundleActivator} of the OSGi
 *      Introspector model tests bundle.
 */
public class Activator implements BundleActivator {

	public static void main(String[] args) {
		try {
			(new Activator()).start(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		String fileName = "model_report";
		
		File reportFolder = new File("reports");
		if (!reportFolder.exists() || reportFolder.isDirectory()) {
			reportFolder.mkdirs();
			
			JUnitTest junitTest = new JUnitTest(FrameworkAllTests.class.getName());
			junitTest.setOutfile(reportFolder.getAbsolutePath() +  File.separator + fileName + ".xml");
			junitTest.setProperties(System.getProperties());
			
			XMLJUnitResultFormatter formatter = new XMLJUnitResultFormatter();
			formatter.setOutput(new FileOutputStream(junitTest.getOutfile()));
			
			JUnitTestRunner testRunner = new JUnitTestRunner(junitTest, false, false, false);
			testRunner.addFormatter(formatter);
			testRunner.run();
			
			System.out.println("Report XML into :");
			System.out.println(reportFolder.getAbsolutePath());
			
			File reportFolderHTML = new File(reportFolder.getAbsoluteFile() + File.separator + "html");
			if (!reportFolderHTML.exists() || reportFolderHTML.isDirectory()) {
				reportFolderHTML.mkdirs();
				
				File outputFile = new File(reportFolderHTML + File.separator + fileName + ".html");
				if (!outputFile.exists()) {
					outputFile.createNewFile();
				}/* else {
					outputFile.delete();
					outputFile.createNewFile()
				}*/

				this.transform(outputFile.getAbsolutePath(), junitTest.getOutfile());
				
				System.out.println("Report HTML into :");
				System.out.println(reportFolderHTML.getAbsolutePath());
				
			} else if (reportFolder.isFile()) {
				System.err.println(reportFolderHTML.getAbsolutePath() + " is already used and is a file.");
			} else {
				// never appears
			}
			
		} else if (reportFolder.isFile()) {
			System.err.println(reportFolder.getAbsolutePath() + " is already used and is a file.");
		} else {
			// never appears
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {	
	}
	
	private void transform(String outputFilePath, String XMLFilePath) throws BuildException {
		try{		    
		    TransformerFactory tFactory = TransformerFactory.newInstance();
		    Source stylesheet = new StreamSource(getStylesheet(false));

		    Transformer transformer = tFactory.newTransformer(stylesheet);

		    transformer.transform(new StreamSource(XMLFilePath),
		                  new StreamResult(outputFilePath));
		    transformer.transform(new StreamSource(XMLFilePath),
	                  new StreamResult(System.err));

	    }
	    catch (Exception e){
	      e.printStackTrace();
	    }
    }
	
	/**
     * access the stylesheet to be used as a resource.
     * @return stylesheet as a resource
	 * @throws IOException 
     */
    private InputStream getStylesheet(boolean frames) throws IOException {
        String xslname = "junit-frames.xsl";
        if (!frames) {
            xslname = "junit-noframes.xsl";
        }
        URL stylesheetURL = getClass().getClassLoader().getResource(
        		"org/apache/tools/ant/taskdefs/optional/junit/xsl/" + xslname);
        //printFile(stylesheetURL);
        return stylesheetURL.openStream();
    }
    
    private void printFile(URL url) {
    	try {
    		System.err.println(url.toExternalForm());
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
