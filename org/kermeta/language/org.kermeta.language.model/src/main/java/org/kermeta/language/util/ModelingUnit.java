/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 24 sept. 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.structure.Metamodel;

/**
 * Group of Metamodel
 * This class allows to manipulates a set of AbastractMetamodels (ie. kermeta root elements) as a single object
 *
 */
public class ModelingUnit {
	
	protected List<Metamodel> metamodels = null;
	
	protected String name = "";
	
	public ModelingUnit(){
		this.name = "<unnamed_ModelingUnit>";
		metamodels = new ArrayList<Metamodel>();
	}
	public ModelingUnit(String name){
		this.name = name;
		metamodels = new ArrayList<Metamodel>();
	}

	public ModelingUnit(String name, List<Metamodel> metamodels){
		this.name = name;
		this.metamodels = new ArrayList<Metamodel>();
		this.metamodels.addAll(metamodels);
	}
	
	public ModelingUnit(String name, EList<EObject> eObjects){
		this.name = name;
		this.metamodels = new ArrayList<Metamodel>();
		for(EObject o : eObjects){
			if(o instanceof Metamodel)
				metamodels.add((Metamodel) o);
		}
	}
	
	public List<Metamodel> getMetamodels() {
		if(metamodels == null) metamodels = new ArrayList<Metamodel>();
		return metamodels;
	}

	public String getDescriptionString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append("{");
		for (int i = 0; i < getMetamodels().size(); i++){
			sb.append(getMetamodels().get(i).getName());
			if(i < getMetamodels().size()-1 ){
				sb.append(", ");
			}
		}
		sb.append("}");
		return sb.toString();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Resource getMainEResource(){
		for(Metamodel mm : metamodels){
			if(mm.eResource() != null)
				return mm.eResource();
		}
		return null;
	}
	
	public void gatherInMainEResource(){
		Resource mainRes = getMainEResource();
		if(mainRes == null){
			// create a Resource
			URI uri = URI.createURI(getName() + ".km_in_memory");
			ResourceSet resourceSet2 = new ResourceSetImpl();
			Resource.Factory.Registry f2 = resourceSet2.getResourceFactoryRegistry();
			Map<String,Object> m2 = f2.getExtensionToFactoryMap();
			m2.put("*",new XMIResourceFactoryImpl());
			mainRes = resourceSet2.createResource(uri);
		}
		for(Metamodel mm : metamodels){
			mainRes.getContents().add(mm);
		}
	}
	

	/*
	 * Returns all the direct and indirect contents of all the modeling unit's metamodels
	 */
	public List<EObject> getAllMetamodelsContents() {
		List<EObject> result = new ArrayList<EObject>();
		
		//TODO cguy: Seems pretty heavy and ugly only to add all the direct and indirect contents of each Metamodel
		Iterator<EObject> it;
		for (Metamodel mm : this.getMetamodels()) {
			it = mm.eAllContents();
			while (it.hasNext()) {
				result.add(it.next());
			}
		}
		
		return result;
	}

}
