/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.ContainerNode#getComponents <em>Components</em>}</li>
 *   <li>{@link art2.ContainerNode#getComponentTypes <em>Component Types</em>}</li>
 *   <li>{@link art2.ContainerNode#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getContainerNode()
 * @model
 * @generated
 */
public interface ContainerNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link art2.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see art2.Art2Package#getContainerNode_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponents();

	/**
	 * Returns the value of the '<em><b>Component Types</b></em>' reference list.
	 * The list contents are of type {@link art2.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Types</em>' reference list.
	 * @see art2.Art2Package#getContainerNode_ComponentTypes()
	 * @model
	 * @generated
	 */
	EList<ComponentType> getComponentTypes();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link art2.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see art2.Art2Package#getContainerNode_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

} // ContainerNode
