/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtLoopImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtLoop;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtLoopImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtLoopImpl extends CtStatementImpl implements CtLoop {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected CtStatement body = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtStatement getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = (CtStatement)eResolveProxy(oldBody);
			if (body != oldBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_LOOP__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtStatement basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CtStatement newBody) {
		CtStatement oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_LOOP__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_LOOP__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_LOOP__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_LOOP__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_LOOP__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_LOOP__LABEL:
				return getLabel();
			case CodePackage.CT_LOOP__BODY:
				if (resolve) return getBody();
				return basicGetBody();
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
			case CodePackage.CT_LOOP__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_LOOP__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_LOOP__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_LOOP__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_LOOP__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_LOOP__BODY:
				setBody((CtStatement)newValue);
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
			case CodePackage.CT_LOOP__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_LOOP__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_LOOP__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_LOOP__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_LOOP__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_LOOP__BODY:
				setBody((CtStatement)null);
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
			case CodePackage.CT_LOOP__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_LOOP__POSITION:
				return position != null;
			case CodePackage.CT_LOOP__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_LOOP__PARENT:
				return parent != null;
			case CodePackage.CT_LOOP__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_LOOP__BODY:
				return body != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtLoopImpl