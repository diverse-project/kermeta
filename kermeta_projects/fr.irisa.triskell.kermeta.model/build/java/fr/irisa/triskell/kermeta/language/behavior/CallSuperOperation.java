/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallSuperOperation.java,v 1.5 2008-02-14 07:13:03 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Super Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallSuperOperation()
 * @model annotation="GenModel documentation='/**\n * This class represents a call to the operataion in the parent class\n *\tIn the following example, the type of super(element) is CallSuperOperation:\n *\n * class ParentClass {\n *   operation op(element : Integer) : Integer is do\n *       result := element + 1\n *   end\n * }\n *\n * class ChildClass {\n *   method op(element : Integer) : Integer is do\n *       result := super(element)\n *   end\n * }\n \052/'"
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