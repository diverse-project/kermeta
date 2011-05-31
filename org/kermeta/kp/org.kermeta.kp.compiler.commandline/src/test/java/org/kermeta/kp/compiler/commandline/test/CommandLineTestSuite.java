package org.kermeta.kp.compiler.commandline.test;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.kermeta.kp.compiler.commandline.KermetaCompiler;

public class CommandLineTestSuite extends TestSuite {
    public static Test suite() {
		KermetaCompiler.initializeFactory();
		
		final FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname!=null && pathname.getAbsolutePath().endsWith(".kp");
			}
		};
		final String folderFullURI 	= new File(CommandLineTestSuite.class.getClassLoader().getResource("do_not_remove").getFile()).getParent();
		final List<File> files 		= new ArrayList<File>();
		final TestSuite suite 		= new TestSuite("CommandLineKermetaCompilerTestSuite");
		
		getFiles(new File(folderFullURI), files, filter);
		
		for(File file : files) {
			System.out.println("Testing: " + file.getPath() + "\tto\t" + file.getParent());
			suite.addTest(new CommandLineKermetaCompilerTest(file.getPath(), file.getParent()));
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
