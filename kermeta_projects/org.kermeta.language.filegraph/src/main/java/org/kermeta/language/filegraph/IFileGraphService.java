package org.kermeta.language.filegraph;

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;

/**
* This file was generated using DiVA Studio.
* Visit http://www.ict-diva.eu/ for more details about DiVA.
*/
public interface IFileGraphService{
 	
	 public SimpleGraph getSimpleGraph(URI rootFile);
	 
	 public CycleGraph getCycleGraph(URI rootFile);
	 
	 public List<String> getAllRequired(URI rootFile);
	
}