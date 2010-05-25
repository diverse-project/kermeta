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
import java.lang.ref.WeakReference;

/**
 * This class implement an HashMap cache using SoftReference, that means that if the garbage collector needs to free some memory
 * the key and the associated value will be thrown away.
 * adapted from http://www2.sys-con.com/ITSG/virtualcd/Java/archives/0308/monson/index.html
 */
public class WeakReferenceMapCache<Key, Value> extends AbstractReferenceMapCache<Key, Value> 
{ 
	
	public synchronized Value put( Key key, Value value ) 
	{ 
		Reference<Value> ref = new WeakReference<Value>( value );		
		ref = map.put( key, ref ); 
		if (ref!=null) {
			return (Value) (ref.get());
		}
		return null; 
	}



} 

