/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.diagnostic.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.diagnostic.Constraint;
import org.kermeta.diagnostic.ConstraintDiagnostic;
import org.kermeta.diagnostic.DiagnosticPackage;
import org.kermeta.diagnostic.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.diagnostic.impl.ConstraintDiagnosticImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.kermeta.diagnostic.impl.ConstraintDiagnosticImpl#getFailedConstraint <em>Failed Constraint</em>}</li>
 *   <li>{@link org.kermeta.diagnostic.impl.ConstraintDiagnosticImpl#isIsWarning <em>Is Warning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintDiagnosticImpl extends EObjectImpl implements ConstraintDiagnostic {
	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected Reference appliesTo;

	/**
	 * The cached value of the '{@link #getFailedConstraint() <em>Failed Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedConstraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint failedConstraint;

	/**
	 * The default value of the '{@link #isIsWarning() <em>Is Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWarning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WARNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWarning() <em>Is Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWarning()
	 * @generated
	 * @ordered
	 */
	protected boolean isWarning = IS_WARNING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintDiagnosticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagnosticPackage.Literals.CONSTRAINT_DIAGNOSTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAppliesTo() {
		if (appliesTo != null && appliesTo.eIsProxy()) {
			InternalEObject oldAppliesTo = (InternalEObject)appliesTo;
			appliesTo = (Reference)eResolveProxy(oldAppliesTo);
			if (appliesTo != oldAppliesTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__APPLIES_TO, oldAppliesTo, appliesTo));
			}
		}
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetAppliesTo() {
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesTo(Reference newAppliesTo) {
		Reference oldAppliesTo = appliesTo;
		appliesTo = newAppliesTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__APPLIES_TO, oldAppliesTo, appliesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getFailedConstraint() {
		if (failedConstraint != null && failedConstraint.eIsProxy()) {
			InternalEObject oldFailedConstraint = (InternalEObject)failedConstraint;
			failedConstraint = (Constraint)eResolveProxy(oldFailedConstraint);
			if (failedConstraint != oldFailedConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__FAILED_CONSTRAINT, oldFailedConstraint, failedConstraint));
			}
		}
		return failedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetFailedConstraint() {
		return failedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailedConstraint(Constraint newFailedConstraint) {
		Constraint oldFailedConstraint = failedConstraint;
		failedConstraint = newFailedConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__FAILED_CONSTRAINT, oldFailedConstraint, failedConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWarning() {
		return isWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWarning(boolean newIsWarning) {
		boolean oldIsWarning = isWarning;
		isWarning = newIsWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__IS_WARNING, oldIsWarning, isWarning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__APPLIES_TO:
				if (resolve) return getAppliesTo();
				return basicGetAppliesTo();
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__FAILED_CONSTRAINT:
				if (resolve) return getFailedConstraint();
				return basicGetFailedConstraint();
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__IS_WARNING:
				return isIsWarning();
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
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__APPLIES_TO:
				setAppliesTo((Reference)newValue);
				return;
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__FAILED_CONSTRAINT:
				setFailedConstraint((Constraint)newValue);
				return;
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__IS_WARNING:
				setIsWarning((Boolean)newValue);
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
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__APPLIES_TO:
				setAppliesTo((Reference)null);
				return;
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__FAILED_CONSTRAINT:
				setFailedConstraint((Constraint)null);
				return;
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__IS_WARNING:
				setIsWarning(IS_WARNING_EDEFAULT);
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
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__APPLIES_TO:
				return appliesTo != null;
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__FAILED_CONSTRAINT:
				return failedConstraint != null;
			case DiagnosticPackage.CONSTRAINT_DIAGNOSTIC__IS_WARNING:
				return isWarning != IS_WARNING_EDEFAULT;
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
		result.append(" (isWarning: ");
		result.append(isWarning);
		result.append(')');
		return result.toString();
	}

} //ConstraintDiagnosticImpl
