/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptionFactory.java,v 1.3 2008-08-19 07:04:44 edaubert Exp $
 */
package option;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see option.OptionPackage
 * @generated
 */
public interface OptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	OptionFactory eINSTANCE = option.impl.OptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribut Entry</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Attribut Entry</em>'.
	 * @generated
	 */
	AttributEntry createAttributEntry();

	/**
	 * Returns a new object of class '<em>Os Name</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Name</em>'.
	 * @generated
	 */
	OsName createOsName();

	/**
	 * Returns a new object of class '<em>Os Version</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Os Version</em>'.
	 * @generated
	 */
	OsVersion createOsVersion();

	/**
	 * Returns a new object of class '<em>Exclude Packages</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Exclude Packages</em>'.
	 * @generated
	 */
	ExcludePackages createExcludePackages();

	/**
	 * Returns a new object of class '<em>Processor</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Processor</em>'.
	 * @generated
	 */
	Processor createProcessor();

	/**
	 * Returns a new object of class '<em>Include Packages</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Include Packages</em>'.
	 * @generated
	 */
	IncludePackages createIncludePackages();

	/**
	 * Returns a new object of class '<em>Uses</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses</em>'.
	 * @generated
	 */
	Uses createUses();

	/**
	 * Returns a new object of class '<em>Extension</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	Extension createExtension();

	/**
	 * Returns a new object of class '<em>Mandatory</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Mandatory</em>'.
	 * @generated
	 */
	Mandatory createMandatory();

	/**
	 * Returns a new object of class '<em>Language</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Language</em>'.
	 * @generated
	 */
	Language createLanguage();

	/**
	 * Returns a new object of class '<em>Visibility</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Visibility</em>'.
	 * @generated
	 */
	Visibility createVisibility();

	/**
	 * Returns a new object of class '<em>Singleton</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Singleton</em>'.
	 * @generated
	 */
	Singleton createSingleton();

	/**
	 * Returns a new object of class '<em>Resolution</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Resolution</em>'.
	 * @generated
	 */
	Resolution createResolution();

	/**
	 * Returns a new object of class '<em>Fragment Attachment</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Fragment Attachment</em>'.
	 * @generated
	 */
	FragmentAttachment createFragmentAttachment();

	/**
	 * Returns a new object of class '<em>Selection Filter</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Selection Filter</em>'.
	 * @generated
	 */
	SelectionFilter createSelectionFilter();

	/**
	 * Returns a new object of class '<em>Include Classes</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Include Classes</em>'.
	 * @generated
	 */
	IncludeClasses createIncludeClasses();

	/**
	 * Returns a new object of class '<em>Exclude Classes</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Exclude Classes</em>'.
	 * @generated
	 */
	ExcludeClasses createExcludeClasses();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	option.Class createClass();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	option.Package createPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OptionPackage getOptionPackage();

} // OptionFactory
