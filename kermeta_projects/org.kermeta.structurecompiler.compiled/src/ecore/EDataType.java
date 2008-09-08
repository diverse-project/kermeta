/**
 * <copyright>
 * </copyright>
 *
 * $Id: EDataType.java,v 1.2 2008-09-08 19:28:31 cfaucher Exp $
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EData Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EDataType#isSerializable <em>Serializable</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEDataType()
 * @model
 * @generated
 */
public interface EDataType extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Serializable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serializable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serializable</em>' attribute.
	 * @see #setSerializable(boolean)
	 * @see ecore.EcorePackage#getEDataType_Serializable()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isSerializable();

	/**
	 * Sets the value of the '{@link ecore.EDataType#isSerializable <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serializable</em>' attribute.
	 * @see #isSerializable()
	 * @generated
	 */
	void setSerializable(boolean value);

} // EDataType
