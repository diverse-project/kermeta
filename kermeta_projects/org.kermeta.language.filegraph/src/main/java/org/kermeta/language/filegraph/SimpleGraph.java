/*$Id: $
* Project : ${project_name}
* File : 	SimpleGraph.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : ${date}
* Authors : Didier Vojtisek
*/

package org.kermeta.language.filegraph;

public class SimpleGraph {

	/**
	 * Root node of the graph
	 */
	protected GraphNode rootNode;

	/**
	 * @return the rootNode
	 */
	public GraphNode getRootNode() {
		return rootNode;
	}

	/**
	 * @param rootNode the rootNode to set
	 */
	public void setRootNode(GraphNode rootNode) {
		this.rootNode = rootNode;
	}
	
}
