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

import org3.kermeta.alf.AlfPackage;
import org3.kermeta.alf.InstanceCreationExpression;
import org3.kermeta.alf.InstanceCreationInvocationStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Creation Invocation Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org3.kermeta.alf.impl.InstanceCreationInvocationStatementImpl#get_new <em>new</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceCreationInvocationStatementImpl extends StatementImpl implements InstanceCreationInvocationStatement {
	/**
	 * The cached value of the '{@link #get_new() <em>new</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_new()
	 * @generated
	 * @ordered
	 */
	protected InstanceCreationExpression _new;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceCreationInvocationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfPackage.Literals.INSTANCE_CREATION_INVOCATION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCreationExpression get_new() {
		return _new;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_new(InstanceCreationExpression new_new, NotificationChain msgs) {
		InstanceCreationExpression old_new = _new;
		_new = new_new;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW, old_new, new_new);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_new(InstanceCreationExpression new_new) {
		if (new_new != _new) {
			NotificationChain msgs = null;
			if (_new != null)
				msgs = ((InternalEObject)_new).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW, null, msgs);
			if (new_new != null)
				msgs = ((InternalEObject)new_new).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW, null, msgs);
			msgs = basicSet_new(new_new, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW, new_new, new_new));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfPackage.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW:
				return basicSet_new(null, msgs);
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
			case AlfPackage.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW:
				return get_new();
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
			case AlfPackage.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW:
				set_new((InstanceCreationExpression)newValue);
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
			case AlfPackage.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW:
				set_new((InstanceCreationExpression)null);
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
			case AlfPackage.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW:
				return _new != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceCreationInvocationStatementImpl
