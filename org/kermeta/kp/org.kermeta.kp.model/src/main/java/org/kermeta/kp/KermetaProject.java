/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.KermetaProject#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getWeaveDirectives <em>Weave Directives</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getOptions <em>Options</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getDefaultMainClass <em>Default Main Class</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getDefaultMainOperation <em>Default Main Operation</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProject#getPackageEquivalences <em>Package Equivalences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getKermetaProject()
 * @model
 * @generated
 */
public interface KermetaProject extends NamedElement {
	/**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.Dependency}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_Dependencies()
   * @model containment="true"
   * @generated
   */
	EList<Dependency> getDependencies();

	/**
   * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.Source}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sources</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_Sources()
   * @model containment="true"
   * @generated
   */
	EList<Source> getSources();

	/**
   * Returns the value of the '<em><b>Weave Directives</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.WeaveDirective}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weave Directives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Weave Directives</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_WeaveDirectives()
   * @model containment="true"
   * @generated
   */
	EList<WeaveDirective> getWeaveDirectives();

	/**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.Option}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_Options()
   * @model containment="true"
   * @generated
   */
	EList<Option> getOptions();

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
   * Returns the value of the '<em><b>Group</b></em>' attribute.
   * The default value is <code>"default"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute.
   * @see #setGroup(String)
   * @see org.kermeta.kp.KpPackage#getKermetaProject_Group()
   * @model default="default"
   * @generated
   */
	String getGroup();

		/**
   * Sets the value of the '{@link org.kermeta.kp.KermetaProject#getGroup <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' attribute.
   * @see #getGroup()
   * @generated
   */
	void setGroup(String value);

		/**
   * Returns the value of the '<em><b>Package Equivalences</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.PackageEquivalence}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Equivalences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Package Equivalences</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getKermetaProject_PackageEquivalences()
   * @model containment="true"
   * @generated
   */
	EList<PackageEquivalence> getPackageEquivalences();

} // KermetaProject
