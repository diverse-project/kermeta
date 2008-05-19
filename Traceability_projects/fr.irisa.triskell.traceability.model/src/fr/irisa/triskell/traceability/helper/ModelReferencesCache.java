/*$Id: ModelReferencesCache.java,v 1.1 2008-05-19 13:50:46 ftanguy Exp $
* Project : fr.irisa.triskell.traceability.model
* File :        ModelReferencesCache.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 16 mai 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.traceability.helper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.TraceModel;

public class ModelReferencesCache extends ReferencesCache<EObject, ModelReference> {

	/**
	 * 
	 * @param model
	 */
	protected ModelReferencesCache(TraceModel model) {
		super(model);
	}
       
	@Override
	protected void addToCache(ModelReference reference) {
		// Getting the list for the specified object.
		List<ModelReference> l = _cache.get( reference.getRefObject() );
		if ( l == null ) {
			// If the list does not exist, let's create one and add it to the cache.
			l = new ArrayList<ModelReference>();
			_cache.put(reference.getRefObject(), l);
		}
		// Add the model reference to the list.
		if ( ! l.contains(reference) )
			l.add( reference );
	}

	@Override
	protected void removeFromCache(ModelReference o) {
	}

}