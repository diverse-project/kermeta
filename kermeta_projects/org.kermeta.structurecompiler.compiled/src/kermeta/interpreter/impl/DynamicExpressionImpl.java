/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicExpressionImpl.java,v 1.10 2009-01-21 09:15:58 cfaucher Exp $
 */
package kermeta.interpreter.impl;

import java.util.Collection;

import kermeta.interpreter.DynamicExpression;
import kermeta.interpreter.InterpreterPackage;
import kermeta.interpreter.KermetaError;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Type;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.utils.Hashtable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.interpreter.impl.DynamicExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link kermeta.interpreter.impl.DynamicExpressionImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link kermeta.interpreter.impl.DynamicExpressionImpl#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link kermeta.interpreter.impl.DynamicExpressionImpl#getSelfClass <em>Self Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicExpressionImpl extends ObjectImpl implements
		DynamicExpression {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<KermetaError> errors;

	/**
	 * The cached value of the '{@link #getFormalParameters() <em>Formal Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameters()
	 * @generated
	 * @ordered
	 */
	protected Hashtable<String, Type> formalParameters;

	/**
	 * The cached value of the '{@link #getSelfClass() <em>Self Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDefinition selfClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterpreterPackage.Literals.DYNAMIC_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject) expression;
			expression = (Expression) eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InterpreterPackage.DYNAMIC_EXPRESSION__EXPRESSION,
							oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InterpreterPackage.DYNAMIC_EXPRESSION__EXPRESSION,
					oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KermetaError> getErrors() {
		if (errors == null) {
			errors = new EObjectResolvingEList<KermetaError>(
					KermetaError.class, this,
					InterpreterPackage.DYNAMIC_EXPRESSION__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Hashtable<String, Type> getFormalParameters() {
		if (formalParameters != null && formalParameters.eIsProxy()) {
			InternalEObject oldFormalParameters = (InternalEObject) formalParameters;
			formalParameters = (Hashtable<String, Type>) eResolveProxy(oldFormalParameters);
			if (formalParameters != oldFormalParameters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS,
							oldFormalParameters, formalParameters));
			}
		}
		return formalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable<String, Type> basicGetFormalParameters() {
		return formalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalParameters(Hashtable<String, Type> newFormalParameters) {
		Hashtable<String, Type> oldFormalParameters = formalParameters;
		formalParameters = newFormalParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS,
					oldFormalParameters, formalParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getSelfClass() {
		if (selfClass != null && selfClass.eIsProxy()) {
			InternalEObject oldSelfClass = (InternalEObject) selfClass;
			selfClass = (ClassDefinition) eResolveProxy(oldSelfClass);
			if (selfClass != oldSelfClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS,
							oldSelfClass, selfClass));
			}
		}
		return selfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetSelfClass() {
		return selfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfClass(ClassDefinition newSelfClass) {
		ClassDefinition oldSelfClass = selfClass;
		selfClass = newSelfClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS,
					oldSelfClass, selfClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeDefaults() {

		this
				.setFormalParameters(((kermeta.utils.Hashtable<java.lang.String, kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.utils.UtilsPackage.eINSTANCE
								.getHashtable())));

		this
				.setSelfClass((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeOrVoid(
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Object")
										.getTypeDefinition(),
								"kermeta.language.structure.ClassDefinition"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object execute(
			kermeta.language.structure.Object selfObj,
			Hashtable<String, kermeta.language.structure.Object> actualParams) {

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_970 = false;
		idIfCond_970 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getExpression(), null);

		if (idIfCond_970) {

			kermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getDynamicExpressionException()));

			e.setMessage("execute precondition - expression is void");

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		java.lang.Boolean idIfCond_971 = false;
		idIfCond_971 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(
						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.interpreter.KermetaError> convertAsOrderedSet(
										this.getErrors()).size(), 0);

		if (idIfCond_971) {

			kermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getDynamicExpressionException()));

			e.setMessage("execute precondition - expression contains errors");

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		result = org.kermeta.compil.runtime.helper.language.DynamicExpressionUtil
				.execute(this, selfObj, actualParams);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean parse(String expression) {

		java.lang.Boolean result = null;

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.interpreter.KermetaError> convertAsOrderedSet(
						this.getErrors()).clear();

		java.lang.Boolean idIfCond_972 = false;
		idIfCond_972 = kermeta.standard.helper.BooleanWrapper.or(
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(this.getFormalParameters(), null),
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(this.getSelfClass(), null));

		if (idIfCond_972) {

			kermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getDynamicExpressionException()));

			e
					.setMessage("parse precondition - formalParameters or selfType is void");

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.DynamicExpressionUtil
								.parse(this, expression), "java.lang.Boolean");

		java.lang.Boolean idIfCond_973 = false;
		idIfCond_973 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(
						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.interpreter.KermetaError> convertAsOrderedSet(
										this.getErrors()).size(), 0);

		if (idIfCond_973) {

			kermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getDynamicExpressionException()));

			e.setMessage("parse result - expression contains errors");

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.interpreter.KermetaError> it_ft218 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.interpreter.KermetaError> convertAsOrderedSet(
								this.getErrors()).iterator();
				java.lang.Boolean idLoopCond_974 = false;
				while (!idLoopCond_974) {
					idLoopCond_974 = it_ft218.isOff();
					if (idLoopCond_974) {
					} else {

						//BIle:func
						kermeta.interpreter.KermetaError error_lbdExp218 = it_ft218
								.next();

						kermeta.standard.helper.StringWrapper.append(e
								.getMessage(),
								kermeta.standard.helper.StringWrapper.plus(
										"\n", error_lbdExp218.getMessage()));
						//EIle:func

					}
				}
			}

			//EIft:each

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object evalString(String body,
			kermeta.language.structure.Object selfObj,
			Hashtable<String, kermeta.language.structure.Object> actualParams) {

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_975 = false;
		idIfCond_975 = kermeta.standard.helper.BooleanWrapper.not(this
				.parse(body));

		if (idIfCond_975) {

			kermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getDynamicExpressionException()));

			e.setMessage("evalString - expression contains errors");

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		result = this.execute(selfObj, actualParams);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InterpreterPackage.DYNAMIC_EXPRESSION__EXPRESSION:
			if (resolve)
				return getExpression();
			return basicGetExpression();
		case InterpreterPackage.DYNAMIC_EXPRESSION__ERRORS:
			return getErrors();
		case InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS:
			if (resolve)
				return getFormalParameters();
			return basicGetFormalParameters();
		case InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS:
			if (resolve)
				return getSelfClass();
			return basicGetSelfClass();
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
		case InterpreterPackage.DYNAMIC_EXPRESSION__EXPRESSION:
			setExpression((Expression) newValue);
			return;
		case InterpreterPackage.DYNAMIC_EXPRESSION__ERRORS:
			getErrors().clear();
			getErrors().addAll((Collection<? extends KermetaError>) newValue);
			return;
		case InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS:
			setFormalParameters((Hashtable<String, Type>) newValue);
			return;
		case InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS:
			setSelfClass((ClassDefinition) newValue);
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
		case InterpreterPackage.DYNAMIC_EXPRESSION__EXPRESSION:
			setExpression((Expression) null);
			return;
		case InterpreterPackage.DYNAMIC_EXPRESSION__ERRORS:
			getErrors().clear();
			return;
		case InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS:
			setFormalParameters((Hashtable<String, Type>) null);
			return;
		case InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS:
			setSelfClass((ClassDefinition) null);
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
		case InterpreterPackage.DYNAMIC_EXPRESSION__EXPRESSION:
			return expression != null;
		case InterpreterPackage.DYNAMIC_EXPRESSION__ERRORS:
			return errors != null && !errors.isEmpty();
		case InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS:
			return formalParameters != null;
		case InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS:
			return selfClass != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicExpressionImpl
