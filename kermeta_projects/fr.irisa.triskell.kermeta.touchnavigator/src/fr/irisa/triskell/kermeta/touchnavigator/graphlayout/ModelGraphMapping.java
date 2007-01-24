/* $Id: ModelGraphMapping.java,v 1.1 2007-01-24 08:24:35 dvojtise Exp $
 * Project   : Kermeta 
 * File      : ModelGraphMapping.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 5 déc. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;

import java.util.Hashtable;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.touchgraph.graphlayout.Node;

public class ModelGraphMapping {

	protected Hashtable<EObject, Node> modelObject2NodeMapping = new Hashtable<EObject, Node>();
	/**
	 * EObject source, Feature navigated, EObject target => Node  hashtable  first key is the object  second key is the feature (Property) eg EReference or EAttibute  
	 */
	protected Hashtable<EObject, Hashtable<EStructuralFeature, Hashtable<EObject, Node>>> modelObjectProperty2GraphMapping = new Hashtable<EObject, Hashtable<EStructuralFeature, Hashtable<EObject, Node>>>();
	
	// --------------------------
	// functions dedicated to object nodes
	public Node getObjectNode(EObject obj){
		return modelObject2NodeMapping.get(obj);
	}
	public void addObjectNode(EObject obj, Node node){
		modelObject2NodeMapping.put(obj, node);
	}
	
	public Set<EObject> getObjects(){
		return modelObject2NodeMapping.keySet();
	}
	
	// --------------------------
	// functions dedicated to feature nodes
	
	public Node getFeatureNode(EObject source, EStructuralFeature feature, EObject target){
		Node result = null;
		Hashtable<EStructuralFeature, Hashtable<EObject, Node>> objectHash = modelObjectProperty2GraphMapping.get(source);
		if(objectHash != null){
			Hashtable<EObject, Node> featureHash = objectHash.get(feature);
			if(featureHash!= null)
				result = featureHash.get(target);
		}
		return result;
	}
	public void addFeatureNode(EObject source, EStructuralFeature feature, EObject target, Node node){
		Hashtable<EStructuralFeature, Hashtable<EObject, Node>> objectHash = modelObjectProperty2GraphMapping.get(source);
		if(objectHash == null){
			objectHash = new Hashtable<EStructuralFeature, Hashtable<EObject, Node>>();
			modelObjectProperty2GraphMapping.put(source, objectHash);
		}
		Hashtable<EObject, Node> featureHash = objectHash.get(feature);
		if(featureHash == null){
			featureHash =  new Hashtable<EObject, Node>();
			objectHash.put(feature, featureHash);
		}
		featureHash.put(target, node);
	}
	
	
}
