/*$Id: $
* Project : org.kermeta.language.filegraph.prefuse.ui
* File : 	DependenciesDisplay.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.language.filegraph.prefuse.ui.display;

import prefuse.Constants;
import prefuse.Display;
import prefuse.Visualization;
import prefuse.action.ActionList;
import prefuse.action.RepaintAction;
import prefuse.action.assignment.ColorAction;
import prefuse.action.assignment.DataColorAction;
import prefuse.action.layout.graph.ForceDirectedLayout;
import prefuse.activity.Activity;
import prefuse.data.Graph;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.EdgeRenderer;
import prefuse.render.LabelRenderer;
import prefuse.render.PolygonRenderer;
import prefuse.render.Renderer;
import prefuse.util.ColorLib;
import prefuse.visual.AggregateTable;
import prefuse.visual.VisualItem;

@SuppressWarnings("serial")
public class DependenciesDisplay extends Display {

    public static final String GRAPH = "graph";
    public static final String NODES = "graph.nodes";
    public static final String EDGES = "graph.edges";
    public static final String AGGR = "aggregates";
    public static final String NODELABEL = "label";
    
	public DependenciesDisplay(Graph graph) {
		// initialize the display content (m_viz)
		super(new Visualization());
		
		// add the data to the visu
		m_vis.addGraph(GRAPH, graph);
		m_vis.setInteractive(EDGES, null, false);
		
		 AggregateTable at = m_vis.addAggregates(AGGR);
	     at.addColumn(VisualItem.POLYGON, float[].class);
	     at.addColumn("id", int.class);
	     
	    // m_vis.
	        
		//////// Rendering step ///////////
		
		// we display nodes labels (key = "label")
		LabelRenderer labR = new LabelRenderer("label");
		labR.setRoundedCorner(10, 10);
		// draw aggregates as polygons with curved edges
        Renderer polyR = new PolygonRenderer(Constants.POLY_TYPE_CURVE);
        ((PolygonRenderer)polyR).setCurveSlack(0.15f);
       
        EdgeRenderer edgeR = new EdgeRenderer(Constants.EDGE_TYPE_CURVE, Constants.EDGE_ARROW_FORWARD);
        edgeR.setArrowHeadSize(10, 10);
        edgeR.getArrowType();
		
        
        DefaultRendererFactory drf = new DefaultRendererFactory();
        drf.setDefaultRenderer(labR);
        drf.add("ingroup('graph.edges')", edgeR);
        drf.add("ingroup('aggregates')", polyR);
		m_vis.setRendererFactory(drf);
		
		/////// Processing step ///////////
		
		// we use red color for error items
		int[] colors = new int[] {
				ColorLib.rgb(150, 150, 255)
		};
		// we fill up the nodes labels
		DataColorAction itemCol = new DataColorAction("graph.nodes", "label",
				Constants.NOMINAL, VisualItem.FILLCOLOR, colors);
		// the label text is dark
		ColorAction textCol = new ColorAction("graph.nodes",
				VisualItem.TEXTCOLOR, ColorLib.gray(0));
		// the edges are light gray
		ColorAction edgeCol = new ColorAction("graph.edges",
				VisualItem.STROKECOLOR, ColorLib.gray(150));
		ColorAction edgeArrCol = new ColorAction("graph.edges",
				VisualItem.FILLCOLOR, ColorLib.gray(150));
		// list those color actions
		ActionList colActions = new ActionList();
		colActions.add(itemCol);
		colActions.add(textCol);
		colActions.add(edgeCol);
		colActions.add(edgeArrCol);
		
		// add a dynamic display of items
		ActionList dynLayout = new ActionList(Activity.INFINITY);
		dynLayout.add(new ForceDirectedLayout(GRAPH));
		dynLayout.add(new RepaintAction());
		
		m_vis.putAction("color", colActions);
		m_vis.putAction("layout", dynLayout);
		

        
	}
	
	public void run() {
		m_vis.run("color");
		m_vis.run("layout");
	}
}
