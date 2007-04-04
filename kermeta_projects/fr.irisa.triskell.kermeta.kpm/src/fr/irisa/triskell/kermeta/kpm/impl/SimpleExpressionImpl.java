/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleExpressionImpl.java,v 1.1 2007-04-04 13:43:55 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NestedExpression;
import fr.irisa.triskell.kermeta.kpm.SimpleExpression;

import fr.irisa.triskell.kermeta.kpm.Unit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.SimpleExpressionImpl#getSubExpression <em>Sub Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SimpleExpressionImpl extends ExpressionImpl implements SimpleExpression {
	/**
	 * The cached value of the '{@link #getSubExpression() <em>Sub Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpression()
	 * @generated
	 * @ordered
	 */
	protected NestedExpression subExpression = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.SIMPLE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedExpression getSubExpression() {
		return subExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubExpression(NestedExpression newSubExpression, NotificationChain msgs) {
		NestedExpression oldSubExpression = subExpression;
		subExpression = newSubExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KpmPackage.SIMPLE_EXPRESSION__SUB_EXPRESSION, oldSubExpression, newSubExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubExpression(NestedExpression newSubExpression) {
		if (newSubExpression != subExpression) {
			NotificationChain msgs = null;
			if (subExpression != null)
				msgs = ((InternalEObject)subExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KpmPackage.SIMPLE_EXPRESSION__SUB_EXPRESSION, null, msgs);
			if (newSubExpression != null)
				msgs = ((InternalEObject)newSubExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KpmPackage.SIMPLE_EXPRESSION__SUB_EXPRESSION, null, msgs);
			msgs = basicSetSubExpression(newSubExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.SIMPLE_EXPRESSION__SUB_EXPRESSION, newSubExpression, newSubExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean evaluateIn(Unit unit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean evaluateOut(Unit unit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.SIMPLE_EXPRESSION__SUB_EXPRESSION:
				return basicSetSubExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.SIMPLE_EXPRESSION__SUB_EXPRESSION:
				return getSubExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KpmPackage.SIMPLE_EXPRESSION__SUB_EXPRESSION:
				setSubExpression((NestedExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case KpmPackage.SIMPLE_EXPRESSION__SUB_EXPRESSION:
				setSubExpression((NestedExpression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KpmPackage.SIMPLE_EXPRESSION__SUB_EXPRESSION:
				return subExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleExpressionImpl