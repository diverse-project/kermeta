/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parameter.java,v 1.2 2007-07-11 14:41:51 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Parameter#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends MultiplicityElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.Operation#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getParameter_Operation()
	 * @see fr.irisa.triskell.kermeta.language.structure.Operation#getOwnedParameter
	 * @model opposite="ownedParameter"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Parameter#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Parameter
