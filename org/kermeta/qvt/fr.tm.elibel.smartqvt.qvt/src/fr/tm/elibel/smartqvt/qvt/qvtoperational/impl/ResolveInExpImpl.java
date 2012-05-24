/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.impl;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveInExp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolve In Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ResolveInExpImpl#getInMapping <em>In Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResolveInExpImpl extends ResolveExpImpl implements ResolveInExp {
	/**
	 * The cached value of the '{@link #getInMapping() <em>In Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMapping()
	 * @generated
	 * @ordered
	 */
	protected MappingOperation inMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolveInExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.RESOLVE_IN_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingOperation getInMapping() {
		if (inMapping != null && inMapping.eIsProxy()) {
			InternalEObject oldInMapping = (InternalEObject)inMapping;
			inMapping = (MappingOperation)eResolveProxy(oldInMapping);
			if (inMapping != oldInMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.RESOLVE_IN_EXP__IN_MAPPING, oldInMapping, inMapping));
			}
		}
		return inMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingOperation basicGetInMapping() {
		return inMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMapping(MappingOperation newInMapping) {
		MappingOperation oldInMapping = inMapping;
		inMapping = newInMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.RESOLVE_IN_EXP__IN_MAPPING, oldInMapping, inMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtoperationalPackage.RESOLVE_IN_EXP__IN_MAPPING:
				if (resolve) return getInMapping();
				return basicGetInMapping();
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
			case QvtoperationalPackage.RESOLVE_IN_EXP__IN_MAPPING:
				setInMapping((MappingOperation)newValue);
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
			case QvtoperationalPackage.RESOLVE_IN_EXP__IN_MAPPING:
				setInMapping((MappingOperation)null);
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
			case QvtoperationalPackage.RESOLVE_IN_EXP__IN_MAPPING:
				return inMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //ResolveInExpImpl
