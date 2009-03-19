/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtConditionalImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtConditional;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtConditionalImpl#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtConditionalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtConditionalImpl#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtConditionalImpl extends CtExpressionImpl implements CtConditional {
	/**
	 * The cached value of the '{@link #getElseExpression() <em>Else Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression elseExpression = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected CtExpression condition = null;

	/**
	 * The cached value of the '{@link #getThenExpression() <em>Then Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression thenExpression = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtConditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_CONDITIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getElseExpression() {
		if (elseExpression != null && elseExpression.eIsProxy()) {
			InternalEObject oldElseExpression = (InternalEObject)elseExpression;
			elseExpression = (CtExpression)eResolveProxy(oldElseExpression);
			if (elseExpression != oldElseExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_CONDITIONAL__ELSE_EXPRESSION, oldElseExpression, elseExpression));
			}
		}
		return elseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetElseExpression() {
		return elseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseExpression(CtExpression newElseExpression) {
		CtExpression oldElseExpression = elseExpression;
		elseExpression = newElseExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_CONDITIONAL__ELSE_EXPRESSION, oldElseExpression, elseExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (CtExpression)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_CONDITIONAL__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(CtExpression newCondition) {
		CtExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_CONDITIONAL__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getThenExpression() {
		if (thenExpression != null && thenExpression.eIsProxy()) {
			InternalEObject oldThenExpression = (InternalEObject)thenExpression;
			thenExpression = (CtExpression)eResolveProxy(oldThenExpression);
			if (thenExpression != oldThenExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_CONDITIONAL__THEN_EXPRESSION, oldThenExpression, thenExpression));
			}
		}
		return thenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetThenExpression() {
		return thenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenExpression(CtExpression newThenExpression) {
		CtExpression oldThenExpression = thenExpression;
		thenExpression = newThenExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_CONDITIONAL__THEN_EXPRESSION, oldThenExpression, thenExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_CONDITIONAL__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_CONDITIONAL__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_CONDITIONAL__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_CONDITIONAL__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_CONDITIONAL__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_CONDITIONAL__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_CONDITIONAL__ELSE_EXPRESSION:
				if (resolve) return getElseExpression();
				return basicGetElseExpression();
			case CodePackage.CT_CONDITIONAL__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case CodePackage.CT_CONDITIONAL__THEN_EXPRESSION:
				if (resolve) return getThenExpression();
				return basicGetThenExpression();
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
			case CodePackage.CT_CONDITIONAL__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_CONDITIONAL__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_CONDITIONAL__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_CONDITIONAL__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_CONDITIONAL__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_CONDITIONAL__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_CONDITIONAL__ELSE_EXPRESSION:
				setElseExpression((CtExpression)newValue);
				return;
			case CodePackage.CT_CONDITIONAL__CONDITION:
				setCondition((CtExpression)newValue);
				return;
			case CodePackage.CT_CONDITIONAL__THEN_EXPRESSION:
				setThenExpression((CtExpression)newValue);
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
			case CodePackage.CT_CONDITIONAL__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_CONDITIONAL__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_CONDITIONAL__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_CONDITIONAL__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_CONDITIONAL__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_CONDITIONAL__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_CONDITIONAL__ELSE_EXPRESSION:
				setElseExpression((CtExpression)null);
				return;
			case CodePackage.CT_CONDITIONAL__CONDITION:
				setCondition((CtExpression)null);
				return;
			case CodePackage.CT_CONDITIONAL__THEN_EXPRESSION:
				setThenExpression((CtExpression)null);
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
			case CodePackage.CT_CONDITIONAL__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_CONDITIONAL__POSITION:
				return position != null;
			case CodePackage.CT_CONDITIONAL__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_CONDITIONAL__PARENT:
				return parent != null;
			case CodePackage.CT_CONDITIONAL__TYPE:
				return type != null;
			case CodePackage.CT_CONDITIONAL__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_CONDITIONAL__ELSE_EXPRESSION:
				return elseExpression != null;
			case CodePackage.CT_CONDITIONAL__CONDITION:
				return condition != null;
			case CodePackage.CT_CONDITIONAL__THEN_EXPRESSION:
				return thenExpression != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtConditionalImpl