/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTargetedExpressionImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtTargetedExpression;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Targeted Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtTargetedExpressionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtTargetedExpressionImpl extends CtExpressionImpl implements CtTargetedExpression {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CtExpression target = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtTargetedExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_TARGETED_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (CtExpression)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_TARGETED_EXPRESSION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(CtExpression newTarget) {
		CtExpression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_TARGETED_EXPRESSION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_TARGETED_EXPRESSION__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_TARGETED_EXPRESSION__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_TARGETED_EXPRESSION__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_TARGETED_EXPRESSION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_TARGETED_EXPRESSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_TARGETED_EXPRESSION__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_TARGETED_EXPRESSION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case CodePackage.CT_TARGETED_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__TARGET:
				setTarget((CtExpression)newValue);
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
			case CodePackage.CT_TARGETED_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_TARGETED_EXPRESSION__TARGET:
				setTarget((CtExpression)null);
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
			case CodePackage.CT_TARGETED_EXPRESSION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_TARGETED_EXPRESSION__POSITION:
				return position != null;
			case CodePackage.CT_TARGETED_EXPRESSION__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_TARGETED_EXPRESSION__PARENT:
				return parent != null;
			case CodePackage.CT_TARGETED_EXPRESSION__TYPE:
				return type != null;
			case CodePackage.CT_TARGETED_EXPRESSION__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_TARGETED_EXPRESSION__TARGET:
				return target != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtTargetedExpressionImpl