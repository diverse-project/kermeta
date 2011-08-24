/* $Id: $
* Project    : org.kermeta.language.helper.tests
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 24 août 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.language.helper.tests.utils;



/**
 * @author mgouyett
 * This class is used to obtain the fileName of a given file
 *
 */
public class FileHelper {
	
	/** Obtain the fileName from a given URL */
	public static String getFileName(String path) {
		String fileName = "";
		String file = path.substring( path.lastIndexOf('/')+1, path.length() );
		 fileName = file.substring(0, file.lastIndexOf('.') );
	
		return fileName;
	}
	
	public static void main (String [] arg) {
		String path = "file:/E:/W/workspaceKermetaIndigo2/runtime-New_configuration/org.kermeta.language.loader.kmt.scala/src/test/resources/internal/valid/001_testNamespaceAnnotationOrder_01.kmt";
		String file = path.substring( path.lastIndexOf('/')+1, path.length() );
		String  fileName = file.substring(0, file.lastIndexOf('.') );
		
		System.out.println("Path : " + fileName);
		
	}
	
	

}
