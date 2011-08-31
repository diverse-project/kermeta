/* $Id: $
* Project    : org.kermeta.kp.migrateV1ToV2
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 22 juin 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.kp.migraterequirev1tokp.eclipse.ui.require;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.kp.Dependency;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.KpFactory;
import org.kermeta.kp.Source;
import org.kermeta.kp.migraterequirev1tokp.eclipse.ui.parser.RequireParser;


/** This class migrate the Kermeta V1 require in the (Kermeta Project) kp model.
 require does not exist in kermeta V2 */
public class MigrateRequireToKP {
	
	/**
	 * Parse the selected Kermeta V1 kmt file to migrate require in a .kp file
	 * @param pathFile : the path to the .kmt file
	 */
	public List<String> parseKMTFile (String pathFile)throws FileNotFoundException {
	    RequireParser parser = new RequireParser(pathFile);
	    List<String> requiredFiles = new ArrayList<String>();
	    requiredFiles = parser.processLineByLine();
	    return requiredFiles;
	}
	
	public void displayList(List<String> list) {
		if (! list.isEmpty()) {
			for (String rF : list ) {
				System.out.println(rF);
			}
		}
	}
	
	/**
	 * Retrieve all of the requires needed by the main kmt file
	 * @param pathFile
	 * @param baseProject : the path to the base project
	 * @return :  the complete  list of required file (each file is added once)
	 * @throws FileNotFoundException 
	 */
	public List<String> allRequires (String pathFile, String baseProject, String baseWorkspace) throws FileNotFoundException {
		List<String> requiredFiles = new ArrayList<String>();
		// Parse main kmt
		requiredFiles = parseKMTFile (pathFile);
		List<String> addRequired = new ArrayList<String>();
		
		// Iterate on the obtained required files
		for (String rf : requiredFiles) {
			if (isKMTFile(rf)) {
				String path  = obtainPath(rf, baseProject, baseWorkspace);
				addRequired = parseKMTFile (path);
			}
			
			// Add these new requires on the requiredFiles list if it is not ever added
			if (! addRequired.isEmpty()){
				for (String newRequire : addRequired){
					if (! requiredFiles.contains(newRequire)) {
						requiredFiles.add(newRequire);
					}
				}
			}
		}
		return requiredFiles;
	}
	
	
	/** Determines whether the path in parameter is a kmt file path 
	 	@param filePath : the path of the tested path
	 	@result : true if it is a kmt file, false otherwise
	 */
	public boolean isKMTFile(String filePath) {
		return filePath.endsWith(".kmt\"");
	}
	
	
	/** Obtain the path of the kmt model 
	 @param requiredFile : the path of the required path
	 @param : baseProject : the baseProject path
	 @param : baseWorkspace : the baseWorkspace path 
	 @result : the path without the platform:*/
	public String obtainPath(String requiredFile, String baseProject, String baseWorkspace) {
		String result = "";
		//"------" : Remove the quotes at the beginning and the end
		String s =requiredFile.substring(2, requiredFile.length()-1);
		System.out.println("s " + s);
		
		// Test the path 
		String [] t = s.split("/");
		if (t.length == 1) {
			result =  baseProject + "/" + s;
			System.out.println("result " + result);
		}
		else {
			
			if (t[0].equals("platform:")) {
				String endPath ="";
				for (int i = 2; i < t.length; i++) {
					endPath = endPath + "/" + t[i] ;
				}
				result = baseWorkspace  + endPath;
				
			}
			else {
				result =s;
			}
		}
		return result;
	}
	
	
	/** Migrate require elements from the Kermeta V1 file to a new kp model
	 @param pathFile : the path of the kmt file
	 @param baseProject : the baseProject path
	 @param baseProjectNotation : name of baseProject variable in the kp project
	 @param baseWorkspace : the path of the workspace
	 @param projectName : the name of the kp project (the same as the Kermeta V1 file)
	 @param groupName : the group of the Kermeta project
	 @result : the path of the new kp file
	  */
	public String migrateRequireInKP (String pathFile, String baseProject,String baseProjectNotation, String baseWorkspace, String projectName, String groupName) throws FileNotFoundException, IOException {
		// Parse kmt main file
		List<String> reqFiles = allRequires( pathFile, baseProject, baseWorkspace);
		
		// Manage source in the kp (change the String, remove platform :)
		List<String> requiredFiles = sourcesInKP (baseProject, baseProjectNotation, reqFiles );
		
		// Create new KP file :
		String kpPath = createNewKpFile ( pathFile, baseProject,baseProjectNotation,requiredFiles, projectName, groupName);
		
		// Return kp path file
		return kpPath;
		//return "";
		
	}
	
	
	/** Replace beginning of all sources files path obtained by searching in the require Kermeta V1 elements by the base project notation
	 @param baseProject : the baseProject path
	 @param baseProjectNotation : the selected base project notation in the new kp model
	 @param reqFiles : The list of path files from all the require of the Kermeta V1 file
	 @result : the new modified list of path files */
	public List<String> sourcesInKP (String baseProject, String baseProjectNotation,List<String> reqFiles ){
		List<String> sourceFiles = new ArrayList<String> ();
		String bproject = baseProject.replace("/", "/");
		if (! reqFiles.isEmpty()) {
			for (String s : reqFiles) {
				String sourceF =s.substring(2, s.length()-1);
				String source ="";
				
				
				if (sourceF.contains(bproject)) {
					// source = baseProject + endPath
					String endPath = sourceF.substring(bproject.length(),sourceF.length() -1 );
					 source = baseProjectNotation + "/" + endPath;
				}
				else {
					if (!sourceF.contains("platform:")) {
					source = baseProjectNotation + "/" + sourceF;
					}
					else {
						source = sourceF;
					}
				}
				sourceFiles.add(source);
			}
		}
		return sourceFiles;
	}
	
	
	/**  Create new kp file and serialize it
	 @param pathFile : the Kermeta file's path
	 @param baseProject : the path of the base project
	 @param baseProjectNotation : the new notation of the base project path in the new kp model
	 @param requiredFiles : the files required by this kp project
	 @param projectName : the name of the project
	 @param groupName : the group of the kp project 
	 @result : the new kp path file*/
	public String createNewKpFile (String pathFile, String baseProject,String baseProjectNotation, List<String> requiredFiles, String projectName, String groupName) throws FileNotFoundException, IOException {
		// Obtain annotation values : 
		RequireParser parser = new RequireParser (pathFile);
		String mainClass = parser.parseAnnotation("@mainClass");
		String mainOperation = parser.parseAnnotation("@mainOperation");
		
		
		
		// Create KP model
		ResourceSet resourceSet = new ResourceSetImpl();
		
		//String pathKp2 = "C:/Users/mgouyett/Marie/Work/workspaceKermeta/runtime-EclipseApplication/fr.irisa.triskell.kermeta.samples/class2RDBMS/transfo/project.kp";
		
		// Name the kp project with the same name as the main Kermeta file on which it is called
		String kpProjectName = pathFile.substring(pathFile.lastIndexOf("/")+ 1, pathFile.length() );
		String kpProjectNameWithoutExt = kpProjectName.substring(0,kpProjectName.lastIndexOf(".") );
		String pathKp = baseProject + "/" + kpProjectNameWithoutExt + ".kp";
		
		
		URI uri = URI.createFileURI(pathKp);
		Resource resource = resourceSet.createResource(uri);
		
		KermetaProject kp = KpFactory.eINSTANCE.createKermetaProject();
		kp.setDefaultMainClass(mainClass);
		kp.setDefaultMainOperation(mainOperation);
		// to improve
		kp.setName(projectName);
		kp.setGroup(groupName);
		
		//Add kmt file as source
		String [] splitPath = pathFile.split("/");
		String kmtName = splitPath[splitPath.length-1]; // --/--/name.kmt (name is the last)
		String mainKmt = baseProjectNotation + "/" + kmtName;
		Source sourceMainKmt = KpFactory.eINSTANCE.createSource();
		sourceMainKmt.setUrl(mainKmt);
		kp.getSources().add(sourceMainKmt);
		
		// Iterate on required files
		if (! requiredFiles.isEmpty()) {
			for (String reqFile : requiredFiles) {
				Source source = KpFactory.eINSTANCE.createSource();
				source.setUrl(reqFile);
				kp.getSources().add(source);
			}
		}
		// Add dependency to library core
		Dependency dep = KpFactory.eINSTANCE.createDependency();
		dep.setName("language.model");
		dep.setUrl("mvn:org.kermeta.language/language.library.core/2.0.1-SNAPSHOT");
		kp.getDependencies().add(dep);
		
		// Add kp to the resource
		resource.getContents().add(kp);
			resource.save(null);
			
		// Return the kp path
		return kp.eResource().getURI().path();
		
	}
	
//------------------------------------------------------------------------------------------------------------------------
// Update kmt file if necessary
//------------------------------------------------------------------------------------------------------------------------
	
/** Migrate a kmt file to Kermeta v2 if necessary and save the old version before
 @param pathFile : the path of the kmt file to test
 @param baseProject : the path of the base project where this kmt file is stored */
public void migrateKMT (String pathFile, String baseProject, String baseWorkspace ) throws FileNotFoundException, IOException	 {
	// The migration is made only on kmt files
	System.out.println("Begin migrate");
	
	//if (isKMTFile(pathFile)) {
		
		System.out.println("isKmtFile");
		// create a new parser 
		RequireParser parser = new RequireParser (pathFile);
		
		// If the kmt V1 file contains stdio we add the using : using kermeta::IO::StdIO => stdio
		if (parser.has_stdio()) {
			
			
			
			// Test the pathFile and change it to be usable
			String path = obtainPath(pathFile, baseProject, baseWorkspace);
			
			// save the old Kermeta V1 file
			//copy(pathFile, pathFile + ".old");
			
			// Add using for stdio : 
			addUsingStdio (pathFile, "using kermeta::IO::StdIO => stdio");
			
		}
		else {
			
		}
		
		
	//}
	
}
	
	/** Add a given using on a file
	 @param pathFile : the file where the using will be added
	 @param using : the using to add
	 */
	public void addUsingStdio (String pathFile, String using) throws FileNotFoundException  {
		RequireParser parser = new RequireParser (pathFile);
		
		// Put all lines of the file in a list
		List<String> fileLines = new ArrayList<String>();
		fileLines =  parser.parseInList();
		
		// Retrieve the first index where a require is not followed by a require 
		int index = lastIndexOfRequire(fileLines);
		
		// Add using just after these require
		fileLines.add(index + 1,using);
		
		// Save the file lines on the file
		String fileContents = fileContents (fileLines);
		 writeInFile (pathFile, fileContents);
	}
	
	
	/** Retrieve the first index where a require is not followed by a require 
	 @param fileLines : the list of file lines
	 @result the first index where a require is not followed by a require, 0 if there is no requires */
	public int lastIndexOfRequire(List<String> fileLines) {
		int index = 0;
		for (int i = 0; i<= fileLines.size(); i++) {
			// We search the last index where we have a require
			if (i < fileLines.size() && fileLines.get(i).startsWith("require") && (!(fileLines.get(i+1).startsWith("require")))) {
				index = i;
			}
		}
		
		return index;
	}
	
	
	/** Write a given content in a file
	 @param pathFile : the path of the file
	 @param fileContents : the new content of the file */
	public void writeInFile (String pathFile, String fileContents) {
		 BufferedWriter bufferedWriter = null;
	        
	        try {
	            
	            //Construct the BufferedWriter object
	            bufferedWriter = new BufferedWriter(new FileWriter(pathFile));
	            
	            //Start writing to the output stream
	          bufferedWriter.write(fileContents);
	    
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } finally {
	            //Close the BufferedWriter
	            try {
	                if (bufferedWriter != null) {
	                    bufferedWriter.flush();
	                    bufferedWriter.close();
	                }
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
		
	}
	
	
	/** Add all lines of a file in a String
	 @param fileLines : the list of lines in the file
	 @result : the content of the file as a String */
	public String fileContents (List<String> fileLines) {
		String fileContents = "";
		
		for (String line : fileLines) {
			fileContents = fileContents + "\n" + line;
		}
		
		return fileContents;
	}
	
	
	/** Copy a given file to another
	 @param fromFile : file to be copied
	 @toFile : copy */
	public static void copy(String fromFile, String toFile){
		 
		try{
		 
		 File f1 = new File(fromFile);
		 File f2 = new File(toFile);
		 InputStream in = new FileInputStream(f1);
		 
		//For Append the file.
		//
		OutputStream out = new FileOutputStream(f2);
		byte[] buf = new byte[1024];
		int len;
		 
		 try {
			while ((len = in.read(buf)) > 0){
			out.write(buf, 0, len);
			in.close();
			out.close();
			 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  }
		 
		 catch(FileNotFoundException ex){
		  
		  ex.printStackTrace();

		  }
	
	}

	
	
	public static void main(String [] arg) {
		MigrateRequireToKP migrate = new MigrateRequireToKP();
		try {
			List<String> requiredFiles = new ArrayList<String>();
			
			//requiredFiles = migrate.parseKMTFile("C:/Users/mgouyett/Marie/Work/workspaceKermeta/workspace/fr.irisa.triskell.kermeta.samples/class2RDBMS/transfo/Class2RDBMS.kmt");
			//requiredFiles = migrate.allRequires("C:/Users/mgouyett/Marie/Work/workspaceKermeta/runtime-EclipseApplication/fr.irisa.triskell.kermeta.samples/class2RDBMS/transfo/Class2RDBMS.kmt", "C:/Users/mgouyett/Marie/Work/workspaceKermeta/runtime-EclipseApplication/fr.irisa.triskell.kermeta.samples/class2RDBMS/transfo","C:/Users/mgouyett/Marie/Work/workspaceKermeta/runtime-EclipseApplication"  );
			//migrate.displayList(requiredFiles);
			String pathFile = "E:/W/workspaceKermetaIndigo2/workspace/testParse/new_file.kmt";
			String baseProject = "E:/W/workspaceKermetaIndigo2/workspace/testParse";
			String baseWorkspace = "E:/W/workspaceKermetaIndigo2/workspace";
			
			migrate.migrateKMT(pathFile, baseProject, baseWorkspace);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
