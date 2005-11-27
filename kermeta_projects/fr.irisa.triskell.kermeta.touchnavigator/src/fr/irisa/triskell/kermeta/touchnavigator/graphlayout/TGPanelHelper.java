/* $Id: TGPanelHelper.java,v 1.1 2005-11-27 19:46:03 dvojtise Exp $
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

import com.touchgraph.graphlayout.Edge;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGException;
import com.touchgraph.graphlayout.TGPanel;

public class TGPanelHelper {

	public TGPanel tgpanel;
	
	public TGPanelHelper(TGPanel tgPanel2) {
		tgpanel = tgPanel2;
	}
	/** Adds a Node, with its ID and label being the current node count plus 1.
     * @see com.touchgraph.graphlayout.Node
     */
    public Node addClassNode() throws TGException {
        String id = String.valueOf(tgpanel.getNodeCount()+1);
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
        String id = String.valueOf(tgpanel.getNodeCount()+1);
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
}
