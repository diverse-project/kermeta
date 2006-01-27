/* $Id: SplineEnabledEdge.java,v 1.2 2006-01-27 19:41:22 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : InheritanceEdge.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

import com.touchgraph.graphlayout.Edge;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGPanel;

public class SplineEnabledEdge extends Edge {

	boolean isSplineEnabled = true;
	
	public SplineEnabledEdge(Node f, Node t) {
		super(f, t);
	}
	
	public SplineEnabledEdge(Node f, Node t, int tension) {
		super(f, t, tension);
	}
	
	public void paint(Graphics g, TGPanel tgPanel) {        
        paintSpline(g,tgPanel);
    }
	
	public void paintSpline(Graphics g, TGPanel tgPanel) {
		TGPanelHelper tgpHelper = new TGPanelHelper(tgPanel);
		if(isFromAClass()){
			Color c = (tgPanel.getMouseOverE()==this) ? MOUSE_OVER_COLOR : col;
			g.setColor(c);
			// draw the spline from this
			// other edge of the spline will not paint themselves
			ArrayList<Point> a = new ArrayList<Point>();
			processForwardEdge(g,tgPanel,a);
			a.add(new Point((int)from.drawx, (int)from.drawy));	
			
			// next edge
			processNext(g, tgPanel, tgpHelper, a, to);
			/*SplineEnabledEdge e = (SplineEnabledEdge)tgpHelper.findFirstOtherEdge(to,this);
			if(e.isForwardInSpline(to))
				e.processForwardEdge(g,tgPanel,a);
			else
				e.processBackwardEdge(g,tgPanel,a);
			Node nextNode = e.getOtherEndpt(to);
			process(g, tgPanel, tgpHelper, a, e, nextNode);
			*/
			//  until we reach a ClassNode
			a = cleanArray(a);
			if(a.size()==6)
			{
				Point[] points = new Point[a.size()];
				for (int i = 0; i< a.size(); i++){
					points[i]=(Point)a.get(i);
					
				}
				System.out.println(a.toString());
				//Point[] points = (Point[]) a.toArray();
				
				Spline spline = new Spline();
				spline.init(points);
				spline.paint(g);
			}
			else{

				System.out.println("size="+a.size()+" "+from.getLabel()+a.toString());
				for (int i = 1; i< a.size(); i++){
					g.drawLine(((Point)(a.get(i-1))).x, ((Point)(a.get(i-1))).y,
							((Point)(a.get(i))).x,
							((Point)(a.get(i))).y);
					
				}
			}
		}
    }

	private void processNext(Graphics g, TGPanel tgPanel, TGPanelHelper tgpHelper, ArrayList<Point> a, Node node) {
		SplineEnabledEdge e2 = (SplineEnabledEdge)tgpHelper.findFirstOtherEdge(node,this);
		Node nextNode = e2.getOtherEndpt(to);
		if(!nextNode.isVisible()) return;
		if(isForwardInSpline(node))
			e2.processForwardEdge(g,tgPanel,a);
		else
			e2.processBackwardEdge(g,tgPanel,a);

		
		// recursive call
		if(! (nextNode instanceof ClassNode))
		{
			e2.processNext(g, tgPanel, tgpHelper, a,  nextNode);
		}
		// else ok done ..
	}
	
	public boolean isForwardInSpline(Node previousNode){
		if(from == previousNode) return true;
		else return false;
	}
	
	public void processForwardEdge(Graphics g, TGPanel tgPanel, ArrayList<Point> pointList){
		if(hasFromConnector()){
			Point connectorPoint = drawFromConnector(g, tgPanel);
			pointList.add(connectorPoint);
		}
		else{
			pointList.add(new Point((int)from.drawx, (int)from.drawy));
		}
		if(from instanceof ClassNode){
			Point intersection= Geom.getIntersectionPoint(new Point((int)to.drawx, (int)to.drawy),
	    			new Rectangle((int)from.drawx-getFrom().getWidth()/2, 
	    					(int)from.drawy-getFrom().getHeight()/2, 
	    					getFrom().getWidth(), 
	    					getFrom().getHeight()));  
			pointList.add(intersection);
		}
		
		if(hasToConnector()){
			Point connectorPoint = drawToConnector(g, tgPanel);
			pointList.add(connectorPoint);
		}
		else{
			pointList.add(new Point((int)to.drawx, (int)to.drawy));
		}
	}
	private void processBackwardEdge(Graphics g, TGPanel tgPanel, ArrayList<Point> pointList){

		if(hasToConnector()){
			Point connectorPoint = drawToConnector(g, tgPanel);
			//pointList.add(connectorPoint);
		}
		else{
			//pointList.add(new Point((int)to.drawx, (int)to.drawy));
		}
		if(from instanceof ClassNode){
			Point intersection= Geom.getIntersectionPoint(new Point((int)to.drawx, (int)to.drawy),
	    			new Rectangle((int)from.drawx-getFrom().getWidth()/2, 
	    					(int)from.drawy-getFrom().getHeight()/2, 
	    					getFrom().getWidth(), 
	    					getFrom().getHeight()));  
			pointList.add(intersection);
		}
		if(hasFromConnector()){
			Point connectorPoint = drawFromConnector(g, tgPanel);
			pointList.add(connectorPoint);
		}
		else{
			pointList.add(new Point((int)from.drawx, (int)from.drawy));
			
		}
	}
	
	public boolean hasFromConnector(){
		return false;
	}
	
	public boolean hasToConnector(){
		return false;
	}
	
	public Point drawToConnector(Graphics g, TGPanel tgPanel){
		return new Point((int)to.drawx, (int)to.drawy);
	}
	
	public Point drawFromConnector(Graphics g, TGPanel tgPanel){
		return new Point((int)from.drawx, (int)from.drawy);
	}
	
	protected boolean isFromAClass(){
		if (from instanceof ClassNode)return true;
		else return false;
	}
	
	public ArrayList<Point> cleanArray(ArrayList<Point> array){
		ArrayList<Point> result = new ArrayList<Point>();
		for(int i = 0; i < array.size(); i++){
			boolean alreadyThere = false;
			for(int j = 0; j < result.size(); j++)
				if(array.get(i).equals(result.get(j))) alreadyThere = true;
			if(!alreadyThere) result.add(array.get(i));
		}
		return result;
	}
}
