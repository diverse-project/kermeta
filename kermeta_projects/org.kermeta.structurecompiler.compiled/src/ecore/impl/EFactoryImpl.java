/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package ecore.impl;

import ecore.EDataType;
import ecore.EFactory;
import ecore.EObject;
import ecore.EPackage;
import ecore.EcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFactory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EFactoryImpl#getEPackage <em>EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EFactoryImpl extends EModelElementImpl implements EFactory {
	/**
	 * The cached value of the '{@link #getEPackage() <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage ePackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EFACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getEPackage() {
		if (ePackage != null && ePackage.eIsProxy()) {
			InternalEObject oldEPackage = (InternalEObject) ePackage;
			ePackage = (EPackage) eResolveProxy(oldEPackage);
			if (ePackage != oldEPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.EFACTORY__EPACKAGE, oldEPackage,
							ePackage));
			}
		}
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetEPackage() {
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEPackage(EPackage newEPackage,
			NotificationChain msgs) {
		EPackage oldEPackage = ePackage;
		ePackage = newEPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EcorePackage.EFACTORY__EPACKAGE,
					oldEPackage, newEPackage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEPackage(EPackage newEPackage) {
		if (newEPackage != ePackage) {
			NotificationChain msgs = null;
			if (ePackage != null)
				msgs = ((InternalEObject) ePackage).eInverseRemove(this,
						EcorePackage.EPACKAGE__EFACTORY_INSTANCE,
						EPackage.class, msgs);
			if (newEPackage != null)
				msgs = ((InternalEObject) newEPackage).eInverseAdd(this,
						EcorePackage.EPACKAGE__EFACTORY_INSTANCE,
						EPackage.class, msgs);
			msgs = basicSetEPackage(newEPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EFACTORY__EPACKAGE, newEPackage, newEPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String literalValue) {
		java.lang.Object result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		java.lang.String result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(ecore.EClass eClass) {
		ecore.EObject result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.EFACTORY__EPACKAGE:
			if (ePackage != null)
				msgs = ((InternalEObject) ePackage).eInverseRemove(this,
						EcorePackage.EPACKAGE__EFACTORY_INSTANCE,
						EPackage.class, msgs);
			return basicSetEPackage((EPackage) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.EFACTORY__EPACKAGE:
			return basicSetEPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcorePackage.EFACTORY__EPACKAGE:
			if (resolve)
				return getEPackage();
			return basicGetEPackage();
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
		case EcorePackage.EFACTORY__EPACKAGE:
			setEPackage((EPackage) newValue);
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
		case EcorePackage.EFACTORY__EPACKAGE:
			setEPackage((EPackage) null);
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
		case EcorePackage.EFACTORY__EPACKAGE:
			return ePackage != null;
		}
		return super.eIsSet(featureID);
	}

} //EFactoryImpl
