/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtLiteralImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtLiteral;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtLiteralImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtLiteralImpl extends CtExpressionImpl implements CtLiteral {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_LITERAL__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_LITERAL__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_LITERAL__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_LITERAL__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_LITERAL__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_LITERAL__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_LITERAL__VALUE:
				return getValue();
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
			case CodePackage.CT_LITERAL__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_LITERAL__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_LITERAL__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_LITERAL__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_LITERAL__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_LITERAL__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_LITERAL__VALUE:
				setValue((Object)newValue);
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
			case CodePackage.CT_LITERAL__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_LITERAL__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_LITERAL__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_LITERAL__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_LITERAL__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_LITERAL__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_LITERAL__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case CodePackage.CT_LITERAL__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_LITERAL__POSITION:
				return position != null;
			case CodePackage.CT_LITERAL__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_LITERAL__PARENT:
				return parent != null;
			case CodePackage.CT_LITERAL__TYPE:
				return type != null;
			case CodePackage.CT_LITERAL__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_LITERAL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (Value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //CtLiteralImpl