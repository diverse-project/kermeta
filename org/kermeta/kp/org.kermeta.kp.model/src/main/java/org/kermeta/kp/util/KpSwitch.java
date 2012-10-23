/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.kermeta.kp.*;

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
 * @see org.kermeta.kp.KpPackage
 * @generated
 */
public class KpSwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static KpPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public KpSwitch() {
    if (modelPackage == null)
    {
      modelPackage = KpPackage.eINSTANCE;
    }
  }

	/**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case KpPackage.KERMETA_PROJECT:
      {
        KermetaProject kermetaProject = (KermetaProject)theEObject;
        T result = caseKermetaProject(kermetaProject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KpPackage.IMPORT_FILE:
      {
        ImportFile importFile = (ImportFile)theEObject;
        T result = caseImportFile(importFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KpPackage.PACKAGE_EQUIVALENCE:
      {
        PackageEquivalence packageEquivalence = (PackageEquivalence)theEObject;
        T result = casePackageEquivalence(packageEquivalence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KpPackage.REUSABLE_RESOURCE:
      {
        ReusableResource reusableResource = (ReusableResource)theEObject;
        T result = caseReusableResource(reusableResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KpPackage.IMPORT_PROJECT_SOURCES:
      {
        ImportProjectSources importProjectSources = (ImportProjectSources)theEObject;
        T result = caseImportProjectSources(importProjectSources);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KpPackage.IMPORT_PROJECT_JAR:
      {
        ImportProjectJar importProjectJar = (ImportProjectJar)theEObject;
        T result = caseImportProjectJar(importProjectJar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KpPackage.IMPORT_BYTECODE_JAR:
      {
        ImportBytecodeJar importBytecodeJar = (ImportBytecodeJar)theEObject;
        T result = caseImportBytecodeJar(importBytecodeJar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Kermeta Project</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kermeta Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseKermetaProject(KermetaProject object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Package Equivalence</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Equivalence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePackageEquivalence(PackageEquivalence object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Reusable Resource</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reusable Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseReusableResource(ReusableResource object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Import Project Sources</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Project Sources</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseImportProjectSources(ImportProjectSources object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Import Project Jar</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Project Jar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseImportProjectJar(ImportProjectJar object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Import Bytecode Jar</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Bytecode Jar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseImportBytecodeJar(ImportBytecodeJar object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Import File</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseImportFile(ImportFile object) {
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
	@Override
  public T defaultCase(EObject object) {
    return null;
  }

} //KpSwitch
