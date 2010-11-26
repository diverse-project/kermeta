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

import org.kermeta.language.structure.Model;
import org.kermeta.language.structure.ModelType;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.Resource;
import org.kermeta.language.structure.SimpleResource;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.structure.TypeMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeImpl#getIsAspect <em>Is Aspect</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeImpl#getTypeMappings <em>Type Mappings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeImpl extends TypeImpl implements ModelType {
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
	 * The default value of the '{@link #getIsAspect() <em>Is Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAspect()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ASPECT_EDEFAULT = null;

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
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<org.kermeta.language.structure.Object> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODEL_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getContainedType() {
		if (containedType == null) {
			containedType = new EObjectContainmentWithInverseEList<Type>(Type.class, this, StructurePackage.MODEL_TYPE__CONTAINED_TYPE, StructurePackage.TYPE__TYPE_CONTAINER);
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TYPE__IS_ASPECT, oldIsAspect, isAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getSuperType() {
		if (superType == null) {
			superType = new EObjectResolvingEList<Type>(Type.class, this, StructurePackage.MODEL_TYPE__SUPER_TYPE);
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
			typeMappings = new EObjectContainmentWithInverseEList<TypeMapping>(TypeMapping.class, this, StructurePackage.MODEL_TYPE__TYPE_MAPPINGS, StructurePackage.TYPE_MAPPING__SOURCE_TYPE);
		}
		return typeMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.kermeta.language.structure.Object> getContents() {
		if (contents == null) {
			contents = new EObjectResolvingEList<org.kermeta.language.structure.Object>(org.kermeta.language.structure.Object.class, this, StructurePackage.MODEL_TYPE__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model load(Resource resource) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save(Resource resource) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleResource createSimpleResource(String uri) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case StructurePackage.MODEL_TYPE__CONTAINED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedType()).basicAdd(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE__TYPE_MAPPINGS:
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
			case StructurePackage.MODEL_TYPE__CONTAINED_TYPE:
				return ((InternalEList<?>)getContainedType()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE__TYPE_MAPPINGS:
				return ((InternalEList<?>)getTypeMappings()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.MODEL_TYPE__NAME:
				return getName();
			case StructurePackage.MODEL_TYPE__CONTAINED_TYPE:
				return getContainedType();
			case StructurePackage.MODEL_TYPE__IS_ASPECT:
				return getIsAspect();
			case StructurePackage.MODEL_TYPE__SUPER_TYPE:
				return getSuperType();
			case StructurePackage.MODEL_TYPE__TYPE_MAPPINGS:
				return getTypeMappings();
			case StructurePackage.MODEL_TYPE__CONTENTS:
				return getContents();
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
			case StructurePackage.MODEL_TYPE__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.MODEL_TYPE__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection<? extends Type>)newValue);
				return;
			case StructurePackage.MODEL_TYPE__IS_ASPECT:
				setIsAspect((Boolean)newValue);
				return;
			case StructurePackage.MODEL_TYPE__SUPER_TYPE:
				getSuperType().clear();
				getSuperType().addAll((Collection<? extends Type>)newValue);
				return;
			case StructurePackage.MODEL_TYPE__TYPE_MAPPINGS:
				getTypeMappings().clear();
				getTypeMappings().addAll((Collection<? extends TypeMapping>)newValue);
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
			case StructurePackage.MODEL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.MODEL_TYPE__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case StructurePackage.MODEL_TYPE__IS_ASPECT:
				setIsAspect(IS_ASPECT_EDEFAULT);
				return;
			case StructurePackage.MODEL_TYPE__SUPER_TYPE:
				getSuperType().clear();
				return;
			case StructurePackage.MODEL_TYPE__TYPE_MAPPINGS:
				getTypeMappings().clear();
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
			case StructurePackage.MODEL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.MODEL_TYPE__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case StructurePackage.MODEL_TYPE__IS_ASPECT:
				return IS_ASPECT_EDEFAULT == null ? isAspect != null : !IS_ASPECT_EDEFAULT.equals(isAspect);
			case StructurePackage.MODEL_TYPE__SUPER_TYPE:
				return superType != null && !superType.isEmpty();
			case StructurePackage.MODEL_TYPE__TYPE_MAPPINGS:
				return typeMappings != null && !typeMappings.isEmpty();
			case StructurePackage.MODEL_TYPE__CONTENTS:
				return contents != null && !contents.isEmpty();
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
				case StructurePackage.MODEL_TYPE__NAME: return StructurePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
				case StructurePackage.MODEL_TYPE__CONTAINED_TYPE: return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (derivedFeatureID) {
				case StructurePackage.MODEL_TYPE__IS_ASPECT: return StructurePackage.TYPE_DEFINITION__IS_ASPECT;
				case StructurePackage.MODEL_TYPE__SUPER_TYPE: return StructurePackage.TYPE_DEFINITION__SUPER_TYPE;
				case StructurePackage.MODEL_TYPE__TYPE_MAPPINGS: return StructurePackage.TYPE_DEFINITION__TYPE_MAPPINGS;
				default: return -1;
			}
		}
		if (baseClass == Model.class) {
			switch (derivedFeatureID) {
				case StructurePackage.MODEL_TYPE__CONTENTS: return StructurePackage.MODEL__CONTENTS;
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
				case StructurePackage.NAMED_ELEMENT__NAME: return StructurePackage.MODEL_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE: return StructurePackage.MODEL_TYPE__CONTAINED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_DEFINITION__IS_ASPECT: return StructurePackage.MODEL_TYPE__IS_ASPECT;
				case StructurePackage.TYPE_DEFINITION__SUPER_TYPE: return StructurePackage.MODEL_TYPE__SUPER_TYPE;
				case StructurePackage.TYPE_DEFINITION__TYPE_MAPPINGS: return StructurePackage.MODEL_TYPE__TYPE_MAPPINGS;
				default: return -1;
			}
		}
		if (baseClass == Model.class) {
			switch (baseFeatureID) {
				case StructurePackage.MODEL__CONTENTS: return StructurePackage.MODEL_TYPE__CONTENTS;
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

} //ModelTypeImpl
