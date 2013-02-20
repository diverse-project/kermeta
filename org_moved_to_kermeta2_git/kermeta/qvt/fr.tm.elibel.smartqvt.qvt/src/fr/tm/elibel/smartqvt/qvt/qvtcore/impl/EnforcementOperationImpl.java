/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore.impl;

import fr.tm.elibel.smartqvt.qvt.emof.impl.ElementImpl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OperationCallExp;

import fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern;
import fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode;
import fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation;
import fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enforcement Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.EnforcementOperationImpl#getBottomPattern <em>Bottom Pattern</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.EnforcementOperationImpl#getEnforcementMode <em>Enforcement Mode</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.EnforcementOperationImpl#getOperationCallExp <em>Operation Call Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnforcementOperationImpl extends ElementImpl implements EnforcementOperation {
	/**
	 * The default value of the '{@link #getEnforcementMode() <em>Enforcement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnforcementMode()
	 * @generated
	 * @ordered
	 */
	protected static final EnforcementMode ENFORCEMENT_MODE_EDEFAULT = EnforcementMode.CREATION_LITERAL;

	/**
	 * The cached value of the '{@link #getEnforcementMode() <em>Enforcement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnforcementMode()
	 * @generated
	 * @ordered
	 */
	protected EnforcementMode enforcementMode = ENFORCEMENT_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationCallExp() <em>Operation Call Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationCallExp()
	 * @generated
	 * @ordered
	 */
	protected OperationCallExp operationCallExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnforcementOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtcorePackage.Literals.ENFORCEMENT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BottomPattern getBottomPattern() {
		if (eContainerFeatureID != QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN) return null;
		return (BottomPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBottomPattern(BottomPattern newBottomPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBottomPattern, QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomPattern(BottomPattern newBottomPattern) {
		if (newBottomPattern != eInternalContainer() || (eContainerFeatureID != QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN && newBottomPattern != null)) {
			if (EcoreUtil.isAncestor(this, newBottomPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBottomPattern != null)
				msgs = ((InternalEObject)newBottomPattern).eInverseAdd(this, QvtcorePackage.BOTTOM_PATTERN__ENFORCEMENT_OPERATION, BottomPattern.class, msgs);
			msgs = basicSetBottomPattern(newBottomPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN, newBottomPattern, newBottomPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnforcementMode getEnforcementMode() {
		return enforcementMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnforcementMode(EnforcementMode newEnforcementMode) {
		EnforcementMode oldEnforcementMode = enforcementMode;
		enforcementMode = newEnforcementMode == null ? ENFORCEMENT_MODE_EDEFAULT : newEnforcementMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtcorePackage.ENFORCEMENT_OPERATION__ENFORCEMENT_MODE, oldEnforcementMode, enforcementMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallExp getOperationCallExp() {
		if (operationCallExp != null && operationCallExp.eIsProxy()) {
			InternalEObject oldOperationCallExp = (InternalEObject)operationCallExp;
			operationCallExp = (OperationCallExp)eResolveProxy(oldOperationCallExp);
			if (operationCallExp != oldOperationCallExp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtcorePackage.ENFORCEMENT_OPERATION__OPERATION_CALL_EXP, oldOperationCallExp, operationCallExp));
			}
		}
		return operationCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallExp basicGetOperationCallExp() {
		return operationCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationCallExp(OperationCallExp newOperationCallExp) {
		OperationCallExp oldOperationCallExp = operationCallExp;
		operationCallExp = newOperationCallExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtcorePackage.ENFORCEMENT_OPERATION__OPERATION_CALL_EXP, oldOperationCallExp, operationCallExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBottomPattern((BottomPattern)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN:
				return basicSetBottomPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN:
				return eInternalContainer().eInverseRemove(this, QvtcorePackage.BOTTOM_PATTERN__ENFORCEMENT_OPERATION, BottomPattern.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN:
				return getBottomPattern();
			case QvtcorePackage.ENFORCEMENT_OPERATION__ENFORCEMENT_MODE:
				return getEnforcementMode();
			case QvtcorePackage.ENFORCEMENT_OPERATION__OPERATION_CALL_EXP:
				if (resolve) return getOperationCallExp();
				return basicGetOperationCallExp();
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
			case QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN:
				setBottomPattern((BottomPattern)newValue);
				return;
			case QvtcorePackage.ENFORCEMENT_OPERATION__ENFORCEMENT_MODE:
				setEnforcementMode((EnforcementMode)newValue);
				return;
			case QvtcorePackage.ENFORCEMENT_OPERATION__OPERATION_CALL_EXP:
				setOperationCallExp((OperationCallExp)newValue);
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
			case QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN:
				setBottomPattern((BottomPattern)null);
				return;
			case QvtcorePackage.ENFORCEMENT_OPERATION__ENFORCEMENT_MODE:
				setEnforcementMode(ENFORCEMENT_MODE_EDEFAULT);
				return;
			case QvtcorePackage.ENFORCEMENT_OPERATION__OPERATION_CALL_EXP:
				setOperationCallExp((OperationCallExp)null);
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
			case QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN:
				return getBottomPattern() != null;
			case QvtcorePackage.ENFORCEMENT_OPERATION__ENFORCEMENT_MODE:
				return enforcementMode != ENFORCEMENT_MODE_EDEFAULT;
			case QvtcorePackage.ENFORCEMENT_OPERATION__OPERATION_CALL_EXP:
				return operationCallExp != null;
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
		result.append(" (enforcementMode: ");
		result.append(enforcementMode);
		result.append(')');
		return result.toString();
	}

} //EnforcementOperationImpl
