/* $Id: KermetaClassGraphBuilder.java,v 1.1 2005-11-11 07:10:04 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.editors.Editor;
import fr.irisa.triskell.kermeta.texteditor.outline.OutlineItem;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

public class KermetaClassGraphBuilder extends KermetaOptimizedVisitor{
	protected TGPanel tgPanel; 
	protected FClassDefinition startingClass;
	
	protected Hashtable graphUnitMapping = new Hashtable();
	
	public KermetaClassGraphBuilder(TGPanel newtgPanel, FClassDefinition theStartingClass) {
		tgPanel = newtgPanel;
		startingClass = theStartingClass;
	}

	public void buildGraph() throws TGException
	{
		KermetaUnit kunit= null;
		//TexteditorPlugin tePlugin = TexteditorPlugin.getDefault();
		//if(tePlugin == null) return;
		Editor editor =TexteditorPlugin.getDefault().getEditor();
		if(editor == null) return;
		kunit = editor.getMcunit();
		//if(kunit == null) return;
		
//		 needed in order to make the hide work
		//Node dispendableNode = tgPanel.addNode();
		//dispendableNode.setLabel("Building Graph, please wait...");
		//tgPanel.setSelect(dispendableNode);
		//tgPanel.setLocale(dispendableNode,2);
		
		acceptCollection(kunit.packages.values());
		
		//		Graph has now its own nodes
		//tgPanel.deleteNode(dispendableNode);
		//tgPanel.setSelect(tgPanel.getGES().getFirstNode());
		
		
		// for each class creates the links
		Iterator it = graphUnitMapping.entrySet().iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			FClassDefinition aClassDef = (FClassDefinition)entry.getKey();
	        
			Iterator superTypeIt = aClassDef.getFSuperType().iterator();
			while (superTypeIt.hasNext()){
				FClass aClass = (FClass)(superTypeIt.next());
				FClassDefinition aSuperClassDef = aClass.getFClassDefinition();
				Node inheritanceNode = tgPanel.addNode();
				inheritanceNode.setLabel("Inherits");
				inheritanceNode.setType(Node.TYPE_ROUNDRECT);
				Node n1 = (Node)graphUnitMapping.get(aClassDef);
				Node n2 = (Node)graphUnitMapping.get(aSuperClassDef);
				tgPanel.addEdge(n1,inheritanceNode,Edge.DEFAULT_LENGTH);
				tgPanel.addEdge(inheritanceNode,n2,Edge.DEFAULT_LENGTH);
				
			}
			Iterator ownedAttributesIt = aClassDef.getFOwnedAttributes().iterator();
			while (ownedAttributesIt.hasNext()){
				FProperty property1 = (FProperty)ownedAttributesIt.next();
				FProperty property2 = (FProperty)property1.getFOpposite();
				// if we have an opposite
				if(property2!= null){
					Node n1 = (Node)graphUnitMapping.get(aClassDef);
					Node n2 = (Node)graphUnitMapping.get(property2.eContainer());
					
					// does this node already has this property ?
					if(findConnectedNodeByName(n1,property1.getFName()) == null)
					{
						Node propertyNode1 = tgPanel.addNode();
						propertyNode1.setLabel(property1.getFName());
						propertyNode1.setType(Node.TYPE_ROUNDRECT);
						Node propertyNode2 = tgPanel.addNode();
						propertyNode2.setLabel(property2.getFName());
						propertyNode2.setType(Node.TYPE_ROUNDRECT);
						tgPanel.addEdge(n1, propertyNode1, Edge.DEFAULT_LENGTH/3*2);
						tgPanel.addEdge(propertyNode1, n1, Edge.DEFAULT_LENGTH/3*2);
						tgPanel.addEdge(propertyNode1,propertyNode2,Edge.DEFAULT_LENGTH);
						tgPanel.addEdge(propertyNode2,propertyNode1,Edge.DEFAULT_LENGTH);
						tgPanel.addEdge(propertyNode2,n2,Edge.DEFAULT_LENGTH/3*2);
						tgPanel.addEdge(n2, propertyNode2, Edge.DEFAULT_LENGTH/3*2);
						
					}
					
				}
				else {
				// we don't have an opposite, deal with property type
					Node n1 = (Node)graphUnitMapping.get(aClassDef);
					Node propertyNode1 = tgPanel.addNode();
					propertyNode1.setLabel(property1.getFName());
					propertyNode1.setType(Node.TYPE_ROUNDRECT);
					tgPanel.addEdge(n1, propertyNode1, Edge.DEFAULT_LENGTH/3*2);
					tgPanel.addEdge(propertyNode1, n1, Edge.DEFAULT_LENGTH/3*2);
					
					Object obj = property1.getFType(); // A verifier les type possibles !! ou un  accept ?
					if(obj instanceof FClassDefinition)
					{
						FClassDefinition aTypeClassDef = (FClassDefinition)obj;
						Node n2 = (Node)graphUnitMapping.get(aTypeClassDef);
						Node propertyNode2 = tgPanel.addNode();
						propertyNode2.setLabel(""); // ghost node because it is not navigable this way
						propertyNode2.setType(Node.TYPE_ROUNDRECT);
						tgPanel.addEdge(propertyNode1,propertyNode2,Edge.DEFAULT_LENGTH);
						tgPanel.addEdge(propertyNode2,propertyNode1,Edge.DEFAULT_LENGTH);
						tgPanel.addEdge(propertyNode2,n2,Edge.DEFAULT_LENGTH/3*2);
						//tgPanel.addEdge(n2, propertyNode2, Edge.DEFAULT_LENGTH/3*2);
						
						
					}
					else if(obj instanceof FPrimitiveType)
					{
						//TODO create nodes also for the primitives types
					}
					else{
					
					}
				}
				
			}
			
		}
		
		
		Iterator it2 = graphUnitMapping.entrySet().iterator();
		if(it2.hasNext()){
			//Entry entry = (Entry)it.next();
			//FClassDefinition aClass = (FClassDefinition)((Entry)it2.next()).getKey();
			Node n1 = (Node)graphUnitMapping.get(startingClass);

			tgPanel.setLocale(n1,2);
		}
		
		/*Iterator it = kunit.packages.values().iterator();
	    while(it.hasNext()) {
	        FPackage pack = (FPackage)it.next();
	       
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
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visit(FPackage)
	 */
	public Object visitFPackage(FPackage thePackage){
		
		acceptList(thePackage.getFOwnedTypeDefinition());
		acceptList(thePackage.getFNestedPackage());		
	    return null;
	}
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visit(FClass)
	 */
	public Object visitFClassDefinition(FClassDefinition theClass){
		Node n1;
		try {
			n1 = tgPanel.addNode();
			graphUnitMapping.put(theClass, n1);
			n1.setLabel(KMTHelper.getQualifiedName(theClass));
			n1.setType(Node.TYPE_RECTANGLE);
			if(startingClass == theClass)
			{	// select this node for the animation
				//tgPanel.setLocale(n1,2);
				//tgPanel.setSelect(n1);
			}
		} catch (TGException e) {
			throw new Error("TouchGraph INTERNAL ERROR : visit a FClass", e);
		}
	    return null;
	}
	
	public Object visitFProperty(FProperty node) {
	    String result = "";//ppTags(node.getFTag());
		if (node.isFIsDerived()) result += "property ";
		else if (node.isFIsComposite()) result += "attribute ";
		else result += "reference ";
		if (node.isFIsReadOnly()) result += "readonly ";
		
		return result;
	}
}
