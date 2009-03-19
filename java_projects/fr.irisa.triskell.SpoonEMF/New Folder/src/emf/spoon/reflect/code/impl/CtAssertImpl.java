/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAssertImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtAssert;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtAssertImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtAssertImpl#getAssertExpression <em>Assert Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract  class CtAssertImpl extends CtStatementImpl implements CtAssert {
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
	 * The cached value of the '{@link #getAssertExpression() <em>Assert Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression assertExpression = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtAssertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_ASSERT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_ASSERT__EXPRESSION, oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_ASSERT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getAssertExpression() {
		if (assertExpression != null && assertExpression.eIsProxy()) {
			InternalEObject oldAssertExpression = (InternalEObject)assertExpression;
			assertExpression = (CtExpression)eResolveProxy(oldAssertExpression);
			if (assertExpression != oldAssertExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_ASSERT__ASSERT_EXPRESSION, oldAssertExpression, assertExpression));
			}
		}
		return assertExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetAssertExpression() {
		return assertExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertExpression(CtExpression newAssertExpression) {
		CtExpression oldAssertExpression = assertExpression;
		assertExpression = newAssertExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_ASSERT__ASSERT_EXPRESSION, oldAssertExpression, assertExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_ASSERT__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_ASSERT__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_ASSERT__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_ASSERT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_ASSERT__LABEL:
				return getLabel();
			case CodePackage.CT_ASSERT__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
			case CodePackage.CT_ASSERT__ASSERT_EXPRESSION:
				if (resolve) return getAssertExpression();
				return basicGetAssertExpression();
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
			case CodePackage.CT_ASSERT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_ASSERT__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_ASSERT__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_ASSERT__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_ASSERT__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_ASSERT__EXPRESSION:
				setExpression((CtExpression)newValue);
				return;
			case CodePackage.CT_ASSERT__ASSERT_EXPRESSION:
				setAssertExpression((CtExpression)newValue);
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
			case CodePackage.CT_ASSERT__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_ASSERT__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_ASSERT__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_ASSERT__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_ASSERT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_ASSERT__EXPRESSION:
				setExpression((CtExpression)null);
				return;
			case CodePackage.CT_ASSERT__ASSERT_EXPRESSION:
				setAssertExpression((CtExpression)null);
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
			case CodePackage.CT_ASSERT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_ASSERT__POSITION:
				return position != null;
			case CodePackage.CT_ASSERT__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_ASSERT__PARENT:
				return parent != null;
			case CodePackage.CT_ASSERT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_ASSERT__EXPRESSION:
				return expression != null;
			case CodePackage.CT_ASSERT__ASSERT_EXPRESSION:
				return assertExpression != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtAssertImpl