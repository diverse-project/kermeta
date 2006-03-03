/* $Id: CacheTypeData.java,v 1.2 2006-03-03 15:21:47 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : CacheTypeData.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2 sept. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *         Cached Data for a given Type 
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.Type;

/**
 * Cached Data for a given Type
 */
public class CacheTypeData {

	protected Hashtable callableOperationsCached = new Hashtable();
	protected Hashtable callablePropertiesCached = new Hashtable();
	
	/**
	 * Constructor
	 * Creates the cache data and fill it with callableOperations and callableProperties
	 * @param aType
	 */
	public CacheTypeData(Type aType)
	{
		// build callableOperations table
		ArrayList ops = aType.callableOperations();
		if (ops != null) 
		{
			Iterator it = ops.iterator();
			while(it.hasNext()) {
			    CallableOperation op = (CallableOperation)it.next();
			    callableOperationsCached.put(op.getOperation().getName(), op);
			}
		}
		//		 build callableProperties table
		ArrayList props = aType.callableProperties();
		if (props != null) 
		{
			Iterator it = props.iterator();
			while(it.hasNext()) {
			    CallableProperty prop = (CallableProperty)it.next();
			    callablePropertiesCached.put(prop.getProperty().getName(), prop);
			}
		}
		
	}
	public CallableOperation getOperationByName(String operationName)
	{
		return (CallableOperation)callableOperationsCached.get(operationName);
	}
	
	public CallableProperty getPropertyByName(String propertyName)
	{

		return (CallableProperty)callablePropertiesCached.get(propertyName);
	}
	
}
