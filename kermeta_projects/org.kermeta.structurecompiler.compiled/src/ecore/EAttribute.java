/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAttribute.java,v 1.3 2008-09-11 12:34:55 cfaucher Exp $
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EAttribute#getEAttributeType <em>EAttribute Type</em>}</li>
 *   <li>{@link ecore.EAttribute#isID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEAttribute()
 * @model
 * @generated
 */
public interface EAttribute extends EStructuralFeature {
	/**
	 * Returns the value of the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute Type</em>' reference.
	 * @see ecore.EcorePackage#getEAttribute_EAttributeType()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body=''"
	 *        annotation="kompiledderivedProp.getter body=''"
	 * @generated
	 */
	EDataType getEAttributeType();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(boolean)
	 * @see ecore.EcorePackage#getEAttribute_ID()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isID();

	/**
	 * Sets the value of the '{@link ecore.EAttribute#isID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isID()
	 * @generated
	 */
	void setID(boolean value);

} // EAttribute
