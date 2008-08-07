/**
 * <copyright>
 *
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: AbstractEvaluationEnvironment.java,v 1.1 2008-08-07 06:35:17 dvojtise Exp $
 */

package org.eclipse.ocl;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.internal.OCLPlugin;
import org.eclipse.ocl.internal.OCLStatusCodes;
import org.eclipse.ocl.internal.l10n.OCLMessages;

/**
 * A partial implementation of the {@link EvaluationEnvironment} interface,
 * providing some useful common behaviors.  Implementors of metamodel-specific
 * environments are encourage to extend this class rather than implement
 * an evaluation environment "from scratch."
 * <p>
 * See the {@link Environment} class for a description of the
 * generic type parameters of this class. 
 * </p>
 * 
 * @author Christian W. Damus (cdamus)
 */
public abstract class AbstractEvaluationEnvironment<C, O, P, CLS, E>
		implements EvaluationEnvironment<C, O, P, CLS, E> {
	
    private final EvaluationEnvironment<C, O, P, CLS, E> parent;
    private final Map<String, Object> map = new HashMap<String, Object>();

    protected AbstractEvaluationEnvironment() {
    	this(null);
    }
    
    protected AbstractEvaluationEnvironment(
    		EvaluationEnvironment<C, O, P, CLS, E> parent) {
    	
    	this.parent = parent;
    }
    
    /**
     * Obtains my parent (nesting) environment.
     * 
     * @return my parent environment, or <code>null</code> if none
     */
    protected EvaluationEnvironment<C, O, P, CLS, E> getParent() {
    	return parent;
    }
    
    /**
     * Returns the value associated with the supplied name
     * 
     * @param name
     *            the name whose value is to be returned
     * @return the value associated with the name
     */
    public Object getValueOf(String name) {
        return map.get(name);
    }

    /**
     * Replaces the current value of the supplied name with the supplied value.
     * 
     * @param name
     *            the name
     * @param value
     *            the new value
     */
    public void replace(String name, Object value) {
        map.put(name, value);
    }

    /**
     * Adds the supplied name and value binding to the environment
     * 
     * @param name
     *            the name to add
     * @param value
     *            the associated binding
     */
    public void add(String name, Object value) {
        if (map.containsKey(name)) {
            String message = OCLMessages.bind(
            		OCLMessages.BindingExist_ERROR_,
                    name,
                    map.get(name));
            throw new IllegalArgumentException(message);
        }
        map.put(name, value);
    }

    /**
     * Removes the supplied name and binding from the environment (if it exists)
     * and returns it.
     * 
     * @param name
     *            the name to remove
     * @return the value associated with the removed name
     */
    public Object remove(String name) {
        return map.remove(name);
    }

    /**
     * Clears the environment of variables.
     */
    public void clear() {
        map.clear();
    }

    /**
     * Returns a string representation of the bindings
     */
    @Override
    public String toString() {
        return map.toString();
    }
    
    /**
     * By default, a subclass will not support overriding the operations defined
     * by the OCL Standard Library.  This implementation delegates to the
     * parent environment (if any), otherwise returns <code>false</code>.
     */
    public boolean overrides(O operation, int opcode) {
    	return (getParent() != null)? getParent().overrides(operation, opcode) : false;
    }

    /**
     * Implements the inherited method by attempting to find an appropriate
     * Java method in the actual type of the <tt>source</tt> object and invoking
     * it.  On failure to find or invoke the method (e.g., an exception), the
     * <tt>OclInvalid</tt> result is returned.
     * 
     * @return the result of the Java method invocation, or <tt>OclInvalid</tt>
     *    on failure of the method invocation
     */
    public Object callOperation(O operation, int opcode, Object source, Object[] args)
    
		throws IllegalArgumentException {
    	
    	if (getParent() != null) {
    		return getParent().callOperation(operation, opcode, source, args);
    	}
    	
    	Method method = getJavaMethodFor(operation, source);
    	
    	if (method != null) {
    		try {
    		    // coerce any collection arguments to EList as necessary
    		    Class<?>[] parmTypes = method.getParameterTypes();
    		    for (int i = 0; i < parmTypes.length; i++) {
    		        if (EList.class.isAssignableFrom(parmTypes[i])) {
    		            if (args[i] == null) {
    		                args[i] = ECollections.EMPTY_ELIST;
    		            } else if (!(args[i] instanceof Collection)) {
    		                EList<Object> list = new BasicEList.FastCompare<Object>(1);
    		                list.add(args[i]);
    		                args[i] = list;
    		            } else if (!(args[i] instanceof EList)) {
    		                args[i] = new BasicEList.FastCompare<Object>((Collection<?>) args[i]);
    		            }
    		        }
    		    }
    		    
				return method.invoke(source, args);
			} catch (Exception e) {
				OCLPlugin.catching(getClass(), "callOperation", e);//$NON-NLS-1$
				OCLPlugin.log(
					IStatus.ERROR,
					OCLStatusCodes.IGNORED_EXCEPTION_WARNING,
					OCLMessages.bind(
						OCLMessages.ErrorMessage_ERROR_,
						"calloperation", //$NON-NLS-1$
						e.getLocalizedMessage()),
					e);
				return getInvalidResult();
			}
    	}
    	
    	throw new IllegalArgumentException();
    }
    
	/**
	 * Returns the java method that corresponds to the supplied
	 * <code>EOperation</code>
	 * 
	 * @param operation
	 *            the operation
	 * @return a java method
	 */
	protected abstract Method getJavaMethodFor(O operation, Object receiver);
	
	/**
	 * Obtains the language-binding-specific representation of the predefined
	 * <tt>OclInvalid</tt> object.
	 * 
	 * @return <tt>OclInvalid</tt>
	 */
	protected abstract Object getInvalidResult();
}
