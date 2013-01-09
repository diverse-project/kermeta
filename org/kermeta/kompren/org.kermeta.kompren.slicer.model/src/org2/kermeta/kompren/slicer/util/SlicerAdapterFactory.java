/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicer.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org2.kermeta.kompren.slicer.*;
import org2.kermeta.kompren.slicer.Constraint;
import org2.kermeta.kompren.slicer.OppositeCreation;
import org2.kermeta.kompren.slicer.Radius;
import org2.kermeta.kompren.slicer.SlicedClass;
import org2.kermeta.kompren.slicer.SlicedElement;
import org2.kermeta.kompren.slicer.SlicedProperty;
import org2.kermeta.kompren.slicer.Slicer;
import org2.kermeta.kompren.slicer.SlicerPackage;
import org2.kermeta.kompren.slicer.VarDecl;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org2.kermeta.kompren.slicer.SlicerPackage
 * @generated
 */
public class SlicerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "INRIA/IRISA\nTriskell Team";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SlicerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SlicerPackage.eINSTANCE;
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
	protected SlicerSwitch<Adapter> modelSwitch =
		new SlicerSwitch<Adapter>() {
			@Override
			public Adapter caseSlicer(Slicer object) {
				return createSlicerAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseRadius(Radius object) {
				return createRadiusAdapter();
			}
			@Override
			public Adapter caseSlicedClass(SlicedClass object) {
				return createSlicedClassAdapter();
			}
			@Override
			public Adapter caseSlicedProperty(SlicedProperty object) {
				return createSlicedPropertyAdapter();
			}
			@Override
			public Adapter caseOppositeCreation(OppositeCreation object) {
				return createOppositeCreationAdapter();
			}
			@Override
			public Adapter caseSlicedElement(SlicedElement object) {
				return createSlicedElementAdapter();
			}
			@Override
			public Adapter caseVarDecl(VarDecl object) {
				return createVarDeclAdapter();
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
	 * Creates a new adapter for an object of class '{@link org2.kermeta.kompren.slicer.Slicer <em>Slicer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org2.kermeta.kompren.slicer.Slicer
	 * @generated
	 */
	public Adapter createSlicerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org2.kermeta.kompren.slicer.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org2.kermeta.kompren.slicer.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org2.kermeta.kompren.slicer.Radius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org2.kermeta.kompren.slicer.Radius
	 * @generated
	 */
	public Adapter createRadiusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org2.kermeta.kompren.slicer.SlicedClass <em>Sliced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org2.kermeta.kompren.slicer.SlicedClass
	 * @generated
	 */
	public Adapter createSlicedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org2.kermeta.kompren.slicer.SlicedProperty <em>Sliced Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org2.kermeta.kompren.slicer.SlicedProperty
	 * @generated
	 */
	public Adapter createSlicedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org2.kermeta.kompren.slicer.OppositeCreation <em>Opposite Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org2.kermeta.kompren.slicer.OppositeCreation
	 * @generated
	 */
	public Adapter createOppositeCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org2.kermeta.kompren.slicer.SlicedElement <em>Sliced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org2.kermeta.kompren.slicer.SlicedElement
	 * @generated
	 */
	public Adapter createSlicedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org2.kermeta.kompren.slicer.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org2.kermeta.kompren.slicer.VarDecl
	 * @generated
	 */
	public Adapter createVarDeclAdapter() {
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

} //SlicerAdapterFactory
