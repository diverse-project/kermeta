/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EParameter.java,v 1.13 2009-02-23 15:26:51 cfaucher Exp $
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EParameter#getEOperation <em>EOperation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEParameter()
 * @model
 * @generated
 */
public interface EParameter extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>EOperation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.EOperation#getEParameters <em>EParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperation</em>' container reference.
	 * @see ecore.EcorePackage#getEParameter_EOperation()
	 * @see ecore.EOperation#getEParameters
	 * @model opposite="eParameters" changeable="false"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	EOperation getEOperation();

} // EParameter
