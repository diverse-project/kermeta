/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtBlock.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtBlock()
 * @model
 * @generated
 */
public interface CtBlock extends CtStatement, spoon.reflect.code.CtBlock {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.code.CtStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' reference list.
	 * @see emf.spoon.reflect.code.CodePackage#getCtBlock_Statements()
	 * @model type="emf.spoon.reflect.code.CtStatement"
	 * @generated
	 */
	List getStatements();

} // CtBlock