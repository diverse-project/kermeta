/**
 * <copyright>
 * </copyright>
 *
 * $Id: Summable.java,v 1.3 2008-09-22 14:48:27 cfaucher Exp $
 */
package kermeta.standard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getSummable()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * The abstract class Summable defines a set of operation\r\n * to sum instances of a class.\r\n * Sub-classes only has to implement abstract operation plus.\r\n  \052/'"
 * @generated
 */
public interface Summable<G> extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Summarization method to be implemented by any summable class.\r\n\t * The parameter must have the same type (or one of its subtypes)\r\n\t *  than the current object .\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='G result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	G plus(G other);

} // Summable
