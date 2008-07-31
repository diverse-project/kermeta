/**
 * <copyright>
 * </copyright>
 *
 * $Id: FragmentHostImpl.java,v 1.3 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import manifest.FragmentHost;
import manifest.ManifestPackage;
import option.FragmentHostDirective;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

import framework.Bundle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Fragment Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.FragmentHostImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.impl.FragmentHostImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.impl.FragmentHostImpl#getBundle <em>Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FragmentHostImpl extends MANIFESTEntryImpl implements FragmentHost {
	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected FragmentHostDirective directives;

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
	 * The cached value of the '{@link #getBundle() <em>Bundle</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected Bundle bundle;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected FragmentHostImpl() {
		super();
		this.setEntryName(Constants.FRAGMENT_HOST);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.FRAGMENT_HOST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentHostDirective getDirectives() {
		return directives;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectives(
			FragmentHostDirective newDirectives, NotificationChain msgs) {
		FragmentHostDirective oldDirectives = directives;
		directives = newDirectives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManifestPackage.FRAGMENT_HOST__DIRECTIVES, oldDirectives, newDirectives);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectives(FragmentHostDirective newDirectives) {
		if (newDirectives != directives) {
			NotificationChain msgs = null;
			if (directives != null)
				msgs = ((InternalEObject)directives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManifestPackage.FRAGMENT_HOST__DIRECTIVES, null, msgs);
			if (newDirectives != null)
				msgs = ((InternalEObject)newDirectives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManifestPackage.FRAGMENT_HOST__DIRECTIVES, null, msgs);
			msgs = basicSetDirectives(newDirectives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.FRAGMENT_HOST__DIRECTIVES, newDirectives, newDirectives));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.FRAGMENT_HOST__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getBundle() {
		if (bundle != null && bundle.eIsProxy()) {
			InternalEObject oldBundle = (InternalEObject)bundle;
			bundle = (Bundle)eResolveProxy(oldBundle);
			if (bundle != oldBundle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManifestPackage.FRAGMENT_HOST__BUNDLE, oldBundle, bundle));
			}
		}
		return bundle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle basicGetBundle() {
		return bundle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundle(Bundle newBundle) {
		Bundle oldBundle = bundle;
		bundle = newBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.FRAGMENT_HOST__BUNDLE, oldBundle, bundle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManifestPackage.FRAGMENT_HOST__DIRECTIVES:
				return basicSetDirectives(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.FRAGMENT_HOST__DIRECTIVES:
				return getDirectives();
			case ManifestPackage.FRAGMENT_HOST__RESOLVED:
				return isResolved() ? Boolean.TRUE : Boolean.FALSE;
			case ManifestPackage.FRAGMENT_HOST__BUNDLE:
				if (resolve) return getBundle();
				return basicGetBundle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManifestPackage.FRAGMENT_HOST__DIRECTIVES:
				setDirectives((FragmentHostDirective)newValue);
				return;
			case ManifestPackage.FRAGMENT_HOST__RESOLVED:
				setResolved(((Boolean)newValue).booleanValue());
				return;
			case ManifestPackage.FRAGMENT_HOST__BUNDLE:
				setBundle((Bundle)newValue);
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
			case ManifestPackage.FRAGMENT_HOST__DIRECTIVES:
				setDirectives((FragmentHostDirective)null);
				return;
			case ManifestPackage.FRAGMENT_HOST__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case ManifestPackage.FRAGMENT_HOST__BUNDLE:
				setBundle((Bundle)null);
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
			case ManifestPackage.FRAGMENT_HOST__DIRECTIVES:
				return directives != null;
			case ManifestPackage.FRAGMENT_HOST__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case ManifestPackage.FRAGMENT_HOST__BUNDLE:
				return bundle != null;
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
		result.append(" (resolved: ");
		result.append(resolved);
		result.append(')');
		return result.toString();
	}

} // FragmentHostImpl
