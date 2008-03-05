/* $Id: CacheTypeData.java,v 1.10 2008-03-05 08:27:17 ftanguy Exp $
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

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.Type;


/**
 * Cached Data for a given Type
 */
public class CacheTypeData {

	protected Hashtable<String,CallableOperation> callableOperationsCached = new Hashtable<String,CallableOperation>();
	protected Hashtable<String,CallableProperty> callablePropertiesCached = new Hashtable<String,CallableProperty>();
	
	/**
	 * Constructor
	 * Creates the cache data and fill it with callableOperations and callableProperties
	 * @param aType
	 */
	public CacheTypeData(Type aType)
	{
		
		
		// build callableOperations table
		List<CallableOperation> ops = aType.callableOperations(null);
		if (ops != null) 
		{
			Iterator<CallableOperation> it = ops.iterator();
			while(it.hasNext()) {
			    CallableOperation op = (CallableOperation)it.next();
			    CallableOperation savedOp = callableOperationsCached.get( op.getOperation().getName() );
			    
			    /*
			     * 
			     * If the operation does not exist yet, add it to the list.
			     * It an operation with the same name already exis, we check wether the abstract property is set
			     * or not in order to replace it.
			     * 
			     */
			    if ( savedOp == null ) 
			       	callableOperationsCached.put(op.getOperation().getName(), op);
			    else {
					boolean shouldAdd = false;
					if ( savedOp.getOperation().isIsAbstract()
						/*|| ( ! OperationHelper.isOverloadable( op.getOperation() ) && ! savedOp.getOperation().isIsAbstract() )*/ )
					shouldAdd = true;
					if ( shouldAdd )
				    	callableOperationsCached.put(op.getOperation().getName(), op);
			    }
			}
		}
		//		 build callableProperties table
		List<CallableProperty> props = aType.callableProperties();
		if (props != null) 
		{
			Iterator<CallableProperty> it = props.iterator();
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
