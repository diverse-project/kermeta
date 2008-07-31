/**
 * <copyright>
 * </copyright>
 *
 * $Id: RequireBundleImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
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
 *   <li>{@link manifest.impl.RequireBundleImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link manifest.impl.RequireBundleImpl#getBundleElement <em>Bundle Element</em>}</li>
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
	 * The default value of the '{@link #getBundle() <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundle() <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected String bundle = BUNDLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBundleElement() <em>Bundle Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleElement()
	 * @generated
	 * @ordered
	 */
	protected Bundle bundleElement;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getBundle() {
		return bundle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundle(String newBundle) {
		String oldBundle = bundle;
		bundle = newBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.REQUIRE_BUNDLE__BUNDLE, oldBundle, bundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getBundleElement() {
		if (bundleElement != null && bundleElement.eIsProxy()) {
			InternalEObject oldBundleElement = (InternalEObject)bundleElement;
			bundleElement = (Bundle)eResolveProxy(oldBundleElement);
			if (bundleElement != oldBundleElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManifestPackage.REQUIRE_BUNDLE__BUNDLE_ELEMENT, oldBundleElement, bundleElement));
			}
		}
		return bundleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle basicGetBundleElement() {
		return bundleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundleElement(Bundle newBundleElement) {
		Bundle oldBundleElement = bundleElement;
		bundleElement = newBundleElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.REQUIRE_BUNDLE__BUNDLE_ELEMENT, oldBundleElement, bundleElement));
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
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE:
				return getBundle();
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE_ELEMENT:
				if (resolve) return getBundleElement();
				return basicGetBundleElement();
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
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE:
				setBundle((String)newValue);
				return;
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE_ELEMENT:
				setBundleElement((Bundle)newValue);
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
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE:
				setBundle(BUNDLE_EDEFAULT);
				return;
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE_ELEMENT:
				setBundleElement((Bundle)null);
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
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE:
				return BUNDLE_EDEFAULT == null ? bundle != null : !BUNDLE_EDEFAULT.equals(bundle);
			case ManifestPackage.REQUIRE_BUNDLE__BUNDLE_ELEMENT:
				return bundleElement != null;
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
		result.append(", bundle: ");
		result.append(bundle);
		result.append(')');
		return result.toString();
	}

	public void addDirective(RequireBundleDirective directive) {
		boolean exist = false;
		for (RequireBundleDirective directivetmp : getDirectives()) {
			if (directivetmp.getToken().equals(directive.getToken())) {
				exist = true;
				break;
			}

		}
		if (exist) {
			System.out
					.println("a directive with the same token already exist :"
							+ directive.getToken());
			System.out.println("the new directive  cannot be added.");
		}

	}

} // RequireBundleImpl
