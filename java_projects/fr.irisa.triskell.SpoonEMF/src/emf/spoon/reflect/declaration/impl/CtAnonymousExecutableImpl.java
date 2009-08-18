/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAnonymousExecutableImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.ModifierKind;
import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.code.CtBlock;
import emf.spoon.reflect.declaration.CtAnonymousExecutable;
import emf.spoon.reflect.declaration.CtClass;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Anonymous Executable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnonymousExecutableImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnonymousExecutableImpl#getBody <em>Body</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnonymousExecutableImpl#getOwnerClass <em>Owner Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtAnonymousExecutableImpl extends CtElementImpl implements CtAnonymousExecutable {
	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList modifiers = null;

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
	 * The cached value of the '{@link #getOwnerClass() <em>Owner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerClass()
	 * @generated
	 * @ordered
	 */
	protected CtClass ownerClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtAnonymousExecutableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_ANONYMOUS_EXECUTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeUniqueEList(ModifierKind.class, this, DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__MODIFIERS);
		}
		return new EmfSet(modifiers);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__BODY, oldBody, body));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtClass getOwnerClass() {
		if (ownerClass != null && ownerClass.eIsProxy()) {
			InternalEObject oldOwnerClass = (InternalEObject)ownerClass;
			ownerClass = (CtClass)eResolveProxy(oldOwnerClass);
			if (ownerClass != oldOwnerClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__OWNER_CLASS, oldOwnerClass, ownerClass));
			}
		}
		return ownerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtClass basicGetOwnerClass() {
		return ownerClass;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(CtClass newOwnerClass, NotificationChain msgs) {
		CtClass oldOwnerClass = ownerClass;
		ownerClass = newOwnerClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__OWNER_CLASS, oldOwnerClass, newOwnerClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__OWNER_CLASS:
				if (ownerClass != null)
					msgs = ((InternalEObject)ownerClass).eInverseRemove(this, DeclarationPackage.CT_CLASS__ANONYMOUS_EXECUTABLES, CtClass.class, msgs);
				return basicSetOwnerClass((CtClass)otherEnd, msgs);
		}
		//return eDynamicInverseAdd(otherEnd, featureID, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__OWNER_CLASS:
				return basicSetOwnerClass(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__MODIFIERS:
				return getModifiers();
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__OWNER_CLASS:
				if (resolve) return getOwnerClass();
				return basicGetOwnerClass();
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
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__BODY:
				setBody((spoon.reflect.code.CtBlock)newValue);
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
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__MODIFIERS:
				getModifiers().clear();
				return;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__BODY:
				setBody((spoon.reflect.code.CtBlock)null);
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
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__POSITION:
				return position != null;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__PARENT:
				return parent != null;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__BODY:
				return body != null;
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__OWNER_CLASS:
				return ownerClass != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CtModifiable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtModifiable.class) {
			switch (derivedFeatureID) {
				case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__MODIFIERS: return DeclarationPackage.CT_MODIFIABLE__MODIFIERS;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtAnonymousExecutable.class) {
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
		if (baseClass == CtModifiable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtModifiable.class) {
			switch (baseFeatureID) {
				case DeclarationPackage.CT_MODIFIABLE__MODIFIERS: return DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__MODIFIERS;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtAnonymousExecutable.class) {
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
		result.append(" (Modifiers: ");
		result.append(modifiers);
		result.append(')');
		return result.toString();
	}


} //CtAnonymousExecutableImpl