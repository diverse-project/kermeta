/**
 * <copyright>
 * </copyright>
 *
 * $Id: PolicyTypeImpl.java,v 1.1 2008-02-20 14:16:35 ffleurey Exp $
 */
package acm.impl;

import acm.AcmPackage;
import acm.ElementType;
import acm.PolicyType;
import acm.RuleType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link acm.impl.PolicyTypeImpl#getRuleTypes <em>Rule Types</em>}</li>
 *   <li>{@link acm.impl.PolicyTypeImpl#getElementTypes <em>Element Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyTypeImpl extends NamedElementImpl implements PolicyType {
	/**
	 * The cached value of the '{@link #getRuleTypes() <em>Rule Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleType> ruleTypes;

	/**
	 * The cached value of the '{@link #getElementTypes() <em>Element Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementType> elementTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcmPackage.Literals.POLICY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleType> getRuleTypes() {
		if (ruleTypes == null) {
			ruleTypes = new EObjectContainmentEList<RuleType>(RuleType.class, this, AcmPackage.POLICY_TYPE__RULE_TYPES);
		}
		return ruleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementType> getElementTypes() {
		if (elementTypes == null) {
			elementTypes = new EObjectContainmentEList<ElementType>(ElementType.class, this, AcmPackage.POLICY_TYPE__ELEMENT_TYPES);
		}
		return elementTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcmPackage.POLICY_TYPE__RULE_TYPES:
				return ((InternalEList<?>)getRuleTypes()).basicRemove(otherEnd, msgs);
			case AcmPackage.POLICY_TYPE__ELEMENT_TYPES:
				return ((InternalEList<?>)getElementTypes()).basicRemove(otherEnd, msgs);
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
			case AcmPackage.POLICY_TYPE__RULE_TYPES:
				return getRuleTypes();
			case AcmPackage.POLICY_TYPE__ELEMENT_TYPES:
				return getElementTypes();
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
			case AcmPackage.POLICY_TYPE__RULE_TYPES:
				getRuleTypes().clear();
				getRuleTypes().addAll((Collection<? extends RuleType>)newValue);
				return;
			case AcmPackage.POLICY_TYPE__ELEMENT_TYPES:
				getElementTypes().clear();
				getElementTypes().addAll((Collection<? extends ElementType>)newValue);
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
			case AcmPackage.POLICY_TYPE__RULE_TYPES:
				getRuleTypes().clear();
				return;
			case AcmPackage.POLICY_TYPE__ELEMENT_TYPES:
				getElementTypes().clear();
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
			case AcmPackage.POLICY_TYPE__RULE_TYPES:
				return ruleTypes != null && !ruleTypes.isEmpty();
			case AcmPackage.POLICY_TYPE__ELEMENT_TYPES:
				return elementTypes != null && !elementTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PolicyTypeImpl
