/* $Id: EMFModelGLPanel.java,v 1.2 2007-01-24 10:14:54 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : KermetaGLPanel.java
 * License : GPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */

package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.IEditorPart;

import com.touchgraph.graphlayout.GLPanel;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGException;
import com.touchgraph.graphlayout.interaction.GLNavigateUI;
import com.touchgraph.graphlayout.interaction.TGUIManager;

import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
//import fr.irisa.triskell.kermeta.texteditor.editors.KMTEditor;
import fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener;
import fr.irisa.triskell.kermeta.touchnavigator.TouchNavigatorPlugin;
import fr.irisa.triskell.kermeta.touchnavigator.graphlayout.interaction.KermetaGLNavigateUI;
import fr.irisa.triskell.kermeta.touchnavigator.textPresentation.KTNHintHTMLPrettyPrinter;
import fr.irisa.triskell.kermeta.touchnavigator.views.TouchClassView;
import fr.irisa.triskell.kermeta.touchnavigator.views.TouchEMFModelView;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.utils.BooleanLock;

/** KermetaGLPanel contains code for adding scrollbars and interfaces to the TGPanel
  * The "GL" prefix indicates that this class is GraphLayout specific, and
  * will probably need to be rewritten for other applications.
  *
  */
public class EMFModelGLPanel extends GLPanel {


   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public Resource currentResource = null;
	
	/** used to know if we must build the graph when receiving events */
	private boolean isGraphBuiltOnce = false; 
	public BuildEMFModelGraphThread buildEMFModelGraphThread = null;
	
	public TGInheritanceTransformations graphTransform = null;

	private static BooleanLock readyLock = new BooleanLock(true);
	
	// some values used to configure the behavior of the panel
	public boolean updateOnEditorChange = true;
	public boolean updateOnTextHover = true;
	public boolean updateOnOutlineSelection = true;
    public RGB selectedNodeColor = new RGB(255,128,0);
	public RGB distantNodesColor = new RGB(128,255,128);
	
	
	KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
	KTNHintHTMLPrettyPrinter hintpp = new KTNHintHTMLPrettyPrinter();

	
    public EMFModelGLPanel(Color color) {
		super(color);// Create the editing domain with a special command stack.
		
		
	}

/** Initialize panel, lens, and establish a random graph as a demonstration.
     */
    public void initialize() {
    	
        buildPanel();
        buildLens();
        tgPanel.setLensSet(tgLensSet);
        addUIs();
        // TODO register this panel to events
        //TexteditorPlugin.getDefault().registerListener(this);

        TouchNavigatorPlugin.internalLog.debug("EMF Model TouchGraph panel initializing");
     /*   buildKermetaClassGraphThread = new BuildKermetaClassGraphThread();
        buildKermetaClassGraphThread.setName("BuildKermetaClassGraphThread");
        buildKermetaClassGraphThread.start();
       */ 
        graphTransform = new TGInheritanceTransformations (tgPanel);
        /*try {
        	TexteditorPlugin.getDefault().registerListener(this);
        	new KermetaClassGraphBuilder(tgPanel).buildGraph();
        } catch ( TGException tge ) {
            System.err.println(tge.getMessage());
            tge.printStackTrace(System.err);
        }
        tgPanel.setSelect(tgPanel.getGES().getFirstNode()); //Select first node, so hiding works
        setVisible(true);*/
        TouchNavigatorPlugin.internalLog.debug("EMF Model TouchGraph panel initialized");
    }

    public void addUIs() {
        tgUIManager = new TGUIManager();
       // GLEditUI editUI = new GLEditUI(this);
        GLNavigateUI navigateUI = new GLNavigateUI(this);
       // tgUIManager.addUI(editUI,"Edit");
        tgUIManager.addUI(navigateUI,"Navigate");
        tgUIManager.activate("Navigate");
    }
    public void loadGraph(ResourceSet resSet, Resource res){
    	this.currentResource = res;
    	buildEMFModelGraphThread = new BuildEMFModelGraphThread();
		System.err.println("Building EMF Model graph will start");
		buildEMFModelGraphThread.resource = res;
		buildEMFModelGraphThread.resourceSet = resSet;
		buildEMFModelGraphThread.start();
    }
	/** 
	 * Action when a kermetaEditor unit was changed
	 * @see fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener#unitChanged()
	 */
/*	public void unitGotFocus(Editor editor) {
		// do it in a thread so it will not slow down the opening of the file
		boolean doIt = false;
		if(editor != null){
			if(previousUnit != editor.getMcunit())
			{
				previousUnit = editor.getMcunit();
				doIt = true;
			}
		}
		if(editor != previousEditor ){
			doIt = true;
		}
		if(doIt){
			previousEditor = editor;			
			currentEditor = editor;
			// 
			if (!updateOnEditorChange) // do not update ... 
				return; 
			System.err.println("unitGotFocus: " + editor.getMcunit().getUri());
			if(buildKermetaClassGraphThread !=  null){
				
				try {
					buildKermetaClassGraphThread.stopBuild();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//buildKermetaClassGraphThread = new BuildKermetaClassGraphThread();
			}
			
			buildKermetaClassGraphThread = new BuildKermetaClassGraphThread();
			System.err.println("unitGotFocus: start thread" +editor);
			
			buildKermetaClassGraphThread.start();
		}
		else System.err.println("same editor unit and same unit: "+editor.getMcunit().getUri());
		System.err.println("editor unit: "+editor.getMcunit().getUri());
	}
	*/
	/** go back in the history */
	public void goBack(){
		if(tgPanel.history.hasPrevious()){
			try {
				Node node = tgPanel.history.getPrevious();
				tgPanel.setLocaleInHistory(node,2);
				tgPanel.setSelect(node);
			} catch (TGException e) {
				//e.printStackTrace();
			}
			//tgPanel.setSelectInHistory(tgPanel.history.getPrevious());
		}
	}
	
	/** go forward in the history */
	public void goForward(){
		if(tgPanel.history.hasNext()){
			try {
				Node node = tgPanel.history.getNext();
				tgPanel.setLocaleInHistory(node,2);
				tgPanel.setSelect(node);
			} catch (TGException e) {
				//e.printStackTrace();
			}
		}
	}
	
	/**
	 * class used to run the BuildGraph in the background
	 *
	 */
	class BuildEMFModelGraphThread extends Thread {
		

		private EMFModelGraphBuilder emGraphBuilder; 
		private boolean mustStop =  false;
		
		public ResourceSet resourceSet;
		public Resource resource;
		
		synchronized public void stopBuild() throws InterruptedException{
			mustStop = true;
			if(emGraphBuilder != null)
				emGraphBuilder.mustStop = true;
			//readyLock.setValue(true);
			 try {
				 System.err.println("about to wait for readyLock to be true");
			      readyLock.waitUntilTrue(0); // 0 - wait forever
			      
			      
			      System.err.println("readyLock is now true");
		    } catch (InterruptedException x) {
		    	System.err.println("interrupted while waiting for readyLock " + "to become true");
		    }
			/*synchronized (building){
				if(building.booleanValue()){
					mustStop = true;
					kcGraphBuilder.mustStop = true;
					System.err.println("stopBuild waiting");
        			
					wait(2000);
					yield();
				}
				System.err.println("stopBuild go");
			}*/
		}
		public void run() { 
			try {
				TouchEMFModelView.readyLock.waitUntilTrue(2000);
			} catch (InterruptedException e1) {}
			TouchNavigatorPlugin.internalLog.debug("BuildEMFModelGraphThread start");
			isGraphBuiltOnce = true;
			
			yield();yield();yield();yield();
			readyLock.setValue(false);
			mustStop = false;
			EMFModelGLPanel.this.tgPanel.getLocalityUtils().fastFinishAnimation();
			yield();yield();yield();yield(); //this seems important  here
			yield();yield();yield();yield();
			yield();yield();yield();yield();
			yield();yield();yield();yield();
			yield();yield();yield();yield();
			
			
			
			EMFModelGLPanel.this.tgPanel.tgLayout.stopDamper(); // do not damp while building the model
            //KermetaGLPanel.this.tgPanel.tgLayout.resetDamper();
			//KermetaGLPanel.this.tgPanel.tgLayout.stop();
			yield();yield();yield();yield();
			yield();yield();yield();yield();
			yield();yield();yield();yield();
			yield();yield();yield();yield();
			

			TouchNavigatorPlugin.internalLog.debug("BuildKermetaClassGraphThread start3");
			// make sure no other thread of touchgrapch is running
            //synchronized (KermetaGLPanel.this.tgPanel.getLocalityUtils()) {
            	//setVisible(false);
            	try {
            		//String msg = "Nb nodes(1): "+KermetaGLPanel.this.tgPanel.getNodeCount();
            		//System.err.println(msg);
            		EMFModelGLPanel.this.tgPanel.clearAll();
                    EMFModelGLPanel.this.tgPanel.tgLayout.resetDamper();
        			yield();yield();yield();yield();
            		//msg = "Nb nodes(2): "+KermetaGLPanel.this.tgPanel.getNodeCount();
            		//System.err.println(msg);
        			emGraphBuilder = new EMFModelGraphBuilder(tgPanel, resource);
            		//System.err.println("kcGraphBuilder = "+kcGraphBuilder);
            		//System.err.println("currentEditor = "+currentEditor);
        			emGraphBuilder.buildGraph();
                	String msg = "Nb nodes(3): "+EMFModelGLPanel.this.tgPanel.getNodeCount();
                	TouchNavigatorPlugin.internalLog.debug(msg);
                	
            		if (mustStop){ 
            			System.err.println("BuildKermetaClassGraphThread stopped by muststop");
            			readyLock.setValue(true);
            			/*synchronized (building){
            				building = Boolean.FALSE;
            				building.notifyAll();
            			}*/
            			return;
            		}
                
	                // find a node
	                
	                
	                
	                
	                tgPanel.setSelect(tgPanel.getGES().getFirstNode()); //Select first node, so hiding works
	                
	            	
            	} catch ( TGException tge ) {
                    System.err.println(tge.getMessage());
                    tge.printStackTrace(System.err);
                }
                setVisible(true);
                // notifyAll();
            //}
            
            
            //KermetaGLPanel.this.tgPanel.tgLayout.stopDamper(); // do not damp while building the model
            //yield();
           /* try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}*/
            /*try {
				this.wait(500);
			} catch (InterruptedException e) {
			}*/
            //KermetaGLPanel.this.tgPanel.tgLayout.start();
            EMFModelGLPanel.this.tgPanel.tgLayout.resetDamper();
            yield();

        	tgPanel.setSelect(tgPanel.getSelect());
            
            TouchNavigatorPlugin.internalLog.debug("BuildEMFModelGraphThread end");
    		/*synchronized (building){
				building = Boolean.FALSE;
				building.notify();
			}*/
    		readyLock.setValue(true);
			//notifyAll();
    		//System.err.println("BuildKermetaClassGraphThread has notified");
    		
		}
	}
	
	/*public ClassDefinition findAClassInUnit()
	{
		if(currentEditor == null){
			currentEditor =TexteditorPlugin.getDefault().getEditor();
			TouchNavigatorPlugin.internalLog.debug(" findAClassInUnit setting currentEditor to "+currentEditor);
		}
		if(currentEditor ==null) return null;
        KermetaUnit kunit = currentEditor.getMcunit();
		ClassDefinition result = null;
		
		
		Iterator it = kunit.typeDefs.entrySet().iterator();
		while(it.hasNext() && result == null){
			Entry entry = (Entry)it.next();
			if(entry.getValue() instanceof ClassDefinition)
			{
				result = (ClassDefinition)entry.getValue();
			}
		}
        //result = findAClassInUnitPackage(kunit.rootPackage);
		//result = findAClassInResource(kunit.rootPackage.eResource());
        if (result == null) result = kunit.get_ROOT_TYPE_ClassDefinition();
		return result;
	}*/
	
	public EObject findAnEObjectInResource(Resource theResource)
	{
		EObject result = null;
		Iterator it =theResource.getContents().iterator();
        while(it.hasNext() && (result == null)){
        	Object obj = it.next();
        	if(obj instanceof EObject) {
        		result = (EObject)obj;
        	}
        }
        return result;
	}
	
	/*public ClassDefinition findAClassInUnitPackage(Package aPackage)
	{
		if(currentEditor == null){
			currentEditor =TexteditorPlugin.getDefault().getEditor();
			System.err.println(" findAClassInUnitPackage setting currentEditor to "+currentEditor);
		}
      //  KermetaUnit kunit = currentEditor.getMcunit();
		ClassDefinition result = null;
		Iterator it = aPackage.eContents().iterator();
        while(it.hasNext() && (result == null)){
        	Object obj = it.next();
        	if(obj instanceof ClassDefinition) {
        		// check if this Classdef is really in this Unit
        		ClassDefinition classDef = (ClassDefinition)obj;
        	//	EObject o;
        		//o.eResource().
        		//if(kunit == classDef.kunit) 
        		result = classDef;
        	}
        }
        if (result == null) 
        { // look into subPackages
        	Iterator itPackage = aPackage.getNestedPackage().iterator();
        	while(itPackage.hasNext() && (result==null)){
        		result = findAClassInUnitPackage((Package)itPackage.next());
        	}
        }
        //if (result == null) result = kunit.get_ROOT_TYPE_ClassDefinition();
		return result;
	}*/
	/** 
	 * Action when a kermetaEditor selection was changed
	 * @see fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener#selectionChanged()
	 */
/*	public void selectionChanged() {
		
		
	}*/

/*	public void outlineSelectionChanged(fr.irisa.triskell.kermeta.language.structure.Object fobj) {
		if (!isGraphBuiltOnce && buildEMFModelGraphThread == null){
			//  build it 
			buildEMFModelGraphThread = new BuildEMFModelGraphThread();			
			buildEMFModelGraphThread.start();
		}
		if(!updateOnOutlineSelection) return;
		TouchNavigatorPlugin.internalLog.debug("outlineSelectionChanged : "+fobj);		
		followObject(fobj);
	}*/

/*	public void textHoverCalled(fr.irisa.triskell.kermeta.language.structure.Object fobj) {
		if (!isGraphBuiltOnce && buildEMFModelGraphThread == null){
			//  build it 
			buildEMFModelGraphThread = new BuildEMFModelGraphThread();			
			buildEMFModelGraphThread.start();
		}
		if(!updateOnTextHover) return;
		TouchNavigatorPlugin.internalLog.debug("textHoverCalled : "+fobj);
		followObject(fobj);
	}*/ 
	
	
	private void followObject(EObject fobj)
	{
		String searchedLabel = null;
		if(fobj == null)return;
		searchedLabel = (String)(new LabelPrettyPrinter()).accept(fobj);
		
		if(searchedLabel !=null){
			TouchNavigatorPlugin.internalLog.debug("Looking for Node named "+searchedLabel);
			Collection nodes = tgPanel.findNodesByLabel(searchedLabel);
	        Node node= null;
	        if (nodes != null)
	        {
	        	node = (Node)nodes.iterator().next();
	        }
	        if(node != null){
	        	try {
					tgPanel.setLocale(node,2);
				} catch (TGException e) {
					e.printStackTrace();
				}
	        	tgPanel.setSelect(node);
	        }
		}
	}
	
	/**
	 * Get the definition of the CallFEature :
	 * - FEnumeration
	 * - FClass <- FTypeLiteral ?
	 * - Operation
	 * - FProperty
	 */
	/*private fr.irisa.triskell.kermeta.language.structure.Object getDefinitionForCallFeature(CallFeature feature)
	{
	    if (feature.getStaticOperation() != null)
	    {
	        return feature.getStaticOperation();
	    }
	    if (feature.getStaticProperty() != null)
	    {
	        return feature.getStaticProperty();
	    }
	    else // return the CallFeature itself
	    {
	        System.err.println("the definition : " + feature.getName() + feature);
	        return feature;
	    }
	}*/

	
	public void refresh(){
		this.tgPanel.updateNodeColor();
		this.tgPanel.repaint();		
	}
	/**
	 * @return Returns the graphTransform.
	 */
	public TGInheritanceTransformations getGraphTransform() {
		if(graphTransform == null) graphTransform = new TGInheritanceTransformations(tgPanel);
		return graphTransform;
	}

	public String getHint(ClassNode n) {
		String nodeName = n.getLabel();
		// TODO must find a better way to calculate the hint ...
		return nodeName;
	}

	public void selectFirstRootElement() {
		followObject((EObject)currentResource.getContents().get(0));
		
	}
} 
