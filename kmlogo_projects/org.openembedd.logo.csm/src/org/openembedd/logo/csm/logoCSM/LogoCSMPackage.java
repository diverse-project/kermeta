/**
 * <copyright> </copyright>
 * 
 * $Id: LogoCSMPackage.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.openembedd.logo.csm.logoCSM.LogoCSMFactory
 * @model kind="package"
 * @generated
 */
public interface LogoCSMPackage extends EPackage
{
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String			eNAME							= "logoCSM";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String			eNS_URI							= "http://openembedd.org/logoCSM";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String			eNS_PREFIX						= "logoCSM";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	LogoCSMPackage	eINSTANCE						= org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.InstructionImpl <em>Instruction</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.InstructionImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getInstruction()
	 * @generated
	 */
	int				INSTRUCTION						= 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				INSTRUCTION__NEXT				= 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				INSTRUCTION__PREVIOUS			= 1;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				INSTRUCTION_FEATURE_COUNT		= 2;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.PrimitiveImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getPrimitive()
	 * @generated
	 */
	int				PRIMITIVE						= 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PRIMITIVE__NEXT					= INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PRIMITIVE__PREVIOUS				= INSTRUCTION__PREVIOUS;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PRIMITIVE_FEATURE_COUNT			= INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.BackImpl <em>Back</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.BackImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getBack()
	 * @generated
	 */
	int				BACK							= 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BACK__NEXT						= PRIMITIVE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BACK__PREVIOUS					= PRIMITIVE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BACK__STEPS						= PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Back</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BACK_FEATURE_COUNT				= PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.ForwardImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getForward()
	 * @generated
	 */
	int				FORWARD							= 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				FORWARD__NEXT					= PRIMITIVE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				FORWARD__PREVIOUS				= PRIMITIVE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				FORWARD__STEPS					= PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				FORWARD_FEATURE_COUNT			= PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.LeftImpl <em>Left</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.LeftImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getLeft()
	 * @generated
	 */
	int				LEFT							= 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				LEFT__NEXT						= PRIMITIVE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				LEFT__PREVIOUS					= PRIMITIVE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				LEFT__ANGLE						= PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Left</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				LEFT_FEATURE_COUNT				= PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.RightImpl <em>Right</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.RightImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getRight()
	 * @generated
	 */
	int				RIGHT							= 5;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				RIGHT__NEXT						= PRIMITIVE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				RIGHT__PREVIOUS					= PRIMITIVE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				RIGHT__ANGLE					= PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Right</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				RIGHT_FEATURE_COUNT				= PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.PenDownImpl <em>Pen Down</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.PenDownImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getPenDown()
	 * @generated
	 */
	int				PEN_DOWN						= 6;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PEN_DOWN__NEXT					= PRIMITIVE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PEN_DOWN__PREVIOUS				= PRIMITIVE__PREVIOUS;

	/**
	 * The number of structural features of the '<em>Pen Down</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PEN_DOWN_FEATURE_COUNT			= PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.PenUpImpl <em>Pen Up</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.PenUpImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getPenUp()
	 * @generated
	 */
	int				PEN_UP							= 7;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PEN_UP__NEXT					= PRIMITIVE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PEN_UP__PREVIOUS				= PRIMITIVE__PREVIOUS;

	/**
	 * The number of structural features of the '<em>Pen Up</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PEN_UP_FEATURE_COUNT			= PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.ClearImpl <em>Clear</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.ClearImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getClear()
	 * @generated
	 */
	int				CLEAR							= 8;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CLEAR__NEXT						= PRIMITIVE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CLEAR__PREVIOUS					= PRIMITIVE__PREVIOUS;

	/**
	 * The number of structural features of the '<em>Clear</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CLEAR_FEATURE_COUNT				= PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.Expression <em>Expression</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.Expression
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getExpression()
	 * @generated
	 */
	int				EXPRESSION						= 9;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				EXPRESSION__NEXT				= INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				EXPRESSION__PREVIOUS			= INSTRUCTION__PREVIOUS;

	/**
	 * The number of structural features of the '<em>Expression</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				EXPRESSION_FEATURE_COUNT		= INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.BinaryExpImpl <em>Binary Exp</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.BinaryExpImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getBinaryExp()
	 * @generated
	 */
	int				BINARY_EXP						= 10;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BINARY_EXP__NEXT				= EXPRESSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BINARY_EXP__PREVIOUS			= EXPRESSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BINARY_EXP__LHS					= EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BINARY_EXP__RHS					= EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Exp</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BINARY_EXP_FEATURE_COUNT		= EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.ConstantImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getConstant()
	 * @generated
	 */
	int				CONSTANT						= 11;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CONSTANT__NEXT					= EXPRESSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CONSTANT__PREVIOUS				= EXPRESSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CONSTANT__INTEGER_VALUE			= EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CONSTANT_FEATURE_COUNT			= EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.ProcCallImpl <em>Proc Call</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.ProcCallImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getProcCall()
	 * @generated
	 */
	int				PROC_CALL						= 12;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_CALL__NEXT					= EXPRESSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_CALL__PREVIOUS				= EXPRESSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Actual Args</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_CALL__ACTUAL_ARGS			= EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_CALL__DECLARATION			= EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Proc Call</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_CALL_FEATURE_COUNT			= EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.ProcDeclarationImpl
	 * <em>Proc Declaration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.ProcDeclarationImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getProcDeclaration()
	 * @generated
	 */
	int				PROC_DECLARATION				= 13;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_DECLARATION__NEXT			= INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_DECLARATION__PREVIOUS		= INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_DECLARATION__NAME			= INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_DECLARATION__ARGS			= INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_DECLARATION__BLOCK			= INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Proc Call</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_DECLARATION__PROC_CALL		= INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Proc Declaration</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PROC_DECLARATION_FEATURE_COUNT	= INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.BlockImpl <em>Block</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.BlockImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getBlock()
	 * @generated
	 */
	int				BLOCK							= 14;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BLOCK__NEXT						= INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BLOCK__PREVIOUS					= INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BLOCK__INSTRUCTIONS				= INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				BLOCK_FEATURE_COUNT				= INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.ControlStructureImpl
	 * <em>Control Structure</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.ControlStructureImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getControlStructure()
	 * @generated
	 */
	int				CONTROL_STRUCTURE				= 16;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CONTROL_STRUCTURE__NEXT			= INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CONTROL_STRUCTURE__PREVIOUS		= INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CONTROL_STRUCTURE__CONDITION	= INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				CONTROL_STRUCTURE_FEATURE_COUNT	= INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.IfImpl <em>If</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.IfImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getIf()
	 * @generated
	 */
	int				IF								= 15;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				IF__NEXT						= CONTROL_STRUCTURE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				IF__PREVIOUS					= CONTROL_STRUCTURE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				IF__CONDITION					= CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Then Part</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				IF__THEN_PART					= CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Part</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				IF__ELSE_PART					= CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				IF_FEATURE_COUNT				= CONTROL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.RepeatImpl <em>Repeat</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.RepeatImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getRepeat()
	 * @generated
	 */
	int				REPEAT							= 17;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				REPEAT__NEXT					= CONTROL_STRUCTURE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				REPEAT__PREVIOUS				= CONTROL_STRUCTURE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				REPEAT__CONDITION				= CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				REPEAT__BLOCK					= CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				REPEAT_FEATURE_COUNT			= CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.WhileImpl <em>While</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.WhileImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getWhile()
	 * @generated
	 */
	int				WHILE							= 18;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				WHILE__NEXT						= CONTROL_STRUCTURE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				WHILE__PREVIOUS					= CONTROL_STRUCTURE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				WHILE__CONDITION				= CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				WHILE__BLOCK					= CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				WHILE_FEATURE_COUNT				= CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.ParameterImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getParameter()
	 * @generated
	 */
	int				PARAMETER						= 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PARAMETER__NAME					= 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PARAMETER_FEATURE_COUNT			= 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.ParameterCallImpl
	 * <em>Parameter Call</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.ParameterCallImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getParameterCall()
	 * @generated
	 */
	int				PARAMETER_CALL					= 20;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PARAMETER_CALL__NEXT			= EXPRESSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PARAMETER_CALL__PREVIOUS		= EXPRESSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PARAMETER_CALL__PARAMETER		= EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Call</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PARAMETER_CALL_FEATURE_COUNT	= EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.PlusImpl <em>Plus</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.PlusImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getPlus()
	 * @generated
	 */
	int				PLUS							= 21;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PLUS__NEXT						= BINARY_EXP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PLUS__PREVIOUS					= BINARY_EXP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PLUS__LHS						= BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PLUS__RHS						= BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Plus</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				PLUS_FEATURE_COUNT				= BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.MinusImpl <em>Minus</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.MinusImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getMinus()
	 * @generated
	 */
	int				MINUS							= 22;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				MINUS__NEXT						= BINARY_EXP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				MINUS__PREVIOUS					= BINARY_EXP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				MINUS__LHS						= BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				MINUS__RHS						= BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Minus</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				MINUS_FEATURE_COUNT				= BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.MultImpl <em>Mult</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.MultImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getMult()
	 * @generated
	 */
	int				MULT							= 23;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				MULT__NEXT						= BINARY_EXP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				MULT__PREVIOUS					= BINARY_EXP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				MULT__LHS						= BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				MULT__RHS						= BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Mult</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				MULT_FEATURE_COUNT				= BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.DivImpl <em>Div</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.DivImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getDiv()
	 * @generated
	 */
	int				DIV								= 24;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				DIV__NEXT						= BINARY_EXP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				DIV__PREVIOUS					= BINARY_EXP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				DIV__LHS						= BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				DIV__RHS						= BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Div</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				DIV_FEATURE_COUNT				= BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.EqualsImpl <em>Equals</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.EqualsImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getEquals()
	 * @generated
	 */
	int				EQUALS							= 25;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				EQUALS__NEXT					= BINARY_EXP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				EQUALS__PREVIOUS				= BINARY_EXP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				EQUALS__LHS						= BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				EQUALS__RHS						= BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Equals</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				EQUALS_FEATURE_COUNT			= BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.GreaterImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getGreater()
	 * @generated
	 */
	int				GREATER							= 26;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				GREATER__NEXT					= BINARY_EXP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				GREATER__PREVIOUS				= BINARY_EXP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				GREATER__LHS					= BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				GREATER__RHS					= BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Greater</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				GREATER_FEATURE_COUNT			= BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openembedd.logo.csm.logoCSM.impl.LowerImpl <em>Lower</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openembedd.logo.csm.logoCSM.impl.LowerImpl
	 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getLower()
	 * @generated
	 */
	int				LOWER							= 27;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				LOWER__NEXT						= BINARY_EXP__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				LOWER__PREVIOUS					= BINARY_EXP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				LOWER__LHS						= BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				LOWER__RHS						= BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Lower</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int				LOWER_FEATURE_COUNT				= BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the reference '{@link org.openembedd.logo.csm.logoCSM.Instruction#getNext
	 * <em>Next</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Instruction#getNext()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Next();

	/**
	 * Returns the meta object for the reference '{@link org.openembedd.logo.csm.logoCSM.Instruction#getPrevious
	 * <em>Previous</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Instruction#getPrevious()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Previous();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Primitive <em>Primitive</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Back <em>Back</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Back</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Back
	 * @generated
	 */
	EClass getBack();

	/**
	 * Returns the meta object for the containment reference '{@link org.openembedd.logo.csm.logoCSM.Back#getSteps
	 * <em>Steps</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Back#getSteps()
	 * @see #getBack()
	 * @generated
	 */
	EReference getBack_Steps();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Forward <em>Forward</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for the containment reference '{@link org.openembedd.logo.csm.logoCSM.Forward#getSteps
	 * <em>Steps</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Forward#getSteps()
	 * @see #getForward()
	 * @generated
	 */
	EReference getForward_Steps();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Left <em>Left</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Left</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Left
	 * @generated
	 */
	EClass getLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.openembedd.logo.csm.logoCSM.Left#getAngle
	 * <em>Angle</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Left#getAngle()
	 * @see #getLeft()
	 * @generated
	 */
	EReference getLeft_Angle();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Right <em>Right</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Right</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for the containment reference '{@link org.openembedd.logo.csm.logoCSM.Right#getAngle
	 * <em>Angle</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Right#getAngle()
	 * @see #getRight()
	 * @generated
	 */
	EReference getRight_Angle();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.PenDown <em>Pen Down</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Pen Down</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.PenDown
	 * @generated
	 */
	EClass getPenDown();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.PenUp <em>Pen Up</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Pen Up</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.PenUp
	 * @generated
	 */
	EClass getPenUp();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Clear <em>Clear</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Clear</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Clear
	 * @generated
	 */
	EClass getClear();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Expression <em>Expression</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.BinaryExp <em>Binary Exp</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Binary Exp</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.BinaryExp
	 * @generated
	 */
	EClass getBinaryExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.openembedd.logo.csm.logoCSM.BinaryExp#getLhs
	 * <em>Lhs</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.BinaryExp#getLhs()
	 * @see #getBinaryExp()
	 * @generated
	 */
	EReference getBinaryExp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.openembedd.logo.csm.logoCSM.BinaryExp#getRhs
	 * <em>Rhs</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.BinaryExp#getRhs()
	 * @see #getBinaryExp()
	 * @generated
	 */
	EReference getBinaryExp_Rhs();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Constant <em>Constant</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.openembedd.logo.csm.logoCSM.Constant#getIntegerValue
	 * <em>Integer Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Integer Value</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Constant#getIntegerValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_IntegerValue();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.ProcCall <em>Proc Call</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Proc Call</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ProcCall
	 * @generated
	 */
	EClass getProcCall();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openembedd.logo.csm.logoCSM.ProcCall#getActualArgs <em>Actual Args</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Actual Args</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ProcCall#getActualArgs()
	 * @see #getProcCall()
	 * @generated
	 */
	EReference getProcCall_ActualArgs();

	/**
	 * Returns the meta object for the reference '{@link org.openembedd.logo.csm.logoCSM.ProcCall#getDeclaration
	 * <em>Declaration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ProcCall#getDeclaration()
	 * @see #getProcCall()
	 * @generated
	 */
	EReference getProcCall_Declaration();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.ProcDeclaration
	 * <em>Proc Declaration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Proc Declaration</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ProcDeclaration
	 * @generated
	 */
	EClass getProcDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.openembedd.logo.csm.logoCSM.ProcDeclaration#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ProcDeclaration#getName()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EAttribute getProcDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openembedd.logo.csm.logoCSM.ProcDeclaration#getArgs <em>Args</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ProcDeclaration#getArgs()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EReference getProcDeclaration_Args();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openembedd.logo.csm.logoCSM.ProcDeclaration#getBlock <em>Block</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ProcDeclaration#getBlock()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EReference getProcDeclaration_Block();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.openembedd.logo.csm.logoCSM.ProcDeclaration#getProcCall <em>Proc Call</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Proc Call</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ProcDeclaration#getProcCall()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EReference getProcDeclaration_ProcCall();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Block <em>Block</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openembedd.logo.csm.logoCSM.Block#getInstructions <em>Instructions</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Block#getInstructions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Instructions();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.If <em>If</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.openembedd.logo.csm.logoCSM.If#getThenPart
	 * <em>Then Part</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Then Part</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.If#getThenPart()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ThenPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.openembedd.logo.csm.logoCSM.If#getElsePart
	 * <em>Else Part</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Else Part</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.If#getElsePart()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElsePart();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.ControlStructure
	 * <em>Control Structure</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Control Structure</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ControlStructure
	 * @generated
	 */
	EClass getControlStructure();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openembedd.logo.csm.logoCSM.ControlStructure#getCondition <em>Condition</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ControlStructure#getCondition()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Condition();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Repeat <em>Repeat</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the containment reference '{@link org.openembedd.logo.csm.logoCSM.Repeat#getBlock
	 * <em>Block</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Repeat#getBlock()
	 * @see #getRepeat()
	 * @generated
	 */
	EReference getRepeat_Block();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.While <em>While</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>While</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link org.openembedd.logo.csm.logoCSM.While#getBlock
	 * <em>Block</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.While#getBlock()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Block();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Parameter <em>Parameter</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.openembedd.logo.csm.logoCSM.Parameter#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.ParameterCall <em>Parameter Call</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter Call</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ParameterCall
	 * @generated
	 */
	EClass getParameterCall();

	/**
	 * Returns the meta object for the reference '{@link org.openembedd.logo.csm.logoCSM.ParameterCall#getParameter
	 * <em>Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.ParameterCall#getParameter()
	 * @see #getParameterCall()
	 * @generated
	 */
	EReference getParameterCall_Parameter();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Plus <em>Plus</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Minus <em>Minus</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Mult <em>Mult</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Mult</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Mult
	 * @generated
	 */
	EClass getMult();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Div <em>Div</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Div</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Equals <em>Equals</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Greater <em>Greater</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link org.openembedd.logo.csm.logoCSM.Lower <em>Lower</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Lower</em>'.
	 * @see org.openembedd.logo.csm.logoCSM.Lower
	 * @generated
	 */
	EClass getLower();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogoCSMFactory getLogoCSMFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.InstructionImpl
		 * <em>Instruction</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.InstructionImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getInstruction()
		 * @generated
		 */
		EClass		INSTRUCTION						= eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	INSTRUCTION__NEXT				= eINSTANCE.getInstruction_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	INSTRUCTION__PREVIOUS			= eINSTANCE.getInstruction_Previous();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.PrimitiveImpl
		 * <em>Primitive</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.PrimitiveImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass		PRIMITIVE						= eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.BackImpl <em>Back</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.BackImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getBack()
		 * @generated
		 */
		EClass		BACK							= eINSTANCE.getBack();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	BACK__STEPS						= eINSTANCE.getBack_Steps();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.ForwardImpl <em>Forward</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.ForwardImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getForward()
		 * @generated
		 */
		EClass		FORWARD							= eINSTANCE.getForward();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	FORWARD__STEPS					= eINSTANCE.getForward_Steps();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.LeftImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getLeft()
		 * @generated
		 */
		EClass		LEFT							= eINSTANCE.getLeft();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	LEFT__ANGLE						= eINSTANCE.getLeft_Angle();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.RightImpl <em>Right</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.RightImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getRight()
		 * @generated
		 */
		EClass		RIGHT							= eINSTANCE.getRight();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	RIGHT__ANGLE					= eINSTANCE.getRight_Angle();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.PenDownImpl <em>Pen Down</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.PenDownImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getPenDown()
		 * @generated
		 */
		EClass		PEN_DOWN						= eINSTANCE.getPenDown();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.PenUpImpl <em>Pen Up</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.PenUpImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getPenUp()
		 * @generated
		 */
		EClass		PEN_UP							= eINSTANCE.getPenUp();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.ClearImpl <em>Clear</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.ClearImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getClear()
		 * @generated
		 */
		EClass		CLEAR							= eINSTANCE.getClear();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.Expression <em>Expression</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.Expression
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getExpression()
		 * @generated
		 */
		EClass		EXPRESSION						= eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.BinaryExpImpl
		 * <em>Binary Exp</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.BinaryExpImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getBinaryExp()
		 * @generated
		 */
		EClass		BINARY_EXP						= eINSTANCE.getBinaryExp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	BINARY_EXP__LHS					= eINSTANCE.getBinaryExp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	BINARY_EXP__RHS					= eINSTANCE.getBinaryExp_Rhs();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.ConstantImpl <em>Constant</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.ConstantImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getConstant()
		 * @generated
		 */
		EClass		CONSTANT						= eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute	CONSTANT__INTEGER_VALUE			= eINSTANCE.getConstant_IntegerValue();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.ProcCallImpl <em>Proc Call</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.ProcCallImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getProcCall()
		 * @generated
		 */
		EClass		PROC_CALL						= eINSTANCE.getProcCall();

		/**
		 * The meta object literal for the '<em><b>Actual Args</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	PROC_CALL__ACTUAL_ARGS			= eINSTANCE.getProcCall_ActualArgs();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	PROC_CALL__DECLARATION			= eINSTANCE.getProcCall_Declaration();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.ProcDeclarationImpl
		 * <em>Proc Declaration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.ProcDeclarationImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getProcDeclaration()
		 * @generated
		 */
		EClass		PROC_DECLARATION				= eINSTANCE.getProcDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute	PROC_DECLARATION__NAME			= eINSTANCE.getProcDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	PROC_DECLARATION__ARGS			= eINSTANCE.getProcDeclaration_Args();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	PROC_DECLARATION__BLOCK			= eINSTANCE.getProcDeclaration_Block();

		/**
		 * The meta object literal for the '<em><b>Proc Call</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	PROC_DECLARATION__PROC_CALL		= eINSTANCE.getProcDeclaration_ProcCall();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.BlockImpl <em>Block</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.BlockImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getBlock()
		 * @generated
		 */
		EClass		BLOCK							= eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	BLOCK__INSTRUCTIONS				= eINSTANCE.getBlock_Instructions();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.IfImpl <em>If</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.IfImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getIf()
		 * @generated
		 */
		EClass		IF								= eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Then Part</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	IF__THEN_PART					= eINSTANCE.getIf_ThenPart();

		/**
		 * The meta object literal for the '<em><b>Else Part</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	IF__ELSE_PART					= eINSTANCE.getIf_ElsePart();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.ControlStructureImpl
		 * <em>Control Structure</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.ControlStructureImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getControlStructure()
		 * @generated
		 */
		EClass		CONTROL_STRUCTURE				= eINSTANCE.getControlStructure();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	CONTROL_STRUCTURE__CONDITION	= eINSTANCE.getControlStructure_Condition();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.RepeatImpl <em>Repeat</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.RepeatImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getRepeat()
		 * @generated
		 */
		EClass		REPEAT							= eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	REPEAT__BLOCK					= eINSTANCE.getRepeat_Block();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.WhileImpl <em>While</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.WhileImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getWhile()
		 * @generated
		 */
		EClass		WHILE							= eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	WHILE__BLOCK					= eINSTANCE.getWhile_Block();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.ParameterImpl
		 * <em>Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.ParameterImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getParameter()
		 * @generated
		 */
		EClass		PARAMETER						= eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute	PARAMETER__NAME					= eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.ParameterCallImpl
		 * <em>Parameter Call</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.ParameterCallImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getParameterCall()
		 * @generated
		 */
		EClass		PARAMETER_CALL					= eINSTANCE.getParameterCall();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference	PARAMETER_CALL__PARAMETER		= eINSTANCE.getParameterCall_Parameter();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.PlusImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getPlus()
		 * @generated
		 */
		EClass		PLUS							= eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.MinusImpl <em>Minus</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.MinusImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getMinus()
		 * @generated
		 */
		EClass		MINUS							= eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.MultImpl <em>Mult</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.MultImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getMult()
		 * @generated
		 */
		EClass		MULT							= eINSTANCE.getMult();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.DivImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getDiv()
		 * @generated
		 */
		EClass		DIV								= eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.EqualsImpl <em>Equals</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.EqualsImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getEquals()
		 * @generated
		 */
		EClass		EQUALS							= eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.GreaterImpl <em>Greater</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.GreaterImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getGreater()
		 * @generated
		 */
		EClass		GREATER							= eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link org.openembedd.logo.csm.logoCSM.impl.LowerImpl <em>Lower</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openembedd.logo.csm.logoCSM.impl.LowerImpl
		 * @see org.openembedd.logo.csm.logoCSM.impl.LogoCSMPackageImpl#getLower()
		 * @generated
		 */
		EClass		LOWER							= eINSTANCE.getLower();

	}

} // LogoCSMPackage
