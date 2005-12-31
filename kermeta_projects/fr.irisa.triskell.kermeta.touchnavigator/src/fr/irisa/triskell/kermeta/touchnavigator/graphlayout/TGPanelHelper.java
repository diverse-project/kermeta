/* $Id: TGPanelHelper.java,v 1.3 2005-12-31 09:58:03 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : KermetaTGPanel.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;

import java.util.Hashtable;
import java.util.Iterator;

import com.touchgraph.graphlayout.Edge;
import com.touchgraph.graphlayout.LocalityUtils;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGException;
import com.touchgraph.graphlayout.TGPanel;
import com.touchgraph.graphlayout.graphelements.GESUtils;
import com.touchgraph.graphlayout.graphelements.GraphEltSet;
import com.touchgraph.graphlayout.graphelements.ImmutableGraphEltSet;

public class TGPanelHelper {

	public TGPanel tgpanel;
	
	
	public TGPanelHelper(TGPanel tgPanel2) {
		tgpanel = tgPanel2;
	}
	/** Adds a Node, with its ID and label being the current node count plus 1.
     * @see com.touchgraph.graphlayout.Node
     */
    public Node addClassNode() throws TGException {
        String id = getNewNodeId();
        return addClassNode(id,null);
    }
	/** Adds a Node, provided its label.  The node is assigned a unique ID.
     * @see com.touchgraph.graphlayout.graphelements.GraphEltSet
     */
    public Node addClassNode( String label ) throws TGException {
        return addClassNode(null,label);
    }

   /** Adds a Node, provided its ID and label.
     * @see com.touchgraph.graphlayout.Node
     */
    public Node addClassNode( String id, String label ) throws TGException {
        Node node;
        if (label==null) 
            node = new ClassNode(id);
        else
            node = new ClassNode(id, label);

        tgpanel.updateDrawPos(node); // The addNode() call should probably take a position, this just sets it at 0,0
        tgpanel.addNode(node);
        return node;
    }
    
    /** Adds a Node, provided its label.  The node is assigned a unique ID.
     * @see com.touchgraph.graphlayout.graphelements.GraphEltSet
     */
    public Node addFeatureNode( String label ) throws TGException {
        return addFeatureNode(null,label);
    }
    /** Adds a Node, provided its ID and label.
     * @see com.touchgraph.graphlayout.Node
     */
    public Node addFeatureNode( String id, String label ) throws TGException {
        Node node;
        if (label==null) 
            node = new FeatureNode(id);
        else
            node = new FeatureNode(id, label);

        tgpanel.updateDrawPos(node); // The addNode() call should probably take a position, this just sets it at 0,0
        tgpanel.addNode(node);
        return node;
    }
    
    
    /** Adds a Node, with its ID and label being the current node count plus 1.
     * @see com.touchgraph.graphlayout.Node
     */
    public Node addInvisibleNode() throws TGException {
        String id = getNewNodeId();
        return addInvisibleNode(id,null);
    }
    /** Adds a Node, provided its ID and label.
     * @see com.touchgraph.graphlayout.Node
     */
    public Node addInvisibleNode( String id, String label ) throws TGException {
        Node node;
        if (label==null) 
            node = new InvisibleNode(id);
        else
            node = new InvisibleNode(id, label);

        tgpanel.updateDrawPos(node); // The addNode() call should probably take a position, this just sets it at 0,0
        tgpanel.addNode(node);
        return node;
    }
    
    public Edge addInheritanceEdge( Node f, Node t, int tension ) {
    	Edge e = new InheritanceEdge(f,t,tension);
    	tgpanel.addEdge(e);
    	return e;
    }
    public Edge addSimpleEdge( Node f, Node t, int tension ) {
    	Edge e = new SimpleEdge(f,t,tension);
    	tgpanel.addEdge(e);
    	return e;
    }
    
    public Edge addSplineEnabledClassEdge( Node f, Node t, int tension ) {
    	Edge e = new SplineEnabledEdge(f,t,tension);
    	tgpanel.addEdge(e);
    	return e;
    }
    
    public String getNewNodeId(){
    	int i = tgpanel.getNodeCount()+1;
    	String id = String.valueOf(i);
    	while(tgpanel.findNode(id) != null)
    	{
    		id = String.valueOf(i++);
    	}
    	return id;
    }
    
    /**
     * retreives another edge for this node
     * @param node
     * @param edge
     * @return
     */
    public Edge findFirstOtherEdge(Node node, Edge edge){
		Edge result= null;
		Iterator it = node.getEdges();
		while(it.hasNext()){
			result = (Edge)it.next();
			if (result != edge) return result;
		}
			
		return null;	
			
	}

    /** structure used to cache the distance calculus */
	private Hashtable distHash;
	private ImmutableGraphEltSet previousGES;
	private Node previousSelectedNode; 
	public int calculateDistanceToSelection(Node node){
		boolean needcalcul = false;
		if(distHash == null) needcalcul = true;
		if(previousSelectedNode != tgpanel.getSelect()) needcalcul = true;
		if(previousGES != tgpanel.getGES()) needcalcul = true;
		if(needcalcul){
			previousGES = tgpanel.getGES();
			previousSelectedNode = tgpanel.getSelect();
			distHash = GESUtils.calculateDistances(
					(GraphEltSet) previousGES,
					previousSelectedNode,
					LocalityUtils.INFINITE_LOCALITY_RADIUS);
		}
		Integer result =(Integer) distHash.get(node);
		if(result != null) return result.intValue();
		else return -1; // should never occur ...
	}
}
