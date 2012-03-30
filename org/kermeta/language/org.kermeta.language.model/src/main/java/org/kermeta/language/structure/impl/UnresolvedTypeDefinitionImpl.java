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

import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.structure.TypeMapping;
import org.kermeta.language.structure.UnresolvedTypeDefinition;
import org.kermeta.language.structure.Using;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeDefinitionImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeDefinitionImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeDefinitionImpl#getTypeMappings <em>Type Mappings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeDefinitionImpl#getIsAspect <em>Is Aspect</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeDefinitionImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeDefinitionImpl#getTypeDefinitionIdentifier <em>Type Definition Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedTypeDefinitionImpl extends UnresolvedImpl implements UnresolvedTypeDefinition {
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
	 * The cached value of the '{@link #getTypeMappings() <em>Type Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMapping> typeMappings;

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
	 * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsings()
	 * @generated
	 * @ordered
	 */
	protected EList<Using> usings;

	/**
	 * The default value of the '{@link #getTypeDefinitionIdentifier() <em>Type Definition Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_DEFINITION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeDefinitionIdentifier() <em>Type Definition Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String typeDefinitionIdentifier = TYPE_DEFINITION_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.UNRESOLVED_TYPE_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.UNRESOLVED_TYPE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getContainedType() {
		if (containedType == null) {
			containedType = new EObjectContainmentWithInverseEList<Type>(Type.class, this, StructurePackage.UNRESOLVED_TYPE_DEFINITION__CONTAINED_TYPE, StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getSuperType() {
		if (superType == null) {
			superType = new EObjectResolvingEList<Type>(Type.class, this, StructurePackage.UNRESOLVED_TYPE_DEFINITION__SUPER_TYPE);
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMapping> getTypeMappings() {
		if (typeMappings == null) {
			typeMappings = new EObjectContainmentWithInverseEList<TypeMapping>(TypeMapping.class, this, StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_MAPPINGS, StructurePackage.TYPE_MAPPING__SOURCE_TYPE);
		}
		return typeMappings;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.UNRESOLVED_TYPE_DEFINITION__IS_ASPECT, oldIsAspect, isAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Using> getUsings() {
		if (usings == null) {
			usings = new EObjectContainmentEList<Using>(Using.class, this, StructurePackage.UNRESOLVED_TYPE_DEFINITION__USINGS);
		}
		return usings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeDefinitionIdentifier() {
		return typeDefinitionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinitionIdentifier(String newTypeDefinitionIdentifier) {
		String oldTypeDefinitionIdentifier = typeDefinitionIdentifier;
		typeDefinitionIdentifier = newTypeDefinitionIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_DEFINITION_IDENTIFIER, oldTypeDefinitionIdentifier, typeDefinitionIdentifier));
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
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__CONTAINED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedType()).basicAdd(otherEnd, msgs);
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeMappings()).basicAdd(otherEnd, msgs);
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
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__CONTAINED_TYPE:
				return ((InternalEList<?>)getContainedType()).basicRemove(otherEnd, msgs);
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_MAPPINGS:
				return ((InternalEList<?>)getTypeMappings()).basicRemove(otherEnd, msgs);
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__USINGS:
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
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__NAME:
				return getName();
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__CONTAINED_TYPE:
				return getContainedType();
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__SUPER_TYPE:
				return getSuperType();
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_MAPPINGS:
				return getTypeMappings();
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__IS_ASPECT:
				return getIsAspect();
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__USINGS:
				return getUsings();
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_DEFINITION_IDENTIFIER:
				return getTypeDefinitionIdentifier();
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
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection<? extends Type>)newValue);
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__SUPER_TYPE:
				getSuperType().clear();
				getSuperType().addAll((Collection<? extends Type>)newValue);
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_MAPPINGS:
				getTypeMappings().clear();
				getTypeMappings().addAll((Collection<? extends TypeMapping>)newValue);
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__IS_ASPECT:
				setIsAspect((Boolean)newValue);
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__USINGS:
				getUsings().clear();
				getUsings().addAll((Collection<? extends Using>)newValue);
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_DEFINITION_IDENTIFIER:
				setTypeDefinitionIdentifier((String)newValue);
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
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__SUPER_TYPE:
				getSuperType().clear();
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_MAPPINGS:
				getTypeMappings().clear();
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__IS_ASPECT:
				setIsAspect(IS_ASPECT_EDEFAULT);
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__USINGS:
				getUsings().clear();
				return;
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_DEFINITION_IDENTIFIER:
				setTypeDefinitionIdentifier(TYPE_DEFINITION_IDENTIFIER_EDEFAULT);
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
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__SUPER_TYPE:
				return superType != null && !superType.isEmpty();
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_MAPPINGS:
				return typeMappings != null && !typeMappings.isEmpty();
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__IS_ASPECT:
				return IS_ASPECT_EDEFAULT == null ? isAspect != null : !IS_ASPECT_EDEFAULT.equals(isAspect);
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__USINGS:
				return usings != null && !usings.isEmpty();
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_DEFINITION_IDENTIFIER:
				return TYPE_DEFINITION_IDENTIFIER_EDEFAULT == null ? typeDefinitionIdentifier != null : !TYPE_DEFINITION_IDENTIFIER_EDEFAULT.equals(typeDefinitionIdentifier);
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
				case StructurePackage.UNRESOLVED_TYPE_DEFINITION__NAME: return StructurePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
				case StructurePackage.UNRESOLVED_TYPE_DEFINITION__CONTAINED_TYPE: return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (derivedFeatureID) {
				case StructurePackage.UNRESOLVED_TYPE_DEFINITION__SUPER_TYPE: return StructurePackage.TYPE_DEFINITION__SUPER_TYPE;
				case StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_MAPPINGS: return StructurePackage.TYPE_DEFINITION__TYPE_MAPPINGS;
				case StructurePackage.UNRESOLVED_TYPE_DEFINITION__IS_ASPECT: return StructurePackage.TYPE_DEFINITION__IS_ASPECT;
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
				case StructurePackage.NAMED_ELEMENT__NAME: return StructurePackage.UNRESOLVED_TYPE_DEFINITION__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE: return StructurePackage.UNRESOLVED_TYPE_DEFINITION__CONTAINED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_DEFINITION__SUPER_TYPE: return StructurePackage.UNRESOLVED_TYPE_DEFINITION__SUPER_TYPE;
				case StructurePackage.TYPE_DEFINITION__TYPE_MAPPINGS: return StructurePackage.UNRESOLVED_TYPE_DEFINITION__TYPE_MAPPINGS;
				case StructurePackage.TYPE_DEFINITION__IS_ASPECT: return StructurePackage.UNRESOLVED_TYPE_DEFINITION__IS_ASPECT;
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
		result.append(", typeDefinitionIdentifier: ");
		result.append(typeDefinitionIdentifier);
		result.append(')');
		return result.toString();
	}

} //UnresolvedTypeDefinitionImpl