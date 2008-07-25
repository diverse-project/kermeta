/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: FsmAdapterFactory.java,v 1.2 2008-07-25 12:40:05 ftanguy Exp $
 */
package fsm.util;

import fsm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fsm.FsmPackage
 * @generated
 */
public class FsmAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static FsmPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FsmAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = FsmPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FsmSwitch<Adapter> modelSwitch =
    new FsmSwitch<Adapter>() {
			@Override
			public Adapter caseFSM(FSM object) {
				return createFSMAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseFSMException(FSMException object) {
				return createFSMExceptionAdapter();
			}
			@Override
			public Adapter caseNonDeterminism(NonDeterminism object) {
				return createNonDeterminismAdapter();
			}
			@Override
			public Adapter caseNoTransition(NoTransition object) {
				return createNoTransitionAdapter();
			}
			@Override
			public Adapter caseNoInitialStateException(NoInitialStateException object) {
				return createNoInitialStateExceptionAdapter();
			}
			@Override
			public Adapter caseObject(kermeta.language.structure.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link fsm.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsm.FSM
	 * @generated
	 */
  public Adapter createFSMAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsm.State
	 * @generated
	 */
  public Adapter createStateAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsm.Transition
	 * @generated
	 */
  public Adapter createTransitionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fsm.FSMException <em>FSM Exception</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsm.FSMException
	 * @generated
	 */
  public Adapter createFSMExceptionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fsm.NonDeterminism <em>Non Determinism</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsm.NonDeterminism
	 * @generated
	 */
  public Adapter createNonDeterminismAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fsm.NoTransition <em>No Transition</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsm.NoTransition
	 * @generated
	 */
  public Adapter createNoTransitionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fsm.NoInitialStateException <em>No Initial State Exception</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsm.NoInitialStateException
	 * @generated
	 */
  public Adapter createNoInitialStateExceptionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link kermeta.language.structure.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.language.structure.Object
	 * @generated
	 */
  public Adapter createObjectAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //FsmAdapterFactory
