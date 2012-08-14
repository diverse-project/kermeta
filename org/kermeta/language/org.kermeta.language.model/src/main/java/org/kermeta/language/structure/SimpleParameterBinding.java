/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.SimpleParameterBinding#getSource <em>Source</em>}</li>
 *   <li>{@link org.kermeta.language.structure.SimpleParameterBinding#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getSimpleParameterBinding()
 * @model
 * @generated
 */
public interface SimpleParameterBinding extends ParameterBinding {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Parameter)
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleParameterBinding_Source()
	 * @model required="true"
	 * @generated
	 */
	Parameter getSource();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.SimpleParameterBinding#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Parameter value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Parameter)
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleParameterBinding_Target()
	 * @model required="true"
	 * @generated
	 */
	Parameter getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.SimpleParameterBinding#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Parameter value);

} // SimpleParameterBinding
