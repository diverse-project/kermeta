/*$Id: $
* Project : org.kermeta.language.filegraph.prefuse.ui
* File : 	FileGraphToPrefuseConverter.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 avr. 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.language.filegraph.prefuse.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.kermeta.language.filegraph.CycleGraph;
import org.kermeta.language.filegraph.GraphNode;
import org.kermeta.language.filegraph.SimpleGraph;
import org.kermeta.language.filegraph.prefuse.ui.display.DependenciesDisplay;

import prefuse.data.Graph;
import prefuse.data.Node;

public class FileGraphToPrefuseConverter {

	public static Graph convertToPrefuseGraph(SimpleGraph simpleGraph, Map<GraphNode, Node> convertedNodes){
		Graph result = new Graph(true);
		result.addColumn(DependenciesDisplay.NODE_LABEL, String.class);
		result.addColumn(DependenciesDisplay.NODE_ISROOT, Boolean.class);
		
		
		// process root
		convertNodeToPrefuse(result, simpleGraph.getRootNode(), convertedNodes);
		convertedNodes.get(simpleGraph.getRootNode()).set(DependenciesDisplay.NODE_ISROOT, true);
		
		// for each converted nodes, add the edges
		for(GraphNode fileNode : convertedNodes.keySet()){
			for(GraphNode childNode :fileNode.getDirectReferences()){
				/* Edge edge = */result.addEdge(convertedNodes.get(fileNode), convertedNodes.get(childNode));
				
			}
		}
		
		return result;
	}
	protected static void convertNodeToPrefuse(Graph prefuseGraph, GraphNode fileNode, Map<GraphNode, Node> convertedNodes){
		if(!convertedNodes.containsKey(fileNode)){
			Node n = prefuseGraph.addNode();
			
			n.setString(DependenciesDisplay.NODE_LABEL, computeLabel(fileNode.getName()));
			n.set(DependenciesDisplay.NODE_ISROOT, false);
			convertedNodes.put(fileNode, n);
			for(GraphNode childNode :fileNode.getDirectReferences()){
				convertNodeToPrefuse(prefuseGraph, childNode, convertedNodes);
			}
		}		
	}
	
	protected static String computeLabel(String origName){
		StringBuffer result = new StringBuffer();
		String[] tokens = origName.split("/");
		
		if(tokens.length > 1 && (tokens[tokens.length-1].endsWith("kmt") || tokens[tokens.length-1].endsWith("ecore"))){
			result.append("...\n");
			result.append(tokens[tokens.length-1]);
		}
		else result.append(origName);
		return result.toString();
	}

	public static List<Aggregate> convertToAggregates(CycleGraph cycleGraph, Map<GraphNode, Node> convertedNodes) {
		List<Aggregate> result =  new ArrayList<Aggregate>();
		for(List<GraphNode> cycleNodes : cycleGraph.getCycles()){
			Aggregate agg = new Aggregate();
			result.add(agg);
			if(cycleNodes.size() <= 2){
				agg.setColorid( 0 );
			}
			else {
				if(cycleNodes.size()-2 <= DependenciesDisplay.NB_AGGREGATE_COLOR)
					agg.setColorid( cycleNodes.size()-2);
				else
					agg.setColorid( DependenciesDisplay.NB_AGGREGATE_COLOR);
			}
			for ( GraphNode node : cycleNodes  ) {
            	agg.getAggregatedNodes().add( convertedNodes.get(node));
            }
		}
		return result;
	}
	public static void customNodeColor(Map<GraphNode, Node> convertedNodes){
		
	}
}
