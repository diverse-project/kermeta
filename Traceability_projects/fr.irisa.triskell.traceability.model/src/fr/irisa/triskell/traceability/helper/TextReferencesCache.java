

/*$Id: TextReferencesCache.java,v 1.1 2008-05-19 13:50:46 ftanguy Exp $
* Project : fr.irisa.triskell.traceability.model
* File : 	TextReferencesCache.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 mai 08
* Authors : paco
*/

package fr.irisa.triskell.traceability.helper;

import java.util.ArrayList;
import java.util.List;

import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.TraceModel;

public class TextReferencesCache extends ReferencesCache<Integer, TextReference> {

	protected TextReferencesCache(TraceModel model) {
		super(model);
	}
			
	@Override
	protected void addToCache(TextReference reference) {
		/*
		 * 
		 * Using the cache for fast search functionality.
		 * 
		 */
		List<TextReference> references = _cache.get( reference.getCharBeginAt() );
		if ( references == null ) {
			references = new ArrayList<TextReference>();
			_cache.put(reference.getCharBeginAt(), references );
		}
		if ( ! references.contains(reference) )
			references.add(reference);
	}

	@Override
	protected void removeFromCache(TextReference o) {		
	}
	

}


