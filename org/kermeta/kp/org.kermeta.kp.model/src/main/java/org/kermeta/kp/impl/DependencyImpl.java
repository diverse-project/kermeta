/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.kp.Dependency;
import org.kermeta.kp.KermetaProjectRef;
import org.kermeta.kp.KpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.DependencyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.DependencyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.DependencyImpl#getDepRef <em>Dep Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends NamedElementImpl implements Dependency {
	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepRef() <em>Dep Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepRef()
	 * @generated
	 * @ordered
	 */
	protected KermetaProjectRef depRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KpPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.DEPENDENCY__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.DEPENDENCY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaProjectRef getDepRef() {
		if (depRef != null && depRef.eIsProxy()) {
			InternalEObject oldDepRef = (InternalEObject)depRef;
			depRef = (KermetaProjectRef)eResolveProxy(oldDepRef);
			if (depRef != oldDepRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpPackage.DEPENDENCY__DEP_REF, oldDepRef, depRef));
			}
		}
		return depRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaProjectRef basicGetDepRef() {
		return depRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepRef(KermetaProjectRef newDepRef) {
		KermetaProjectRef oldDepRef = depRef;
		depRef = newDepRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.DEPENDENCY__DEP_REF, oldDepRef, depRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpPackage.DEPENDENCY__GROUP:
				return getGroup();
			case KpPackage.DEPENDENCY__VERSION:
				return getVersion();
			case KpPackage.DEPENDENCY__DEP_REF:
				if (resolve) return getDepRef();
				return basicGetDepRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KpPackage.DEPENDENCY__GROUP:
				setGroup((String)newValue);
				return;
			case KpPackage.DEPENDENCY__VERSION:
				setVersion((String)newValue);
				return;
			case KpPackage.DEPENDENCY__DEP_REF:
				setDepRef((KermetaProjectRef)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KpPackage.DEPENDENCY__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case KpPackage.DEPENDENCY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case KpPackage.DEPENDENCY__DEP_REF:
				setDepRef((KermetaProjectRef)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KpPackage.DEPENDENCY__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case KpPackage.DEPENDENCY__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case KpPackage.DEPENDENCY__DEP_REF:
				return depRef != null;
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
		result.append(" (group: ");
		result.append(group);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DependencyImpl
