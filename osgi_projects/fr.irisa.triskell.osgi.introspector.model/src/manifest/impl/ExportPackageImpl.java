/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExportPackageImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest.impl;

import jar.Package;

import java.util.Collection;

import manifest.ExportPackage;
import manifest.ManifestPackage;
import option.ExportPackageDirective;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Export Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link manifest.impl.ExportPackageImpl#getPackages <em>Packages</em>}</li>
 * <li>{@link manifest.impl.ExportPackageImpl#getDirectives <em>Directives</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExportPackageImpl extends MANIFESTEntryImpl implements
		ExportPackage {
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
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportPackageDirective> directives;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ExportPackageImpl() {
		super();
		this.setEntryName(Constants.EXPORT_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.EXPORT_PACKAGE;
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
					ManifestPackage.EXPORT_PACKAGE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ExportPackageDirective> getDirectives() {
		if (directives == null) {
			directives = new EObjectContainmentEList<ExportPackageDirective>(
					ExportPackageDirective.class, this,
					ManifestPackage.EXPORT_PACKAGE__DIRECTIVES);
		}
		return directives;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
			return ((InternalEList<?>) getDirectives()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
			return getPackages();
		case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
			return getDirectives();
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
		case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
			getPackages().clear();
			getPackages().addAll((Collection<? extends jar.Package>) newValue);
			return;
		case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
			getDirectives().clear();
			getDirectives().addAll(
					(Collection<? extends ExportPackageDirective>) newValue);
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
		case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
			getPackages().clear();
			return;
		case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
			getDirectives().clear();
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
		case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
			return packages != null && !packages.isEmpty();
		case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
			return directives != null && !directives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void addExportPackage(Package _package) {
		if (!getPackages().contains(_package)) {
			getPackages().add(_package);
		}

	}

	public void addDirective(ExportPackageDirective directive) {
		if (!getDirectives().contains(directive)) {
			getDirectives().add(directive);
		}

	}

} // ExportPackageImpl
