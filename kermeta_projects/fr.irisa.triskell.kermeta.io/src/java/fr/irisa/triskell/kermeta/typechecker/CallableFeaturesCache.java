

/*$Id: CallableFeaturesCache.java,v 1.3 2008-04-28 11:50:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	CallableFeaturesCache.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 5 févr. 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.typechecker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.irisa.triskell.kermeta.language.structure.Type;

public class CallableFeaturesCache {

	static private CallableFeaturesCache instance;
	
	static public CallableFeaturesCache getInstance() {
		if ( instance == null )
			instance = new CallableFeaturesCache();
		return instance;
	}
	
	static public void destroyInstance() {
		if ( instance != null ) {
			instance.operations.clear();
			instance.properties.clear();
			instance = null;
		}
	}
	
	private Map<Type, List<CallableOperation>> operations = new HashMap<Type, List<CallableOperation>>();
	
	private Map<Type, List<CallableProperty>> properties = new HashMap<Type, List<CallableProperty>>();

	
	public void addCallableOperations(Type t, List<CallableOperation> l) {
		operations.put(t, l);
	}
	
	public List<CallableOperation> getCallableOperations(Type t) {
		return operations.get(t);
	}
	
	public void addCallableProperties(Type t, List<CallableProperty> l) {
		properties.put(t, l);
	}
	
	public List<CallableProperty> getCallableProperties(Type t) {
		return properties.get(t);
	}
	
}


