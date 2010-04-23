/*$Id: $
* Project : ${project_name}
* File : 	CycleGraph.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : ${date}
* Authors : Didier Vojtisek
*/

package org.kermeta.language.filegraph;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements a graph including cycle analysis
 */
public class CycleGraph extends SimpleGraph {
	
	/**
	 * List of the cycles in the graph
	 * Each cycle is a list of inter-connected nodes
	 */
	protected List<List<GraphNode>> cycles;

	/**
	 * @return the cycles
	 */
	public List<List<GraphNode>> getCycles() {
		if(cycles ==  null){
			cycles =  new ArrayList<List<GraphNode>>();
		}
		return cycles;
	}
}
