/**
 * <copyright>
 * </copyright>
 *
 * $Id: URLMANIFESTEntry.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package manifest;

import java.net.URL;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>URLMANIFEST Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.URLMANIFESTEntry#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getURLMANIFESTEntry()
 * @model abstract="true"
 * @generated
 */
public interface URLMANIFESTEntry extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(URL)
	 * @see manifest.ManifestPackage#getURLMANIFESTEntry_Url()
	 * @model dataType="manifest.URL" required="true"
	 * @generated
	 */
	URL getUrl();

	/**
	 * Sets the value of the '{@link manifest.URLMANIFESTEntry#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(URL value);

} // URLMANIFESTEntry
