/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.essentialocl.impl;

import fr.tm.elibel.smartqvt.qvt.emof.impl.TypedElementImpl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage;
import fr.tm.elibel.smartqvt.qvt.essentialocl.ExpressionInOcl;
import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;
import fr.tm.elibel.smartqvt.qvt.essentialocl.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression In Ocl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.impl.ExpressionInOclImpl#getBodyExpression <em>Body Expression</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.impl.ExpressionInOclImpl#getContextVariable <em>Context Variable</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.impl.ExpressionInOclImpl#getParameterVariable <em>Parameter Variable</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.impl.ExpressionInOclImpl#getResultVariable <em>Result Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionInOclImpl extends TypedElementImpl implements ExpressionInOcl {
	/**
	 * The cached value of the '{@link #getBodyExpression() <em>Body Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyExpression()
	 * @generated
	 * @ordered
	 */
	protected OclExpression bodyExpression;

	/**
	 * The cached value of the '{@link #getContextVariable() <em>Context Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable contextVariable;

	/**
	 * The cached value of the '{@link #getParameterVariable() <em>Parameter Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterVariable()
	 * @generated
	 * @ordered
	 */
	protected EList parameterVariable;

	/**
	 * The cached value of the '{@link #getResultVariable() <em>Result Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable resultVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionInOclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EssentialoclPackage.Literals.EXPRESSION_IN_OCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getBodyExpression() {
		return bodyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyExpression(OclExpression newBodyExpression, NotificationChain msgs) {
		OclExpression oldBodyExpression = bodyExpression;
		bodyExpression = newBodyExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssentialoclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION, oldBodyExpression, newBodyExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyExpression(OclExpression newBodyExpression) {
		if (newBodyExpression != bodyExpression) {
			NotificationChain msgs = null;
			if (bodyExpression != null)
				msgs = ((InternalEObject)bodyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssentialoclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION, null, msgs);
			if (newBodyExpression != null)
				msgs = ((InternalEObject)newBodyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssentialoclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION, null, msgs);
			msgs = basicSetBodyExpression(newBodyExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialoclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION, newBodyExpression, newBodyExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getContextVariable() {
		return contextVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextVariable(Variable newContextVariable, NotificationChain msgs) {
		Variable oldContextVariable = contextVariable;
		contextVariable = newContextVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssentialoclPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE, oldContextVariable, newContextVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextVariable(Variable newContextVariable) {
		if (newContextVariable != contextVariable) {
			NotificationChain msgs = null;
			if (contextVariable != null)
				msgs = ((InternalEObject)contextVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssentialoclPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE, null, msgs);
			if (newContextVariable != null)
				msgs = ((InternalEObject)newContextVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssentialoclPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE, null, msgs);
			msgs = basicSetContextVariable(newContextVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialoclPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE, newContextVariable, newContextVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameterVariable() {
		if (parameterVariable == null) {
			parameterVariable = new EObjectContainmentEList(Variable.class, this, EssentialoclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE);
		}
		return parameterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getResultVariable() {
		return resultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultVariable(Variable newResultVariable, NotificationChain msgs) {
		Variable oldResultVariable = resultVariable;
		resultVariable = newResultVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssentialoclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE, oldResultVariable, newResultVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultVariable(Variable newResultVariable) {
		if (newResultVariable != resultVariable) {
			NotificationChain msgs = null;
			if (resultVariable != null)
				msgs = ((InternalEObject)resultVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssentialoclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE, null, msgs);
			if (newResultVariable != null)
				msgs = ((InternalEObject)newResultVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssentialoclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE, null, msgs);
			msgs = basicSetResultVariable(newResultVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialoclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE, newResultVariable, newResultVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssentialoclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
				return basicSetBodyExpression(null, msgs);
			case EssentialoclPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE:
				return basicSetContextVariable(null, msgs);
			case EssentialoclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
				return ((InternalEList)getParameterVariable()).basicRemove(otherEnd, msgs);
			case EssentialoclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				return basicSetResultVariable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssentialoclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
				return getBodyExpression();
			case EssentialoclPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE:
				return getContextVariable();
			case EssentialoclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
				return getParameterVariable();
			case EssentialoclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				return getResultVariable();
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
			case EssentialoclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
				setBodyExpression((OclExpression)newValue);
				return;
			case EssentialoclPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE:
				setContextVariable((Variable)newValue);
				return;
			case EssentialoclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
				getParameterVariable().clear();
				getParameterVariable().addAll((Collection)newValue);
				return;
			case EssentialoclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				setResultVariable((Variable)newValue);
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
			case EssentialoclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
				setBodyExpression((OclExpression)null);
				return;
			case EssentialoclPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE:
				setContextVariable((Variable)null);
				return;
			case EssentialoclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
				getParameterVariable().clear();
				return;
			case EssentialoclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				setResultVariable((Variable)null);
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
			case EssentialoclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
				return bodyExpression != null;
			case EssentialoclPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE:
				return contextVariable != null;
			case EssentialoclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
				return parameterVariable != null && !parameterVariable.isEmpty();
			case EssentialoclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				return resultVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionInOclImpl
