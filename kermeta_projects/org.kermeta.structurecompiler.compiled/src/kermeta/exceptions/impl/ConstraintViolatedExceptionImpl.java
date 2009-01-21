/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintViolatedExceptionImpl.java,v 1.8 2009-01-21 09:15:49 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ConstraintViolatedException;
import kermeta.exceptions.ExceptionsPackage;

import kermeta.language.structure.Constraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Violated Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.exceptions.impl.ConstraintViolatedExceptionImpl#getConstraintAppliedTo <em>Constraint Applied To</em>}</li>
 *   <li>{@link kermeta.exceptions.impl.ConstraintViolatedExceptionImpl#getFailedConstraint <em>Failed Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintViolatedExceptionImpl extends ExceptionImpl implements
		ConstraintViolatedException {
	/**
	 * The cached value of the '{@link #getConstraintAppliedTo() <em>Constraint Applied To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintAppliedTo()
	 * @generated
	 * @ordered
	 */
	protected kermeta.language.structure.Object constraintAppliedTo;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintViolatedExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.CONSTRAINT_VIOLATED_EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object getConstraintAppliedTo() {
		if (constraintAppliedTo != null && constraintAppliedTo.eIsProxy()) {
			InternalEObject oldConstraintAppliedTo = (InternalEObject) constraintAppliedTo;
			constraintAppliedTo = (kermeta.language.structure.Object) eResolveProxy(oldConstraintAppliedTo);
			if (constraintAppliedTo != oldConstraintAppliedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO,
							oldConstraintAppliedTo, constraintAppliedTo));
			}
		}
		return constraintAppliedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object basicGetConstraintAppliedTo() {
		return constraintAppliedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintAppliedTo(
			kermeta.language.structure.Object newConstraintAppliedTo) {
		kermeta.language.structure.Object oldConstraintAppliedTo = constraintAppliedTo;
		constraintAppliedTo = newConstraintAppliedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO,
					oldConstraintAppliedTo, constraintAppliedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getFailedConstraint() {
		if (failedConstraint != null && failedConstraint.eIsProxy()) {
			InternalEObject oldFailedConstraint = (InternalEObject) failedConstraint;
			failedConstraint = (Constraint) eResolveProxy(oldFailedConstraint);
			if (failedConstraint != oldFailedConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT,
							oldFailedConstraint, failedConstraint));
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
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT,
					oldFailedConstraint, failedConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO:
			if (resolve)
				return getConstraintAppliedTo();
			return basicGetConstraintAppliedTo();
		case ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT:
			if (resolve)
				return getFailedConstraint();
			return basicGetFailedConstraint();
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
		case ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO:
			setConstraintAppliedTo((kermeta.language.structure.Object) newValue);
			return;
		case ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT:
			setFailedConstraint((Constraint) newValue);
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
		case ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO:
			setConstraintAppliedTo((kermeta.language.structure.Object) null);
			return;
		case ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT:
			setFailedConstraint((Constraint) null);
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
		case ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO:
			return constraintAppliedTo != null;
		case ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT:
			return failedConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintViolatedExceptionImpl
