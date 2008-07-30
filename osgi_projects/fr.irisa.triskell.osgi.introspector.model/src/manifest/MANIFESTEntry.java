/**
 * <copyright>
 * </copyright>
 *
 * $Id: MANIFESTEntry.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

import option.AttributEntry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MANIFEST Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.MANIFESTEntry#getEntryName <em>Entry Name</em>}</li>
 * <li>{@link manifest.MANIFESTEntry#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getMANIFESTEntry()
 * @model
 * @generated
 */
public interface MANIFESTEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry Name</em>' attribute.
	 * @see #setEntryName(String)
	 * @see manifest.ManifestPackage#getMANIFESTEntry_EntryName()
	 * @model dataType="manifest.String" required="true"
	 * @generated
	 */
	String getEntryName();

	/**
	 * Sets the value of the '{@link manifest.MANIFESTEntry#getEntryName <em>Entry Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entry Name</em>' attribute.
	 * @see #getEntryName()
	 * @generated
	 */
	void setEntryName(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link option.AttributEntry}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Options</em>' containment reference
	 *         list.
	 * @see manifest.ManifestPackage#getMANIFESTEntry_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributEntry> getOptions();

	void addOption(AttributEntry option);

} // MANIFESTEntry
