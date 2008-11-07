/**
 * <copyright>
 * </copyright>
 *
 * $Id: BehaviorFactory.java,v 1.8 2008-11-07 08:52:24 cfaucher Exp $
 */
package kermeta.language.behavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.language.behavior.BehaviorPackage
 * @generated
 */
public interface BehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorFactory eINSTANCE = kermeta.language.behavior.impl.BehaviorFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Call Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Variable</em>'.
	 * @generated
	 */
	CallVariable createCallVariable();

	/**
	 * Returns a new object of class '<em>Call Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Feature</em>'.
	 * @generated
	 */
	CallFeature createCallFeature();

	/**
	 * Returns a new object of class '<em>Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Expression</em>'.
	 * @generated
	 */
	CallExpression createCallExpression();

	/**
	 * Returns a new object of class '<em>Call Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Result</em>'.
	 * @generated
	 */
	CallResult createCallResult();

	/**
	 * Returns a new object of class '<em>Call Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Value</em>'.
	 * @generated
	 */
	CallValue createCallValue();

	/**
	 * Returns a new object of class '<em>Call Super Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Super Operation</em>'.
	 * @generated
	 */
	CallSuperOperation createCallSuperOperation();

	/**
	 * Returns a new object of class '<em>Variable Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Decl</em>'.
	 * @generated
	 */
	VariableDecl createVariableDecl();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Lambda Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda Expression</em>'.
	 * @generated
	 */
	LambdaExpression createLambdaExpression();

	/**
	 * Returns a new object of class '<em>Lambda Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda Parameter</em>'.
	 * @generated
	 */
	LambdaParameter createLambdaParameter();

	/**
	 * Returns a new object of class '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Reference</em>'.
	 * @generated
	 */
	TypeReference createTypeReference();

	/**
	 * Returns a new object of class '<em>Raise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raise</em>'.
	 * @generated
	 */
	Raise createRaise();

	/**
	 * Returns a new object of class '<em>Rescue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rescue</em>'.
	 * @generated
	 */
	Rescue createRescue();

	/**
	 * Returns a new object of class '<em>Self Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Expression</em>'.
	 * @generated
	 */
	SelfExpression createSelfExpression();

	/**
	 * Returns a new object of class '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional</em>'.
	 * @generated
	 */
	Conditional createConditional();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns a new object of class '<em>Java Static Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Static Call</em>'.
	 * @generated
	 */
	JavaStaticCall createJavaStaticCall();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Literal</em>'.
	 * @generated
	 */
	IntegerLiteral createIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Type Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Literal</em>'.
	 * @generated
	 */
	TypeLiteral createTypeLiteral();

	/**
	 * Returns a new object of class '<em>Void Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void Literal</em>'.
	 * @generated
	 */
	VoidLiteral createVoidLiteral();

	/**
	 * Returns a new object of class '<em>Empty Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Expression</em>'.
	 * @generated
	 */
	EmptyExpression createEmptyExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviorPackage getBehaviorPackage();

} //BehaviorFactory
