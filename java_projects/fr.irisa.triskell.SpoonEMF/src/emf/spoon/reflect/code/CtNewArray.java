/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtNewArray.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct New Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtNewArray#getDimensionExpressions <em>Dimension Expressions</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtNewArray#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtNewArray()
 * @model
 * @generated
 */
public interface CtNewArray extends CtExpression, spoon.reflect.code.CtNewArray {
	/**
	 * Returns the value of the '<em><b>Dimension Expressions</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.code.CtExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Expressions</em>' reference list.
	 * @see emf.spoon.reflect.code.CodePackage#getCtNewArray_DimensionExpressions()
	 * @model type="emf.spoon.reflect.code.CtExpression"
	 * @generated
	 */
	List getDimensionExpressions();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.code.CtExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see emf.spoon.reflect.code.CodePackage#getCtNewArray_Elements()
	 * @model type="emf.spoon.reflect.code.CtExpression"
	 * @generated
	 */
	List getElements();

} // CtNewArray