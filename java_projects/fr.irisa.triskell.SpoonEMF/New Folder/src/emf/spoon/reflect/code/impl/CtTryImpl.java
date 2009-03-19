/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTryImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtBlock;
import emf.spoon.reflect.code.CtCatch;
import emf.spoon.reflect.code.CtTry;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Try</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtTryImpl#getFinalizer <em>Finalizer</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtTryImpl#getBody <em>Body</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtTryImpl#getCatchers <em>Catchers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtTryImpl extends CtStatementImpl implements CtTry {
	/**
	 * The cached value of the '{@link #getFinalizer() <em>Finalizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalizer()
	 * @generated
	 * @ordered
	 */
	protected CtBlock finalizer = null;

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
	 * The cached value of the '{@link #getCatchers() <em>Catchers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchers()
	 * @generated
	 * @ordered
	 */
	protected EList catchers = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtTryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_TRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBlock getFinalizer() {
		if (finalizer != null && finalizer.eIsProxy()) {
			InternalEObject oldFinalizer = (InternalEObject)finalizer;
			finalizer = (CtBlock)eResolveProxy(oldFinalizer);
			if (finalizer != oldFinalizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_TRY__FINALIZER, oldFinalizer, finalizer));
			}
		}
		return finalizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBlock basicGetFinalizer() {
		return finalizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalizer(CtBlock newFinalizer) {
		CtBlock oldFinalizer = finalizer;
		finalizer = newFinalizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_TRY__FINALIZER, oldFinalizer, finalizer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_TRY__BODY, oldBody, body));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_TRY__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getCatchers() {
		if (catchers == null) {
			catchers = new EObjectResolvingEList(CtCatch.class, this, CodePackage.CT_TRY__CATCHERS);
		}
		return catchers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_TRY__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_TRY__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_TRY__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_TRY__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_TRY__LABEL:
				return getLabel();
			case CodePackage.CT_TRY__FINALIZER:
				if (resolve) return getFinalizer();
				return basicGetFinalizer();
			case CodePackage.CT_TRY__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case CodePackage.CT_TRY__CATCHERS:
				return getCatchers();
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
			case CodePackage.CT_TRY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_TRY__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_TRY__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_TRY__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_TRY__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_TRY__FINALIZER:
				setFinalizer((CtBlock)newValue);
				return;
			case CodePackage.CT_TRY__BODY:
				setBody((CtBlock)newValue);
				return;
			case CodePackage.CT_TRY__CATCHERS:
				getCatchers().clear();
				getCatchers().addAll((Collection)newValue);
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
			case CodePackage.CT_TRY__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_TRY__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_TRY__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_TRY__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_TRY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_TRY__FINALIZER:
				setFinalizer((CtBlock)null);
				return;
			case CodePackage.CT_TRY__BODY:
				setBody((CtBlock)null);
				return;
			case CodePackage.CT_TRY__CATCHERS:
				getCatchers().clear();
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
			case CodePackage.CT_TRY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_TRY__POSITION:
				return position != null;
			case CodePackage.CT_TRY__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_TRY__PARENT:
				return parent != null;
			case CodePackage.CT_TRY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_TRY__FINALIZER:
				return finalizer != null;
			case CodePackage.CT_TRY__BODY:
				return body != null;
			case CodePackage.CT_TRY__CATCHERS:
				return catchers != null && !catchers.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CtTryImpl