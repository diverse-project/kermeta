/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExcludePackagesImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package option.impl;

import jar.Package;

import java.util.Collection;

import option.ExcludePackages;
import option.OptionPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Exclude Packages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link option.impl.ExcludePackagesImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExcludePackagesImpl extends ActivationPolicyDirectiveImpl
		implements ExcludePackages {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<jar.Package> packages;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ExcludePackagesImpl() {
		super();
		this.setToken(Constants.EXCLUDE_DIRECTIVE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.EXCLUDE_PACKAGES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<jar.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectResolvingEList<jar.Package>(jar.Package.class, this, OptionPackage.EXCLUDE_PACKAGES__PACKAGES);
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
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES:
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
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends jar.Package>)newValue);
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
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES:
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
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES:
				return packages != null && !packages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void addExcludePackage(Package _package) {
		getPackages().add(_package);
		
	}

} // ExcludePackagesImpl
