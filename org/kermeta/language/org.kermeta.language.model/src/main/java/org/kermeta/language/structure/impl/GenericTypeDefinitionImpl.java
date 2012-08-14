/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.kermeta.language.structure.GenericTypeDefinition;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.TypeVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.GenericTypeDefinitionImpl#getTypeParameter <em>Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenericTypeDefinitionImpl extends TypeDefinitionImpl implements GenericTypeDefinition {
	/**
	 * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariable> typeParameter;

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
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.GENERIC_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariable> getTypeParameter() {
		if (typeParameter == null) {
			typeParameter = new EObjectResolvingEList<TypeVariable>(TypeVariable.class, this, StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER);
		}
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER:
				return getTypeParameter();
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
			case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER:
				getTypeParameter().clear();
				getTypeParameter().addAll((Collection<? extends TypeVariable>)newValue);
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
			case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER:
				getTypeParameter().clear();
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
			case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER:
				return typeParameter != null && !typeParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenericTypeDefinitionImpl
