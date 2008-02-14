/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoaderSwitch.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
 */
package org.kermeta.io.loader.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.kermeta.io.loader.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.kermeta.io.loader.LoaderPackage
 * @generated
 */
public class LoaderSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LoaderPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoaderSwitch() {
		if (modelPackage == null) {
			modelPackage = LoaderPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LoaderPackage.LOADING_STEP: {
				LoadingStep loadingStep = (LoadingStep)theEObject;
				T result = caseLoadingStep(loadingStep);
				if (result == null) result = caseAbstractStep(loadingStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoaderPackage.LOADER: {
				Loader loader = (Loader)theEObject;
				T result = caseLoader(loader);
				if (result == null) result = caseAbstractStep(loader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoaderPackage.KMT_LOADER: {
				KMTLoader kmtLoader = (KMTLoader)theEObject;
				T result = caseKMTLoader(kmtLoader);
				if (result == null) result = caseLoader(kmtLoader);
				if (result == null) result = caseAbstractStep(kmtLoader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoaderPackage.ECORE_LOADER: {
				EcoreLoader ecoreLoader = (EcoreLoader)theEObject;
				T result = caseEcoreLoader(ecoreLoader);
				if (result == null) result = caseLoader(ecoreLoader);
				if (result == null) result = caseAbstractStep(ecoreLoader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoaderPackage.KM_LOADER: {
				KMLoader kmLoader = (KMLoader)theEObject;
				T result = caseKMLoader(kmLoader);
				if (result == null) result = caseLoader(kmLoader);
				if (result == null) result = caseAbstractStep(kmLoader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoaderPackage.LOADING_CONTEXT: {
				LoadingContext loadingContext = (LoadingContext)theEObject;
				T result = caseLoadingContext(loadingContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoaderPackage.ILOADING_DATAS: {
				ILoadingDatas iLoadingDatas = (ILoadingDatas)theEObject;
				T result = caseILoadingDatas(iLoadingDatas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoaderPackage.ABSTRACT_STEP: {
				AbstractStep abstractStep = (AbstractStep)theEObject;
				T result = caseAbstractStep(abstractStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoaderPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loading Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loading Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadingStep(LoadingStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoader(Loader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KMT Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KMT Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKMTLoader(KMTLoader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreLoader(EcoreLoader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KM Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KM Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKMLoader(KMLoader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loading Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loading Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadingContext(LoadingContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILoading Datas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILoading Datas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILoadingDatas(ILoadingDatas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStep(AbstractStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //LoaderSwitch
