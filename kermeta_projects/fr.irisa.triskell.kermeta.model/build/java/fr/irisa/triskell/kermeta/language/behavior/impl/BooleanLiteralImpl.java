/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanLiteralImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.impl;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;

import fr.irisa.triskell.kermeta.language.structure.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.BooleanLiteralImpl#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanLiteralImpl extends LiteralImpl implements BooleanLiteral {
	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BehaviorPackage.eINSTANCE.getBooleanLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BOOLEAN_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BehaviorPackage.BOOLEAN_LITERAL__TAG:
					return ((InternalEList)getTag()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BehaviorPackage.BOOLEAN_LITERAL__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.BOOLEAN_LITERAL__CONTAINED_TYPE:
					return ((InternalEList)getContainedType()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.BOOLEAN_LITERAL__TAG:
				return getTag();
			case BehaviorPackage.BOOLEAN_LITERAL__CONTAINED_TYPE:
				return getContainedType();
			case BehaviorPackage.BOOLEAN_LITERAL__STATIC_TYPE:
				if (resolve) return getStaticType();
				return basicGetStaticType();
			case BehaviorPackage.BOOLEAN_LITERAL__VALUE:
				return isValue() ? Boolean.TRUE : Boolean.FALSE;
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.BOOLEAN_LITERAL__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case BehaviorPackage.BOOLEAN_LITERAL__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection)newValue);
				return;
			case BehaviorPackage.BOOLEAN_LITERAL__STATIC_TYPE:
				setStaticType((Type)newValue);
				return;
			case BehaviorPackage.BOOLEAN_LITERAL__VALUE:
				setValue(((Boolean)newValue).booleanValue());
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.BOOLEAN_LITERAL__TAG:
				getTag().clear();
				return;
			case BehaviorPackage.BOOLEAN_LITERAL__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case BehaviorPackage.BOOLEAN_LITERAL__STATIC_TYPE:
				setStaticType((Type)null);
				return;
			case BehaviorPackage.BOOLEAN_LITERAL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.BOOLEAN_LITERAL__TAG:
				return tag != null && !tag.isEmpty();
			case BehaviorPackage.BOOLEAN_LITERAL__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case BehaviorPackage.BOOLEAN_LITERAL__STATIC_TYPE:
				return staticType != null;
			case BehaviorPackage.BOOLEAN_LITERAL__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //BooleanLiteralImpl
