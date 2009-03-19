/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtFieldAccess.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import emf.spoon.reflect.reference.CtFieldReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Field Access</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtFieldAccess()
 * @model
 * @generated
 */
public interface CtFieldAccess extends CtTargetedExpression, CtVariableAccess, spoon.reflect.code.CtFieldAccess {
	CtFieldReference getVariable();

} // CtFieldAccess