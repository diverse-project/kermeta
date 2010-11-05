/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.adaptations;

import art_relaxed.distrib_relaxed.Node;

import art_relaxed.instance_relaxed.ComponentInstance;

import org.eclipse.emf.common.util.EList;

import smartadapters4ART.SetAdaptation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setruntime Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeNode#getNodeToSet <em>Node To Set</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeNode#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeNode()
 * @model
 * @generated
 */
public interface SetruntimeNode extends SetAdaptation {
	/**
	 * Returns the value of the '<em><b>Node To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node To Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node To Set</em>' reference.
	 * @see #setNodeToSet(Node)
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeNode_NodeToSet()
	 * @model required="true"
	 * @generated
	 */
	Node getNodeToSet();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeNode#getNodeToSet <em>Node To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node To Set</em>' reference.
	 * @see #getNodeToSet()
	 * @generated
	 */
	void setNodeToSet(Node value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeNode_Components()
	 * @model
	 * @generated
	 */
	EList<ComponentInstance> getComponents();

} // SetruntimeNode
