/**
 * <copyright>
 * </copyright>
 *
 * $Id: Version.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.Version#getMajor <em>Major</em>}</li>
 * <li>{@link manifest.Version#getMinor <em>Minor</em>}</li>
 * <li>{@link manifest.Version#getMicro <em>Micro</em>}</li>
 * <li>{@link manifest.Version#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #setMajor(int)
	 * @see manifest.ManifestPackage#getVersion_Major()
	 * @model dataType="manifest.int" required="true"
	 * @generated
	 */
	int getMajor();

	/**
	 * Sets the value of the '{@link manifest.Version#getMajor <em>Major</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Major</em>' attribute.
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(int value);

	/**
	 * Returns the value of the '<em><b>Minor</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Minor</em>' attribute.
	 * @see #setMinor(int)
	 * @see manifest.ManifestPackage#getVersion_Minor()
	 * @model dataType="manifest.int"
	 * @generated
	 */
	int getMinor();

	/**
	 * Sets the value of the '{@link manifest.Version#getMinor <em>Minor</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Minor</em>' attribute.
	 * @see #getMinor()
	 * @generated
	 */
	void setMinor(int value);

	/**
	 * Returns the value of the '<em><b>Micro</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Micro</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Micro</em>' attribute.
	 * @see #setMicro(int)
	 * @see manifest.ManifestPackage#getVersion_Micro()
	 * @model dataType="manifest.int"
	 * @generated
	 */
	int getMicro();

	/**
	 * Sets the value of the '{@link manifest.Version#getMicro <em>Micro</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Micro</em>' attribute.
	 * @see #getMicro()
	 * @generated
	 */
	void setMicro(int value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute. The
	 * default value is <code>""</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see manifest.ManifestPackage#getVersion_Qualifier()
	 * @model default="" dataType="manifest.String"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link manifest.Version#getQualifier <em>Qualifier</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

	String toString();

	void setVersionValue(String value) throws BadVersionValue;

	boolean greaterThan(Version version, boolean equals);

	boolean lesserThan(Version version, boolean equals);

	boolean equals(Version version);

} // Version
