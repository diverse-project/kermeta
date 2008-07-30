/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleMANIFESTEntry.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Simple MANIFEST Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.SimpleMANIFESTEntry#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getSimpleMANIFESTEntry()
 * @model
 * @generated
 */
public interface SimpleMANIFESTEntry extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see manifest.ManifestPackage#getSimpleMANIFESTEntry_Value()
	 * @model dataType="manifest.String" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link manifest.SimpleMANIFESTEntry#getValue <em>Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // SimpleMANIFESTEntry
