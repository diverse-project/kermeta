/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.PropertyConstraint#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getPropertyConstraint()
 * @model
 * @generated
 */
public interface PropertyConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(Property)
	 * @see kermeta.language.structure.StructurePackage#getPropertyConstraint_Property()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='/**\n\t * The property that is checked by this constraint\n\t * Typically, it will check the lower and upper bounds\n\t \052/'"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.PropertyConstraint#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // PropertyConstraint
