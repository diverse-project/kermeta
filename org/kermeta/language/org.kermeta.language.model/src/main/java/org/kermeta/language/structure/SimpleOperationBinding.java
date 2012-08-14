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
 * A representation of the model object '<em><b>Simple Operation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.SimpleOperationBinding#getSource <em>Source</em>}</li>
 *   <li>{@link org.kermeta.language.structure.SimpleOperationBinding#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.language.structure.SimpleOperationBinding#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getSimpleOperationBinding()
 * @model
 * @generated
 */
public interface SimpleOperationBinding extends OperationBinding {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Operation)
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleOperationBinding_Source()
	 * @model required="true"
	 * @generated
	 */
	Operation getSource();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.SimpleOperationBinding#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Operation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Operation)
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleOperationBinding_Target()
	 * @model required="true"
	 * @generated
	 */
	Operation getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.SimpleOperationBinding#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Operation value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.SimpleParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleOperationBinding_OwnedParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleParameterBinding> getOwnedParameterBindings();

} // SimpleOperationBinding
