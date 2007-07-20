/**
 * <copyright>
 * </copyright>
 *
 * $Id: IoSwitch.java,v 1.2 2007-07-20 15:08:16 ftanguy Exp $
 */
package org.kermeta.io.util;


import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.*;

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
public class IoSwitch {
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
			case IoPackage.KERMETA_UNIT: {
				KermetaUnit kermetaUnit = (KermetaUnit)theEObject;
				Object result = caseKermetaUnit(kermetaUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.IBUILDING_STATE: {
				IBuildingState iBuildingState = (IBuildingState)theEObject;
				Object result = caseIBuildingState(iBuildingState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.KERMETA_UNIT_STORER: {
				KermetaUnitStorer kermetaUnitStorer = (KermetaUnitStorer)theEObject;
				Object result = caseKermetaUnitStorer(kermetaUnitStorer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.PACKAGE_ENTRY: {
				PackageEntry packageEntry = (PackageEntry)theEObject;
				Object result = casePackageEntry(packageEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.KERMETA_UNIT_LOADER: {
				KermetaUnitLoader kermetaUnitLoader = (KermetaUnitLoader)theEObject;
				Object result = caseKermetaUnitLoader(kermetaUnitLoader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.MESSAGE: {
				Message message = (Message)theEObject;
				Object result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.ERROR_MESSAGE: {
				ErrorMessage errorMessage = (ErrorMessage)theEObject;
				Object result = caseErrorMessage(errorMessage);
				if (result == null) result = caseMessage(errorMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.WARNING_MESSAGE: {
				WarningMessage warningMessage = (WarningMessage)theEObject;
				Object result = caseWarningMessage(warningMessage);
				if (result == null) result = caseMessage(warningMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.PARSE_ERROR_MESSAGE: {
				ParseErrorMessage parseErrorMessage = (ParseErrorMessage)theEObject;
				Object result = caseParseErrorMessage(parseErrorMessage);
				if (result == null) result = caseErrorMessage(parseErrorMessage);
				if (result == null) result = caseMessage(parseErrorMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.PARSING_ERROR: {
				ParsingError parsingError = (ParsingError)theEObject;
				Object result = caseParsingError(parsingError);
				if (result == null) result = caseErrorMessage(parsingError);
				if (result == null) result = caseMessage(parsingError);
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
	public Object caseKermetaUnit(KermetaUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kermeta Unit Storer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kermeta Unit Storer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseKermetaUnitStorer(KermetaUnitStorer object) {
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
	public Object casePackageEntry(PackageEntry object) {
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
	public Object caseIBuildingState(IBuildingState object) {
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
	public Object caseKermetaUnitLoader(KermetaUnitLoader object) {
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
	public Object caseMessage(Message object) {
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
	public Object caseErrorMessage(ErrorMessage object) {
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
	public Object caseWarningMessage(WarningMessage object) {
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
	public Object caseParseErrorMessage(ParseErrorMessage object) {
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
	public Object caseParsingError(ParsingError object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //IoSwitch
