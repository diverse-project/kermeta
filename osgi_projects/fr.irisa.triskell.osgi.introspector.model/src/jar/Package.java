/**
 * <copyright>
 * </copyright>
 *
 * $Id: Package.java,v 1.1 2008-07-30 14:08:03 edaubert Exp $
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
 * <li>{@link jar.Package#getClasses <em>Classes</em>}</li>
 * <li>{@link jar.Package#getSubPackages <em>Sub Packages</em>}</li>
 * <li>{@link jar.Package#isBundleClassPath <em>Bundle Class Path</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Bundle Class Path</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Class Path</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bundle Class Path</em>' attribute.
	 * @see #setBundleClassPath(boolean)
	 * @see jar.JarPackage#getPackage_BundleClassPath()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isBundleClassPath();

	/**
	 * Sets the value of the '{@link jar.Package#isBundleClassPath <em>Bundle Class Path</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Bundle Class Path</em>'
	 *            attribute.
	 * @see #isBundleClassPath()
	 * @generated
	 */
	void setBundleClassPath(boolean value);

	void addClass(Class clazz);

	void addPackage(Package _package);

	Class getClass(String fullPath);

	Package getPackage(String fullPath);

	List<Class> getClassWithRegex(String regex);

	BundleEntry getSubElement(String fullPath);

} // Package
