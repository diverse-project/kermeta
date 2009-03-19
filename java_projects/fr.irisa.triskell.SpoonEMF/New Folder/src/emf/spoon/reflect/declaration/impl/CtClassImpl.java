/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtClassImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.declaration.CtAnonymousExecutable;
import emf.spoon.reflect.declaration.CtClass;
import emf.spoon.reflect.declaration.CtConstructor;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtClassImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtClassImpl#getAnonymousExecutables <em>Anonymous Executables</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtClassImpl#getConstructors <em>Constructors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtClassImpl extends CtTypeImpl implements CtClass {
	/**
	 * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclass()
	 * @generated
	 * @ordered
	 */
	protected CtTypeReference superclass = null;

	/**
	 * The cached value of the '{@link #getAnonymousExecutables() <em>Anonymous Executables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousExecutables()
	 * @generated
	 * @ordered
	 */
	protected EList anonymousExecutables = null;

	/**
	 * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructors()
	 * @generated
	 * @ordered
	 */
	protected EList constructors = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference getSuperclass() {
		if (superclass != null && superclass.eIsProxy()) {
			InternalEObject oldSuperclass = (InternalEObject)superclass;
			superclass = (CtTypeReference)eResolveProxy(oldSuperclass);
			if (superclass != oldSuperclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_CLASS__SUPERCLASS, oldSuperclass, superclass));
			}
		}
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference basicGetSuperclass() {
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperclass(CtTypeReference newSuperclass) {
		CtTypeReference oldSuperclass = superclass;
		superclass = newSuperclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_CLASS__SUPERCLASS, oldSuperclass, superclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getAnonymousExecutables() {
		if (anonymousExecutables == null) {
			anonymousExecutables = new EObjectWithInverseResolvingEList(CtAnonymousExecutable.class, this, DeclarationPackage.CT_CLASS__ANONYMOUS_EXECUTABLES, DeclarationPackage.CT_ANONYMOUS_EXECUTABLE__OWNER_CLASS);
		}
		return anonymousExecutables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getConstructors() {
		if (constructors == null) {
			constructors = new EObjectResolvingEList(CtConstructor.class, this, DeclarationPackage.CT_CLASS__CONSTRUCTORS);
		}
		return new EmfSet(constructors);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.CT_CLASS__ANONYMOUS_EXECUTABLES:
				return ((InternalEList)getAnonymousExecutables()).basicAdd(otherEnd, msgs);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.CT_CLASS__ANONYMOUS_EXECUTABLES:
				return ((InternalEList)getAnonymousExecutables()).basicRemove(otherEnd, msgs);
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
			case DeclarationPackage.CT_CLASS__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_CLASS__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_CLASS__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_CLASS__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_CLASS__FORMAL_TYPE_PARAMETERS:
				return getFormalTypeParameters();
			case DeclarationPackage.CT_CLASS__MODIFIERS:
				return getModifiers();
			case DeclarationPackage.CT_CLASS__SIMPLE_NAME:
				return getSimpleName();
			case DeclarationPackage.CT_CLASS__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case DeclarationPackage.CT_CLASS__INNERTTYPE_SEPARATOR:
				return getINNERTTYPE_SEPARATOR();
			case DeclarationPackage.CT_CLASS__FIELDS:
				return getFields();
			case DeclarationPackage.CT_CLASS__NESTED_TYPES:
				return getNestedTypes();
			case DeclarationPackage.CT_CLASS__ACTUAL_CLASS:
				return getActualClass();
			case DeclarationPackage.CT_CLASS__DECLARING_TYPE:
				if (resolve) return getDeclaringType();
				return basicGetDeclaringType();
			case DeclarationPackage.CT_CLASS__ALL_FIELDS:
				return getAllFields();
			case DeclarationPackage.CT_CLASS__TOP_LEVEL:
				return getTopLevel();
			case DeclarationPackage.CT_CLASS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case DeclarationPackage.CT_CLASS__QUALIFIED_NAME:
				return getQualifiedName();
			case DeclarationPackage.CT_CLASS__METHODS:
				return getMethods();
			case DeclarationPackage.CT_CLASS__SUPERINTERFACES:
				return getSuperinterfaces();
			case DeclarationPackage.CT_CLASS__ALL_METHODS:
				return getAllMethods();
			case DeclarationPackage.CT_CLASS__SUPERCLASS:
				if (resolve) return getSuperclass();
				return basicGetSuperclass();
			case DeclarationPackage.CT_CLASS__ANONYMOUS_EXECUTABLES:
				return getAnonymousExecutables();
			case DeclarationPackage.CT_CLASS__CONSTRUCTORS:
				return getConstructors();
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
			case DeclarationPackage.CT_CLASS__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_CLASS__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_CLASS__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_CLASS__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_CLASS__FORMAL_TYPE_PARAMETERS:
				getFormalTypeParameters().clear();
				getFormalTypeParameters().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_CLASS__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_CLASS__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case DeclarationPackage.CT_CLASS__INNERTTYPE_SEPARATOR:
				setINNERTTYPE_SEPARATOR((String)newValue);
				return;
			case DeclarationPackage.CT_CLASS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_CLASS__NESTED_TYPES:
				getNestedTypes().clear();
				getNestedTypes().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_CLASS__SUPERCLASS:
				setSuperclass((CtTypeReference)newValue);
				return;
			case DeclarationPackage.CT_CLASS__ANONYMOUS_EXECUTABLES:
				getAnonymousExecutables().clear();
				getAnonymousExecutables().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_CLASS__CONSTRUCTORS:
				getConstructors().clear();
				getConstructors().addAll((Collection)newValue);
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
			case DeclarationPackage.CT_CLASS__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_CLASS__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_CLASS__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_CLASS__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_CLASS__FORMAL_TYPE_PARAMETERS:
				getFormalTypeParameters().clear();
				return;
			case DeclarationPackage.CT_CLASS__MODIFIERS:
				getModifiers().clear();
				return;
			case DeclarationPackage.CT_CLASS__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case DeclarationPackage.CT_CLASS__INNERTTYPE_SEPARATOR:
				setINNERTTYPE_SEPARATOR(INNERTTYPE_SEPARATOR_EDEFAULT);
				return;
			case DeclarationPackage.CT_CLASS__FIELDS:
				getFields().clear();
				return;
			case DeclarationPackage.CT_CLASS__NESTED_TYPES:
				getNestedTypes().clear();
				return;
			case DeclarationPackage.CT_CLASS__METHODS:
				getMethods().clear();
				return;
			case DeclarationPackage.CT_CLASS__SUPERCLASS:
				setSuperclass((CtTypeReference)null);
				return;
			case DeclarationPackage.CT_CLASS__ANONYMOUS_EXECUTABLES:
				getAnonymousExecutables().clear();
				return;
			case DeclarationPackage.CT_CLASS__CONSTRUCTORS:
				getConstructors().clear();
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
			case DeclarationPackage.CT_CLASS__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_CLASS__POSITION:
				return position != null;
			case DeclarationPackage.CT_CLASS__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_CLASS__PARENT:
				return parent != null;
			case DeclarationPackage.CT_CLASS__FORMAL_TYPE_PARAMETERS:
				return formalTypeParameters != null && !formalTypeParameters.isEmpty();
			case DeclarationPackage.CT_CLASS__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case DeclarationPackage.CT_CLASS__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case DeclarationPackage.CT_CLASS__REFERENCE:
				return reference != null;
			case DeclarationPackage.CT_CLASS__INNERTTYPE_SEPARATOR:
				return INNERTTYPE_SEPARATOR_EDEFAULT == null ? innerttypE_SEPARATOR != null : !INNERTTYPE_SEPARATOR_EDEFAULT.equals(innerttypE_SEPARATOR);
			case DeclarationPackage.CT_CLASS__FIELDS:
				return !getFields().isEmpty();
			case DeclarationPackage.CT_CLASS__NESTED_TYPES:
				return !getNestedTypes().isEmpty();
			case DeclarationPackage.CT_CLASS__ACTUAL_CLASS:
				return ACTUAL_CLASS_EDEFAULT == null ? actualClass != null : !ACTUAL_CLASS_EDEFAULT.equals(actualClass);
			case DeclarationPackage.CT_CLASS__DECLARING_TYPE:
				return basicGetDeclaringType() != null;
			case DeclarationPackage.CT_CLASS__ALL_FIELDS:
				return !getAllFields().isEmpty();
			case DeclarationPackage.CT_CLASS__TOP_LEVEL:
				return TOP_LEVEL_EDEFAULT == null ? topLevel != null : !TOP_LEVEL_EDEFAULT.equals(topLevel);
			case DeclarationPackage.CT_CLASS__PACKAGE:
				return basicGetPackage() != null;
			case DeclarationPackage.CT_CLASS__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case DeclarationPackage.CT_CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case DeclarationPackage.CT_CLASS__SUPERINTERFACES:
				return superinterfaces != null && !superinterfaces.isEmpty();
			case DeclarationPackage.CT_CLASS__ALL_METHODS:
				return !getAllMethods().isEmpty();
			case DeclarationPackage.CT_CLASS__SUPERCLASS:
				return superclass != null;
			case DeclarationPackage.CT_CLASS__ANONYMOUS_EXECUTABLES:
				return anonymousExecutables != null && !anonymousExecutables.isEmpty();
			case DeclarationPackage.CT_CLASS__CONSTRUCTORS:
				return constructors != null && !constructors.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //CtClassImpl