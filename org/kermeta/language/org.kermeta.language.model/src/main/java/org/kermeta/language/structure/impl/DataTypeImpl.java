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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.DataType;
import org.kermeta.language.structure.ModelElementTypeDefinition;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.DataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.DataTypeImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.DataTypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.DataTypeImpl#getIsAspect <em>Is Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataTypeImpl extends TypeImpl implements DataType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> superType;

	/**
	 * The default value of the '{@link #getIsAspect() <em>Is Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAspect()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ASPECT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAspect() <em>Is Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAspect()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAspect = IS_ASPECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.DATA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getContainedType() {
		if (containedType == null) {
			containedType = new EObjectContainmentWithInverseEList<Type>(Type.class, this, StructurePackage.DATA_TYPE__CONTAINED_TYPE, StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAspect() {
		return isAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAspect(Boolean newIsAspect) {
		Boolean oldIsAspect = isAspect;
		isAspect = newIsAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.DATA_TYPE__IS_ASPECT, oldIsAspect, isAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getSuperType() {
		if (superType == null) {
			superType = new EObjectResolvingEList<Type>(Type.class, this, StructurePackage.DATA_TYPE__SUPER_TYPE);
		}
		return superType;
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
			case StructurePackage.DATA_TYPE__CONTAINED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedType()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.DATA_TYPE__CONTAINED_TYPE:
				return ((InternalEList<?>)getContainedType()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.DATA_TYPE__NAME:
				return getName();
			case StructurePackage.DATA_TYPE__CONTAINED_TYPE:
				return getContainedType();
			case StructurePackage.DATA_TYPE__SUPER_TYPE:
				return getSuperType();
			case StructurePackage.DATA_TYPE__IS_ASPECT:
				return getIsAspect();
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
			case StructurePackage.DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.DATA_TYPE__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection<? extends Type>)newValue);
				return;
			case StructurePackage.DATA_TYPE__SUPER_TYPE:
				getSuperType().clear();
				getSuperType().addAll((Collection<? extends Type>)newValue);
				return;
			case StructurePackage.DATA_TYPE__IS_ASPECT:
				setIsAspect((Boolean)newValue);
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
			case StructurePackage.DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.DATA_TYPE__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case StructurePackage.DATA_TYPE__SUPER_TYPE:
				getSuperType().clear();
				return;
			case StructurePackage.DATA_TYPE__IS_ASPECT:
				setIsAspect(IS_ASPECT_EDEFAULT);
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
			case StructurePackage.DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.DATA_TYPE__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case StructurePackage.DATA_TYPE__SUPER_TYPE:
				return superType != null && !superType.isEmpty();
			case StructurePackage.DATA_TYPE__IS_ASPECT:
				return IS_ASPECT_EDEFAULT == null ? isAspect != null : !IS_ASPECT_EDEFAULT.equals(isAspect);
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case StructurePackage.DATA_TYPE__NAME: return StructurePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
				case StructurePackage.DATA_TYPE__CONTAINED_TYPE: return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (derivedFeatureID) {
				case StructurePackage.DATA_TYPE__SUPER_TYPE: return StructurePackage.TYPE_DEFINITION__SUPER_TYPE;
				case StructurePackage.DATA_TYPE__IS_ASPECT: return StructurePackage.TYPE_DEFINITION__IS_ASPECT;
				default: return -1;
			}
		}
		if (baseClass == ModelElementTypeDefinition.class) {
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case StructurePackage.NAMED_ELEMENT__NAME: return StructurePackage.DATA_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE: return StructurePackage.DATA_TYPE__CONTAINED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_DEFINITION__SUPER_TYPE: return StructurePackage.DATA_TYPE__SUPER_TYPE;
				case StructurePackage.TYPE_DEFINITION__IS_ASPECT: return StructurePackage.DATA_TYPE__IS_ASPECT;
				default: return -1;
			}
		}
		if (baseClass == ModelElementTypeDefinition.class) {
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
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isAspect: ");
		result.append(isAspect);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
