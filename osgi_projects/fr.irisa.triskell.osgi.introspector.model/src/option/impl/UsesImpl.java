/**
 * <copyright>
 * </copyright>
 *
 * $Id: UsesImpl.java,v 1.3 2008-07-31 13:43:53 edaubert Exp $
 */
package option.impl;

import java.util.Collection;

import option.OptionPackage;
import option.Uses;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link option.impl.UsesImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link option.impl.UsesImpl#getPackagesList <em>Packages List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsesImpl extends ExportPackageDirectiveImpl implements Uses {
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
	protected UsesImpl() {
		super();
		this.setToken(Constants.USES_DIRECTIVE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.USES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPackages() {
		if (packages == null) {
			packages = new EDataTypeUniqueEList<String>(String.class, this, OptionPackage.USES__PACKAGES);
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
			packagesList = new EObjectResolvingEList<jar.Package>(jar.Package.class, this, OptionPackage.USES__PACKAGES_LIST);
		}
		return packagesList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptionPackage.USES__PACKAGES:
				return getPackages();
			case OptionPackage.USES__PACKAGES_LIST:
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
			case OptionPackage.USES__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends String>)newValue);
				return;
			case OptionPackage.USES__PACKAGES_LIST:
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
			case OptionPackage.USES__PACKAGES:
				getPackages().clear();
				return;
			case OptionPackage.USES__PACKAGES_LIST:
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
			case OptionPackage.USES__PACKAGES:
				return packages != null && !packages.isEmpty();
			case OptionPackage.USES__PACKAGES_LIST:
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
		result.append(" (packages: ");
		result.append(packages);
		result.append(')');
		return result.toString();
	}

	public void addPackage(String _package) {
		if (!getPackages().contains(_package)) {
			getPackages().add(_package);
		}

	}

} // UsesImpl
