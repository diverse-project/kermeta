/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtLocalVariableReference.java,v 1.1 2007-04-05 12:52:08 barais Exp $
 */
package emf.spoon.reflect.reference;

import emf.spoon.reflect.code.CtLocalVariable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Local Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtLocalVariableReference()
 * @model
 * @generated
 */
public interface CtLocalVariableReference extends CtVariableReference, spoon.reflect.reference.CtLocalVariableReference {

	CtLocalVariable getDeclaration();
} // CtLocalVariableReference