/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtrelation.impl;

import fr.tm.elibel.smartqvt.qvt.qvtbase.impl.TransformationImpl;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.Key;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationalTransformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationalTransformationImpl#getOwnedKey <em>Owned Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationalTransformationImpl extends TransformationImpl implements RelationalTransformation {
	/**
	 * The cached value of the '{@link #getOwnedKey() <em>Owned Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedKey()
	 * @generated
	 * @ordered
	 */
	protected EList ownedKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtrelationPackage.Literals.RELATIONAL_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedKey() {
		if (ownedKey == null) {
			ownedKey = new EObjectContainmentWithInverseEList(Key.class, this, QvtrelationPackage.RELATIONAL_TRANSFORMATION__OWNED_KEY, QvtrelationPackage.KEY__TRANSFORMATION);
		}
		return ownedKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtrelationPackage.RELATIONAL_TRANSFORMATION__OWNED_KEY:
				return ((InternalEList)getOwnedKey()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtrelationPackage.RELATIONAL_TRANSFORMATION__OWNED_KEY:
				return ((InternalEList)getOwnedKey()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtrelationPackage.RELATIONAL_TRANSFORMATION__OWNED_KEY:
				return getOwnedKey();
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
			case QvtrelationPackage.RELATIONAL_TRANSFORMATION__OWNED_KEY:
				getOwnedKey().clear();
				getOwnedKey().addAll((Collection)newValue);
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
			case QvtrelationPackage.RELATIONAL_TRANSFORMATION__OWNED_KEY:
				getOwnedKey().clear();
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
			case QvtrelationPackage.RELATIONAL_TRANSFORMATION__OWNED_KEY:
				return ownedKey != null && !ownedKey.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationalTransformationImpl
