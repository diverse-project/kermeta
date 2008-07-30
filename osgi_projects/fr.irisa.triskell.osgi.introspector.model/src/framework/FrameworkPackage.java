/**
 * <copyright>
 * </copyright>
 *
 * $Id: FrameworkPackage.java,v 1.1 2008-07-30 14:08:00 edaubert Exp $
 */
package framework;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see framework.FrameworkFactory
 * @model kind="package"
 * @generated
 */
public interface FrameworkPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "framework";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://org.osgi.framework/";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.osgi.framework";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	FrameworkPackage eINSTANCE = framework.impl.FrameworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link framework.impl.FrameworkImpl <em>Framework</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see framework.impl.FrameworkImpl
	 * @see framework.impl.FrameworkPackageImpl#getFramework()
	 * @generated
	 */
	int FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__BUNDLES = 0;

	/**
	 * The number of structural features of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link framework.impl.BundleImpl <em>Bundle</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see framework.impl.BundleImpl
	 * @see framework.impl.FrameworkPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 1;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE__FRAGMENTS = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Manifest</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE__MANIFEST = 2;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE__SYMBOLIC_NAME = 3;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE__FOLDER = 4;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE__PACKAGE = 5;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '<em>String</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see framework.impl.FrameworkPackageImpl#getString()
	 * @generated
	 */
	int STRING = 2;

	/**
	 * Returns the meta object for class '{@link framework.Framework <em>Framework</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Framework</em>'.
	 * @see framework.Framework
	 * @generated
	 */
	EClass getFramework();

	/**
	 * Returns the meta object for the containment reference list '{@link framework.Framework#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Bundles</em>'.
	 * @see framework.Framework#getBundles()
	 * @see #getFramework()
	 * @generated
	 */
	EReference getFramework_Bundles();

	/**
	 * Returns the meta object for class '{@link framework.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see framework.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the reference list '{@link framework.Bundle#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Fragments</em>'.
	 * @see framework.Bundle#getFragments()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Fragments();

	/**
	 * Returns the meta object for the attribute '{@link framework.Bundle#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see framework.Bundle#getLocation()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Location();

	/**
	 * Returns the meta object for the containment reference '{@link framework.Bundle#getManifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Manifest</em>'.
	 * @see framework.Bundle#getManifest()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Manifest();

	/**
	 * Returns the meta object for the attribute '{@link framework.Bundle#getSymbolicName <em>Symbolic Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Symbolic Name</em>'.
	 * @see framework.Bundle#getSymbolicName()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_SymbolicName();

	/**
	 * Returns the meta object for the containment reference '{@link framework.Bundle#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Folder</em>'.
	 * @see framework.Bundle#getFolder()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Folder();

	/**
	 * Returns the meta object for the containment reference '{@link framework.Bundle#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see framework.Bundle#getPackage()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Package();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FrameworkFactory getFrameworkFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link framework.impl.FrameworkImpl <em>Framework</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see framework.impl.FrameworkImpl
		 * @see framework.impl.FrameworkPackageImpl#getFramework()
		 * @generated
		 */
		EClass FRAMEWORK = eINSTANCE.getFramework();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FRAMEWORK__BUNDLES = eINSTANCE.getFramework_Bundles();

		/**
		 * The meta object literal for the '{@link framework.impl.BundleImpl <em>Bundle</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see framework.impl.BundleImpl
		 * @see framework.impl.FrameworkPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUNDLE__FRAGMENTS = eINSTANCE.getBundle_Fragments();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUNDLE__LOCATION = eINSTANCE.getBundle_Location();

		/**
		 * The meta object literal for the '<em><b>Manifest</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUNDLE__MANIFEST = eINSTANCE.getBundle_Manifest();

		/**
		 * The meta object literal for the '<em><b>Symbolic Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUNDLE__SYMBOLIC_NAME = eINSTANCE.getBundle_SymbolicName();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUNDLE__FOLDER = eINSTANCE.getBundle_Folder();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUNDLE__PACKAGE = eINSTANCE.getBundle_Package();

		/**
		 * The meta object literal for the '<em>String</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see framework.impl.FrameworkPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} // FrameworkPackage
