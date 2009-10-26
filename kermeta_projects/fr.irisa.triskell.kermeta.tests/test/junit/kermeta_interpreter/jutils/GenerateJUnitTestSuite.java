/* $Id: GenerateJUnitTestSuite.java,v 1.2 2008-01-02 10:28:13 vmahe Exp $
 * Project : Kermeta.interpreter
 * File : GenerateJUnitTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 16 fevr. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package kermeta_interpreter.jutils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


/**
 * Generate or Regenerate the JunitTestSuite by looking for *.main.kmt files in the test folder.
 * @author Franck Fleurey
 */
public class GenerateJUnitTestSuite {

	// these 3 attributes must be overwritten to match the concrete configuration
	protected static String[] folders = {};//{"test/emf_testcases/kermeta"} ;
	protected static String[] filetypes = {};//{"kmt", "emf"};
	protected static String junitfile = ""; //"test/junit/kermeta_interpreter/emf_test/JunitTestSuite.java";

	
	protected static String template = null;
	protected static String getTemplate() {
		if (template == null) {
			template = "\t\ttestWithFile(\"DIR\",\"FILE\" );\n";
		}
		return template;
	}

	
	public static void genericmain(String[] args) {
		String tcs = "";
		//System.out.println("folders.length "+ folders.length);
		for(int i=0; i<folders.length; i++) {
			File dir = new File(folders[i]);
			if (dir.isDirectory()) 
				tcs += generateForDirectory(dir);
			else 
				System.err.println("ignored test folder " + folders[i] );
		}
		//System.out.println("result "+ tcs);
		String result = getFileContent(junitfile);
		String begin = result.substring(0, result.indexOf("/*** BEGIN GENERATED TESTS ***/"));
		begin += "/*** BEGIN GENERATED TESTS ***/\n" + tcs + result.substring(result.indexOf("/*** END GENERATED TESTS ***/"));
		result = begin;
		
		try {
			FileWriter w = new FileWriter(junitfile);
			w.write(result);
			w.close();
			System.out.println("successfully generated " + junitfile + "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getFileContent(String file) {
		String result = "";
		try {
			BufferedReader r = new BufferedReader(new FileReader(file));
			while (r.ready()) {
				result += r.readLine() + "\n";
			}
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static String generateForDirectory(File dir) {
		String result = "";
		File[] files = dir.listFiles();
		// Sort with help of Collections API.
	    Arrays.sort(files);
		for (int i=0; i<files.length; i++) {
			//System.out.println("Processing file " +files[i].getName() );
			if (files[i].isFile() && files[i].getName().indexOf('.') > 0
			 && files[i].getName().substring(
			         files[i].getName().indexOf('.'), files[i].getName().length()).equals(".main.kmt")
			         
			) {
				String name = files[i].getName().substring(0, files[i].getName().indexOf('.'));
				
				String ext = files[i].getName().substring(files[i].getName().lastIndexOf('.')+1);
				//System.out.println("Adding file " + name + "." + ext );
				if (containsFileType(ext)) {
					//System.out.println("Adding file " +files[i].getName() );
					String method = getTemplate();
					String dirPath=dir.getPath();
					dirPath=dirPath.replaceAll("\\\\","/");
					method = method.replaceAll("DIR", dirPath);
					method = method.replaceAll("FILENAME", name);
					method = method.replaceAll("FILE", files[i].getName());
					result += method + "\n";
				}
			}
			
		}
		return result;
	}
	
	public static boolean containsFileType(String ext) {
		for(int i=0; i<filetypes.length; i++) {
			if (filetypes[i].equals(ext)) return true;
		}
		return false;
	}
	
}
