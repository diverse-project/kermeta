/* $Id: KermetaGLPanel.java,v 1.5 2005-12-06 12:43:31 dvojtise Exp $
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
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import com.touchgraph.graphlayout.GLPanel;
import com.touchgraph.graphlayout.LocalityUtils;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGException;
import com.touchgraph.graphlayout.TGLensSet;
import com.touchgraph.graphlayout.TGPanel;
import com.touchgraph.graphlayout.interaction.GLEditUI;
import com.touchgraph.graphlayout.interaction.GLNavigateUI;
import com.touchgraph.graphlayout.interaction.HVScroll;
import com.touchgraph.graphlayout.interaction.LocalityScroll;
import com.touchgraph.graphlayout.interaction.RotateScroll;
import com.touchgraph.graphlayout.interaction.TGUIManager;
import com.touchgraph.graphlayout.interaction.ZoomScroll;

import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.editors.Editor;
import fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener;
import fr.irisa.triskell.kermeta.touchnavigator.TouchNavigatorPlugin;
import fr.irisa.triskell.kermeta.touchnavigator.graphlayout.interaction.KermetaGLNavigateUI;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.Type;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/** KermetaGLPanel contains code for adding scrollbars and interfaces to the TGPanel
  * The "GL" prefix indicates that this class is GraphLayout specific, and
  * will probably need to be rewritten for other applications.
  *
  */
public class KermetaGLPanel extends GLPanel 
							implements KermetaEditorEventListener{


   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Editor previousEditor = null;

	public Editor currentEditor = null;
	
	public BuildKermetaClassGraphThread buildKermetaClassGraphThread;
	
	public TGInheritanceTransformations graphTransform = null;
	
	KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();

	
    
/** Initialize panel, lens, and establish a random graph as a demonstration.
     */
    public void initialize() {
    	
        buildPanel();
        buildLens();
        tgPanel.setLensSet(tgLensSet);
        addUIs();
        TexteditorPlugin.getDefault().registerListener(this);
        
        buildKermetaClassGraphThread = new BuildKermetaClassGraphThread();
        buildKermetaClassGraphThread.start();
        
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
    }

    public void addUIs() {
        tgUIManager = new TGUIManager();
        GLEditUI editUI = new GLEditUI(this);
        GLNavigateUI navigateUI = new KermetaGLNavigateUI(this);
        tgUIManager.addUI(editUI,"Edit");
        tgUIManager.addUI(navigateUI,"Navigate");
        tgUIManager.activate("Navigate");
    }
    
	/** 
	 * Action when a kermetaEditor unit was changed
	 * @see fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener#unitChanged()
	 */
	public void unitGotFocus(Editor editor) {
		// do it in a thread so it will not slow down the opening of the file
		if(editor != previousEditor){
			previousEditor = editor;
			currentEditor = editor;
			System.err.println(editor.getMcunit().getUri());
			buildKermetaClassGraphThread = new BuildKermetaClassGraphThread();
			buildKermetaClassGraphThread.start();
		}
		System.err.println("editor unit: "+editor.getMcunit().getUri());
	}
	
	/**
	 * class used to run the BuildGraph in the background
	 *
	 */
	class BuildKermetaClassGraphThread extends Thread {
		
		public void run() {   
			yield();
			FClassDefinition clasDef = findAClassInUnit();
			if(clasDef == null) return;
			System.err.println(clasDef.getFName());  
			yield();
			
			KermetaGLPanel.this.tgPanel.tgLayout.stopDamper(); // do not damp while building the model
            //KermetaGLPanel.this.tgPanel.tgLayout.resetDamper();
			//KermetaGLPanel.this.tgPanel.tgLayout.stop();
			yield();yield();
			try { 
				this.wait(300); // gives some time to the construction of the tgPanel to finish (the relaxer in particular)
			} catch (InterruptedException e) {
				return;
			}
            
			// make sure no other thread is running
            synchronized (KermetaGLPanel.this.tgPanel.getLocalityUtils()) {
            	//setVisible(false);
            	try {
            		String msg = "Nb nodes(1): "+KermetaGLPanel.this.tgPanel.getNodeCount();
            		System.err.println(msg);
            		KermetaGLPanel.this.tgPanel.clearAll();
            		msg = "Nb nodes(2): "+KermetaGLPanel.this.tgPanel.getNodeCount();
            		System.err.println(msg);
            		new KermetaClassGraphBuilder(tgPanel, clasDef).buildGraph(currentEditor.getMcunit());
                	msg = "Nb nodes(3): "+KermetaGLPanel.this.tgPanel.getNodeCount();
            		System.err.println(msg);
                	
                
	                // find a node
	                
	                
	                
	                
	                //FClassDefinition clasDef = findAClassInUnit();
	                //clasDef = kunit.get_ROOT_TYPE_ClassDefinition(); // return Object all the time
	                System.err.println(KMTHelper.getQualifiedName(clasDef));
	                Collection nodes = tgPanel.getGES().findNodesByLabel(KMTHelper.getQualifiedName(clasDef));
	                Node node= null;
	                if (nodes != null)
	                {
	                	node = (Node)nodes.iterator().next();
	                }
	                if(node != null){
	                	//tgPanel.setLocale(node,2);
	                	tgPanel.setSelect(node);
	                }
	                else
	                	tgPanel.setSelect(tgPanel.getGES().getFirstNode()); //Select first node, so hiding works
	            	
            	} catch ( TGException tge ) {
                    System.err.println(tge.getMessage());
                    tge.printStackTrace(System.err);
                }
                setVisible(true);
            }
            
            /*try {
				this.wait(500);
			} catch (InterruptedException e) {
			}*/
            //KermetaGLPanel.this.tgPanel.tgLayout.start();
            KermetaGLPanel.this.tgPanel.tgLayout.resetDamper();
            yield();
            
    		System.err.println("BuildKermetaClassGraphThread end");
		}
	}
	
	public FClassDefinition findAClassInUnit()
	{
		if(currentEditor == null)
			currentEditor =TexteditorPlugin.getDefault().getEditor();
		if(currentEditor ==null) return null;
        KermetaUnit kunit = currentEditor.getMcunit();
		FClassDefinition result = null;
		
		
		Iterator it = kunit.typeDefs.entrySet().iterator();
		while(it.hasNext() && result == null){
			Entry entry = (Entry)it.next();
			if(entry.getValue() instanceof FClassDefinition)
			{
				result = (FClassDefinition)entry.getValue();
			}
		}
        //result = findAClassInUnitPackage(kunit.rootPackage);
		//result = findAClassInResource(kunit.rootPackage.eResource());
        if (result == null) result = kunit.get_ROOT_TYPE_ClassDefinition();
		return result;
	}
	
	public FClassDefinition findAClassInResource(Resource theResource)
	{
		FClassDefinition result = null;
		Iterator it =theResource.getContents().iterator();
        while(it.hasNext() && (result == null)){
        	Object obj = it.next();
        	if(obj instanceof FClassDefinition) {
        		result = (FClassDefinition)obj;
        	}
        }
        if (result == null) result = TexteditorPlugin.getDefault().getEditor().getMcunit().get_ROOT_TYPE_ClassDefinition();		
        return result;
	}
	
	public FClassDefinition findAClassInUnitPackage(FPackage aPackage)
	{
		if(currentEditor == null)
			currentEditor =TexteditorPlugin.getDefault().getEditor();
        KermetaUnit kunit = currentEditor.getMcunit();
		FClassDefinition result = null;
		Iterator it = aPackage.eContents().iterator();
        while(it.hasNext() && (result == null)){
        	Object obj = it.next();
        	if(obj instanceof FClassDefinition) {
        		// check if this Classdef is really in this Unit
        		FClassDefinition classDef = (FClassDefinition)obj;
        		EObject o;
        		//o.eResource().
        		//if(kunit == classDef.kunit) 
        		result = classDef;
        	}
        }
        if (result == null) 
        { // look into subPackages
        	Iterator itPackage = aPackage.getFNestedPackage().iterator();
        	while(itPackage.hasNext() && (result==null)){
        		result = findAClassInUnitPackage((FPackage)itPackage.next());
        	}
        }
        //if (result == null) result = kunit.get_ROOT_TYPE_ClassDefinition();
		return result;
	}
	/** 
	 * Action when a kermetaEditor selection was changed
	 * @see fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener#selectionChanged()
	 */
	public void selectionChanged() {
		
		
	}

	public void outlineSelectionChanged(FObject fobj) {
		TouchNavigatorPlugin.internalLog.debug("outlineSelectionChanged : "+fobj);		
		followObject(fobj);
	}

	public void textHoverCalled(FObject fobj) {
		TouchNavigatorPlugin.internalLog.debug("textHoverCalled : "+fobj);
		followObject(fobj);
	} 
	
	
	private void followObject(FObject fobj)
	{
		String searchedLabel = null;
		if(fobj == null)return;
		searchedLabel = (String)(new LabelPrettyPrinter()).accept(fobj);
		/*if(fobj instanceof FClass){
			FClass aClass = (FClass)fobj;
			searchedLabel = KMTHelper.getQualifiedName(aClass.getFClassDefinition());
			
		}
		else if(fobj instanceof FClassDefinition){
			searchedLabel = KMTHelper.getQualifiedName((FClassDefinition)fobj);
		}
		else if(fobj instanceof FCallFeature){
			FCallFeature callFeature = (FCallFeature)fobj;
			if (callFeature.getFStaticOperation() != null)
		    {
				TouchNavigatorPlugin.internalLog.debug("callFeature.getFStaticOperation() : "+callFeature.getFStaticOperation());
		    }
			else if (callFeature.getFStaticProperty() != null)
		    {
				TouchNavigatorPlugin.internalLog.debug("callFeature.getFStaticProperty().getFType() : "+callFeature.getFStaticProperty().getFType());
		    }
			//callFeature.getFStaticType().
			//searchedLabel = KMTHelper.getQualifiedName((FCallFeature)fobj);
		}
		else if (fobj instanceof FExpression)
        {
            FExpression fexp = (FExpression)fobj;
            // Find the tag of the FCallFeature definition!
            if (fexp instanceof FCallFeature)
            {
            	FCallFeature callFeature = (FCallFeature)fexp;
            	
                FObject fdef = this.getDefinitionForFCallFeature((FCallFeature)fexp);
                if (fdef != null)
                {
                  //  ftags = kdocPrettyPrint(fdef.getFTag());
                }
            }
            
            if (fexp.getFStaticType() != null) {
                Type t = new SimpleType(fexp.getFStaticType());
                //TexteditorPlugin.pluginLog.info(" * Type -> " + t);
                // return the source code representation or the signature
                // of the element pointed by the cursor
              //  return pp.accept(fobj) + " : " + t + "\n" + ftags;
            }
            
        }*/
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
	 * - FOperation
	 * - FProperty
	 */
	private FObject getDefinitionForFCallFeature(FCallFeature feature)
	{
	    if (feature.getFStaticOperation() != null)
	    {
	        return feature.getFStaticOperation();
	    }
	    if (feature.getFStaticProperty() != null)
	    {
	        return feature.getFStaticProperty();
	    }
	    else // return the CallFeature itself
	    {
	        System.err.println("the definition : " + feature.getFName() + feature);
	        return feature;
	    }
	}

	/**
	 * @return Returns the graphTransform.
	 */
	public TGInheritanceTransformations getGraphTransform() {
		if(graphTransform == null) graphTransform = new TGInheritanceTransformations(tgPanel);
		return graphTransform;
	}
} 
