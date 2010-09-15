/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.ComponentInstance#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentInstance#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentInstance#getRequired <em>Required</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentInstance#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentInstance#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends NamedElement, Instance {
	/**
	 * Returns the value of the '<em><b>Provided</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getComponentInstance_Provided()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getProvided();

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary</em>' containment reference.
	 * @see #setDictionary(Dictionary)
	 * @see org.kermeta.art2.Art2Package#getComponentInstance_Dictionary()
	 * @model containment="true"
	 * @generated
	 */
	Dictionary getDictionary();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ComponentInstance#getDictionary <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' containment reference.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(Dictionary value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getComponentInstance_Required()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getRequired();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Namespace)
	 * @see org.kermeta.art2.Art2Package#getComponentInstance_Namespace()
	 * @model
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ComponentInstance#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.art2.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' reference list.
	 * @see org.kermeta.art2.Art2Package#getComponentInstance_Metrics()
	 * @model
	 * @generated
	 */
	EList<Metric> getMetrics();

} // ComponentInstance
