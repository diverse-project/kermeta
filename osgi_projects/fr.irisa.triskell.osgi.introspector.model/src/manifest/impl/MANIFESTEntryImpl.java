/**
 * <copyright>
 * </copyright>
 *
 * $Id: MANIFESTEntryImpl.java,v 1.3 2008-08-22 12:43:33 edaubert Exp $
 */
package manifest.impl;

import java.util.Collection;

import manifest.MANIFESTEntry;
import manifest.ManifestPackage;
import option.AttributEntry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MANIFEST Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.MANIFESTEntryImpl#getEntryName <em>Entry Name</em>}</li>
 *   <li>{@link manifest.impl.MANIFESTEntryImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MANIFESTEntryImpl extends EObjectImpl implements MANIFESTEntry {
	/**
	 * The default value of the '{@link #getEntryName() <em>Entry Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEntryName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryName() <em>Entry Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEntryName()
	 * @generated
	 * @ordered
	 */
	protected String entryName = ENTRY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributEntry> options;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MANIFESTEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.MANIFEST_ENTRY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryName() {
		return entryName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryName(String newEntryName) {
		String oldEntryName = entryName;
		entryName = newEntryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.MANIFEST_ENTRY__ENTRY_NAME, oldEntryName, entryName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributEntry> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<AttributEntry>(AttributEntry.class, this, ManifestPackage.MANIFEST_ENTRY__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManifestPackage.MANIFEST_ENTRY__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case ManifestPackage.MANIFEST_ENTRY__ENTRY_NAME:
				return getEntryName();
			case ManifestPackage.MANIFEST_ENTRY__OPTIONS:
				return getOptions();
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
			case ManifestPackage.MANIFEST_ENTRY__ENTRY_NAME:
				setEntryName((String)newValue);
				return;
			case ManifestPackage.MANIFEST_ENTRY__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends AttributEntry>)newValue);
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
			case ManifestPackage.MANIFEST_ENTRY__ENTRY_NAME:
				setEntryName(ENTRY_NAME_EDEFAULT);
				return;
			case ManifestPackage.MANIFEST_ENTRY__OPTIONS:
				getOptions().clear();
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
			case ManifestPackage.MANIFEST_ENTRY__ENTRY_NAME:
				return ENTRY_NAME_EDEFAULT == null ? entryName != null : !ENTRY_NAME_EDEFAULT.equals(entryName);
			case ManifestPackage.MANIFEST_ENTRY__OPTIONS:
				return options != null && !options.isEmpty();
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
		result.append(" (entryName: ");
		result.append(entryName);
		result.append(')');
		return result.toString();
	}

	public void addOption(AttributEntry option) {
		if (option != null && option.getToken() != null) {
			boolean exist = false;
			for (AttributEntry entry : getOptions()) {
				if (entry.getToken().equals(option.getToken())) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				getOptions().add(option);
			}
		}
	}

} // MANIFESTEntryImpl
