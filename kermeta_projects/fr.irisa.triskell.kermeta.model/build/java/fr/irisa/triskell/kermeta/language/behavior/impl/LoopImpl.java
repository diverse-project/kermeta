/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoopImpl.java,v 1.5 2007-07-20 15:09:04 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.impl;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.Loop;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected Expression initialization;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Expression body;

	/**
	 * The cached value of the '{@link #getStopCondition() <em>Stop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression stopCondition;

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
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitialization() {
		if (initialization != null && initialization.eIsProxy()) {
			InternalEObject oldInitialization = (InternalEObject)initialization;
			initialization = (Expression)eResolveProxy(oldInitialization);
			if (initialization != oldInitialization) {
				InternalEObject newInitialization = (InternalEObject)initialization;
				NotificationChain msgs = oldInitialization.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__INITIALIZATION, null, null);
				if (newInitialization.eInternalContainer() == null) {
					msgs = newInitialization.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__INITIALIZATION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.LOOP__INITIALIZATION, oldInitialization, initialization));
			}
		}
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetInitialization() {
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
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = (Expression)eResolveProxy(oldBody);
			if (body != oldBody) {
				InternalEObject newBody = (InternalEObject)body;
				NotificationChain msgs = oldBody.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__BODY, null, null);
				if (newBody.eInternalContainer() == null) {
					msgs = newBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__BODY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.LOOP__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetBody() {
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
		if (stopCondition != null && stopCondition.eIsProxy()) {
			InternalEObject oldStopCondition = (InternalEObject)stopCondition;
			stopCondition = (Expression)eResolveProxy(oldStopCondition);
			if (stopCondition != oldStopCondition) {
				InternalEObject newStopCondition = (InternalEObject)stopCondition;
				NotificationChain msgs = oldStopCondition.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__STOP_CONDITION, null, null);
				if (newStopCondition.eInternalContainer() == null) {
					msgs = newStopCondition.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.LOOP__STOP_CONDITION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.LOOP__STOP_CONDITION, oldStopCondition, stopCondition));
			}
		}
		return stopCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetStopCondition() {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.LOOP__INITIALIZATION:
				return basicSetInitialization(null, msgs);
			case BehaviorPackage.LOOP__BODY:
				return basicSetBody(null, msgs);
			case BehaviorPackage.LOOP__STOP_CONDITION:
				return basicSetStopCondition(null, msgs);
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
			case BehaviorPackage.LOOP__INITIALIZATION:
				if (resolve) return getInitialization();
				return basicGetInitialization();
			case BehaviorPackage.LOOP__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case BehaviorPackage.LOOP__STOP_CONDITION:
				if (resolve) return getStopCondition();
				return basicGetStopCondition();
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
			case BehaviorPackage.LOOP__INITIALIZATION:
				return initialization != null;
			case BehaviorPackage.LOOP__BODY:
				return body != null;
			case BehaviorPackage.LOOP__STOP_CONDITION:
				return stopCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopImpl