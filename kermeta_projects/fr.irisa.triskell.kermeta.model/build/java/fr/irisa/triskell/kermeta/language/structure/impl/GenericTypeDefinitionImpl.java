/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenericTypeDefinitionImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.GenericTypeDefinitionImpl#getTypeParameter <em>Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenericTypeDefinitionImpl extends TypeDefinitionImpl implements GenericTypeDefinition {
	/**
	 * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected EList typeParameter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getGenericTypeDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTypeParameter() {
		if (typeParameter == null) {
			typeParameter = new EObjectContainmentEList(TypeVariable.class, this, StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER);
		}
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case StructurePackage.GENERIC_TYPE_DEFINITION__TAG:
					return ((InternalEList)getTag()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case StructurePackage.GENERIC_TYPE_DEFINITION__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER:
					return ((InternalEList)getTypeParameter()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case StructurePackage.GENERIC_TYPE_DEFINITION__TAG:
				return getTag();
			case StructurePackage.GENERIC_TYPE_DEFINITION__NAME:
				return getName();
			case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER:
				return getTypeParameter();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case StructurePackage.GENERIC_TYPE_DEFINITION__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case StructurePackage.GENERIC_TYPE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER:
				getTypeParameter().clear();
				getTypeParameter().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case StructurePackage.GENERIC_TYPE_DEFINITION__TAG:
				getTag().clear();
				return;
			case StructurePackage.GENERIC_TYPE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER:
				getTypeParameter().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case StructurePackage.GENERIC_TYPE_DEFINITION__TAG:
				return tag != null && !tag.isEmpty();
			case StructurePackage.GENERIC_TYPE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER:
				return typeParameter != null && !typeParameter.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //GenericTypeDefinitionImpl
