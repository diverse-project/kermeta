package fr.irisa.triskell.kermeta.kpm.helpers;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;

import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Unit;

public final class StringHelper {

	/**
	 * This method uses an absolute name to get the name and the path of a resource.
	 * @param absoluteName
	 * @return The method returns a string array with the name at element 0 and the path
	 * at element 1.
	 */
	/*static public String[] getNameAndPathFromAnAbsoluteName(String absoluteName) {
		
		String[] splits = absoluteName.split( ".+:" );

		String cleanAbsoluteName = "";
		if (splits.length == 2)
			cleanAbsoluteName = splits[1];
		else
			cleanAbsoluteName = splits[0];
		
		String[] result = new String[2];
		int index = cleanAbsoluteName.lastIndexOf("/");
		result[1] = cleanAbsoluteName.substring(0, index);
		if ( result[1].equals("") ) result[1] = "/";
		result[0] = cleanAbsoluteName.substring(index + 1);
		return result;
	}*/
	
	/**
	 * This method uses an IPath to get the name and the path of a resource.
	 * @param path
	 * @return The method returns a string array with the name at element 0 and the path
	 * at element 1.
	 */
	/*static public String[] getNameAndPathFromIPath(IPath path) {
		String[] result = new String[2];
		result[0] = path.lastSegment().toString();
		if ( result[0].equals("") ) result[0] = "/";
		result[1] = path.removeLastSegments(1).toString();
		return result;
	}*/
	
	/**
	 * 	// platform:/plugin/myProject/myFile.kmt
	 * @param fileURI
	 * @return /plugin/myProject/myFile.kmt
	 */
	static public String getAbsoluteName(String fileURI) {
		
		String[] splitsURI = fileURI.split( ":/");
		String absoluteName;
		if ( splitsURI.length == 3)
			absoluteName = splitsURI[1] + ":/" + splitsURI[2];
		else
			absoluteName = splitsURI[0];
		
		return absoluteName;
	}

	/**
	 * Linux compatibility
	 * platform:/plugin/myProject/myFile.kmt
	 * The method returns /myProject/myFile.kmt
	 * 
	 * Windows compatibility
	 * platform:/plugin/myProject/myFile.kmt
	 * @param fileURI
	 */
	static public String getRelativeName(String fileURI) {
		String absoluteName = getAbsoluteName(fileURI);
		String[] splits = absoluteName.split( IResourceHelper.getAbsolutePath() );
		if ( splits.length == 1 ) {
			String[] s = splits[0].split("/.+/");
			return s[1];
		} else
			return splits[1];
	}
	
	/**
	 * f = (IFile) resource;
	 * getNameAndPath(f.getFullPath());
	 */
	static public String[] getNameAndPath (IPath path) {
		String[] result = new String[2];
		result[0] = path.lastSegment();
		if ( result[0].equals("") ) result[0] = "/";
		result[1] = path.removeLastSegments(1).toString();
		return result;	
	}
	
	/**
	 * Example : /myProject/myDir/myFile.kmt
	 * It returns at element 0 : /myProject/myDir
	 *            at element 1 : myFile.kmt
	 * @param fileRelativeName This is a String representing the file path relative to the platform project.
	 */
	static public String[] getNameAndPath( String fileRelativeName ) {
		String[] result = new String[2];
		int index = fileRelativeName.lastIndexOf("/");
		result[1] = fileRelativeName.substring(0, index);
		if ( result[1].equals("") ) result[1] = "/";
		result[0] = fileRelativeName.substring(index + 1);
		return result;
	}
		
	static public String[] getNameAndPath( IResource resource ) {
		String resourceName = resource.getName();
		String resourcePath = resource.getFullPath().toString();
		String[] nameAndPath = new String[2];
		nameAndPath[0] = resourceName;
		nameAndPath[1] = resourcePath;
		return nameAndPath;
	}
	
	
	/**
	 * This method gets the extension of the file given as parameter.
	 * @param fileName
	 * @return The method returns the extension of the file (".kmt" for example)
	 * or an empty string if the file has no extension.
	 */
	static public String getExtension(String fileName) {
		int index = fileName.lastIndexOf(".");
		return fileName.substring(index);
	}
	
	/**
	 * This method gets the extension of the file given as parameter.
	 * @param file
	 * @return The method returns the extension of the file (".kmt" for example)
	 * or an empty string if the file has no extension.
	 */
	static public String getExtension(File file) {
		return getExtension(file.getName());
	}
	
	/**
	 * testa.kmt
	 * Returns testa
	 * @param fileName
	 * @return
	 */
	static public String getNameWithoutExtension(String fileName) {
		int index = fileName.lastIndexOf(".");
		return fileName.substring(0, index);
	}
	
	static public String getNameWithoutExtension(Unit unit) {
		return getNameWithoutExtension(unit.getName());
	}
	
	/**
	 * oldName = testa.kmt
	 * extension = .km
	 * it returns testa.km
	 * @param oldName
	 * @param extension
	 * @return
	 */
	static public String getNewNameWithExtension(String oldName, String extension) {
		String nameWithoutExtension = getNameWithoutExtension(oldName);
		return nameWithoutExtension + extension;
	}
	
	/**
	 * oldName = testa.kmt
	 * extension = .km
	 * it returns testa.km 
	 * @param file
	 * @param extension
	 * @return
	 */
	static public String getNewNameWithExtension(File file, String extension) {
		return getNewNameWithExtension(file.getName(), extension);
	}
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		
		System.out.println("coucou");
		
		String s1 = getAbsoluteName("file:/c:/blah/reblah/testa.kmt");
		if ( ! s1.equals("c:/blah/reblah/testa.kmt") )
			System.out.println(s1);
		
		String s2 = getAbsoluteName("/udd/blah/reblah/testa.kmt");
		if ( ! s2.equals("/udd/blah/reblah/testa.kmt") )
			System.out.println(s2);
		
	}
	
	
	
	
	
	
	
}
