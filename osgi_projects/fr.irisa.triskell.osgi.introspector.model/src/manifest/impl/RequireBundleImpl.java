/**
 * <copyright>
 * </copyright>
 *
 * $Id: RequireBundleImpl.java,v 1.4 2008-08-11 14:19:26 edaubert Exp $
 */
package manifest.impl;

import framework.Bundle;
import java.util.Collection;

import manifest.ManifestPackage;
import manifest.RequireBundle;
import option.RequireBundleDirective;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Require Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.RequireBundleImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.impl.RequireBundleImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.impl.RequireBundleImpl#getBundleReference <em>Bundle Reference</em>}</li>
 *   <li>{@link manifest.impl.RequireBundleImpl#getBundle <em>Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequireBundleImpl extends MANIFESTEntryImpl implements
		RequireBundle {
	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<RequireBundleDirective> directives;

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
	 * The default value of the '{@link #getBundleReference() <em>Bundle Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleReference()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLE_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundleReference() <em>Bundle Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleReference()
	 * @generated
	 * @ordered
	 */
	protected String bundleReference = BUNDLE_REFERENCE_EDEFAULT;

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
	protected RequireBundleImpl() {
		super();
		this.setEntryName(Constants.REQUIRE_BUNDLE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.REQUIRE_BUNDLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequireBundleDirective> getDirectives() {
		if (directives == null) {
			directives = new EObjectContainmentEList<RequireBundleDirective>(RequireBundleDirective.class, this, ManifestPackage.REQUIRE_BUNDLE__DIRECTIVES);
		}
		return directives;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.REQUIRE_BUNDLE__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBundleReference() {
		return bundleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundleReference(String newBundleReference) {
		String oldBundleReference = bundleReference;
		bundleReference = newBundleReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.REQUIRE_BUNDLE__BUNDLE_REFERENCE, oldBundleReference, bundleReference));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManifestPackage.REQUIRE_BUNDLE__BUNDLE, oldBundle, bundle));
			}
		}
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle basicGetBundle() {
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundle(Bundle newBundle) {
		Bundle oldBundle = bundle;
		bundle = newBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.REQUIRE_BUNDLE__BUNDLE, oldBundle, bundle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManifestPackage.REQUIRE_BUNDLE__DIRECTIVES:
				return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
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
			case ManifestPackage.REQUIRE_BUNDLE__DIRECTIVES:
				return getDirectives();
			case ManifestPackage.REQUIRE_BUNDLE__RESOLVED:
				return isResolved() ? Boolean.TRUE : Boolean.FALSE;
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE_REFERENCE:
				return getBundleReference();
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE:
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
			case ManifestPackage.REQUIRE_BUNDLE__DIRECTIVES:
				getDirectives().clear();
				getDirectives().addAll((Collection<? extends RequireBundleDirective>)newValue);
				return;
			case ManifestPackage.REQUIRE_BUNDLE__RESOLVED:
				setResolved(((Boolean)newValue).booleanValue());
				return;
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE_REFERENCE:
				setBundleReference((String)newValue);
				return;
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE:
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
			case ManifestPackage.REQUIRE_BUNDLE__DIRECTIVES:
				getDirectives().clear();
				return;
			case ManifestPackage.REQUIRE_BUNDLE__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE_REFERENCE:
				setBundleReference(BUNDLE_REFERENCE_EDEFAULT);
				return;
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE:
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
			case ManifestPackage.REQUIRE_BUNDLE__DIRECTIVES:
				return directives != null && !directives.isEmpty();
			case ManifestPackage.REQUIRE_BUNDLE__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE_REFERENCE:
				return BUNDLE_REFERENCE_EDEFAULT == null ? bundleReference != null : !BUNDLE_REFERENCE_EDEFAULT.equals(bundleReference);
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE:
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
		result.append(", bundleReference: ");
		result.append(bundleReference);
		result.append(')');
		return result.toString();
	}

	public void addDirective(RequireBundleDirective directive) {
		boolean exist = false;
		for (RequireBundleDirective directivetmp : getDirectives()) {
			if (directivetmp.getToken().equals(directive.getToken())) {
				exist = true;
			}

		}
		if (!exist) {
			getDirectives().add(directive);
		}

	}

} // RequireBundleImpl
