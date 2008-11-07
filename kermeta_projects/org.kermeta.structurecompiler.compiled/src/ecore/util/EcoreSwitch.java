/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreSwitch.java,v 1.8 2008-11-07 08:54:12 cfaucher Exp $
 */
package ecore.util;

import ecore.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see ecore.EcorePackage
 * @generated
 */
public class EcoreSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreSwitch() {
		if (modelPackage == null) {
			modelPackage = EcorePackage.eINSTANCE;
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
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
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
		case EcorePackage.EATTRIBUTE: {
			EAttribute eAttribute = (EAttribute) theEObject;
			T result = caseEAttribute(eAttribute);
			if (result == null)
				result = caseEStructuralFeature(eAttribute);
			if (result == null)
				result = caseETypedElement(eAttribute);
			if (result == null)
				result = caseENamedElement(eAttribute);
			if (result == null)
				result = caseEModelElement(eAttribute);
			if (result == null)
				result = caseEObject(eAttribute);
			if (result == null)
				result = caseObject(eAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EANNOTATION: {
			EAnnotation eAnnotation = (EAnnotation) theEObject;
			T result = caseEAnnotation(eAnnotation);
			if (result == null)
				result = caseEModelElement(eAnnotation);
			if (result == null)
				result = caseEObject(eAnnotation);
			if (result == null)
				result = caseObject(eAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.ECLASS: {
			ecore.EClass eClass = (ecore.EClass) theEObject;
			T result = caseEClass(eClass);
			if (result == null)
				result = caseEClassifier(eClass);
			if (result == null)
				result = caseENamedElement(eClass);
			if (result == null)
				result = caseEModelElement(eClass);
			if (result == null)
				result = caseEObject(eClass);
			if (result == null)
				result = caseObject(eClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.ECLASSIFIER: {
			EClassifier eClassifier = (EClassifier) theEObject;
			T result = caseEClassifier(eClassifier);
			if (result == null)
				result = caseENamedElement(eClassifier);
			if (result == null)
				result = caseEModelElement(eClassifier);
			if (result == null)
				result = caseEObject(eClassifier);
			if (result == null)
				result = caseObject(eClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EDATA_TYPE: {
			EDataType eDataType = (EDataType) theEObject;
			T result = caseEDataType(eDataType);
			if (result == null)
				result = caseEClassifier(eDataType);
			if (result == null)
				result = caseENamedElement(eDataType);
			if (result == null)
				result = caseEModelElement(eDataType);
			if (result == null)
				result = caseEObject(eDataType);
			if (result == null)
				result = caseObject(eDataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EENUM: {
			EEnum eEnum = (EEnum) theEObject;
			T result = caseEEnum(eEnum);
			if (result == null)
				result = caseEDataType(eEnum);
			if (result == null)
				result = caseEClassifier(eEnum);
			if (result == null)
				result = caseENamedElement(eEnum);
			if (result == null)
				result = caseEModelElement(eEnum);
			if (result == null)
				result = caseEObject(eEnum);
			if (result == null)
				result = caseObject(eEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EENUM_LITERAL: {
			EEnumLiteral eEnumLiteral = (EEnumLiteral) theEObject;
			T result = caseEEnumLiteral(eEnumLiteral);
			if (result == null)
				result = caseENamedElement(eEnumLiteral);
			if (result == null)
				result = caseEModelElement(eEnumLiteral);
			if (result == null)
				result = caseEObject(eEnumLiteral);
			if (result == null)
				result = caseObject(eEnumLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EFACTORY: {
			EFactory eFactory = (EFactory) theEObject;
			T result = caseEFactory(eFactory);
			if (result == null)
				result = caseEModelElement(eFactory);
			if (result == null)
				result = caseEObject(eFactory);
			if (result == null)
				result = caseObject(eFactory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EMODEL_ELEMENT: {
			EModelElement eModelElement = (EModelElement) theEObject;
			T result = caseEModelElement(eModelElement);
			if (result == null)
				result = caseEObject(eModelElement);
			if (result == null)
				result = caseObject(eModelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.ENAMED_ELEMENT: {
			ENamedElement eNamedElement = (ENamedElement) theEObject;
			T result = caseENamedElement(eNamedElement);
			if (result == null)
				result = caseEModelElement(eNamedElement);
			if (result == null)
				result = caseEObject(eNamedElement);
			if (result == null)
				result = caseObject(eNamedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EOBJECT: {
			ecore.EObject eObject = (ecore.EObject) theEObject;
			T result = caseEObject(eObject);
			if (result == null)
				result = caseObject(eObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EOPERATION: {
			EOperation eOperation = (EOperation) theEObject;
			T result = caseEOperation(eOperation);
			if (result == null)
				result = caseETypedElement(eOperation);
			if (result == null)
				result = caseENamedElement(eOperation);
			if (result == null)
				result = caseEModelElement(eOperation);
			if (result == null)
				result = caseEObject(eOperation);
			if (result == null)
				result = caseObject(eOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EPACKAGE: {
			EPackage ePackage = (EPackage) theEObject;
			T result = caseEPackage(ePackage);
			if (result == null)
				result = caseENamedElement(ePackage);
			if (result == null)
				result = caseEModelElement(ePackage);
			if (result == null)
				result = caseEObject(ePackage);
			if (result == null)
				result = caseObject(ePackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EPARAMETER: {
			EParameter eParameter = (EParameter) theEObject;
			T result = caseEParameter(eParameter);
			if (result == null)
				result = caseETypedElement(eParameter);
			if (result == null)
				result = caseENamedElement(eParameter);
			if (result == null)
				result = caseEModelElement(eParameter);
			if (result == null)
				result = caseEObject(eParameter);
			if (result == null)
				result = caseObject(eParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EREFERENCE: {
			EReference eReference = (EReference) theEObject;
			T result = caseEReference(eReference);
			if (result == null)
				result = caseEStructuralFeature(eReference);
			if (result == null)
				result = caseETypedElement(eReference);
			if (result == null)
				result = caseENamedElement(eReference);
			if (result == null)
				result = caseEModelElement(eReference);
			if (result == null)
				result = caseEObject(eReference);
			if (result == null)
				result = caseObject(eReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.ESTRUCTURAL_FEATURE: {
			EStructuralFeature eStructuralFeature = (EStructuralFeature) theEObject;
			T result = caseEStructuralFeature(eStructuralFeature);
			if (result == null)
				result = caseETypedElement(eStructuralFeature);
			if (result == null)
				result = caseENamedElement(eStructuralFeature);
			if (result == null)
				result = caseEModelElement(eStructuralFeature);
			if (result == null)
				result = caseEObject(eStructuralFeature);
			if (result == null)
				result = caseObject(eStructuralFeature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.ETYPED_ELEMENT: {
			ETypedElement eTypedElement = (ETypedElement) theEObject;
			T result = caseETypedElement(eTypedElement);
			if (result == null)
				result = caseENamedElement(eTypedElement);
			if (result == null)
				result = caseEModelElement(eTypedElement);
			if (result == null)
				result = caseEObject(eTypedElement);
			if (result == null)
				result = caseObject(eTypedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY: {
			EStringToStringMapEntry eStringToStringMapEntry = (EStringToStringMapEntry) theEObject;
			T result = caseEStringToStringMapEntry(eStringToStringMapEntry);
			if (result == null)
				result = caseObject(eStringToStringMapEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.EGENERIC_TYPE: {
			EGenericType eGenericType = (EGenericType) theEObject;
			T result = caseEGenericType(eGenericType);
			if (result == null)
				result = caseEObject(eGenericType);
			if (result == null)
				result = caseObject(eGenericType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcorePackage.ETYPE_PARAMETER: {
			ETypeParameter eTypeParameter = (ETypeParameter) theEObject;
			T result = caseETypeParameter(eTypeParameter);
			if (result == null)
				result = caseENamedElement(eTypeParameter);
			if (result == null)
				result = caseEModelElement(eTypeParameter);
			if (result == null)
				result = caseEObject(eTypeParameter);
			if (result == null)
				result = caseObject(eTypeParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAttribute(EAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAnnotation(EAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClass(ecore.EClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassifier(EClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDataType(EDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnum(EEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnumLiteral(EEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFactory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFactory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFactory(EFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObject(ecore.EObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEOperation(EOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPackage(EPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEParameter(EParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReference(EReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeature(EStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypedElement(ETypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToStringMapEntry(EStringToStringMapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGeneric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGenericType(EGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EType Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EType Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypeParameter(ETypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(kermeta.language.structure.Object object) {
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

} //EcoreSwitch
