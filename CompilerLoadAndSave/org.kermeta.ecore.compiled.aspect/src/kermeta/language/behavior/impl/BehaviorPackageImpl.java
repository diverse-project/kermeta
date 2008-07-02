/**
 * <copyright>
 * </copyright>
 *
 * $Id: BehaviorPackageImpl.java,v 1.1 2008-07-02 09:43:46 ftanguy Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.KermetaPackage;

import kermeta.ecore.impl.EcorePackageImpl;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.exceptions.impl.ExceptionsPackageImpl;

import kermeta.impl.KermetaPackageImpl;

import kermeta.interpreter.InterpreterPackage;

import kermeta.interpreter.impl.InterpreterPackageImpl;

import kermeta.io.IoPackage;

import kermeta.io.impl.IoPackageImpl;

import kermeta.kunit.KunitPackage;

import kermeta.kunit.impl.KunitPackageImpl;

import kermeta.language.LanguagePackage;

import kermeta.language.behavior.Assignment;
import kermeta.language.behavior.BehaviorFactory;
import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Block;
import kermeta.language.behavior.BooleanLiteral;
import kermeta.language.behavior.CallExpression;
import kermeta.language.behavior.CallFeature;
import kermeta.language.behavior.CallResult;
import kermeta.language.behavior.CallSuperOperation;
import kermeta.language.behavior.CallValue;
import kermeta.language.behavior.CallVariable;
import kermeta.language.behavior.Conditional;
import kermeta.language.behavior.EmptyExpression;
import kermeta.language.behavior.Expression;
import kermeta.language.behavior.IntegerLiteral;
import kermeta.language.behavior.JavaStaticCall;
import kermeta.language.behavior.LambdaExpression;
import kermeta.language.behavior.LambdaParameter;
import kermeta.language.behavior.Literal;
import kermeta.language.behavior.Loop;
import kermeta.language.behavior.Raise;
import kermeta.language.behavior.Rescue;
import kermeta.language.behavior.SelfExpression;
import kermeta.language.behavior.StringLiteral;
import kermeta.language.behavior.TypeLiteral;
import kermeta.language.behavior.TypeReference;
import kermeta.language.behavior.VariableDecl;
import kermeta.language.behavior.VoidLiteral;

import kermeta.language.impl.LanguagePackageImpl;

import kermeta.language.structure.StructurePackage;

import kermeta.language.structure.impl.StructurePackageImpl;

import kermeta.persistence.PersistencePackage;

import kermeta.persistence.impl.PersistencePackageImpl;

import kermeta.standard.StandardPackage;

import kermeta.standard.impl.StandardPackageImpl;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorPackageImpl extends EPackageImpl implements BehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callSuperOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaStaticCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see kermeta.language.behavior.BehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviorPackageImpl() {
		super(eNS_URI, BehaviorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviorPackage init() {
		if (isInited) return (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Obtain or create and register package
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new BehaviorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) : KermetaPackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KunitPackage.eNS_URI) : KunitPackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI) : UtilsPackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) : PersistencePackage.eINSTANCE);
		StandardPackageImpl theStandardPackage = (StandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI) : StandardPackage.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) : ExceptionsPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage_1 = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(kermeta.ecore.EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(kermeta.ecore.EcorePackage.eNS_URI) : kermeta.ecore.EcorePackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterpreterPackage.eNS_URI) : InterpreterPackage.eINSTANCE);

		// Create package meta-data objects
		theBehaviorPackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theInterpreterPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviorPackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theInterpreterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviorPackage.freeze();

		return theBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallExpression() {
		return callExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallExpression_StaticTypeVariableBindings() {
		return (EReference)callExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallExpression_Name() {
		return (EAttribute)callExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallExpression_Parameters() {
		return (EReference)callExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_StaticType() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallVariable() {
		return callVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallVariable_IsAtpre() {
		return (EAttribute)callVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallFeature() {
		return callFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallFeature_IsAtpre() {
		return (EAttribute)callFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallFeature_StaticOperation() {
		return (EReference)callFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallFeature_Target() {
		return (EReference)callFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallFeature_StaticEnumLiteral() {
		return (EReference)callFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallFeature_StaticProperty() {
		return (EReference)callFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallSuperOperation() {
		return callSuperOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallResult() {
		return callResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallValue() {
		return callValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Target() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Value() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_IsCast() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Statement() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_RescueBlock() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditional() {
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_ThenBody() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_Condition() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_ElseBody() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaise() {
		return raiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRaise_Expression() {
		return (EReference)raiseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescue() {
		return rescueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRescue_ExceptionName() {
		return (EAttribute)rescueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescue_Body() {
		return (EReference)rescueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescue_ExceptionType() {
		return (EReference)rescueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyExpression() {
		return emptyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaStaticCall() {
		return javaStaticCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaStaticCall_Jmethod() {
		return (EAttribute)javaStaticCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaStaticCall_Jclass() {
		return (EAttribute)javaStaticCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaStaticCall_Parameters() {
		return (EReference)javaStaticCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLambdaExpression() {
		return lambdaExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaExpression_Body() {
		return (EReference)lambdaExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaExpression_Parameters() {
		return (EReference)lambdaExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLambdaParameter() {
		return lambdaParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLambdaParameter_Name() {
		return (EAttribute)lambdaParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaParameter_Type() {
		return (EReference)lambdaParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLiteral() {
		return integerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLiteral_Value() {
		return (EAttribute)integerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_Value() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteral_Value() {
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeLiteral() {
		return typeLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeLiteral_Typeref() {
		return (EReference)typeLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidLiteral() {
		return voidLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Initialization() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Body() {
		return (EReference)loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_StopCondition() {
		return (EReference)loopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfExpression() {
		return selfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDecl() {
		return variableDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDecl_Initialization() {
		return (EReference)variableDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDecl_Type() {
		return (EReference)variableDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDecl_Identifier() {
		return (EAttribute)variableDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactory getBehaviorFactory() {
		return (BehaviorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		callExpressionEClass = createEClass(CALL_EXPRESSION);
		createEReference(callExpressionEClass, CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS);
		createEAttribute(callExpressionEClass, CALL_EXPRESSION__NAME);
		createEReference(callExpressionEClass, CALL_EXPRESSION__PARAMETERS);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__STATIC_TYPE);

		callVariableEClass = createEClass(CALL_VARIABLE);
		createEAttribute(callVariableEClass, CALL_VARIABLE__IS_ATPRE);

		callFeatureEClass = createEClass(CALL_FEATURE);
		createEAttribute(callFeatureEClass, CALL_FEATURE__IS_ATPRE);
		createEReference(callFeatureEClass, CALL_FEATURE__STATIC_OPERATION);
		createEReference(callFeatureEClass, CALL_FEATURE__TARGET);
		createEReference(callFeatureEClass, CALL_FEATURE__STATIC_ENUM_LITERAL);
		createEReference(callFeatureEClass, CALL_FEATURE__STATIC_PROPERTY);

		callSuperOperationEClass = createEClass(CALL_SUPER_OPERATION);

		callResultEClass = createEClass(CALL_RESULT);

		callValueEClass = createEClass(CALL_VALUE);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__TARGET);
		createEReference(assignmentEClass, ASSIGNMENT__VALUE);
		createEAttribute(assignmentEClass, ASSIGNMENT__IS_CAST);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__STATEMENT);
		createEReference(blockEClass, BLOCK__RESCUE_BLOCK);

		conditionalEClass = createEClass(CONDITIONAL);
		createEReference(conditionalEClass, CONDITIONAL__THEN_BODY);
		createEReference(conditionalEClass, CONDITIONAL__CONDITION);
		createEReference(conditionalEClass, CONDITIONAL__ELSE_BODY);

		raiseEClass = createEClass(RAISE);
		createEReference(raiseEClass, RAISE__EXPRESSION);

		rescueEClass = createEClass(RESCUE);
		createEAttribute(rescueEClass, RESCUE__EXCEPTION_NAME);
		createEReference(rescueEClass, RESCUE__BODY);
		createEReference(rescueEClass, RESCUE__EXCEPTION_TYPE);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);

		literalEClass = createEClass(LITERAL);

		emptyExpressionEClass = createEClass(EMPTY_EXPRESSION);

		javaStaticCallEClass = createEClass(JAVA_STATIC_CALL);
		createEAttribute(javaStaticCallEClass, JAVA_STATIC_CALL__JMETHOD);
		createEAttribute(javaStaticCallEClass, JAVA_STATIC_CALL__JCLASS);
		createEReference(javaStaticCallEClass, JAVA_STATIC_CALL__PARAMETERS);

		lambdaExpressionEClass = createEClass(LAMBDA_EXPRESSION);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__BODY);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__PARAMETERS);

		lambdaParameterEClass = createEClass(LAMBDA_PARAMETER);
		createEAttribute(lambdaParameterEClass, LAMBDA_PARAMETER__NAME);
		createEReference(lambdaParameterEClass, LAMBDA_PARAMETER__TYPE);

		integerLiteralEClass = createEClass(INTEGER_LITERAL);
		createEAttribute(integerLiteralEClass, INTEGER_LITERAL__VALUE);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		typeLiteralEClass = createEClass(TYPE_LITERAL);
		createEReference(typeLiteralEClass, TYPE_LITERAL__TYPEREF);

		voidLiteralEClass = createEClass(VOID_LITERAL);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__INITIALIZATION);
		createEReference(loopEClass, LOOP__BODY);
		createEReference(loopEClass, LOOP__STOP_CONDITION);

		selfExpressionEClass = createEClass(SELF_EXPRESSION);

		variableDeclEClass = createEClass(VARIABLE_DECL);
		createEReference(variableDeclEClass, VARIABLE_DECL__INITIALIZATION);
		createEReference(variableDeclEClass, VARIABLE_DECL__TYPE);
		createEAttribute(variableDeclEClass, VARIABLE_DECL__IDENTIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callExpressionEClass.getESuperTypes().add(this.getExpression());
		expressionEClass.getESuperTypes().add(theStructurePackage.getTypeContainer());
		callVariableEClass.getESuperTypes().add(this.getCallExpression());
		callFeatureEClass.getESuperTypes().add(this.getCallExpression());
		callSuperOperationEClass.getESuperTypes().add(this.getCallExpression());
		callResultEClass.getESuperTypes().add(this.getCallVariable());
		callValueEClass.getESuperTypes().add(this.getCallExpression());
		assignmentEClass.getESuperTypes().add(this.getExpression());
		blockEClass.getESuperTypes().add(this.getExpression());
		conditionalEClass.getESuperTypes().add(this.getExpression());
		raiseEClass.getESuperTypes().add(this.getExpression());
		rescueEClass.getESuperTypes().add(theStructurePackage.getObject());
		typeReferenceEClass.getESuperTypes().add(theStructurePackage.getMultiplicityElement());
		literalEClass.getESuperTypes().add(this.getExpression());
		emptyExpressionEClass.getESuperTypes().add(this.getExpression());
		javaStaticCallEClass.getESuperTypes().add(this.getExpression());
		lambdaExpressionEClass.getESuperTypes().add(this.getExpression());
		lambdaParameterEClass.getESuperTypes().add(theStructurePackage.getObject());
		integerLiteralEClass.getESuperTypes().add(this.getLiteral());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
		typeLiteralEClass.getESuperTypes().add(this.getLiteral());
		voidLiteralEClass.getESuperTypes().add(this.getLiteral());
		loopEClass.getESuperTypes().add(this.getExpression());
		selfExpressionEClass.getESuperTypes().add(this.getExpression());
		variableDeclEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(callExpressionEClass, CallExpression.class, "CallExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallExpression_StaticTypeVariableBindings(), theStructurePackage.getType(), null, "staticTypeVariableBindings", null, 0, -1, CallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallExpression_Name(), theStandardPackage.getString(), "name", null, 0, 1, CallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallExpression_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, CallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_StaticType(), theStructurePackage.getType(), null, "staticType", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callVariableEClass, CallVariable.class, "CallVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallVariable_IsAtpre(), theStandardPackage.getBoolean(), "isAtpre", null, 0, 1, CallVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callFeatureEClass, CallFeature.class, "CallFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallFeature_IsAtpre(), theStandardPackage.getBoolean(), "isAtpre", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallFeature_StaticOperation(), theStructurePackage.getOperation(), null, "staticOperation", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallFeature_Target(), this.getExpression(), null, "target", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallFeature_StaticEnumLiteral(), theStructurePackage.getEnumerationLiteral(), null, "staticEnumLiteral", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallFeature_StaticProperty(), theStructurePackage.getProperty(), null, "staticProperty", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callSuperOperationEClass, CallSuperOperation.class, "CallSuperOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callResultEClass, CallResult.class, "CallResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callValueEClass, CallValue.class, "CallValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Target(), this.getCallExpression(), null, "target", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Value(), this.getExpression(), null, "value", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_IsCast(), theStandardPackage.getBoolean(), "isCast", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Statement(), this.getExpression(), null, "statement", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_RescueBlock(), this.getRescue(), null, "rescueBlock", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditional_ThenBody(), this.getExpression(), null, "thenBody", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditional_Condition(), this.getExpression(), null, "condition", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditional_ElseBody(), this.getExpression(), null, "elseBody", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(raiseEClass, Raise.class, "Raise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRaise_Expression(), this.getExpression(), null, "expression", null, 1, 1, Raise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rescueEClass, Rescue.class, "Rescue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRescue_ExceptionName(), theStandardPackage.getString(), "exceptionName", null, 0, 1, Rescue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescue_Body(), this.getExpression(), null, "body", null, 1, -1, Rescue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescue_ExceptionType(), this.getTypeReference(), null, "exceptionType", null, 1, 1, Rescue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emptyExpressionEClass, EmptyExpression.class, "EmptyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaStaticCallEClass, JavaStaticCall.class, "JavaStaticCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaStaticCall_Jmethod(), theStandardPackage.getString(), "jmethod", null, 0, 1, JavaStaticCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaStaticCall_Jclass(), theStandardPackage.getString(), "jclass", null, 0, 1, JavaStaticCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaStaticCall_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, JavaStaticCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaExpressionEClass, LambdaExpression.class, "LambdaExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLambdaExpression_Body(), this.getExpression(), null, "body", null, 1, 1, LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambdaExpression_Parameters(), this.getLambdaParameter(), null, "parameters", null, 0, -1, LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaParameterEClass, LambdaParameter.class, "LambdaParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLambdaParameter_Name(), theStandardPackage.getString(), "name", null, 0, 1, LambdaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambdaParameter_Type(), this.getTypeReference(), null, "type", null, 1, 1, LambdaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteral_Value(), theStandardPackage.getInteger(), "value", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), theStandardPackage.getString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), theStandardPackage.getBoolean(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeLiteralEClass, TypeLiteral.class, "TypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeLiteral_Typeref(), this.getTypeReference(), null, "typeref", null, 1, 1, TypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voidLiteralEClass, VoidLiteral.class, "VoidLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Initialization(), this.getExpression(), null, "initialization", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_Body(), this.getExpression(), null, "body", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_StopCondition(), this.getExpression(), null, "stopCondition", null, 1, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selfExpressionEClass, SelfExpression.class, "SelfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDeclEClass, VariableDecl.class, "VariableDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDecl_Initialization(), this.getExpression(), null, "initialization", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDecl_Type(), this.getTypeReference(), null, "type", null, 1, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDecl_Identifier(), theStandardPackage.getString(), "identifier", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// kermeta
		createKermetaAnnotations();
	}

	/**
	 * Initializes the annotations for <b>kermeta</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermetaAnnotations() {
		String source = "kermeta";		
		addAnnotation
		  (callExpressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "Any callable expression inherits this class, e.g : \n  - variable call\n  - feature call ( <code>a.b</code> : b is a feature call)\n\n<img alt=\"\"  height=\"90%\" width=\"90%\"  src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_call_expressions.png\" />"
		   });		
		addAnnotation
		  (getCallExpression_StaticTypeVariableBindings(), 
		   source, 
		   new String[] {
			 "documentation", "To be written"
		   });		
		addAnnotation
		  (getCallExpression_Name(), 
		   source, 
		   new String[] {
			 "documentation", "A call must be named"
		   });		
		addAnnotation
		  (getCallExpression_Parameters(), 
		   source, 
		   new String[] {
			 "documentation", "Kermeta calls can embedd expressions as parameters"
		   });		
		addAnnotation
		  (expressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "The base class for every entity used to define a behavior in operation body."
		   });		
		addAnnotation
		  (getExpression_StaticType(), 
		   source, 
		   new String[] {
			 "documentation", "Type of the Expression (set by type checking)"
		   });		
		addAnnotation
		  (callVariableEClass, 
		   source, 
		   new String[] {
			 "documentation", "We call \"CallVariable\" the use of a variable in a statement.\nin <code>i := j + 1</code>, i and j are 2 CallVariables."
		   });		
		addAnnotation
		  (getCallVariable_IsAtpre(), 
		   source, 
		   new String[] {
			 "documentation", "Tells whether this CallVariable represents a call to @pre in a postcondition"
		   });		
		addAnnotation
		  (callFeatureEClass, 
		   source, 
		   new String[] {
			 "documentation", "CallFeature is the model element that refers to the use of a feature, i.e either \na property or an operation in a statement. In <code>stdio.writeln(\"hello\")</code>, \n<code>writeln</code> is a CallFeature."
		   });		
		addAnnotation
		  (getCallFeature_IsAtpre(), 
		   source, 
		   new String[] {
			 "documentation", "Tells whether this CallFeature represents a call to @pre in a postcondition"
		   });		
		addAnnotation
		  (getCallFeature_StaticOperation(), 
		   source, 
		   new String[] {
			 "documentation", "The method which will be executed (operation case)\nand the result value passed to the caller"
		   });		
		addAnnotation
		  (getCallFeature_Target(), 
		   source, 
		   new String[] {
			 "documentation", "Target Expression (the owner of the feature)"
		   });		
		addAnnotation
		  (getCallFeature_StaticEnumLiteral(), 
		   source, 
		   new String[] {
			 "documentation", "To be written"
		   });		
		addAnnotation
		  (getCallFeature_StaticProperty(), 
		   source, 
		   new String[] {
			 "documentation", "The object which will be returned (property case)"
		   });		
		addAnnotation
		  (callSuperOperationEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a call to the operataion in the parent class\n\tIn the following example, the type of super(element) is CallSuperOperation:\n\nclass ParentClass {\n  operation op(element : Integer) : Integer is do\n      result := element + 1\n  end\n}\n *\nclass ChildClass {\n  method op(element : Integer) : Integer is do\n      result := super(element)\n  end\n}"
		   });		
		addAnnotation
		  (callResultEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a call to the special internal variable \"result\" that is used to store the return value of any operation "
		   });		
		addAnnotation
		  (callValueEClass, 
		   source, 
		   new String[] {
			 "documentation", "CallValue refers to the use of the <code>value</code> reserved keyword. This keyword is\nonly used in the body of the <code>setter</code> part of derived properties."
		   });		
		addAnnotation
		  (assignmentEClass, 
		   source, 
		   new String[] {
			 "documentation", "Assignment is the model-element representation of the assignment statement <code>x := y</code>\n<img alt=\"\" src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_assign_expressions.png\"/>"
		   });		
		addAnnotation
		  (getAssignment_Target(), 
		   source, 
		   new String[] {
			 "documentation", "Target of the assignment, as a CallExpression"
		   });		
		addAnnotation
		  (getAssignment_Value(), 
		   source, 
		   new String[] {
			 "documentation", "Value to be assigned, as a KerMeta expression"
		   });		
		addAnnotation
		  (getAssignment_IsCast(), 
		   source, 
		   new String[] {
			 "documentation", "Boolean stating whether current assignment corresponds to a cast operation "
		   });		
		addAnnotation
		  (blockEClass, 
		   source, 
		   new String[] {
			 "documentation", "Block is the model-element representation for the <code>do...end</code> block."
		   });		
		addAnnotation
		  (getBlock_Statement(), 
		   source, 
		   new String[] {
			 "documentation", "List of statements composing the block"
		   });		
		addAnnotation
		  (getBlock_RescueBlock(), 
		   source, 
		   new String[] {
			 "documentation", "List of rescues defined for the block"
		   });		
		addAnnotation
		  (conditionalEClass, 
		   source, 
		   new String[] {
			 "documentation", "Condition is the model-element representation for the <code></code> "
		   });		
		addAnnotation
		  (getConditional_ThenBody(), 
		   source, 
		   new String[] {
			 "documentation", "Then part of the conditional statement"
		   });		
		addAnnotation
		  (getConditional_Condition(), 
		   source, 
		   new String[] {
			 "documentation", "Condition expression of conditional statement"
		   });		
		addAnnotation
		  (getConditional_ElseBody(), 
		   source, 
		   new String[] {
			 "documentation", "Optional else part of the conditional statement"
		   });		
		addAnnotation
		  (raiseEClass, 
		   source, 
		   new String[] {
			 "documentation", "Refers to raise exception block"
		   });		
		addAnnotation
		  (getRaise_Expression(), 
		   source, 
		   new String[] {
			 "documentation", "To be written #######################"
		   });		
		addAnnotation
		  (rescueEClass, 
		   source, 
		   new String[] {
			 "documentation", "Refers to rescue exception block"
		   });		
		addAnnotation
		  (getRescue_ExceptionName(), 
		   source, 
		   new String[] {
			 "documentation", "Name of the catched exception"
		   });		
		addAnnotation
		  (getRescue_Body(), 
		   source, 
		   new String[] {
			 "documentation", "Body of the rescue block, specified as a KerMeta expression"
		   });		
		addAnnotation
		  (getRescue_ExceptionType(), 
		   source, 
		   new String[] {
			 "documentation", "Type of the cathed exception"
		   });		
		addAnnotation
		  (typeReferenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "TypeReference refers to the type used in a variable declaration"
		   });		
		addAnnotation
		  (literalEClass, 
		   source, 
		   new String[] {
			 "documentation", "Literal refers to String values, Integer values, etc."
		   });		
		addAnnotation
		  (emptyExpressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "As suggested by its name, this class represents an expression that do nothing. Like a \"nop\""
		   });		
		addAnnotation
		  (javaStaticCallEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represent a call to an extern Java operation. \nThis Java operation must be static and have at least one RuntimeO"
		   });		
		addAnnotation
		  (getJavaStaticCall_Jmethod(), 
		   source, 
		   new String[] {
			 "documentation", "Name of the Java method to be launched in the identified Java class"
		   });		
		addAnnotation
		  (getJavaStaticCall_Jclass(), 
		   source, 
		   new String[] {
			 "documentation", "Qualified name of the targeted Java class"
		   });		
		addAnnotation
		  (getJavaStaticCall_Parameters(), 
		   source, 
		   new String[] {
			 "documentation", "Parameters of the Java static call provided as KerMeta expressions"
		   });		
		addAnnotation
		  (lambdaExpressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "Refers to lambda expression definition (<code>function { e | stdio.writeln(e.toString) }</code>)\n<img alt=\"\" src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_lambda_expressions.png\"/>"
		   });		
		addAnnotation
		  (getLambdaExpression_Body(), 
		   source, 
		   new String[] {
			 "documentation", "Body of the lambda expression providede as a KerMeta expression"
		   });		
		addAnnotation
		  (getLambdaExpression_Parameters(), 
		   source, 
		   new String[] {
			 "documentation", "Parameters of the lambda expression"
		   });		
		addAnnotation
		  (lambdaParameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "Refers to parameter definition in lambda expression"
		   });		
		addAnnotation
		  (getLambdaParameter_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Name of the lambda parameter"
		   });		
		addAnnotation
		  (getLambdaParameter_Type(), 
		   source, 
		   new String[] {
			 "documentation", "To be written ################################"
		   });		
		addAnnotation
		  (integerLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "This expression is a literal representing an Integer value"
		   });		
		addAnnotation
		  (getIntegerLiteral_Value(), 
		   source, 
		   new String[] {
			 "documentation", "The concrete value represented by this literal"
		   });		
		addAnnotation
		  (stringLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "This expression is a literal representing a String value, typically : \"my string\""
		   });		
		addAnnotation
		  (getStringLiteral_Value(), 
		   source, 
		   new String[] {
			 "documentation", "The concrete value represented by this literal"
		   });		
		addAnnotation
		  (booleanLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "This expression is a literal representing a Boolean value, typically : true or false keyword"
		   });		
		addAnnotation
		  (getBooleanLiteral_Value(), 
		   source, 
		   new String[] {
			 "documentation", "The concrete value represented by this literal"
		   });		
		addAnnotation
		  (typeLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "This expression is a literal representing a Type.\nfor example, in \n   Integer.new\nInteger is a type literal representing the type kermeta::standard::Integer"
		   });		
		addAnnotation
		  (getTypeLiteral_Typeref(), 
		   source, 
		   new String[] {
			 "documentation", "The type refered by this literal"
		   });		
		addAnnotation
		  (voidLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is used to represent the special expression void"
		   });		
		addAnnotation
		  (loopEClass, 
		   source, 
		   new String[] {
			 "documentation", "Loop refers to <code>from var x : X init a until booleanCondition loop ... end</code>"
		   });		
		addAnnotation
		  (getLoop_Initialization(), 
		   source, 
		   new String[] {
			 "documentation", "Initialization expression for the loop"
		   });		
		addAnnotation
		  (getLoop_Body(), 
		   source, 
		   new String[] {
			 "documentation", "Body of the loop"
		   });		
		addAnnotation
		  (getLoop_StopCondition(), 
		   source, 
		   new String[] {
			 "documentation", "Stop condition of the loop, is interpreted as a Bollean value"
		   });		
		addAnnotation
		  (selfExpressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "Refers to <code>self</code> use"
		   });		
		addAnnotation
		  (variableDeclEClass, 
		   source, 
		   new String[] {
			 "documentation", "refers to variable declaration <code>var x : X init a</code>\n<img alt=\"\" src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_var_expressions.png\"/>"
		   });		
		addAnnotation
		  (getVariableDecl_Initialization(), 
		   source, 
		   new String[] {
			 "documentation", "Initialization expression for the variable\nDefault value is <code>void</code> ????"
		   });		
		addAnnotation
		  (getVariableDecl_Type(), 
		   source, 
		   new String[] {
			 "documentation", "Type of the declared variable"
		   });		
		addAnnotation
		  (getVariableDecl_Identifier(), 
		   source, 
		   new String[] {
			 "documentation", "Initialization expression for the variable\nDefault value is <code>void</code> ????"
		   });
	}

} //BehaviorPackageImpl
