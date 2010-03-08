

/*$Id: CallableFeaturesCache.java,v 1.3 2008-04-28 11:50:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	CallableFeaturesCache.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 5 févr. 08
* Authors : paco
*/

package org.kermeta.io.cachemanager;

import java.util.List;

import fr.irisa.triskell.cache.utilities.WeakReferenceMapCache;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;

public class CallableFeaturesStore {
	
	private WeakReferenceMapCache<Type, List<CallableOperation>> operationsCache = new WeakReferenceMapCache<Type, List<CallableOperation>>();
	
	private WeakReferenceMapCache<Type, List<CallableProperty>> properties = new WeakReferenceMapCache<Type, List<CallableProperty>>();

	
	public void addCallableOperations(Type t, List<CallableOperation> l) {
		operationsCache.put(t, l);
	}
	
	public List<CallableOperation> getCallableOperations(Type t) {
		return operationsCache.get(t);
	}
	
	public void addCallableProperties(Type t, List<CallableProperty> l) {
		properties.put(t, l);
	}
	
	public List<CallableProperty> getCallableProperties(Type t) {
		return properties.get(t);
	}
	
}


