/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterpretationRuleImpl.java,v 1.2 2007-07-31 13:19:20 dtouzet Exp $
 */
package fr.irisa.triskell.ktr.impl;

import fr.irisa.triskell.ktr.InterpretationPatternModel;
import fr.irisa.triskell.ktr.InterpretationRule;
import fr.irisa.triskell.ktr.KtrPackage;
import fr.irisa.triskell.ktr.RulePattern;
import fr.irisa.triskell.ktr.RuleProduction;
import fr.irisa.triskell.ktr.RuleVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interpretation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.impl.InterpretationRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.InterpretationRuleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.InterpretationRuleImpl#getProductions <em>Productions</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.InterpretationRuleImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.InterpretationRuleImpl#getSuperRule <em>Super Rule</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.InterpretationRuleImpl#getOwningModel <em>Owning Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterpretationRuleImpl extends EObjectImpl implements InterpretationRule {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected RulePattern source;

	/**
	 * The cached value of the '{@link #getProductions() <em>Productions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductions()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleProduction> productions;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleVariable> variables;

	/**
	 * The cached value of the '{@link #getSuperRule() <em>Super Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperRule()
	 * @generated
	 * @ordered
	 */
	protected InterpretationRule superRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterpretationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KtrPackage.Literals.INTERPRETATION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.INTERPRETATION_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulePattern getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(RulePattern newSource, NotificationChain msgs) {
		RulePattern oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KtrPackage.INTERPRETATION_RULE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(RulePattern newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, KtrPackage.RULE_PATTERN__OWNING_RULE, RulePattern.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, KtrPackage.RULE_PATTERN__OWNING_RULE, RulePattern.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.INTERPRETATION_RULE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleProduction> getProductions() {
		if (productions == null) {
			productions = new EObjectContainmentWithInverseEList<RuleProduction>(RuleProduction.class, this, KtrPackage.INTERPRETATION_RULE__PRODUCTIONS, KtrPackage.RULE_PRODUCTION__OWNING_RULE);
		}
		return productions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<RuleVariable>(RuleVariable.class, this, KtrPackage.INTERPRETATION_RULE__VARIABLES, KtrPackage.RULE_VARIABLE__OWNING_RULE);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretationRule getSuperRule() {
		if (superRule != null && superRule.eIsProxy()) {
			InternalEObject oldSuperRule = (InternalEObject)superRule;
			superRule = (InterpretationRule)eResolveProxy(oldSuperRule);
			if (superRule != oldSuperRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KtrPackage.INTERPRETATION_RULE__SUPER_RULE, oldSuperRule, superRule));
			}
		}
		return superRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretationRule basicGetSuperRule() {
		return superRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperRule(InterpretationRule newSuperRule) {
		InterpretationRule oldSuperRule = superRule;
		superRule = newSuperRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.INTERPRETATION_RULE__SUPER_RULE, oldSuperRule, superRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretationPatternModel getOwningModel() {
		if (eContainerFeatureID != KtrPackage.INTERPRETATION_RULE__OWNING_MODEL) return null;
		return (InterpretationPatternModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningModel(InterpretationPatternModel newOwningModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningModel, KtrPackage.INTERPRETATION_RULE__OWNING_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningModel(InterpretationPatternModel newOwningModel) {
		if (newOwningModel != eInternalContainer() || (eContainerFeatureID != KtrPackage.INTERPRETATION_RULE__OWNING_MODEL && newOwningModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwningModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningModel != null)
				msgs = ((InternalEObject)newOwningModel).eInverseAdd(this, KtrPackage.INTERPRETATION_PATTERN_MODEL__RULES, InterpretationPatternModel.class, msgs);
			msgs = basicSetOwningModel(newOwningModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.INTERPRETATION_RULE__OWNING_MODEL, newOwningModel, newOwningModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KtrPackage.INTERPRETATION_RULE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KtrPackage.INTERPRETATION_RULE__SOURCE, null, msgs);
				return basicSetSource((RulePattern)otherEnd, msgs);
			case KtrPackage.INTERPRETATION_RULE__PRODUCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductions()).basicAdd(otherEnd, msgs);
			case KtrPackage.INTERPRETATION_RULE__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
			case KtrPackage.INTERPRETATION_RULE__OWNING_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningModel((InterpretationPatternModel)otherEnd, msgs);
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
			case KtrPackage.INTERPRETATION_RULE__SOURCE:
				return basicSetSource(null, msgs);
			case KtrPackage.INTERPRETATION_RULE__PRODUCTIONS:
				return ((InternalEList<?>)getProductions()).basicRemove(otherEnd, msgs);
			case KtrPackage.INTERPRETATION_RULE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case KtrPackage.INTERPRETATION_RULE__OWNING_MODEL:
				return basicSetOwningModel(null, msgs);
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
			case KtrPackage.INTERPRETATION_RULE__OWNING_MODEL:
				return eInternalContainer().eInverseRemove(this, KtrPackage.INTERPRETATION_PATTERN_MODEL__RULES, InterpretationPatternModel.class, msgs);
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
			case KtrPackage.INTERPRETATION_RULE__NAME:
				return getName();
			case KtrPackage.INTERPRETATION_RULE__SOURCE:
				return getSource();
			case KtrPackage.INTERPRETATION_RULE__PRODUCTIONS:
				return getProductions();
			case KtrPackage.INTERPRETATION_RULE__VARIABLES:
				return getVariables();
			case KtrPackage.INTERPRETATION_RULE__SUPER_RULE:
				if (resolve) return getSuperRule();
				return basicGetSuperRule();
			case KtrPackage.INTERPRETATION_RULE__OWNING_MODEL:
				return getOwningModel();
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
			case KtrPackage.INTERPRETATION_RULE__NAME:
				setName((String)newValue);
				return;
			case KtrPackage.INTERPRETATION_RULE__SOURCE:
				setSource((RulePattern)newValue);
				return;
			case KtrPackage.INTERPRETATION_RULE__PRODUCTIONS:
				getProductions().clear();
				getProductions().addAll((Collection<? extends RuleProduction>)newValue);
				return;
			case KtrPackage.INTERPRETATION_RULE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends RuleVariable>)newValue);
				return;
			case KtrPackage.INTERPRETATION_RULE__SUPER_RULE:
				setSuperRule((InterpretationRule)newValue);
				return;
			case KtrPackage.INTERPRETATION_RULE__OWNING_MODEL:
				setOwningModel((InterpretationPatternModel)newValue);
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
			case KtrPackage.INTERPRETATION_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KtrPackage.INTERPRETATION_RULE__SOURCE:
				setSource((RulePattern)null);
				return;
			case KtrPackage.INTERPRETATION_RULE__PRODUCTIONS:
				getProductions().clear();
				return;
			case KtrPackage.INTERPRETATION_RULE__VARIABLES:
				getVariables().clear();
				return;
			case KtrPackage.INTERPRETATION_RULE__SUPER_RULE:
				setSuperRule((InterpretationRule)null);
				return;
			case KtrPackage.INTERPRETATION_RULE__OWNING_MODEL:
				setOwningModel((InterpretationPatternModel)null);
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
			case KtrPackage.INTERPRETATION_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KtrPackage.INTERPRETATION_RULE__SOURCE:
				return source != null;
			case KtrPackage.INTERPRETATION_RULE__PRODUCTIONS:
				return productions != null && !productions.isEmpty();
			case KtrPackage.INTERPRETATION_RULE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case KtrPackage.INTERPRETATION_RULE__SUPER_RULE:
				return superRule != null;
			case KtrPackage.INTERPRETATION_RULE__OWNING_MODEL:
				return getOwningModel() != null;
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
		result.append(')');
		return result.toString();
	}

} //InterpretationRuleImpl