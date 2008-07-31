/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleManifestEntryManyValues.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package manifest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Simple Manifest Entry Many Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.SimpleManifestEntryManyValues#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getSimpleManifestEntryManyValues()
 * @model
 * @generated
 */
public interface SimpleManifestEntryManyValues extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see manifest.ManifestPackage#getSimpleManifestEntryManyValues_Values()
	 * @model dataType="manifest.String" required="true"
	 * @generated
	 */
	EList<String> getValues();

	void addValue(String value);

} // SimpleManifestEntryManyValues
