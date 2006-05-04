/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallFeatureImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.impl;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;

import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
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
 * An implementation of the model object '<em><b>Call Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.CallFeatureImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.CallFeatureImpl#getStaticProperty <em>Static Property</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.CallFeatureImpl#getStaticOperation <em>Static Operation</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.CallFeatureImpl#getStaticEnumLiteral <em>Static Enum Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallFeatureImpl extends CallExpressionImpl implements CallFeature {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Expression target = null;

	/**
	 * The cached value of the '{@link #getStaticProperty() <em>Static Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticProperty()
	 * @generated
	 * @ordered
	 */
	protected Property staticProperty = null;

	/**
	 * The cached value of the '{@link #getStaticOperation() <em>Static Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation staticOperation = null;

	/**
	 * The cached value of the '{@link #getStaticEnumLiteral() <em>Static Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticEnumLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral staticEnumLiteral = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BehaviorPackage.eINSTANCE.getCallFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Expression newTarget, NotificationChain msgs) {
		Expression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Expression newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CALL_FEATURE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CALL_FEATURE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getStaticProperty() {
		if (staticProperty != null && staticProperty.eIsProxy()) {
			Property oldStaticProperty = staticProperty;
			staticProperty = (Property)eResolveProxy((InternalEObject)staticProperty);
			if (staticProperty != oldStaticProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY, oldStaticProperty, staticProperty));
			}
		}
		return staticProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetStaticProperty() {
		return staticProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticProperty(Property newStaticProperty) {
		Property oldStaticProperty = staticProperty;
		staticProperty = newStaticProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY, oldStaticProperty, staticProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getStaticOperation() {
		if (staticOperation != null && staticOperation.eIsProxy()) {
			Operation oldStaticOperation = staticOperation;
			staticOperation = (Operation)eResolveProxy((InternalEObject)staticOperation);
			if (staticOperation != oldStaticOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.CALL_FEATURE__STATIC_OPERATION, oldStaticOperation, staticOperation));
			}
		}
		return staticOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetStaticOperation() {
		return staticOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticOperation(Operation newStaticOperation) {
		Operation oldStaticOperation = staticOperation;
		staticOperation = newStaticOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__STATIC_OPERATION, oldStaticOperation, staticOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getStaticEnumLiteral() {
		if (staticEnumLiteral != null && staticEnumLiteral.eIsProxy()) {
			EnumerationLiteral oldStaticEnumLiteral = staticEnumLiteral;
			staticEnumLiteral = (EnumerationLiteral)eResolveProxy((InternalEObject)staticEnumLiteral);
			if (staticEnumLiteral != oldStaticEnumLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL, oldStaticEnumLiteral, staticEnumLiteral));
			}
		}
		return staticEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetStaticEnumLiteral() {
		return staticEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticEnumLiteral(EnumerationLiteral newStaticEnumLiteral) {
		EnumerationLiteral oldStaticEnumLiteral = staticEnumLiteral;
		staticEnumLiteral = newStaticEnumLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL, oldStaticEnumLiteral, staticEnumLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BehaviorPackage.CALL_FEATURE__TAG:
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
				case BehaviorPackage.CALL_FEATURE__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.CALL_FEATURE__CONTAINED_TYPE:
					return ((InternalEList)getContainedType()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.CALL_FEATURE__PARAMETERS:
					return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.CALL_FEATURE__TARGET:
					return basicSetTarget(null, msgs);
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
			case BehaviorPackage.CALL_FEATURE__TAG:
				return getTag();
			case BehaviorPackage.CALL_FEATURE__CONTAINED_TYPE:
				return getContainedType();
			case BehaviorPackage.CALL_FEATURE__STATIC_TYPE:
				if (resolve) return getStaticType();
				return basicGetStaticType();
			case BehaviorPackage.CALL_FEATURE__PARAMETERS:
				return getParameters();
			case BehaviorPackage.CALL_FEATURE__NAME:
				return getName();
			case BehaviorPackage.CALL_FEATURE__STATIC_TYPE_VARIABLE_BINDINGS:
				return getStaticTypeVariableBindings();
			case BehaviorPackage.CALL_FEATURE__TARGET:
				return getTarget();
			case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
				if (resolve) return getStaticProperty();
				return basicGetStaticProperty();
			case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
				if (resolve) return getStaticOperation();
				return basicGetStaticOperation();
			case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
				if (resolve) return getStaticEnumLiteral();
				return basicGetStaticEnumLiteral();
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
			case BehaviorPackage.CALL_FEATURE__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case BehaviorPackage.CALL_FEATURE__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection)newValue);
				return;
			case BehaviorPackage.CALL_FEATURE__STATIC_TYPE:
				setStaticType((Type)newValue);
				return;
			case BehaviorPackage.CALL_FEATURE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case BehaviorPackage.CALL_FEATURE__NAME:
				setName((String)newValue);
				return;
			case BehaviorPackage.CALL_FEATURE__STATIC_TYPE_VARIABLE_BINDINGS:
				getStaticTypeVariableBindings().clear();
				getStaticTypeVariableBindings().addAll((Collection)newValue);
				return;
			case BehaviorPackage.CALL_FEATURE__TARGET:
				setTarget((Expression)newValue);
				return;
			case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
				setStaticProperty((Property)newValue);
				return;
			case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
				setStaticOperation((Operation)newValue);
				return;
			case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
				setStaticEnumLiteral((EnumerationLiteral)newValue);
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
			case BehaviorPackage.CALL_FEATURE__TAG:
				getTag().clear();
				return;
			case BehaviorPackage.CALL_FEATURE__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case BehaviorPackage.CALL_FEATURE__STATIC_TYPE:
				setStaticType((Type)null);
				return;
			case BehaviorPackage.CALL_FEATURE__PARAMETERS:
				getParameters().clear();
				return;
			case BehaviorPackage.CALL_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviorPackage.CALL_FEATURE__STATIC_TYPE_VARIABLE_BINDINGS:
				getStaticTypeVariableBindings().clear();
				return;
			case BehaviorPackage.CALL_FEATURE__TARGET:
				setTarget((Expression)null);
				return;
			case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
				setStaticProperty((Property)null);
				return;
			case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
				setStaticOperation((Operation)null);
				return;
			case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
				setStaticEnumLiteral((EnumerationLiteral)null);
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
			case BehaviorPackage.CALL_FEATURE__TAG:
				return tag != null && !tag.isEmpty();
			case BehaviorPackage.CALL_FEATURE__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case BehaviorPackage.CALL_FEATURE__STATIC_TYPE:
				return staticType != null;
			case BehaviorPackage.CALL_FEATURE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BehaviorPackage.CALL_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviorPackage.CALL_FEATURE__STATIC_TYPE_VARIABLE_BINDINGS:
				return staticTypeVariableBindings != null && !staticTypeVariableBindings.isEmpty();
			case BehaviorPackage.CALL_FEATURE__TARGET:
				return target != null;
			case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
				return staticProperty != null;
			case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
				return staticOperation != null;
			case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
				return staticEnumLiteral != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //CallFeatureImpl
