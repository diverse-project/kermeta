

/*$Id: ReferencesCache.java,v 1.1 2008-05-19 13:50:46 ftanguy Exp $
* Project : fr.irisa.triskell.traceability.model
* File : 	ReferensesCache.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 mai 08
* Authors : paco
*/

package fr.irisa.triskell.traceability.helper;

import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.traceability.TraceModel;

public abstract class ReferencesCache<Key, G> extends Cache<Key, G> {
	
	/**
	 * 
	 * @param model
	 */
	public ReferencesCache(TraceModel model) {
		this(model, getStructuralFeature(model));
	}
	
	/**
	 * 
	 * @param model
	 */
	private ReferencesCache(TraceModel model, EStructuralFeature feature) {
		super(model, feature);
	}
	
	/**
	 * 
	 * @return
	 */
	static private EStructuralFeature getStructuralFeature(TraceModel model) {
		return model.eClass().getEStructuralFeature("references");
	}

}


