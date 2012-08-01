package org.kermeta.kp.compiler.commandline.test;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.kermeta.kp.compiler.commandline.KermetaCompiler;

public class KRunTestSuite extends TestSuite {
	
	
    public static Test suite() {
		KermetaCompiler.initializeFactory();
		
		final FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname!=null && pathname.getAbsolutePath().endsWith(".kp");
			}
		};
		final String folderFullURI 	= new File(KRunTestSuite.class.getClassLoader().getResource("do_not_remove").getFile()).getParent();
		final List<File> files 		= new ArrayList<File>();
		final TestSuite suite 		= new TestSuite("CommandLineKermetaCompilerTestSuite");
		
		// allow to select only one test or only the runnable test via a system property
		String singleTest = System.getProperty("singleTest");
		System.out.println("singleTest="+singleTest);
		
		
		getFiles(new File(folderFullURI), files, filter);			
		
		for(File file : files) {
			String testName = file.getPath().replace(folderFullURI,"").replaceAll("\\\\", ".").replaceAll("/", ".").substring(1);
			
			boolean mustRun = false;
			// executable project fileMarker
			File executableProjectFileMarker = new File(file.getParent()+System.getProperty("file.separator")+"not_executable_test");
			if(executableProjectFileMarker.exists()  ){
					mustRun = false;
					System.out.println("Ignoring non executable Test: " + file.getPath());
			}
			else{
				mustRun = true;
			}
			
			if(singleTest!= null){
				if(testName.startsWith(singleTest)) {
					mustRun = true;
				}
				else {
					mustRun = false;
					System.out.println("Ignoring Test: " + file.getPath());
				}
			}
			if(mustRun){
				System.out.println("Testing: " + file.getPath() + "\tto\t" + file.getParent());
				// System.out.println(" test name = "+testName+" ("+folderFullURI+")");
				suite.addTest(new KRunTest(testName, file.getPath(), file.getParent()+System.getProperty("file.separator")));
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
