/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExceptionAdapterFactory.java,v 1.2 2008-09-11 12:35:02 cfaucher Exp $
 */
package km2ecore.common.exception.util;

import km2ecore.common.exception.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see km2ecore.common.exception.ExceptionPackage
 * @generated
 */
public class ExceptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExceptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExceptionPackage.eINSTANCE;
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
	protected ExceptionSwitch<Adapter> modelSwitch = new ExceptionSwitch<Adapter>() {
		@Override
		public Adapter caseUndefinedUriEPackageException(
				UndefinedUriEPackageException object) {
			return createUndefinedUriEPackageExceptionAdapter();
		}

		@Override
		public Adapter caseUndefinedValueTypeInstanceClassNameException(
				UndefinedValueTypeInstanceClassNameException object) {
			return createUndefinedValueTypeInstanceClassNameExceptionAdapter();
		}

		@Override
		public Adapter caseObject(kermeta.language.structure.Object object) {
			return createObjectAdapter();
		}

		@Override
		public Adapter caseException(kermeta.exceptions.Exception object) {
			return createExceptionAdapter();
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
	 * Creates a new adapter for an object of class '{@link km2ecore.common.exception.UndefinedUriEPackageException <em>Undefined Uri EPackage Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see km2ecore.common.exception.UndefinedUriEPackageException
	 * @generated
	 */
	public Adapter createUndefinedUriEPackageExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException <em>Undefined Value Type Instance Class Name Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException
	 * @generated
	 */
	public Adapter createUndefinedValueTypeInstanceClassNameExceptionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
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

} //ExceptionAdapterFactory
