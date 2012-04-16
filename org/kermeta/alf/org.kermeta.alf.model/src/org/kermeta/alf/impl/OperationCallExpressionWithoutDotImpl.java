/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.alf.AlfPackage;
import org.kermeta.alf.OperationCallExpressionWithoutDot;
import org.kermeta.alf.SuffixExpression;
import org.kermeta.alf.Tuple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call Expression Without Dot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.alf.impl.OperationCallExpressionWithoutDotImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.kermeta.alf.impl.OperationCallExpressionWithoutDotImpl#getTuple <em>Tuple</em>}</li>
 *   <li>{@link org.kermeta.alf.impl.OperationCallExpressionWithoutDotImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationCallExpressionWithoutDotImpl extends EObjectImpl implements OperationCallExpressionWithoutDot {
	/**
	 * The default value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected String operationName = OPERATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTuple() <em>Tuple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuple()
	 * @generated
	 * @ordered
	 */
	protected Tuple tuple;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected SuffixExpression suffix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallExpressionWithoutDotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfPackage.Literals.OPERATION_CALL_EXPRESSION_WITHOUT_DOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationName() {
		return operationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationName(String newOperationName) {
		String oldOperationName = operationName;
		operationName = newOperationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__OPERATION_NAME, oldOperationName, operationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple getTuple() {
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTuple(Tuple newTuple, NotificationChain msgs) {
		Tuple oldTuple = tuple;
		tuple = newTuple;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE, oldTuple, newTuple);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTuple(Tuple newTuple) {
		if (newTuple != tuple) {
			NotificationChain msgs = null;
			if (tuple != null)
				msgs = ((InternalEObject)tuple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE, null, msgs);
			if (newTuple != null)
				msgs = ((InternalEObject)newTuple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE, null, msgs);
			msgs = basicSetTuple(newTuple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE, newTuple, newTuple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuffixExpression getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuffix(SuffixExpression newSuffix, NotificationChain msgs) {
		SuffixExpression oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX, oldSuffix, newSuffix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffix(SuffixExpression newSuffix) {
		if (newSuffix != suffix) {
			NotificationChain msgs = null;
			if (suffix != null)
				msgs = ((InternalEObject)suffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX, null, msgs);
			if (newSuffix != null)
				msgs = ((InternalEObject)newSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX, null, msgs);
			msgs = basicSetSuffix(newSuffix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX, newSuffix, newSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE:
				return basicSetTuple(null, msgs);
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX:
				return basicSetSuffix(null, msgs);
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
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__OPERATION_NAME:
				return getOperationName();
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE:
				return getTuple();
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX:
				return getSuffix();
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
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__OPERATION_NAME:
				setOperationName((String)newValue);
				return;
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE:
				setTuple((Tuple)newValue);
				return;
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX:
				setSuffix((SuffixExpression)newValue);
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
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__OPERATION_NAME:
				setOperationName(OPERATION_NAME_EDEFAULT);
				return;
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE:
				setTuple((Tuple)null);
				return;
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX:
				setSuffix((SuffixExpression)null);
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
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__OPERATION_NAME:
				return OPERATION_NAME_EDEFAULT == null ? operationName != null : !OPERATION_NAME_EDEFAULT.equals(operationName);
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE:
				return tuple != null;
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX:
				return suffix != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operationName: ");
		result.append(operationName);
		result.append(')');
		return result.toString();
	}

} //OperationCallExpressionWithoutDotImpl
