/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package ecore.impl;

import ecore.EClassifier;
import ecore.EGenericType;
import ecore.ETypeParameter;
import ecore.EcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EGeneric Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EGenericTypeImpl#getEUpperBound <em>EUpper Bound</em>}</li>
 *   <li>{@link ecore.impl.EGenericTypeImpl#getETypeArguments <em>EType Arguments</em>}</li>
 *   <li>{@link ecore.impl.EGenericTypeImpl#getEClassifier <em>EClassifier</em>}</li>
 *   <li>{@link ecore.impl.EGenericTypeImpl#getETypeParameter <em>EType Parameter</em>}</li>
 *   <li>{@link ecore.impl.EGenericTypeImpl#getELowerBound <em>ELower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EGenericTypeImpl extends EObjectImpl implements EGenericType {
	/**
	 * The cached value of the '{@link #getEUpperBound() <em>EUpper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUpperBound()
	 * @generated
	 * @ordered
	 */
	protected EGenericType eUpperBound;

	/**
	 * The cached value of the '{@link #getETypeArguments() <em>EType Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eTypeArguments;

	/**
	 * The cached value of the '{@link #getEClassifier() <em>EClassifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassifier()
	 * @generated
	 * @ordered
	 */
	protected EClassifier eClassifier;

	/**
	 * The cached value of the '{@link #getETypeParameter() <em>EType Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeParameter()
	 * @generated
	 * @ordered
	 */
	protected ETypeParameter eTypeParameter;

	/**
	 * The cached value of the '{@link #getELowerBound() <em>ELower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELowerBound()
	 * @generated
	 * @ordered
	 */
	protected EGenericType eLowerBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EGenericTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EGENERIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getEUpperBound() {
		if (eUpperBound != null && eUpperBound.eIsProxy()) {
			InternalEObject oldEUpperBound = (InternalEObject) eUpperBound;
			eUpperBound = (EGenericType) eResolveProxy(oldEUpperBound);
			if (eUpperBound != oldEUpperBound) {
				InternalEObject newEUpperBound = (InternalEObject) eUpperBound;
				NotificationChain msgs = oldEUpperBound.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.EGENERIC_TYPE__EUPPER_BOUND,
						null, null);
				if (newEUpperBound.eInternalContainer() == null) {
					msgs = newEUpperBound.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- EcorePackage.EGENERIC_TYPE__EUPPER_BOUND,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.EGENERIC_TYPE__EUPPER_BOUND,
							oldEUpperBound, eUpperBound));
			}
		}
		return eUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType basicGetEUpperBound() {
		return eUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEUpperBound(EGenericType newEUpperBound,
			NotificationChain msgs) {
		EGenericType oldEUpperBound = eUpperBound;
		eUpperBound = newEUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EcorePackage.EGENERIC_TYPE__EUPPER_BOUND,
					oldEUpperBound, newEUpperBound);
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
	public void setEUpperBound(EGenericType newEUpperBound) {
		if (newEUpperBound != eUpperBound) {
			NotificationChain msgs = null;
			if (eUpperBound != null)
				msgs = ((InternalEObject) eUpperBound).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.EGENERIC_TYPE__EUPPER_BOUND,
						null, msgs);
			if (newEUpperBound != null)
				msgs = ((InternalEObject) newEUpperBound).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.EGENERIC_TYPE__EUPPER_BOUND,
						null, msgs);
			msgs = basicSetEUpperBound(newEUpperBound, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EGENERIC_TYPE__EUPPER_BOUND, newEUpperBound,
					newEUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EGenericType> getETypeArguments() {
		if (eTypeArguments == null) {
			eTypeArguments = new EObjectContainmentEList.Resolving<EGenericType>(
					EGenericType.class, this,
					EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS);
		}
		return eTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getEClassifier() {
		if (eClassifier != null && eClassifier.eIsProxy()) {
			InternalEObject oldEClassifier = (InternalEObject) eClassifier;
			eClassifier = (EClassifier) eResolveProxy(oldEClassifier);
			if (eClassifier != oldEClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.EGENERIC_TYPE__ECLASSIFIER,
							oldEClassifier, eClassifier));
			}
		}
		return eClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetEClassifier() {
		return eClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClassifier(EClassifier newEClassifier) {
		EClassifier oldEClassifier = eClassifier;
		eClassifier = newEClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EGENERIC_TYPE__ECLASSIFIER, oldEClassifier,
					eClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter getETypeParameter() {
		if (eTypeParameter != null && eTypeParameter.eIsProxy()) {
			InternalEObject oldETypeParameter = (InternalEObject) eTypeParameter;
			eTypeParameter = (ETypeParameter) eResolveProxy(oldETypeParameter);
			if (eTypeParameter != oldETypeParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER,
							oldETypeParameter, eTypeParameter));
			}
		}
		return eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter basicGetETypeParameter() {
		return eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setETypeParameter(ETypeParameter newETypeParameter) {
		ETypeParameter oldETypeParameter = eTypeParameter;
		eTypeParameter = newETypeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER,
					oldETypeParameter, eTypeParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getELowerBound() {
		if (eLowerBound != null && eLowerBound.eIsProxy()) {
			InternalEObject oldELowerBound = (InternalEObject) eLowerBound;
			eLowerBound = (EGenericType) eResolveProxy(oldELowerBound);
			if (eLowerBound != oldELowerBound) {
				InternalEObject newELowerBound = (InternalEObject) eLowerBound;
				NotificationChain msgs = oldELowerBound.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.EGENERIC_TYPE__ELOWER_BOUND,
						null, null);
				if (newELowerBound.eInternalContainer() == null) {
					msgs = newELowerBound.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- EcorePackage.EGENERIC_TYPE__ELOWER_BOUND,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.EGENERIC_TYPE__ELOWER_BOUND,
							oldELowerBound, eLowerBound));
			}
		}
		return eLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType basicGetELowerBound() {
		return eLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetELowerBound(EGenericType newELowerBound,
			NotificationChain msgs) {
		EGenericType oldELowerBound = eLowerBound;
		eLowerBound = newELowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EcorePackage.EGENERIC_TYPE__ELOWER_BOUND,
					oldELowerBound, newELowerBound);
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
	public void setELowerBound(EGenericType newELowerBound) {
		if (newELowerBound != eLowerBound) {
			NotificationChain msgs = null;
			if (eLowerBound != null)
				msgs = ((InternalEObject) eLowerBound).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.EGENERIC_TYPE__ELOWER_BOUND,
						null, msgs);
			if (newELowerBound != null)
				msgs = ((InternalEObject) newELowerBound).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.EGENERIC_TYPE__ELOWER_BOUND,
						null, msgs);
			msgs = basicSetELowerBound(newELowerBound, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EGENERIC_TYPE__ELOWER_BOUND, newELowerBound,
					newELowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getterERawType() {

		ecore.EClassifier result = null;

		return result;

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
		case EcorePackage.EGENERIC_TYPE__EUPPER_BOUND:
			return basicSetEUpperBound(null, msgs);
		case EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
			return ((InternalEList<?>) getETypeArguments()).basicRemove(
					otherEnd, msgs);
		case EcorePackage.EGENERIC_TYPE__ELOWER_BOUND:
			return basicSetELowerBound(null, msgs);
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
		case EcorePackage.EGENERIC_TYPE__EUPPER_BOUND:
			if (resolve)
				return getEUpperBound();
			return basicGetEUpperBound();
		case EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
			return getETypeArguments();
		case EcorePackage.EGENERIC_TYPE__ECLASSIFIER:
			if (resolve)
				return getEClassifier();
			return basicGetEClassifier();
		case EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER:
			if (resolve)
				return getETypeParameter();
			return basicGetETypeParameter();
		case EcorePackage.EGENERIC_TYPE__ELOWER_BOUND:
			if (resolve)
				return getELowerBound();
			return basicGetELowerBound();
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
		case EcorePackage.EGENERIC_TYPE__EUPPER_BOUND:
			setEUpperBound((EGenericType) newValue);
			return;
		case EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
			getETypeArguments().clear();
			getETypeArguments().addAll(
					(Collection<? extends EGenericType>) newValue);
			return;
		case EcorePackage.EGENERIC_TYPE__ECLASSIFIER:
			setEClassifier((EClassifier) newValue);
			return;
		case EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER:
			setETypeParameter((ETypeParameter) newValue);
			return;
		case EcorePackage.EGENERIC_TYPE__ELOWER_BOUND:
			setELowerBound((EGenericType) newValue);
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
		case EcorePackage.EGENERIC_TYPE__EUPPER_BOUND:
			setEUpperBound((EGenericType) null);
			return;
		case EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
			getETypeArguments().clear();
			return;
		case EcorePackage.EGENERIC_TYPE__ECLASSIFIER:
			setEClassifier((EClassifier) null);
			return;
		case EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER:
			setETypeParameter((ETypeParameter) null);
			return;
		case EcorePackage.EGENERIC_TYPE__ELOWER_BOUND:
			setELowerBound((EGenericType) null);
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
		case EcorePackage.EGENERIC_TYPE__EUPPER_BOUND:
			return eUpperBound != null;
		case EcorePackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
			return eTypeArguments != null && !eTypeArguments.isEmpty();
		case EcorePackage.EGENERIC_TYPE__ECLASSIFIER:
			return eClassifier != null;
		case EcorePackage.EGENERIC_TYPE__ETYPE_PARAMETER:
			return eTypeParameter != null;
		case EcorePackage.EGENERIC_TYPE__ELOWER_BOUND:
			return eLowerBound != null;
		}
		return super.eIsSet(featureID);
	}

} //EGenericTypeImpl
