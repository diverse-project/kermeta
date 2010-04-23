/*$Id: $
* Project : org.kermeta.language.filegraph
* File : 	GraphNode.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 avr. 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.language.filegraph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	/**
	 * Name of the node, usually represents the URI of a file
	 */
	protected String name;
	
	/**
	 * List of the nodes that this node directly references
	 * Ie. its dependencies
	 */
	protected List<GraphNode> directReferences;
	

	/**
	 * @return the directReferences
	 */
	public List<GraphNode> getDirectReferences() {
		if(directReferences ==  null){
			directReferences =  new ArrayList<GraphNode>();
		}
		return directReferences;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
