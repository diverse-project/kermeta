package org.kermeta.language.checker.test;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;


import junit.framework.Test;
import junit.framework.TestSuite;

public class CheckerTestSuite extends TestSuite {

    public static Test suite() {
		//KermetaCompiler.initializeFactory();
		
    	
		final FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname!=null && pathname.getAbsolutePath().endsWith(".kp");
			}
		};
		System.err.println("Entering suite()");
		
		System.err.println(CheckerTestSuite.class.getClassLoader());
		System.err.println(CheckerTestSuite.class.getClassLoader().getResource("do_not_remove"));
		System.err.println(CheckerTestSuite.class.getClassLoader().getResource("do_not_remove").getFile());
		System.err.println(new File(CheckerTestSuite.class.getClassLoader().getResource("do_not_remove").getFile()));
		System.err.println(new File(CheckerTestSuite.class.getClassLoader().getResource("do_not_remove").getFile()).getParent());
		
		final String folderFullURI 	= new File(CheckerTestSuite.class.getClassLoader().getResource("do_not_remove").getFile()).getParent();
		System.err.println("folderFullURI: " + folderFullURI);
		final List<File> files 		= new ArrayList<File>();
		final TestSuite suite 		= new TestSuite("CheckerTestSuite");
		
		getFiles(new File(folderFullURI), files, filter);
		
		for(File file : files) {
			System.err.println("Testing: " + file.getPath() + "\tto\t" + file.getParent());
			suite.addTest(new CheckerTest(file.getPath(), file.getParent()));
		}
		
    	
    	//System.err.println("testing !!");
    	
        return suite;
    }
    
    
    public static void getFiles(final File file, final List<File> files, final FileFilter filter) {
    	System.err.println(" -> getFiles()");
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
