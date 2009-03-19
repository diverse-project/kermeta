/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtArrayAccessImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtArrayAccess;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Array Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtArrayAccessImpl#getIndexExpression <em>Index Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtArrayAccessImpl extends CtTargetedExpressionImpl implements CtArrayAccess {
	/**
	 * The cached value of the '{@link #getIndexExpression() <em>Index Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression indexExpression = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtArrayAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_ARRAY_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getIndexExpression() {
		if (indexExpression != null && indexExpression.eIsProxy()) {
			InternalEObject oldIndexExpression = (InternalEObject)indexExpression;
			indexExpression = (CtExpression)eResolveProxy(oldIndexExpression);
			if (indexExpression != oldIndexExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_ARRAY_ACCESS__INDEX_EXPRESSION, oldIndexExpression, indexExpression));
			}
		}
		return indexExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetIndexExpression() {
		return indexExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexExpression(CtExpression newIndexExpression) {
		CtExpression oldIndexExpression = indexExpression;
		indexExpression = newIndexExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_ARRAY_ACCESS__INDEX_EXPRESSION, oldIndexExpression, indexExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_ARRAY_ACCESS__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_ARRAY_ACCESS__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_ARRAY_ACCESS__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_ARRAY_ACCESS__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_ARRAY_ACCESS__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_ARRAY_ACCESS__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_ARRAY_ACCESS__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case CodePackage.CT_ARRAY_ACCESS__INDEX_EXPRESSION:
				if (resolve) return getIndexExpression();
				return basicGetIndexExpression();
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
			case CodePackage.CT_ARRAY_ACCESS__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_ARRAY_ACCESS__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_ARRAY_ACCESS__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_ARRAY_ACCESS__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_ARRAY_ACCESS__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_ARRAY_ACCESS__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_ARRAY_ACCESS__TARGET:
				setTarget((CtExpression)newValue);
				return;
			case CodePackage.CT_ARRAY_ACCESS__INDEX_EXPRESSION:
				setIndexExpression((CtExpression)newValue);
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
			case CodePackage.CT_ARRAY_ACCESS__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_ARRAY_ACCESS__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_ARRAY_ACCESS__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_ARRAY_ACCESS__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_ARRAY_ACCESS__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_ARRAY_ACCESS__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_ARRAY_ACCESS__TARGET:
				setTarget((CtExpression)null);
				return;
			case CodePackage.CT_ARRAY_ACCESS__INDEX_EXPRESSION:
				setIndexExpression((CtExpression)null);
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
			case CodePackage.CT_ARRAY_ACCESS__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_ARRAY_ACCESS__POSITION:
				return position != null;
			case CodePackage.CT_ARRAY_ACCESS__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_ARRAY_ACCESS__PARENT:
				return parent != null;
			case CodePackage.CT_ARRAY_ACCESS__TYPE:
				return type != null;
			case CodePackage.CT_ARRAY_ACCESS__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_ARRAY_ACCESS__TARGET:
				return target != null;
			case CodePackage.CT_ARRAY_ACCESS__INDEX_EXPRESSION:
				return indexExpression != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtArrayAccessImpl