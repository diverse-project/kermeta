/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExportPackageImpl.java,v 1.5 2008-08-22 12:43:32 edaubert Exp $
 */
package manifest.impl;

import java.util.Collection;

import manifest.ExportPackage;
import manifest.ManifestPackage;
import manifest.Package;
import option.ExportPackageDirective;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Export Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.ExportPackageImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.impl.ExportPackageImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExportPackageImpl extends MANIFESTEntryImpl implements
		ExportPackage {
	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportPackageDirective> directives;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<manifest.Package> packages;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ExportPackageImpl() {
		super();
		this.setEntryName(Constants.EXPORT_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.EXPORT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<manifest.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<manifest.Package>(manifest.Package.class, this, ManifestPackage.EXPORT_PACKAGE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExportPackageDirective> getDirectives() {
		if (directives == null) {
			directives = new EObjectContainmentEList<ExportPackageDirective>(ExportPackageDirective.class, this, ManifestPackage.EXPORT_PACKAGE__DIRECTIVES);
		}
		return directives;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
				return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
			case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
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
			case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
				return getDirectives();
			case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
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
			case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
				getDirectives().clear();
				getDirectives().addAll((Collection<? extends ExportPackageDirective>)newValue);
				return;
			case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends manifest.Package>)newValue);
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
			case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
				getDirectives().clear();
				return;
			case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
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
			case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
				return directives != null && !directives.isEmpty();
			case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void addPackage(manifest.Package _package) {
		if (_package != null) {
			boolean exist = false;
			for (Package tmp :getPackages()) {
				if (tmp.getReference().equals(_package.getReference())) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				getPackages().add(_package);
			}
		}
	}

	public void addDirective(ExportPackageDirective directive) {
		if (directive != null) {
			boolean exist = false;
			for (ExportPackageDirective tmp :getDirectives()) {
				if (tmp.getToken().equals(directive.getToken())) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				getDirectives().add(directive);
			}
		}

	}

} // ExportPackageImpl
