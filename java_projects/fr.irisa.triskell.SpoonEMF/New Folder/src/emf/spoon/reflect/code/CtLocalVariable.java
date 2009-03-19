/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtLocalVariable.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import emf.spoon.reflect.declaration.CtVariable;
import emf.spoon.reflect.reference.CtLocalVariableReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtLocalVariable()
 * @model
 * @generated
 */
public interface CtLocalVariable extends CtStatement, CtVariable, spoon.reflect.code.CtLocalVariable {
	CtLocalVariableReference getReference();
} // CtLocalVariable