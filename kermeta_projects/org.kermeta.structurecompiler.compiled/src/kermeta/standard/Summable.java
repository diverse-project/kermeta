/**
 * <copyright>
 * </copyright>
 *
 * $Id: Summable.java,v 1.9 2008-11-27 15:49:55 cfaucher Exp $
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
 *        annotation="kermeta documentation='/**\n * The abstract class Summable defines a set of operation\n * to sum instances of a class.\n * Sub-classes only has to implement abstract operation plus.\n  \052/'"
 * @generated
 */
public interface Summable<G> extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Summarization method to be implemented by any summable class.\n\t * The parameter must have the same type (or one of its subtypes)\n\t *  than the current object .\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='G result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	G plus(G other);

} // Summable
