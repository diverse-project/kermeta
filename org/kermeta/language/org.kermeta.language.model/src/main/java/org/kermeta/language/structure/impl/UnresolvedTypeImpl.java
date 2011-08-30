/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.Unresolved;
import org.kermeta.language.structure.UnresolvedType;
import org.kermeta.language.structure.Using;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeImpl#getGenerics <em>Generics</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeImpl#getTypeIdentifier <em>Type Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedTypeImpl extends TypeImpl implements UnresolvedType {
	/**
	 * The cached value of the '{@link #getContainedType() <em>Contained Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> containedType;

	/**
	 * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsings()
	 * @generated
	 * @ordered
	 */
	protected EList<Using> usings;

	/**
	 * The cached value of the '{@link #getGenerics() <em>Generics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerics()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> generics;

	/**
	 * The default value of the '{@link #getTypeIdentifier() <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeIdentifier() <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String typeIdentifier = TYPE_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.UNRESOLVED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getContainedType() {
		if (containedType == null) {
			containedType = new EObjectContainmentWithInverseEList<Type>(Type.class, this, StructurePackage.UNRESOLVED_TYPE__CONTAINED_TYPE, StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeIdentifier() {
		return typeIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeIdentifier(String newTypeIdentifier) {
		String oldTypeIdentifier = typeIdentifier;
		typeIdentifier = newTypeIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER, oldTypeIdentifier, typeIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_TYPE__CONTAINED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedType()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Using> getUsings() {
		if (usings == null) {
			usings = new EObjectContainmentEList<Using>(Using.class, this, StructurePackage.UNRESOLVED_TYPE__USINGS);
		}
		return usings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getGenerics() {
		if (generics == null) {
			generics = new EObjectResolvingEList<Type>(Type.class, this, StructurePackage.UNRESOLVED_TYPE__GENERICS);
		}
		return generics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_TYPE__CONTAINED_TYPE:
				return ((InternalEList<?>)getContainedType()).basicRemove(otherEnd, msgs);
			case StructurePackage.UNRESOLVED_TYPE__USINGS:
				return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_TYPE__CONTAINED_TYPE:
				return getContainedType();
			case StructurePackage.UNRESOLVED_TYPE__USINGS:
				return getUsings();
			case StructurePackage.UNRESOLVED_TYPE__GENERICS:
				return getGenerics();
			case StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER:
				return getTypeIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_TYPE__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection<? extends Type>)newValue);
				return;
			case StructurePackage.UNRESOLVED_TYPE__USINGS:
				getUsings().clear();
				getUsings().addAll((Collection<? extends Using>)newValue);
				return;
			case StructurePackage.UNRESOLVED_TYPE__GENERICS:
				getGenerics().clear();
				getGenerics().addAll((Collection<? extends Type>)newValue);
				return;
			case StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER:
				setTypeIdentifier((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_TYPE__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case StructurePackage.UNRESOLVED_TYPE__USINGS:
				getUsings().clear();
				return;
			case StructurePackage.UNRESOLVED_TYPE__GENERICS:
				getGenerics().clear();
				return;
			case StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER:
				setTypeIdentifier(TYPE_IDENTIFIER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_TYPE__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case StructurePackage.UNRESOLVED_TYPE__USINGS:
				return usings != null && !usings.isEmpty();
			case StructurePackage.UNRESOLVED_TYPE__GENERICS:
				return generics != null && !generics.isEmpty();
			case StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER:
				return TYPE_IDENTIFIER_EDEFAULT == null ? typeIdentifier != null : !TYPE_IDENTIFIER_EDEFAULT.equals(typeIdentifier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Unresolved.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
				case StructurePackage.UNRESOLVED_TYPE__CONTAINED_TYPE: return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Unresolved.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE: return StructurePackage.UNRESOLVED_TYPE__CONTAINED_TYPE;
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
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typeIdentifier: ");
		result.append(typeIdentifier);
		result.append(')');
		return result.toString();
	}

} //UnresolvedTypeImpl
