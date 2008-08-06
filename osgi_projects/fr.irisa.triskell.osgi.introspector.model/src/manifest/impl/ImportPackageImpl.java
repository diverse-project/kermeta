/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportPackageImpl.java,v 1.3 2008-08-06 13:37:23 edaubert Exp $
 */
package manifest.impl;

import jar.Package;

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

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Import Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.ImportPackageImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.impl.ImportPackageImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.impl.ImportPackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link manifest.impl.ImportPackageImpl#getPackagesList <em>Packages List</em>}</li>
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
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> packages;

	/**
	 * The cached value of the '{@link #getPackagesList() <em>Packages List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagesList()
	 * @generated
	 * @ordered
	 */
	protected EList<jar.Package> packagesList;

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
	public EList<String> getPackages() {
		if (packages == null) {
			packages = new EDataTypeUniqueEList<String>(String.class, this, ManifestPackage.IMPORT_PACKAGE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<jar.Package> getPackagesList() {
		if (packagesList == null) {
			packagesList = new EObjectResolvingEList<jar.Package>(jar.Package.class, this, ManifestPackage.IMPORT_PACKAGE__PACKAGES_LIST);
		}
		return packagesList;
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
			case ManifestPackage.IMPORT_PACKAGE__RESOLVED:
				return isResolved() ? Boolean.TRUE : Boolean.FALSE;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES:
				return getPackages();
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES_LIST:
				return getPackagesList();
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
			case ManifestPackage.IMPORT_PACKAGE__RESOLVED:
				setResolved(((Boolean)newValue).booleanValue());
				return;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends String>)newValue);
				return;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES_LIST:
				getPackagesList().clear();
				getPackagesList().addAll((Collection<? extends jar.Package>)newValue);
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
			case ManifestPackage.IMPORT_PACKAGE__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES:
				getPackages().clear();
				return;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES_LIST:
				getPackagesList().clear();
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
			case ManifestPackage.IMPORT_PACKAGE__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case ManifestPackage.IMPORT_PACKAGE__PACKAGES_LIST:
				return packagesList != null && !packagesList.isEmpty();
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
		result.append(", packages: ");
		result.append(packages);
		result.append(')');
		return result.toString();
	}

	public void addPackage(String value) {
		if (!getPackages().contains(value)) {
			getPackages().add(value);
		}

	}

	public void addPackageReference(Package _package) {
		boolean exist = false;
		for (Package p : getPackagesList()) {
			if (p.getFullPath().equals(_package.getFullPath())) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			getPackagesList().add(_package);
		}
		
	}

} // ImportPackageImpl
