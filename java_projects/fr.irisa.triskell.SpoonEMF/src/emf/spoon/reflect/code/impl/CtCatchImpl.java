/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtCatchImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtBlock;
import emf.spoon.reflect.code.CtCatch;
import emf.spoon.reflect.code.CtLocalVariable;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Catch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtCatchImpl#getBody <em>Body</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtCatchImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtCatchImpl extends CtCodeElementImpl implements CtCatch {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected CtBlock body = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected CtLocalVariable parameter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtCatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_CATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBlock getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = (CtBlock)eResolveProxy(oldBody);
			if (body != oldBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_CATCH__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBlock basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CtBlock newBody) {
		CtBlock oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_CATCH__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtLocalVariable getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (CtLocalVariable)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_CATCH__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtLocalVariable basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(CtLocalVariable newParameter) {
		CtLocalVariable oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_CATCH__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_CATCH__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_CATCH__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_CATCH__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_CATCH__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_CATCH__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case CodePackage.CT_CATCH__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case CodePackage.CT_CATCH__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_CATCH__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_CATCH__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_CATCH__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_CATCH__BODY:
				setBody((CtBlock)newValue);
				return;
			case CodePackage.CT_CATCH__PARAMETER:
				setParameter((CtLocalVariable)newValue);
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
			case CodePackage.CT_CATCH__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_CATCH__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_CATCH__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_CATCH__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_CATCH__BODY:
				setBody((CtBlock)null);
				return;
			case CodePackage.CT_CATCH__PARAMETER:
				setParameter((CtLocalVariable)null);
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
			case CodePackage.CT_CATCH__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_CATCH__POSITION:
				return position != null;
			case CodePackage.CT_CATCH__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_CATCH__PARENT:
				return parent != null;
			case CodePackage.CT_CATCH__BODY:
				return body != null;
			case CodePackage.CT_CATCH__PARAMETER:
				return parameter != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtCatchImpl