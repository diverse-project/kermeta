/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtBinaryOperatorImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spoon.reflect.code.BinaryOperatorKind;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtBinaryOperator;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtBinaryOperatorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtBinaryOperatorImpl#getRightHandOperand <em>Right Hand Operand</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtBinaryOperatorImpl#getLeftHandOperand <em>Left Hand Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtBinaryOperatorImpl extends CtExpressionImpl implements CtBinaryOperator {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperatorKind KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperatorKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRightHandOperand() <em>Right Hand Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHandOperand()
	 * @generated
	 * @ordered
	 */
	protected CtExpression rightHandOperand = null;

	/**
	 * The cached value of the '{@link #getLeftHandOperand() <em>Left Hand Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHandOperand()
	 * @generated
	 * @ordered
	 */
	protected CtExpression leftHandOperand = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtBinaryOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_BINARY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperatorKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(BinaryOperatorKind newKind) {
		BinaryOperatorKind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_BINARY_OPERATOR__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getRightHandOperand() {
		if (rightHandOperand != null && rightHandOperand.eIsProxy()) {
			InternalEObject oldRightHandOperand = (InternalEObject)rightHandOperand;
			rightHandOperand = (CtExpression)eResolveProxy(oldRightHandOperand);
			if (rightHandOperand != oldRightHandOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_BINARY_OPERATOR__RIGHT_HAND_OPERAND, oldRightHandOperand, rightHandOperand));
			}
		}
		return rightHandOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetRightHandOperand() {
		return rightHandOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHandOperand(CtExpression newRightHandOperand) {
		CtExpression oldRightHandOperand = rightHandOperand;
		rightHandOperand = newRightHandOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_BINARY_OPERATOR__RIGHT_HAND_OPERAND, oldRightHandOperand, rightHandOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getLeftHandOperand() {
		if (leftHandOperand != null && leftHandOperand.eIsProxy()) {
			InternalEObject oldLeftHandOperand = (InternalEObject)leftHandOperand;
			leftHandOperand = (CtExpression)eResolveProxy(oldLeftHandOperand);
			if (leftHandOperand != oldLeftHandOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_BINARY_OPERATOR__LEFT_HAND_OPERAND, oldLeftHandOperand, leftHandOperand));
			}
		}
		return leftHandOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetLeftHandOperand() {
		return leftHandOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHandOperand(CtExpression newLeftHandOperand) {
		CtExpression oldLeftHandOperand = leftHandOperand;
		leftHandOperand = newLeftHandOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_BINARY_OPERATOR__LEFT_HAND_OPERAND, oldLeftHandOperand, leftHandOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_BINARY_OPERATOR__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_BINARY_OPERATOR__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_BINARY_OPERATOR__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_BINARY_OPERATOR__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_BINARY_OPERATOR__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_BINARY_OPERATOR__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_BINARY_OPERATOR__KIND:
				return getKind();
			case CodePackage.CT_BINARY_OPERATOR__RIGHT_HAND_OPERAND:
				if (resolve) return getRightHandOperand();
				return basicGetRightHandOperand();
			case CodePackage.CT_BINARY_OPERATOR__LEFT_HAND_OPERAND:
				if (resolve) return getLeftHandOperand();
				return basicGetLeftHandOperand();
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
			case CodePackage.CT_BINARY_OPERATOR__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_BINARY_OPERATOR__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_BINARY_OPERATOR__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_BINARY_OPERATOR__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_BINARY_OPERATOR__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_BINARY_OPERATOR__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_BINARY_OPERATOR__KIND:
				setKind((BinaryOperatorKind)newValue);
				return;
			case CodePackage.CT_BINARY_OPERATOR__RIGHT_HAND_OPERAND:
				setRightHandOperand((CtExpression)newValue);
				return;
			case CodePackage.CT_BINARY_OPERATOR__LEFT_HAND_OPERAND:
				setLeftHandOperand((CtExpression)newValue);
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
			case CodePackage.CT_BINARY_OPERATOR__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_BINARY_OPERATOR__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_BINARY_OPERATOR__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_BINARY_OPERATOR__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_BINARY_OPERATOR__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_BINARY_OPERATOR__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_BINARY_OPERATOR__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CodePackage.CT_BINARY_OPERATOR__RIGHT_HAND_OPERAND:
				setRightHandOperand((CtExpression)null);
				return;
			case CodePackage.CT_BINARY_OPERATOR__LEFT_HAND_OPERAND:
				setLeftHandOperand((CtExpression)null);
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
			case CodePackage.CT_BINARY_OPERATOR__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_BINARY_OPERATOR__POSITION:
				return position != null;
			case CodePackage.CT_BINARY_OPERATOR__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_BINARY_OPERATOR__PARENT:
				return parent != null;
			case CodePackage.CT_BINARY_OPERATOR__TYPE:
				return type != null;
			case CodePackage.CT_BINARY_OPERATOR__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_BINARY_OPERATOR__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case CodePackage.CT_BINARY_OPERATOR__RIGHT_HAND_OPERAND:
				return rightHandOperand != null;
			case CodePackage.CT_BINARY_OPERATOR__LEFT_HAND_OPERAND:
				return leftHandOperand != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //CtBinaryOperatorImpl