/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportPackageImpl.java,v 1.7 2008-08-22 12:43:33 edaubert Exp $
 */
package manifest.impl;

import java.util.Collection;

import manifest.ImportPackage;
import manifest.ManifestPackage;
import option.ImportPackageDirective;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osgi.framework.Constants;

import framework.Bundle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Import Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.ImportPackageImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.impl.ImportPackageImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link manifest.impl.ImportPackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link manifest.impl.ImportPackageImpl#getPackageReferences <em>Package References</em>}</li>
 *   <li>{@link manifest.impl.ImportPackageImpl#isResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportPackageImpl extends MANIFESTEntryImpl implements
		ImportPackage {
	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected ImportPackageDirective directives;

	/**
	 * The cached value of the '{@link #getBundle() <em>Bundle</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected Bundle bundle;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<manifest.Package> packages;

	/**
	 * The cached value of the '{@link #getPackageReferences() <em>Package References</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackageReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> packageReferences;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ImportPackageImpl() {
		super();
		this.setEntryName(Constants.IMPORT_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.IMPORT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<manifest.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectResolvingEList<manifest.Package>(manifest.Package.class, this, ManifestPackage.IMPORT_PACKAGE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPackageReferences() {
		if (packageReferences == null) {
			packageReferences = new EDataTypeUniqueEList<String>(String.class, this, ManifestPackage.IMPORT_PACKAGE__PACKAGE_REFERENCES);
		}
		return packageReferences;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ImportPackageDirective getDirectives() {
		return directives;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectives(
			ImportPackageDirective newDirectives, NotificationChain msgs) {
		ImportPackageDirective oldDirectives = directives;
		directives = newDirectives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManifestPackage.IMPORT_PACKAGE__DIRECTIVES, oldDirectives, newDirectives);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectives(ImportPackageDirective newDirectives) {
		if (newDirectives != directives) {
			NotificationChain msgs = null;
			if (directives != null)
				msgs = ((InternalEObject)directives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManifestPackage.IMPORT_PACKAGE__DIRECTIVES, null, msgs);
			if (newDirectives != null)
				msgs = ((InternalEObject)newDirectives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManifestPackage.IMPORT_PACKAGE__DIRECTIVES, null, msgs);
			msgs = basicSetDirectives(newDirectives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.IMPORT_PACKAGE__DIRECTIVES, newDirectives, newDirectives));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManifestPackage.IMPORT_PACKAGE__BUNDLE, oldBundle, bundle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.IMPORT_PACKAGE__BUNDLE, oldBundle, bundle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.IMPORT_PACKAGE__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManifestPackage.IMPORT_PACKAGE__DIRECTIVES:
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
			case ManifestPackage.IMPORT_PACKAGE__DIRECTIVES:
				return getDirectives();
			case ManifestPackage.IMPORT_PACKAGE__BUNDLE:
				if (resolve) return getBundle();
				return basicGetBundle();
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES:
				return getPackages();
			case ManifestPackage.IMPORT_PACKAGE__PACKAGE_REFERENCES:
				return getPackageReferences();
			case ManifestPackage.IMPORT_PACKAGE__RESOLVED:
				return isResolved() ? Boolean.TRUE : Boolean.FALSE;
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
			case ManifestPackage.IMPORT_PACKAGE__DIRECTIVES:
				setDirectives((ImportPackageDirective)newValue);
				return;
			case ManifestPackage.IMPORT_PACKAGE__BUNDLE:
				setBundle((Bundle)newValue);
				return;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends manifest.Package>)newValue);
				return;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGE_REFERENCES:
				getPackageReferences().clear();
				getPackageReferences().addAll((Collection<? extends String>)newValue);
				return;
			case ManifestPackage.IMPORT_PACKAGE__RESOLVED:
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
			case ManifestPackage.IMPORT_PACKAGE__DIRECTIVES:
				setDirectives((ImportPackageDirective)null);
				return;
			case ManifestPackage.IMPORT_PACKAGE__BUNDLE:
				setBundle((Bundle)null);
				return;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES:
				getPackages().clear();
				return;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGE_REFERENCES:
				getPackageReferences().clear();
				return;
			case ManifestPackage.IMPORT_PACKAGE__RESOLVED:
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
			case ManifestPackage.IMPORT_PACKAGE__DIRECTIVES:
				return directives != null;
			case ManifestPackage.IMPORT_PACKAGE__BUNDLE:
				return bundle != null;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case ManifestPackage.IMPORT_PACKAGE__PACKAGE_REFERENCES:
				return packageReferences != null && !packageReferences.isEmpty();
			case ManifestPackage.IMPORT_PACKAGE__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
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
		result.append(" (packageReferences: ");
		result.append(packageReferences);
		result.append(", resolved: ");
		result.append(resolved);
		result.append(')');
		return result.toString();
	}

	public void addPackage(manifest.Package _package) {
		if (_package != null) {
			boolean exist = false;
			for (manifest.Package p : getPackages()) {
				if (p.getReference().equals(_package.getReference())) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				getPackages().add(_package);
			}
		}

	}

	public void addPackagesReference(String reference) {
		if (reference != null) {
			if (!getPackageReferences().contains(reference)) {
				getPackageReferences().add(reference);
			}
		}

	}

} // ImportPackageImpl
