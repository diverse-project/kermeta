/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2.impl;

import art2.Art2Package;
import art2.Port;
import art2.PortTypeRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art2.impl.PortImpl#getPortTypeRef <em>Port Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends NamedElementImpl implements Port {
	/**
	 * The cached value of the '{@link #getPortTypeRef() <em>Port Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortTypeRef()
	 * @generated
	 * @ordered
	 */
	protected PortTypeRef portTypeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeRef getPortTypeRef() {
		if (portTypeRef != null && portTypeRef.eIsProxy()) {
			InternalEObject oldPortTypeRef = (InternalEObject)portTypeRef;
			portTypeRef = (PortTypeRef)eResolveProxy(oldPortTypeRef);
			if (portTypeRef != oldPortTypeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2Package.PORT__PORT_TYPE_REF, oldPortTypeRef, portTypeRef));
			}
		}
		return portTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeRef basicGetPortTypeRef() {
		return portTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortTypeRef(PortTypeRef newPortTypeRef) {
		PortTypeRef oldPortTypeRef = portTypeRef;
		portTypeRef = newPortTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.PORT__PORT_TYPE_REF, oldPortTypeRef, portTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.PORT__PORT_TYPE_REF:
				if (resolve) return getPortTypeRef();
				return basicGetPortTypeRef();
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
			case Art2Package.PORT__PORT_TYPE_REF:
				setPortTypeRef((PortTypeRef)newValue);
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
			case Art2Package.PORT__PORT_TYPE_REF:
				setPortTypeRef((PortTypeRef)null);
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
			case Art2Package.PORT__PORT_TYPE_REF:
				return portTypeRef != null;
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
