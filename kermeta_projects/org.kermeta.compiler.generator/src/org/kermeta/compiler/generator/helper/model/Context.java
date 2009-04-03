/*$Id: Context.java,v 1.1 2008-10-16 09:04:38 cfaucher Exp $
* Project : org.kermeta.compiler.generator
* File : 	Context.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 oct. 08
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.generator.helper.model;


public class Context {

	private String kmFilePathForReflection = null;

	private String uriEPackageClass = null;

	private String uriEPackageInstance = null;
	
	/**
	 * String containing the main operations specified by the user in the *.compiler.properties file
	 */
	private String mainOperations = null;
	
	public Context () {
		
	}
	
	public Context (String kmFilePathForReflection, String uriEPackageInstance, String uriEPackageClass, String mainOperations ) {
		this.kmFilePathForReflection = kmFilePathForReflection;
		this.uriEPackageInstance = uriEPackageInstance;
		this.uriEPackageClass = uriEPackageClass;
		this.mainOperations = mainOperations;
	}
	
	
	/********************************/
	/******** GETTERS/SETTERS *******/
	/********************************/
	public String getKmFilePathForReflection() {
		return kmFilePathForReflection;
	}

	public void setKmFilePathForReflection(String kmFilePathForReflection) {
		this.kmFilePathForReflection = kmFilePathForReflection;
	}

	public String getUriEPackageClass() {
		return uriEPackageClass;
	}

	public void setUriEPackageClass(String uriEPackageClass) {
		this.uriEPackageClass = uriEPackageClass;
	}

	public String getUriEPackageInstance() {
		return uriEPackageInstance;
	}

	public void setUriEPackageInstance(String uriEPackageInstance) {
		this.uriEPackageInstance = uriEPackageInstance;
	}

	public String getMainOperations() {
		return mainOperations;
	}

	public void setMainOperations(String mainOperations) {
		this.mainOperations = mainOperations;
	}

}
