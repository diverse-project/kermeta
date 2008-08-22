/**
 * <copyright>
 * </copyright>
 *
 * $Id: Version.java,v 1.6 2008-08-22 12:43:34 edaubert Exp $
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
 *   <li>{@link manifest.Version#getMajor <em>Major</em>}</li>
 *   <li>{@link manifest.Version#getMinor <em>Minor</em>}</li>
 *   <li>{@link manifest.Version#getMicro <em>Micro</em>}</li>
 *   <li>{@link manifest.Version#getQualifier <em>Qualifier</em>}</li>
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
	 * Sets the value of the '{@link manifest.Version#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
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
	 * Sets the value of the '{@link manifest.Version#getMinor <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor</em>' attribute.
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
	 * Sets the value of the '{@link manifest.Version#getMicro <em>Micro</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Micro</em>' attribute.
	 * @see #getMicro()
	 * @generated
	 */
	void setMicro(int value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see manifest.ManifestPackage#getVersion_Qualifier()
	 * @model default="" dataType="manifest.String"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link manifest.Version#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

	String toString();

	/**
	 * This function is used to define a Version with a {@link String}
	 * @param value the value which define the Version value
	 * @throws BadVersionValue if value is not a valid version representation.
	 */
	void setVersionValue(String value) throws BadVersionValueException;

	/**
	 * This function is used to compare two version and to see if this Version is greater than version.
	 * @param version  the Version object to compare
	 * @param notEquals false if the equality is possible, true else
	 * @return true && !equals if the two version is equals or version is null, 
	 * 		true if this Version is greater than version,
	 * 		false if this Version is lesser than version.
	 */
	boolean greaterThan(Version version, boolean notEquals);

	/**
	 * This function is used to compare two version and to see if this Version is lesser than version.
	 * @param version  the Version object to compare
	 * @param notEquals false if the equality is possible, true else
	 * @return true && !equals if the two version is equals or version is null, 
	 * 		true if this Version is lesser than version,
	 * 		false if this Version is greater than version.
	 */
	boolean lesserThan(Version version, boolean notEquals);

	/**
	 * This function is used to check if this Version Object is contains into the two Version define with the versionRange.
	 * @param versionRange a {@link String} which contains a range of {@link Version}. The format of this {@link String} is ['['|'(']? Version1 ',' Version2 [')' | ']']?
	 * @return true if this {@link Version} object is lesser than Version2 and greater than Version1
	 * @throws BadVersionValue if the versionRange is not valid.
	 */
	boolean containsInto(String versionRange) throws BadVersionValueException;

} // Version
