/*$Id: $
* Project : org.kermeta.language.filegraph
* File : 	FileGraph.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.language.filegraph.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.language.filegraph.CycleGraph;
import org.kermeta.language.filegraph.GraphNode;
import org.kermeta.language.filegraph.IFileGraphService;
import org.kermeta.language.filegraph.SimpleGraph;
import org.kermeta.language.filegraph.util.FileTraversal;
import org.kermeta.language.filegraph.util.UriResolver;

public class FileGraphService implements IFileGraphService{

	public CycleGraph getCycleGraph(String rootFileURI) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Provide the list of the URI associated to this URI
	 */
	public SimpleGraph getSimpleGraph(String rootFileURI) {
		
		SimpleGraph resultgraph = new SimpleGraph();
		GraphNode root = new GraphNode();
		//validate the URI
		String uri = UriResolver.resolveUri(rootFileURI);
		System.out.println("uri : " +uri);
		//if uri is valid
		if (uri != null){
		
			//look into content of the resource to find require
			//if found some require then add to the node
			List<String> requires = getResourceRequires(uri);
			for (String requireUri : requires){
				//for each require build the tree according to root's direct references
				//i.e. : validate the require URI
				String resolvedUri = UriResolver.resolveUri(requireUri); 
				System.out.println("requireUri : " +requireUri);
				if (resolvedUri != null){
					GraphNode require = new GraphNode();
					require.setName(resolvedUri);
					// if URI OK add URI to directreferencename
					root.getDirectReferences().add(require); 
				}
			}
		}else{
			return null;
		}
		//set the root node
		root.setName(rootFileURI);
		resultgraph.setRootNode(root);
		return resultgraph;
	}

	/**
	 * Traverse the file to collect the required uri associated to this uri
	 * @param uri
	 * @return
	 */
	private List<String> getResourceRequires(String uri) {
		return FileTraversal.getRequires(uri);
	}

	public List<String> getAllRequired(String rootFileURI) {
		// TODO Auto-generated method stub
		return null;
	}

}
