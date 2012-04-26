/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org3.kermeta.alf.AlfPackage;
import org3.kermeta.alf.ConditionalAndExpression;
import org3.kermeta.alf.InclusiveOrExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional And Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org3.kermeta.alf.impl.ConditionalAndExpressionImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalAndExpressionImpl extends EObjectImpl implements ConditionalAndExpression {
	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected EList<InclusiveOrExpression> exp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalAndExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlfPackage.Literals.CONDITIONAL_AND_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InclusiveOrExpression> getExp() {
		if (exp == null) {
			exp = new EObjectContainmentEList<InclusiveOrExpression>(InclusiveOrExpression.class, this, AlfPackage.CONDITIONAL_AND_EXPRESSION__EXP);
		}
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfPackage.CONDITIONAL_AND_EXPRESSION__EXP:
				return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlfPackage.CONDITIONAL_AND_EXPRESSION__EXP:
				return getExp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlfPackage.CONDITIONAL_AND_EXPRESSION__EXP:
				getExp().clear();
				getExp().addAll((Collection<? extends InclusiveOrExpression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlfPackage.CONDITIONAL_AND_EXPRESSION__EXP:
				getExp().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlfPackage.CONDITIONAL_AND_EXPRESSION__EXP:
				return exp != null && !exp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionalAndExpressionImpl
