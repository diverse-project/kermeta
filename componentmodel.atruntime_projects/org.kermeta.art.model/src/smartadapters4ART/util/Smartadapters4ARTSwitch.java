/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import smartadapters4ART.*;

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
 * @see smartadapters4ART.Smartadapters4ARTPackage
 * @generated
 */
public class Smartadapters4ARTSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Smartadapters4ARTPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smartadapters4ARTSwitch() {
		if (modelPackage == null) {
			modelPackage = Smartadapters4ARTPackage.eINSTANCE;
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
			case Smartadapters4ARTPackage.ASPECT: {
				Aspect aspect = (Aspect)theEObject;
				T result = caseAspect(aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.ADAPTATION: {
				Adaptation adaptation = (Adaptation)theEObject;
				T result = caseAdaptation(adaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.CLONE_ADAPTATION: {
				CloneAdaptation cloneAdaptation = (CloneAdaptation)theEObject;
				T result = caseCloneAdaptation(cloneAdaptation);
				if (result == null) result = caseAdaptation(cloneAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.CREATE_ADAPTATION: {
				CreateAdaptation createAdaptation = (CreateAdaptation)theEObject;
				T result = caseCreateAdaptation(createAdaptation);
				if (result == null) result = caseAdaptation(createAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.SET_ADAPTATION: {
				SetAdaptation setAdaptation = (SetAdaptation)theEObject;
				T result = caseSetAdaptation(setAdaptation);
				if (result == null) result = caseAdaptation(setAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.UNSET_ADAPTATION: {
				UnsetAdaptation unsetAdaptation = (UnsetAdaptation)theEObject;
				T result = caseUnsetAdaptation(unsetAdaptation);
				if (result == null) result = caseAdaptation(unsetAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.ADVICE_MODEL: {
				AdviceModel adviceModel = (AdviceModel)theEObject;
				T result = caseAdviceModel(adviceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.POINTCUT_MODEL: {
				PointcutModel pointcutModel = (PointcutModel)theEObject;
				T result = casePointcutModel(pointcutModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.INSTANTIATION_STRATEGY: {
				InstantiationStrategy instantiationStrategy = (InstantiationStrategy)theEObject;
				T result = caseInstantiationStrategy(instantiationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.GLOBAL_INSTANTIATION: {
				GlobalInstantiation globalInstantiation = (GlobalInstantiation)theEObject;
				T result = caseGlobalInstantiation(globalInstantiation);
				if (result == null) result = caseInstantiationStrategy(globalInstantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.SCOPED_INSTANTIATION: {
				ScopedInstantiation scopedInstantiation = (ScopedInstantiation)theEObject;
				T result = caseScopedInstantiation(scopedInstantiation);
				if (result == null) result = caseInstantiationStrategy(scopedInstantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.PER_ROLE_MATCH: {
				PerRoleMatch perRoleMatch = (PerRoleMatch)theEObject;
				T result = casePerRoleMatch(perRoleMatch);
				if (result == null) result = caseScopedInstantiation(perRoleMatch);
				if (result == null) result = caseInstantiationStrategy(perRoleMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smartadapters4ARTPackage.PER_ELEMENT_MATCH: {
				PerElementMatch perElementMatch = (PerElementMatch)theEObject;
				T result = casePerElementMatch(perElementMatch);
				if (result == null) result = caseScopedInstantiation(perElementMatch);
				if (result == null) result = caseInstantiationStrategy(perElementMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspect(Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptation(Adaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clone Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clone Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloneAdaptation(CloneAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAdaptation(CreateAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetAdaptation(SetAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unset Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unset Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsetAdaptation(UnsetAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advice Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advice Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdviceModel(AdviceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointcut Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointcut Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointcutModel(PointcutModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantiation Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantiation Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantiationStrategy(InstantiationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalInstantiation(GlobalInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedInstantiation(ScopedInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Role Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Role Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerRoleMatch(PerRoleMatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Element Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Element Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerElementMatch(PerElementMatch object) {
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

} //Smartadapters4ARTSwitch
