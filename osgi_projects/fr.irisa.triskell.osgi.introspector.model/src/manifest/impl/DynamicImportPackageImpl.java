/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicImportPackageImpl.java,v 1.3 2008-08-11 14:19:26 edaubert Exp $
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
 *   <li>{@link manifest.impl.DynamicImportPackageImpl#getPackagesReference <em>Packages Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicImportPackageImpl extends MANIFESTEntryImpl implements
		DynamicImportPackage {
	/**
	 * The cached value of the '{@link #getPackagesReference() <em>Packages Reference</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagesReference()
	 * @generated
	 * @ordered
	 */
	protected EList<String> packagesReference;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPackagesReference() {
		if (packagesReference == null) {
			packagesReference = new EDataTypeUniqueEList<String>(String.class, this, ManifestPackage.DYNAMIC_IMPORT_PACKAGE__PACKAGES_REFERENCE);
		}
		return packagesReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.DYNAMIC_IMPORT_PACKAGE__PACKAGES_REFERENCE:
				return getPackagesReference();
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
			case ManifestPackage.DYNAMIC_IMPORT_PACKAGE__PACKAGES_REFERENCE:
				getPackagesReference().clear();
				getPackagesReference().addAll((Collection<? extends String>)newValue);
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
			case ManifestPackage.DYNAMIC_IMPORT_PACKAGE__PACKAGES_REFERENCE:
				getPackagesReference().clear();
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
			case ManifestPackage.DYNAMIC_IMPORT_PACKAGE__PACKAGES_REFERENCE:
				return packagesReference != null && !packagesReference.isEmpty();
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
		result.append(" (packagesReference: ");
		result.append(packagesReference);
		result.append(')');
		return result.toString();
	}

	public void addPackageReference(String packageName) {
		if (!getPackagesReference().contains(packageName)) {
			getPackagesReference().add(packageName);
		}
	}

} // DynamicImportPackageImpl
