/*$Id: $
* Project : org.kermeta.language.filegraph.prefuse.ui
* File : 	FileGraphView.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 avr. 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.language.filegraph.prefuse.views;

import java.awt.Color;
import java.awt.Panel;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.part.ViewPart;
import org.kermeta.language.filegraph.CycleGraph;
import org.kermeta.language.filegraph.GraphNode;
import org.kermeta.language.filegraph.prefuse.controls.AggregateDragControl;
import org.kermeta.language.filegraph.prefuse.data.Aggregate;
import org.kermeta.language.filegraph.prefuse.data.FileGraphToPrefuseConverter;
import org.kermeta.language.filegraph.prefuse.ui.display.DependenciesDisplay;


import prefuse.Display;
import prefuse.controls.PanControl;
import prefuse.controls.ZoomControl;
import prefuse.data.Graph;
import prefuse.data.Node;


public class FileGraphView extends ViewPart {

	private Composite composite;
	private Shell shell;
	private java.awt.Frame fileGraphViewFrame;
	
	
	public FileGraphView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		composite = new Composite(parent, SWT.EMBEDDED);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout l = new GridLayout(1, true);
		composite.setLayout(l);

		shell = composite.getShell();
		
		startSWTAWT(500);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	
	public void startSWTAWT(int delay){
		fileGraphViewFrame = SWT_AWT.new_Frame(composite);	

		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {}
		
		//java.awt.Color c = new Color(composite.getBackground().getRed(), composite.getBackground().getGreen(), composite.getBackground().getBlue());
		DependenciesDisplay display = getDummyDisplay();
		fileGraphViewFrame.add(display);
		fileGraphViewFrame.pack();
		fileGraphViewFrame.setVisible(true);
		display.run();
		
	}
	
	protected DependenciesDisplay getDummyDisplay(){
		CycleGraph cycleGraph = new filegraph.mockup.FileGraphService().getCycleGraph(URI.createURI("/"));
		
		// transform the graph for prefuse
		Map<GraphNode, Node> convertedNodes = new HashMap<GraphNode, Node>();
		Graph graph = FileGraphToPrefuseConverter.convertToPrefuseGraph(cycleGraph, convertedNodes);
		List<Aggregate> aggregates = FileGraphToPrefuseConverter.convertToAggregates(cycleGraph, convertedNodes);
		
		// open the view
		DependenciesDisplay display = new DependenciesDisplay(graph, aggregates);
		// some stuff needed to control graph
		display.addControlListener(new AggregateDragControl());
        display.addControlListener(new PanControl());
        display.addControlListener(new ZoomControl());
        //display.setSize(500,500);
        display.pan(250, 250);
        return display;
	}
}
