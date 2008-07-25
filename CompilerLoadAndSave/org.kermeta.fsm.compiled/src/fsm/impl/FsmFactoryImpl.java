/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: FsmFactoryImpl.java,v 1.2 2008-07-25 12:40:13 ftanguy Exp $
 */
package fsm.impl;

import fsm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class FsmFactoryImpl extends EFactoryImpl implements FsmFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static FsmFactory init()
  {
		try {
			FsmFactory theFsmFactory = (FsmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/fsm/kermeta_temp_uri"); 
			if (theFsmFactory != null) {
				return theFsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FsmFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FsmFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case FsmPackage.FSM: return createFSM();
			case FsmPackage.STATE: return createState();
			case FsmPackage.TRANSITION: return createTransition();
			case FsmPackage.FSM_EXCEPTION: return createFSMException();
			case FsmPackage.NON_DETERMINISM: return createNonDeterminism();
			case FsmPackage.NO_TRANSITION: return createNoTransition();
			case FsmPackage.NO_INITIAL_STATE_EXCEPTION: return createNoInitialStateException();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case FsmPackage.MY_ENUM:
				return createMyEnumFromString(eDataType, initialValue);
			case FsmPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case FsmPackage.MY_ENUM:
				return convertMyEnumToString(eDataType, instanceValue);
			case FsmPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FSM createFSM()
  {
		FSMImpl fsm = new FSMImpl();
		return fsm;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public State createState()
  {
		StateImpl state = new StateImpl();
		return state;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Transition createTransition()
  {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FSMException createFSMException()
  {
		FSMExceptionImpl fsmException = new FSMExceptionImpl();
		return fsmException;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NonDeterminism createNonDeterminism()
  {
		NonDeterminismImpl nonDeterminism = new NonDeterminismImpl();
		return nonDeterminism;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NoTransition createNoTransition()
  {
		NoTransitionImpl noTransition = new NoTransitionImpl();
		return noTransition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NoInitialStateException createNoInitialStateException()
  {
		NoInitialStateExceptionImpl noInitialStateException = new NoInitialStateExceptionImpl();
		return noInitialStateException;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEnum createMyEnumFromString(EDataType eDataType, String initialValue) {
		MyEnum result = MyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Object createStringFromString(EDataType eDataType, String initialValue)
  {
		return super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertStringToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FsmPackage getFsmPackage()
  {
		return (FsmPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static FsmPackage getPackage()
  {
		return FsmPackage.eINSTANCE;
	}

} //FsmFactoryImpl
