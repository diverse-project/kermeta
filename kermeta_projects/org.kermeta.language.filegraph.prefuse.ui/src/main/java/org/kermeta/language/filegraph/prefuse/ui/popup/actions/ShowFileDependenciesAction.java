package org.kermeta.language.filegraph.prefuse.ui.popup.actions;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.language.filegraph.CycleGraph;
import org.kermeta.language.filegraph.GraphNode;
import org.kermeta.language.filegraph.prefuse.controls.AggregateDragControl;
import org.kermeta.language.filegraph.prefuse.data.Aggregate;
import org.kermeta.language.filegraph.prefuse.data.FileGraphToPrefuseConverter;
import org.kermeta.language.filegraph.prefuse.ui.Activator;
import org.kermeta.language.filegraph.prefuse.ui.display.DependenciesDisplay;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import org.kermeta.language.filegraph.IFileGraphService;
//import filegraph.mockup.FileGraphService;

import prefuse.controls.PanControl;
import prefuse.controls.ZoomControl;
import prefuse.data.Graph;
import prefuse.data.Node;


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
					URI uri = URI.createURI(selectedFile.toString());
					
					URI.createPlatformResourceURI(selectedFile.getProject().getName()+"/"+selectedFile.getProjectRelativePath().toString(), true);
					// Resolving the filePath
					URIConverter converter = new ExtensibleURIConverterImpl();
					uri = converter.normalize(uri);
					selectedFile.getProjectRelativePath();
					File f1 = new File(URI.createPlatformResourceURI("/"+selectedFile.getProject().getName()+"/"+selectedFile.getProjectRelativePath().toString(), true).toString()		);
					File f2 = new File(selectedFile.getLocationURI().toString().replace("file:", "/")	);
					File f3 = new File(selectedFile.getLocationURI().toString()	);
					new File(selectedFile.getName().toString()	);
					
					URI u1 = URI.createPlatformResourceURI("/"+selectedFile.getProject().getName()+"/"+selectedFile.getProjectRelativePath().toString(), true);
					converter.exists(u1, null);
					//f1.to
					
					//f1.exists()
					CycleGraph cycleGraph = fileGraphService.getCycleGraph(u1);
		 	 		
					// TEST use mockup
			//		CycleGraph cycleGraph = new filegraph.mockup.FileGraphService().getCycleGraph(selectedFile.toString());
					
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
			    /*    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        display.stopAnimation(); */
					
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
	
	
}
