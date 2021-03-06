/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kompren.slicing.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.kompren.slicing.SlicedElement;
import org.kermeta.kompren.slicing.SlicingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sliced Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kompren.slicing.impl.SlicedElementImpl#isIsOption <em>Is Option</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.impl.SlicedElementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.impl.SlicedElementImpl#getExpOnRemove <em>Exp On Remove</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SlicedElementImpl extends EObjectImpl implements SlicedElement {
	/**
	 * The default value of the '{@link #isIsOption() <em>Is Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOption() <em>Is Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOption()
	 * @generated
	 * @ordered
	 */
	protected boolean isOption = IS_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpOnRemove() <em>Exp On Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpOnRemove()
	 * @generated
	 * @ordered
	 */
	protected static final String EXP_ON_REMOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpOnRemove() <em>Exp On Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpOnRemove()
	 * @generated
	 * @ordered
	 */
	protected String expOnRemove = EXP_ON_REMOVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlicedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlicingPackage.Literals.SLICED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOption() {
		return isOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOption(boolean newIsOption) {
		boolean oldIsOption = isOption;
		isOption = newIsOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_ELEMENT__IS_OPTION, oldIsOption, isOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_ELEMENT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpOnRemove() {
		return expOnRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpOnRemove(String newExpOnRemove) {
		String oldExpOnRemove = expOnRemove;
		expOnRemove = newExpOnRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_ELEMENT__EXP_ON_REMOVE, oldExpOnRemove, expOnRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlicingPackage.SLICED_ELEMENT__IS_OPTION:
				return isIsOption();
			case SlicingPackage.SLICED_ELEMENT__EXPRESSION:
				return getExpression();
			case SlicingPackage.SLICED_ELEMENT__EXP_ON_REMOVE:
				return getExpOnRemove();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SlicingPackage.SLICED_ELEMENT__IS_OPTION:
				setIsOption((Boolean)newValue);
				return;
			case SlicingPackage.SLICED_ELEMENT__EXPRESSION:
				setExpression((String)newValue);
				return;
			case SlicingPackage.SLICED_ELEMENT__EXP_ON_REMOVE:
				setExpOnRemove((String)newValue);
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
			case SlicingPackage.SLICED_ELEMENT__IS_OPTION:
				setIsOption(IS_OPTION_EDEFAULT);
				return;
			case SlicingPackage.SLICED_ELEMENT__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case SlicingPackage.SLICED_ELEMENT__EXP_ON_REMOVE:
				setExpOnRemove(EXP_ON_REMOVE_EDEFAULT);
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
			case SlicingPackage.SLICED_ELEMENT__IS_OPTION:
				return isOption != IS_OPTION_EDEFAULT;
			case SlicingPackage.SLICED_ELEMENT__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case SlicingPackage.SLICED_ELEMENT__EXP_ON_REMOVE:
				return EXP_ON_REMOVE_EDEFAULT == null ? expOnRemove != null : !EXP_ON_REMOVE_EDEFAULT.equals(expOnRemove);
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
		result.append(" (isOption: ");
		result.append(isOption);
		result.append(", expression: ");
		result.append(expression);
		result.append(", expOnRemove: ");
		result.append(expOnRemove);
		result.append(')');
		return result.toString();
	}

} //SlicedElementImpl
