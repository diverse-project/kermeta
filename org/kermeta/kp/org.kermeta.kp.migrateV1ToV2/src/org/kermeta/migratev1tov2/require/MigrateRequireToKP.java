/* $Id: $
* Project    : org.kermeta.kp.migrateV1ToV2
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 22 juin 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.migratev1tov2.require;


import java.io.FileNotFoundException;
import java.io.IOException;
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
import org.kermeta.kp.migratev1tov2.parser.RequireParser;



public class MigrateRequireToKP {
	
	/**
	 * Parse the selected Kermeta V1 kmt file to migrate require in a .kp file
	 * @param pathFile : the path to the .kmt file
	 */
	public List<String> parseKMTFile (String pathFile)throws FileNotFoundException {
	    RequireParser parser = new RequireParser(pathFile);
	    List<String> requiredFiles = new ArrayList();
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
	 * @return
	 * @throws FileNotFoundException 
	 */
	public List<String> allRequires (String pathFile, String baseProject, String baseWorkspace) throws FileNotFoundException {
		List<String> requiredFiles = new ArrayList();
		// Parse main kmt
		requiredFiles = parseKMTFile (pathFile);
		List<String> addRequired = new ArrayList();
		
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
	
	public boolean isKMTFile(String f) {
		return f.endsWith(".kmt\"");
	}
	
	public String obtainPath(String requiredFile, String baseProject, String baseWorkspace) {
		String result = "";
		//"------" : Remove the quotes at the beginning and the end
		String s =requiredFile.substring(2, requiredFile.length()-1);
		System.out.println("s " + s);
		
		// Test the path 
		String [] t = s.split("/");
		if (t.length == 1) {
			result =  baseProject + "\\" + s;
			System.out.println("result " + result);
		}
		else {
			
			if (t[0].equals("platform:")) {
				/*String endPath ="";
				for (int i = 2; i < t.length; i++) {
					endPath = endPath + "\\" + t[i] ;
				}
				result = baseWorkspace  + endPath;
				System.out.println("result " + result); */
				result = "C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\metamodels\\RDBMSMM.kmt";
			}
			else {
				result =s;
			}
		}
		return result;
	}
	
	public void migrateRequireInKP (String pathFile, String baseProject, String baseWorkspace) throws FileNotFoundException, IOException {
		// Parse kmt main file
		List<String> reqFiles = allRequires( pathFile, baseProject, baseWorkspace);
		
		// Manage source in the kp (change the String)
		List<String> requiredFiles = sourcesInKP (baseProject, "${project.baseUri}", reqFiles );
		// Create new KP file :
		createNewKpFile ( pathFile, baseProject,requiredFiles);
		
		
	}
	
	public List<String> sourcesInKP (String baseProject, String baseProjectNotation,List<String> reqFiles ){
		List<String> sourceFiles = new ArrayList<String> ();
		String bproject = baseProject.replace("\\", "/");
		if (! reqFiles.isEmpty()) {
			for (String s : reqFiles) {
				String sourceF =s.substring(2, s.length()-1);
				String source ="";
				System.out.println(sourceF);
				System.out.println(bproject);
				System.out.println();
				
				
				// PB TO RESOLVE
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
	
	public void createNewKpFile (String pathFile, String baseProject, List<String> requiredFiles) throws FileNotFoundException, IOException {
		// Obtain annotation values : 
		RequireParser parser = new RequireParser (pathFile);
		String mainClass = parser.parseAnnotation("@mainClass");
		String mainOperation = parser.parseAnnotation("@mainOperation");
		
		
		
		// Create KP model
		ResourceSet resourceSet = new ResourceSetImpl();
		//String pathKp = getPathKp(pathFile, baseProject);
		String pathKp = "C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\runtime-EclipseApplication\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo\\project.kp";
		
		
		URI uri = URI.createFileURI(pathKp);
		Resource resource = resourceSet.createResource(uri);
		
		KermetaProject kp = KpFactory.eINSTANCE.createKermetaProject();
		kp.setDefaultMainClass(mainClass);
		kp.setDefaultMainOperation(mainOperation);
		// to improve
		kp.setName("projectName");
		kp.setGroup("projectGroup");
		
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
	}
	
	public String getPathKp(String pathKMTFile, String baseProject) {
		String kpPath ="";
		String [] splitpathKMT = pathKMTFile.split("\\");
		String fileName = splitpathKMT[splitpathKMT.length-1];
		String [] obtainOnlyName = fileName.split(".");
		String name = obtainOnlyName[0];
		kpPath = baseProject + "\\" + name;
		return kpPath;
	}
	
	
	public static void main(String [] arg) {
		MigrateRequireToKP migrate = new MigrateRequireToKP();
		try {
			List<String> requiredFiles = new ArrayList();
			
			//requiredFiles = migrate.parseKMTFile("C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\workspace\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo\\Class2RDBMS.kmt");
			requiredFiles = migrate.allRequires("C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\runtime-EclipseApplication\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo\\Class2RDBMS.kmt", "C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\runtime-EclipseApplication\\fr.irisa.triskell.kermeta.samples\\class2RDBMS\\transfo","C:\\Users\\mgouyett\\Marie\\Work\\workspaceKermeta\\runtime-EclipseApplication"  );
			migrate.displayList(requiredFiles);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
