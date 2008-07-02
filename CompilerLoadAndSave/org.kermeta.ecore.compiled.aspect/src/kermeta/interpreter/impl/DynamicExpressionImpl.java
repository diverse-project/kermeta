/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicExpressionImpl.java,v 1.1 2008-07-02 09:43:59 ftanguy Exp $
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
public class DynamicExpressionImpl extends ObjectImpl implements DynamicExpression {
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
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (Expression)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterpreterPackage.DYNAMIC_EXPRESSION__EXPRESSION, oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InterpreterPackage.DYNAMIC_EXPRESSION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KermetaError> getErrors() {
		if (errors == null) {
			errors = new EObjectResolvingEList<KermetaError>(KermetaError.class, this, InterpreterPackage.DYNAMIC_EXPRESSION__ERRORS);
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
			InternalEObject oldFormalParameters = (InternalEObject)formalParameters;
			formalParameters = (Hashtable<String, Type>)eResolveProxy(oldFormalParameters);
			if (formalParameters != oldFormalParameters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS, oldFormalParameters, formalParameters));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS, oldFormalParameters, formalParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getSelfClass() {
		if (selfClass != null && selfClass.eIsProxy()) {
			InternalEObject oldSelfClass = (InternalEObject)selfClass;
			selfClass = (ClassDefinition)eResolveProxy(oldSelfClass);
			if (selfClass != oldSelfClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS, oldSelfClass, selfClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS, oldSelfClass, selfClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object execute(kermeta.language.structure.Object selfObj, Hashtable<String, kermeta.language.structure.Object> actualParams) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.standard.Void initializeDefaults() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean parse(String expression) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object evalString(String body, kermeta.language.structure.Object selfObj, Hashtable<String, kermeta.language.structure.Object> actualParams) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
				if (resolve) return getExpression();
				return basicGetExpression();
			case InterpreterPackage.DYNAMIC_EXPRESSION__ERRORS:
				return getErrors();
			case InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS:
				if (resolve) return getFormalParameters();
				return basicGetFormalParameters();
			case InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS:
				if (resolve) return getSelfClass();
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
				setExpression((Expression)newValue);
				return;
			case InterpreterPackage.DYNAMIC_EXPRESSION__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends KermetaError>)newValue);
				return;
			case InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS:
				setFormalParameters((Hashtable<String, Type>)newValue);
				return;
			case InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS:
				setSelfClass((ClassDefinition)newValue);
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
				setExpression((Expression)null);
				return;
			case InterpreterPackage.DYNAMIC_EXPRESSION__ERRORS:
				getErrors().clear();
				return;
			case InterpreterPackage.DYNAMIC_EXPRESSION__FORMAL_PARAMETERS:
				setFormalParameters((Hashtable<String, Type>)null);
				return;
			case InterpreterPackage.DYNAMIC_EXPRESSION__SELF_CLASS:
				setSelfClass((ClassDefinition)null);
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
