/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Adaptation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.PropertyAdaptationOperator#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.language.structure.PropertyAdaptationOperator#getGetter <em>Getter</em>}</li>
 *   <li>{@link org.kermeta.language.structure.PropertyAdaptationOperator#getSetter <em>Setter</em>}</li>
 *   <li>{@link org.kermeta.language.structure.PropertyAdaptationOperator#getAdder <em>Adder</em>}</li>
 *   <li>{@link org.kermeta.language.structure.PropertyAdaptationOperator#getRemover <em>Remover</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getPropertyAdaptationOperator()
 * @model
 * @generated
 */
public interface PropertyAdaptationOperator extends AdaptationOperator {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Property)
	 * @see org.kermeta.language.structure.StructurePackage#getPropertyAdaptationOperator_Target()
	 * @model required="true"
	 * @generated
	 */
	Property getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.PropertyAdaptationOperator#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Property value);

	/**
	 * Returns the value of the '<em><b>Getter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter</em>' attribute.
	 * @see #setGetter(String)
	 * @see org.kermeta.language.structure.StructurePackage#getPropertyAdaptationOperator_Getter()
	 * @model dataType="org.kermeta.language.structure.String" required="true"
	 * @generated
	 */
	String getGetter();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.PropertyAdaptationOperator#getGetter <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter</em>' attribute.
	 * @see #getGetter()
	 * @generated
	 */
	void setGetter(String value);

	/**
	 * Returns the value of the '<em><b>Setter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter</em>' attribute.
	 * @see #setSetter(String)
	 * @see org.kermeta.language.structure.StructurePackage#getPropertyAdaptationOperator_Setter()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getSetter();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.PropertyAdaptationOperator#getSetter <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter</em>' attribute.
	 * @see #getSetter()
	 * @generated
	 */
	void setSetter(String value);

	/**
	 * Returns the value of the '<em><b>Adder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adder</em>' attribute.
	 * @see #setAdder(String)
	 * @see org.kermeta.language.structure.StructurePackage#getPropertyAdaptationOperator_Adder()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getAdder();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.PropertyAdaptationOperator#getAdder <em>Adder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adder</em>' attribute.
	 * @see #getAdder()
	 * @generated
	 */
	void setAdder(String value);

	/**
	 * Returns the value of the '<em><b>Remover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remover</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remover</em>' attribute.
	 * @see #setRemover(String)
	 * @see org.kermeta.language.structure.StructurePackage#getPropertyAdaptationOperator_Remover()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getRemover();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.PropertyAdaptationOperator#getRemover <em>Remover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remover</em>' attribute.
	 * @see #getRemover()
	 * @generated
	 */
	void setRemover(String value);

} // PropertyAdaptationOperator
