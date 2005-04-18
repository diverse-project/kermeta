/* $Id: GenerateJUnitTestSuite.java,v 1.3 2005-04-18 09:24:07 dvojtise Exp $
 * Project : Kermeta.interpreter
 * File : GenerateJUnitTestSuite.java
 * License : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 16 f�vr. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package kermeta_interpreter.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Generate or Regenerate the JunitTestSuite by looking for *.main.kmt files in the test folder.
 * @author Franck Fleurey
 */
public class GenerateJUnitTestSuite {


	protected static String[] folders = {"test/kmt_testcases"} ;
	protected static String[] filetypes = {"kmt", "emf"};
	
	protected static String template = null;
	protected static String getTemplate() {
		if (template == null) {
			template = "public void testFILENAME() throws Exception {\n";
			template += "testWithFile(\"DIR\",\"FILE\" );\n";
			template += "}\n";
		}
		return template;
	}

	protected static String junitfile = "test/junit/kermeta_interpreter/test/JunitTestSuite.java";

	public static void main(String[] args) {
		String tcs = "";
		//System.out.println("folders.length "+ folders.length);
		for(int i=0; i<folders.length; i++) {
			File dir = new File(folders[i]);
			if (dir.isDirectory()) tcs += generateForDirectory(dir);
			else System.err.println("ignored test folder " + folders[i] );
		}
		//System.out.println("result "+ tcs);
		String result = getFileContent(junitfile);
		String begin = result.substring(0, result.indexOf("/*** BEGIN GENERATED TESTS ***/"));
		begin += "\n" + "/*** BEGIN GENERATED TESTS ***/\n" + tcs + result.substring(result.indexOf("/*** END GENERATED TESTS ***/"));
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
