package kermeta_io.roundtrip_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Created on 16 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class GenerateJUnitTestSuite {


	protected static String[] folders = {
							"test/roundtrip_testcases/ecore", 
							"test/roundtrip_testcases/kmt", 
							"test/roundtrip_testcases/km"} ;
	protected static String[] filetypes = {"main.ecore", "main.kmt", "main.km"};
	
	protected static String template = null;
	protected static String getTemplate() {
		if (template == null) {
			template = "public void testFILENAME() throws Exception {\n";
			template += "testDIRNAMEFile(\"DIR\",\"FILE\" );\n";
			template += "}\n";
		}
		return template;
	}

	protected static String junitfile = "junit/kermeta_io/roundtrip_test/JunitTestSuite.java";

	public static void main(String[] args) {
		String tcs = "";
		//System.out.println("folders.length "+ folders.length);
		for(int i=0; i<folders.length; i++) {
			File dir = new File(folders[i]);
			System.out.println("Looking into "+ folders[i]);
			if (dir.isDirectory()) tcs += generateForDirectory(dir);
			else System.err.println("ignored test folder " + folders[i] );
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
			//System.out.println("   Processing file " +files[i].getName() );
			if (files[i].isFile() && files[i].getName().indexOf('.') > 0) {
				String name = files[i].getName().substring(0, files[i].getName().indexOf('.'));
				String ext = files[i].getName().substring(files[i].getName().indexOf('.')+1);
				//System.out.println("Adding file " + name + "." + ext );
				if (containsFileType(ext)) {
					System.out.println("   Adding file " +files[i].getName() );
					String method = getTemplate();
					String dirPath=dir.getPath();
					dirPath=dirPath.replaceAll("\\\\","/");
					method = method.replaceAll("DIRNAME", dir.getName());
					method = method.replaceAll("DIR", dirPath);
					method = method.replaceAll("FILENAME", dir.getName() + "_" + name);
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
