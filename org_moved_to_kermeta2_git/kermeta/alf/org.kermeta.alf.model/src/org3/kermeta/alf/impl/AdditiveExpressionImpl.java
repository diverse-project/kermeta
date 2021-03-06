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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org3.kermeta.alf.AdditiveExpression;
import org3.kermeta.alf.AlfPackage;
import org3.kermeta.alf.MultiplicativeExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org3.kermeta.alf.impl.AdditiveExpressionImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org3.kermeta.alf.impl.AdditiveExpressionImpl#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditiveExpressionImpl extends EObjectImpl implements AdditiveExpression {
	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiplicativeExpression> exp;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected EList<String> op;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditiveExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlfPackage.Literals.ADDITIVE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiplicativeExpression> getExp() {
		if (exp == null) {
			exp = new EObjectContainmentEList<MultiplicativeExpression>(MultiplicativeExpression.class, this, AlfPackage.ADDITIVE_EXPRESSION__EXP);
		}
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOp() {
		if (op == null) {
			op = new EDataTypeEList<String>(String.class, this, AlfPackage.ADDITIVE_EXPRESSION__OP);
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfPackage.ADDITIVE_EXPRESSION__EXP:
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
			case AlfPackage.ADDITIVE_EXPRESSION__EXP:
				return getExp();
			case AlfPackage.ADDITIVE_EXPRESSION__OP:
				return getOp();
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
			case AlfPackage.ADDITIVE_EXPRESSION__EXP:
				getExp().clear();
				getExp().addAll((Collection<? extends MultiplicativeExpression>)newValue);
				return;
			case AlfPackage.ADDITIVE_EXPRESSION__OP:
				getOp().clear();
				getOp().addAll((Collection<? extends String>)newValue);
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
			case AlfPackage.ADDITIVE_EXPRESSION__EXP:
				getExp().clear();
				return;
			case AlfPackage.ADDITIVE_EXPRESSION__OP:
				getOp().clear();
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
			case AlfPackage.ADDITIVE_EXPRESSION__EXP:
				return exp != null && !exp.isEmpty();
			case AlfPackage.ADDITIVE_EXPRESSION__OP:
				return op != null && !op.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //AdditiveExpressionImpl
