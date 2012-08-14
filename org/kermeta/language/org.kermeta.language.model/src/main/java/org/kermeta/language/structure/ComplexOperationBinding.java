/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Operation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ComplexOperationBinding#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ComplexOperationBinding#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ComplexOperationBinding#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getComplexOperationBinding()
 * @model
 * @generated
 */
public interface ComplexOperationBinding extends OperationBinding {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexOperationBinding_Sources()
	 * @model required="true"
	 * @generated
	 */
	EList<Operation> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexOperationBinding_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<Operation> getTargets();

	/**
	 * Returns the value of the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexOperationBinding_OwnedParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getOwnedParameterBindings();

} // ComplexOperationBinding
