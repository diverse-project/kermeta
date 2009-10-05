/**
 * <copyright> </copyright>
 * 
 * $Id: LogoCSMFactoryImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openembedd.logo.csm.logoCSM.Back;
import org.openembedd.logo.csm.logoCSM.Block;
import org.openembedd.logo.csm.logoCSM.Clear;
import org.openembedd.logo.csm.logoCSM.Constant;
import org.openembedd.logo.csm.logoCSM.Div;
import org.openembedd.logo.csm.logoCSM.Equals;
import org.openembedd.logo.csm.logoCSM.Forward;
import org.openembedd.logo.csm.logoCSM.Greater;
import org.openembedd.logo.csm.logoCSM.If;
import org.openembedd.logo.csm.logoCSM.Left;
import org.openembedd.logo.csm.logoCSM.LogoCSMFactory;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.logoCSM.Lower;
import org.openembedd.logo.csm.logoCSM.Minus;
import org.openembedd.logo.csm.logoCSM.Mult;
import org.openembedd.logo.csm.logoCSM.Parameter;
import org.openembedd.logo.csm.logoCSM.ParameterCall;
import org.openembedd.logo.csm.logoCSM.PenDown;
import org.openembedd.logo.csm.logoCSM.PenUp;
import org.openembedd.logo.csm.logoCSM.Plus;
import org.openembedd.logo.csm.logoCSM.ProcCall;
import org.openembedd.logo.csm.logoCSM.ProcDeclaration;
import org.openembedd.logo.csm.logoCSM.Repeat;
import org.openembedd.logo.csm.logoCSM.Right;
import org.openembedd.logo.csm.logoCSM.While;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class LogoCSMFactoryImpl extends EFactoryImpl implements LogoCSMFactory
{
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static LogoCSMFactory init()
	{
		try
		{
			LogoCSMFactory theLogoCSMFactory = (LogoCSMFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://openembedd.org/logoCSM");
			if (theLogoCSMFactory != null)
			{
				return theLogoCSMFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogoCSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogoCSMFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
		case LogoCSMPackage.BACK:
			return createBack();
		case LogoCSMPackage.FORWARD:
			return createForward();
		case LogoCSMPackage.LEFT:
			return createLeft();
		case LogoCSMPackage.RIGHT:
			return createRight();
		case LogoCSMPackage.PEN_DOWN:
			return createPenDown();
		case LogoCSMPackage.PEN_UP:
			return createPenUp();
		case LogoCSMPackage.CLEAR:
			return createClear();
		case LogoCSMPackage.CONSTANT:
			return createConstant();
		case LogoCSMPackage.PROC_CALL:
			return createProcCall();
		case LogoCSMPackage.PROC_DECLARATION:
			return createProcDeclaration();
		case LogoCSMPackage.BLOCK:
			return createBlock();
		case LogoCSMPackage.IF:
			return createIf();
		case LogoCSMPackage.REPEAT:
			return createRepeat();
		case LogoCSMPackage.WHILE:
			return createWhile();
		case LogoCSMPackage.PARAMETER:
			return createParameter();
		case LogoCSMPackage.PARAMETER_CALL:
			return createParameterCall();
		case LogoCSMPackage.PLUS:
			return createPlus();
		case LogoCSMPackage.MINUS:
			return createMinus();
		case LogoCSMPackage.MULT:
			return createMult();
		case LogoCSMPackage.DIV:
			return createDiv();
		case LogoCSMPackage.EQUALS:
			return createEquals();
		case LogoCSMPackage.GREATER:
			return createGreater();
		case LogoCSMPackage.LOWER:
			return createLower();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Back createBack()
	{
		BackImpl back = new BackImpl();
		return back;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Forward createForward()
	{
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Left createLeft()
	{
		LeftImpl left = new LeftImpl();
		return left;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Right createRight()
	{
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PenDown createPenDown()
	{
		PenDownImpl penDown = new PenDownImpl();
		return penDown;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PenUp createPenUp()
	{
		PenUpImpl penUp = new PenUpImpl();
		return penUp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Clear createClear()
	{
		ClearImpl clear = new ClearImpl();
		return clear;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constant createConstant()
	{
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProcCall createProcCall()
	{
		ProcCallImpl procCall = new ProcCallImpl();
		return procCall;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProcDeclaration createProcDeclaration()
	{
		ProcDeclarationImpl procDeclaration = new ProcDeclarationImpl();
		return procDeclaration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Block createBlock()
	{
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public If createIf()
	{
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Repeat createRepeat()
	{
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public While createWhile()
	{
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter createParameter()
	{
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterCall createParameterCall()
	{
		ParameterCallImpl parameterCall = new ParameterCallImpl();
		return parameterCall;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Plus createPlus()
	{
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Minus createMinus()
	{
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Mult createMult()
	{
		MultImpl mult = new MultImpl();
		return mult;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Div createDiv()
	{
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Equals createEquals()
	{
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Greater createGreater()
	{
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Lower createLower()
	{
		LowerImpl lower = new LowerImpl();
		return lower;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogoCSMPackage getLogoCSMPackage()
	{
		return (LogoCSMPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogoCSMPackage getPackage()
	{
		return LogoCSMPackage.eINSTANCE;
	}

} // LogoCSMFactoryImpl
