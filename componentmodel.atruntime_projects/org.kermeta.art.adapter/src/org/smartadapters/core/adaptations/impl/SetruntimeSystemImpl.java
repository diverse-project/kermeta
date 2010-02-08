/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.smartadapters.core.adaptations.AdaptationsPackage;
import org.smartadapters.core.adaptations.SetruntimeSystem;

import org.smartadapters.core.impl.setAdaptationImpl;

import pattern.art.DataType;

import pattern.art.instance.CompositeInstance;

import pattern.art.type.ComponentType;
import pattern.art.type.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setruntime System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeSystemImpl#getSystemToSet <em>System To Set</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeSystemImpl#getRefroot <em>Refroot</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeSystemImpl#getRefservices <em>Refservices</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeSystemImpl#getReftypes <em>Reftypes</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeSystemImpl#getRefdataTypes <em>Refdata Types</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeSystemImpl#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetruntimeSystemImpl extends setAdaptationImpl implements SetruntimeSystem {
	/**
	 * The cached value of the '{@link #getSystemToSet() <em>System To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemToSet()
	 * @generated
	 * @ordered
	 */
	protected pattern.art.System systemToSet;

	/**
	 * The cached value of the '{@link #getRefroot() <em>Refroot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefroot()
	 * @generated
	 * @ordered
	 */
	protected CompositeInstance refroot;

	/**
	 * The cached value of the '{@link #getRefservices() <em>Refservices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefservices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> refservices;

	/**
	 * The cached value of the '{@link #getReftypes() <em>Reftypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReftypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> reftypes;

	/**
	 * The cached value of the '{@link #getRefdataTypes() <em>Refdata Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefdataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> refdataTypes;

	/**
	 * The default value of the '{@link #getRefname() <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefname()
	 * @generated
	 * @ordered
	 */
	protected static final String REFNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefname() <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefname()
	 * @generated
	 * @ordered
	 */
	protected String refname = REFNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetruntimeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptationsPackage.Literals.SETRUNTIME_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pattern.art.System getSystemToSet() {
		if (systemToSet != null && systemToSet.eIsProxy()) {
			InternalEObject oldSystemToSet = (InternalEObject)systemToSet;
			systemToSet = (pattern.art.System)eResolveProxy(oldSystemToSet);
			if (systemToSet != oldSystemToSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET, oldSystemToSet, systemToSet));
			}
		}
		return systemToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pattern.art.System basicGetSystemToSet() {
		return systemToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemToSet(pattern.art.System newSystemToSet) {
		pattern.art.System oldSystemToSet = systemToSet;
		systemToSet = newSystemToSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET, oldSystemToSet, systemToSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance getRefroot() {
		if (refroot != null && refroot.eIsProxy()) {
			InternalEObject oldRefroot = (InternalEObject)refroot;
			refroot = (CompositeInstance)eResolveProxy(oldRefroot);
			if (refroot != oldRefroot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT, oldRefroot, refroot));
			}
		}
		return refroot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance basicGetRefroot() {
		return refroot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefroot(CompositeInstance newRefroot) {
		CompositeInstance oldRefroot = refroot;
		refroot = newRefroot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT, oldRefroot, refroot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getRefservices() {
		if (refservices == null) {
			refservices = new EObjectResolvingEList<Service>(Service.class, this, AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES);
		}
		return refservices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getReftypes() {
		if (reftypes == null) {
			reftypes = new EObjectResolvingEList<ComponentType>(ComponentType.class, this, AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES);
		}
		return reftypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getRefdataTypes() {
		if (refdataTypes == null) {
			refdataTypes = new EObjectResolvingEList<DataType>(DataType.class, this, AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES);
		}
		return refdataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefname() {
		return refname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefname(String newRefname) {
		String oldRefname = refname;
		refname = newRefname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIME_SYSTEM__REFNAME, oldRefname, refname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET:
				if (resolve) return getSystemToSet();
				return basicGetSystemToSet();
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT:
				if (resolve) return getRefroot();
				return basicGetRefroot();
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES:
				return getRefservices();
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES:
				return getReftypes();
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES:
				return getRefdataTypes();
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFNAME:
				return getRefname();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET:
				setSystemToSet((pattern.art.System)newValue);
				return;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT:
				setRefroot((CompositeInstance)newValue);
				return;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES:
				getRefservices().clear();
				getRefservices().addAll((Collection<? extends Service>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES:
				getReftypes().clear();
				getReftypes().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES:
				getRefdataTypes().clear();
				getRefdataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFNAME:
				setRefname((String)newValue);
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
			case AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET:
				setSystemToSet((pattern.art.System)null);
				return;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT:
				setRefroot((CompositeInstance)null);
				return;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES:
				getRefservices().clear();
				return;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES:
				getReftypes().clear();
				return;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES:
				getRefdataTypes().clear();
				return;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFNAME:
				setRefname(REFNAME_EDEFAULT);
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
			case AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET:
				return systemToSet != null;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT:
				return refroot != null;
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES:
				return refservices != null && !refservices.isEmpty();
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES:
				return reftypes != null && !reftypes.isEmpty();
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES:
				return refdataTypes != null && !refdataTypes.isEmpty();
			case AdaptationsPackage.SETRUNTIME_SYSTEM__REFNAME:
				return REFNAME_EDEFAULT == null ? refname != null : !REFNAME_EDEFAULT.equals(refname);
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
		result.append(" (refname: ");
		result.append(refname);
		result.append(')');
		return result.toString();
	}

} //SetruntimeSystemImpl
