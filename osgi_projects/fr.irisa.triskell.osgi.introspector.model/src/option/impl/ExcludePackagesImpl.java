/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExcludePackagesImpl.java,v 1.3 2008-08-11 14:19:26 edaubert Exp $
 */
package option.impl;

import jar.Package;

import java.util.Collection;

import option.ExcludePackages;
import option.OptionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Exclude Packages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link option.impl.ExcludePackagesImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link option.impl.ExcludePackagesImpl#getPackagesReference <em>Packages Reference</em>}</li>
 *   <li>{@link option.impl.ExcludePackagesImpl#isResolved <em>Resolved</em>}</li>
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
	 * The cached value of the '{@link #getPackagesReference() <em>Packages Reference</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagesReference()
	 * @generated
	 * @ordered
	 */
	protected EList<String> packagesReference;
	/**
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean resolved = RESOLVED_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPackagesReference() {
		if (packagesReference == null) {
			packagesReference = new EDataTypeUniqueEList<String>(String.class, this, OptionPackage.EXCLUDE_PACKAGES__PACKAGES_REFERENCE);
		}
		return packagesReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		boolean oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionPackage.EXCLUDE_PACKAGES__RESOLVED, oldResolved, resolved));
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
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES_REFERENCE:
				return getPackagesReference();
			case OptionPackage.EXCLUDE_PACKAGES__RESOLVED:
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
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends jar.Package>)newValue);
				return;
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES_REFERENCE:
				getPackagesReference().clear();
				getPackagesReference().addAll((Collection<? extends String>)newValue);
				return;
			case OptionPackage.EXCLUDE_PACKAGES__RESOLVED:
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
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES:
				getPackages().clear();
				return;
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES_REFERENCE:
				getPackagesReference().clear();
				return;
			case OptionPackage.EXCLUDE_PACKAGES__RESOLVED:
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
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES:
				return packages != null && !packages.isEmpty();
			case OptionPackage.EXCLUDE_PACKAGES__PACKAGES_REFERENCE:
				return packagesReference != null && !packagesReference.isEmpty();
			case OptionPackage.EXCLUDE_PACKAGES__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packagesReference: ");
		result.append(packagesReference);
		result.append(", resolved: ");
		result.append(resolved);
		result.append(')');
		return result.toString();
	}

	public void addExcludePackage(Package _package) {
		boolean exist = false;
		for (Package tmp : getPackages()) {
			if (tmp.getFullPath().equals(_package.getFullPath())) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			getPackages().add(_package);
		}
		
	}

	public void addExcludePackageReference(String reference) {
		if (!getPackagesReference().contains(reference)) {
			getPackagesReference().add(reference);
		}
		
	}

} // ExcludePackagesImpl
