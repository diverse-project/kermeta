/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtDoImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtDo;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Do</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtDoImpl#getLoopingExpression <em>Looping Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtDoImpl extends CtLoopImpl implements CtDo {
	/**
	 * The cached value of the '{@link #getLoopingExpression() <em>Looping Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopingExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression loopingExpression = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtDoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_DO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getLoopingExpression() {
		if (loopingExpression != null && loopingExpression.eIsProxy()) {
			InternalEObject oldLoopingExpression = (InternalEObject)loopingExpression;
			loopingExpression = (CtExpression)eResolveProxy(oldLoopingExpression);
			if (loopingExpression != oldLoopingExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_DO__LOOPING_EXPRESSION, oldLoopingExpression, loopingExpression));
			}
		}
		return loopingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetLoopingExpression() {
		return loopingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopingExpression(CtExpression newLoopingExpression) {
		CtExpression oldLoopingExpression = loopingExpression;
		loopingExpression = newLoopingExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_DO__LOOPING_EXPRESSION, oldLoopingExpression, loopingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_DO__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_DO__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_DO__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_DO__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_DO__LABEL:
				return getLabel();
			case CodePackage.CT_DO__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case CodePackage.CT_DO__LOOPING_EXPRESSION:
				if (resolve) return getLoopingExpression();
				return basicGetLoopingExpression();
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
			case CodePackage.CT_DO__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_DO__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_DO__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_DO__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_DO__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_DO__BODY:
				setBody((CtStatement)newValue);
				return;
			case CodePackage.CT_DO__LOOPING_EXPRESSION:
				setLoopingExpression((CtExpression)newValue);
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
			case CodePackage.CT_DO__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_DO__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_DO__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_DO__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_DO__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_DO__BODY:
				setBody((CtStatement)null);
				return;
			case CodePackage.CT_DO__LOOPING_EXPRESSION:
				setLoopingExpression((CtExpression)null);
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
			case CodePackage.CT_DO__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_DO__POSITION:
				return position != null;
			case CodePackage.CT_DO__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_DO__PARENT:
				return parent != null;
			case CodePackage.CT_DO__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_DO__BODY:
				return body != null;
			case CodePackage.CT_DO__LOOPING_EXPRESSION:
				return loopingExpression != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtDoImpl