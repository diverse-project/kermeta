package org.kermeta.kp.compiler.commandline.test;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.kermeta.kp.compiler.commandline.KermetaCompiler;

public class CompilationTestSuite extends TestSuite {
	public static boolean runnableTestOnly = false; 
	
	
    public static Test suite() {
		KermetaCompiler.initializeFactory();
		
		final FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname!=null && pathname.getAbsolutePath().endsWith(".kp");
			}
		};
		final String folderFullURI 	= new File(CompilationTestSuite.class.getClassLoader().getResource("do_not_remove").getFile()).getParent();
		final List<File> files 		= new ArrayList<File>();
		final TestSuite suite 		= new TestSuite("CommandLineKermetaCompilerTestSuite");
		
		// allow to select only one test or only the runnable test via a system property
		String singleTest = System.getProperty("singleTest");
		runnableTestOnly = System.getProperty("runnableTestOnly") != null ? System.getProperty("runnableTestOnly").equalsIgnoreCase("true") : false;
		System.out.println("singleTest="+singleTest+"\t\trunnableTestOnly="+runnableTestOnly);
		
		
		getFiles(new File(folderFullURI), files, filter);			
		
		for(File file : files) {
			boolean mustRun = ! runnableTestOnly;
			// executable project fileMarker
			File executableProjectFileMarker = new File(file.getParent()+System.getProperty("file.separator")+"is_executable_test");
			if(executableProjectFileMarker.exists()  ){
					mustRun = true;
			}
			String testName = file.getPath().replace(folderFullURI,"").replaceAll("\\\\", ".").replaceAll("/", ".").substring(1);
			
			if(singleTest!= null){
				if(testName.startsWith(singleTest)) {
					mustRun = true;
				}
				else mustRun = false;
			}
			if(mustRun){
				System.out.println("Testing: " + file.getPath() + "\tto\t" + file.getParent());
				// System.out.println(" test name = "+testName+" ("+folderFullURI+")");
				suite.addTest(new CompilationTest(testName, file.getPath(), file.getParent()+System.getProperty("file.separator")));
			}
			else {
				System.out.println("Ignoring Test: " + file.getPath());
			}
		}
		
        return suite;
    }
    
    
    public static void getFiles(final File file, final List<File> files, final FileFilter filter) {
    	final String[] children = file.list();
    	final String base 		= file.getPath() + System.getProperty("file.separator");
    	File file2;
    	
    	if(children!=null)
    	    for(int i=0; i<children.length; i++) {
    	    	file2 = new File(base + children[i]);
    	    	
    	    	getFiles(file2, files, filter);
    	    	
    	        if(filter.accept(file2))
    	        	files.add(file2);
    	    }
    }
}
