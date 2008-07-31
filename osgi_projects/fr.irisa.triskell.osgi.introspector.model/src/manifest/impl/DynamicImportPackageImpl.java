/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicImportPackageImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import java.util.Collection;

import manifest.DynamicImportPackage;
import manifest.ManifestPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Dynamic Import Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.DynamicImportPackageImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicImportPackageImpl extends MANIFESTEntryImpl implements
		DynamicImportPackage {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> packages;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected DynamicImportPackageImpl() {
		super();
		setEntryName(Constants.DYNAMICIMPORT_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.DYNAMIC_IMPORT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPackages() {
		if (packages == null) {
			packages = new EDataTypeUniqueEList<String>(String.class, this, ManifestPackage.DYNAMIC_IMPORT_PACKAGE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.DYNAMIC_IMPORT_PACKAGE__PACKAGES:
				return getPackages();
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
			case ManifestPackage.DYNAMIC_IMPORT_PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends String>)newValue);
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
			case ManifestPackage.DYNAMIC_IMPORT_PACKAGE__PACKAGES:
				getPackages().clear();
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
			case ManifestPackage.DYNAMIC_IMPORT_PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
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
		result.append(" (packages: ");
		result.append(packages);
		result.append(')');
		return result.toString();
	}

	public void addPackage(String packageName) {
		if (!getPackages().contains(packageName)) {
			getPackages().add(packageName);
		}
	}

} // DynamicImportPackageImpl
