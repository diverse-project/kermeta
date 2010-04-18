/*$Id : $
* Project : org.kermeta.language.filegraph
* File : 	FileGraphService.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 avr. 2010
* Authors : Haja RAMBELONTSALAMA
*/

package org.kermeta.language.filegraph.impl;

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
	
	public CycleGraph getCycleGraph(URI rootURI) {
		
		//String rootFileURI = rootFile.toString();
		//validate the URI (file exists on disk) 
		URI uri = UriResolver.resolveUri(rootURI, rootURI);
		if (uri != null){
			CycleGraph resultgraph = new CycleGraph();
			//set the root node
			HashMap<URI, GraphNode> knownUris = new HashMap<URI, GraphNode>();
			GraphNode root = recursiveResolve(rootURI, rootURI, true, knownUris);
			root.setName(rootURI.toString());
			resultgraph.setRootNode(root);
			return resultgraph;
		}
		return null;
	}

	/**
	 * Provide the list of the URI associated to this URI
	 */
	public SimpleGraph getSimpleGraph(URI rootURI) {
		
		
		//String rootFileURI = rootFile.toString();
		//validate the URI (file exists on disk) 
		URI uri = UriResolver.resolveUri(rootURI, rootURI);
		if (uri != null){
			SimpleGraph resultgraph = new SimpleGraph();
			//set the root node
			HashMap<URI, GraphNode> knownUris = new HashMap<URI, GraphNode>();
			GraphNode root = recursiveResolve(rootURI, rootURI, false, knownUris);
			root.setName(rootURI.toString());
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
	private List<String> getResourceRequires(URI uri) {
		return FileTraversal.getRequires(uri);
	}

	public List<URI> getAllRequired(URI rootURI) {
		List<URI> result = new ArrayList<URI>();		
		HashMap<URI, GraphNode> knownUris = new HashMap<URI, GraphNode>();
		recursiveResolve(rootURI, rootURI, false, knownUris);
		Set<URI> uris = knownUris.keySet();
		for (URI uri : uris){
			result.add(uri);
		}
		return result;
	}

	protected GraphNode recursiveResolve(URI fileUri, URI rootURI, boolean cycleMode, HashMap<URI, GraphNode> knownUris){
		URI uri = UriResolver.resolveUri(fileUri, rootURI);
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
					URI resolvedUri = UriResolver.resolveUri(URI.createURI(requireUri),rootURI);
					GraphNode requiredNode = new GraphNode();
					if (resolvedUri != null){
						
						if (!knownUris.keySet().contains(resolvedUri)){
							requiredNode  = recursiveResolve(resolvedUri, rootURI, cycleMode, knownUris);
						}else if (cycleMode){
							requiredNode = knownUris.get(resolvedUri);
							
						}
						requiredNode.setName(resolvedUri.toString());
						node.getDirectReferences().add(requiredNode);
					}/*
					else{
						// cannot resolve the URI to a file, simply add the require without modification
						// (for example when requiring something in the registry
						// do not try to go recursively
						requiredNode.setName(requireUri);
						
					}*/
				}
			}
			return node;
		}
		return null;
	}
	
}
