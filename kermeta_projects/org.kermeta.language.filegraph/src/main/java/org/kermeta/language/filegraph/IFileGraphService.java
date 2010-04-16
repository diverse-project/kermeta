package org.kermeta.language.filegraph;

import java.io.File;
import java.util.List;

/**
* This file was generated using DiVA Studio.
* Visit http://www.ict-diva.eu/ for more details about DiVA.
*/
public interface IFileGraphService{
 	
	 public SimpleGraph getSimpleGraph(File rootFile);
	 
	 public CycleGraph getCycleGraph(File rootFile);
	 
	 public List<String> getAllRequired(File rootFile);
	
}