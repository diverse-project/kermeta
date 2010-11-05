/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.implem_relaxed.util;

import art_relaxed.AspectModelElement;

import art_relaxed.implem_relaxed.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see art_relaxed.implem_relaxed.Implem_relaxedPackage
 * @generated
 */
public class Implem_relaxedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Implem_relaxedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implem_relaxedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Implem_relaxedPackage.eINSTANCE;
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
	protected Implem_relaxedSwitch<Adapter> modelSwitch =
		new Implem_relaxedSwitch<Adapter>() {
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
			public Adapter caseTypeImplementation(TypeImplementation object) {
				return createTypeImplementationAdapter();
			}
			@Override
			public Adapter caseOSGiType(OSGiType object) {
				return createOSGiTypeAdapter();
			}
			@Override
			public Adapter caseAspectModelElement(AspectModelElement object) {
				return createAspectModelElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link art_relaxed.implem_relaxed.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.implem_relaxed.ComponentImplementation
	 * @generated
	 */
	public Adapter createComponentImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.implem_relaxed.FractalComponent <em>Fractal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.implem_relaxed.FractalComponent
	 * @generated
	 */
	public Adapter createFractalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.implem_relaxed.OSGiComponent <em>OS Gi Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.implem_relaxed.OSGiComponent
	 * @generated
	 */
	public Adapter createOSGiComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.implem_relaxed.TypeImplementation <em>Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.implem_relaxed.TypeImplementation
	 * @generated
	 */
	public Adapter createTypeImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.implem_relaxed.OSGiType <em>OS Gi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.implem_relaxed.OSGiType
	 * @generated
	 */
	public Adapter createOSGiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.AspectModelElement <em>Aspect Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.AspectModelElement
	 * @generated
	 */
	public Adapter createAspectModelElementAdapter() {
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

} //Implem_relaxedAdapterFactory
