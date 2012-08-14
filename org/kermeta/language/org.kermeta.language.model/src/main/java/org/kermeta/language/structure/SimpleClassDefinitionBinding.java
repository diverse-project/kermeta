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
 * A representation of the model object '<em><b>Simple Class Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.SimpleClassDefinitionBinding#getOwnedPropertyBindings <em>Owned Property Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.SimpleClassDefinitionBinding#getOwnedOperationBindings <em>Owned Operation Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.SimpleClassDefinitionBinding#getSource <em>Source</em>}</li>
 *   <li>{@link org.kermeta.language.structure.SimpleClassDefinitionBinding#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getSimpleClassDefinitionBinding()
 * @model
 * @generated
 */
public interface SimpleClassDefinitionBinding extends ClassDefinitionBinding {
	/**
	 * Returns the value of the '<em><b>Owned Property Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.SimplePropertyBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleClassDefinitionBinding_OwnedPropertyBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimplePropertyBinding> getOwnedPropertyBindings();

	/**
	 * Returns the value of the '<em><b>Owned Operation Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.SimpleOperationBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleClassDefinitionBinding_OwnedOperationBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleOperationBinding> getOwnedOperationBindings();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ClassDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleClassDefinitionBinding_Source()
	 * @model required="true"
	 * @generated
	 */
	ClassDefinition getSource();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.SimpleClassDefinitionBinding#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ClassDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleClassDefinitionBinding_Target()
	 * @model required="true"
	 * @generated
	 */
	ClassDefinition getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.SimpleClassDefinitionBinding#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ClassDefinition value);

} // SimpleClassDefinitionBinding
