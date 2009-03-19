/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtPackageImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtPackage;
import emf.spoon.reflect.declaration.CtSimpleType;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtPackageReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtPackageImpl#getPACKAGE_SEPARATOR <em>PACKAGE SEPARATOR</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtPackageImpl#getTOP_LEVEL_PACKAGE_NAME <em>TOP LEVEL PACKAGE NAME</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtPackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtPackageImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtPackageImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtPackageImpl#getDeclaringPackage <em>Declaring Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtPackageImpl extends CtNamedElementImpl implements CtPackage {
	/**
	 * The default value of the '{@link #getPACKAGE_SEPARATOR() <em>PACKAGE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPACKAGE_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPACKAGE_SEPARATOR() <em>PACKAGE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPACKAGE_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected String packagE_SEPARATOR = PACKAGE_SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTOP_LEVEL_PACKAGE_NAME() <em>TOP LEVEL PACKAGE NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOP_LEVEL_PACKAGE_NAME()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_LEVEL_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTOP_LEVEL_PACKAGE_NAME() <em>TOP LEVEL PACKAGE NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOP_LEVEL_PACKAGE_NAME()
	 * @generated
	 * @ordered
	 */
	protected String toP_LEVEL_PACKAGE_NAME = TOP_LEVEL_PACKAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList packages = null;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList types = null;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	//protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPACKAGE_SEPARATOR() {
		return packagE_SEPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPACKAGE_SEPARATOR(String newPACKAGE_SEPARATOR) {
		String oldPACKAGE_SEPARATOR = packagE_SEPARATOR;
		packagE_SEPARATOR = newPACKAGE_SEPARATOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_PACKAGE__PACKAGE_SEPARATOR, oldPACKAGE_SEPARATOR, packagE_SEPARATOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTOP_LEVEL_PACKAGE_NAME() {
		return toP_LEVEL_PACKAGE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOP_LEVEL_PACKAGE_NAME(String newTOP_LEVEL_PACKAGE_NAME) {
		String oldTOP_LEVEL_PACKAGE_NAME = toP_LEVEL_PACKAGE_NAME;
		toP_LEVEL_PACKAGE_NAME = newTOP_LEVEL_PACKAGE_NAME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_PACKAGE__TOP_LEVEL_PACKAGE_NAME, oldTOP_LEVEL_PACKAGE_NAME, toP_LEVEL_PACKAGE_NAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getPackages() {
		if (packages == null) {
			packages = new EObjectWithInverseResolvingEList(CtPackage.class, this, DeclarationPackage.CT_PACKAGE__PACKAGES, DeclarationPackage.CT_PACKAGE__DECLARING_PACKAGE);
		}
		return new EmfSet(packages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getTypes() {
		if (types == null) {
			types = new EObjectWithInverseResolvingEList(CtSimpleType.class, this, DeclarationPackage.CT_PACKAGE__TYPES, DeclarationPackage.CT_SIMPLE_TYPE__PACKAGE);
		}
		return new EmfSet(types);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		if (getDeclaringPackage() == null)
			return getSimpleName();
		return getDeclaringPackage().getQualifiedName() + "." + getSimpleName();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtPackage getDeclaringPackage() {
		if (parent == null)
			return null;
		return (CtPackage) getParent(CtPackage.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtPackage basicGetDeclaringPackage() {
		return this.getDeclaringPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaringPackage(CtPackage newDeclaringPackage, NotificationChain msgs) {
		CtPackage oldDeclaringPackage = this.getDeclaringPackage();
		parent= newDeclaringPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_PACKAGE__DECLARING_PACKAGE, oldDeclaringPackage, newDeclaringPackage);
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
			case DeclarationPackage.CT_PACKAGE__PACKAGES:
				return ((InternalEList)getPackages()).basicAdd(otherEnd, msgs);
			case DeclarationPackage.CT_PACKAGE__DECLARING_PACKAGE:
				if (this.getDeclaringPackage() != null)
					msgs = ((InternalEObject)this.getDeclaringPackage()).eInverseRemove(this, DeclarationPackage.CT_PACKAGE__PACKAGES, CtPackage.class, msgs);
				return basicSetDeclaringPackage((CtPackage)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.CT_PACKAGE__PACKAGES:
				return ((InternalEList)getPackages()).basicRemove(otherEnd, msgs);
			case DeclarationPackage.CT_PACKAGE__DECLARING_PACKAGE:
				return basicSetDeclaringPackage(null, msgs);
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
			case DeclarationPackage.CT_PACKAGE__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_PACKAGE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_PACKAGE__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_PACKAGE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_PACKAGE__MODIFIERS:
				return getModifiers();
			case DeclarationPackage.CT_PACKAGE__SIMPLE_NAME:
				return getSimpleName();
			case DeclarationPackage.CT_PACKAGE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case DeclarationPackage.CT_PACKAGE__PACKAGE_SEPARATOR:
				return getPACKAGE_SEPARATOR();
			case DeclarationPackage.CT_PACKAGE__TOP_LEVEL_PACKAGE_NAME:
				return getTOP_LEVEL_PACKAGE_NAME();
			case DeclarationPackage.CT_PACKAGE__PACKAGES:
				return getPackages();
			case DeclarationPackage.CT_PACKAGE__TYPES:
				return getTypes();
			case DeclarationPackage.CT_PACKAGE__QUALIFIED_NAME:
				return getQualifiedName();
			case DeclarationPackage.CT_PACKAGE__DECLARING_PACKAGE:
				if (resolve) return getDeclaringPackage();
				return basicGetDeclaringPackage();
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
			case DeclarationPackage.CT_PACKAGE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_PACKAGE__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_PACKAGE__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_PACKAGE__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_PACKAGE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_PACKAGE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case DeclarationPackage.CT_PACKAGE__PACKAGE_SEPARATOR:
				setPACKAGE_SEPARATOR((String)newValue);
				return;
			case DeclarationPackage.CT_PACKAGE__TOP_LEVEL_PACKAGE_NAME:
				setTOP_LEVEL_PACKAGE_NAME((String)newValue);
				return;
			case DeclarationPackage.CT_PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_PACKAGE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection)newValue);
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
			case DeclarationPackage.CT_PACKAGE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_PACKAGE__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_PACKAGE__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_PACKAGE__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_PACKAGE__MODIFIERS:
				getModifiers().clear();
				return;
			case DeclarationPackage.CT_PACKAGE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case DeclarationPackage.CT_PACKAGE__PACKAGE_SEPARATOR:
				setPACKAGE_SEPARATOR(PACKAGE_SEPARATOR_EDEFAULT);
				return;
			case DeclarationPackage.CT_PACKAGE__TOP_LEVEL_PACKAGE_NAME:
				setTOP_LEVEL_PACKAGE_NAME(TOP_LEVEL_PACKAGE_NAME_EDEFAULT);
				return;
			case DeclarationPackage.CT_PACKAGE__PACKAGES:
				getPackages().clear();
				return;
			case DeclarationPackage.CT_PACKAGE__TYPES:
				getTypes().clear();
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
			case DeclarationPackage.CT_PACKAGE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_PACKAGE__POSITION:
				return position != null;
			case DeclarationPackage.CT_PACKAGE__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_PACKAGE__PARENT:
				return parent != null;
			case DeclarationPackage.CT_PACKAGE__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case DeclarationPackage.CT_PACKAGE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case DeclarationPackage.CT_PACKAGE__REFERENCE:
				return reference != null;
			case DeclarationPackage.CT_PACKAGE__PACKAGE_SEPARATOR:
				return PACKAGE_SEPARATOR_EDEFAULT == null ? packagE_SEPARATOR != null : !PACKAGE_SEPARATOR_EDEFAULT.equals(packagE_SEPARATOR);
			case DeclarationPackage.CT_PACKAGE__TOP_LEVEL_PACKAGE_NAME:
				return TOP_LEVEL_PACKAGE_NAME_EDEFAULT == null ? toP_LEVEL_PACKAGE_NAME != null : !TOP_LEVEL_PACKAGE_NAME_EDEFAULT.equals(toP_LEVEL_PACKAGE_NAME);
			case DeclarationPackage.CT_PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case DeclarationPackage.CT_PACKAGE__TYPES:
				return !getTypes().isEmpty();
			case DeclarationPackage.CT_PACKAGE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case DeclarationPackage.CT_PACKAGE__DECLARING_PACKAGE:
				return this.getDeclaringPackage() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (PACKAGE_SEPARATOR: ");
		result.append(packagE_SEPARATOR);
		result.append(", TOP_LEVEL_PACKAGE_NAME: ");
		result.append(toP_LEVEL_PACKAGE_NAME);
		result.append(')');
		return result.toString();
	}
	public     CtPackageReference getReference(){
		return (CtPackageReference) super.getReference();
	}

} //CtPackageImpl