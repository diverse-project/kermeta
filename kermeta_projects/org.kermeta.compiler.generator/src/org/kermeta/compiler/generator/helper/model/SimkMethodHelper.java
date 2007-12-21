/*$Id: SimkMethodHelper.java,v 1.1 2007-12-21 14:24:21 cfaucher Exp $
* Project : org.kermeta.compiler
* File : 	HelperMethod.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 nov. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.generator.helper.model;

import fr.irisa.triskell.kermeta.language.structure.Operation;

public class SimkMethodHelper {

	private String name;
	private String paramName;
	private String paramType;
	private String returnType;
	private Operation parentMethodFromModel;
	private String body;
	private String packageName;
	private String allPackagesName;
	private String id;
	
	
	public SimkMethodHelper(String name, String paramName, String paramType,
			String returnType, Operation parentMethodFromModel,
			String body, String packageName,
			String allPackagesName, String id) {
		this.name = name;
		this.paramName = paramName;
		this.paramType = paramType;
		this.returnType = returnType;
		this.parentMethodFromModel = parentMethodFromModel;
		this.body = body;
		this.packageName= packageName;
		this.allPackagesName = allPackagesName;
		this.id = id;
	}
	
	/*public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getParamName() {
		return paramName;
	}
	
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	
	public String getReturnType() {
		return returnType;
	}
	
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	
	public String getParamType() {
		return paramType;
	}
	
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public Operation getParentMethodFromModel() {
		return parentMethodFromModel;
	}

	public void setParentMethodFromModel(Operation parentMethodFromModel) {
		this.parentMethodFromModel = parentMethodFromModel;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getAllPackagesName() {
		return allPackagesName;
	}

	public void setAllPackagesName(String allPackagesName) {
		this.allPackagesName = allPackagesName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		return getAllPackagesName() + getName();
	}*/

}


