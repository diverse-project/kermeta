/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuleProductionImpl.java,v 1.2 2007-07-31 13:19:20 dtouzet Exp $
 */
package fr.irisa.triskell.ktr.impl;

import fr.irisa.triskell.ktr.InterpretationRule;
import fr.irisa.triskell.ktr.KtrPackage;
import fr.irisa.triskell.ktr.RuleProduction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Production</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RuleProductionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RuleProductionImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RuleProductionImpl#getTargetModel <em>Target Model</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RuleProductionImpl#getInitExpr <em>Init Expr</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RuleProductionImpl#getOwningRule <em>Owning Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleProductionImpl extends EObjectImpl implements RuleProduction {
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
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected EClass targetElement;

	/**
	 * The default value of the '{@link #getTargetModel() <em>Target Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetModel() <em>Target Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModel()
	 * @generated
	 * @ordered
	 */
	protected String targetModel = TARGET_MODEL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleProductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KtrPackage.Literals.RULE_PRODUCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_PRODUCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetElement() {
		if (targetElement != null && targetElement.eIsProxy()) {
			InternalEObject oldTargetElement = (InternalEObject)targetElement;
			targetElement = (EClass)eResolveProxy(oldTargetElement);
			if (targetElement != oldTargetElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KtrPackage.RULE_PRODUCTION__TARGET_ELEMENT, oldTargetElement, targetElement));
			}
		}
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTargetElement() {
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetElement(EClass newTargetElement) {
		EClass oldTargetElement = targetElement;
		targetElement = newTargetElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_PRODUCTION__TARGET_ELEMENT, oldTargetElement, targetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetModel() {
		return targetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetModel(String newTargetModel) {
		String oldTargetModel = targetModel;
		targetModel = newTargetModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_PRODUCTION__TARGET_MODEL, oldTargetModel, targetModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_PRODUCTION__INIT_EXPR, oldInitExpr, initExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretationRule getOwningRule() {
		if (eContainerFeatureID != KtrPackage.RULE_PRODUCTION__OWNING_RULE) return null;
		return (InterpretationRule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRule(InterpretationRule newOwningRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRule, KtrPackage.RULE_PRODUCTION__OWNING_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningRule(InterpretationRule newOwningRule) {
		if (newOwningRule != eInternalContainer() || (eContainerFeatureID != KtrPackage.RULE_PRODUCTION__OWNING_RULE && newOwningRule != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRule != null)
				msgs = ((InternalEObject)newOwningRule).eInverseAdd(this, KtrPackage.INTERPRETATION_RULE__PRODUCTIONS, InterpretationRule.class, msgs);
			msgs = basicSetOwningRule(newOwningRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_PRODUCTION__OWNING_RULE, newOwningRule, newOwningRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KtrPackage.RULE_PRODUCTION__OWNING_RULE:
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KtrPackage.RULE_PRODUCTION__OWNING_RULE:
				return basicSetOwningRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case KtrPackage.RULE_PRODUCTION__OWNING_RULE:
				return eInternalContainer().eInverseRemove(this, KtrPackage.INTERPRETATION_RULE__PRODUCTIONS, InterpretationRule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KtrPackage.RULE_PRODUCTION__NAME:
				return getName();
			case KtrPackage.RULE_PRODUCTION__TARGET_ELEMENT:
				if (resolve) return getTargetElement();
				return basicGetTargetElement();
			case KtrPackage.RULE_PRODUCTION__TARGET_MODEL:
				return getTargetModel();
			case KtrPackage.RULE_PRODUCTION__INIT_EXPR:
				return getInitExpr();
			case KtrPackage.RULE_PRODUCTION__OWNING_RULE:
				return getOwningRule();
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
			case KtrPackage.RULE_PRODUCTION__NAME:
				setName((String)newValue);
				return;
			case KtrPackage.RULE_PRODUCTION__TARGET_ELEMENT:
				setTargetElement((EClass)newValue);
				return;
			case KtrPackage.RULE_PRODUCTION__TARGET_MODEL:
				setTargetModel((String)newValue);
				return;
			case KtrPackage.RULE_PRODUCTION__INIT_EXPR:
				setInitExpr((String)newValue);
				return;
			case KtrPackage.RULE_PRODUCTION__OWNING_RULE:
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KtrPackage.RULE_PRODUCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KtrPackage.RULE_PRODUCTION__TARGET_ELEMENT:
				setTargetElement((EClass)null);
				return;
			case KtrPackage.RULE_PRODUCTION__TARGET_MODEL:
				setTargetModel(TARGET_MODEL_EDEFAULT);
				return;
			case KtrPackage.RULE_PRODUCTION__INIT_EXPR:
				setInitExpr(INIT_EXPR_EDEFAULT);
				return;
			case KtrPackage.RULE_PRODUCTION__OWNING_RULE:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KtrPackage.RULE_PRODUCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KtrPackage.RULE_PRODUCTION__TARGET_ELEMENT:
				return targetElement != null;
			case KtrPackage.RULE_PRODUCTION__TARGET_MODEL:
				return TARGET_MODEL_EDEFAULT == null ? targetModel != null : !TARGET_MODEL_EDEFAULT.equals(targetModel);
			case KtrPackage.RULE_PRODUCTION__INIT_EXPR:
				return INIT_EXPR_EDEFAULT == null ? initExpr != null : !INIT_EXPR_EDEFAULT.equals(initExpr);
			case KtrPackage.RULE_PRODUCTION__OWNING_RULE:
				return getOwningRule() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", targetModel: ");
		result.append(targetModel);
		result.append(", initExpr: ");
		result.append(initExpr);
		result.append(')');
		return result.toString();
	}

} //RuleProductionImpl