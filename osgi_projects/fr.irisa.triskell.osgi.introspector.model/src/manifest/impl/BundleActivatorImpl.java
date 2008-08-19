/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleActivatorImpl.java,v 1.3 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleActivator;
import manifest.ManifestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Activator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.BundleActivatorImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link manifest.impl.BundleActivatorImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.impl.BundleActivatorImpl#getActivator <em>Activator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleActivatorImpl extends MANIFESTEntryImpl implements
		BundleActivator {
	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected String reference = REFERENCE_EDEFAULT;
	/**
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean resolved = RESOLVED_EDEFAULT;
	/**
	 * The cached value of the '{@link #getActivator() <em>Activator</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActivator()
	 * @generated
	 * @ordered
	 */
	protected jar.Class activator;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleActivatorImpl() {
		super();
		this.setEntryName(Constants.BUNDLE_ACTIVATOR);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_ACTIVATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE_ACTIVATOR__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		boolean oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE_ACTIVATOR__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public jar.Class getActivator() {
		if (activator != null && activator.eIsProxy()) {
			InternalEObject oldActivator = (InternalEObject)activator;
			activator = (jar.Class)eResolveProxy(oldActivator);
			if (activator != oldActivator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManifestPackage.BUNDLE_ACTIVATOR__ACTIVATOR, oldActivator, activator));
			}
		}
		return activator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public jar.Class basicGetActivator() {
		return activator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivator(jar.Class newActivator) {
		jar.Class oldActivator = activator;
		activator = newActivator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE_ACTIVATOR__ACTIVATOR, oldActivator, activator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.BUNDLE_ACTIVATOR__REFERENCE:
				return getReference();
			case ManifestPackage.BUNDLE_ACTIVATOR__RESOLVED:
				return isResolved() ? Boolean.TRUE : Boolean.FALSE;
			case ManifestPackage.BUNDLE_ACTIVATOR__ACTIVATOR:
				if (resolve) return getActivator();
				return basicGetActivator();
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
			case ManifestPackage.BUNDLE_ACTIVATOR__REFERENCE:
				setReference((String)newValue);
				return;
			case ManifestPackage.BUNDLE_ACTIVATOR__RESOLVED:
				setResolved(((Boolean)newValue).booleanValue());
				return;
			case ManifestPackage.BUNDLE_ACTIVATOR__ACTIVATOR:
				setActivator((jar.Class)newValue);
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
			case ManifestPackage.BUNDLE_ACTIVATOR__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE_ACTIVATOR__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE_ACTIVATOR__ACTIVATOR:
				setActivator((jar.Class)null);
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
			case ManifestPackage.BUNDLE_ACTIVATOR__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case ManifestPackage.BUNDLE_ACTIVATOR__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case ManifestPackage.BUNDLE_ACTIVATOR__ACTIVATOR:
				return activator != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (reference: ");
		result.append(reference);
		result.append(", resolved: ");
		result.append(resolved);
		result.append(')');
		return result.toString();
	}

} // BundleActivatorImpl
