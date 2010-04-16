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

	//collect the known uris
	private List<String> knownUris = new ArrayList<String>();
	
	public CycleGraph getCycleGraph(File rootFile) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Provide the list of the URI associated to this URI
	 */
	public SimpleGraph getSimpleGraph(File rootFile) {
		
		
		String rootFileURI = rootFile.getPath();
		//validate the URI (file exists on disk) 
		String uri = UriResolver.resolveUri(rootFileURI, rootFileURI);
		if (uri != null){
			SimpleGraph resultgraph = new SimpleGraph();
			//set the root node
			GraphNode root = recursiveResolve(rootFileURI, rootFileURI);
			root.setName(rootFileURI);
			resultgraph.setRootNode(root);
			return resultgraph;
		}
		return null;
	}

	/**
	 * Traverse the file to collect the required uri associated to this uri
	 * @param uri
	 * @return
	 */
	private List<String> getResourceRequires(String uri) {
		return FileTraversal.getRequires(uri);
	}

	public List<String> getAllRequired(File rootFile) {
		return null;
	}

	private GraphNode recursiveResolve(String fileUri, String rootFileURI){
		String uri = UriResolver.resolveUri(fileUri, rootFileURI);
		//if uri is valid
		if (uri != null){
			knownUris.add(uri);
			GraphNode node = new GraphNode();
			//look into content of the resource to find require
			List<String> requires = getResourceRequires(uri);
			//if found some require then add to the node
			if (!requires.isEmpty()){
				//for each require build the tree according to root's direct references
				for (String requireUri : requires){
					//validate the require URI
					String resolvedUri = UriResolver.resolveUri(requireUri,rootFileURI); 
					if (resolvedUri != null){
						GraphNode requiredNode = new GraphNode();
						if (!knownUris.contains(resolvedUri)){
							requiredNode  = recursiveResolve(resolvedUri, rootFileURI);
						}
						requiredNode.setName(resolvedUri);
						// if URI OK add URI to directreferencename
						node.getDirectReferences().add(requiredNode);
					}
				}
			}
			return node;
		}
		return null;
	}
	
}
