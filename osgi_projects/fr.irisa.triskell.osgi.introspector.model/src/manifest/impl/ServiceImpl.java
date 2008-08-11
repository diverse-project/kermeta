/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceImpl.java,v 1.4 2008-08-11 14:19:26 edaubert Exp $
 */
package manifest.impl;

import manifest.ManifestPackage;
import manifest.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.ServiceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link manifest.impl.ServiceImpl#getInterfaceReference <em>Interface Reference</em>}</li>
 *   <li>{@link manifest.impl.ServiceImpl#isResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected jar.Class interface_;

	/**
	 * The default value of the '{@link #getInterfaceReference() <em>Interface Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceReference()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceReference() <em>Interface Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceReference()
	 * @generated
	 * @ordered
	 */
	protected String interfaceReference = INTERFACE_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean resolved = RESOLVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public jar.Class getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (jar.Class)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManifestPackage.SERVICE__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public jar.Class basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(jar.Class newInterface) {
		jar.Class oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.SERVICE__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceReference() {
		return interfaceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceReference(String newInterfaceReference) {
		String oldInterfaceReference = interfaceReference;
		interfaceReference = newInterfaceReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.SERVICE__INTERFACE_REFERENCE, oldInterfaceReference, interfaceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		boolean oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.SERVICE__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.SERVICE__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case ManifestPackage.SERVICE__INTERFACE_REFERENCE:
				return getInterfaceReference();
			case ManifestPackage.SERVICE__RESOLVED:
				return isResolved() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManifestPackage.SERVICE__INTERFACE:
				setInterface((jar.Class)newValue);
				return;
			case ManifestPackage.SERVICE__INTERFACE_REFERENCE:
				setInterfaceReference((String)newValue);
				return;
			case ManifestPackage.SERVICE__RESOLVED:
				setResolved(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManifestPackage.SERVICE__INTERFACE:
				setInterface((jar.Class)null);
				return;
			case ManifestPackage.SERVICE__INTERFACE_REFERENCE:
				setInterfaceReference(INTERFACE_REFERENCE_EDEFAULT);
				return;
			case ManifestPackage.SERVICE__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ManifestPackage.SERVICE__INTERFACE:
				return interface_ != null;
			case ManifestPackage.SERVICE__INTERFACE_REFERENCE:
				return INTERFACE_REFERENCE_EDEFAULT == null ? interfaceReference != null : !INTERFACE_REFERENCE_EDEFAULT.equals(interfaceReference);
			case ManifestPackage.SERVICE__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
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
		result.append(" (interfaceReference: ");
		result.append(interfaceReference);
		result.append(", resolved: ");
		result.append(resolved);
		result.append(')');
		return result.toString();
	}

} // ServiceImpl
