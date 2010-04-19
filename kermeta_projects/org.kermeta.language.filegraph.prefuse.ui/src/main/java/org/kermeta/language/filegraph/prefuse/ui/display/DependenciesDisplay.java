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

import java.util.List;

import org.kermeta.language.filegraph.prefuse.action.layout.AggregateLayout;
import org.kermeta.language.filegraph.prefuse.data.Aggregate;

import prefuse.Constants;
import prefuse.Display;
import prefuse.Visualization;
import prefuse.action.Action;
import prefuse.action.ActionList;
import prefuse.action.RepaintAction;
import prefuse.action.assignment.ColorAction;
import prefuse.action.assignment.DataColorAction;
import prefuse.action.layout.graph.ForceDirectedLayout;
import prefuse.activity.Activity;
import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.EdgeRenderer;
import prefuse.render.LabelRenderer;
import prefuse.render.PolygonRenderer;
import prefuse.render.Renderer;
import prefuse.util.ColorLib;
import prefuse.util.force.DragForce;
import prefuse.util.force.Force;
import prefuse.util.force.ForceSimulator;
import prefuse.util.force.NBodyForce;
import prefuse.util.force.RungeKuttaIntegrator;
import prefuse.util.force.SpringForce;
import prefuse.util.ui.JValueSlider;
import prefuse.visual.AggregateItem;
import prefuse.visual.AggregateTable;
import prefuse.visual.VisualItem;

@SuppressWarnings("serial")
public class DependenciesDisplay extends Display {

    public static final String GRAPH = "graph";
    public static final String NODES = "graph.nodes";
    public static final String EDGES = "graph.edges";
    public static final String AGGR = "aggregates";
    public static final String NODE_LABEL = "label";
    public static final String AGGR_COLORID = "color.id";
    
    public static final int NB_AGGREGATE_COLOR = 7;
    
	public DependenciesDisplay(Graph graph, List<Aggregate> aggregates) {
		// initialize the display content (m_viz)
		super(new Visualization());
		
		// add the data to the visu
		m_vis.addGraph(GRAPH, graph);
		m_vis.setInteractive(EDGES, null, false);
		
		m_vis.setValue(DependenciesDisplay.NODES, null, VisualItem.SHAPE,
                new Integer(Constants.SHAPE_ELLIPSE)); 
		
		 AggregateTable at = m_vis.addAggregates(DependenciesDisplay.AGGR);
	     at.addColumn(VisualItem.POLYGON, float[].class);
	     at.addColumn(DependenciesDisplay.AGGR_COLORID, int.class); 
	     
	     // convert aggregate data into VisualItem
	     for(Aggregate aggregate : aggregates){
			AggregateItem aitem = (AggregateItem)at.addItem();	
			// compute the color depending on the number of element in the cycle
			aitem.setInt(DependenciesDisplay.AGGR_COLORID, aggregate.getColorid());
            for ( Node node : aggregate.getAggregatedNodes()  ) {
            	aitem.addItem(m_vis.getVisualItem(DependenciesDisplay.NODES, node));
            }
		}
	        
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
		DataColorAction itemCol = new DataColorAction(NODES, NODE_LABEL,
				Constants.NOMINAL, VisualItem.FILLCOLOR, colors);
		// the label text is dark
		ColorAction textCol = new ColorAction(NODES,
				VisualItem.TEXTCOLOR, ColorLib.gray(0));
		// the edges are light gray
		ColorAction edgeCol = new ColorAction(EDGES,
				VisualItem.STROKECOLOR, ColorLib.gray(150));
		ColorAction edgeArrCol = new ColorAction(EDGES,
				VisualItem.FILLCOLOR, ColorLib.gray(150));
		
		ColorAction aStroke = new ColorAction(AGGR, VisualItem.STROKECOLOR);
        aStroke.setDefaultColor(ColorLib.gray(200));
        aStroke.add("_hover", ColorLib.rgb(255,100,100));        
        int[] palette = new int[] { // colors id for the Aggregates
                ColorLib.rgba(255,200,200,150),
                ColorLib.rgba(200,255,200,150),
                ColorLib.rgba(219,219,112,150),
                ColorLib.rgba(153,204,50,150),
                ColorLib.rgba(234,173,234,150),
                ColorLib.rgba(200,200,255,150),
                ColorLib.rgba(255,99,71,150)
            };
         ColorAction aFill = new DataColorAction(AGGR, AGGR_COLORID,
                    Constants.NOMINAL, VisualItem.FILLCOLOR, palette);
        
        
		// list those color actions
		ActionList colActions = new ActionList();
		colActions.add(itemCol);
		colActions.add(textCol);
		colActions.add(edgeCol);
		colActions.add(edgeArrCol);
		colActions.add(aStroke);
		colActions.add(aFill);
		
		// add a dynamic display of items
		ActionList dynLayout = new ActionList(Activity.INFINITY);
		// adapt the force
		ForceSimulator fsim = new ForceSimulator(new RungeKuttaIntegrator());

		float gravConstant = -10f; //default: -1f
		float minDistance = -1f;
		float theta = 0.9f;

		float drag = 0.01f;
		float springCoeff = 1E-4f;  
		float defaultLength = 200f;  //default: 50f

		fsim.addForce(new NBodyForce(gravConstant, minDistance, theta));
		fsim.addForce(new DragForce(drag));
		fsim.addForce(new SpringForce(springCoeff, defaultLength));
		    
		ForceDirectedLayout fdl = new ForceDirectedLayout(GRAPH, fsim,true);
		dynLayout.add(fdl);
		dynLayout.add(new AggregateLayout(AGGR));
		dynLayout.add(new RepaintAction());
		
		//setDoubleBuffered(true);
		m_vis.putAction("color", colActions);
		m_vis.putAction("layout", dynLayout);
			
        
	}
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean aFlag) {
		// TODO Auto-generated method stub
		super.setVisible(aFlag);
	}

	public void run() {
		colorActivity = m_vis.run("color");
		layoutActivity = m_vis.run("layout");
		
	}
	
	Activity colorActivity;
	Activity layoutActivity;
	
	public void stopAnimation(){
		colorActivity.cancel();
		layoutActivity.cancel();
	}
}
