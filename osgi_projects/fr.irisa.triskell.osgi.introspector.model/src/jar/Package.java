/**
 * <copyright>
 * </copyright>
 *
 * $Id: Package.java,v 1.3 2008-08-01 09:44:37 edaubert Exp $
 */
package jar;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jar.Package#getClasses <em>Classes</em>}</li>
 *   <li>{@link jar.Package#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see jar.JarPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends BundleEntry {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment
	 * reference list. The list contents are of type {@link jar.Class}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Classes</em>' containment reference
	 *         list.
	 * @see jar.JarPackage#getPackage_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<jar.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment
	 * reference list. The list contents are of type {@link jar.Package}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sub Packages</em>' containment
	 *         reference list.
	 * @see jar.JarPackage#getPackage_SubPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getSubPackages();

	void addClass(Class clazz);

	void addPackage(Package _package);

	Class getClass(String fullPath);

	Package getPackage(String fullPath);

	List<Class> getClassWithRegex(String regex);

	BundleEntry getSubElement(String fullPath);

} // Package
