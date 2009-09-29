/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Parameter#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getParameter()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='Definition for operation parameter'"
 * @generated
 */
public interface Parameter extends MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Operation#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see kermeta.language.structure.StructurePackage#getParameter_Operation()
	 * @see kermeta.language.structure.Operation#getOwnedParameter
	 * @model opposite="ownedParameter"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kermeta documentation='Owning operation'"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Parameter#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Parameter
