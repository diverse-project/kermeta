/**
 * <copyright>
 * </copyright>
 *
 * $Id: OsVersion.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

import manifest.Version;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Os Version</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link option.OsVersion#getMinVersion <em>Min Version</em>}</li>
 * <li>{@link option.OsVersion#getMaxVersion <em>Max Version</em>}</li>
 * <li>{@link option.OsVersion#isMinNotInclude <em>Min Not Include</em>}</li>
 * <li>{@link option.OsVersion#isMaxNotInclude <em>Max Not Include</em>}</li>
 * </ul>
 * </p>
 * 
 * @see option.OptionPackage#getOsVersion()
 * @model
 * @generated
 */
public interface OsVersion extends NativeCodeDirective {
	/**
	 * Returns the value of the '<em><b>Min Version</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Version</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Min Version</em>' containment
	 *         reference.
	 * @see #setMinVersion(Version)
	 * @see option.OptionPackage#getOsVersion_MinVersion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Version getMinVersion();

	/**
	 * Sets the value of the '{@link option.OsVersion#getMinVersion <em>Min Version</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Min Version</em>' containment
	 *            reference.
	 * @see #getMinVersion()
	 * @generated
	 */
	void setMinVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Max Version</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Version</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Version</em>' containment
	 *         reference.
	 * @see #setMaxVersion(Version)
	 * @see option.OptionPackage#getOsVersion_MaxVersion()
	 * @model containment="true"
	 * @generated
	 */
	Version getMaxVersion();

	/**
	 * Sets the value of the '{@link option.OsVersion#getMaxVersion <em>Max Version</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Max Version</em>' containment
	 *            reference.
	 * @see #getMaxVersion()
	 * @generated
	 */
	void setMaxVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Min Not Include</b></em>'
	 * attribute. The default value is <code>"true"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Not Include</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Min Not Include</em>' attribute.
	 * @see #setMinNotInclude(boolean)
	 * @see option.OptionPackage#getOsVersion_MinNotInclude()
	 * @model default="true" dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isMinNotInclude();

	/**
	 * Sets the value of the '{@link option.OsVersion#isMinNotInclude <em>Min Not Include</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Min Not Include</em>' attribute.
	 * @see #isMinNotInclude()
	 * @generated
	 */
	void setMinNotInclude(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Not Include</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Not Include</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Not Include</em>' attribute.
	 * @see #setMaxNotInclude(boolean)
	 * @see option.OptionPackage#getOsVersion_MaxNotInclude()
	 * @model dataType="manifest.boolean"
	 * @generated
	 */
	boolean isMaxNotInclude();

	/**
	 * Sets the value of the '{@link option.OsVersion#isMaxNotInclude <em>Max Not Include</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Max Not Include</em>' attribute.
	 * @see #isMaxNotInclude()
	 * @generated
	 */
	void setMaxNotInclude(boolean value);

} // OsVersion
