/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase.impl;

import fr.tm.elibel.smartqvt.qvt.emof.impl.NamedElementImpl;

import fr.tm.elibel.smartqvt.qvt.qvtbase.Domain;
import fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Rule;
import fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.impl.DomainImpl#getIsCheckable <em>Is Checkable</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.impl.DomainImpl#getIsEnforceable <em>Is Enforceable</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.impl.DomainImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.impl.DomainImpl#getTypedModel <em>Typed Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DomainImpl extends NamedElementImpl implements Domain {
	/**
	 * The default value of the '{@link #getIsCheckable() <em>Is Checkable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCheckable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CHECKABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCheckable() <em>Is Checkable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCheckable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCheckable = IS_CHECKABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsEnforceable() <em>Is Enforceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEnforceable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ENFORCEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsEnforceable() <em>Is Enforceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEnforceable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isEnforceable = IS_ENFORCEABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypedModel() <em>Typed Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedModel()
	 * @generated
	 * @ordered
	 */
	protected TypedModel typedModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtbasePackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCheckable() {
		return isCheckable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCheckable(Boolean newIsCheckable) {
		Boolean oldIsCheckable = isCheckable;
		isCheckable = newIsCheckable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtbasePackage.DOMAIN__IS_CHECKABLE, oldIsCheckable, isCheckable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsEnforceable() {
		return isEnforceable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnforceable(Boolean newIsEnforceable) {
		Boolean oldIsEnforceable = isEnforceable;
		isEnforceable = newIsEnforceable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtbasePackage.DOMAIN__IS_ENFORCEABLE, oldIsEnforceable, isEnforceable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID != QvtbasePackage.DOMAIN__RULE) return null;
		return (Rule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRule, QvtbasePackage.DOMAIN__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer() || (eContainerFeatureID != QvtbasePackage.DOMAIN__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, QvtbasePackage.RULE__DOMAIN, Rule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtbasePackage.DOMAIN__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedModel getTypedModel() {
		if (typedModel != null && typedModel.eIsProxy()) {
			InternalEObject oldTypedModel = (InternalEObject)typedModel;
			typedModel = (TypedModel)eResolveProxy(oldTypedModel);
			if (typedModel != oldTypedModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtbasePackage.DOMAIN__TYPED_MODEL, oldTypedModel, typedModel));
			}
		}
		return typedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedModel basicGetTypedModel() {
		return typedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedModel(TypedModel newTypedModel) {
		TypedModel oldTypedModel = typedModel;
		typedModel = newTypedModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtbasePackage.DOMAIN__TYPED_MODEL, oldTypedModel, typedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtbasePackage.DOMAIN__RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRule((Rule)otherEnd, msgs);
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
			case QvtbasePackage.DOMAIN__RULE:
				return basicSetRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case QvtbasePackage.DOMAIN__RULE:
				return eInternalContainer().eInverseRemove(this, QvtbasePackage.RULE__DOMAIN, Rule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtbasePackage.DOMAIN__IS_CHECKABLE:
				return getIsCheckable();
			case QvtbasePackage.DOMAIN__IS_ENFORCEABLE:
				return getIsEnforceable();
			case QvtbasePackage.DOMAIN__RULE:
				return getRule();
			case QvtbasePackage.DOMAIN__TYPED_MODEL:
				if (resolve) return getTypedModel();
				return basicGetTypedModel();
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
			case QvtbasePackage.DOMAIN__IS_CHECKABLE:
				setIsCheckable((Boolean)newValue);
				return;
			case QvtbasePackage.DOMAIN__IS_ENFORCEABLE:
				setIsEnforceable((Boolean)newValue);
				return;
			case QvtbasePackage.DOMAIN__RULE:
				setRule((Rule)newValue);
				return;
			case QvtbasePackage.DOMAIN__TYPED_MODEL:
				setTypedModel((TypedModel)newValue);
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
			case QvtbasePackage.DOMAIN__IS_CHECKABLE:
				setIsCheckable(IS_CHECKABLE_EDEFAULT);
				return;
			case QvtbasePackage.DOMAIN__IS_ENFORCEABLE:
				setIsEnforceable(IS_ENFORCEABLE_EDEFAULT);
				return;
			case QvtbasePackage.DOMAIN__RULE:
				setRule((Rule)null);
				return;
			case QvtbasePackage.DOMAIN__TYPED_MODEL:
				setTypedModel((TypedModel)null);
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
			case QvtbasePackage.DOMAIN__IS_CHECKABLE:
				return IS_CHECKABLE_EDEFAULT == null ? isCheckable != null : !IS_CHECKABLE_EDEFAULT.equals(isCheckable);
			case QvtbasePackage.DOMAIN__IS_ENFORCEABLE:
				return IS_ENFORCEABLE_EDEFAULT == null ? isEnforceable != null : !IS_ENFORCEABLE_EDEFAULT.equals(isEnforceable);
			case QvtbasePackage.DOMAIN__RULE:
				return getRule() != null;
			case QvtbasePackage.DOMAIN__TYPED_MODEL:
				return typedModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isCheckable: ");
		result.append(isCheckable);
		result.append(", isEnforceable: ");
		result.append(isEnforceable);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
