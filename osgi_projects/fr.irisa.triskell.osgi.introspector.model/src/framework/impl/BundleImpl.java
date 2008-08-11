/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleImpl.java,v 1.4 2008-08-11 14:19:27 edaubert Exp $
 */
package framework.impl;

import jar.Folder;

import java.util.Collection;

import manifest.MANIFEST;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import framework.Bundle;
import framework.FrameworkPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link framework.impl.BundleImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link framework.impl.BundleImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link framework.impl.BundleImpl#getManifest <em>Manifest</em>}</li>
 *   <li>{@link framework.impl.BundleImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link framework.impl.BundleImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link framework.impl.BundleImpl#getFragmentsReference <em>Fragments Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleImpl extends EObjectImpl implements Bundle {
	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> fragments;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManifest() <em>Manifest</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getManifest()
	 * @generated
	 * @ordered
	 */
	protected MANIFEST manifest;

	/**
	 * The cached value of the '{@link #getFolder() <em>Folder</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
	protected Folder folder;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected jar.Package package_;

	/**
	 * The cached value of the '{@link #getFragmentsReference() <em>Fragments Reference</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragmentsReference()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fragmentsReference;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrameworkPackage.Literals.BUNDLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getFragments() {
		if (fragments == null) {
			fragments = new EObjectResolvingEList<Bundle>(Bundle.class, this, FrameworkPackage.BUNDLE__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameworkPackage.BUNDLE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MANIFEST getManifest() {
		return manifest;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManifest(MANIFEST newManifest,
			NotificationChain msgs) {
		MANIFEST oldManifest = manifest;
		manifest = newManifest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FrameworkPackage.BUNDLE__MANIFEST, oldManifest, newManifest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifest(MANIFEST newManifest) {
		if (newManifest != manifest) {
			NotificationChain msgs = null;
			if (manifest != null)
				msgs = ((InternalEObject)manifest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FrameworkPackage.BUNDLE__MANIFEST, null, msgs);
			if (newManifest != null)
				msgs = ((InternalEObject)newManifest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FrameworkPackage.BUNDLE__MANIFEST, null, msgs);
			msgs = basicSetManifest(newManifest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameworkPackage.BUNDLE__MANIFEST, newManifest, newManifest));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Folder getFolder() {
		return folder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolder(Folder newFolder,
			NotificationChain msgs) {
		Folder oldFolder = folder;
		folder = newFolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FrameworkPackage.BUNDLE__FOLDER, oldFolder, newFolder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolder(Folder newFolder) {
		if (newFolder != folder) {
			NotificationChain msgs = null;
			if (folder != null)
				msgs = ((InternalEObject)folder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FrameworkPackage.BUNDLE__FOLDER, null, msgs);
			if (newFolder != null)
				msgs = ((InternalEObject)newFolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FrameworkPackage.BUNDLE__FOLDER, null, msgs);
			msgs = basicSetFolder(newFolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameworkPackage.BUNDLE__FOLDER, newFolder, newFolder));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public jar.Package getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(jar.Package newPackage,
			NotificationChain msgs) {
		jar.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FrameworkPackage.BUNDLE__PACKAGE, oldPackage, newPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(jar.Package newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FrameworkPackage.BUNDLE__PACKAGE, null, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FrameworkPackage.BUNDLE__PACKAGE, null, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameworkPackage.BUNDLE__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFragmentsReference() {
		if (fragmentsReference == null) {
			fragmentsReference = new EDataTypeUniqueEList<String>(String.class, this, FrameworkPackage.BUNDLE__FRAGMENTS_REFERENCE);
		}
		return fragmentsReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FrameworkPackage.BUNDLE__MANIFEST:
				return basicSetManifest(null, msgs);
			case FrameworkPackage.BUNDLE__FOLDER:
				return basicSetFolder(null, msgs);
			case FrameworkPackage.BUNDLE__PACKAGE:
				return basicSetPackage(null, msgs);
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
			case FrameworkPackage.BUNDLE__FRAGMENTS:
				return getFragments();
			case FrameworkPackage.BUNDLE__LOCATION:
				return getLocation();
			case FrameworkPackage.BUNDLE__MANIFEST:
				return getManifest();
			case FrameworkPackage.BUNDLE__FOLDER:
				return getFolder();
			case FrameworkPackage.BUNDLE__PACKAGE:
				return getPackage();
			case FrameworkPackage.BUNDLE__FRAGMENTS_REFERENCE:
				return getFragmentsReference();
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
			case FrameworkPackage.BUNDLE__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends Bundle>)newValue);
				return;
			case FrameworkPackage.BUNDLE__LOCATION:
				setLocation((String)newValue);
				return;
			case FrameworkPackage.BUNDLE__MANIFEST:
				setManifest((MANIFEST)newValue);
				return;
			case FrameworkPackage.BUNDLE__FOLDER:
				setFolder((Folder)newValue);
				return;
			case FrameworkPackage.BUNDLE__PACKAGE:
				setPackage((jar.Package)newValue);
				return;
			case FrameworkPackage.BUNDLE__FRAGMENTS_REFERENCE:
				getFragmentsReference().clear();
				getFragmentsReference().addAll((Collection<? extends String>)newValue);
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
			case FrameworkPackage.BUNDLE__FRAGMENTS:
				getFragments().clear();
				return;
			case FrameworkPackage.BUNDLE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case FrameworkPackage.BUNDLE__MANIFEST:
				setManifest((MANIFEST)null);
				return;
			case FrameworkPackage.BUNDLE__FOLDER:
				setFolder((Folder)null);
				return;
			case FrameworkPackage.BUNDLE__PACKAGE:
				setPackage((jar.Package)null);
				return;
			case FrameworkPackage.BUNDLE__FRAGMENTS_REFERENCE:
				getFragmentsReference().clear();
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
			case FrameworkPackage.BUNDLE__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case FrameworkPackage.BUNDLE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case FrameworkPackage.BUNDLE__MANIFEST:
				return manifest != null;
			case FrameworkPackage.BUNDLE__FOLDER:
				return folder != null;
			case FrameworkPackage.BUNDLE__PACKAGE:
				return package_ != null;
			case FrameworkPackage.BUNDLE__FRAGMENTS_REFERENCE:
				return fragmentsReference != null && !fragmentsReference.isEmpty();
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
		result.append(" (location: ");
		result.append(location);
		result.append(", fragmentsReference: ");
		result.append(fragmentsReference);
		result.append(')');
		return result.toString();
	}

	public boolean addFragment(Bundle bundle) {
		if (!getFragments().contains(bundle)) {
			return getFragments().add(bundle);
		}
		return false;
	}

} // BundleImpl
