/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtNewArrayImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtNewArray;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct New Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtNewArrayImpl#getDimensionExpressions <em>Dimension Expressions</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtNewArrayImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtNewArrayImpl extends CtExpressionImpl implements CtNewArray {
	/**
	 * The cached value of the '{@link #getDimensionExpressions() <em>Dimension Expressions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList dimensionExpressions = null;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList elements = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtNewArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_NEW_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getDimensionExpressions() {
		if (dimensionExpressions == null) {
			dimensionExpressions = new EObjectResolvingEList(CtExpression.class, this, CodePackage.CT_NEW_ARRAY__DIMENSION_EXPRESSIONS);
		}
		return dimensionExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList(CtExpression.class, this, CodePackage.CT_NEW_ARRAY__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_NEW_ARRAY__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_NEW_ARRAY__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_NEW_ARRAY__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_NEW_ARRAY__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_NEW_ARRAY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_NEW_ARRAY__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_NEW_ARRAY__DIMENSION_EXPRESSIONS:
				return getDimensionExpressions();
			case CodePackage.CT_NEW_ARRAY__ELEMENTS:
				return getElements();
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
			case CodePackage.CT_NEW_ARRAY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_NEW_ARRAY__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_NEW_ARRAY__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_NEW_ARRAY__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_NEW_ARRAY__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_NEW_ARRAY__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_NEW_ARRAY__DIMENSION_EXPRESSIONS:
				getDimensionExpressions().clear();
				getDimensionExpressions().addAll((Collection)newValue);
				return;
			case CodePackage.CT_NEW_ARRAY__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection)newValue);
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
			case CodePackage.CT_NEW_ARRAY__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_NEW_ARRAY__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_NEW_ARRAY__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_NEW_ARRAY__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_NEW_ARRAY__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_NEW_ARRAY__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_NEW_ARRAY__DIMENSION_EXPRESSIONS:
				getDimensionExpressions().clear();
				return;
			case CodePackage.CT_NEW_ARRAY__ELEMENTS:
				getElements().clear();
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
			case CodePackage.CT_NEW_ARRAY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_NEW_ARRAY__POSITION:
				return position != null;
			case CodePackage.CT_NEW_ARRAY__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_NEW_ARRAY__PARENT:
				return parent != null;
			case CodePackage.CT_NEW_ARRAY__TYPE:
				return type != null;
			case CodePackage.CT_NEW_ARRAY__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_NEW_ARRAY__DIMENSION_EXPRESSIONS:
				return dimensionExpressions != null && !dimensionExpressions.isEmpty();
			case CodePackage.CT_NEW_ARRAY__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CtNewArrayImpl