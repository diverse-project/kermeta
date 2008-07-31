/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleClassPathImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import jar.SystemEntry;

import java.util.Collection;

import manifest.BundleClassPath;
import manifest.ManifestPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Class Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.BundleClassPathImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleClassPathImpl extends MANIFESTEntryImpl implements
		BundleClassPath {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemEntry> entries;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleClassPathImpl() {
		super();
		setEntryName(Constants.BUNDLE_CLASSPATH);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_CLASS_PATH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectResolvingEList<SystemEntry>(SystemEntry.class, this, ManifestPackage.BUNDLE_CLASS_PATH__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.BUNDLE_CLASS_PATH__ENTRIES:
				return getEntries();
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
			case ManifestPackage.BUNDLE_CLASS_PATH__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends SystemEntry>)newValue);
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
			case ManifestPackage.BUNDLE_CLASS_PATH__ENTRIES:
				getEntries().clear();
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
			case ManifestPackage.BUNDLE_CLASS_PATH__ENTRIES:
				return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void addEntry(SystemEntry entry) {
		getEntries().add(entry);

	}

} // BundleClassPathImpl
