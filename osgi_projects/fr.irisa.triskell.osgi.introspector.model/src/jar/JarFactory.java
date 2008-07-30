/**
 * <copyright>
 * </copyright>
 *
 * $Id: JarFactory.java,v 1.1 2008-07-30 14:08:03 edaubert Exp $
 */
package jar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see jar.JarPackage
 * @generated
 */
public interface JarFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	JarFactory eINSTANCE = jar.impl.JarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Package</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	jar.Package createPackage();

	/**
	 * Returns a new object of class '<em>Class</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	jar.Class createClass();

	/**
	 * Returns a new object of class '<em>Folder</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	Folder createFolder();

	/**
	 * Returns a new object of class '<em>File</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	JarPackage getJarPackage();

} // JarFactory
