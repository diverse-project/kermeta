/* $Id: TGInheritanceTransformations.java,v 1.2 2006-01-27 19:41:22 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : TGInheritanceTransformations.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 3 déc. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;

import java.util.Iterator;
import java.util.Vector;

import com.touchgraph.graphlayout.Edge;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGException;
import com.touchgraph.graphlayout.TGPanel;

import fr.irisa.triskell.kermeta.touchnavigator.TouchNavigatorPlugin;

/**
 * Some simple transformation applicable to kermeta graphes
 * (Ie. that doesn't need a full rebuild of the graph
 * @author dvojtise
 *
 */
public class TGInheritanceTransformations {

	protected TGPanel tgPanel;
	
	protected TGPanelHelper tgpHelper;
	
	public TGInheritanceTransformations(TGPanel panel) {
		tgPanel = panel;
		tgpHelper = new TGPanelHelper(panel);
	}



	/**
	 * If this node inherits from several classes, then it will have only one intermediate
	 * inheritance node
	 * not compatible with mergeSpecialization (links ignored)
	 * @param startNode
	 */
	public void mergeGeneralization(Node startNode){
		Vector<Node> nodeToDelete = new Vector<Node>();
		Node currentGeneralizationNode = null;
		
		
		
		Iterator it = startNode.getEdges();
		while(it.hasNext())
		{
			Edge edge = (Edge)it.next();
			if ((edge.from == startNode) && (edge.to.getLabel().equals("Inherits")))
			{
				if(currentGeneralizationNode == null) currentGeneralizationNode = edge.to;
				else {
					if(edge.to.edgeCount() ==2){
						Node destNode =  tgpHelper.findFirstOtherEdge(edge.to, edge).to;
						// mark the node to be removed
						nodeToDelete.add(edge.to);
						
						// recreate the correct edge
						tgpHelper.addInheritanceEdge(currentGeneralizationNode, destNode, Edge.DEFAULT_LENGTH);
					}
					// problem with this inheritance node , probably already merged (using specialization merge)
				}
			}
			// Else: not a generalization
		}

		// now we can delete the nodes
		it = nodeToDelete.iterator();
		while(it.hasNext()){
			tgPanel.deleteNode((Node)it.next());
		}
	}
	
	/**
	 * If this node is specialized by several children, 
	 * all the children will share one intermediate inheritance node
	 * not compatible with mergeGeneralization (links ignored)
	 * @param startNode
	 */
	public void mergeSpecialization(Node startNode){
		Vector<Node> nodeToDelete = new Vector<Node>();
		Node currentSpecializationNode = null;
		TouchNavigatorPlugin.internalLog.debug("Merging Specialization of node "+startNode.getLabel());
		Iterator it = startNode.getEdges();
		while(it.hasNext())
		{
			Edge edge = (Edge)it.next();
			TouchNavigatorPlugin.internalLog.debug("	visiting edge " + edge.toString() + " from " +edge.from.getLabel() + " to " + edge.to.getLabel());
			if ((edge.to == startNode) && (edge.from.getLabel().equals("Inherits")))
			{
				if(currentSpecializationNode == null) currentSpecializationNode = edge.from;
				else {
					if(edge.from.edgeCount() ==2){
						TouchNavigatorPlugin.internalLog.debug("   changing edge from "+edge.from.edgeAt(0).from.getLabel());
						
						
						Node sourceNode =  tgpHelper.findFirstOtherEdge(edge.from, edge).from;
						// mark the node to be removed
						nodeToDelete.add(edge.from);
						// recreate the correct edge
						tgPanel.addEdge(sourceNode, currentSpecializationNode, Edge.DEFAULT_LENGTH);
					}
					// problem with this inheritance node , probably already merged (using specialization merge)
				}
			}
			// Else: not a specialization
		}
		// now we can delete the nodes
		it = nodeToDelete.iterator();
		while(it.hasNext()){
			tgPanel.deleteNode((Node)it.next());
		}
	}

	
	/**
	 * reverse the effects of mergeSpecialization
	 * ie. children who share the same inheritance node to this node will have their own link
	 * @param startNode
	 */
	public void expandSpecialization(Node startNode){
		// TODO implement a command pattern so the iterator would not complain about comodification
		// replace these vectors by the command pattern
		Vector<Edge> edgeToDelete = new Vector<Edge>();
		Vector<Node> nodeToLink = new Vector<Node>();
		Node currentSpecializationNode = null;
		TouchNavigatorPlugin.internalLog.debug("Expanding Specialization of node "+startNode.getLabel());
		Iterator it = startNode.getEdges();
		while(it.hasNext())
		{
			Edge edge = (Edge)it.next();
			//for each specialization node; try to expand
			if ((edge.to == startNode) && (edge.from.getLabel().equals("Inherits")))
			{
				currentSpecializationNode = edge.from;
				// for each edge going to this inheritance node except one edge
				for(int i = 1; i<currentSpecializationNode.edgeCount(); i++){
					if(currentSpecializationNode.edgeAt(i).to == currentSpecializationNode){
						// remove the edge
						edgeToDelete.add(currentSpecializationNode.edgeAt(i));
						// add a new inheritance link					
						Node inheritanceNode;
						try {
							inheritanceNode = tgpHelper.addInvisibleNode();
							inheritanceNode.setGhostNode(true);
							inheritanceNode.setLabel("Inherits");
							inheritanceNode.setType(Node.TYPE_ROUNDRECT);
							tgPanel.addEdge(currentSpecializationNode.edgeAt(i).from,inheritanceNode,Edge.DEFAULT_LENGTH);
							nodeToLink.add(inheritanceNode);
							//tgpHelper.addInheritanceEdge(inheritanceNode,startNode,Edge.DEFAULT_LENGTH);
						} catch (TGException e) {
							e.printStackTrace();
						}
					}
				}
				
			}
			// Else: not a specialization
		}
		//		 now we can link the nodes
		it = nodeToLink.iterator();
		while(it.hasNext()){
			tgpHelper.addInheritanceEdge((Node)it.next(),startNode,Edge.DEFAULT_LENGTH);
		}
		// now we can delete the nodes
		it = edgeToDelete.iterator();
		while(it.hasNext()){
			tgPanel.deleteEdge((Edge)it.next());
		}
	}

	
	
}
