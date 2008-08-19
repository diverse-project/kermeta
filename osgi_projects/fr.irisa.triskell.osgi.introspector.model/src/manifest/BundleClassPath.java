/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleClassPath.java,v 1.4 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Class Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.BundleClassPath#getClassPaths <em>Class Paths</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getBundleClassPath()
 * @model
 * @generated
 */
public interface BundleClassPath extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Class Paths</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.ClassPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Paths</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Paths</em>' containment reference list.
	 * @see manifest.ManifestPackage#getBundleClassPath_ClassPaths()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClassPath> getClassPaths();

	void addClassPath(ClassPath classPath);

	// void addEntryReference(String reference);

} // BundleClassPath
