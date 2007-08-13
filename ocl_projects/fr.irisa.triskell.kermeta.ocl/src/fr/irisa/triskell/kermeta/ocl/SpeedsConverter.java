package fr.irisa.triskell.kermeta.ocl;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

import fr.irisa.triskell.kermeta.ocl.GenerateKMT;

public class SpeedsConverter {
	
	static String workbench_path = GenerateKMT.workbench_path;
	static String speeds = "speedsImplementation";
	static String speedsEcore = workbench_path + speeds + "/hrc/ecore/speedsL1.ecore";
	static String oclpath = workbench_path + speeds + "/hrc/constraints/ocl/";
	static String kmtpath = workbench_path + speeds + "/hrc/constraints/kmt/ocl/";
	
	
	public static void convertOcl(String oclPath, String kmtPath){
		GenerateKMT generator = new GenerateKMT();
		generator.generate(speedsEcore , oclPath, kmtPath);
	}
	
	static class oclFilter implements FilenameFilter {
	    public boolean accept(File dir, String name) {
	        return (name.endsWith(".ocl"));
	    }
	}
	
	static void writeError(String filename, String errormsg){
		   try {
		        BufferedWriter out = new BufferedWriter(new FileWriter(filename));
		        out.write("\n\nError processing OCL\n" +errormsg);
		        out.close();
		    } catch (IOException e) {
		    }
	}
	
	public static void listFiles() throws Exception{
		File dir = new File(oclpath);
		if (!dir.isDirectory()) {
			throw new Exception( "Unrecognised path: " + oclpath);
		}
		String[] list = dir.list(new oclFilter());
		for (int i = 0; i < list.length; i++)  {
			String oclfile =  list[i];
			String kmtfile = oclfile.substring(0, oclfile.lastIndexOf(".")) +".kmt";
			oclfile = oclpath + oclfile;
			kmtfile =kmtpath + kmtfile;
			System.out.println("\n\n" + i + ") " + oclfile + " --> " + kmtfile);
			try {
				convertOcl(oclfile, kmtfile);
			} catch (Exception e) {
				writeError(kmtfile, e.getMessage());
			} catch (Error e){
				writeError(kmtfile, e.getMessage());
			}
		}
	}
	
	public static void oldmain(String[] args) {
		try {
    		new SpeedsConverter().listFiles();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	
	public static void test(){
		String project = "fr.irisa.triskell.kermeta.ocl";
		new GenerateKMT().generate( 
				workbench_path + project+  "/ocl/sample.ecore", 
				workbench_path + project + "/ocl/70.ocl",
				workbench_path + project + "/ocl/70.kmt");
	}

	public static void main(String[] args) {
		try {
    		listFiles();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	
}
