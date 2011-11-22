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
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.Dependency#getUrl <em>Url</em>}</li>
 *   <li>{@link org.kermeta.kp.Dependency#isIgnoreByteCode <em>Ignore Byte Code</em>}</li>
 *   <li>{@link org.kermeta.kp.Dependency#isSourceOnly <em>Source Only</em>}</li>
 *   <li>{@link org.kermeta.kp.Dependency#isByteCodeOnly <em>Byte Code Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends NamedElement {
	/**
   * Returns the value of the '<em><b>Url</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute list.
   * @see org.kermeta.kp.KpPackage#getDependency_Url()
   * @model required="true"
   * @generated
   */
	EList<String> getUrl();

  /**
   * Returns the value of the '<em><b>Ignore Byte Code</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Byte Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Byte Code</em>' attribute.
   * @see #setIgnoreByteCode(boolean)
   * @see org.kermeta.kp.KpPackage#getDependency_IgnoreByteCode()
   * @model default="false"
   * @generated
   */
  boolean isIgnoreByteCode();

  /**
   * Sets the value of the '{@link org.kermeta.kp.Dependency#isIgnoreByteCode <em>Ignore Byte Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Byte Code</em>' attribute.
   * @see #isIgnoreByteCode()
   * @generated
   */
  void setIgnoreByteCode(boolean value);

  /**
   * Returns the value of the '<em><b>Source Only</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Only</em>' attribute.
   * @see #setSourceOnly(boolean)
   * @see org.kermeta.kp.KpPackage#getDependency_SourceOnly()
   * @model default="false"
   * @generated
   */
  boolean isSourceOnly();

  /**
   * Sets the value of the '{@link org.kermeta.kp.Dependency#isSourceOnly <em>Source Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Only</em>' attribute.
   * @see #isSourceOnly()
   * @generated
   */
  void setSourceOnly(boolean value);

		/**
   * Returns the value of the '<em><b>Byte Code Only</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Code Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Byte Code Only</em>' attribute.
   * @see #setByteCodeOnly(boolean)
   * @see org.kermeta.kp.KpPackage#getDependency_ByteCodeOnly()
   * @model
   * @generated
   */
	boolean isByteCodeOnly();

		/**
   * Sets the value of the '{@link org.kermeta.kp.Dependency#isByteCodeOnly <em>Byte Code Only</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Byte Code Only</em>' attribute.
   * @see #isByteCodeOnly()
   * @generated
   */
	void setByteCodeOnly(boolean value);

} // Dependency
