/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.language.behavior.BehaviorPackage;
import org.kermeta.language.behavior.CallExpression;
import org.kermeta.language.behavior.Expression;
import org.kermeta.language.behavior.UnresolvedCall;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.Using;
import org.kermeta.language.structure.impl.UnresolvedReferenceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getStaticType <em>Static Type</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getStaticTypeVariableBindings <em>Static Type Variable Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getIsAtpre <em>Is Atpre</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getTargetParent <em>Target Parent</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getGenerics <em>Generics</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.impl.UnresolvedCallImpl#getIsCalledWithParenthesis <em>Is Called With Parenthesis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedCallImpl extends UnresolvedReferenceImpl implements UnresolvedCall {
	/**
	 * The cached value of the '{@link #getContainedType() <em>Contained Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> containedType;

	/**
	 * The cached value of the '{@link #getStaticType() <em>Static Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticType()
	 * @generated
	 * @ordered
	 */
	protected Type staticType;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> parameters;

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
	 * The cached value of the '{@link #getStaticTypeVariableBindings() <em>Static Type Variable Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticTypeVariableBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> staticTypeVariableBindings;

	/**
	 * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsings()
	 * @generated
	 * @ordered
	 */
	protected EList<Using> usings;

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
	 * The default value of the '{@link #getIsAtpre() <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtpre()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ATPRE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAtpre() <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtpre()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAtpre = IS_ATPRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetParent() <em>Target Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParent()
	 * @generated
	 * @ordered
	 */
	protected Type targetParent;

	/**
	 * The cached value of the '{@link #getGenerics() <em>Generics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerics()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> generics;

	/**
	 * The default value of the '{@link #getIsCalledWithParenthesis() <em>Is Called With Parenthesis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCalledWithParenthesis()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CALLED_WITH_PARENTHESIS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsCalledWithParenthesis() <em>Is Called With Parenthesis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCalledWithParenthesis()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCalledWithParenthesis = IS_CALLED_WITH_PARENTHESIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.UNRESOLVED_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getContainedType() {
		if (containedType == null) {
			containedType = new EObjectContainmentWithInverseEList<Type>(Type.class, this, BehaviorPackage.UNRESOLVED_CALL__CONTAINED_TYPE, StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getStaticType() {
		if (staticType != null && staticType.eIsProxy()) {
			InternalEObject oldStaticType = (InternalEObject)staticType;
			staticType = (Type)eResolveProxy(oldStaticType);
			if (staticType != oldStaticType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE, oldStaticType, staticType));
			}
		}
		return staticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetStaticType() {
		return staticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticType(Type newStaticType) {
		Type oldStaticType = staticType;
		staticType = newStaticType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE, oldStaticType, staticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Expression>(Expression.class, this, BehaviorPackage.UNRESOLVED_CALL__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.UNRESOLVED_CALL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getStaticTypeVariableBindings() {
		if (staticTypeVariableBindings == null) {
			staticTypeVariableBindings = new EObjectResolvingEList<Type>(Type.class, this, BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE_VARIABLE_BINDINGS);
		}
		return staticTypeVariableBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Using> getUsings() {
		if (usings == null) {
			usings = new EObjectContainmentEList<Using>(Using.class, this, BehaviorPackage.UNRESOLVED_CALL__USINGS);
		}
		return usings;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.UNRESOLVED_CALL__TARGET, oldTarget, newTarget);
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
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.UNRESOLVED_CALL__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.UNRESOLVED_CALL__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.UNRESOLVED_CALL__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAtpre() {
		return isAtpre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAtpre(Boolean newIsAtpre) {
		Boolean oldIsAtpre = isAtpre;
		isAtpre = newIsAtpre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.UNRESOLVED_CALL__IS_ATPRE, oldIsAtpre, isAtpre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTargetParent() {
		if (targetParent != null && targetParent.eIsProxy()) {
			InternalEObject oldTargetParent = (InternalEObject)targetParent;
			targetParent = (Type)eResolveProxy(oldTargetParent);
			if (targetParent != oldTargetParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.UNRESOLVED_CALL__TARGET_PARENT, oldTargetParent, targetParent));
			}
		}
		return targetParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetTargetParent() {
		return targetParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetParent(Type newTargetParent) {
		Type oldTargetParent = targetParent;
		targetParent = newTargetParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.UNRESOLVED_CALL__TARGET_PARENT, oldTargetParent, targetParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getGenerics() {
		if (generics == null) {
			generics = new EObjectResolvingEList<Type>(Type.class, this, BehaviorPackage.UNRESOLVED_CALL__GENERICS);
		}
		return generics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCalledWithParenthesis() {
		return isCalledWithParenthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCalledWithParenthesis(Boolean newIsCalledWithParenthesis) {
		Boolean oldIsCalledWithParenthesis = isCalledWithParenthesis;
		isCalledWithParenthesis = newIsCalledWithParenthesis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.UNRESOLVED_CALL__IS_CALLED_WITH_PARENTHESIS, oldIsCalledWithParenthesis, isCalledWithParenthesis));
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
			case BehaviorPackage.UNRESOLVED_CALL__CONTAINED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedType()).basicAdd(otherEnd, msgs);
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
			case BehaviorPackage.UNRESOLVED_CALL__CONTAINED_TYPE:
				return ((InternalEList<?>)getContainedType()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.UNRESOLVED_CALL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.UNRESOLVED_CALL__USINGS:
				return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.UNRESOLVED_CALL__TARGET:
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
			case BehaviorPackage.UNRESOLVED_CALL__CONTAINED_TYPE:
				return getContainedType();
			case BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE:
				if (resolve) return getStaticType();
				return basicGetStaticType();
			case BehaviorPackage.UNRESOLVED_CALL__PARAMETERS:
				return getParameters();
			case BehaviorPackage.UNRESOLVED_CALL__NAME:
				return getName();
			case BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE_VARIABLE_BINDINGS:
				return getStaticTypeVariableBindings();
			case BehaviorPackage.UNRESOLVED_CALL__USINGS:
				return getUsings();
			case BehaviorPackage.UNRESOLVED_CALL__TARGET:
				return getTarget();
			case BehaviorPackage.UNRESOLVED_CALL__IS_ATPRE:
				return getIsAtpre();
			case BehaviorPackage.UNRESOLVED_CALL__TARGET_PARENT:
				if (resolve) return getTargetParent();
				return basicGetTargetParent();
			case BehaviorPackage.UNRESOLVED_CALL__GENERICS:
				return getGenerics();
			case BehaviorPackage.UNRESOLVED_CALL__IS_CALLED_WITH_PARENTHESIS:
				return getIsCalledWithParenthesis();
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
			case BehaviorPackage.UNRESOLVED_CALL__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection<? extends Type>)newValue);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE:
				setStaticType((Type)newValue);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Expression>)newValue);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__NAME:
				setName((String)newValue);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE_VARIABLE_BINDINGS:
				getStaticTypeVariableBindings().clear();
				getStaticTypeVariableBindings().addAll((Collection<? extends Type>)newValue);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__USINGS:
				getUsings().clear();
				getUsings().addAll((Collection<? extends Using>)newValue);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__TARGET:
				setTarget((Expression)newValue);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__IS_ATPRE:
				setIsAtpre((Boolean)newValue);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__TARGET_PARENT:
				setTargetParent((Type)newValue);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__GENERICS:
				getGenerics().clear();
				getGenerics().addAll((Collection<? extends Type>)newValue);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__IS_CALLED_WITH_PARENTHESIS:
				setIsCalledWithParenthesis((Boolean)newValue);
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
			case BehaviorPackage.UNRESOLVED_CALL__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE:
				setStaticType((Type)null);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__PARAMETERS:
				getParameters().clear();
				return;
			case BehaviorPackage.UNRESOLVED_CALL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE_VARIABLE_BINDINGS:
				getStaticTypeVariableBindings().clear();
				return;
			case BehaviorPackage.UNRESOLVED_CALL__USINGS:
				getUsings().clear();
				return;
			case BehaviorPackage.UNRESOLVED_CALL__TARGET:
				setTarget((Expression)null);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__IS_ATPRE:
				setIsAtpre(IS_ATPRE_EDEFAULT);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__TARGET_PARENT:
				setTargetParent((Type)null);
				return;
			case BehaviorPackage.UNRESOLVED_CALL__GENERICS:
				getGenerics().clear();
				return;
			case BehaviorPackage.UNRESOLVED_CALL__IS_CALLED_WITH_PARENTHESIS:
				setIsCalledWithParenthesis(IS_CALLED_WITH_PARENTHESIS_EDEFAULT);
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
			case BehaviorPackage.UNRESOLVED_CALL__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE:
				return staticType != null;
			case BehaviorPackage.UNRESOLVED_CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BehaviorPackage.UNRESOLVED_CALL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE_VARIABLE_BINDINGS:
				return staticTypeVariableBindings != null && !staticTypeVariableBindings.isEmpty();
			case BehaviorPackage.UNRESOLVED_CALL__USINGS:
				return usings != null && !usings.isEmpty();
			case BehaviorPackage.UNRESOLVED_CALL__TARGET:
				return target != null;
			case BehaviorPackage.UNRESOLVED_CALL__IS_ATPRE:
				return IS_ATPRE_EDEFAULT == null ? isAtpre != null : !IS_ATPRE_EDEFAULT.equals(isAtpre);
			case BehaviorPackage.UNRESOLVED_CALL__TARGET_PARENT:
				return targetParent != null;
			case BehaviorPackage.UNRESOLVED_CALL__GENERICS:
				return generics != null && !generics.isEmpty();
			case BehaviorPackage.UNRESOLVED_CALL__IS_CALLED_WITH_PARENTHESIS:
				return IS_CALLED_WITH_PARENTHESIS_EDEFAULT == null ? isCalledWithParenthesis != null : !IS_CALLED_WITH_PARENTHESIS_EDEFAULT.equals(isCalledWithParenthesis);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
				case BehaviorPackage.UNRESOLVED_CALL__CONTAINED_TYPE: return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				case BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE: return BehaviorPackage.EXPRESSION__STATIC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == CallExpression.class) {
			switch (derivedFeatureID) {
				case BehaviorPackage.UNRESOLVED_CALL__PARAMETERS: return BehaviorPackage.CALL_EXPRESSION__PARAMETERS;
				case BehaviorPackage.UNRESOLVED_CALL__NAME: return BehaviorPackage.CALL_EXPRESSION__NAME;
				case BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE_VARIABLE_BINDINGS: return BehaviorPackage.CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE: return BehaviorPackage.UNRESOLVED_CALL__CONTAINED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.EXPRESSION__STATIC_TYPE: return BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == CallExpression.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.CALL_EXPRESSION__PARAMETERS: return BehaviorPackage.UNRESOLVED_CALL__PARAMETERS;
				case BehaviorPackage.CALL_EXPRESSION__NAME: return BehaviorPackage.UNRESOLVED_CALL__NAME;
				case BehaviorPackage.CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS: return BehaviorPackage.UNRESOLVED_CALL__STATIC_TYPE_VARIABLE_BINDINGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", isAtpre: ");
		result.append(isAtpre);
		result.append(", isCalledWithParenthesis: ");
		result.append(isCalledWithParenthesis);
		result.append(')');
		return result.toString();
	}

} //UnresolvedCallImpl
