/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtThrowImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtThrow;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Throw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtThrowImpl#getThrownExpression <em>Thrown Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtThrowImpl extends CtCFlowBreakImpl implements CtThrow {
	/**
	 * The cached value of the '{@link #getThrownExpression() <em>Thrown Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression thrownExpression = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtThrowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_THROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getThrownExpression() {
		if (thrownExpression != null && thrownExpression.eIsProxy()) {
			InternalEObject oldThrownExpression = (InternalEObject)thrownExpression;
			thrownExpression = (CtExpression)eResolveProxy(oldThrownExpression);
			if (thrownExpression != oldThrownExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_THROW__THROWN_EXPRESSION, oldThrownExpression, thrownExpression));
			}
		}
		return thrownExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetThrownExpression() {
		return thrownExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrownExpression(spoon.reflect.code.CtExpression<? extends Throwable>  newThrownExpression) {
		CtExpression oldThrownExpression = thrownExpression;
		thrownExpression = (CtExpression) newThrownExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_THROW__THROWN_EXPRESSION, oldThrownExpression, thrownExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_THROW__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_THROW__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_THROW__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_THROW__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_THROW__LABEL:
				return getLabel();
			case CodePackage.CT_THROW__THROWN_EXPRESSION:
				if (resolve) return getThrownExpression();
				return basicGetThrownExpression();
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
			case CodePackage.CT_THROW__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_THROW__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_THROW__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_THROW__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_THROW__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_THROW__THROWN_EXPRESSION:
				setThrownExpression((spoon.reflect.code.CtExpression)newValue);
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
			case CodePackage.CT_THROW__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_THROW__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_THROW__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_THROW__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_THROW__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_THROW__THROWN_EXPRESSION:
				setThrownExpression((spoon.reflect.code.CtExpression)null);
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
			case CodePackage.CT_THROW__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_THROW__POSITION:
				return position != null;
			case CodePackage.CT_THROW__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_THROW__PARENT:
				return parent != null;
			case CodePackage.CT_THROW__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_THROW__THROWN_EXPRESSION:
				return thrownExpression != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtThrowImpl