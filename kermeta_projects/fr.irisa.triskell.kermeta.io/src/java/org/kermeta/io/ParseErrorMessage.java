/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParseErrorMessage.java,v 1.4 2008-04-28 11:50:15 ftanguy Exp $
 */
package org.kermeta.io;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parse Error Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.ParseErrorMessage#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getParseErrorMessage()
 * @model
 * @generated
 */
public interface ParseErrorMessage extends ErrorMessage {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(ASTNode)
	 * @see org.kermeta.io.IoPackage#getParseErrorMessage_Node()
	 * @model dataType="org.kermeta.io.ASTNode"
	 * @generated
	 */
	ASTNode getNode();

	/**
	 * Sets the value of the '{@link org.kermeta.io.ParseErrorMessage#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(ASTNode value);

} // ParseErrorMessage