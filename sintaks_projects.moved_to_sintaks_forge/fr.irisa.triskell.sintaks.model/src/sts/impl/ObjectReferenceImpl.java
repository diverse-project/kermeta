/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectReferenceImpl.java,v 1.1 2006-09-26 15:28:31 dtouzet Exp $
 */
package sts.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sts.ObjectReference;
import sts.StsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sts.impl.ObjectReferenceImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectReferenceImpl extends ValueImpl implements ObjectReference {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature identifier = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StsPackage.Literals.OBJECT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (EStructuralFeature)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StsPackage.OBJECT_REFERENCE__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(EStructuralFeature newIdentifier) {
		EStructuralFeature oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StsPackage.OBJECT_REFERENCE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StsPackage.OBJECT_REFERENCE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
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
			case StsPackage.OBJECT_REFERENCE__IDENTIFIER:
				setIdentifier((EStructuralFeature)newValue);
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
			case StsPackage.OBJECT_REFERENCE__IDENTIFIER:
				setIdentifier((EStructuralFeature)null);
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
			case StsPackage.OBJECT_REFERENCE__IDENTIFIER:
				return identifier != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectReferenceImpl