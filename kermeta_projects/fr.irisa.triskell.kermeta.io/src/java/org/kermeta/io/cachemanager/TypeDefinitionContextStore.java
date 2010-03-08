

/*$Id: TypeDefinitionContextCache.java,v 1.2 2008-04-28 11:50:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	CallableFeaturesCache.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 5 févr. 08
* Authors : paco
*/

package org.kermeta.io.cachemanager;

import java.util.Collection;
import java.util.Map;

import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.cache.utilities.SoftReferenceMapCache;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

public class TypeDefinitionContextStore {
	
	private Map<TypeDefinition, Collection<TypeDefinition>> _contexts = new SoftReferenceMapCache<TypeDefinition, Collection<TypeDefinition>>();
	//private Map<TypeDefinition, Collection<TypeDefinition>> _contexts = new HashMap<TypeDefinition, Collection<TypeDefinition>>();
	
	public Collection<TypeDefinition> getTypeDefinitionContext(TypeDefinition t) {
		Collection<TypeDefinition> context = _contexts.get(t);
		if ( context == null && t instanceof ClassDefinition ) {
			context = KermetaModelHelper.ClassDefinition.getFullContext( (ClassDefinition) t );
			_contexts.put(t, context);
		}
		return context;
	}	
	
}


