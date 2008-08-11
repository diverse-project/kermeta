/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExportPackageImpl.java,v 1.3 2008-08-11 14:19:26 edaubert Exp $
 */
package manifest.impl;

import jar.Package;

import java.util.Collection;

import manifest.ExportPackage;
import manifest.ManifestPackage;
import option.ExportPackageDirective;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link manifest.impl.ExportPackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link manifest.impl.ExportPackageImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.impl.ExportPackageImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.impl.ExportPackageImpl#getPackageReference <em>Package Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExportPackageImpl extends MANIFESTEntryImpl implements
		ExportPackage {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<jar.Package> packages;

	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportPackageDirective> directives;

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
	 * The cached value of the '{@link #getPackageReference() <em>Package Reference</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageReference()
	 * @generated
	 * @ordered
	 */
	protected EList<String> packageReference;

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
	public EList<jar.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectResolvingEList<jar.Package>(jar.Package.class, this, ManifestPackage.EXPORT_PACKAGE__PACKAGES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.EXPORT_PACKAGE__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPackageReference() {
		if (packageReference == null) {
			packageReference = new EDataTypeUniqueEList<String>(String.class, this, ManifestPackage.EXPORT_PACKAGE__PACKAGE_REFERENCE);
		}
		return packageReference;
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
			case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
				return getPackages();
			case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
				return getDirectives();
			case ManifestPackage.EXPORT_PACKAGE__RESOLVED:
				return isResolved() ? Boolean.TRUE : Boolean.FALSE;
			case ManifestPackage.EXPORT_PACKAGE__PACKAGE_REFERENCE:
				return getPackageReference();
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
			case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends jar.Package>)newValue);
				return;
			case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
				getDirectives().clear();
				getDirectives().addAll((Collection<? extends ExportPackageDirective>)newValue);
				return;
			case ManifestPackage.EXPORT_PACKAGE__RESOLVED:
				setResolved(((Boolean)newValue).booleanValue());
				return;
			case ManifestPackage.EXPORT_PACKAGE__PACKAGE_REFERENCE:
				getPackageReference().clear();
				getPackageReference().addAll((Collection<? extends String>)newValue);
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
			case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
				getPackages().clear();
				return;
			case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
				getDirectives().clear();
				return;
			case ManifestPackage.EXPORT_PACKAGE__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case ManifestPackage.EXPORT_PACKAGE__PACKAGE_REFERENCE:
				getPackageReference().clear();
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
			case ManifestPackage.EXPORT_PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case ManifestPackage.EXPORT_PACKAGE__DIRECTIVES:
				return directives != null && !directives.isEmpty();
			case ManifestPackage.EXPORT_PACKAGE__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case ManifestPackage.EXPORT_PACKAGE__PACKAGE_REFERENCE:
				return packageReference != null && !packageReference.isEmpty();
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
		result.append(" (resolved: ");
		result.append(resolved);
		result.append(", packageReference: ");
		result.append(packageReference);
		result.append(')');
		return result.toString();
	}

	public void addExportPackage(Package _package) {
		if (!getPackages().contains(_package)) {
			getPackages().add(_package);
		}
	}
	
	public void addExportPackageReference(String reference) {
		if (!getPackageReference().contains(reference)) {
			getPackageReference().add(reference);
		}
	}

	public void addDirective(ExportPackageDirective directive) {
		if (!getDirectives().contains(directive)) {
			getDirectives().add(directive);
		}

	}

} // ExportPackageImpl
