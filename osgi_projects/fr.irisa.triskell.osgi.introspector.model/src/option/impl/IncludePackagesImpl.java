/**
 * <copyright>
 * </copyright>
 *
 * $Id: IncludePackagesImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package option.impl;

import java.util.Collection;

import option.IncludePackages;
import option.OptionPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Include Packages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link option.impl.IncludePackagesImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IncludePackagesImpl extends ActivationPolicyDirectiveImpl
		implements IncludePackages {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<jar.Package> packages;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected IncludePackagesImpl() {
		super();
		this.setToken(Constants.INCLUDE_DIRECTIVE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.INCLUDE_PACKAGES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<jar.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectResolvingEList<jar.Package>(
					jar.Package.class, this,
					OptionPackage.INCLUDE_PACKAGES__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptionPackage.INCLUDE_PACKAGES__PACKAGES:
			return getPackages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OptionPackage.INCLUDE_PACKAGES__PACKAGES:
			getPackages().clear();
			getPackages().addAll((Collection<? extends jar.Package>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case OptionPackage.INCLUDE_PACKAGES__PACKAGES:
			getPackages().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case OptionPackage.INCLUDE_PACKAGES__PACKAGES:
			return packages != null && !packages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // IncludePackagesImpl
