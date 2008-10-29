/**
 * <copyright>
 * </copyright>
 *
 * $Id: Stack.java,v 1.7 2008-10-29 08:29:22 cfaucher Exp $
 */
package kermeta.utils;

import kermeta.standard.Sequence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.utils.UtilsPackage#getStack()
 * @model annotation="kermeta documentation='/**\r\n * An implementation of stack\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface Stack<G> extends Sequence<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Get and remove the element at the top of the stack\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tresult = this.peek();\n\n\tthis.removeAt(0);\n\nreturn result;\n'"
	 * @generated
	 */
	G pop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Gets the element at the top of the stack\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tresult = this.first();\n\nreturn result;\n'"
	 * @generated
	 */
	G peek();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Pushes an element into the stack\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.addAt(0, element);\n'"
	 * @generated
	 */
	void push(G element);

} // Stack
