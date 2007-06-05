/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuleVariableImpl.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr.impl;

import fr.irisa.triskell.ktr.InterpretationRule;
import fr.irisa.triskell.ktr.KtrPackage;
import fr.irisa.triskell.ktr.RuleVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RuleVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RuleVariableImpl#getInitExpr <em>Init Expr</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RuleVariableImpl#getVarType <em>Var Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RuleVariableImpl#getOwningRule <em>Owning Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleVariableImpl extends EObjectImpl implements RuleVariable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitExpr() <em>Init Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_EXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitExpr() <em>Init Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitExpr()
	 * @generated
	 * @ordered
	 */
	protected String initExpr = INIT_EXPR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVarType() <em>Var Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarType()
	 * @generated
	 * @ordered
	 */
	protected EClass varType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KtrPackage.Literals.RULE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitExpr() {
		return initExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitExpr(String newInitExpr) {
		String oldInitExpr = initExpr;
		initExpr = newInitExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_VARIABLE__INIT_EXPR, oldInitExpr, initExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarType() {
		if (varType != null && varType.eIsProxy()) {
			InternalEObject oldVarType = (InternalEObject)varType;
			varType = (EClass)eResolveProxy(oldVarType);
			if (varType != oldVarType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KtrPackage.RULE_VARIABLE__VAR_TYPE, oldVarType, varType));
			}
		}
		return varType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetVarType() {
		return varType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarType(EClass newVarType) {
		EClass oldVarType = varType;
		varType = newVarType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_VARIABLE__VAR_TYPE, oldVarType, varType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretationRule getOwningRule() {
		if (eContainerFeatureID != KtrPackage.RULE_VARIABLE__OWNING_RULE) return null;
		return (InterpretationRule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRule(InterpretationRule newOwningRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRule, KtrPackage.RULE_VARIABLE__OWNING_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningRule(InterpretationRule newOwningRule) {
		if (newOwningRule != eInternalContainer() || (eContainerFeatureID != KtrPackage.RULE_VARIABLE__OWNING_RULE && newOwningRule != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRule != null)
				msgs = ((InternalEObject)newOwningRule).eInverseAdd(this, KtrPackage.INTERPRETATION_RULE__VARIABLES, InterpretationRule.class, msgs);
			msgs = basicSetOwningRule(newOwningRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_VARIABLE__OWNING_RULE, newOwningRule, newOwningRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KtrPackage.RULE_VARIABLE__OWNING_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRule((InterpretationRule)otherEnd, msgs);
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
			case KtrPackage.RULE_VARIABLE__OWNING_RULE:
				return basicSetOwningRule(null, msgs);
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
			case KtrPackage.RULE_VARIABLE__OWNING_RULE:
				return eInternalContainer().eInverseRemove(this, KtrPackage.INTERPRETATION_RULE__VARIABLES, InterpretationRule.class, msgs);
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
			case KtrPackage.RULE_VARIABLE__NAME:
				return getName();
			case KtrPackage.RULE_VARIABLE__INIT_EXPR:
				return getInitExpr();
			case KtrPackage.RULE_VARIABLE__VAR_TYPE:
				if (resolve) return getVarType();
				return basicGetVarType();
			case KtrPackage.RULE_VARIABLE__OWNING_RULE:
				return getOwningRule();
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
			case KtrPackage.RULE_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case KtrPackage.RULE_VARIABLE__INIT_EXPR:
				setInitExpr((String)newValue);
				return;
			case KtrPackage.RULE_VARIABLE__VAR_TYPE:
				setVarType((EClass)newValue);
				return;
			case KtrPackage.RULE_VARIABLE__OWNING_RULE:
				setOwningRule((InterpretationRule)newValue);
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
			case KtrPackage.RULE_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KtrPackage.RULE_VARIABLE__INIT_EXPR:
				setInitExpr(INIT_EXPR_EDEFAULT);
				return;
			case KtrPackage.RULE_VARIABLE__VAR_TYPE:
				setVarType((EClass)null);
				return;
			case KtrPackage.RULE_VARIABLE__OWNING_RULE:
				setOwningRule((InterpretationRule)null);
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
			case KtrPackage.RULE_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KtrPackage.RULE_VARIABLE__INIT_EXPR:
				return INIT_EXPR_EDEFAULT == null ? initExpr != null : !INIT_EXPR_EDEFAULT.equals(initExpr);
			case KtrPackage.RULE_VARIABLE__VAR_TYPE:
				return varType != null;
			case KtrPackage.RULE_VARIABLE__OWNING_RULE:
				return getOwningRule() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", initExpr: ");
		result.append(initExpr);
		result.append(')');
		return result.toString();
	}

} //RuleVariableImpl