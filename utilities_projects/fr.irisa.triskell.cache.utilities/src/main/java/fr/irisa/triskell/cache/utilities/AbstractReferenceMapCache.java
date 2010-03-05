/* $Id: KermetaUnitCache.java,v 1.1.2.1 2008-12-31 15:15:00 dvojtise Exp $
* Project : IO
* File : KermetaUnitStorer.java
* License : EPL
* Copyright : IRISA / INRIA
* ----------------------------------------------------------------------------
* Creation date : 30/12/2008
* Author : Didier vojtisek
*/ 
package fr.irisa.triskell.cache.utilities;

import java.lang.ref.Reference;
import java.util.AbstractMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import org.kermeta.io.KermetaUnit;



/**
 * This class implement an HashMap cache using Reference, that means that if the garbage collector needs to free some memory
 * the key and the associated value will be thrown away.
 * adapted from http://www2.sys-con.com/ITSG/virtualcd/Java/archives/0308/monson/index.html
 */
public abstract class AbstractReferenceMapCache<Key, Value> extends AbstractMap<Key, Value> 
{ 
	protected Map<Key, Reference<Value>> map = new Hashtable<Key, Reference<Value>>(); 

	@Override
	public synchronized Set<Map.Entry<Key,Value>> entrySet() {

		Map<Key, Value>   newMap; 
		Iterator<Map.Entry<Key, Reference<Value>>> iter; 

		newMap = new Hashtable<Key, Value>(); 
		iter = map.entrySet().iterator(); 
		while( iter.hasNext() ) { 
			Map.Entry<Key, Reference<Value>> me = iter.next(); 
			Reference<Value> ref = me.getValue(); 
			Value o = ref.get(); 
			if ( o==null ) { 
				// Delete cleared reference 
				iter.remove(); 
			} 
			else { 
				// Copy out interior object 
				newMap.put( me.getKey(),  o ); 
			} 
		} 

		// Return set of interior objects 
		return newMap.entrySet(); 
	} 


	@Override
	public synchronized Value remove(Object key) {
		if(map.containsKey(key)) map.remove(key);
		return super.remove(key);
	}


} 

