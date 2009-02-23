/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: InterpreterFactory.java,v 1.12 2009-02-23 15:26:49 cfaucher Exp $
 */
package kermeta.interpreter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.interpreter.InterpreterPackage
 * @generated
 */
public interface InterpreterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterpreterFactory eINSTANCE = kermeta.interpreter.impl.InterpreterFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Dynamic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Expression</em>'.
	 * @generated
	 */
	DynamicExpression createDynamicExpression();

	/**
	 * Returns a new object of class '<em>Parse Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parse Error</em>'.
	 * @generated
	 */
	ParseError createParseError();

	/**
	 * Returns a new object of class '<em>Type Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Error</em>'.
	 * @generated
	 */
	TypeError createTypeError();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InterpreterPackage getInterpreterPackage();

} //InterpreterFactory
