/**
 * <copyright>
 * </copyright>
 *
 * $Id: RulePatternImpl.java,v 1.2 2007-07-31 13:19:20 dtouzet Exp $
 */
package fr.irisa.triskell.ktr.impl;

import fr.irisa.triskell.ktr.InterpretationRule;
import fr.irisa.triskell.ktr.KtrPackage;
import fr.irisa.triskell.ktr.RulePattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RulePatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RulePatternImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RulePatternImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RulePatternImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.impl.RulePatternImpl#getOwningRule <em>Owning Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RulePatternImpl extends EObjectImpl implements RulePattern {
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
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected EClass sourceElement;

	/**
	 * The default value of the '{@link #getSourceModel() <em>Source Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceModel() <em>Source Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModel()
	 * @generated
	 * @ordered
	 */
	protected String sourceModel = SOURCE_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KtrPackage.Literals.RULE_PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceElement() {
		if (sourceElement != null && sourceElement.eIsProxy()) {
			InternalEObject oldSourceElement = (InternalEObject)sourceElement;
			sourceElement = (EClass)eResolveProxy(oldSourceElement);
			if (sourceElement != oldSourceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KtrPackage.RULE_PATTERN__SOURCE_ELEMENT, oldSourceElement, sourceElement));
			}
		}
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(EClass newSourceElement) {
		EClass oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_PATTERN__SOURCE_ELEMENT, oldSourceElement, sourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceModel() {
		return sourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceModel(String newSourceModel) {
		String oldSourceModel = sourceModel;
		sourceModel = newSourceModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_PATTERN__SOURCE_MODEL, oldSourceModel, sourceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_PATTERN__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretationRule getOwningRule() {
		if (eContainerFeatureID != KtrPackage.RULE_PATTERN__OWNING_RULE) return null;
		return (InterpretationRule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRule(InterpretationRule newOwningRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRule, KtrPackage.RULE_PATTERN__OWNING_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningRule(InterpretationRule newOwningRule) {
		if (newOwningRule != eInternalContainer() || (eContainerFeatureID != KtrPackage.RULE_PATTERN__OWNING_RULE && newOwningRule != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRule != null)
				msgs = ((InternalEObject)newOwningRule).eInverseAdd(this, KtrPackage.INTERPRETATION_RULE__SOURCE, InterpretationRule.class, msgs);
			msgs = basicSetOwningRule(newOwningRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.RULE_PATTERN__OWNING_RULE, newOwningRule, newOwningRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KtrPackage.RULE_PATTERN__OWNING_RULE:
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
			case KtrPackage.RULE_PATTERN__OWNING_RULE:
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
			case KtrPackage.RULE_PATTERN__OWNING_RULE:
				return eInternalContainer().eInverseRemove(this, KtrPackage.INTERPRETATION_RULE__SOURCE, InterpretationRule.class, msgs);
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
			case KtrPackage.RULE_PATTERN__NAME:
				return getName();
			case KtrPackage.RULE_PATTERN__SOURCE_ELEMENT:
				if (resolve) return getSourceElement();
				return basicGetSourceElement();
			case KtrPackage.RULE_PATTERN__SOURCE_MODEL:
				return getSourceModel();
			case KtrPackage.RULE_PATTERN__CONDITION:
				return getCondition();
			case KtrPackage.RULE_PATTERN__OWNING_RULE:
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
			case KtrPackage.RULE_PATTERN__NAME:
				setName((String)newValue);
				return;
			case KtrPackage.RULE_PATTERN__SOURCE_ELEMENT:
				setSourceElement((EClass)newValue);
				return;
			case KtrPackage.RULE_PATTERN__SOURCE_MODEL:
				setSourceModel((String)newValue);
				return;
			case KtrPackage.RULE_PATTERN__CONDITION:
				setCondition((String)newValue);
				return;
			case KtrPackage.RULE_PATTERN__OWNING_RULE:
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
			case KtrPackage.RULE_PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KtrPackage.RULE_PATTERN__SOURCE_ELEMENT:
				setSourceElement((EClass)null);
				return;
			case KtrPackage.RULE_PATTERN__SOURCE_MODEL:
				setSourceModel(SOURCE_MODEL_EDEFAULT);
				return;
			case KtrPackage.RULE_PATTERN__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case KtrPackage.RULE_PATTERN__OWNING_RULE:
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
			case KtrPackage.RULE_PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KtrPackage.RULE_PATTERN__SOURCE_ELEMENT:
				return sourceElement != null;
			case KtrPackage.RULE_PATTERN__SOURCE_MODEL:
				return SOURCE_MODEL_EDEFAULT == null ? sourceModel != null : !SOURCE_MODEL_EDEFAULT.equals(sourceModel);
			case KtrPackage.RULE_PATTERN__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case KtrPackage.RULE_PATTERN__OWNING_RULE:
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
		result.append(", sourceModel: ");
		result.append(sourceModel);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //RulePatternImpl