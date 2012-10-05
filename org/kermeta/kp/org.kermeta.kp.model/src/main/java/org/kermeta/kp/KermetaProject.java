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
 *   <li>{@link org.kermeta.kp.KermetaProject#getEclipseName <em>Eclipse Name</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getDefaultMainClass <em>Default Main Class</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getDefaultMainOperation <em>Default Main Operation</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getJavaBasePackage <em>Java Base Package</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getReusableResources <em>Reusable Resources</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getImportedProjectJars <em>Imported Project Jars</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getImportedBytecodeJars <em>Imported Bytecode Jars</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getImportedProjectSources <em>Imported Project Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getKermetaProject()
 * @model
 * @generated
 */
public interface KermetaProject extends EObject {
	/**
   * Returns the value of the '<em><b>Eclipse Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eclipse Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Eclipse Name</em>' attribute.
   * @see #setEclipseName(String)
   * @see org.kermeta.kp.KpPackage#getKermetaProject_EclipseName()
   * @model required="true"
   * @generated
   */
	String getEclipseName();

	/**
   * Sets the value of the '{@link org.kermeta.kp.KermetaProject#getEclipseName <em>Eclipse Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eclipse Name</em>' attribute.
   * @see #getEclipseName()
   * @generated
   */
	void setEclipseName(String value);

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
   * The default value is <code>"default"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Java Base Package</em>' attribute.
   * @see #setJavaBasePackage(String)
   * @see org.kermeta.kp.KpPackage#getKermetaProject_JavaBasePackage()
   * @model default="default"
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
   * Returns the value of the '<em><b>Metamodels</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.Metamodel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodels</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_Metamodels()
   * @model containment="true"
   * @generated
   */
  EList<Metamodel> getMetamodels();

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
   * Returns the value of the '<em><b>Imported Project Jars</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.ImportProjectJar}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Project Jars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Project Jars</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_ImportedProjectJars()
   * @model containment="true"
   * @generated
   */
	EList<ImportProjectJar> getImportedProjectJars();

				/**
   * Returns the value of the '<em><b>Imported Bytecode Jars</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.ImportBytecodeJar}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Bytecode Jars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Bytecode Jars</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_ImportedBytecodeJars()
   * @model containment="true"
   * @generated
   */
	EList<ImportBytecodeJar> getImportedBytecodeJars();

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

} // KermetaProject
