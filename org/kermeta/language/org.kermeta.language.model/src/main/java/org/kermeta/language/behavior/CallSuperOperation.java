/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Super Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a call to the operataion in the parent class
 * 	In the following example, the type of super(element) is CallSuperOperation:
 * 
 * class ParentClass {
 *   operation op(element : Integer) : Integer is do
 *       result := element + 1
 *   end
 * }
 *  *
 * class ChildClass {
 *   method op(element : Integer) : Integer is do
 *       result := super(element)
 *   end
 * }
 * <!-- end-model-doc -->
 *
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getCallSuperOperation()
 * @model
 * @generated
 */
public interface CallSuperOperation extends CallExpression {
} // CallSuperOperation
