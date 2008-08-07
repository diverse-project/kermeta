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
 * $Id: AssociationClassCallExp.java,v 1.1 2008-08-07 06:35:16 dvojtise Exp $
 */
package org.eclipse.ocl.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Class Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.expressions.AssociationClassCallExp#getReferredAssociationClass <em>Referred Association Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.expressions.ExpressionsPackage#getAssociationClassCallExp()
 * @model
 * @generated
 */
public interface AssociationClassCallExp<C, P> extends NavigationCallExp<C, P> {
	/**
	 * Returns the value of the '<em><b>Referred Association Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Association Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Association Class</em>' reference.
	 * @see #setReferredAssociationClass(Object)
	 * @see org.eclipse.ocl.expressions.ExpressionsPackage#getAssociationClassCallExp_ReferredAssociationClass()
	 * @model
	 * @generated
	 */
	C getReferredAssociationClass();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.expressions.AssociationClassCallExp#getReferredAssociationClass <em>Referred Association Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Association Class</em>' reference.
	 * @see #getReferredAssociationClass()
	 * @generated
	 */
	void setReferredAssociationClass(C value);

} // AssociationClassCallExp
