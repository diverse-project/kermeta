package org.kermeta.language.filegraph;

/**
* This file was generated using DiVA Studio.
* Visit http://www.ict-diva.eu/ for more details about DiVA.
*/
public interface IFileGraphService{
 	
	 public SimpleGraph getSimpleGraph(String rootFileURI);
	 
	 public CycleGraph getCycleGraph(String rootFileURI);
	
}