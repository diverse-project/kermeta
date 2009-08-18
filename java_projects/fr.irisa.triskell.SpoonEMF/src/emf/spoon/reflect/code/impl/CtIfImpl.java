/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtIfImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtIf;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtIfImpl#getThenStatement <em>Then Statement</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtIfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtIfImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtIfImpl extends CtStatementImpl implements CtIf {
	/**
	 * The cached value of the '{@link #getThenStatement() <em>Then Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenStatement()
	 * @generated
	 * @ordered
	 */
	protected CtStatement thenStatement = null;

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
	 * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatement()
	 * @generated
	 * @ordered
	 */
	protected CtStatement elseStatement = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtIfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtStatement getThenStatement() {
		if (thenStatement != null && thenStatement.eIsProxy()) {
			InternalEObject oldThenStatement = (InternalEObject)thenStatement;
			thenStatement = (CtStatement)eResolveProxy(oldThenStatement);
			if (thenStatement != oldThenStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_IF__THEN_STATEMENT, oldThenStatement, thenStatement));
			}
		}
		return thenStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtStatement basicGetThenStatement() {
		return thenStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenStatement(CtStatement newThenStatement) {
		CtStatement oldThenStatement = thenStatement;
		thenStatement = newThenStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_IF__THEN_STATEMENT, oldThenStatement, thenStatement));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_IF__CONDITION, oldCondition, condition));
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
	public void setCondition(spoon.reflect.code.CtExpression newCondition) {
		CtExpression oldCondition = condition;
		condition = (CtExpression) newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_IF__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtStatement getElseStatement() {
		if (elseStatement != null && elseStatement.eIsProxy()) {
			InternalEObject oldElseStatement = (InternalEObject)elseStatement;
			elseStatement = (CtStatement)eResolveProxy(oldElseStatement);
			if (elseStatement != oldElseStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_IF__ELSE_STATEMENT, oldElseStatement, elseStatement));
			}
		}
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtStatement basicGetElseStatement() {
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseStatement(CtStatement newElseStatement) {
		CtStatement oldElseStatement = elseStatement;
		elseStatement = newElseStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_IF__ELSE_STATEMENT, oldElseStatement, elseStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_IF__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_IF__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_IF__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_IF__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_IF__LABEL:
				return getLabel();
			case CodePackage.CT_IF__THEN_STATEMENT:
				if (resolve) return getThenStatement();
				return basicGetThenStatement();
			case CodePackage.CT_IF__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case CodePackage.CT_IF__ELSE_STATEMENT:
				if (resolve) return getElseStatement();
				return basicGetElseStatement();
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
			case CodePackage.CT_IF__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_IF__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_IF__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_IF__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_IF__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_IF__THEN_STATEMENT:
				setThenStatement((CtStatement)newValue);
				return;
			case CodePackage.CT_IF__CONDITION:
				setCondition((spoon.reflect.code.CtExpression)newValue);
				return;
			case CodePackage.CT_IF__ELSE_STATEMENT:
				setElseStatement((CtStatement)newValue);
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
			case CodePackage.CT_IF__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_IF__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_IF__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_IF__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_IF__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_IF__THEN_STATEMENT:
				setThenStatement((CtStatement)null);
				return;
			case CodePackage.CT_IF__CONDITION:
				setCondition((spoon.reflect.code.CtExpression)null);
				return;
			case CodePackage.CT_IF__ELSE_STATEMENT:
				setElseStatement((CtStatement)null);
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
			case CodePackage.CT_IF__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_IF__POSITION:
				return position != null;
			case CodePackage.CT_IF__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_IF__PARENT:
				return parent != null;
			case CodePackage.CT_IF__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_IF__THEN_STATEMENT:
				return thenStatement != null;
			case CodePackage.CT_IF__CONDITION:
				return condition != null;
			case CodePackage.CT_IF__ELSE_STATEMENT:
				return elseStatement != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtIfImpl