/**
 * <copyright>
 * </copyright>
 *
 * $Id: CodePackageImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import emf.spoon.SpoonPackage;
import emf.spoon.facade.FacadePackage;
import emf.spoon.facade.impl.FacadePackageImpl;
import emf.spoon.impl.SpoonPackageImpl;
import emf.spoon.reflect.code.CodeFactory;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtAbstractInvocation;
import emf.spoon.reflect.code.CtArrayAccess;
import emf.spoon.reflect.code.CtAssert;
import emf.spoon.reflect.code.CtAssignment;
import emf.spoon.reflect.code.CtBinaryOperator;
import emf.spoon.reflect.code.CtBlock;
import emf.spoon.reflect.code.CtBreak;
import emf.spoon.reflect.code.CtCFlowBreak;
import emf.spoon.reflect.code.CtCase;
import emf.spoon.reflect.code.CtCatch;
import emf.spoon.reflect.code.CtCodeElement;
import emf.spoon.reflect.code.CtConditional;
import emf.spoon.reflect.code.CtContinue;
import emf.spoon.reflect.code.CtDo;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtFieldAccess;
import emf.spoon.reflect.code.CtFor;
import emf.spoon.reflect.code.CtForEach;
import emf.spoon.reflect.code.CtIf;
import emf.spoon.reflect.code.CtInvocation;
import emf.spoon.reflect.code.CtLiteral;
import emf.spoon.reflect.code.CtLocalVariable;
import emf.spoon.reflect.code.CtLoop;
import emf.spoon.reflect.code.CtNewArray;
import emf.spoon.reflect.code.CtNewClass;
import emf.spoon.reflect.code.CtOperatorAssignment;
import emf.spoon.reflect.code.CtReturn;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.code.CtStatementList;
import emf.spoon.reflect.code.CtSwitch;
import emf.spoon.reflect.code.CtSynchronized;
import emf.spoon.reflect.code.CtTargetedExpression;
import emf.spoon.reflect.code.CtThrow;
import emf.spoon.reflect.code.CtTry;
import emf.spoon.reflect.code.CtUnaryOperator;
import emf.spoon.reflect.code.CtVariableAccess;
import emf.spoon.reflect.code.CtWhile;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.impl.DeclarationPackageImpl;
import emf.spoon.reflect.reference.ReferencePackage;
import emf.spoon.reflect.reference.impl.ReferencePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodePackageImpl extends EPackageImpl implements CodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctAbstractInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctArrayAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctAssertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctBinaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctBreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctCFlowBreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctCatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctCodeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctConditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctContinueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctDoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctFieldAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctForEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctForEachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctLocalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctNewArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctNewClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctOperatorAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctStatementListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctSynchronizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctTargetedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctThrowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctTryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctUnaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctVariableAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctWhileEClass = null;

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
	 * @see emf.spoon.reflect.code.CodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodePackageImpl() {
		super(eNS_URI, CodeFactory.eINSTANCE);
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
	public static CodePackage init() {
		if (isInited) return (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

		// Obtain or create and register package
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CodePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SpoonPackageImpl theSpoonPackage = (SpoonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI) instanceof SpoonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI) : SpoonPackage.eINSTANCE);
		ReferencePackageImpl theReferencePackage = (ReferencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI) instanceof ReferencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI) : ReferencePackage.eINSTANCE);
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) : DeclarationPackage.eINSTANCE);
		FacadePackageImpl theFacadePackage = (FacadePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) instanceof FacadePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) : FacadePackage.eINSTANCE);

		// Create package meta-data objects
		theCodePackage.createPackageContents();
		theSpoonPackage.createPackageContents();
		theReferencePackage.createPackageContents();
		theDeclarationPackage.createPackageContents();
		theFacadePackage.createPackageContents();

		// Initialize created meta-data
		theCodePackage.initializePackageContents();
		theSpoonPackage.initializePackageContents();
		theReferencePackage.initializePackageContents();
		theDeclarationPackage.initializePackageContents();
		theFacadePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodePackage.freeze();

		return theCodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtAbstractInvocation() {
		return ctAbstractInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAbstractInvocation_Executable() {
		return (EReference)ctAbstractInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAbstractInvocation_Arguments() {
		return (EReference)ctAbstractInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtArrayAccess() {
		return ctArrayAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtArrayAccess_IndexExpression() {
		return (EReference)ctArrayAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtAssert() {
		return ctAssertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAssert_Expression() {
		return (EReference)ctAssertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAssert_AssertExpression() {
		return (EReference)ctAssertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtAssignment() {
		return ctAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAssignment_Assignment() {
		return (EReference)ctAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAssignment_Assigned() {
		return (EReference)ctAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtBinaryOperator() {
		return ctBinaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtBinaryOperator_Kind() {
		return (EAttribute)ctBinaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtBinaryOperator_RightHandOperand() {
		return (EReference)ctBinaryOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtBinaryOperator_LeftHandOperand() {
		return (EReference)ctBinaryOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtBlock() {
		return ctBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtBlock_Statements() {
		return (EReference)ctBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtBreak() {
		return ctBreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtBreak_LabelledStatement() {
		return (EReference)ctBreakEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtCFlowBreak() {
		return ctCFlowBreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtCase() {
		return ctCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtCase_CaseExpression() {
		return (EReference)ctCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtCase_Statements() {
		return (EReference)ctCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtCatch() {
		return ctCatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtCatch_Body() {
		return (EReference)ctCatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtCatch_Parameter() {
		return (EReference)ctCatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtCodeElement() {
		return ctCodeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtConditional() {
		return ctConditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtConditional_ElseExpression() {
		return (EReference)ctConditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtConditional_Condition() {
		return (EReference)ctConditionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtConditional_ThenExpression() {
		return (EReference)ctConditionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtContinue() {
		return ctContinueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtContinue_LabelledStatement() {
		return (EReference)ctContinueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtDo() {
		return ctDoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtDo_LoopingExpression() {
		return (EReference)ctDoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtFieldAccess() {
		return ctFieldAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtFor() {
		return ctForEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtFor_ForInit() {
		return (EReference)ctForEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtFor_ForUpdate() {
		return (EReference)ctForEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtFor_Expression() {
		return (EReference)ctForEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtExpression() {
		return ctExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtExpression_TypeCasts() {
		return (EReference)ctExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtForEach() {
		return ctForEachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtForEach_Expression() {
		return (EReference)ctForEachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtForEach_Variable() {
		return (EReference)ctForEachEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtIf() {
		return ctIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtIf_ThenStatement() {
		return (EReference)ctIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtIf_Condition() {
		return (EReference)ctIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtIf_ElseStatement() {
		return (EReference)ctIfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtInvocation() {
		return ctInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtLiteral() {
		return ctLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtLiteral_Value() {
		return (EAttribute)ctLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtLocalVariable() {
		return ctLocalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtLoop() {
		return ctLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtLoop_Body() {
		return (EReference)ctLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtNewArray() {
		return ctNewArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtNewArray_DimensionExpressions() {
		return (EReference)ctNewArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtNewArray_Elements() {
		return (EReference)ctNewArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtNewClass() {
		return ctNewClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtNewClass_AnonymousClass() {
		return (EReference)ctNewClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtOperatorAssignment() {
		return ctOperatorAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtOperatorAssignment_Kind() {
		return (EAttribute)ctOperatorAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtReturn() {
		return ctReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtReturn_ReturnedExpression() {
		return (EReference)ctReturnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtStatement() {
		return ctStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtStatement_Label() {
		return (EAttribute)ctStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtStatementList() {
		return ctStatementListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtStatementList_Statements() {
		return (EReference)ctStatementListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtSwitch() {
		return ctSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtSwitch_Selector() {
		return (EReference)ctSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtSwitch_Cases() {
		return (EReference)ctSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtSynchronized() {
		return ctSynchronizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtSynchronized_Block() {
		return (EReference)ctSynchronizedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtSynchronized_Expression() {
		return (EReference)ctSynchronizedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtTargetedExpression() {
		return ctTargetedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtTargetedExpression_Target() {
		return (EReference)ctTargetedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtThrow() {
		return ctThrowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtThrow_ThrownExpression() {
		return (EReference)ctThrowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtTry() {
		return ctTryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtTry_Finalizer() {
		return (EReference)ctTryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtTry_Body() {
		return (EReference)ctTryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtTry_Catchers() {
		return (EReference)ctTryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtUnaryOperator() {
		return ctUnaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtUnaryOperator_Operand() {
		return (EReference)ctUnaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtUnaryOperator_Kind() {
		return (EAttribute)ctUnaryOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtVariableAccess() {
		return ctVariableAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtVariableAccess_Variable() {
		return (EReference)ctVariableAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtWhile() {
		return ctWhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtWhile_LoopingExpression() {
		return (EReference)ctWhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFactory getCodeFactory() {
		return (CodeFactory)getEFactoryInstance();
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
		ctAbstractInvocationEClass = createEClass(CT_ABSTRACT_INVOCATION);
		createEReference(ctAbstractInvocationEClass, CT_ABSTRACT_INVOCATION__EXECUTABLE);
		createEReference(ctAbstractInvocationEClass, CT_ABSTRACT_INVOCATION__ARGUMENTS);

		ctArrayAccessEClass = createEClass(CT_ARRAY_ACCESS);
		createEReference(ctArrayAccessEClass, CT_ARRAY_ACCESS__INDEX_EXPRESSION);

		ctAssertEClass = createEClass(CT_ASSERT);
		createEReference(ctAssertEClass, CT_ASSERT__EXPRESSION);
		createEReference(ctAssertEClass, CT_ASSERT__ASSERT_EXPRESSION);

		ctAssignmentEClass = createEClass(CT_ASSIGNMENT);
		createEReference(ctAssignmentEClass, CT_ASSIGNMENT__ASSIGNMENT);
		createEReference(ctAssignmentEClass, CT_ASSIGNMENT__ASSIGNED);

		ctBinaryOperatorEClass = createEClass(CT_BINARY_OPERATOR);
		createEAttribute(ctBinaryOperatorEClass, CT_BINARY_OPERATOR__KIND);
		createEReference(ctBinaryOperatorEClass, CT_BINARY_OPERATOR__RIGHT_HAND_OPERAND);
		createEReference(ctBinaryOperatorEClass, CT_BINARY_OPERATOR__LEFT_HAND_OPERAND);

		ctBlockEClass = createEClass(CT_BLOCK);
		createEReference(ctBlockEClass, CT_BLOCK__STATEMENTS);

		ctBreakEClass = createEClass(CT_BREAK);
		createEReference(ctBreakEClass, CT_BREAK__LABELLED_STATEMENT);

		ctCFlowBreakEClass = createEClass(CT_CFLOW_BREAK);

		ctCaseEClass = createEClass(CT_CASE);
		createEReference(ctCaseEClass, CT_CASE__CASE_EXPRESSION);
		createEReference(ctCaseEClass, CT_CASE__STATEMENTS);

		ctCatchEClass = createEClass(CT_CATCH);
		createEReference(ctCatchEClass, CT_CATCH__BODY);
		createEReference(ctCatchEClass, CT_CATCH__PARAMETER);

		ctCodeElementEClass = createEClass(CT_CODE_ELEMENT);

		ctConditionalEClass = createEClass(CT_CONDITIONAL);
		createEReference(ctConditionalEClass, CT_CONDITIONAL__ELSE_EXPRESSION);
		createEReference(ctConditionalEClass, CT_CONDITIONAL__CONDITION);
		createEReference(ctConditionalEClass, CT_CONDITIONAL__THEN_EXPRESSION);

		ctContinueEClass = createEClass(CT_CONTINUE);
		createEReference(ctContinueEClass, CT_CONTINUE__LABELLED_STATEMENT);

		ctDoEClass = createEClass(CT_DO);
		createEReference(ctDoEClass, CT_DO__LOOPING_EXPRESSION);

		ctFieldAccessEClass = createEClass(CT_FIELD_ACCESS);

		ctForEClass = createEClass(CT_FOR);
		createEReference(ctForEClass, CT_FOR__FOR_INIT);
		createEReference(ctForEClass, CT_FOR__FOR_UPDATE);
		createEReference(ctForEClass, CT_FOR__EXPRESSION);

		ctExpressionEClass = createEClass(CT_EXPRESSION);
		createEReference(ctExpressionEClass, CT_EXPRESSION__TYPE_CASTS);

		ctForEachEClass = createEClass(CT_FOR_EACH);
		createEReference(ctForEachEClass, CT_FOR_EACH__EXPRESSION);
		createEReference(ctForEachEClass, CT_FOR_EACH__VARIABLE);

		ctIfEClass = createEClass(CT_IF);
		createEReference(ctIfEClass, CT_IF__THEN_STATEMENT);
		createEReference(ctIfEClass, CT_IF__CONDITION);
		createEReference(ctIfEClass, CT_IF__ELSE_STATEMENT);

		ctInvocationEClass = createEClass(CT_INVOCATION);

		ctLiteralEClass = createEClass(CT_LITERAL);
		createEAttribute(ctLiteralEClass, CT_LITERAL__VALUE);

		ctLocalVariableEClass = createEClass(CT_LOCAL_VARIABLE);

		ctLoopEClass = createEClass(CT_LOOP);
		createEReference(ctLoopEClass, CT_LOOP__BODY);

		ctNewArrayEClass = createEClass(CT_NEW_ARRAY);
		createEReference(ctNewArrayEClass, CT_NEW_ARRAY__DIMENSION_EXPRESSIONS);
		createEReference(ctNewArrayEClass, CT_NEW_ARRAY__ELEMENTS);

		ctNewClassEClass = createEClass(CT_NEW_CLASS);
		createEReference(ctNewClassEClass, CT_NEW_CLASS__ANONYMOUS_CLASS);

		ctOperatorAssignmentEClass = createEClass(CT_OPERATOR_ASSIGNMENT);
		createEAttribute(ctOperatorAssignmentEClass, CT_OPERATOR_ASSIGNMENT__KIND);

		ctReturnEClass = createEClass(CT_RETURN);
		createEReference(ctReturnEClass, CT_RETURN__RETURNED_EXPRESSION);

		ctStatementEClass = createEClass(CT_STATEMENT);
		createEAttribute(ctStatementEClass, CT_STATEMENT__LABEL);

		ctStatementListEClass = createEClass(CT_STATEMENT_LIST);
		createEReference(ctStatementListEClass, CT_STATEMENT_LIST__STATEMENTS);

		ctSwitchEClass = createEClass(CT_SWITCH);
		createEReference(ctSwitchEClass, CT_SWITCH__SELECTOR);
		createEReference(ctSwitchEClass, CT_SWITCH__CASES);

		ctSynchronizedEClass = createEClass(CT_SYNCHRONIZED);
		createEReference(ctSynchronizedEClass, CT_SYNCHRONIZED__BLOCK);
		createEReference(ctSynchronizedEClass, CT_SYNCHRONIZED__EXPRESSION);

		ctTargetedExpressionEClass = createEClass(CT_TARGETED_EXPRESSION);
		createEReference(ctTargetedExpressionEClass, CT_TARGETED_EXPRESSION__TARGET);

		ctThrowEClass = createEClass(CT_THROW);
		createEReference(ctThrowEClass, CT_THROW__THROWN_EXPRESSION);

		ctTryEClass = createEClass(CT_TRY);
		createEReference(ctTryEClass, CT_TRY__FINALIZER);
		createEReference(ctTryEClass, CT_TRY__BODY);
		createEReference(ctTryEClass, CT_TRY__CATCHERS);

		ctUnaryOperatorEClass = createEClass(CT_UNARY_OPERATOR);
		createEReference(ctUnaryOperatorEClass, CT_UNARY_OPERATOR__OPERAND);
		createEAttribute(ctUnaryOperatorEClass, CT_UNARY_OPERATOR__KIND);

		ctVariableAccessEClass = createEClass(CT_VARIABLE_ACCESS);
		createEReference(ctVariableAccessEClass, CT_VARIABLE_ACCESS__VARIABLE);

		ctWhileEClass = createEClass(CT_WHILE);
		createEReference(ctWhileEClass, CT_WHILE__LOOPING_EXPRESSION);
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
		DeclarationPackage theDeclarationPackage = (DeclarationPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI);
		FacadePackage theFacadePackage = (FacadePackage)EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI);
		ReferencePackage theReferencePackage = (ReferencePackage)EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI);
		SpoonPackage theSpoonPackage = (SpoonPackage)EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI);

		// Add supertypes to classes
		ctAbstractInvocationEClass.getESuperTypes().add(theDeclarationPackage.getCtElement());
		ctAbstractInvocationEClass.getESuperTypes().add(theFacadePackage.getCtAbstractInvocation());
		ctArrayAccessEClass.getESuperTypes().add(this.getCtTargetedExpression());
		ctArrayAccessEClass.getESuperTypes().add(theFacadePackage.getCtArrayAccess());
		ctAssertEClass.getESuperTypes().add(this.getCtStatement());
		ctAssertEClass.getESuperTypes().add(theFacadePackage.getCtAssert());
		ctAssignmentEClass.getESuperTypes().add(this.getCtExpression());
		ctAssignmentEClass.getESuperTypes().add(this.getCtStatement());
		ctAssignmentEClass.getESuperTypes().add(theFacadePackage.getCtAssignment());
		ctBinaryOperatorEClass.getESuperTypes().add(this.getCtExpression());
		ctBinaryOperatorEClass.getESuperTypes().add(theFacadePackage.getCtBinaryOperator());
		ctBlockEClass.getESuperTypes().add(this.getCtStatement());
		ctBlockEClass.getESuperTypes().add(theFacadePackage.getCtBlock());
		ctBreakEClass.getESuperTypes().add(this.getCtCFlowBreak());
		ctBreakEClass.getESuperTypes().add(theFacadePackage.getCtBreak());
		ctCFlowBreakEClass.getESuperTypes().add(this.getCtStatement());
		ctCFlowBreakEClass.getESuperTypes().add(theFacadePackage.getCtCFlowBreak());
		ctCaseEClass.getESuperTypes().add(this.getCtStatement());
		ctCaseEClass.getESuperTypes().add(theFacadePackage.getCtCase());
		ctCatchEClass.getESuperTypes().add(this.getCtCodeElement());
		ctCatchEClass.getESuperTypes().add(theFacadePackage.getCtCatch());
		ctCodeElementEClass.getESuperTypes().add(theDeclarationPackage.getCtElement());
		ctCodeElementEClass.getESuperTypes().add(theFacadePackage.getCtCodeElement());
		ctConditionalEClass.getESuperTypes().add(this.getCtExpression());
		ctConditionalEClass.getESuperTypes().add(theFacadePackage.getCtConditional());
		ctContinueEClass.getESuperTypes().add(this.getCtCFlowBreak());
		ctContinueEClass.getESuperTypes().add(theFacadePackage.getCtContinue());
		ctDoEClass.getESuperTypes().add(this.getCtLoop());
		ctDoEClass.getESuperTypes().add(theFacadePackage.getCtDo());
		ctFieldAccessEClass.getESuperTypes().add(this.getCtTargetedExpression());
		ctFieldAccessEClass.getESuperTypes().add(this.getCtVariableAccess());
		ctFieldAccessEClass.getESuperTypes().add(theFacadePackage.getCtFieldAccess());
		ctForEClass.getESuperTypes().add(this.getCtLoop());
		ctForEClass.getESuperTypes().add(theFacadePackage.getCtFor());
		ctExpressionEClass.getESuperTypes().add(this.getCtCodeElement());
		ctExpressionEClass.getESuperTypes().add(theDeclarationPackage.getCtTypedElement());
		ctExpressionEClass.getESuperTypes().add(theFacadePackage.getCtExpression());
		ctForEachEClass.getESuperTypes().add(this.getCtLoop());
		ctForEachEClass.getESuperTypes().add(theFacadePackage.getCtForEach());
		ctIfEClass.getESuperTypes().add(this.getCtStatement());
		ctIfEClass.getESuperTypes().add(theFacadePackage.getCtIf());
		ctInvocationEClass.getESuperTypes().add(this.getCtAbstractInvocation());
		ctInvocationEClass.getESuperTypes().add(this.getCtStatement());
		ctInvocationEClass.getESuperTypes().add(this.getCtTargetedExpression());
		ctInvocationEClass.getESuperTypes().add(theFacadePackage.getCtInvocation());
		ctLiteralEClass.getESuperTypes().add(this.getCtExpression());
		ctLiteralEClass.getESuperTypes().add(theFacadePackage.getCtLiteral());
		ctLocalVariableEClass.getESuperTypes().add(this.getCtStatement());
		ctLocalVariableEClass.getESuperTypes().add(theDeclarationPackage.getCtVariable());
		ctLocalVariableEClass.getESuperTypes().add(theFacadePackage.getCtLocalVariable());
		ctLoopEClass.getESuperTypes().add(this.getCtStatement());
		ctLoopEClass.getESuperTypes().add(theFacadePackage.getCtLoop());
		ctNewArrayEClass.getESuperTypes().add(this.getCtExpression());
		ctNewArrayEClass.getESuperTypes().add(theFacadePackage.getCtNewArray());
		ctNewClassEClass.getESuperTypes().add(this.getCtAbstractInvocation());
		ctNewClassEClass.getESuperTypes().add(this.getCtExpression());
		ctNewClassEClass.getESuperTypes().add(this.getCtStatement());
		ctNewClassEClass.getESuperTypes().add(theFacadePackage.getCtNewClass());
		ctOperatorAssignmentEClass.getESuperTypes().add(this.getCtAssignment());
		ctOperatorAssignmentEClass.getESuperTypes().add(theFacadePackage.getCtOperatorAssignment());
		ctReturnEClass.getESuperTypes().add(this.getCtCFlowBreak());
		ctReturnEClass.getESuperTypes().add(theFacadePackage.getCtReturn());
		ctStatementEClass.getESuperTypes().add(this.getCtCodeElement());
		ctStatementEClass.getESuperTypes().add(theFacadePackage.getCtStatement());
		ctStatementListEClass.getESuperTypes().add(this.getCtCodeElement());
		ctStatementListEClass.getESuperTypes().add(theFacadePackage.getCtStatementList());
		ctSwitchEClass.getESuperTypes().add(this.getCtStatement());
		ctSwitchEClass.getESuperTypes().add(theFacadePackage.getCtSwitch());
		ctSynchronizedEClass.getESuperTypes().add(this.getCtStatement());
		ctSynchronizedEClass.getESuperTypes().add(theFacadePackage.getCtSynchronized());
		ctTargetedExpressionEClass.getESuperTypes().add(this.getCtExpression());
		ctTargetedExpressionEClass.getESuperTypes().add(theFacadePackage.getCtTargetedExpression());
		ctThrowEClass.getESuperTypes().add(this.getCtCFlowBreak());
		ctThrowEClass.getESuperTypes().add(theFacadePackage.getCtThrow());
		ctTryEClass.getESuperTypes().add(this.getCtStatement());
		ctTryEClass.getESuperTypes().add(theFacadePackage.getCtTry());
		ctUnaryOperatorEClass.getESuperTypes().add(this.getCtExpression());
		ctUnaryOperatorEClass.getESuperTypes().add(this.getCtStatement());
		ctUnaryOperatorEClass.getESuperTypes().add(theFacadePackage.getCtUnaryOperator());
		ctVariableAccessEClass.getESuperTypes().add(this.getCtExpression());
		ctVariableAccessEClass.getESuperTypes().add(theFacadePackage.getCtVariableAccess());
		ctWhileEClass.getESuperTypes().add(this.getCtLoop());
		ctWhileEClass.getESuperTypes().add(theFacadePackage.getCtWhile());

		// Initialize classes and features; add operations and parameters
		initEClass(ctAbstractInvocationEClass, CtAbstractInvocation.class, "CtAbstractInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtAbstractInvocation_Executable(), theReferencePackage.getCtExecutableReference(), null, "Executable", null, 0, 1, CtAbstractInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtAbstractInvocation_Arguments(), this.getCtExpression(), null, "Arguments", null, 0, -1, CtAbstractInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctArrayAccessEClass, CtArrayAccess.class, "CtArrayAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtArrayAccess_IndexExpression(), this.getCtExpression(), null, "IndexExpression", null, 0, 1, CtArrayAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctAssertEClass, CtAssert.class, "CtAssert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtAssert_Expression(), this.getCtExpression(), null, "Expression", null, 0, 1, CtAssert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtAssert_AssertExpression(), this.getCtExpression(), null, "AssertExpression", null, 0, 1, CtAssert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctAssignmentEClass, CtAssignment.class, "CtAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtAssignment_Assignment(), this.getCtExpression(), null, "Assignment", null, 0, 1, CtAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtAssignment_Assigned(), this.getCtExpression(), null, "Assigned", null, 0, 1, CtAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctBinaryOperatorEClass, CtBinaryOperator.class, "CtBinaryOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtBinaryOperator_Kind(), theSpoonPackage.getBinaryOperatorKind(), "Kind", null, 0, 1, CtBinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtBinaryOperator_RightHandOperand(), this.getCtExpression(), null, "RightHandOperand", null, 0, 1, CtBinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtBinaryOperator_LeftHandOperand(), this.getCtExpression(), null, "LeftHandOperand", null, 0, 1, CtBinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctBlockEClass, CtBlock.class, "CtBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtBlock_Statements(), this.getCtStatement(), null, "Statements", null, 0, -1, CtBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctBreakEClass, CtBreak.class, "CtBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtBreak_LabelledStatement(), this.getCtStatement(), null, "LabelledStatement", null, 0, 1, CtBreak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctCFlowBreakEClass, CtCFlowBreak.class, "CtCFlowBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctCaseEClass, CtCase.class, "CtCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtCase_CaseExpression(), this.getCtExpression(), null, "CaseExpression", null, 0, 1, CtCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtCase_Statements(), this.getCtStatement(), null, "Statements", null, 0, -1, CtCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctCatchEClass, CtCatch.class, "CtCatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtCatch_Body(), this.getCtBlock(), null, "Body", null, 0, 1, CtCatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtCatch_Parameter(), this.getCtLocalVariable(), null, "Parameter", null, 0, 1, CtCatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctCodeElementEClass, CtCodeElement.class, "CtCodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctConditionalEClass, CtConditional.class, "CtConditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtConditional_ElseExpression(), this.getCtExpression(), null, "ElseExpression", null, 0, 1, CtConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtConditional_Condition(), this.getCtExpression(), null, "Condition", null, 0, 1, CtConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtConditional_ThenExpression(), this.getCtExpression(), null, "ThenExpression", null, 0, 1, CtConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctContinueEClass, CtContinue.class, "CtContinue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtContinue_LabelledStatement(), this.getCtStatement(), null, "LabelledStatement", null, 0, 1, CtContinue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctDoEClass, CtDo.class, "CtDo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtDo_LoopingExpression(), this.getCtExpression(), null, "LoopingExpression", null, 0, 1, CtDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctFieldAccessEClass, CtFieldAccess.class, "CtFieldAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctForEClass, CtFor.class, "CtFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtFor_ForInit(), this.getCtStatement(), null, "ForInit", null, 0, -1, CtFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtFor_ForUpdate(), this.getCtStatement(), null, "ForUpdate", null, 0, -1, CtFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtFor_Expression(), this.getCtExpression(), null, "Expression", null, 0, 1, CtFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctExpressionEClass, CtExpression.class, "CtExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtExpression_TypeCasts(), theReferencePackage.getCtTypeReference(), null, "TypeCasts", null, 0, -1, CtExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctForEachEClass, CtForEach.class, "CtForEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtForEach_Expression(), this.getCtExpression(), null, "Expression", null, 0, 1, CtForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtForEach_Variable(), this.getCtLocalVariable(), null, "Variable", null, 0, 1, CtForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctIfEClass, CtIf.class, "CtIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtIf_ThenStatement(), this.getCtStatement(), null, "ThenStatement", null, 0, 1, CtIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtIf_Condition(), this.getCtExpression(), null, "Condition", null, 0, 1, CtIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtIf_ElseStatement(), this.getCtStatement(), null, "ElseStatement", null, 0, 1, CtIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctInvocationEClass, CtInvocation.class, "CtInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctLiteralEClass, CtLiteral.class, "CtLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtLiteral_Value(), theSpoonPackage.getObject(), "Value", null, 0, 1, CtLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctLocalVariableEClass, CtLocalVariable.class, "CtLocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctLoopEClass, CtLoop.class, "CtLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtLoop_Body(), this.getCtStatement(), null, "Body", null, 0, 1, CtLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctNewArrayEClass, CtNewArray.class, "CtNewArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtNewArray_DimensionExpressions(), this.getCtExpression(), null, "DimensionExpressions", null, 0, -1, CtNewArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtNewArray_Elements(), this.getCtExpression(), null, "Elements", null, 0, -1, CtNewArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctNewClassEClass, CtNewClass.class, "CtNewClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtNewClass_AnonymousClass(), theDeclarationPackage.getCtClass(), null, "AnonymousClass", null, 0, 1, CtNewClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctOperatorAssignmentEClass, CtOperatorAssignment.class, "CtOperatorAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtOperatorAssignment_Kind(), theSpoonPackage.getBinaryOperatorKind(), "Kind", null, 0, 1, CtOperatorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctReturnEClass, CtReturn.class, "CtReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtReturn_ReturnedExpression(), this.getCtExpression(), null, "ReturnedExpression", null, 0, 1, CtReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctStatementEClass, CtStatement.class, "CtStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtStatement_Label(), theSpoonPackage.getString(), "Label", null, 0, 1, CtStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctStatementListEClass, CtStatementList.class, "CtStatementList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtStatementList_Statements(), this.getCtStatement(), null, "Statements", null, 0, -1, CtStatementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctSwitchEClass, CtSwitch.class, "CtSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtSwitch_Selector(), this.getCtExpression(), null, "Selector", null, 0, 1, CtSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtSwitch_Cases(), this.getCtCase(), null, "Cases", null, 0, -1, CtSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctSynchronizedEClass, CtSynchronized.class, "CtSynchronized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtSynchronized_Block(), this.getCtBlock(), null, "Block", null, 0, 1, CtSynchronized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtSynchronized_Expression(), this.getCtExpression(), null, "Expression", null, 0, 1, CtSynchronized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctTargetedExpressionEClass, CtTargetedExpression.class, "CtTargetedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtTargetedExpression_Target(), this.getCtExpression(), null, "Target", null, 0, 1, CtTargetedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctThrowEClass, CtThrow.class, "CtThrow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtThrow_ThrownExpression(), this.getCtExpression(), null, "ThrownExpression", null, 0, 1, CtThrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctTryEClass, CtTry.class, "CtTry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtTry_Finalizer(), this.getCtBlock(), null, "Finalizer", null, 0, 1, CtTry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtTry_Body(), this.getCtBlock(), null, "Body", null, 0, 1, CtTry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtTry_Catchers(), this.getCtCatch(), null, "Catchers", null, 0, -1, CtTry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctUnaryOperatorEClass, CtUnaryOperator.class, "CtUnaryOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtUnaryOperator_Operand(), this.getCtExpression(), null, "Operand", null, 0, 1, CtUnaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtUnaryOperator_Kind(), theSpoonPackage.getUnaryOperatorKind(), "Kind", null, 0, 1, CtUnaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctVariableAccessEClass, CtVariableAccess.class, "CtVariableAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtVariableAccess_Variable(), theReferencePackage.getCtVariableReference(), null, "Variable", null, 0, 1, CtVariableAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctWhileEClass, CtWhile.class, "CtWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtWhile_LoopingExpression(), this.getCtExpression(), null, "LoopingExpression", null, 0, 1, CtWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CodePackageImpl
