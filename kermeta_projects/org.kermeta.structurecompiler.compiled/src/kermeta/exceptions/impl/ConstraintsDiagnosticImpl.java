/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ConstraintViolatedInv;
import kermeta.exceptions.ConstraintsDiagnostic;
import kermeta.exceptions.ExceptionsPackage;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.exceptions.impl.ConstraintsDiagnosticImpl#getSetConstraints <em>Set Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintsDiagnosticImpl extends ObjectImpl implements
		ConstraintsDiagnostic {
	/**
	 * The cached value of the '{@link #getSetConstraints() <em>Set Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetConstraints()
	 * @generated
	 * @ordered
	 */
	protected Set<ConstraintViolatedInv> setConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintsDiagnosticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.CONSTRAINTS_DIAGNOSTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Set<ConstraintViolatedInv> getSetConstraints() {
		if (setConstraints != null && setConstraints.eIsProxy()) {
			InternalEObject oldSetConstraints = (InternalEObject) setConstraints;
			setConstraints = (Set<ConstraintViolatedInv>) eResolveProxy(oldSetConstraints);
			if (setConstraints != oldSetConstraints) {
				InternalEObject newSetConstraints = (InternalEObject) setConstraints;
				NotificationChain msgs = oldSetConstraints
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
								null, null);
				if (newSetConstraints.eInternalContainer() == null) {
					msgs = newSetConstraints
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
							oldSetConstraints, setConstraints));
			}
		}
		return setConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<ConstraintViolatedInv> basicGetSetConstraints() {
		return setConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetConstraints(
			Set<ConstraintViolatedInv> newSetConstraints, NotificationChain msgs) {
		Set<ConstraintViolatedInv> oldSetConstraints = setConstraints;
		setConstraints = newSetConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
					oldSetConstraints, newSetConstraints);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetConstraints(Set<ConstraintViolatedInv> newSetConstraints) {
		if (newSetConstraints != setConstraints) {
			NotificationChain msgs = null;
			if (setConstraints != null)
				msgs = ((InternalEObject) setConstraints)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
								null, msgs);
			if (newSetConstraints != null)
				msgs = ((InternalEObject) newSetConstraints)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
								null, msgs);
			msgs = basicSetSetConstraints(newSetConstraints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
					newSetConstraints, newSetConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(ConstraintViolatedInv cons) {

		this.getSetConstraints().add(cons);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsDiagnostic initialize() {

		kermeta.exceptions.ConstraintsDiagnostic result = null;

		this
				.setSetConstraints(((kermeta.standard.Set<kermeta.exceptions.ConstraintViolatedInv>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.standard.StandardPackage.eINSTANCE
								.getSet())));

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS:
			return basicSetSetConstraints(null, msgs);
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
		case ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS:
			if (resolve)
				return getSetConstraints();
			return basicGetSetConstraints();
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
		case ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS:
			setSetConstraints((Set<ConstraintViolatedInv>) newValue);
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
		case ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS:
			setSetConstraints((Set<ConstraintViolatedInv>) null);
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
		case ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS:
			return setConstraints != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintsDiagnosticImpl
