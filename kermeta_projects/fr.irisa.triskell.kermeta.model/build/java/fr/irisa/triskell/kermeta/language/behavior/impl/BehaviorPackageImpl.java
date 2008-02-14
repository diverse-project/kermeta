/**
 * <copyright>
 * </copyright>
 *
 * $Id: BehaviorPackageImpl.java,v 1.12 2008-02-14 07:13:01 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.impl;

import fr.irisa.triskell.kermeta.KmPackage;

import fr.irisa.triskell.kermeta.impl.KmPackageImpl;

import fr.irisa.triskell.kermeta.language.LanguagePackage;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.CallValue;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.EmptyExpression;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.language.behavior.Literal;
import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.language.behavior.Raise;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.language.behavior.StringLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.behavior.VoidLiteral;

import fr.irisa.triskell.kermeta.language.impl.LanguagePackageImpl;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	private EClass expressionEClass = null;

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
	private EClass typeReferenceEClass = null;

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
	private EClass callExpressionEClass = null;

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
	private EClass blockEClass = null;

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
	private EClass assignmentEClass = null;

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
	private EClass variableDeclEClass = null;

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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#eNS_URI
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

		// Obtain or create and register interdependencies
		KmPackageImpl theKmPackage = (KmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KmPackage.eNS_URI) instanceof KmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KmPackage.eNS_URI) : KmPackage.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);

		// Create package meta-data objects
		theBehaviorPackage.createPackageContents();
		theKmPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();

		// Initialize created meta-data
		theBehaviorPackage.initializePackageContents();
		theKmPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviorPackage.freeze();

		return theBehaviorPackage;
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
	public EReference getConditional_ElseBody() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_Condition() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(2);
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
	public EClass getLambdaExpression() {
		return lambdaExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaExpression_Parameters() {
		return (EReference)lambdaExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaExpression_Body() {
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
	public EClass getTypeReference() {
		return typeReferenceEClass;
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
	public EReference getCallFeature_StaticProperty() {
		return (EReference)callFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallFeature_StaticOperation() {
		return (EReference)callFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallFeature_StaticEnumLiteral() {
		return (EReference)callFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallFeature_Target() {
		return (EReference)callFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallFeature_IsAtpre() {
		return (EAttribute)callFeatureEClass.getEStructuralFeatures().get(1);
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
		return (EReference)callExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallExpression_Parameters() {
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
	public EReference getRescue_Body() {
		return (EReference)rescueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescue_ExceptionType() {
		return (EReference)rescueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRescue_ExceptionName() {
		return (EAttribute)rescueEClass.getEStructuralFeatures().get(2);
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
	public EReference getBlock_RescueBlock() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
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
	public EClass getJavaStaticCall() {
		return javaStaticCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaStaticCall_Parameters() {
		return (EReference)javaStaticCallEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getJavaStaticCall_Jmethod() {
		return (EAttribute)javaStaticCallEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getVariableDecl_Identifier() {
		return (EAttribute)variableDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDecl_Type() {
		return (EReference)variableDeclEClass.getEStructuralFeatures().get(2);
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
		createEReference(callExpressionEClass, CALL_EXPRESSION__PARAMETERS);
		createEAttribute(callExpressionEClass, CALL_EXPRESSION__NAME);
		createEReference(callExpressionEClass, CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__STATIC_TYPE);

		callVariableEClass = createEClass(CALL_VARIABLE);
		createEAttribute(callVariableEClass, CALL_VARIABLE__IS_ATPRE);

		callFeatureEClass = createEClass(CALL_FEATURE);
		createEReference(callFeatureEClass, CALL_FEATURE__TARGET);
		createEAttribute(callFeatureEClass, CALL_FEATURE__IS_ATPRE);
		createEReference(callFeatureEClass, CALL_FEATURE__STATIC_PROPERTY);
		createEReference(callFeatureEClass, CALL_FEATURE__STATIC_OPERATION);
		createEReference(callFeatureEClass, CALL_FEATURE__STATIC_ENUM_LITERAL);

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
		createEReference(conditionalEClass, CONDITIONAL__ELSE_BODY);
		createEReference(conditionalEClass, CONDITIONAL__CONDITION);

		raiseEClass = createEClass(RAISE);
		createEReference(raiseEClass, RAISE__EXPRESSION);

		rescueEClass = createEClass(RESCUE);
		createEReference(rescueEClass, RESCUE__BODY);
		createEReference(rescueEClass, RESCUE__EXCEPTION_TYPE);
		createEAttribute(rescueEClass, RESCUE__EXCEPTION_NAME);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);

		literalEClass = createEClass(LITERAL);

		emptyExpressionEClass = createEClass(EMPTY_EXPRESSION);

		javaStaticCallEClass = createEClass(JAVA_STATIC_CALL);
		createEReference(javaStaticCallEClass, JAVA_STATIC_CALL__PARAMETERS);
		createEAttribute(javaStaticCallEClass, JAVA_STATIC_CALL__JCLASS);
		createEAttribute(javaStaticCallEClass, JAVA_STATIC_CALL__JMETHOD);

		lambdaExpressionEClass = createEClass(LAMBDA_EXPRESSION);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__PARAMETERS);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__BODY);

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
		createEAttribute(variableDeclEClass, VARIABLE_DECL__IDENTIFIER);
		createEReference(variableDeclEClass, VARIABLE_DECL__TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callExpressionEClass.getESuperTypes().add(this.getExpression());
		expressionEClass.getESuperTypes().add(theStructurePackage.getTypeContainer());
		expressionEClass.getESuperTypes().add(theStructurePackage.getObject());
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
		initEReference(getCallExpression_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, CallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallExpression_Name(), theStructurePackage.getString(), "name", null, 0, 1, CallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallExpression_StaticTypeVariableBindings(), theStructurePackage.getType(), null, "staticTypeVariableBindings", null, 0, -1, CallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_StaticType(), theStructurePackage.getType(), null, "staticType", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callVariableEClass, CallVariable.class, "CallVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallVariable_IsAtpre(), theStructurePackage.getBoolean(), "isAtpre", null, 0, 1, CallVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callFeatureEClass, CallFeature.class, "CallFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallFeature_Target(), this.getExpression(), null, "target", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallFeature_IsAtpre(), theStructurePackage.getBoolean(), "isAtpre", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallFeature_StaticProperty(), theStructurePackage.getProperty(), null, "staticProperty", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallFeature_StaticOperation(), theStructurePackage.getOperation(), null, "staticOperation", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallFeature_StaticEnumLiteral(), theStructurePackage.getEnumerationLiteral(), null, "staticEnumLiteral", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callSuperOperationEClass, CallSuperOperation.class, "CallSuperOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callResultEClass, CallResult.class, "CallResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callValueEClass, CallValue.class, "CallValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Target(), this.getCallExpression(), null, "target", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Value(), this.getExpression(), null, "value", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_IsCast(), theStructurePackage.getBoolean(), "isCast", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Statement(), this.getExpression(), null, "statement", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_RescueBlock(), this.getRescue(), null, "rescueBlock", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditional_ThenBody(), this.getExpression(), null, "thenBody", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditional_ElseBody(), this.getExpression(), null, "elseBody", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditional_Condition(), this.getExpression(), null, "condition", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(raiseEClass, Raise.class, "Raise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRaise_Expression(), this.getExpression(), null, "expression", null, 1, 1, Raise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rescueEClass, Rescue.class, "Rescue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRescue_Body(), this.getExpression(), null, "body", null, 1, -1, Rescue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescue_ExceptionType(), this.getTypeReference(), null, "exceptionType", null, 1, 1, Rescue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRescue_ExceptionName(), theStructurePackage.getString(), "exceptionName", null, 0, 1, Rescue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emptyExpressionEClass, EmptyExpression.class, "EmptyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaStaticCallEClass, JavaStaticCall.class, "JavaStaticCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaStaticCall_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, JavaStaticCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaStaticCall_Jclass(), theStructurePackage.getString(), "jclass", null, 0, 1, JavaStaticCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaStaticCall_Jmethod(), theStructurePackage.getString(), "jmethod", null, 0, 1, JavaStaticCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaExpressionEClass, LambdaExpression.class, "LambdaExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLambdaExpression_Parameters(), this.getLambdaParameter(), null, "parameters", null, 0, -1, LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambdaExpression_Body(), this.getExpression(), null, "body", null, 1, 1, LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaParameterEClass, LambdaParameter.class, "LambdaParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLambdaParameter_Name(), theStructurePackage.getString(), "name", null, 0, 1, LambdaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambdaParameter_Type(), this.getTypeReference(), null, "type", null, 1, 1, LambdaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteral_Value(), theStructurePackage.getInteger(), "value", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), theStructurePackage.getString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), theStructurePackage.getBoolean(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeLiteralEClass, TypeLiteral.class, "TypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeLiteral_Typeref(), this.getTypeReference(), null, "typeref", null, 1, 1, TypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voidLiteralEClass, VoidLiteral.class, "VoidLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Initialization(), this.getExpression(), null, "initialization", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_Body(), this.getExpression(), null, "body", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_StopCondition(), this.getExpression(), null, "stopCondition", null, 1, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selfExpressionEClass, SelfExpression.class, "SelfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDeclEClass, VariableDecl.class, "VariableDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDecl_Initialization(), this.getExpression(), null, "initialization", null, 1, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDecl_Identifier(), theStructurePackage.getString(), "identifier", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDecl_Type(), this.getTypeReference(), null, "type", null, 1, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "GenModel";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Contains all the classes that define the behavior of Kermeta (i.e the model representation\n * of operation bodies). It is the definition, in kermeta language, of the behavior part of the kermeta \n * metamodel, viewed as a model.\n * You can also find some information about the behavior package here : <a href=\"http://www.kermeta.org/documents/manual/html.single\">KermetaManual</a>\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/language_behavior_package.png\">\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/language_behavior_visitable_package.png\">\n */"
		   });		
		addAnnotation
		  (callExpressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Any callable expression inherits this class, e.g : \n *   - variable call\n *   - feature call ( <code>a.b</code> : b is a feature call)\n *\n * <img alt=\"\"  height=\"90%\" width=\"90%\"  src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_call_expressions.png\" />\n *\n */"
		   });		
		addAnnotation
		  (getCallExpression_Parameters(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Kermeta calls can embedd expressions as parameters\n */"
		   });		
		addAnnotation
		  (getCallExpression_Name(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * A call must be named\n */"
		   });		
		addAnnotation
		  (getCallExpression_StaticTypeVariableBindings(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * to be written #########################################\n */"
		   });		
		addAnnotation
		  (getExpression_StaticType(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Type of the Expression (set by type checking)\n */"
		   });		
		addAnnotation
		  (callVariableEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * We call \"CallVariable\" the use of a variable in a statement.\n * in <code>i := j + 1</code>, i and j are 2 CallVariables.\n */"
		   });		
		addAnnotation
		  (getCallVariable_IsAtpre(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Tells whether this CallVariable represents a call to @pre in a postcondition\n */"
		   });		
		addAnnotation
		  (callFeatureEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * CallFeature is the model element that refers to the use of a feature, i.e either \n * a property or an operation in a statement. In <code>stdio.writeln(\"hello\")</code>, \n * <code>writeln</code> is a CallFeature.\n */"
		   });		
		addAnnotation
		  (getCallFeature_Target(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Target Expression (the owner of the feature)\n */"
		   });		
		addAnnotation
		  (getCallFeature_IsAtpre(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Tells whether this CallFeature represents a call to @pre in a postcondition\n */"
		   });		
		addAnnotation
		  (getCallFeature_StaticProperty(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * The object which will be returned (property case)\n */"
		   });		
		addAnnotation
		  (getCallFeature_StaticOperation(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * The method which will be executed (operation case)\n * and the result value passed to the caller\n */"
		   });		
		addAnnotation
		  (getCallFeature_StaticEnumLiteral(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #################################\n */"
		   });		
		addAnnotation
		  (callSuperOperationEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * This class represents a call to the operataion in the parent class\n *\tIn the following example, the type of super(element) is CallSuperOperation:\n *\n * class ParentClass {\n *   operation op(element : Integer) : Integer is do\n *       result := element + 1\n *   end\n * }\n *\n * class ChildClass {\n *   method op(element : Integer) : Integer is do\n *       result := super(element)\n *   end\n * }\n */"
		   });		
		addAnnotation
		  (callResultEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * This class represents a call to the special internal variable \"result\" that is used to store the return value of any operation \n */"
		   });		
		addAnnotation
		  (callValueEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * CallValue refers to the use of the <code>value</code> reserved keyword. This keyword is\n * only used in the body of the <code>setter</code> part of derived properties.\n */"
		   });		
		addAnnotation
		  (assignmentEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Assignment is the model-element representation of the assignment statement <code>x := y</code>\n * <img alt=\"\" src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_assign_expressions.png\"/>\n */"
		   });		
		addAnnotation
		  (getAssignment_Target(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Target of the assignment, as a CallExpression\n */"
		   });		
		addAnnotation
		  (getAssignment_Value(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Value to be assigned, as a KerMeta expression\n */"
		   });		
		addAnnotation
		  (getAssignment_IsCast(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Boolean stating whether current assignment corresponds to a cast operation \n */"
		   });		
		addAnnotation
		  (blockEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Block is the model-element representation for the <code>do...end</code> block.\n */"
		   });		
		addAnnotation
		  (getBlock_Statement(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * List of statements composing the block\n */"
		   });		
		addAnnotation
		  (getBlock_RescueBlock(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * List of rescues defined for the block\n */"
		   });		
		addAnnotation
		  (conditionalEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Condition is the model-element representation for the <code></code> \n */"
		   });		
		addAnnotation
		  (getConditional_ThenBody(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Then part of the conditional statement\n */"
		   });		
		addAnnotation
		  (getConditional_ElseBody(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Optional else part of the conditional statement\n */"
		   });		
		addAnnotation
		  (getConditional_Condition(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Condition expression of conditional statement\n */"
		   });		
		addAnnotation
		  (raiseEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Refers to raise exception block\n */"
		   });		
		addAnnotation
		  (getRaise_Expression(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #######################\n */"
		   });		
		addAnnotation
		  (rescueEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Refers to rescue exception block\n */"
		   });		
		addAnnotation
		  (getRescue_Body(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Body of the rescue block, specified as a KerMeta expression\n */"
		   });		
		addAnnotation
		  (getRescue_ExceptionType(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Type of the cathed exception\n */"
		   });		
		addAnnotation
		  (getRescue_ExceptionName(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Name of the catched exception\n */"
		   });		
		addAnnotation
		  (literalEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Literal refers to String values, Integer values, etc.\n */"
		   });		
		addAnnotation
		  (emptyExpressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * As suggested by its name, this class represents an expression that do nothing. Like a \"nop\"\n */"
		   });		
		addAnnotation
		  (javaStaticCallEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * This class represent a call to an extern Java operation. \n * This Java operation must be static and have at least one RuntimeO\n */"
		   });		
		addAnnotation
		  (getJavaStaticCall_Parameters(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Parameters of the Java static call provided as KerMeta expressions\n */"
		   });		
		addAnnotation
		  (getJavaStaticCall_Jclass(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Qualified name of the targeted Java class\n */"
		   });		
		addAnnotation
		  (getJavaStaticCall_Jmethod(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Name of the Java method to be launched in the identified Java class\n */"
		   });		
		addAnnotation
		  (lambdaExpressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Refers to lambda expression definition (<code>function { e | stdio.writeln(e.toString) }</code>)\n * <img alt=\"\" src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_lambda_expressions.png\"/>\n */"
		   });		
		addAnnotation
		  (getLambdaExpression_Parameters(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Parameters of the lambda expression\n */"
		   });		
		addAnnotation
		  (getLambdaExpression_Body(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Body of the lambda expression providede as a KerMeta expression\n */"
		   });		
		addAnnotation
		  (lambdaParameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Refers to parameter definition in lambda expression\n */"
		   });		
		addAnnotation
		  (getLambdaParameter_Name(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Name of the lambda parameter\n */"
		   });		
		addAnnotation
		  (getLambdaParameter_Type(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written ################################\n */"
		   });		
		addAnnotation
		  (integerLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * This expression is a literal representing an Integer value\n */"
		   });		
		addAnnotation
		  (getIntegerLiteral_Value(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * The concrete value represented by this literal\n */"
		   });		
		addAnnotation
		  (stringLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * This expression is a literal representing a String value, typically : \"my string\"\n */"
		   });		
		addAnnotation
		  (getStringLiteral_Value(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * The concrete value represented by this literal\n */"
		   });		
		addAnnotation
		  (booleanLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * This expression is a literal representing a Boolean value, typically : true or false keyword\n */"
		   });		
		addAnnotation
		  (getBooleanLiteral_Value(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * The concrete value represented by this literal\n */"
		   });		
		addAnnotation
		  (typeLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * This expression is a literal representing a Type.\n * for example, in \n *    Integer.new\n * Integer is a type literal representing the type kermeta::standard::Integer\n */"
		   });		
		addAnnotation
		  (getTypeLiteral_Typeref(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * The type refered by this literal\n */"
		   });		
		addAnnotation
		  (voidLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * This class is used to represent the special expression void\n */"
		   });		
		addAnnotation
		  (loopEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Loop refers to <code>from var x : X init a until booleanCondition loop ... end</code>\n */"
		   });		
		addAnnotation
		  (getLoop_Initialization(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Initialization expression for the loop\n */"
		   });		
		addAnnotation
		  (getLoop_Body(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Body of the loop\n */"
		   });		
		addAnnotation
		  (getLoop_StopCondition(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Stop condition of the loop, is interpreted as a Bollean value\n */"
		   });		
		addAnnotation
		  (selfExpressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Refers to <code>self</code> use\n */"
		   });		
		addAnnotation
		  (variableDeclEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * refers to variable declaration <code>var x : X init a</code>\n * <img alt=\"\" src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_var_expressions.png\"/>\n */"
		   });		
		addAnnotation
		  (getVariableDecl_Initialization(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Initialization expression for the variable\n * Default value is <code>void</code> ????\n */"
		   });		
		addAnnotation
		  (getVariableDecl_Identifier(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Initialization expression for the variable\n * Default value is <code>void</code> ????\n */"
		   });		
		addAnnotation
		  (getVariableDecl_Type(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Type of the declared variable\n */"
		   });
	}

} //BehaviorPackageImpl
