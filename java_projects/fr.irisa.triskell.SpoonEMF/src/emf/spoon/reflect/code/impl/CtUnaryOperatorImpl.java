/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtUnaryOperatorImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spoon.reflect.code.CtStatement;
import spoon.reflect.code.UnaryOperatorKind;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtUnaryOperator;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtUnaryOperatorImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtUnaryOperatorImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtUnaryOperatorImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtUnaryOperatorImpl extends CtExpressionImpl implements CtUnaryOperator {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected CtExpression operand = null;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final UnaryOperatorKind KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected UnaryOperatorKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtUnaryOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_UNARY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_UNARY_OPERATOR__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getOperand() {
		if (operand != null && operand.eIsProxy()) {
			InternalEObject oldOperand = (InternalEObject)operand;
			operand = (CtExpression)eResolveProxy(oldOperand);
			if (operand != oldOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_UNARY_OPERATOR__OPERAND, oldOperand, operand));
			}
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(CtExpression newOperand) {
		CtExpression oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_UNARY_OPERATOR__OPERAND, oldOperand, operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperatorKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(UnaryOperatorKind newKind) {
		UnaryOperatorKind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_UNARY_OPERATOR__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_UNARY_OPERATOR__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_UNARY_OPERATOR__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_UNARY_OPERATOR__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_UNARY_OPERATOR__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_UNARY_OPERATOR__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_UNARY_OPERATOR__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_UNARY_OPERATOR__LABEL:
				return getLabel();
			case CodePackage.CT_UNARY_OPERATOR__OPERAND:
				if (resolve) return getOperand();
				return basicGetOperand();
			case CodePackage.CT_UNARY_OPERATOR__KIND:
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
			case CodePackage.CT_UNARY_OPERATOR__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_UNARY_OPERATOR__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_UNARY_OPERATOR__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_UNARY_OPERATOR__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_UNARY_OPERATOR__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_UNARY_OPERATOR__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_UNARY_OPERATOR__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_UNARY_OPERATOR__OPERAND:
				setOperand((CtExpression)newValue);
				return;
			case CodePackage.CT_UNARY_OPERATOR__KIND:
				setKind((UnaryOperatorKind)newValue);
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
			case CodePackage.CT_UNARY_OPERATOR__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_UNARY_OPERATOR__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_UNARY_OPERATOR__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_UNARY_OPERATOR__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_UNARY_OPERATOR__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_UNARY_OPERATOR__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_UNARY_OPERATOR__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_UNARY_OPERATOR__OPERAND:
				setOperand((CtExpression)null);
				return;
			case CodePackage.CT_UNARY_OPERATOR__KIND:
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
			case CodePackage.CT_UNARY_OPERATOR__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_UNARY_OPERATOR__POSITION:
				return position != null;
			case CodePackage.CT_UNARY_OPERATOR__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_UNARY_OPERATOR__PARENT:
				return parent != null;
			case CodePackage.CT_UNARY_OPERATOR__TYPE:
				return type != null;
			case CodePackage.CT_UNARY_OPERATOR__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_UNARY_OPERATOR__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_UNARY_OPERATOR__OPERAND:
				return operand != null;
			case CodePackage.CT_UNARY_OPERATOR__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CtStatement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtStatement.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_UNARY_OPERATOR__LABEL: return CodePackage.CT_STATEMENT__LABEL;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtUnaryOperator.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == CtStatement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtStatement.class) {
			switch (baseFeatureID) {
				case CodePackage.CT_STATEMENT__LABEL: return CodePackage.CT_UNARY_OPERATOR__LABEL;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtUnaryOperator.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Label: ");
		result.append(label);
		result.append(", Kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //CtUnaryOperatorImpl