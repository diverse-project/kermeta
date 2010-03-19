/* $Id: TypeCache.java,v 1.4 2008-05-28 13:36:26 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : TypeCache.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2 sept. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *         This class implements a cache for various request on the types
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.Hashtable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.Type;



/**
 * This class implements a cache for various request on the types
 * It is used to optimize some computation on types.
 * It takes care of type binding.
 * It uses a cache system. First access to a type will build up a structure based on hashtables
 */
public class TypeCache {


	final static public Logger log = LoggerFactory.getLogger("KMT.cache");
	protected Hashtable theCache =  new Hashtable();
	
	/**
	 * Constructor
	 */
	public TypeCache()
    {
	}
	
	/**
	 * Optimized version of Type.getOperationByName
	 * @param aType
	 * @param operationName
	 * @return a CallableOperation
	 */
	public CallableOperation getOperationByName(Type aType, String operationName)
	{
		String typeId = aType.toString();
		
		// find the type in the cache
		CacheTypeData typeData = getTypeData(aType, typeId);
		return typeData.getOperationByName(operationName);
	}
	
	/**
	 * Optimized version of Type.getPropertyByName
	 * @param aType
	 * @param propertyName
	 * @return a CallableProperty
	 */
	public CallableProperty getPropertyByName(Type aType, String propertyName)
	{
		String typeId = aType.toString();
		
		// find the type in the cache
		CacheTypeData typeData = getTypeData(aType, typeId);
		return typeData.getPropertyByName(propertyName);
	}
	
	/**
	 * Finds the given type in the cache, or creates it
	 * @param aType
	 * @param typeId
	 * @return
	 */
	protected CacheTypeData getTypeData(Type aType, String typeId)
	{
		CacheTypeData typeData = (CacheTypeData)theCache.get(typeId);
		if (typeData == null)
		{
			// build this typeData
			log.debug("Building cache data for type " + typeId);
			typeData = new CacheTypeData(aType);
			// add it to the table
			theCache.put(typeId, typeData);
		}
		return typeData;
	}
	
	/**
	 * Empties the cache. Any new access will rebuilt progessively the cache data
	 */
	public void flushCache()
	{
		theCache.clear();
	}
	
	/**
	 * Removes this type from the cache. Any new access will rebuilt the cache data
	 */
	public void removeFromCache(Type aType)
	{
		theCache.remove(aType.toString());
	}
	
}
