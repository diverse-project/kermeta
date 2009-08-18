/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 207365
 * 
 * </copyright>
 *
 * $Id: SetType.java,v 1.4 2008/11/30 22:11:38 cdamus Exp $
 */
package org.eclipse.ocl.types;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.types.TypesPackage#getSetType()
 * @model
 * @generated
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface SetType<C, O>
		extends CollectionType<C, O> {

	String SINGLETON_NAME = "Set"; //$NON-NLS-1$

} // SetType
