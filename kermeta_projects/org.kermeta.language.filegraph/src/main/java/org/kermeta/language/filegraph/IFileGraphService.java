/*$Id : $
* Project : org.kermeta.language.filegraph
* File : 	IFileGraphService.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 avr. 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.language.filegraph;

import java.util.List;

import org.eclipse.emf.common.util.URI;

/**
* This file was generated using DiVA Studio.
* Visit http://www.ict-diva.eu/ for more details about DiVA.
*/
public interface IFileGraphService{
 	
	 public SimpleGraph getSimpleGraph(URI rootFile);
	 
	 public CycleGraph getCycleGraph(URI rootFile);
	 
	 public List<URI> getAllRequired(URI rootFile);
	
}