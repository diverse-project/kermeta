/* $Id: HistoryManager.java,v 1.2 2006-01-27 19:41:22 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : HistoryManager.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 18 déc. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package com.touchgraph.graphlayout;

import java.util.ArrayList;
/**
 * 
 * @author dvojtise
 * Manages an history of navigated nodes to be able to go back or forward
 */
public class HistoryManager extends ArrayList<Node>{
    
	private static final long serialVersionUID = 1L;
	
	private int currentPosition = -1;
    
    public int maxsize = 20;
    public int minsize = 10;
    
    public void newSelection(Node node){
    	
    	// clear eventual element after the current possition
    	if(hasNext() )
    	{
    		removeRange(currentPosition,size());
    	}
    	// ensure the maxsize doesn't increase too much
    	if(size() > maxsize)
    	{
    		removeRange(0, maxsize - minsize);
    	}
    	// add the node to the end of the list
    	add(node);
    	currentPosition = size() -1;    		
    }
    
    public boolean hasPrevious(){
    	return (currentPosition > 0);
    }
    public boolean hasNext(){
    	return (currentPosition < size() -1);    	
    }
    public Node getPrevious(){
    	if(!hasPrevious()) 
    		if(size() > 0)
    			return (Node)get(0);
    		else
    			return null;
    	currentPosition--;
    	return (Node)get(currentPosition);
    }
    public Node getNext(){
    	if(!hasNext()) return (Node)get(size()-1);
    	currentPosition++;
    	return (Node)get(currentPosition);
    }
}
