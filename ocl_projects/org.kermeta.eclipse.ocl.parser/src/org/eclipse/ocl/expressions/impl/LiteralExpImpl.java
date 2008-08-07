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
 * $Id: LiteralExpImpl.java,v 1.1 2008-08-07 06:35:11 dvojtise Exp $
 */
package org.eclipse.ocl.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.LiteralExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class LiteralExpImpl<C> extends OCLExpressionImpl<C> implements LiteralExp<C> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.LITERAL_EXP;
	}

} //LiteralExpImpl
