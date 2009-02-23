/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: CallExpressionImpl.java,v 1.12 2009-02-23 15:26:46 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import java.util.Collection;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.CallExpression;
import kermeta.language.behavior.Expression;

import kermeta.language.structure.Type;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.CallExpressionImpl#getStaticTypeVariableBindings <em>Static Type Variable Bindings</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallExpressionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CallExpressionImpl extends ExpressionImpl implements
		CallExpression {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.CALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getStaticTypeVariableBindings() {
		if (staticTypeVariableBindings == null) {
			staticTypeVariableBindings = new EObjectResolvingEList<Type>(
					Type.class,
					this,
					BehaviorPackage.CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS);
		}
		return staticTypeVariableBindings;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CALL_EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList.Resolving<Expression>(
					Expression.class, this,
					BehaviorPackage.CALL_EXPRESSION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isCallFeatureAsStaticEnumLiteral() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_447 = false;
		idIfCond_447 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_447) {

			java.lang.Boolean idIfCond_448 = false;
			idIfCond_448 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											this,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.CallFeature")))
									.getStaticEnumLiteral()));

			if (idIfCond_448) {

				result = true;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isCallFeatureAsStaticOperation() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_449 = false;
		idIfCond_449 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_449) {

			java.lang.Boolean idIfCond_450 = false;
			idIfCond_450 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											this,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.CallFeature")))
									.getStaticOperation()));

			if (idIfCond_450) {

				result = true;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isCallFeatureAsStaticProperty() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_451 = false;
		idIfCond_451 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_451) {

			java.lang.Boolean idIfCond_452 = false;
			idIfCond_452 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											this,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.CallFeature")))
									.getStaticProperty()));

			if (idIfCond_452) {

				result = true;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviorPackage.CALL_EXPRESSION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd,
					msgs);
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
		case BehaviorPackage.CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS:
			return getStaticTypeVariableBindings();
		case BehaviorPackage.CALL_EXPRESSION__NAME:
			return getName();
		case BehaviorPackage.CALL_EXPRESSION__PARAMETERS:
			return getParameters();
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
		case BehaviorPackage.CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS:
			getStaticTypeVariableBindings().clear();
			getStaticTypeVariableBindings().addAll(
					(Collection<? extends Type>) newValue);
			return;
		case BehaviorPackage.CALL_EXPRESSION__NAME:
			setName((String) newValue);
			return;
		case BehaviorPackage.CALL_EXPRESSION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Expression>) newValue);
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
		case BehaviorPackage.CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS:
			getStaticTypeVariableBindings().clear();
			return;
		case BehaviorPackage.CALL_EXPRESSION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BehaviorPackage.CALL_EXPRESSION__PARAMETERS:
			getParameters().clear();
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
		case BehaviorPackage.CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS:
			return staticTypeVariableBindings != null
					&& !staticTypeVariableBindings.isEmpty();
		case BehaviorPackage.CALL_EXPRESSION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case BehaviorPackage.CALL_EXPRESSION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CallExpressionImpl
