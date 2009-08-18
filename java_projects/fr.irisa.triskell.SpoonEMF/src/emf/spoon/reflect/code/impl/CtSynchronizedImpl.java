/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtSynchronizedImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtBlock;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtSynchronized;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Synchronized</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtSynchronizedImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtSynchronizedImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtSynchronizedImpl extends CtStatementImpl implements CtSynchronized {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected CtBlock block = null;

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
	protected CtSynchronizedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_SYNCHRONIZED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBlock getBlock() {
		if (block != null && block.eIsProxy()) {
			InternalEObject oldBlock = (InternalEObject)block;
			block = (CtBlock)eResolveProxy(oldBlock);
			if (block != oldBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_SYNCHRONIZED__BLOCK, oldBlock, block));
			}
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBlock basicGetBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(CtBlock newBlock) {
		CtBlock oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_SYNCHRONIZED__BLOCK, oldBlock, block));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_SYNCHRONIZED__EXPRESSION, oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_SYNCHRONIZED__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_SYNCHRONIZED__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_SYNCHRONIZED__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_SYNCHRONIZED__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_SYNCHRONIZED__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_SYNCHRONIZED__LABEL:
				return getLabel();
			case CodePackage.CT_SYNCHRONIZED__BLOCK:
				if (resolve) return getBlock();
				return basicGetBlock();
			case CodePackage.CT_SYNCHRONIZED__EXPRESSION:
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
			case CodePackage.CT_SYNCHRONIZED__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_SYNCHRONIZED__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_SYNCHRONIZED__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_SYNCHRONIZED__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_SYNCHRONIZED__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_SYNCHRONIZED__BLOCK:
				setBlock((spoon.reflect.code.CtBlock)newValue);
				return;
			case CodePackage.CT_SYNCHRONIZED__EXPRESSION:
				setExpression((spoon.reflect.code.CtExpression)newValue);
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
			case CodePackage.CT_SYNCHRONIZED__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_SYNCHRONIZED__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_SYNCHRONIZED__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_SYNCHRONIZED__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_SYNCHRONIZED__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_SYNCHRONIZED__BLOCK:
				setBlock((spoon.reflect.code.CtBlock)null);
				return;
			case CodePackage.CT_SYNCHRONIZED__EXPRESSION:
				setExpression((spoon.reflect.code.CtExpression)null);
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
			case CodePackage.CT_SYNCHRONIZED__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_SYNCHRONIZED__POSITION:
				return position != null;
			case CodePackage.CT_SYNCHRONIZED__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_SYNCHRONIZED__PARENT:
				return parent != null;
			case CodePackage.CT_SYNCHRONIZED__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_SYNCHRONIZED__BLOCK:
				return block != null;
			case CodePackage.CT_SYNCHRONIZED__EXPRESSION:
				return expression != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtSynchronizedImpl