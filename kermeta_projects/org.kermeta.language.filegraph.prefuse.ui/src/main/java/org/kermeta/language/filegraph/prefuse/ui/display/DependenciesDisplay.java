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
import prefuse.render.LabelRenderer;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;

@SuppressWarnings("serial")
public class DependenciesDisplay extends Display {
	public DependenciesDisplay(Graph graph) {
		// initialize the display content (m_viz)
		super(new Visualization());
		
		// add the data to the visu
		m_vis.addGraph("graph", graph);
		m_vis.setInteractive("graph.edges", null, false);
		
		//////// Rendering step ///////////
		
		// we display nodes labels (key = "label")
		LabelRenderer labR = new LabelRenderer("label");
		labR.setRoundedCorner(10, 10);
		m_vis.setRendererFactory(new DefaultRendererFactory(labR));
		
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
		// list those color actions
		ActionList colActions = new ActionList();
		colActions.add(itemCol);
		colActions.add(textCol);
		colActions.add(edgeCol);
		
		// add a dynamic display of items
		ActionList dynLayout = new ActionList(Activity.INFINITY);
		dynLayout.add(new ForceDirectedLayout("graph"));
		dynLayout.add(new RepaintAction());
		
		m_vis.putAction("color", colActions);
		m_vis.putAction("layout", dynLayout);
	}
	
	public void run() {
		m_vis.run("color");
		m_vis.run("layout");
	}
}
