/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuleRefImpl.java,v 1.1 2006-09-26 15:28:31 dtouzet Exp $
 */
package sts.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sts.Rule;
import sts.RuleRef;
import sts.StsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sts.impl.RuleRefImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleRefImpl extends ValueImpl implements RuleRef {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected Rule ref = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StsPackage.Literals.RULE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (Rule)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StsPackage.RULE_REF__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(Rule newRef) {
		Rule oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StsPackage.RULE_REF__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StsPackage.RULE_REF__REF:
				if (resolve) return getRef();
				return basicGetRef();
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
			case StsPackage.RULE_REF__REF:
				setRef((Rule)newValue);
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
			case StsPackage.RULE_REF__REF:
				setRef((Rule)null);
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
			case StsPackage.RULE_REF__REF:
				return ref != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleRefImpl