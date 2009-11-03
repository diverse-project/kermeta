/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.implem.util;

import art.implem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see art.implem.ImplemPackage
 * @generated
 */
public class ImplemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImplemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImplemPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplemSwitch<Adapter> modelSwitch =
		new ImplemSwitch<Adapter>() {
			@Override
			public Adapter caseComponentImplementation(ComponentImplementation object) {
				return createComponentImplementationAdapter();
			}
			@Override
			public Adapter caseFractalComponent(FractalComponent object) {
				return createFractalComponentAdapter();
			}
			@Override
			public Adapter caseOSGiComponent(OSGiComponent object) {
				return createOSGiComponentAdapter();
			}
			@Override
			public Adapter casePortImplementation(PortImplementation object) {
				return createPortImplementationAdapter();
			}
			@Override
			public Adapter caseOSGiPort(OSGiPort object) {
				return createOSGiPortAdapter();
			}
			@Override
			public Adapter caseTypeImplementation(TypeImplementation object) {
				return createTypeImplementationAdapter();
			}
			@Override
			public Adapter caseOSGiType(OSGiType object) {
				return createOSGiTypeAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link art.implem.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art.implem.ComponentImplementation
	 * @generated
	 */
	public Adapter createComponentImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art.implem.FractalComponent <em>Fractal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art.implem.FractalComponent
	 * @generated
	 */
	public Adapter createFractalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art.implem.OSGiComponent <em>OS Gi Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art.implem.OSGiComponent
	 * @generated
	 */
	public Adapter createOSGiComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art.implem.PortImplementation <em>Port Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art.implem.PortImplementation
	 * @generated
	 */
	public Adapter createPortImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art.implem.OSGiPort <em>OS Gi Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art.implem.OSGiPort
	 * @generated
	 */
	public Adapter createOSGiPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art.implem.TypeImplementation <em>Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art.implem.TypeImplementation
	 * @generated
	 */
	public Adapter createTypeImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art.implem.OSGiType <em>OS Gi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art.implem.OSGiType
	 * @generated
	 */
	public Adapter createOSGiTypeAdapter() {
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

} //ImplemAdapterFactory
