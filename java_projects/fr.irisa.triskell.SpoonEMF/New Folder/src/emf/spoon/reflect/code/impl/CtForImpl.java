/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtForImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtFor;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtForImpl#getForInit <em>For Init</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtForImpl#getForUpdate <em>For Update</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtForImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtForImpl extends CtLoopImpl implements CtFor {
	/**
	 * The cached value of the '{@link #getForInit() <em>For Init</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForInit()
	 * @generated
	 * @ordered
	 */
	protected EList forInit = null;

	/**
	 * The cached value of the '{@link #getForUpdate() <em>For Update</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForUpdate()
	 * @generated
	 * @ordered
	 */
	protected EList forUpdate = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_FOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getForInit() {
		if (forInit == null) {
			forInit = new EObjectResolvingEList(CtStatement.class, this, CodePackage.CT_FOR__FOR_INIT);
		}
		return forInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getForUpdate() {
		if (forUpdate == null) {
			forUpdate = new EObjectResolvingEList(CtStatement.class, this, CodePackage.CT_FOR__FOR_UPDATE);
		}
		return forUpdate;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_FOR__EXPRESSION, oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_FOR__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_FOR__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_FOR__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_FOR__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_FOR__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_FOR__LABEL:
				return getLabel();
			case CodePackage.CT_FOR__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case CodePackage.CT_FOR__FOR_INIT:
				return getForInit();
			case CodePackage.CT_FOR__FOR_UPDATE:
				return getForUpdate();
			case CodePackage.CT_FOR__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
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
			case CodePackage.CT_FOR__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_FOR__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_FOR__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_FOR__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_FOR__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_FOR__BODY:
				setBody((CtStatement)newValue);
				return;
			case CodePackage.CT_FOR__FOR_INIT:
				getForInit().clear();
				getForInit().addAll((Collection)newValue);
				return;
			case CodePackage.CT_FOR__FOR_UPDATE:
				getForUpdate().clear();
				getForUpdate().addAll((Collection)newValue);
				return;
			case CodePackage.CT_FOR__EXPRESSION:
				setExpression((CtExpression)newValue);
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
			case CodePackage.CT_FOR__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_FOR__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_FOR__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_FOR__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_FOR__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_FOR__BODY:
				setBody((CtStatement)null);
				return;
			case CodePackage.CT_FOR__FOR_INIT:
				getForInit().clear();
				return;
			case CodePackage.CT_FOR__FOR_UPDATE:
				getForUpdate().clear();
				return;
			case CodePackage.CT_FOR__EXPRESSION:
				setExpression((CtExpression)null);
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
			case CodePackage.CT_FOR__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_FOR__POSITION:
				return position != null;
			case CodePackage.CT_FOR__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_FOR__PARENT:
				return parent != null;
			case CodePackage.CT_FOR__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_FOR__BODY:
				return body != null;
			case CodePackage.CT_FOR__FOR_INIT:
				return forInit != null && !forInit.isEmpty();
			case CodePackage.CT_FOR__FOR_UPDATE:
				return forUpdate != null && !forUpdate.isEmpty();
			case CodePackage.CT_FOR__EXPRESSION:
				return expression != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtForImpl