/**
 * <copyright>
 * </copyright>
 *
 * $Id: JarPackage.java,v 1.3 2008-08-01 09:44:37 edaubert Exp $
 */
package jar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see jar.JarFactory
 * @model kind="package"
 * @generated
 */
public interface JarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.osgi.framework/jar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.osgi.framework.jar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	JarPackage eINSTANCE = jar.impl.JarPackageImpl.init();

	/**
	 * The meta object id for the '{@link jar.impl.BundleEntryImpl <em>Bundle Entry</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see jar.impl.BundleEntryImpl
	 * @see jar.impl.JarPackageImpl#getBundleEntry()
	 * @generated
	 */
	int BUNDLE_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY__FULL_PATH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Bundle Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jar.impl.SystemEntryImpl <em>System Entry</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see jar.impl.SystemEntryImpl
	 * @see jar.impl.JarPackageImpl#getSystemEntry()
	 * @generated
	 */
	int SYSTEM_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENTRY__FULL_PATH = BUNDLE_ENTRY__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENTRY__NAME = BUNDLE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Bundle Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENTRY__BUNDLE_CLASS_PATH = BUNDLE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENTRY_FEATURE_COUNT = BUNDLE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link jar.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see jar.impl.PackageImpl
	 * @see jar.impl.JarPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FULL_PATH = BUNDLE_ENTRY__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = BUNDLE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASSES = BUNDLE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUB_PACKAGES = BUNDLE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = BUNDLE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link jar.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see jar.impl.ClassImpl
	 * @see jar.impl.JarPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 3;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__FULL_PATH = BUNDLE_ENTRY__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = BUNDLE_ENTRY__NAME;

	/**
	 * The number of structural features of the '<em>Class</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = BUNDLE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link jar.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see jar.impl.FolderImpl
	 * @see jar.impl.JarPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 4;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOLDER__FULL_PATH = SYSTEM_ENTRY__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = SYSTEM_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Bundle Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__BUNDLE_CLASS_PATH = SYSTEM_ENTRY__BUNDLE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ENTRIES = SYSTEM_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = SYSTEM_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link jar.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see jar.impl.FileImpl
	 * @see jar.impl.JarPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 5;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE__FULL_PATH = SYSTEM_ENTRY__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = SYSTEM_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Bundle Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__BUNDLE_CLASS_PATH = SYSTEM_ENTRY__BUNDLE_CLASS_PATH;

	/**
	 * The number of structural features of the '<em>File</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = SYSTEM_ENTRY_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link jar.BundleEntry <em>Bundle Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Entry</em>'.
	 * @see jar.BundleEntry
	 * @generated
	 */
	EClass getBundleEntry();

	/**
	 * Returns the meta object for the attribute '{@link jar.BundleEntry#getFullPath <em>Full Path</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Path</em>'.
	 * @see jar.BundleEntry#getFullPath()
	 * @see #getBundleEntry()
	 * @generated
	 */
	EAttribute getBundleEntry_FullPath();

	/**
	 * Returns the meta object for the attribute '{@link jar.BundleEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jar.BundleEntry#getName()
	 * @see #getBundleEntry()
	 * @generated
	 */
	EAttribute getBundleEntry_Name();

	/**
	 * Returns the meta object for class '{@link jar.SystemEntry <em>System Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Entry</em>'.
	 * @see jar.SystemEntry
	 * @generated
	 */
	EClass getSystemEntry();

	/**
	 * Returns the meta object for the attribute '{@link jar.SystemEntry#isBundleClassPath <em>Bundle Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle Class Path</em>'.
	 * @see jar.SystemEntry#isBundleClassPath()
	 * @see #getSystemEntry()
	 * @generated
	 */
	EAttribute getSystemEntry_BundleClassPath();

	/**
	 * Returns the meta object for class '{@link jar.Package <em>Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see jar.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link jar.Package#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see jar.Package#getClasses()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link jar.Package#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
	 * @see jar.Package#getSubPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SubPackages();

	/**
	 * Returns the meta object for class '{@link jar.Class <em>Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see jar.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link jar.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see jar.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link jar.Folder#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see jar.Folder#getEntries()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Entries();

	/**
	 * Returns the meta object for class '{@link jar.File <em>File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see jar.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JarFactory getJarFactory();

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
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jar.impl.BundleEntryImpl <em>Bundle Entry</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see jar.impl.BundleEntryImpl
		 * @see jar.impl.JarPackageImpl#getBundleEntry()
		 * @generated
		 */
		EClass BUNDLE_ENTRY = eINSTANCE.getBundleEntry();

		/**
		 * The meta object literal for the '<em><b>Full Path</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_ENTRY__FULL_PATH = eINSTANCE.getBundleEntry_FullPath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_ENTRY__NAME = eINSTANCE.getBundleEntry_Name();

		/**
		 * The meta object literal for the '{@link jar.impl.SystemEntryImpl <em>System Entry</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see jar.impl.SystemEntryImpl
		 * @see jar.impl.JarPackageImpl#getSystemEntry()
		 * @generated
		 */
		EClass SYSTEM_ENTRY = eINSTANCE.getSystemEntry();

		/**
		 * The meta object literal for the '<em><b>Bundle Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ENTRY__BUNDLE_CLASS_PATH = eINSTANCE.getSystemEntry_BundleClassPath();

		/**
		 * The meta object literal for the '{@link jar.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see jar.impl.PackageImpl
		 * @see jar.impl.JarPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CLASSES = eINSTANCE.getPackage_Classes();

		/**
		 * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SUB_PACKAGES = eINSTANCE.getPackage_SubPackages();

		/**
		 * The meta object literal for the '{@link jar.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see jar.impl.ClassImpl
		 * @see jar.impl.JarPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link jar.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see jar.impl.FolderImpl
		 * @see jar.impl.JarPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__ENTRIES = eINSTANCE.getFolder_Entries();

		/**
		 * The meta object literal for the '{@link jar.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see jar.impl.FileImpl
		 * @see jar.impl.JarPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

	}

} // JarPackage
