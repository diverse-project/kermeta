/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleEntry.java,v 1.1 2008-07-30 14:08:03 edaubert Exp $
 */
package jar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link jar.BundleEntry#getFullPath <em>Full Path</em>}</li>
 * <li>{@link jar.BundleEntry#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see jar.JarPackage#getBundleEntry()
 * @model abstract="true"
 * @generated
 */
public interface BundleEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Path</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Full Path</em>' attribute.
	 * @see #setFullPath(String)
	 * @see jar.JarPackage#getBundleEntry_FullPath()
	 * @model dataType="manifest.String" required="true"
	 * @generated
	 */
	String getFullPath();

	/**
	 * Sets the value of the '{@link jar.BundleEntry#getFullPath <em>Full Path</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Full Path</em>' attribute.
	 * @see #getFullPath()
	 * @generated
	 */
	void setFullPath(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jar.JarPackage#getBundleEntry_Name()
	 * @model dataType="manifest.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jar.BundleEntry#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BundleEntry
