/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleNativeCode.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

import jar.File;
import option.NativeCodeDirective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Native Code</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.BundleNativeCode#isOptional <em>Optional</em>}</li>
 * <li>{@link manifest.BundleNativeCode#getDirectives <em>Directives</em>}</li>
 * <li>{@link manifest.BundleNativeCode#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getBundleNativeCode()
 * @model
 * @generated
 */
public interface BundleNativeCode extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link option.NativeCodeDirective}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Directives</em>' containment reference
	 *         list.
	 * @see manifest.ManifestPackage#getBundleNativeCode_Directives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NativeCodeDirective> getDirectives();

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference list. The
	 * list contents are of type {@link jar.File}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File</em>' reference list.
	 * @see manifest.ManifestPackage#getBundleNativeCode_File()
	 * @model required="true"
	 * @generated
	 */
	EList<File> getFile();

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see manifest.ManifestPackage#getBundleNativeCode_Optional()
	 * @model dataType="manifest.boolean"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link manifest.BundleNativeCode#isOptional <em>Optional</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	void addDirective(NativeCodeDirective directive);

	void addFile(File file);

} // BundleNativeCode
