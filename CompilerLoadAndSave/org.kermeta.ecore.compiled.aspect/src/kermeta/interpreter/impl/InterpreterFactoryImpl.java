/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterpreterFactoryImpl.java,v 1.1 2008-07-02 09:43:59 ftanguy Exp $
 */
package kermeta.interpreter.impl;

import kermeta.interpreter.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterpreterFactoryImpl extends EFactoryImpl implements InterpreterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterpreterFactory init() {
		try {
			InterpreterFactory theInterpreterFactory = (InterpreterFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/kermeta/interpreter"); 
			if (theInterpreterFactory != null) {
				return theInterpreterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterpreterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpreterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InterpreterPackage.DYNAMIC_EXPRESSION: return createDynamicExpression();
			case InterpreterPackage.PARSE_ERROR: return createParseError();
			case InterpreterPackage.TYPE_ERROR: return createTypeError();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicExpression createDynamicExpression() {
		DynamicExpressionImpl dynamicExpression = new DynamicExpressionImpl();
		return dynamicExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParseError createParseError() {
		ParseErrorImpl parseError = new ParseErrorImpl();
		return parseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeError createTypeError() {
		TypeErrorImpl typeError = new TypeErrorImpl();
		return typeError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpreterPackage getInterpreterPackage() {
		return (InterpreterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterpreterPackage getPackage() {
		return InterpreterPackage.eINSTANCE;
	}

} //InterpreterFactoryImpl
