/* $Id: EMFModelGraphBuilder.java,v 1.2 2007-04-27 17:51:10 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : KermetaClassGraphBuilder.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 1 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.touchgraph.graphlayout.Edge;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGException;
import com.touchgraph.graphlayout.TGPanel;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.touchnavigator.TouchNavigatorPlugin;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

public class EMFModelGraphBuilder extends KermetaOptimizedVisitor{
	
	protected TGPanel tgPanel; 
	//protected ClassDefinition startingClass;
	
	public boolean mustStop = false;
	
	
	protected TGPanelHelper tgpHelper;
	
	protected Resource resource;
	
    protected ModelGraphMapping modelGraphMapping = new ModelGraphMapping();
        
	
    final static public Logger internalLog = LogConfigurationHelper.getLogger("EMFModelGraphBuilder");
	
	
	public EMFModelGraphBuilder(TGPanel newtgPanel, Resource res) {
		tgPanel = newtgPanel;
		tgpHelper = new TGPanelHelper(tgPanel);
		resource = res;
		//startingClass = theStartingClass;
	}

	public void buildGraph() throws TGException
	{
		if(this.modelGraphMapping.getObjects().size() != 0){
			TouchNavigatorPlugin.internalLog.debug(" update of previous graph");
			updateGraph();			
		}
		else fullBuildGraph();
	}
	
	
	public void fullBuildGraph() throws TGException
	{
	
		Node n1= null;
		mustStop =  false;
		EObject firstEObject = (EObject)resource.getContents().get(0);
		TreeIterator it = resource.getAllContents();
		// foreach element in the resource
		while(it.hasNext()){
			// create a node 
			// add it in the trace
			Object o = it.next();
			if(o instanceof EObject){
				n1 = createEObjectNode((EObject)o);
				if(o == firstEObject){tgPanel.setLocale(n1,2);}
			}
		}
		Iterator<EObject> it2 = modelGraphMapping.getObjects().iterator();
		// foreach elements in the resource
		while(it2.hasNext()){
			// create the links
			EObject o = it2.next();
			createEObjectLinks(o);
		}
		
		/*Node n1= tgPanel.addNode();
        n1.setType(0);
        for ( int i=0; i<249; i++ ) {
            Node r = tgPanel.getGES().getRandomNode();
            Node n = tgPanel.addNode();
            n.setType(0);
            if (tgPanel.findEdge(r,n)==null) tgPanel.addEdge(r,n,Edge.DEFAULT_LENGTH);
            if (i%2==0) {
                r = tgPanel.getGES().getRandomNode();
                if (tgPanel.findEdge(r,n)==null) tgPanel.addEdge(r,n,Edge.DEFAULT_LENGTH);
            }
        }*/
        if(n1 !=  null) {
        	tgPanel.setLocale(n1,2);
        	tgPanel.getSelect();
        	tgPanel.setSelect(n1);
        }
		
	}
	
	public void updateGraph() throws TGException
	{

		mustStop =  false;
		try {
			// makes sure we reload the resource
			resource.unload();
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fullBuildGraph();
		// removes all Objects that are no longer in the resource		
		//TreeSet<EObject> removedObjects = new TreeSet<EObject>();
		EList removedObjects = new BasicEList();
			// for each object in the graph try to find it in the resource
		Iterator<EObject> existingObjIt = modelGraphMapping.getObjects().iterator();
		while(existingObjIt.hasNext()){
			EObject obj = existingObjIt.next();
			if(!doesResouceKnowAbout(obj)){
				removedObjects.add(obj);
				TouchNavigatorPlugin.internalLog.debug("Object " + obj + " marked to be removed ");
			}
		}
		TouchNavigatorPlugin.internalLog.debug(removedObjects.size() + " objects has been marked to be removed (from " +modelGraphMapping.getObjects().size() +")");
		for(Object removedObj : removedObjects ){
			Node n = modelGraphMapping.getObjectNode((EObject)removedObj);
			tgPanel.deleteNode(n);
			// TODO remove from the mapping
		
		}
		// add or update any Object other object
		
		tgPanel.setLocale((Node)tgPanel.getAllNodes().next(),2);
	}
	
	/**
	 * 
	 * @param searchedEObject
	 * @return true if we can retreive this Object from the resource
	 */
	public boolean doesResouceKnowAbout(EObject searchedEObject){
		TreeIterator it = resource.getAllContents();
		// foreach element in the resource
		while(it.hasNext()){
			EObject o = (EObject)it.next();
			if(o == searchedEObject){
				return true;
			}
			if(EcoreUtil.getID(o) != null && EcoreUtil.getID(o)==EcoreUtil.getID(searchedEObject)){
				return true;
			}
			if(EcoreUtil.equals(o, searchedEObject)){
				return true;
			}
			//searchedEObject.toString();
			if(searchedEObject.equals(o)) 
				return true;
		}
		return false;
	}
	
	public Node createEObjectNode(EObject eobj){
		Node n1;
		try {
			// look for an existing one
			n1 = modelGraphMapping.getObjectNode(eobj);
			if(n1 == null) {
				n1 = tgpHelper.addClassNode();			
				modelGraphMapping.addObjectNode(eobj, n1);
			}
			// search for an eventual attrbute "name"
			String label=getName(eobj);			
			label+= " : "+ eobj.eClass().getName();
			n1.setLabel(label);
			n1.setType(Node.TYPE_RECTANGLE);
			/*if(startingClass.getFName().compareTo(theType.getFName())==0)
			{	// select this node for the animation
				tgPanel.setLocale(n1,2);
				tgPanel.getSelect()
				tgPanel.setSelect(n1);
			}*/
		} catch (TGException e) {
			throw new Error("TouchGraph INTERNAL ERROR : visiting a EObject", e);
		}
	    return n1;
	}
	/** return the name (if available) */
	public static String getName(EObject eobj){
		String result = "";
		Iterator it = eobj.eClass().getEAllAttributes().iterator();
		while(it.hasNext()){
			EAttribute eatt = (EAttribute)it.next();
			if(eatt.getName().equals("name")){
				Object name = eobj.eGet(eatt);
				result = (String)name;
			}
		}
		return result;
	}
	public void createEObjectLinks(EObject eobj) throws TGException{
		Node n1;
		n1 = modelGraphMapping.getObjectNode(eobj);
		if(n1 == null) {
			n1 = createEObjectNode(eobj);
		}
		Iterator it = eobj.eClass().getEAllReferences().iterator();
		while(it.hasNext()){
			EReference eref = (EReference)it.next();
			Object otarget = eobj.eGet(eref);
			if(otarget instanceof EList){
				EList list = (EList)otarget;
				Iterator it2 = list.iterator();
				while(it2.hasNext()){
					EObject target = (EObject)it2.next();
					if(target != null){
						linkEObjects(eobj, n1, eref, target);
					}
				}
			}
			else{
				EObject target = (EObject)eobj.eGet(eref);
				if(target != null){
					linkEObjects(eobj, n1, eref, target);
				}
			}
		}
	}
	protected void linkEObjects(EObject source, Node n1, EReference eref, EObject target) throws TGException{
		if(eref.isDerived()) return; // ignore derived features in the graph
		Node n2;
		n2 = modelGraphMapping.getObjectNode(target);
		if(n2 == null) {
			n2 = createEObjectNode(target);
		}
		
		Node propertyNode1 = modelGraphMapping.getFeatureNode(source, eref, target);
		if(propertyNode1 == null){
			propertyNode1 = createLabelNodeForERef(n2, eref);
			modelGraphMapping.addFeatureNode(source, eref, target, propertyNode1);			
		}
		else if(!eref.isUnique()){
			TouchNavigatorPlugin.internalLog.warn("non unique EReference not correctly displayed ... specific code not implemented ... ");
		}
		
		Node propertyNode2;
		// Deal with the other end
		if(eref.getEOpposite()!= null){
			propertyNode2 = modelGraphMapping.getFeatureNode(target, eref.getEOpposite(), source);
			if(propertyNode2 == null){
				propertyNode2 = createLabelNodeForERef(n1, eref.getEOpposite());
				modelGraphMapping.addFeatureNode(target, eref.getEOpposite(), source, propertyNode2);
			}
		}
		else{
			// if no opposite
			propertyNode2 = tgpHelper.addInvisibleNode();
			propertyNode2.setLabel("ghost"); // ghost node because it is not navigable this way
			propertyNode2.setType(Node.TYPE_ROUNDRECT);
			propertyNode2.setGhostNode(true);
			//tgpHelper.addSimpleEdge(propertyNode2,propertyNode1,Edge.DEFAULT_LENGTH);
			tgpHelper.addSimpleEdge(propertyNode2,n1,Edge.DEFAULT_LENGTH);
		}
		// link the 2 properties
		tgpHelper.addSimpleEdge(propertyNode1,propertyNode2,Edge.DEFAULT_LENGTH);
	}
	
	protected Node createLabelNodeForERef(Node objectNode, EReference eref) throws TGException{
		Node propertyNode = tgpHelper.addFeatureNode(eref.getName());
		propertyNode.setType(Node.TYPE_ROUNDRECT);
		propertyNode.setGhostNode(true);
		if(eref.isContainer())
			tgpHelper.addDiamondEdge(propertyNode, objectNode, Edge.DEFAULT_LENGTH/3*2);
		else
			tgPanel.addEdge(objectNode, propertyNode, Edge.DEFAULT_LENGTH/3*2);
		return propertyNode;
	}

	public ModelGraphMapping getModelGraphMapping() {
		if(modelGraphMapping == null) modelGraphMapping= new ModelGraphMapping();
		return modelGraphMapping;
	}

	public void setModelGraphMapping(ModelGraphMapping modelGraphMapping) {
		this.modelGraphMapping = modelGraphMapping;
	}
}
