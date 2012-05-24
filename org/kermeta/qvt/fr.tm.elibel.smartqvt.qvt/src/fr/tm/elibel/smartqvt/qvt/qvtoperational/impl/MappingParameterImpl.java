/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.impl;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingParameter;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelParameter;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingParameterImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingParameterImpl#getReferredDomain <em>Referred Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingParameterImpl extends VarParameterImpl implements MappingParameter {
	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected ModelParameter extent;

	/**
	 * The cached value of the '{@link #getReferredDomain() <em>Referred Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredDomain()
	 * @generated
	 * @ordered
	 */
	protected RelationDomain referredDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MAPPING_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParameter getExtent() {
		if (extent != null && extent.eIsProxy()) {
			InternalEObject oldExtent = (InternalEObject)extent;
			extent = (ModelParameter)eResolveProxy(oldExtent);
			if (extent != oldExtent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MAPPING_PARAMETER__EXTENT, oldExtent, extent));
			}
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParameter basicGetExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(ModelParameter newExtent) {
		ModelParameter oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_PARAMETER__EXTENT, oldExtent, extent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDomain getReferredDomain() {
		if (referredDomain != null && referredDomain.eIsProxy()) {
			InternalEObject oldReferredDomain = (InternalEObject)referredDomain;
			referredDomain = (RelationDomain)eResolveProxy(oldReferredDomain);
			if (referredDomain != oldReferredDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN, oldReferredDomain, referredDomain));
			}
		}
		return referredDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDomain basicGetReferredDomain() {
		return referredDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredDomain(RelationDomain newReferredDomain) {
		RelationDomain oldReferredDomain = referredDomain;
		referredDomain = newReferredDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN, oldReferredDomain, referredDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				if (resolve) return getExtent();
				return basicGetExtent();
			case QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN:
				if (resolve) return getReferredDomain();
				return basicGetReferredDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				setExtent((ModelParameter)newValue);
				return;
			case QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN:
				setReferredDomain((RelationDomain)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				setExtent((ModelParameter)null);
				return;
			case QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN:
				setReferredDomain((RelationDomain)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				return extent != null;
			case QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN:
				return referredDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingParameterImpl
