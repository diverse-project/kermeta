/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallSuperOperation.java,v 1.6 2008-03-19 16:34:13 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


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
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallSuperOperation()
 * @model
 * @generated
 */
public interface CallSuperOperation extends CallExpression {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";
} // CallSuperOperation