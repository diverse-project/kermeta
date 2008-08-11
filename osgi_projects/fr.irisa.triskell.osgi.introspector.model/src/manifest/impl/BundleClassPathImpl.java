/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleClassPathImpl.java,v 1.3 2008-08-11 14:19:26 edaubert Exp $
 */
package manifest.impl;

import jar.SystemEntry;

import java.util.Collection;

import manifest.BundleClassPath;
import manifest.ManifestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Class Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.BundleClassPathImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link manifest.impl.BundleClassPathImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.impl.BundleClassPathImpl#getReferences <em>References</em>}</li>
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
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_EDEFAULT = false;
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
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> references;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE_CLASS_PATH__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferences() {
		if (references == null) {
			references = new EDataTypeUniqueEList<String>(String.class, this, ManifestPackage.BUNDLE_CLASS_PATH__REFERENCES);
		}
		return references;
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
			case ManifestPackage.BUNDLE_CLASS_PATH__RESOLVED:
				return isResolved() ? Boolean.TRUE : Boolean.FALSE;
			case ManifestPackage.BUNDLE_CLASS_PATH__REFERENCES:
				return getReferences();
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
			case ManifestPackage.BUNDLE_CLASS_PATH__RESOLVED:
				setResolved(((Boolean)newValue).booleanValue());
				return;
			case ManifestPackage.BUNDLE_CLASS_PATH__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends String>)newValue);
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
			case ManifestPackage.BUNDLE_CLASS_PATH__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE_CLASS_PATH__REFERENCES:
				getReferences().clear();
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
			case ManifestPackage.BUNDLE_CLASS_PATH__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case ManifestPackage.BUNDLE_CLASS_PATH__REFERENCES:
				return references != null && !references.isEmpty();
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
		result.append(", references: ");
		result.append(references);
		result.append(')');
		return result.toString();
	}

	public void addEntry(SystemEntry entry) {
		getEntries().add(entry);
	}
	
	public void addEntryReference(String reference) {
		getReferences().add(reference);
	}

} // BundleClassPathImpl
