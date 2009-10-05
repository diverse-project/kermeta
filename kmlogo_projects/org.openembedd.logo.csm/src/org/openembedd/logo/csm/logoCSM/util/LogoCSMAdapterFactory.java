/**
 * <copyright> </copyright>
 * 
 * $Id: LogoCSMAdapterFactory.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openembedd.logo.csm.logoCSM.Back;
import org.openembedd.logo.csm.logoCSM.BinaryExp;
import org.openembedd.logo.csm.logoCSM.Block;
import org.openembedd.logo.csm.logoCSM.Clear;
import org.openembedd.logo.csm.logoCSM.Constant;
import org.openembedd.logo.csm.logoCSM.ControlStructure;
import org.openembedd.logo.csm.logoCSM.Div;
import org.openembedd.logo.csm.logoCSM.Equals;
import org.openembedd.logo.csm.logoCSM.Expression;
import org.openembedd.logo.csm.logoCSM.Forward;
import org.openembedd.logo.csm.logoCSM.Greater;
import org.openembedd.logo.csm.logoCSM.If;
import org.openembedd.logo.csm.logoCSM.Instruction;
import org.openembedd.logo.csm.logoCSM.Left;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.logoCSM.Lower;
import org.openembedd.logo.csm.logoCSM.Minus;
import org.openembedd.logo.csm.logoCSM.Mult;
import org.openembedd.logo.csm.logoCSM.Parameter;
import org.openembedd.logo.csm.logoCSM.ParameterCall;
import org.openembedd.logo.csm.logoCSM.PenDown;
import org.openembedd.logo.csm.logoCSM.PenUp;
import org.openembedd.logo.csm.logoCSM.Plus;
import org.openembedd.logo.csm.logoCSM.Primitive;
import org.openembedd.logo.csm.logoCSM.ProcCall;
import org.openembedd.logo.csm.logoCSM.ProcDeclaration;
import org.openembedd.logo.csm.logoCSM.Repeat;
import org.openembedd.logo.csm.logoCSM.Right;
import org.openembedd.logo.csm.logoCSM.While;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage
 * @generated
 */
public class LogoCSMAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static LogoCSMPackage	modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogoCSMAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = LogoCSMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LogoCSMSwitch<Adapter>	modelSwitch	= new LogoCSMSwitch<Adapter>()
													{
														@Override
														public Adapter caseInstruction(Instruction object)
														{
															return createInstructionAdapter();
														}
														@Override
														public Adapter casePrimitive(Primitive object)
														{
															return createPrimitiveAdapter();
														}
														@Override
														public Adapter caseBack(Back object)
														{
															return createBackAdapter();
														}
														@Override
														public Adapter caseForward(Forward object)
														{
															return createForwardAdapter();
														}
														@Override
														public Adapter caseLeft(Left object)
														{
															return createLeftAdapter();
														}
														@Override
														public Adapter caseRight(Right object)
														{
															return createRightAdapter();
														}
														@Override
														public Adapter casePenDown(PenDown object)
														{
															return createPenDownAdapter();
														}
														@Override
														public Adapter casePenUp(PenUp object)
														{
															return createPenUpAdapter();
														}
														@Override
														public Adapter caseClear(Clear object)
														{
															return createClearAdapter();
														}
														@Override
														public Adapter caseExpression(Expression object)
														{
															return createExpressionAdapter();
														}
														@Override
														public Adapter caseBinaryExp(BinaryExp object)
														{
															return createBinaryExpAdapter();
														}
														@Override
														public Adapter caseConstant(Constant object)
														{
															return createConstantAdapter();
														}
														@Override
														public Adapter caseProcCall(ProcCall object)
														{
															return createProcCallAdapter();
														}
														@Override
														public Adapter caseProcDeclaration(ProcDeclaration object)
														{
															return createProcDeclarationAdapter();
														}
														@Override
														public Adapter caseBlock(Block object)
														{
															return createBlockAdapter();
														}
														@Override
														public Adapter caseIf(If object)
														{
															return createIfAdapter();
														}
														@Override
														public Adapter caseControlStructure(ControlStructure object)
														{
															return createControlStructureAdapter();
														}
														@Override
														public Adapter caseRepeat(Repeat object)
														{
															return createRepeatAdapter();
														}
														@Override
														public Adapter caseWhile(While object)
														{
															return createWhileAdapter();
														}
														@Override
														public Adapter caseParameter(Parameter object)
														{
															return createParameterAdapter();
														}
														@Override
														public Adapter caseParameterCall(ParameterCall object)
														{
															return createParameterCallAdapter();
														}
														@Override
														public Adapter casePlus(Plus object)
														{
															return createPlusAdapter();
														}
														@Override
														public Adapter caseMinus(Minus object)
														{
															return createMinusAdapter();
														}
														@Override
														public Adapter caseMult(Mult object)
														{
															return createMultAdapter();
														}
														@Override
														public Adapter caseDiv(Div object)
														{
															return createDivAdapter();
														}
														@Override
														public Adapter caseEquals(Equals object)
														{
															return createEqualsAdapter();
														}
														@Override
														public Adapter caseGreater(Greater object)
														{
															return createGreaterAdapter();
														}
														@Override
														public Adapter caseLower(Lower object)
														{
															return createLowerAdapter();
														}
														@Override
														public Adapter defaultCase(EObject object)
														{
															return createEObjectAdapter();
														}
													};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *        the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Instruction
	 * <em>Instruction</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Primitive
	 * <em>Primitive</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Primitive
	 * @generated
	 */
	public Adapter createPrimitiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Back <em>Back</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Back
	 * @generated
	 */
	public Adapter createBackAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Forward
	 * @generated
	 */
	public Adapter createForwardAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Left <em>Left</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Left
	 * @generated
	 */
	public Adapter createLeftAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Right <em>Right</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Right
	 * @generated
	 */
	public Adapter createRightAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.PenDown <em>Pen Down</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.PenDown
	 * @generated
	 */
	public Adapter createPenDownAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.PenUp <em>Pen Up</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.PenUp
	 * @generated
	 */
	public Adapter createPenUpAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Clear <em>Clear</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Clear
	 * @generated
	 */
	public Adapter createClearAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Expression
	 * <em>Expression</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.BinaryExp
	 * <em>Binary Exp</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.BinaryExp
	 * @generated
	 */
	public Adapter createBinaryExpAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Constant <em>Constant</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.ProcCall <em>Proc Call</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.ProcCall
	 * @generated
	 */
	public Adapter createProcCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.ProcDeclaration
	 * <em>Proc Declaration</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.ProcDeclaration
	 * @generated
	 */
	public Adapter createProcDeclarationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Block <em>Block</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Block
	 * @generated
	 */
	public Adapter createBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.If <em>If</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.If
	 * @generated
	 */
	public Adapter createIfAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.ControlStructure
	 * <em>Control Structure</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.ControlStructure
	 * @generated
	 */
	public Adapter createControlStructureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Repeat
	 * @generated
	 */
	public Adapter createRepeatAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.While <em>While</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.While
	 * @generated
	 */
	public Adapter createWhileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Parameter
	 * <em>Parameter</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.ParameterCall
	 * <em>Parameter Call</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.ParameterCall
	 * @generated
	 */
	public Adapter createParameterCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Plus <em>Plus</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Minus <em>Minus</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Mult <em>Mult</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Mult
	 * @generated
	 */
	public Adapter createMultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Div <em>Div</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Div
	 * @generated
	 */
	public Adapter createDivAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Equals
	 * @generated
	 */
	public Adapter createEqualsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Greater
	 * @generated
	 */
	public Adapter createGreaterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openembedd.logo.csm.logoCSM.Lower <em>Lower</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openembedd.logo.csm.logoCSM.Lower
	 * @generated
	 */
	public Adapter createLowerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} // LogoCSMAdapterFactory
