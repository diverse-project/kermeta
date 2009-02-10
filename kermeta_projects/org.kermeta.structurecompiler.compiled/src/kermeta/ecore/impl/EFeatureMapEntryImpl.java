/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EFeatureMapEntryImpl.java,v 1.11 2009-02-10 17:51:53 cfaucher Exp $
 */
package kermeta.ecore.impl;

import kermeta.ecore.EFeatureMapEntry;
import kermeta.ecore.EcorePackage;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFeature Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.ecore.impl.EFeatureMapEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link kermeta.ecore.impl.EFeatureMapEntryImpl#getEStructuralFeatureName <em>EStructural Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EFeatureMapEntryImpl extends ObjectImpl implements
		EFeatureMapEntry {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected kermeta.language.structure.Object value;

	/**
	 * The default value of the '{@link #getEStructuralFeatureName() <em>EStructural Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStructuralFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTRUCTURAL_FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEStructuralFeatureName() <em>EStructural Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStructuralFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String eStructuralFeatureName = ESTRUCTURAL_FEATURE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFeatureMapEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EFEATURE_MAP_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (kermeta.language.structure.Object) eResolveProxy(oldValue);
			if (value != oldValue) {
				InternalEObject newValue = (InternalEObject) value;
				NotificationChain msgs = oldValue.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.EFEATURE_MAP_ENTRY__VALUE, null,
						null);
				if (newValue.eInternalContainer() == null) {
					msgs = newValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- EcorePackage.EFEATURE_MAP_ENTRY__VALUE, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.EFEATURE_MAP_ENTRY__VALUE, oldValue,
							value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(
			kermeta.language.structure.Object newValue, NotificationChain msgs) {
		kermeta.language.structure.Object oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EcorePackage.EFEATURE_MAP_ENTRY__VALUE,
					oldValue, newValue);
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
	public void setValue(kermeta.language.structure.Object newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.EFEATURE_MAP_ENTRY__VALUE, null,
						msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.EFEATURE_MAP_ENTRY__VALUE, null,
						msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EFEATURE_MAP_ENTRY__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEStructuralFeatureName() {
		return eStructuralFeatureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEStructuralFeatureName(String newEStructuralFeatureName) {
		String oldEStructuralFeatureName = eStructuralFeatureName;
		eStructuralFeatureName = newEStructuralFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EFEATURE_MAP_ENTRY__ESTRUCTURAL_FEATURE_NAME,
					oldEStructuralFeatureName, eStructuralFeatureName));
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
		case EcorePackage.EFEATURE_MAP_ENTRY__VALUE:
			return basicSetValue(null, msgs);
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
		case EcorePackage.EFEATURE_MAP_ENTRY__VALUE:
			if (resolve)
				return getValue();
			return basicGetValue();
		case EcorePackage.EFEATURE_MAP_ENTRY__ESTRUCTURAL_FEATURE_NAME:
			return getEStructuralFeatureName();
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
		case EcorePackage.EFEATURE_MAP_ENTRY__VALUE:
			setValue((kermeta.language.structure.Object) newValue);
			return;
		case EcorePackage.EFEATURE_MAP_ENTRY__ESTRUCTURAL_FEATURE_NAME:
			setEStructuralFeatureName((String) newValue);
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
		case EcorePackage.EFEATURE_MAP_ENTRY__VALUE:
			setValue((kermeta.language.structure.Object) null);
			return;
		case EcorePackage.EFEATURE_MAP_ENTRY__ESTRUCTURAL_FEATURE_NAME:
			setEStructuralFeatureName(ESTRUCTURAL_FEATURE_NAME_EDEFAULT);
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
		case EcorePackage.EFEATURE_MAP_ENTRY__VALUE:
			return value != null;
		case EcorePackage.EFEATURE_MAP_ENTRY__ESTRUCTURAL_FEATURE_NAME:
			return ESTRUCTURAL_FEATURE_NAME_EDEFAULT == null ? eStructuralFeatureName != null
					: !ESTRUCTURAL_FEATURE_NAME_EDEFAULT
							.equals(eStructuralFeatureName);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (eStructuralFeatureName: ");
		result.append(eStructuralFeatureName);
		result.append(')');
		return result.toString();
	}

} //EFeatureMapEntryImpl
