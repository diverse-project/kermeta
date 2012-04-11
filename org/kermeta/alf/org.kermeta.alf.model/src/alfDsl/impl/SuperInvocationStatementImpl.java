/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.impl;

import alfDsl.AlfDslPackage;
import alfDsl.SuperInvocationExpression;
import alfDsl.SuperInvocationStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Invocation Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alfDsl.impl.SuperInvocationStatementImpl#get_super <em>super</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuperInvocationStatementImpl extends StatementImpl implements SuperInvocationStatement {
	/**
	 * The cached value of the '{@link #get_super() <em>super</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_super()
	 * @generated
	 * @ordered
	 */
	protected SuperInvocationExpression _super;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperInvocationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfDslPackage.Literals.SUPER_INVOCATION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperInvocationExpression get_super() {
		return _super;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_super(SuperInvocationExpression new_super, NotificationChain msgs) {
		SuperInvocationExpression old_super = _super;
		_super = new_super;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.SUPER_INVOCATION_STATEMENT__SUPER, old_super, new_super);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_super(SuperInvocationExpression new_super) {
		if (new_super != _super) {
			NotificationChain msgs = null;
			if (_super != null)
				msgs = ((InternalEObject)_super).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.SUPER_INVOCATION_STATEMENT__SUPER, null, msgs);
			if (new_super != null)
				msgs = ((InternalEObject)new_super).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.SUPER_INVOCATION_STATEMENT__SUPER, null, msgs);
			msgs = basicSet_super(new_super, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.SUPER_INVOCATION_STATEMENT__SUPER, new_super, new_super));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfDslPackage.SUPER_INVOCATION_STATEMENT__SUPER:
				return basicSet_super(null, msgs);
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
			case AlfDslPackage.SUPER_INVOCATION_STATEMENT__SUPER:
				return get_super();
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
			case AlfDslPackage.SUPER_INVOCATION_STATEMENT__SUPER:
				set_super((SuperInvocationExpression)newValue);
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
			case AlfDslPackage.SUPER_INVOCATION_STATEMENT__SUPER:
				set_super((SuperInvocationExpression)null);
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
			case AlfDslPackage.SUPER_INVOCATION_STATEMENT__SUPER:
				return _super != null;
		}
		return super.eIsSet(featureID);
	}

} //SuperInvocationStatementImpl
