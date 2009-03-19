/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtReturnImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtReturn;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtReturnImpl#getReturnedExpression <em>Returned Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtReturnImpl extends CtCFlowBreakImpl implements CtReturn {
	/**
	 * The cached value of the '{@link #getReturnedExpression() <em>Returned Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnedExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression returnedExpression = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_RETURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getReturnedExpression() {
		if (returnedExpression != null && returnedExpression.eIsProxy()) {
			InternalEObject oldReturnedExpression = (InternalEObject)returnedExpression;
			returnedExpression = (CtExpression)eResolveProxy(oldReturnedExpression);
			if (returnedExpression != oldReturnedExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_RETURN__RETURNED_EXPRESSION, oldReturnedExpression, returnedExpression));
			}
		}
		return returnedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetReturnedExpression() {
		return returnedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnedExpression(CtExpression newReturnedExpression) {
		CtExpression oldReturnedExpression = returnedExpression;
		returnedExpression = newReturnedExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_RETURN__RETURNED_EXPRESSION, oldReturnedExpression, returnedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_RETURN__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_RETURN__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_RETURN__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_RETURN__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_RETURN__LABEL:
				return getLabel();
			case CodePackage.CT_RETURN__RETURNED_EXPRESSION:
				if (resolve) return getReturnedExpression();
				return basicGetReturnedExpression();
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
			case CodePackage.CT_RETURN__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_RETURN__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_RETURN__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_RETURN__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_RETURN__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_RETURN__RETURNED_EXPRESSION:
				setReturnedExpression((CtExpression)newValue);
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
			case CodePackage.CT_RETURN__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_RETURN__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_RETURN__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_RETURN__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_RETURN__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_RETURN__RETURNED_EXPRESSION:
				setReturnedExpression((CtExpression)null);
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
			case CodePackage.CT_RETURN__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_RETURN__POSITION:
				return position != null;
			case CodePackage.CT_RETURN__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_RETURN__PARENT:
				return parent != null;
			case CodePackage.CT_RETURN__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_RETURN__RETURNED_EXPRESSION:
				return returnedExpression != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtReturnImpl