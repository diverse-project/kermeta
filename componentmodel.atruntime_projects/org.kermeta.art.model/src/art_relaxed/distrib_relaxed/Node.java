/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.distrib_relaxed;

import art_relaxed.NamedElement;

import art_relaxed.instance_relaxed.ComponentInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.distrib_relaxed.Node#getUri <em>Uri</em>}</li>
 *   <li>{@link art_relaxed.distrib_relaxed.Node#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.distrib_relaxed.Distrib_relaxedPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see art_relaxed.distrib_relaxed.Distrib_relaxedPackage#getNode_Uri()
	 * @model dataType="art_relaxed.String"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link art_relaxed.distrib_relaxed.Node#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see art_relaxed.distrib_relaxed.Distrib_relaxedPackage#getNode_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponents();

} // Node
