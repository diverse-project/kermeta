/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtExpression.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import java.util.List;

import emf.spoon.reflect.declaration.CtTypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtExpression#getTypeCasts <em>Type Casts</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtExpression()
 * @model
 * @generated
 */
public interface CtExpression extends CtCodeElement, CtTypedElement, spoon.reflect.code.CtExpression {
	/**
	 * Returns the value of the '<em><b>Type Casts</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.reference.CtTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Casts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Casts</em>' reference list.
	 * @see emf.spoon.reflect.code.CodePackage#getCtExpression_TypeCasts()
	 * @model type="emf.spoon.reflect.reference.CtTypeReference"
	 * @generated
	 */
	List getTypeCasts();

} // CtExpression