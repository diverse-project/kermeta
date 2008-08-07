/**
 * <copyright>
 *
 * Copyright (c) 2006, 2007 IBM Corporation and others.
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
 * $Id: ObjectUtil.java,v 1.1 2008-08-07 06:35:17 dvojtise Exp $
 */
package org.eclipse.ocl.util;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnumLiteral;

/**
 * Certain generic utility operations on objects.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class ObjectUtil {

	/**
     * Computes the equivalence of two objects, accounting for primitive numeric
     * values that OCL considers equal but Java does not.  This is also safe
     * when either value is <code>null</code>.
     * 
     * @param anObject an object or <code>null</code>
     * @param anotherObject another object or <code>null</code>
     * 
     * @return whether they are equivalent as far as OCL is concerned
     */
	public static boolean equal(Object anObject, Object anotherObject) {
		// if either value is undefined, the result is true just if both are
		// undefined and false otherwise.
		if (anObject == null || anotherObject == null)
			return anObject == anotherObject;

		// primitive types
		if (isPrimitive(anObject) || isPrimitive(anotherObject)) {
			if (anObject instanceof Integer && anotherObject instanceof Integer)
				return ((Integer) anObject).intValue()
					== ((Integer) anotherObject).intValue();
			else if (anObject instanceof Integer && anotherObject instanceof Double)
				return ((Integer) anObject).intValue()
					== ((Double) anotherObject).doubleValue();
			else if (anObject instanceof Double && anotherObject instanceof Integer)
				return ((Double) anObject).doubleValue()
					== ((Integer) anotherObject).intValue();
			else if (anObject instanceof Double && anotherObject instanceof Double)
				return ((Double) anObject).doubleValue()
					== ((Double) anotherObject).doubleValue();
			else if (anObject instanceof String && anotherObject instanceof String)
				return anObject.equals(anotherObject);
			else if (anObject instanceof Boolean && anotherObject instanceof Boolean)
				return anObject.equals(anotherObject);

			// if the types are incompatible the result is false
			return false;
		}

		if ((anObject instanceof EEnumLiteral) && (anotherObject instanceof EEnumLiteral)) {
			return anObject == anotherObject;
		} else if ((anObject instanceof EEnumLiteral) && (anotherObject instanceof Enumerator)) {
			return ((EEnumLiteral) anObject).getInstance() == anotherObject;
		} else if ((anotherObject instanceof EEnumLiteral) && (anObject instanceof Enumerator)) {
			return ((EEnumLiteral) anotherObject).getInstance() == anObject;
		}
		
		return anObject.equals(anotherObject);
	}
	
    /**
     * Computes hash of an object, accounting for the similar
     * hashing of primitive numeric values that OCL considers equal but Java
     * does not.  It is also safe with <code>null</code> values.
     * 
     * @param anObject an object or <code>null</code>
     * 
     * @return its OCL hash
     */
	public static int hashCode(Object anObject) {
		if (anObject == null) {
			return 0;
		}

		if (isPrimitive(anObject)) {
			// equal double and integer should hash the same 
			if (anObject instanceof Integer)
				return 37 * ((Integer) anObject).intValue();
			else if (anObject instanceof Double)
				return 37 * ((Double) anObject).intValue();
			else if (anObject instanceof String)
				return anObject.hashCode();
			else if (anObject instanceof Boolean)
				return anObject.hashCode();

			// shouldn't get here (there are no other OCL primitives)
			return 0;
		}

		if (anObject instanceof EEnumLiteral) {
			return ((EEnumLiteral) anObject).getInstance().hashCode();
		}
		
		return anObject.hashCode();
	}

    /**
     * Queries whether the specified object represents an OCL primitive value.
     * 
     * @param o an object
     * @return whether it is an OCL primitive value
     */
	public static boolean isPrimitive(Object o) {
		return o instanceof Integer || o instanceof String
			|| o instanceof Boolean || o instanceof Double;
	}

}
