/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *                  Francois Fouquet <ffouquet@irisa.fr>
 *                  Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.loader.kmt.scala.internal.parser;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


import junit.framework.Test;
import junit.framework.TestSuite;


public class ScalaKMTParserTestSuite extends TestSuite {

	 public static Test suite() {
			//KermetaCompiler.initializeFactory();
			
			final FileFilter filter = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return pathname!=null && pathname.getAbsolutePath().endsWith(".kmt");
				}
			};
			final String folderFullURI 	= new File(ScalaKMTParserTestSuite.class.getClassLoader().getResource("do_not_remove").getFile()).getParent();
			final List<File> files 		= new ArrayList<File>();
			final TestSuite suite 		= new TestSuite("ScalaKMTParserTestSuite");
			
			getFiles(new File(folderFullURI), files, filter);
			
			for(File file : files) {
				System.out.println("Testing: " + file.getPath() + "\tto\t" + file.getParent());
				suite.addTest(new ScalaKMTParserTest(file, 
						file.getParentFile().getName().equals("valid") ));
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
