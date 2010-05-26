/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.kp.Expression;
import org.kermeta.kp.KpPackage;
import org.kermeta.kp.WeaveDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weave Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.WeaveDirectiveImpl#getMix <em>Mix</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.WeaveDirectiveImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeaveDirectiveImpl extends NamedElementImpl implements WeaveDirective {
	/**
	 * The cached value of the '{@link #getMix() <em>Mix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMix()
	 * @generated
	 * @ordered
	 */
	protected Expression mix;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Expression target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeaveDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KpPackage.Literals.WEAVE_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMix() {
		return mix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMix(Expression newMix, NotificationChain msgs) {
		Expression oldMix = mix;
		mix = newMix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KpPackage.WEAVE_DIRECTIVE__MIX, oldMix, newMix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMix(Expression newMix) {
		if (newMix != mix) {
			NotificationChain msgs = null;
			if (mix != null)
				msgs = ((InternalEObject)mix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KpPackage.WEAVE_DIRECTIVE__MIX, null, msgs);
			if (newMix != null)
				msgs = ((InternalEObject)newMix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KpPackage.WEAVE_DIRECTIVE__MIX, null, msgs);
			msgs = basicSetMix(newMix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.WEAVE_DIRECTIVE__MIX, newMix, newMix));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KpPackage.WEAVE_DIRECTIVE__TARGET, oldTarget, newTarget);
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
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KpPackage.WEAVE_DIRECTIVE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KpPackage.WEAVE_DIRECTIVE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.WEAVE_DIRECTIVE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpPackage.WEAVE_DIRECTIVE__MIX:
				return basicSetMix(null, msgs);
			case KpPackage.WEAVE_DIRECTIVE__TARGET:
				return basicSetTarget(null, msgs);
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
			case KpPackage.WEAVE_DIRECTIVE__MIX:
				return getMix();
			case KpPackage.WEAVE_DIRECTIVE__TARGET:
				return getTarget();
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
			case KpPackage.WEAVE_DIRECTIVE__MIX:
				setMix((Expression)newValue);
				return;
			case KpPackage.WEAVE_DIRECTIVE__TARGET:
				setTarget((Expression)newValue);
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
			case KpPackage.WEAVE_DIRECTIVE__MIX:
				setMix((Expression)null);
				return;
			case KpPackage.WEAVE_DIRECTIVE__TARGET:
				setTarget((Expression)null);
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
			case KpPackage.WEAVE_DIRECTIVE__MIX:
				return mix != null;
			case KpPackage.WEAVE_DIRECTIVE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //WeaveDirectiveImpl
