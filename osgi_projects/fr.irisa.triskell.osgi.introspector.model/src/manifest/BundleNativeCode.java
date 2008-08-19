/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleNativeCode.java,v 1.4 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest;

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
 *   <li>{@link manifest.BundleNativeCode#getNativeCodes <em>Native Codes</em>}</li>
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
	 * Returns the value of the '<em><b>Native Codes</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.NativeCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native Codes</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native Codes</em>' containment reference list.
	 * @see manifest.ManifestPackage#getBundleNativeCode_NativeCodes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NativeCode> getNativeCodes();

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

	void addNativeCode(NativeCode nativeCode);

	// void addFileReference(String fileReference);

} // BundleNativeCode
