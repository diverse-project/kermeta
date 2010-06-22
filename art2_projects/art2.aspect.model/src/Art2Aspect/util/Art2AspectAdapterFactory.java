/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect.util;

import Art2Aspect.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Art2Aspect.Art2AspectPackage
 * @generated
 */
public class Art2AspectAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Art2AspectPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2AspectAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Art2AspectPackage.eINSTANCE;
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
	protected Art2AspectSwitch modelSwitch =
		new Art2AspectSwitch() {
			public Object caseAspectRoot(AspectRoot object) {
				return createAspectRootAdapter();
			}
			public Object caseAspectDefinition(AspectDefinition object) {
				return createAspectDefinitionAdapter();
			}
			public Object casePointcutDefinition(PointcutDefinition object) {
				return createPointcutDefinitionAdapter();
			}
			public Object caseBindingPattern(BindingPattern object) {
				return createBindingPatternAdapter();
			}
			public Object caseComponentTypePattern(ComponentTypePattern object) {
				return createComponentTypePatternAdapter();
			}
			public Object caseNodePattern(NodePattern object) {
				return createNodePatternAdapter();
			}
			public Object casePortPattern(PortPattern object) {
				return createPortPatternAdapter();
			}
			public Object caseComponentPattern(ComponentPattern object) {
				return createComponentPatternAdapter();
			}
			public Object casePortTypePattern(PortTypePattern object) {
				return createPortTypePatternAdapter();
			}
			public Object casePortTypeRefPattern(PortTypeRefPattern object) {
				return createPortTypeRefPatternAdapter();
			}
			public Object casePatternNamedElement(PatternNamedElement object) {
				return createPatternNamedElementAdapter();
			}
			public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.AspectRoot <em>Aspect Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.AspectRoot
	 * @generated
	 */
	public Adapter createAspectRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.AspectDefinition <em>Aspect Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.AspectDefinition
	 * @generated
	 */
	public Adapter createAspectDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.PointcutDefinition <em>Pointcut Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.PointcutDefinition
	 * @generated
	 */
	public Adapter createPointcutDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.BindingPattern <em>Binding Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.BindingPattern
	 * @generated
	 */
	public Adapter createBindingPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.ComponentTypePattern <em>Component Type Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.ComponentTypePattern
	 * @generated
	 */
	public Adapter createComponentTypePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.NodePattern <em>Node Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.NodePattern
	 * @generated
	 */
	public Adapter createNodePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.PortPattern <em>Port Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.PortPattern
	 * @generated
	 */
	public Adapter createPortPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.ComponentPattern <em>Component Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.ComponentPattern
	 * @generated
	 */
	public Adapter createComponentPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.PortTypePattern <em>Port Type Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.PortTypePattern
	 * @generated
	 */
	public Adapter createPortTypePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.PortTypeRefPattern <em>Port Type Ref Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.PortTypeRefPattern
	 * @generated
	 */
	public Adapter createPortTypeRefPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Art2Aspect.PatternNamedElement <em>Pattern Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Art2Aspect.PatternNamedElement
	 * @generated
	 */
	public Adapter createPatternNamedElementAdapter() {
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

} //Art2AspectAdapterFactory
