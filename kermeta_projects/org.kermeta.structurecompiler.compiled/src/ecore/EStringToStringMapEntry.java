/**
 * <copyright>
 * </copyright>
 *
 * $Id: EStringToStringMapEntry.java,v 1.10 2008-11-27 15:50:08 cfaucher Exp $
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EString To String Map Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EStringToStringMapEntry#getValue <em>Value</em>}</li>
 *   <li>{@link ecore.EStringToStringMapEntry#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEStringToStringMapEntry()
 * @model
 * @generated
 */
public interface EStringToStringMapEntry extends
		kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ecore.EcorePackage#getEStringToStringMapEntry_Value()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ecore.EStringToStringMapEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see ecore.EcorePackage#getEStringToStringMapEntry_Key()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link ecore.EStringToStringMapEntry#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // EStringToStringMapEntry
