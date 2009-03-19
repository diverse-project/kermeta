/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtForEachImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtForEach;
import emf.spoon.reflect.code.CtLocalVariable;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct For Each</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtForEachImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtForEachImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtForEachImpl extends CtLoopImpl implements CtForEach {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression expression = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected CtLocalVariable variable = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtForEachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_FOR_EACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (CtExpression)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_FOR_EACH__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(CtExpression newExpression) {
		CtExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_FOR_EACH__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtLocalVariable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (CtLocalVariable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_FOR_EACH__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtLocalVariable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(CtLocalVariable newVariable) {
		CtLocalVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_FOR_EACH__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_FOR_EACH__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_FOR_EACH__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_FOR_EACH__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_FOR_EACH__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_FOR_EACH__LABEL:
				return getLabel();
			case CodePackage.CT_FOR_EACH__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case CodePackage.CT_FOR_EACH__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
			case CodePackage.CT_FOR_EACH__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodePackage.CT_FOR_EACH__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_FOR_EACH__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_FOR_EACH__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_FOR_EACH__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_FOR_EACH__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_FOR_EACH__BODY:
				setBody((CtStatement)newValue);
				return;
			case CodePackage.CT_FOR_EACH__EXPRESSION:
				setExpression((CtExpression)newValue);
				return;
			case CodePackage.CT_FOR_EACH__VARIABLE:
				setVariable((CtLocalVariable)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodePackage.CT_FOR_EACH__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_FOR_EACH__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_FOR_EACH__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_FOR_EACH__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_FOR_EACH__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_FOR_EACH__BODY:
				setBody((CtStatement)null);
				return;
			case CodePackage.CT_FOR_EACH__EXPRESSION:
				setExpression((CtExpression)null);
				return;
			case CodePackage.CT_FOR_EACH__VARIABLE:
				setVariable((CtLocalVariable)null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodePackage.CT_FOR_EACH__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_FOR_EACH__POSITION:
				return position != null;
			case CodePackage.CT_FOR_EACH__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_FOR_EACH__PARENT:
				return parent != null;
			case CodePackage.CT_FOR_EACH__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_FOR_EACH__BODY:
				return body != null;
			case CodePackage.CT_FOR_EACH__EXPRESSION:
				return expression != null;
			case CodePackage.CT_FOR_EACH__VARIABLE:
				return variable != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtForEachImpl