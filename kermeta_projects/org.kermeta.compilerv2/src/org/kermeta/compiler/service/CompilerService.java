package org.kermeta.compiler.service;


public interface CompilerService {

	public void compile(String uri , String propertiesfile, String projectName, String classqname, String operationName, java.util.Collection<String> claspath, String args);
	
	

}
