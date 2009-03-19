/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferenceSwitch.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import emf.spoon.reflect.reference.CtArrayTypeReference;
import emf.spoon.reflect.reference.CtExecutableReference;
import emf.spoon.reflect.reference.CtFieldReference;
import emf.spoon.reflect.reference.CtGenericElementReference;
import emf.spoon.reflect.reference.CtLocalVariableReference;
import emf.spoon.reflect.reference.CtPackageReference;
import emf.spoon.reflect.reference.CtParameterReference;
import emf.spoon.reflect.reference.CtReference;
import emf.spoon.reflect.reference.CtTypeParameterReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.CtVariableReference;
import emf.spoon.reflect.reference.ReferencePackage;

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
 * @see emf.spoon.reflect.reference.ReferencePackage
 * @generated
 */
public class ReferenceSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReferencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSwitch() {
		if (modelPackage == null) {
			modelPackage = ReferencePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE: {
				CtArrayTypeReference ctArrayTypeReference = (CtArrayTypeReference)theEObject;
				Object result = caseCtArrayTypeReference(ctArrayTypeReference);
				if (result == null) result = caseCtTypeReference(ctArrayTypeReference);
				if (result == null) result = caseFacade_CtArrayTypeReference(ctArrayTypeReference);
				if (result == null) result = caseCtGenericElementReference(ctArrayTypeReference);
				if (result == null) result = caseCtReference(ctArrayTypeReference);
				if (result == null) result = caseFacade_CtTypeReference(ctArrayTypeReference);
				if (result == null) result = caseFacade_CtGenericElementReference(ctArrayTypeReference);
				if (result == null) result = caseFacade_CtReference(ctArrayTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencePackage.CT_EXECUTABLE_REFERENCE: {
				CtExecutableReference ctExecutableReference = (CtExecutableReference)theEObject;
				Object result = caseCtExecutableReference(ctExecutableReference);
				if (result == null) result = caseCtGenericElementReference(ctExecutableReference);
				if (result == null) result = caseCtReference(ctExecutableReference);
				if (result == null) result = caseFacade_CtExecutableReference(ctExecutableReference);
				if (result == null) result = caseFacade_CtGenericElementReference(ctExecutableReference);
				if (result == null) result = caseFacade_CtReference(ctExecutableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencePackage.CT_FIELD_REFERENCE: {
				CtFieldReference ctFieldReference = (CtFieldReference)theEObject;
				Object result = caseCtFieldReference(ctFieldReference);
				if (result == null) result = caseCtVariableReference(ctFieldReference);
				if (result == null) result = caseFacade_CtFieldReference(ctFieldReference);
				if (result == null) result = caseCtReference(ctFieldReference);
				if (result == null) result = caseFacade_CtVariableReference(ctFieldReference);
				if (result == null) result = caseFacade_CtReference(ctFieldReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencePackage.CT_GENERIC_ELEMENT_REFERENCE: {
				CtGenericElementReference ctGenericElementReference = (CtGenericElementReference)theEObject;
				Object result = caseCtGenericElementReference(ctGenericElementReference);
				if (result == null) result = caseFacade_CtGenericElementReference(ctGenericElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencePackage.CT_LOCAL_VARIABLE_REFERENCE: {
				CtLocalVariableReference ctLocalVariableReference = (CtLocalVariableReference)theEObject;
				Object result = caseCtLocalVariableReference(ctLocalVariableReference);
				if (result == null) result = caseCtVariableReference(ctLocalVariableReference);
				if (result == null) result = caseFacade_CtLocalVariableReference(ctLocalVariableReference);
				if (result == null) result = caseCtReference(ctLocalVariableReference);
				if (result == null) result = caseFacade_CtVariableReference(ctLocalVariableReference);
				if (result == null) result = caseFacade_CtReference(ctLocalVariableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencePackage.CT_PACKAGE_REFERENCE: {
				CtPackageReference ctPackageReference = (CtPackageReference)theEObject;
				Object result = caseCtPackageReference(ctPackageReference);
				if (result == null) result = caseCtReference(ctPackageReference);
				if (result == null) result = caseFacade_CtPackageReference(ctPackageReference);
				if (result == null) result = caseFacade_CtReference(ctPackageReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencePackage.CT_PARAMETER_REFERENCE: {
				CtParameterReference ctParameterReference = (CtParameterReference)theEObject;
				Object result = caseCtParameterReference(ctParameterReference);
				if (result == null) result = caseCtVariableReference(ctParameterReference);
				if (result == null) result = caseFacade_CtParameterReference(ctParameterReference);
				if (result == null) result = caseCtReference(ctParameterReference);
				if (result == null) result = caseFacade_CtVariableReference(ctParameterReference);
				if (result == null) result = caseFacade_CtReference(ctParameterReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencePackage.CT_REFERENCE: {
				CtReference ctReference = (CtReference)theEObject;
				Object result = caseCtReference(ctReference);
				if (result == null) result = caseFacade_CtReference(ctReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE: {
				CtTypeParameterReference ctTypeParameterReference = (CtTypeParameterReference)theEObject;
				Object result = caseCtTypeParameterReference(ctTypeParameterReference);
				if (result == null) result = caseCtTypeReference(ctTypeParameterReference);
				if (result == null) result = caseFacade_CtTypeParameterReference(ctTypeParameterReference);
				if (result == null) result = caseCtGenericElementReference(ctTypeParameterReference);
				if (result == null) result = caseCtReference(ctTypeParameterReference);
				if (result == null) result = caseFacade_CtTypeReference(ctTypeParameterReference);
				if (result == null) result = caseFacade_CtGenericElementReference(ctTypeParameterReference);
				if (result == null) result = caseFacade_CtReference(ctTypeParameterReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencePackage.CT_TYPE_REFERENCE: {
				CtTypeReference ctTypeReference = (CtTypeReference)theEObject;
				Object result = caseCtTypeReference(ctTypeReference);
				if (result == null) result = caseCtGenericElementReference(ctTypeReference);
				if (result == null) result = caseCtReference(ctTypeReference);
				if (result == null) result = caseFacade_CtTypeReference(ctTypeReference);
				if (result == null) result = caseFacade_CtGenericElementReference(ctTypeReference);
				if (result == null) result = caseFacade_CtReference(ctTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferencePackage.CT_VARIABLE_REFERENCE: {
				CtVariableReference ctVariableReference = (CtVariableReference)theEObject;
				Object result = caseCtVariableReference(ctVariableReference);
				if (result == null) result = caseCtReference(ctVariableReference);
				if (result == null) result = caseFacade_CtVariableReference(ctVariableReference);
				if (result == null) result = caseFacade_CtReference(ctVariableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Array Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Array Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtArrayTypeReference(CtArrayTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Executable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Executable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtExecutableReference(CtExecutableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Field Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Field Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtFieldReference(CtFieldReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Generic Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Generic Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtGenericElementReference(CtGenericElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Local Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Local Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtLocalVariableReference(CtLocalVariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Package Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Package Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtPackageReference(CtPackageReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Parameter Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtParameterReference(CtParameterReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtReference(CtReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Type Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Type Parameter Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtTypeParameterReference(CtTypeParameterReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtTypeReference(CtTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtVariableReference(CtVariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Generic Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Generic Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtGenericElementReference(spoon.reflect.reference.CtGenericElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtReference(spoon.reflect.reference.CtReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtTypeReference(spoon.reflect.reference.CtTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Array Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Array Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtArrayTypeReference(spoon.reflect.reference.CtArrayTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Executable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Executable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtExecutableReference(spoon.reflect.reference.CtExecutableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtVariableReference(spoon.reflect.reference.CtVariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Field Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Field Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtFieldReference(spoon.reflect.reference.CtFieldReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Local Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Local Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtLocalVariableReference(spoon.reflect.reference.CtLocalVariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Package Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Package Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtPackageReference(spoon.reflect.reference.CtPackageReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Parameter Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtParameterReference(spoon.reflect.reference.CtParameterReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Type Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Type Parameter Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtTypeParameterReference(spoon.reflect.reference.CtTypeParameterReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ReferenceSwitch
