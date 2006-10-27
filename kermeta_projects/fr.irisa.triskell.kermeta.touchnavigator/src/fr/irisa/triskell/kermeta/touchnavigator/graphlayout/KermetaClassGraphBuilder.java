/* $Id: KermetaClassGraphBuilder.java,v 1.11 2006-10-27 08:50:38 dvojtise Exp $
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

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.touchgraph.graphlayout.Edge;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGException;
import com.touchgraph.graphlayout.TGPanel;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.touchnavigator.TouchNavigatorPlugin;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

public class KermetaClassGraphBuilder extends KermetaOptimizedVisitor{
	protected TGPanel tgPanel; 
	protected ClassDefinition startingClass;
	
	public boolean mustStop = false;
	
	
	protected TGPanelHelper tgpHelper;
	
	protected Hashtable<TypeDefinition,Node> graphUnitMapping = new Hashtable<TypeDefinition,Node>();
	
	public KermetaClassGraphBuilder(TGPanel newtgPanel, ClassDefinition theStartingClass) {
		tgPanel = newtgPanel;
		tgpHelper = new TGPanelHelper(tgPanel);
		startingClass = theStartingClass;
	}

	public void buildGraph(KermetaUnit kunit) throws TGException
	{

		
		mustStop =  false;
		if(kunit == null) return;
		
		TouchNavigatorPlugin.internalLog.debug("buildGraph: "+kunit.getUri());
		//Arrow.init(18, 0.5);
		
		tgPanel.getLocalityUtils().fastFinishAnimation();
		//if(kunit == null) return;
		
//		 needed in order to make the hide work
	/*	Node dispendableNode = tgPanel.addNode();
		dispendableNode.setLabel("Building Graph, please wait...");
		tgPanel.setSelect(dispendableNode);
		tgPanel.setLocale(dispendableNode,1);
		*/
		acceptCollection(kunit.packages.values());

		tgPanel.setSelect(tgPanel.getGES().getFirstNode());

	/*	Iterator it2 = graphUnitMapping.entrySet().iterator();
		if(it2.hasNext()){
			//Entry entry = (Entry)it.next();
			//ClassDefinition aClass = (ClassDefinition)((Entry)it2.next()).getKey();
			Node n1 = (Node)graphUnitMapping.get(startingClass);

			tgPanel.setLocale(n1,2);
		}*/
		//		Graph has now its own nodes
		//tgPanel.deleteNode(dispendableNode);
		//tgPanel.setSelect(tgPanel.getGES().getFirstNode());
		
		
		// for each class creates the links
		Iterator it = graphUnitMapping.entrySet().iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			if (mustStop){ 
    			System.err.println("buildGraph stopped");                    	
    			return;
    		}
			if(entry.getKey() instanceof ClassDefinition)
			{
				ClassDefinition aClassDef = (ClassDefinition)entry.getKey();
		        
				Iterator superTypeIt = aClassDef.getSuperType().iterator();
				while (superTypeIt.hasNext()){
					fr.irisa.triskell.kermeta.language.structure.Class aClass = (fr.irisa.triskell.kermeta.language.structure.Class)(superTypeIt.next());
					ClassDefinition aSuperClassDef = (ClassDefinition)aClass.getTypeDefinition();
					Node inheritanceNode = tgpHelper.addInvisibleNode();
					inheritanceNode.setGhostNode(true);
					//Node inheritanceNode = tgPanel.addNode();
					inheritanceNode.setLabel("Inherits");
					inheritanceNode.setType(Node.TYPE_ROUNDRECT);
					Node n1 = (Node)graphUnitMapping.get(aClassDef);
					Node n2 = (Node)graphUnitMapping.get(aSuperClassDef);
					tgPanel.addEdge(n1,inheritanceNode,Edge.DEFAULT_LENGTH);
					tgpHelper.addInheritanceEdge(inheritanceNode,n2,Edge.DEFAULT_LENGTH);
					
				}
				Iterator ownedAttributesIt = aClassDef.getOwnedAttribute().iterator();
				while (ownedAttributesIt.hasNext()){
					Property property1 = (Property)ownedAttributesIt.next();
					Property property2 = (Property)property1.getOpposite();
					// if we have an opposite
					if(property2!= null){
						Node n1 = (Node)graphUnitMapping.get(aClassDef);
						Node n2 = (Node)graphUnitMapping.get(property2.eContainer());
						
						// does this node already has this property ?
						if(findConnectedNodeByName(n1,property1.getName()) == null)
						{
							//Node propertyNode1 = tgPanel.addNode();
							//propertyNode1.setLabel(property1.getFName());
							//propertyNode1.setType(Node.TYPE_ROUNDRECT);
							Node propertyNode1 = tgpHelper.addFeatureNode(property1.getName());
							propertyNode1.setGhostNode(true);
							//Node propertyNode2 = tgPanel.addNode();
							//propertyNode2.setLabel(property2.getFName());
							//propertyNode2.setType(Node.TYPE_ROUNDRECT);
							Node propertyNode2 = tgpHelper.addFeatureNode(property2.getName());
							propertyNode2.setGhostNode(true);
							if(property1.isIsComposite())
								tgpHelper.addDiamondEdge(propertyNode1, n1, Edge.DEFAULT_LENGTH/3*2);
							else
								tgPanel.addEdge(n1, propertyNode1, Edge.DEFAULT_LENGTH/3*2);
							//tgPanel.addEdge(propertyNode1, n1, Edge.DEFAULT_LENGTH/3*2);
							tgpHelper.addSimpleEdge(propertyNode1,propertyNode2,Edge.DEFAULT_LENGTH);
							//tgpHelper.addSimpleEdge(propertyNode2,propertyNode1,Edge.DEFAULT_LENGTH);
							//tgPanel.addEdge(propertyNode2,n2,Edge.DEFAULT_LENGTH/3*2);
							if(property2.isIsComposite())
								tgpHelper.addDiamondEdge(propertyNode2, n2, Edge.DEFAULT_LENGTH/3*2);
							else
								tgPanel.addEdge(n2, propertyNode2, Edge.DEFAULT_LENGTH/3*2);
							
						}
						
					}
					else {
					// we don't have an opposite, deal with property type
						Node n1 = (Node)graphUnitMapping.get(aClassDef);
						Node propertyNode1 = tgpHelper.addFeatureNode(property1.getName());
						propertyNode1.setType(Node.TYPE_ROUNDRECT);
						propertyNode1.setGhostNode(true);
						if(property1.isIsComposite())
							tgpHelper.addDiamondEdge(propertyNode1, n1, Edge.DEFAULT_LENGTH/3*2);
						else
							tgPanel.addEdge(n1, propertyNode1, Edge.DEFAULT_LENGTH/3*2);
						//tgPanel.addEdge(propertyNode1, n1, Edge.DEFAULT_LENGTH/3*2);
						
						Object obj = property1.getType(); // A verifier les type possibles !! ou un  accept ?
						if(obj instanceof fr.irisa.triskell.kermeta.language.structure.Class)
						{
							fr.irisa.triskell.kermeta.language.structure.Class aClass = (fr.irisa.triskell.kermeta.language.structure.Class)obj;
							Node n2 = (Node)graphUnitMapping.get(aClass.getTypeDefinition());
							Node propertyNode2 = tgpHelper.addInvisibleNode();
							propertyNode2.setLabel("ghost"); // ghost node because it is not navigable this way
							propertyNode2.setType(Node.TYPE_ROUNDRECT);
							propertyNode2.setGhostNode(true);
							tgpHelper.addSimpleEdge(propertyNode1,propertyNode2,Edge.DEFAULT_LENGTH);
							//tgpHelper.addSimpleEdge(propertyNode2,propertyNode1,Edge.DEFAULT_LENGTH);
							tgpHelper.addSimpleEdge(propertyNode2,n2,Edge.DEFAULT_LENGTH);
							//tgPanel.addEdge(n2, propertyNode2, Edge.DEFAULT_LENGTH/3*2);
							
							
						}
						else if(obj instanceof PrimitiveType)
						{
							PrimitiveType primType = (PrimitiveType)obj;
							Collection col = tgPanel.findNodesByLabel(NamedElementHelper.getQualifiedName(primType));
							if(col != null){
	
								Iterator primitiveIt = col.iterator();
								Node primitiveTypeNode = (Node)primitiveIt.next();
								Node propertyNode2 = tgpHelper.addInvisibleNode();
								propertyNode2.setLabel("ghost"); // ghost node because it is not navigable this way
								propertyNode2.setType(Node.TYPE_ROUNDRECT);
								propertyNode2.setGhostNode(true);
								tgpHelper.addSimpleEdge(propertyNode1,propertyNode2,Edge.DEFAULT_LENGTH);
								tgpHelper.addSimpleEdge(propertyNode2,primitiveTypeNode,Edge.DEFAULT_LENGTH);
								
							}
							else{
								String msg = "primitive node not found "+NamedElementHelper.getQualifiedName(primType);
			            		System.err.println(msg);
			                	
							}
							//Node primitiveTypeNode = 
						}
						else{
							String msg = "other end : "+obj;
		            		System.err.println(msg);
						}
					}
					
				}
			}
			//try {
				
				/*if (startingClass == entry.getKey()){
					Node n1 = (Node)graphUnitMapping.get(startingClass);
					tgPanel.setLocale(n1,2);
					tgPanel.setSelect(n1);
				}*/
				//tgPanel.updateLocalityFromVisibility();
				//tgPanel.getLocalityUtils().fastFinishAnimation();
				//tgPanel.stopMotion();
				//Thread.sleep(50);
			//} catch (InterruptedException e) {}
			// else not a ClassDef
		}
		
		
		Iterator it3 = graphUnitMapping.entrySet().iterator();
		if(it3.hasNext()){
			//Entry entry = (Entry)it.next();
			//FClassDefinition aClass = (FClassDefinition)((Entry)it2.next()).getKey();
			Node n1 = (Node)graphUnitMapping.get(startingClass);

			tgPanel.setLocale(n1,2);
		}
		
		/*Iterator it = kunit.packages.values().iterator();
	    while(it.hasNext()) {
	        Package pack = (Package)it.next();
	       
            OutlineItem item = new OutlineItem(pack, null, outline);
            
            
            if (!outline.prefPackageTree() || pack.getFNestingPackage() == null) {
                if(outline.prefShowImported() || !item.isPackageFullyImported()) {
	                result.add(item);
	            }
            }
	    }*/
		
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
        }
        tgPanel.setLocale(n1,2);
        */
		
	}
	
	public Node findConnectedNodeByName(Node n1, String searchedNodeLabel)
	{
		for(int i= 0; i < n1.edgeCount(); i++)
		{
			if(n1.edgeAt(i).getOtherEndpt(n1).getLabel().compareTo(searchedNodeLabel)==0){
				return n1.edgeAt(i).getOtherEndpt(n1);
			}
		}
		return null;
	}
	
	public void acceptCollection(Collection elements) {
		Iterator it = elements. iterator();
		while(it.hasNext()) {
			this.accept((EObject)it.next());
		}
	}
	public void acceptList(EList elements) {
		Iterator it = elements. iterator();
		while(it.hasNext()) {
			this.accept((EObject)it.next());
		}
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visit(Package)
	 */
	public Object visitPackage(Package thePackage){
		
		acceptList(thePackage.getOwnedTypeDefinition());
		acceptList(thePackage.getNestedPackage());		
	    return null;
	}
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitPrimitiveType(PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType theType){
		Node n1;
		try {
			// look for an existing one
			if(graphUnitMapping.contains(theType))
				n1 = (Node)graphUnitMapping.get(theType);
			else
				n1 = tgpHelper.addClassNode();
			graphUnitMapping.put(theType, n1);
			n1.setLabel(NamedElementHelper.getQualifiedName(theType));
			n1.setType(Node.TYPE_RECTANGLE);
			/*if(startingClass.getFName().compareTo(theType.getFName())==0)
			{	// select this node for the animation
				tgPanel.setLocale(n1,2);
				tgPanel.getSelect()
				tgPanel.setSelect(n1);
			}*/
		} catch (TGException e) {
			throw new Error("TouchGraph INTERNAL ERROR : visiting a FPrimitiveType", e);
		}
	    return null;
	}
	
	/** used by visitClassDefinition to not have to build too much node at once */
	protected int nbNodeCreated = 0;
	protected ClassNode foundNode = null; 
	
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visit(FClass)
	 */
	public Object visitClassDefinition(ClassDefinition theClass){
		ClassNode n1;
		try {
//			 look for an existing one
			if(graphUnitMapping.contains(theClass)){
				n1 = (ClassNode)graphUnitMapping.get(theClass);
				return null;
			}
			else {
				// check name doublon
				Collection c = this.tgPanel.findNodesByLabel(NamedElementHelper.getQualifiedName(theClass));
				if(c != null) {
					//TouchNavigatorPlugin.internalLog.debug("There is already a node named "+KMTHelper.getQualifiedName(theClass));
					n1 = (ClassNode)c.iterator().next();
				}
				else
					n1 = (ClassNode) tgpHelper.addClassNode();
			}
			graphUnitMapping.put(theClass, n1);
			n1.setLabel(NamedElementHelper.getQualifiedName(theClass));
			n1.setShortLabel (theClass.getName());
			n1.setType(Node.TYPE_RECTANGLE);
			//n1.setVisible(false);
			nbNodeCreated++;
			// this allows to not have to load all the node at once
			// at let some time to the animation to finish
			if(nbNodeCreated >10){
				nbNodeCreated = 0;
				if(theClass == startingClass){
					foundNode = n1;					
				}
				else if (foundNode != null){
					n1 = foundNode;
				}
				tgPanel.setLocale(n1,2);
				tgPanel.setSelect(n1);
				try {
					tgPanel.getLocalityUtils().fastFinishAnimation();
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
			}
			
		} catch (TGException e) {
			throw new Error("TouchGraph INTERNAL ERROR : visit a FClass", e);
		}
	    return null;
	}
	
	public Object visitProperty(Property node) {
	    String result = "";//ppTags(node.getFTag());
		if (node.isIsDerived()) result += "property ";
		else if (node.isIsComposite()) result += "attribute ";
		else result += "reference ";
		if (node.isIsReadOnly()) result += "readonly ";
		
		return result;
	}
}
