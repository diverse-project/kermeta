/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.language.behavior.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorFactoryImpl extends EFactoryImpl implements BehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorFactory init() {
		try {
			BehaviorFactory theBehaviorFactory = (BehaviorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/kermeta/2_1_0//org/kermeta/language/behavior"); 
			if (theBehaviorFactory != null) {
				return theBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactoryImpl() {
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
			case BehaviorPackage.ASSIGNMENT: return createAssignment();
			case BehaviorPackage.BLOCK: return createBlock();
			case BehaviorPackage.CALL_VARIABLE: return createCallVariable();
			case BehaviorPackage.CALL_FEATURE: return createCallFeature();
			case BehaviorPackage.CALL_SUPER_OPERATION: return createCallSuperOperation();
			case BehaviorPackage.CALL_RESULT: return createCallResult();
			case BehaviorPackage.CALL_VALUE: return createCallValue();
			case BehaviorPackage.CONDITIONAL: return createConditional();
			case BehaviorPackage.RAISE: return createRaise();
			case BehaviorPackage.RESCUE: return createRescue();
			case BehaviorPackage.TYPE_REFERENCE: return createTypeReference();
			case BehaviorPackage.EMPTY_EXPRESSION: return createEmptyExpression();
			case BehaviorPackage.JAVA_STATIC_CALL: return createJavaStaticCall();
			case BehaviorPackage.LAMBDA_EXPRESSION: return createLambdaExpression();
			case BehaviorPackage.LAMBDA_PARAMETER: return createLambdaParameter();
			case BehaviorPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case BehaviorPackage.STRING_LITERAL: return createStringLiteral();
			case BehaviorPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case BehaviorPackage.CALL_TYPE_LITERAL: return createCallTypeLiteral();
			case BehaviorPackage.VOID_LITERAL: return createVoidLiteral();
			case BehaviorPackage.LOOP: return createLoop();
			case BehaviorPackage.SELF_EXPRESSION: return createSelfExpression();
			case BehaviorPackage.VARIABLE_DECL: return createVariableDecl();
			case BehaviorPackage.UNRESOLVED_CALL: return createUnresolvedCall();
			case BehaviorPackage.CALL_OPERATION: return createCallOperation();
			case BehaviorPackage.CALL_PROPERTY: return createCallProperty();
			case BehaviorPackage.CALL_ENUM_LITERAL: return createCallEnumLiteral();
			case BehaviorPackage.CALL_MODEL_TRANSFORMATION: return createCallModelTransformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallVariable createCallVariable() {
		CallVariableImpl callVariable = new CallVariableImpl();
		return callVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallFeature createCallFeature() {
		CallFeatureImpl callFeature = new CallFeatureImpl();
		return callFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallSuperOperation createCallSuperOperation() {
		CallSuperOperationImpl callSuperOperation = new CallSuperOperationImpl();
		return callSuperOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallResult createCallResult() {
		CallResultImpl callResult = new CallResultImpl();
		return callResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallValue createCallValue() {
		CallValueImpl callValue = new CallValueImpl();
		return callValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditional createConditional() {
		ConditionalImpl conditional = new ConditionalImpl();
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Raise createRaise() {
		RaiseImpl raise = new RaiseImpl();
		return raise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rescue createRescue() {
		RescueImpl rescue = new RescueImpl();
		return rescue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference createTypeReference() {
		TypeReferenceImpl typeReference = new TypeReferenceImpl();
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyExpression createEmptyExpression() {
		EmptyExpressionImpl emptyExpression = new EmptyExpressionImpl();
		return emptyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaStaticCall createJavaStaticCall() {
		JavaStaticCallImpl javaStaticCall = new JavaStaticCallImpl();
		return javaStaticCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaExpression createLambdaExpression() {
		LambdaExpressionImpl lambdaExpression = new LambdaExpressionImpl();
		return lambdaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaParameter createLambdaParameter() {
		LambdaParameterImpl lambdaParameter = new LambdaParameterImpl();
		return lambdaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTypeLiteral createCallTypeLiteral() {
		CallTypeLiteralImpl callTypeLiteral = new CallTypeLiteralImpl();
		return callTypeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidLiteral createVoidLiteral() {
		VoidLiteralImpl voidLiteral = new VoidLiteralImpl();
		return voidLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfExpression createSelfExpression() {
		SelfExpressionImpl selfExpression = new SelfExpressionImpl();
		return selfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDecl createVariableDecl() {
		VariableDeclImpl variableDecl = new VariableDeclImpl();
		return variableDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedCall createUnresolvedCall() {
		UnresolvedCallImpl unresolvedCall = new UnresolvedCallImpl();
		return unresolvedCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperation createCallOperation() {
		CallOperationImpl callOperation = new CallOperationImpl();
		return callOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallProperty createCallProperty() {
		CallPropertyImpl callProperty = new CallPropertyImpl();
		return callProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallEnumLiteral createCallEnumLiteral() {
		CallEnumLiteralImpl callEnumLiteral = new CallEnumLiteralImpl();
		return callEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallModelTransformation createCallModelTransformation() {
		CallModelTransformationImpl callModelTransformation = new CallModelTransformationImpl();
		return callModelTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorPackage getBehaviorPackage() {
		return (BehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviorPackage getPackage() {
		return BehaviorPackage.eINSTANCE;
	}

} //BehaviorFactoryImpl
