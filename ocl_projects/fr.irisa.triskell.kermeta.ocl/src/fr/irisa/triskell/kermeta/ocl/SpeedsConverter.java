/**
 *  Mark Skipper September 2007
 *  I was using this to test the ocl from the speeds project. 
 *  I know this is not the right place to put it, but I was having trouble
 *  understanding how to do cross-package dependencies in Eclipse and
 *  this, meanwhile, allowed me to get on with my work.
 */
package fr.irisa.triskell.kermeta.ocl;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;

import fr.irisa.triskell.kermeta.ocl.GenerateKMT;

public class SpeedsConverter {
	
	static final String workbench_path = "platform:/resource/";
	static final String speeds = "speedsImplementation";
	static final String speedsEcore = workbench_path + speeds + "/hrc/ecore/speedsL1.ecore";
	static final String oclDirPath = workbench_path + speeds + "/hrc/constraints/ocl/";
	static final String kmtDirPath = workbench_path + speeds + "/hrc/constraints/kmt/ocl/";
	static final URI speedsEcoreURI = URI.createURI(speedsEcore);
	static final GenerateKMT generator = new GenerateKMT();
	
	public static void convertOcl(String oclPath, String kmtPath){
    	URI oclURI = URI.createURI(oclPath);
    	URI kmtURI = URI.createURI(kmtPath);
		generator.generate(speedsEcoreURI , oclURI, kmtURI);
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
	
	/**
	 * At first the speeds ocl constraints were all in separate files and I was using
	 * this to process them all. But the dependencies mean its more practical to
	 * process everything in one file and split afterwards. That file is speedsAllOcl
	 * @throws Exception
	 */
	public static void processAllFiles() throws Exception{
		File dir = new File(oclDirPath);
		if (!dir.isDirectory()) {
			throw new Exception( "Unrecognised directory path: " + oclDirPath);
		}
		String[] list = dir.list(new oclFilter());
		for (int i = 0; i < list.length; i++)  {
			String oclfile =  list[i];
			String kmtfile = oclfile.substring(0, oclfile.lastIndexOf(".")) +".kmt";
			oclfile = oclDirPath + oclfile;
			kmtfile =kmtDirPath + kmtfile;
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
	
	public static void main(String[] args) {
		try {
    		processAllFiles();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	
}
