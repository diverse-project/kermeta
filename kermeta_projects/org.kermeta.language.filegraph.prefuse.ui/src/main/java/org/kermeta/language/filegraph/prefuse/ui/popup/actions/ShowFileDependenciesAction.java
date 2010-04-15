package org.kermeta.language.filegraph.prefuse.ui.popup.actions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.language.filegraph.CycleGraph;
import org.kermeta.language.filegraph.GraphNode;
import org.kermeta.language.filegraph.IFileGraphService;
import org.kermeta.language.filegraph.SimpleGraph;
import org.kermeta.language.filegraph.prefuse.ui.Activator;
import org.kermeta.language.filegraph.prefuse.ui.display.DependenciesDisplay;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import prefuse.Constants;
import prefuse.Visualization;
import prefuse.controls.DragControl;
import prefuse.controls.PanControl;
import prefuse.controls.ZoomControl;
import prefuse.data.Edge;
import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.visual.AggregateItem;
import prefuse.visual.AggregateTable;
import prefuse.visual.VisualGraph;
import prefuse.visual.VisualItem;


public class ShowFileDependenciesAction implements IObjectActionDelegate {
	

	

	private Shell shell;
	

	private IFile selectedFile;
	
	/**
	 * Constructor for Action1.
	 */
	public ShowFileDependenciesAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		// run in a separate job (for progress status, and smoother UI
		Job job = new Job("Show file dependencies") {
			public IStatus run(IProgressMonitor monitor) {
				
				try {
					// get the service (we expect only one)
					BundleContext context = Activator.getDefault().context;
					ServiceReference ref = context.getServiceReference(IFileGraphService.class.getName());
					IFileGraphService fileGraphService = (IFileGraphService)context.getService(ref);
					
					// computer the graph
					CycleGraph cycleGraph = fileGraphService.getCycleGraph(selectedFile.toString());
					
					// transform the graph for prefuse
					Visualization vis = new Visualization();
					Graph graph = convertToPrefuseGraph(cycleGraph, vis);
					
					// transform cycle into aggregates
					
					// open the view
					DependenciesDisplay display = new DependenciesDisplay(graph, vis);
					// some stuff needed to control graph
			        display.addControlListener(new DragControl());
			        display.addControlListener(new PanControl());
			        display.addControlListener(new ZoomControl());
			        display.setSize(500,500);
			        display.pan(250, 250);
			        //display.setHighQuality(true);
			        
			        // Prefuse Swing window
			        JFrame frame = new JFrame("File dependencies");
			        // we want avoid Eclipse to stop when graph is closed
			        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			        
			        frame.add(display);
			        frame.pack();
			        frame.setVisible(true);
			        
			        // start up the dynamic display
			        display.run();
					
				} finally {
					monitor.done();
				}
				return Status.OK_STATUS;
			}
		};
		//job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.schedule();
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if ( selection instanceof TreeSelection ) {
			TreeSelection treeSelection = (TreeSelection) selection;
			selectedFile = (IFile) treeSelection.getFirstElement();
		}
	}
	protected Graph convertToPrefuseGraph(CycleGraph cycleGraph, Visualization vis){
		// compute the simple graph
		Map<GraphNode, Node> convertedNodes = new HashMap<GraphNode, Node>();
		Graph result = convertToPrefuseGraph((SimpleGraph)cycleGraph, convertedNodes);
		
		VisualGraph vg = vis.addGraph(DependenciesDisplay.GRAPH, result);
        vis.setInteractive(DependenciesDisplay.EDGES, null, false);
        vis.setValue(DependenciesDisplay.NODES, null, VisualItem.SHAPE,
                new Integer(Constants.SHAPE_ELLIPSE)); 
		
		 AggregateTable at = vis.addAggregates(DependenciesDisplay.AGGR);
	     at.addColumn(VisualItem.POLYGON, float[].class);
	     at.addColumn("id", int.class);
		
		//compute the aggregates
	    int i = 1;
	    Iterator nodes = vg.nodes();
		for(List<GraphNode> cycleNodes : cycleGraph.getCycles()){
			AggregateItem aitem = (AggregateItem)at.addItem();
            aitem.setInt("id", i++);
            for ( GraphNode node : cycleNodes  ) {
            	aitem.addItem(vis.getVisualItem(DependenciesDisplay.NODES, convertedNodes.get(node)));
            }
		}
		
		return result;
	}
	
	protected Graph convertToPrefuseGraph(SimpleGraph simpleGraph, Map<GraphNode, Node> convertedNodes){
		Graph result = new Graph(true);
		result.addColumn(DependenciesDisplay.NODELABEL, String.class);
		
		
		// process root
		convertNodeToPrefuse(result, simpleGraph.getRootNode(), convertedNodes);
		
		// for each converted nodes, add the edges
		for(GraphNode fileNode : convertedNodes.keySet()){
			for(GraphNode childNode :fileNode.getDirectReferences()){
				/* Edge edge = */result.addEdge(convertedNodes.get(fileNode), convertedNodes.get(childNode));
				
			}
		}
		
		// add aggregates
		//result.
		
		return result;
	}
	protected void convertNodeToPrefuse(Graph prefuseGraph, GraphNode fileNode, Map<GraphNode, Node> convertedNodes){
		if(!convertedNodes.containsKey(fileNode)){
			Node n = prefuseGraph.addNode();
			n.setString("label", fileNode.getName());
			convertedNodes.put(fileNode, n);
			for(GraphNode childNode :fileNode.getDirectReferences()){
				convertNodeToPrefuse(prefuseGraph, childNode, convertedNodes);
			}
		}		
	}
	
}
