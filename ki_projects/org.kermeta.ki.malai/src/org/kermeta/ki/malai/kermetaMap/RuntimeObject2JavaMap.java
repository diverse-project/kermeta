package org.kermeta.ki.malai.kermetaMap;

import java.util.IdentityHashMap;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class RuntimeObject2JavaMap extends IdentityHashMap<Object, RuntimeObject> {
	private static final long serialVersionUID = 1L;

	
	public static final RuntimeObject2JavaMap MAP = new RuntimeObject2JavaMap();
	
	/** The hashmap that contains for each Java Object the corresponding Kermeta RuntimeObject. */
	protected IdentityHashMap<Object, RuntimeObject> map;
	
	
	
	
	/**
	 * Initialises the hashmap between Kermeta and java objects.
	 */
	public RuntimeObject2JavaMap() {
		super();
	}
	
	
	
	public static RuntimeObject cleanMap(RuntimeObject selfRO) {
		Iterator<Entry<Object, RuntimeObject>> it = MAP.entrySet().iterator();
		Entry<Object, RuntimeObject> entry;
		
		while(it.hasNext()) {
			entry = it.next();
			removeUserData(entry.getValue());
		}
		
		MAP.clear();
		
		return selfRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * Removes the Java object associated to the Kermeta object and removes the mapping
	 * between these two objects (see RuntimeObject2JavaMap)
	 * @param ro The RuntimeObject to process.
	 * @return Void.
	 */
	public static RuntimeObject removeUserData(RuntimeObject ro) {
		Object obj = ro.getUserData();
		
		if(obj!=null) {
			ro.setUserData(null);
			RuntimeObject2JavaMap.MAP.remove(obj);
		}
		
		return ro.getFactory().getMemory().voidINSTANCE;
	}
}
