/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Super Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.behavior.BehaviorPackage#getCallSuperOperation()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='This class represents a call to the operataion in the parent class\n\tIn the following example, the type of super(element) is CallSuperOperation:\n\nclass ParentClass {\n  operation op(element : Integer) : Integer is do\n      result := element + 1\n  end\n}\n *\nclass ChildClass {\n  method op(element : Integer) : Integer is do\n      result := super(element)\n  end\n}'"
 * @generated
 */
public interface CallSuperOperation extends CallExpression {
} // CallSuperOperation
