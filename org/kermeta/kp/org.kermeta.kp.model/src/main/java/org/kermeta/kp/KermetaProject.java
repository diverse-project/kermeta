/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.KermetaProject#getMetamodelName <em>Metamodel Name</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getDefaultMainClass <em>Default Main Class</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getDefaultMainOperation <em>Default Main Operation</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getJavaBasePackage <em>Java Base Package</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getReusableResources <em>Reusable Resources</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getImportedProjects <em>Imported Projects</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getImportedProjectSources <em>Imported Project Sources</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getImportedFiles <em>Imported Files</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getRequiredTypes <em>Required Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getKermetaProject()
 * @model
 * @generated
 */
public interface KermetaProject extends EObject {
	/**
   * Returns the value of the '<em><b>Metamodel Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel Name</em>' attribute.
   * @see #setMetamodelName(String)
   * @see org.kermeta.kp.KpPackage#getKermetaProject_MetamodelName()
   * @model required="true"
   * @generated
   */
	String getMetamodelName();

	/**
   * Sets the value of the '{@link org.kermeta.kp.KermetaProject#getMetamodelName <em>Metamodel Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metamodel Name</em>' attribute.
   * @see #getMetamodelName()
   * @generated
   */
	void setMetamodelName(String value);

	/**
   * Returns the value of the '<em><b>Default Main Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Main Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Main Class</em>' attribute.
   * @see #setDefaultMainClass(String)
   * @see org.kermeta.kp.KpPackage#getKermetaProject_DefaultMainClass()
   * @model
   * @generated
   */
  String getDefaultMainClass();

  /**
   * Sets the value of the '{@link org.kermeta.kp.KermetaProject#getDefaultMainClass <em>Default Main Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Main Class</em>' attribute.
   * @see #getDefaultMainClass()
   * @generated
   */
  void setDefaultMainClass(String value);

  /**
   * Returns the value of the '<em><b>Default Main Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Main Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Main Operation</em>' attribute.
   * @see #setDefaultMainOperation(String)
   * @see org.kermeta.kp.KpPackage#getKermetaProject_DefaultMainOperation()
   * @model
   * @generated
   */
  String getDefaultMainOperation();

  /**
   * Sets the value of the '{@link org.kermeta.kp.KermetaProject#getDefaultMainOperation <em>Default Main Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Main Operation</em>' attribute.
   * @see #getDefaultMainOperation()
   * @generated
   */
  void setDefaultMainOperation(String value);

		/**
   * Returns the value of the '<em><b>Java Base Package</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Java Base Package</em>' attribute.
   * @see #setJavaBasePackage(String)
   * @see org.kermeta.kp.KpPackage#getKermetaProject_JavaBasePackage()
   * @model
   * @generated
   */
	String getJavaBasePackage();

		/**
   * Sets the value of the '{@link org.kermeta.kp.KermetaProject#getJavaBasePackage <em>Java Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Base Package</em>' attribute.
   * @see #getJavaBasePackage()
   * @generated
   */
	void setJavaBasePackage(String value);

		/**
   * Returns the value of the '<em><b>Reusable Resources</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.ReusableResource}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reusable Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Reusable Resources</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_ReusableResources()
   * @model containment="true"
   * @generated
   */
	EList<ReusableResource> getReusableResources();

				/**
   * Returns the value of the '<em><b>Imported Projects</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.ImportProject}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Projects</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_ImportedProjects()
   * @model containment="true"
   * @generated
   */
	EList<ImportProject> getImportedProjects();

				/**
   * Returns the value of the '<em><b>Imported Project Sources</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.ImportProjectSources}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Project Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Project Sources</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_ImportedProjectSources()
   * @model containment="true"
   * @generated
   */
	EList<ImportProjectSources> getImportedProjectSources();

				/**
   * Returns the value of the '<em><b>Imported Files</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.ImportFile}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Files</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_ImportedFiles()
   * @model containment="true"
   * @generated
   */
	EList<ImportFile> getImportedFiles();

        /**
   * Returns the value of the '<em><b>Required Types</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.RequiredType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Types</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_RequiredTypes()
   * @model containment="true"
   * @generated
   */
  EList<RequiredType> getRequiredTypes();

} // KermetaProject
