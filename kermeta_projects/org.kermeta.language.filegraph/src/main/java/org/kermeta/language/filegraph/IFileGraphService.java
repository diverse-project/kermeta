package org.kermeta.language.filegraph;

import java.util.List;

/**
* This file was generated using DiVA Studio.
* Visit http://www.ict-diva.eu/ for more details about DiVA.
*/
public interface IFileGraphService{
 	
	 public SimpleGraph getSimpleGraph(String rootFileURI);
	 
	 public CycleGraph getCycleGraph(String rootFileURI);
	 
	 public List<String> getAllRequired(String rootFileURI);
	
}