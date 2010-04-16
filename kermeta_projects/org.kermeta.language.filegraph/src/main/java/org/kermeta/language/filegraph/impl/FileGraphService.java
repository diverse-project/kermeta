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
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.kermeta.language.filegraph.CycleGraph;
import org.kermeta.language.filegraph.GraphNode;
import org.kermeta.language.filegraph.IFileGraphService;
import org.kermeta.language.filegraph.SimpleGraph;
import org.kermeta.language.filegraph.util.FileTraversal;
import org.kermeta.language.filegraph.util.UriResolver;

public class FileGraphService implements IFileGraphService{

	//collect the known uris
	private HashMap<String, GraphNode> knownUris = new HashMap<String, GraphNode>();
	
	
	public CycleGraph getCycleGraph(URI rootFile) {
		
		String rootFileURI = rootFile.toString();
		//validate the URI (file exists on disk) 
		String uri = UriResolver.resolveUri(rootFileURI, rootFileURI);
		if (uri != null){
			CycleGraph resultgraph = new CycleGraph();
			//set the root node
			GraphNode root = recursiveResolve(rootFileURI, rootFileURI, true);
			root.setName(rootFileURI);
			resultgraph.setRootNode(root);
			return resultgraph;
		}
		return null;
	}

	/**
	 * Provide the list of the URI associated to this URI
	 */
	public SimpleGraph getSimpleGraph(URI rootFile) {
		
		
		String rootFileURI = rootFile.toString();
		//validate the URI (file exists on disk) 
		String uri = UriResolver.resolveUri(rootFileURI, rootFileURI);
		if (uri != null){
			SimpleGraph resultgraph = new SimpleGraph();
			//set the root node
			GraphNode root = recursiveResolve(rootFileURI, rootFileURI, false);
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

	public List<String> getAllRequired(URI rootFile) {
		List<String> result = new ArrayList<String>();
		getSimpleGraph(rootFile);
		Set<String> uris = knownUris.keySet();
		for (String uri : uris){
			result.add(uri);
		}
		return result;
	}

	private GraphNode recursiveResolve(String fileUri, String rootFileURI, boolean cycleMode){
		String uri = UriResolver.resolveUri(fileUri, rootFileURI);
		//if uri is valid
		if (uri != null){
			
			GraphNode node = new GraphNode();
			knownUris.put(uri, node);
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
						if (!knownUris.keySet().contains(resolvedUri)){
							requiredNode  = recursiveResolve(resolvedUri, rootFileURI, cycleMode);
						}else if (cycleMode){
							requiredNode = knownUris.get(resolvedUri);
							
						}
						requiredNode.setName(resolvedUri);
						node.getDirectReferences().add(requiredNode);
					}
				}
			}
			return node;
		}
		return null;
	}
	
}
