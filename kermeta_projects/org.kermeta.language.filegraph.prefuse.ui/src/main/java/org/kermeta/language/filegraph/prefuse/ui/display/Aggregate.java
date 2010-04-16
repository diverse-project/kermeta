/*$Id: $
* Project : org.kermeta.language.filegraph.prefuse.ui
* File : 	Aggregate.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 avr. 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.language.filegraph.prefuse.ui.display;

import java.util.ArrayList;
import java.util.List;

import prefuse.data.Node;

/**
 * Structure that represent an aggregate 
 * ie. a list of nodes and an associated colorid
 * @author dvojtise
 *
 */
public class Aggregate {
	protected int colorid;
	protected List<Node> aggregatedNodes = new ArrayList<Node>();
	
	
	/**
	 * @return the colorid
	 */
	public int getColorid() {
		return colorid;
	}
	/**
	 * @param colorid the colorid to set
	 */
	public void setColorid(int colorid) {
		this.colorid = colorid;
	}
	/**
	 * @return the aggregatedNodes
	 */
	public List<Node> getAggregatedNodes() {
		return aggregatedNodes;
	}
}
