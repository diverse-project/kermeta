/*$Id : ASMPackage.java v 1.3 May 8, 2010 9:38:31 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model
* File : 	ASMPackage.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.ASM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory
 * @model kind="package"
 * @generated
 */
public interface ASMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ASM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kmLogo/ASM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ASM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASMPackage eINSTANCE = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.InstructionImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 0;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PrimitiveImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 1;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BackImpl <em>Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BackImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getBack()
	 * @generated
	 */
	int BACK = 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__STEPS = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ForwardImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 3;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__STEPS = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LeftImpl <em>Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LeftImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getLeft()
	 * @generated
	 */
	int LEFT = 4;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT__ANGLE = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.RightImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 5;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__ANGLE = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PenDownImpl <em>Pen Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PenDownImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getPenDown()
	 * @generated
	 */
	int PEN_DOWN = 6;

	/**
	 * The number of structural features of the '<em>Pen Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_DOWN_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PenUpImpl <em>Pen Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PenUpImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getPenUp()
	 * @generated
	 */
	int PEN_UP = 7;

	/**
	 * The number of structural features of the '<em>Pen Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_UP_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ClearImpl <em>Clear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ClearImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getClear()
	 * @generated
	 */
	int CLEAR = 8;

	/**
	 * The number of structural features of the '<em>Clear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ExpressionImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 9;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BinaryExpImpl <em>Binary Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BinaryExpImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getBinaryExp()
	 * @generated
	 */
	int BINARY_EXP = 10;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXP__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXP__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ConstantImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 11;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__INTEGER_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ProcCallImpl <em>Proc Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ProcCallImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getProcCall()
	 * @generated
	 */
	int PROC_CALL = 12;

	/**
	 * The feature id for the '<em><b>Actual Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL__ACTUAL_ARGS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL__DECLARATION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Proc Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ProcDeclarationImpl <em>Proc Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ProcDeclarationImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getProcDeclaration()
	 * @generated
	 */
	int PROC_DECLARATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION__NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION__ARGS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proc Call</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION__PROC_CALL = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Proc Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_DECLARATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BlockImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 14;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ControlStructureImpl <em>Control Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ControlStructureImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getControlStructure()
	 * @generated
	 */
	int CONTROL_STRUCTURE = 16;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.IfImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getIf()
	 * @generated
	 */
	int IF = 15;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Then Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN_PART = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_PART = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.RepeatImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 17;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__CONDITION = CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__BLOCK = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.WhileImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 18;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BLOCK = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ParameterImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ParameterCallImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getParameterCall()
	 * @generated
	 */
	int PARAMETER_CALL = 20;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__PARAMETER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PlusImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 21;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LHS = BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RHS = BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.MinusImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 22;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LHS = BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RHS = BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.MultImpl <em>Mult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.MultImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getMult()
	 * @generated
	 */
	int MULT = 23;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT__LHS = BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT__RHS = BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Mult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_FEATURE_COUNT = BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.DivImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 24;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__LHS = BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__RHS = BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.EqualsImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 25;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__LHS = BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__RHS = BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.GreaterImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 26;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LHS = BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__RHS = BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LowerImpl <em>Lower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LowerImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getLower()
	 * @generated
	 */
	int LOWER = 27;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER__LHS = BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER__RHS = BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Lower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_FEATURE_COUNT = BINARY_EXP_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LogoProgramImpl <em>Logo Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LogoProgramImpl
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getLogoProgram()
	 * @generated
	 */
	int LOGO_PROGRAM = 28;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_PROGRAM__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Logo Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_PROGRAM_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back
	 * @generated
	 */
	EClass getBack();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back#getSteps()
	 * @see #getBack()
	 * @generated
	 */
	EReference getBack_Steps();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward#getSteps()
	 * @see #getForward()
	 * @generated
	 */
	EReference getForward_Steps();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left
	 * @generated
	 */
	EClass getLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left#getAngle()
	 * @see #getLeft()
	 * @generated
	 */
	EReference getLeft_Angle();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right#getAngle()
	 * @see #getRight()
	 * @generated
	 */
	EReference getRight_Angle();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown <em>Pen Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen Down</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown
	 * @generated
	 */
	EClass getPenDown();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp <em>Pen Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen Up</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp
	 * @generated
	 */
	EClass getPenUp();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear
	 * @generated
	 */
	EClass getClear();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp <em>Binary Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Exp</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp
	 * @generated
	 */
	EClass getBinaryExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp#getLhs()
	 * @see #getBinaryExp()
	 * @generated
	 */
	EReference getBinaryExp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp#getRhs()
	 * @see #getBinaryExp()
	 * @generated
	 */
	EReference getBinaryExp_Rhs();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Value</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant#getIntegerValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_IntegerValue();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall <em>Proc Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proc Call</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall
	 * @generated
	 */
	EClass getProcCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall#getActualArgs <em>Actual Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Args</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall#getActualArgs()
	 * @see #getProcCall()
	 * @generated
	 */
	EReference getProcCall_ActualArgs();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall#getDeclaration()
	 * @see #getProcCall()
	 * @generated
	 */
	EReference getProcCall_Declaration();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration <em>Proc Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proc Declaration</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration
	 * @generated
	 */
	EClass getProcDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getName()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EAttribute getProcDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getArgs()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EReference getProcDeclaration_Args();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getProcCall <em>Proc Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proc Call</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getProcCall()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EReference getProcDeclaration_ProcCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getInstructions()
	 * @see #getProcDeclaration()
	 * @generated
	 */
	EReference getProcDeclaration_Instructions();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block#getInstructions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Instructions();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If#getThenPart <em>Then Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Part</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If#getThenPart()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ThenPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If#getElsePart <em>Else Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Part</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If#getElsePart()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElsePart();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Structure</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure
	 * @generated
	 */
	EClass getControlStructure();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure#getCondition()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Condition();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat#getBlock()
	 * @see #getRepeat()
	 * @generated
	 */
	EReference getRepeat_Block();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While#getBlock()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Block();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall <em>Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Call</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall
	 * @generated
	 */
	EClass getParameterCall();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall#getParameter()
	 * @see #getParameterCall()
	 * @generated
	 */
	EReference getParameterCall_Parameter();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mult</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult
	 * @generated
	 */
	EClass getMult();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower
	 * @generated
	 */
	EClass getLower();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram <em>Logo Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logo Program</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram
	 * @generated
	 */
	EClass getLogoProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram#getInstructions()
	 * @see #getLogoProgram()
	 * @generated
	 */
	EReference getLogoProgram_Instructions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ASMFactory getASMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.InstructionImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PrimitiveImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BackImpl <em>Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BackImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getBack()
		 * @generated
		 */
		EClass BACK = eINSTANCE.getBack();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACK__STEPS = eINSTANCE.getBack_Steps();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ForwardImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORWARD__STEPS = eINSTANCE.getForward_Steps();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LeftImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getLeft()
		 * @generated
		 */
		EClass LEFT = eINSTANCE.getLeft();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT__ANGLE = eINSTANCE.getLeft_Angle();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.RightImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT__ANGLE = eINSTANCE.getRight_Angle();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PenDownImpl <em>Pen Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PenDownImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getPenDown()
		 * @generated
		 */
		EClass PEN_DOWN = eINSTANCE.getPenDown();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PenUpImpl <em>Pen Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PenUpImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getPenUp()
		 * @generated
		 */
		EClass PEN_UP = eINSTANCE.getPenUp();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ClearImpl <em>Clear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ClearImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getClear()
		 * @generated
		 */
		EClass CLEAR = eINSTANCE.getClear();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ExpressionImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BinaryExpImpl <em>Binary Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BinaryExpImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getBinaryExp()
		 * @generated
		 */
		EClass BINARY_EXP = eINSTANCE.getBinaryExp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXP__LHS = eINSTANCE.getBinaryExp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXP__RHS = eINSTANCE.getBinaryExp_Rhs();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ConstantImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__INTEGER_VALUE = eINSTANCE.getConstant_IntegerValue();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ProcCallImpl <em>Proc Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ProcCallImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getProcCall()
		 * @generated
		 */
		EClass PROC_CALL = eINSTANCE.getProcCall();

		/**
		 * The meta object literal for the '<em><b>Actual Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_CALL__ACTUAL_ARGS = eINSTANCE.getProcCall_ActualArgs();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_CALL__DECLARATION = eINSTANCE.getProcCall_Declaration();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ProcDeclarationImpl <em>Proc Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ProcDeclarationImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getProcDeclaration()
		 * @generated
		 */
		EClass PROC_DECLARATION = eINSTANCE.getProcDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROC_DECLARATION__NAME = eINSTANCE.getProcDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_DECLARATION__ARGS = eINSTANCE.getProcDeclaration_Args();

		/**
		 * The meta object literal for the '<em><b>Proc Call</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_DECLARATION__PROC_CALL = eINSTANCE.getProcDeclaration_ProcCall();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_DECLARATION__INSTRUCTIONS = eINSTANCE.getProcDeclaration_Instructions();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.BlockImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INSTRUCTIONS = eINSTANCE.getBlock_Instructions();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.IfImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Then Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN_PART = eINSTANCE.getIf_ThenPart();

		/**
		 * The meta object literal for the '<em><b>Else Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_PART = eINSTANCE.getIf_ElsePart();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ControlStructureImpl <em>Control Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ControlStructureImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getControlStructure()
		 * @generated
		 */
		EClass CONTROL_STRUCTURE = eINSTANCE.getControlStructure();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONDITION = eINSTANCE.getControlStructure_Condition();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.RepeatImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT__BLOCK = eINSTANCE.getRepeat_Block();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.WhileImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__BLOCK = eINSTANCE.getWhile_Block();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ParameterImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ParameterCallImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getParameterCall()
		 * @generated
		 */
		EClass PARAMETER_CALL = eINSTANCE.getParameterCall();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CALL__PARAMETER = eINSTANCE.getParameterCall_Parameter();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.PlusImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.MinusImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.MultImpl <em>Mult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.MultImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getMult()
		 * @generated
		 */
		EClass MULT = eINSTANCE.getMult();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.DivImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.EqualsImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.GreaterImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LowerImpl <em>Lower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LowerImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getLower()
		 * @generated
		 */
		EClass LOWER = eINSTANCE.getLower();

		/**
		 * The meta object literal for the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LogoProgramImpl <em>Logo Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.LogoProgramImpl
		 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl.ASMPackageImpl#getLogoProgram()
		 * @generated
		 */
		EClass LOGO_PROGRAM = eINSTANCE.getLogoProgram();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGO_PROGRAM__INSTRUCTIONS = eINSTANCE.getLogoProgram_Instructions();

	}

} //ASMPackage
