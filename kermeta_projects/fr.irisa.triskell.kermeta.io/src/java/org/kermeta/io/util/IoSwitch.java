/**
 * <copyright>
 * </copyright>
 *
 * $Id: IoSwitch.java,v 1.10 2008-04-28 11:50:19 ftanguy Exp $
 */
package org.kermeta.io.util;


import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.*;
import org.kermeta.io.ErrorMessage;
import org.kermeta.io.IBuildingState;
import org.kermeta.io.IoPackage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitLoader;
import org.kermeta.io.KermetaUnitRequire;
import org.kermeta.io.Message;
import org.kermeta.io.PackageEntry;
import org.kermeta.io.ParseErrorMessage;
import org.kermeta.io.ParsingError;
import org.kermeta.io.TypeDefinitionCache;
import org.kermeta.io.TypeDefinitionCacheEntry;
import org.kermeta.io.WarningMessage;

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
 * @see org.kermeta.io.IoPackage
 * @generated
 */
public class IoSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoSwitch() {
		if (modelPackage == null) {
			modelPackage = IoPackage.eINSTANCE;
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
			case IoPackage.KERMETA_UNIT: {
				KermetaUnit kermetaUnit = (KermetaUnit)theEObject;
				T result = caseKermetaUnit(kermetaUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.IBUILDING_STATE: {
				IBuildingState iBuildingState = (IBuildingState)theEObject;
				T result = caseIBuildingState(iBuildingState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.PACKAGE_ENTRY: {
				PackageEntry packageEntry = (PackageEntry)theEObject;
				T result = casePackageEntry(packageEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.KERMETA_UNIT_LOADER: {
				KermetaUnitLoader kermetaUnitLoader = (KermetaUnitLoader)theEObject;
				T result = caseKermetaUnitLoader(kermetaUnitLoader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.ERROR_MESSAGE: {
				ErrorMessage errorMessage = (ErrorMessage)theEObject;
				T result = caseErrorMessage(errorMessage);
				if (result == null) result = caseMessage(errorMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.WARNING_MESSAGE: {
				WarningMessage warningMessage = (WarningMessage)theEObject;
				T result = caseWarningMessage(warningMessage);
				if (result == null) result = caseMessage(warningMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.PARSE_ERROR_MESSAGE: {
				ParseErrorMessage parseErrorMessage = (ParseErrorMessage)theEObject;
				T result = caseParseErrorMessage(parseErrorMessage);
				if (result == null) result = caseErrorMessage(parseErrorMessage);
				if (result == null) result = caseMessage(parseErrorMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.PARSING_ERROR: {
				ParsingError parsingError = (ParsingError)theEObject;
				T result = caseParsingError(parsingError);
				if (result == null) result = caseErrorMessage(parsingError);
				if (result == null) result = caseMessage(parsingError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.TYPE_DEFINITION_CACHE: {
				TypeDefinitionCache typeDefinitionCache = (TypeDefinitionCache)theEObject;
				T result = caseTypeDefinitionCache(typeDefinitionCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.TYPE_DEFINITION_CACHE_ENTRY: {
				TypeDefinitionCacheEntry typeDefinitionCacheEntry = (TypeDefinitionCacheEntry)theEObject;
				T result = caseTypeDefinitionCacheEntry(typeDefinitionCacheEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.KERMETA_UNIT_REQUIRE: {
				KermetaUnitRequire kermetaUnitRequire = (KermetaUnitRequire)theEObject;
				T result = caseKermetaUnitRequire(kermetaUnitRequire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.TYPE_DEFINITION_CONTEXT: {
				TypeDefinitionContext typeDefinitionContext = (TypeDefinitionContext)theEObject;
				T result = caseTypeDefinitionContext(typeDefinitionContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kermeta Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kermeta Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKermetaUnit(KermetaUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageEntry(PackageEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBuilding State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBuilding State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBuildingState(IBuildingState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kermeta Unit Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kermeta Unit Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKermetaUnitLoader(KermetaUnitLoader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorMessage(ErrorMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Warning Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Warning Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWarningMessage(WarningMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parse Error Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parse Error Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParseErrorMessage(ParseErrorMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parsing Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parsing Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParsingError(ParsingError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinitionCache(TypeDefinitionCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition Cache Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition Cache Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinitionCacheEntry(TypeDefinitionCacheEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kermeta Unit Require</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kermeta Unit Require</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKermetaUnitRequire(KermetaUnitRequire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinitionContext(TypeDefinitionContext object) {
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

} //IoSwitch
