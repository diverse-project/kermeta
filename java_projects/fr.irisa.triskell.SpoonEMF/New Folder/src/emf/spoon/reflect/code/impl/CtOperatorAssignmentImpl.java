/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtOperatorAssignmentImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spoon.reflect.code.BinaryOperatorKind;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtOperatorAssignment;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Operator Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtOperatorAssignmentImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtOperatorAssignmentImpl extends CtAssignmentImpl implements CtOperatorAssignment {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtOperatorAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_OPERATOR_ASSIGNMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_OPERATOR_ASSIGNMENT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__LABEL:
				return getLabel();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ASSIGNMENT:
				if (resolve) return getAssignment();
				return basicGetAssignment();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ASSIGNED:
				if (resolve) return getAssigned();
				return basicGetAssigned();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__KIND:
				return getKind();
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
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ASSIGNMENT:
				setAssignment((CtExpression)newValue);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ASSIGNED:
				setAssigned((CtExpression)newValue);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__KIND:
				setKind((BinaryOperatorKind)newValue);
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
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ASSIGNMENT:
				setAssignment((CtExpression)null);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ASSIGNED:
				setAssigned((CtExpression)null);
				return;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__KIND:
				setKind(KIND_EDEFAULT);
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
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__POSITION:
				return position != null;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_OPERATOR_ASSIGNMENT__PARENT:
				return parent != null;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__TYPE:
				return type != null;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_OPERATOR_ASSIGNMENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ASSIGNMENT:
				return assignment != null;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__ASSIGNED:
				return assigned != null;
			case CodePackage.CT_OPERATOR_ASSIGNMENT__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
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

} //CtOperatorAssignmentImpl