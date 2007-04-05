/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtLocalVariable.java,v 1.1 2007-04-05 12:52:08 barais Exp $
 */
package emf.spoon.reflect.code;

import emf.spoon.reflect.reference.CtLocalVariableReference;
import emf.spoon.reflect.declaration.CtVariable;

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