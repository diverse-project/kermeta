/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleNativeCode.java,v 1.3 2008-08-11 14:19:26 edaubert Exp $
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
 *   <li>{@link manifest.BundleNativeCode#isOptional <em>Optional</em>}</li>
 *   <li>{@link manifest.BundleNativeCode#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.BundleNativeCode#getFile <em>File</em>}</li>
 *   <li>{@link manifest.BundleNativeCode#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.BundleNativeCode#getFileReferences <em>File References</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getBundleNativeCode()
 * @model
 * @generated
 */
public interface BundleNativeCode extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
	 * The list contents are of type {@link option.NativeCodeDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives</em>' containment reference list.
	 * @see manifest.ManifestPackage#getBundleNativeCode_Directives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NativeCodeDirective> getDirectives();

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference list.
	 * The list contents are of type {@link jar.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference list.
	 * @see manifest.ManifestPackage#getBundleNativeCode_File()
	 * @model
	 * @generated
	 */
	EList<File> getFile();

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see manifest.ManifestPackage#getBundleNativeCode_Resolved()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.BundleNativeCode#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>File References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File References</em>' attribute list.
	 * @see manifest.ManifestPackage#getBundleNativeCode_FileReferences()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	EList<String> getFileReferences();

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
	 * Sets the value of the '{@link manifest.BundleNativeCode#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	void addDirective(NativeCodeDirective directive);

	void addFile(File file);
	
	void addFileReference(String fileReference);

} // BundleNativeCode
