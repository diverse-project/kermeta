/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimkAdapterFactory.java,v 1.7 2008-10-29 08:29:20 cfaucher Exp $
 */
package simk.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simk.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simk.SimkPackage
 * @generated
 */
public class SimkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimkPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimkSwitch<Adapter> modelSwitch = new SimkSwitch<Adapter>() {
		@Override
		public Adapter caseSIMKModel(SIMKModel object) {
			return createSIMKModelAdapter();
		}

		@Override
		public Adapter caseSMClass(SMClass object) {
			return createSMClassAdapter();
		}

		@Override
		public Adapter caseSMMethod(SMMethod object) {
			return createSMMethodAdapter();
		}

		@Override
		public Adapter caseSMContext(SMContext object) {
			return createSMContextAdapter();
		}

		@Override
		public Adapter caseSMNamedElement(SMNamedElement object) {
			return createSMNamedElementAdapter();
		}

		@Override
		public Adapter caseSMParameter(SMParameter object) {
			return createSMParameterAdapter();
		}

		@Override
		public Adapter caseSMTypedElement(SMTypedElement object) {
			return createSMTypedElementAdapter();
		}

		@Override
		public Adapter caseSMReturn(SMReturn object) {
			return createSMReturnAdapter();
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link simk.SIMKModel <em>SIMK Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simk.SIMKModel
	 * @generated
	 */
	public Adapter createSIMKModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simk.SMClass <em>SM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simk.SMClass
	 * @generated
	 */
	public Adapter createSMClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simk.SMMethod <em>SM Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simk.SMMethod
	 * @generated
	 */
	public Adapter createSMMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simk.SMContext <em>SM Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simk.SMContext
	 * @generated
	 */
	public Adapter createSMContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simk.SMNamedElement <em>SM Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simk.SMNamedElement
	 * @generated
	 */
	public Adapter createSMNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simk.SMParameter <em>SM Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simk.SMParameter
	 * @generated
	 */
	public Adapter createSMParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simk.SMTypedElement <em>SM Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simk.SMTypedElement
	 * @generated
	 */
	public Adapter createSMTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simk.SMReturn <em>SM Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simk.SMReturn
	 * @generated
	 */
	public Adapter createSMReturnAdapter() {
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
	public Adapter createObjectAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimkAdapterFactory
