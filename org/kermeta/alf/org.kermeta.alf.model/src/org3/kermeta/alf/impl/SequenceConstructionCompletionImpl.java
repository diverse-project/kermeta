/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org3.kermeta.alf.AlfPackage;
import org3.kermeta.alf.SequenceConstructionCompletion;
import org3.kermeta.alf.SequenceConstructionExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Construction Completion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org3.kermeta.alf.impl.SequenceConstructionCompletionImpl#isMultiplicityIndicator <em>Multiplicity Indicator</em>}</li>
 *   <li>{@link org3.kermeta.alf.impl.SequenceConstructionCompletionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceConstructionCompletionImpl extends EObjectImpl implements SequenceConstructionCompletion {
	/**
	 * The default value of the '{@link #isMultiplicityIndicator() <em>Multiplicity Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiplicityIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLICITY_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiplicityIndicator() <em>Multiplicity Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiplicityIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean multiplicityIndicator = MULTIPLICITY_INDICATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected SequenceConstructionExpression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceConstructionCompletionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfPackage.Literals.SEQUENCE_CONSTRUCTION_COMPLETION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiplicityIndicator() {
		return multiplicityIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityIndicator(boolean newMultiplicityIndicator) {
		boolean oldMultiplicityIndicator = multiplicityIndicator;
		multiplicityIndicator = newMultiplicityIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__MULTIPLICITY_INDICATOR, oldMultiplicityIndicator, multiplicityIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceConstructionExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(SequenceConstructionExpression newExpression, NotificationChain msgs) {
		SequenceConstructionExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(SequenceConstructionExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__MULTIPLICITY_INDICATOR:
				return isMultiplicityIndicator() ? Boolean.TRUE : Boolean.FALSE;
			case AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION:
				return getExpression();
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
			case AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__MULTIPLICITY_INDICATOR:
				setMultiplicityIndicator(((Boolean)newValue).booleanValue());
				return;
			case AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION:
				setExpression((SequenceConstructionExpression)newValue);
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
			case AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__MULTIPLICITY_INDICATOR:
				setMultiplicityIndicator(MULTIPLICITY_INDICATOR_EDEFAULT);
				return;
			case AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION:
				setExpression((SequenceConstructionExpression)null);
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
			case AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__MULTIPLICITY_INDICATOR:
				return multiplicityIndicator != MULTIPLICITY_INDICATOR_EDEFAULT;
			case AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION:
				return expression != null;
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
		result.append(" (multiplicityIndicator: ");
		result.append(multiplicityIndicator);
		result.append(')');
		return result.toString();
	}

} //SequenceConstructionCompletionImpl
