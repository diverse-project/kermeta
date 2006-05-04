/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoopImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.impl;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.Loop;

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
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.LoopImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.LoopImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.LoopImpl#getStopCondition <em>Stop Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopImpl extends ExpressionImpl implements Loop {
	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected Expression initialization = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Expression body = null;

	/**
	 * The cached value of the '{@link #getStopCondition() <em>Stop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression stopCondition = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BehaviorPackage.eINSTANCE.getLoop();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialization(Expression newInitialization, NotificationChain msgs) {
		Expression oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.LOOP__INITIALIZATION, oldInitialization, newInitialization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialization(Expression newInitialization) {
		if (newInitialization != initialization) {
			NotificationChain msgs = null;
			if (initialization != null)
				msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__INITIALIZATION, null, msgs);
			if (newInitialization != null)
				msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__INITIALIZATION, null, msgs);
			msgs = basicSetInitialization(newInitialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.LOOP__INITIALIZATION, newInitialization, newInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Expression newBody, NotificationChain msgs) {
		Expression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.LOOP__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Expression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.LOOP__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getStopCondition() {
		return stopCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopCondition(Expression newStopCondition, NotificationChain msgs) {
		Expression oldStopCondition = stopCondition;
		stopCondition = newStopCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.LOOP__STOP_CONDITION, oldStopCondition, newStopCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopCondition(Expression newStopCondition) {
		if (newStopCondition != stopCondition) {
			NotificationChain msgs = null;
			if (stopCondition != null)
				msgs = ((InternalEObject)stopCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__STOP_CONDITION, null, msgs);
			if (newStopCondition != null)
				msgs = ((InternalEObject)newStopCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__STOP_CONDITION, null, msgs);
			msgs = basicSetStopCondition(newStopCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.LOOP__STOP_CONDITION, newStopCondition, newStopCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BehaviorPackage.LOOP__TAG:
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
				case BehaviorPackage.LOOP__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.LOOP__CONTAINED_TYPE:
					return ((InternalEList)getContainedType()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.LOOP__INITIALIZATION:
					return basicSetInitialization(null, msgs);
				case BehaviorPackage.LOOP__BODY:
					return basicSetBody(null, msgs);
				case BehaviorPackage.LOOP__STOP_CONDITION:
					return basicSetStopCondition(null, msgs);
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
			case BehaviorPackage.LOOP__TAG:
				return getTag();
			case BehaviorPackage.LOOP__CONTAINED_TYPE:
				return getContainedType();
			case BehaviorPackage.LOOP__STATIC_TYPE:
				if (resolve) return getStaticType();
				return basicGetStaticType();
			case BehaviorPackage.LOOP__INITIALIZATION:
				return getInitialization();
			case BehaviorPackage.LOOP__BODY:
				return getBody();
			case BehaviorPackage.LOOP__STOP_CONDITION:
				return getStopCondition();
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
			case BehaviorPackage.LOOP__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case BehaviorPackage.LOOP__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection)newValue);
				return;
			case BehaviorPackage.LOOP__STATIC_TYPE:
				setStaticType((Type)newValue);
				return;
			case BehaviorPackage.LOOP__INITIALIZATION:
				setInitialization((Expression)newValue);
				return;
			case BehaviorPackage.LOOP__BODY:
				setBody((Expression)newValue);
				return;
			case BehaviorPackage.LOOP__STOP_CONDITION:
				setStopCondition((Expression)newValue);
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
			case BehaviorPackage.LOOP__TAG:
				getTag().clear();
				return;
			case BehaviorPackage.LOOP__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case BehaviorPackage.LOOP__STATIC_TYPE:
				setStaticType((Type)null);
				return;
			case BehaviorPackage.LOOP__INITIALIZATION:
				setInitialization((Expression)null);
				return;
			case BehaviorPackage.LOOP__BODY:
				setBody((Expression)null);
				return;
			case BehaviorPackage.LOOP__STOP_CONDITION:
				setStopCondition((Expression)null);
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
			case BehaviorPackage.LOOP__TAG:
				return tag != null && !tag.isEmpty();
			case BehaviorPackage.LOOP__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case BehaviorPackage.LOOP__STATIC_TYPE:
				return staticType != null;
			case BehaviorPackage.LOOP__INITIALIZATION:
				return initialization != null;
			case BehaviorPackage.LOOP__BODY:
				return body != null;
			case BehaviorPackage.LOOP__STOP_CONDITION:
				return stopCondition != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //LoopImpl
