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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

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
		metamodels = new ArrayList<Metamodel>();
		for(EObject o : eObjects){
			if(o instanceof Metamodel)
				metamodels.add((Metamodel) o);
		}
	}
	
	public List<Metamodel> getMetamodels() {
		if(metamodels == null) metamodels = new ArrayList<Metamodel>();
		return metamodels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Resource getMainEResource(){
		for(Metamodel mm : metamodels){
			return mm.eResource();
		}
		return null;
	}
	
	public void gatherInMainEResource(){
		Resource mainRes = getMainEResource();
		for(Metamodel mm : metamodels){
			mainRes.getContents().add(mm);
		}
	}

}
