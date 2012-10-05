/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kermeta.kp.KpFactory
 * @model kind="package"
 * @generated
 */
public interface KpPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "kp";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.kermeta.org/kp/1.0.0";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "org.kermeta.kp";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	KpPackage eINSTANCE = org.kermeta.kp.impl.KpPackageImpl.init();

	/**
   * The meta object id for the '{@link org.kermeta.kp.impl.KermetaProjectImpl <em>Kermeta Project</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.KermetaProjectImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getKermetaProject()
   * @generated
   */
	int KERMETA_PROJECT = 0;

	/**
   * The feature id for the '<em><b>Eclipse Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__ECLIPSE_NAME = 0;

	/**
   * The feature id for the '<em><b>Default Main Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KERMETA_PROJECT__DEFAULT_MAIN_CLASS = 1;

  /**
   * The feature id for the '<em><b>Default Main Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KERMETA_PROJECT__DEFAULT_MAIN_OPERATION = 2;

  /**
   * The feature id for the '<em><b>Java Base Package</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__JAVA_BASE_PACKAGE = 3;

		/**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KERMETA_PROJECT__METAMODELS = 4;

    /**
   * The feature id for the '<em><b>Reusable Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__REUSABLE_RESOURCES = 5;

				/**
   * The feature id for the '<em><b>Imported Project Jars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__IMPORTED_PROJECT_JARS = 6;

		/**
   * The feature id for the '<em><b>Imported Bytecode Jars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__IMPORTED_BYTECODE_JARS = 7;

		/**
   * The feature id for the '<em><b>Imported Project Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES = 8;

		/**
   * The number of structural features of the '<em>Kermeta Project</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT_FEATURE_COUNT = 9;

	/**
   * The meta object id for the '{@link org.kermeta.kp.impl.PackageEquivalenceImpl <em>Package Equivalence</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.PackageEquivalenceImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getPackageEquivalence()
   * @generated
   */
	int PACKAGE_EQUIVALENCE = 2;

	/**
   * The meta object id for the '{@link org.kermeta.kp.impl.MetamodelImpl <em>Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.MetamodelImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getMetamodel()
   * @generated
   */
  int METAMODEL = 3;

  /**
   * The meta object id for the '{@link org.kermeta.kp.impl.ReusableResourceImpl <em>Reusable Resource</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.ReusableResourceImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getReusableResource()
   * @generated
   */
	int REUSABLE_RESOURCE = 4;

		/**
   * The meta object id for the '{@link org.kermeta.kp.impl.ImportProjectSourcesImpl <em>Import Project Sources</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.ImportProjectSourcesImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getImportProjectSources()
   * @generated
   */
	int IMPORT_PROJECT_SOURCES = 5;

		/**
   * The meta object id for the '{@link org.kermeta.kp.impl.ImportFileImpl <em>Import File</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.ImportFileImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getImportFile()
   * @generated
   */
	int IMPORT_FILE = 1;

		/**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_FILE__URL = 0;

		/**
   * The feature id for the '<em><b>Bytecode From</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_FILE__BYTECODE_FROM = 1;

		/**
   * The feature id for the '<em><b>Package Equivalences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_FILE__PACKAGE_EQUIVALENCES = 2;

		/**
   * The number of structural features of the '<em>Import File</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_FILE_FEATURE_COUNT = 3;

		/**
   * The feature id for the '<em><b>Ecore Package</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
		int PACKAGE_EQUIVALENCE__ECORE_PACKAGE = 0;

		/**
   * The feature id for the '<em><b>Java Package</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
		int PACKAGE_EQUIVALENCE__JAVA_PACKAGE = 1;

		/**
   * The number of structural features of the '<em>Package Equivalence</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
		int PACKAGE_EQUIVALENCE_FEATURE_COUNT = 2;

		/**
   * The feature id for the '<em><b>Extends</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int METAMODEL__EXTENDS = 0;

		/**
   * The feature id for the '<em><b>Imported Files</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int METAMODEL__IMPORTED_FILES = 1;

		/**
   * The feature id for the '<em><b>Metamodel Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int METAMODEL__METAMODEL_NAME = 2;

		/**
   * The number of structural features of the '<em>Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_FEATURE_COUNT = 3;

		/**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REUSABLE_RESOURCE__URL = 0;

		/**
   * The feature id for the '<em><b>Alternate Urls</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REUSABLE_RESOURCE__ALTERNATE_URLS = 1;

		/**
   * The feature id for the '<em><b>Reusable Resource Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME = 2;

		/**
   * The number of structural features of the '<em>Reusable Resource</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REUSABLE_RESOURCE_FEATURE_COUNT = 3;

		/**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_PROJECT_SOURCES__URL = 0;

		/**
   * The number of structural features of the '<em>Import Project Sources</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_PROJECT_SOURCES_FEATURE_COUNT = 1;

		/**
   * The meta object id for the '{@link org.kermeta.kp.impl.ImportProjectJarImpl <em>Import Project Jar</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.ImportProjectJarImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getImportProjectJar()
   * @generated
   */
	int IMPORT_PROJECT_JAR = 6;

		/**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_PROJECT_JAR__URL = 0;

		/**
   * The number of structural features of the '<em>Import Project Jar</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_PROJECT_JAR_FEATURE_COUNT = 1;

		/**
   * The meta object id for the '{@link org.kermeta.kp.impl.ImportBytecodeJarImpl <em>Import Bytecode Jar</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.ImportBytecodeJarImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getImportBytecodeJar()
   * @generated
   */
	int IMPORT_BYTECODE_JAR = 7;

		/**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_BYTECODE_JAR__URL = 0;

		/**
   * The number of structural features of the '<em>Import Bytecode Jar</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_BYTECODE_JAR_FEATURE_COUNT = 1;

		/**
   * Returns the meta object for class '{@link org.kermeta.kp.KermetaProject <em>Kermeta Project</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kermeta Project</em>'.
   * @see org.kermeta.kp.KermetaProject
   * @generated
   */
	EClass getKermetaProject();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.KermetaProject#getEclipseName <em>Eclipse Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Eclipse Name</em>'.
   * @see org.kermeta.kp.KermetaProject#getEclipseName()
   * @see #getKermetaProject()
   * @generated
   */
	EAttribute getKermetaProject_EclipseName();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.KermetaProject#getDefaultMainClass <em>Default Main Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Main Class</em>'.
   * @see org.kermeta.kp.KermetaProject#getDefaultMainClass()
   * @see #getKermetaProject()
   * @generated
   */
  EAttribute getKermetaProject_DefaultMainClass();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.KermetaProject#getDefaultMainOperation <em>Default Main Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Main Operation</em>'.
   * @see org.kermeta.kp.KermetaProject#getDefaultMainOperation()
   * @see #getKermetaProject()
   * @generated
   */
  EAttribute getKermetaProject_DefaultMainOperation();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.KermetaProject#getJavaBasePackage <em>Java Base Package</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java Base Package</em>'.
   * @see org.kermeta.kp.KermetaProject#getJavaBasePackage()
   * @see #getKermetaProject()
   * @generated
   */
	EAttribute getKermetaProject_JavaBasePackage();

		/**
   * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getMetamodels <em>Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodels</em>'.
   * @see org.kermeta.kp.KermetaProject#getMetamodels()
   * @see #getKermetaProject()
   * @generated
   */
  EReference getKermetaProject_Metamodels();

    /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getReusableResources <em>Reusable Resources</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reusable Resources</em>'.
   * @see org.kermeta.kp.KermetaProject#getReusableResources()
   * @see #getKermetaProject()
   * @generated
   */
	EReference getKermetaProject_ReusableResources();

				/**
   * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getImportedProjectJars <em>Imported Project Jars</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imported Project Jars</em>'.
   * @see org.kermeta.kp.KermetaProject#getImportedProjectJars()
   * @see #getKermetaProject()
   * @generated
   */
	EReference getKermetaProject_ImportedProjectJars();

		/**
   * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getImportedBytecodeJars <em>Imported Bytecode Jars</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imported Bytecode Jars</em>'.
   * @see org.kermeta.kp.KermetaProject#getImportedBytecodeJars()
   * @see #getKermetaProject()
   * @generated
   */
	EReference getKermetaProject_ImportedBytecodeJars();

		/**
   * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getImportedProjectSources <em>Imported Project Sources</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imported Project Sources</em>'.
   * @see org.kermeta.kp.KermetaProject#getImportedProjectSources()
   * @see #getKermetaProject()
   * @generated
   */
	EReference getKermetaProject_ImportedProjectSources();

		/**
   * Returns the meta object for class '{@link org.kermeta.kp.PackageEquivalence <em>Package Equivalence</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Equivalence</em>'.
   * @see org.kermeta.kp.PackageEquivalence
   * @generated
   */
	EClass getPackageEquivalence();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.PackageEquivalence#getEcorePackage <em>Ecore Package</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ecore Package</em>'.
   * @see org.kermeta.kp.PackageEquivalence#getEcorePackage()
   * @see #getPackageEquivalence()
   * @generated
   */
	EAttribute getPackageEquivalence_EcorePackage();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.PackageEquivalence#getJavaPackage <em>Java Package</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java Package</em>'.
   * @see org.kermeta.kp.PackageEquivalence#getJavaPackage()
   * @see #getPackageEquivalence()
   * @generated
   */
	EAttribute getPackageEquivalence_JavaPackage();

	/**
   * Returns the meta object for class '{@link org.kermeta.kp.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel</em>'.
   * @see org.kermeta.kp.Metamodel
   * @generated
   */
  EClass getMetamodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.kp.Metamodel#getImportedFiles <em>Imported Files</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imported Files</em>'.
   * @see org.kermeta.kp.Metamodel#getImportedFiles()
   * @see #getMetamodel()
   * @generated
   */
	EReference getMetamodel_ImportedFiles();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.Metamodel#getMetamodelName <em>Metamodel Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metamodel Name</em>'.
   * @see org.kermeta.kp.Metamodel#getMetamodelName()
   * @see #getMetamodel()
   * @generated
   */
	EAttribute getMetamodel_MetamodelName();

	/**
   * Returns the meta object for class '{@link org.kermeta.kp.ReusableResource <em>Reusable Resource</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reusable Resource</em>'.
   * @see org.kermeta.kp.ReusableResource
   * @generated
   */
	EClass getReusableResource();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.ReusableResource#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.kermeta.kp.ReusableResource#getUrl()
   * @see #getReusableResource()
   * @generated
   */
	EAttribute getReusableResource_Url();

	/**
   * Returns the meta object for the attribute list '{@link org.kermeta.kp.ReusableResource#getAlternateUrls <em>Alternate Urls</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Alternate Urls</em>'.
   * @see org.kermeta.kp.ReusableResource#getAlternateUrls()
   * @see #getReusableResource()
   * @generated
   */
	EAttribute getReusableResource_AlternateUrls();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.ReusableResource#getReusableResourceName <em>Reusable Resource Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reusable Resource Name</em>'.
   * @see org.kermeta.kp.ReusableResource#getReusableResourceName()
   * @see #getReusableResource()
   * @generated
   */
	EAttribute getReusableResource_ReusableResourceName();

	/**
   * Returns the meta object for class '{@link org.kermeta.kp.ImportProjectSources <em>Import Project Sources</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Project Sources</em>'.
   * @see org.kermeta.kp.ImportProjectSources
   * @generated
   */
	EClass getImportProjectSources();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.ImportProjectSources#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.kermeta.kp.ImportProjectSources#getUrl()
   * @see #getImportProjectSources()
   * @generated
   */
	EAttribute getImportProjectSources_Url();

	/**
   * Returns the meta object for class '{@link org.kermeta.kp.ImportProjectJar <em>Import Project Jar</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Project Jar</em>'.
   * @see org.kermeta.kp.ImportProjectJar
   * @generated
   */
	EClass getImportProjectJar();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.ImportProjectJar#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.kermeta.kp.ImportProjectJar#getUrl()
   * @see #getImportProjectJar()
   * @generated
   */
	EAttribute getImportProjectJar_Url();

	/**
   * Returns the meta object for class '{@link org.kermeta.kp.ImportBytecodeJar <em>Import Bytecode Jar</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Bytecode Jar</em>'.
   * @see org.kermeta.kp.ImportBytecodeJar
   * @generated
   */
	EClass getImportBytecodeJar();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.ImportBytecodeJar#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.kermeta.kp.ImportBytecodeJar#getUrl()
   * @see #getImportBytecodeJar()
   * @generated
   */
	EAttribute getImportBytecodeJar_Url();

	/**
   * Returns the meta object for the reference list '{@link org.kermeta.kp.Metamodel#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Extends</em>'.
   * @see org.kermeta.kp.Metamodel#getExtends()
   * @see #getMetamodel()
   * @generated
   */
	EReference getMetamodel_Extends();

	/**
   * Returns the meta object for class '{@link org.kermeta.kp.ImportFile <em>Import File</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import File</em>'.
   * @see org.kermeta.kp.ImportFile
   * @generated
   */
	EClass getImportFile();

	/**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.ImportFile#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.kermeta.kp.ImportFile#getUrl()
   * @see #getImportFile()
   * @generated
   */
	EAttribute getImportFile_Url();

	/**
   * Returns the meta object for the reference '{@link org.kermeta.kp.ImportFile#getBytecodeFrom <em>Bytecode From</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bytecode From</em>'.
   * @see org.kermeta.kp.ImportFile#getBytecodeFrom()
   * @see #getImportFile()
   * @generated
   */
	EReference getImportFile_BytecodeFrom();

	/**
   * Returns the meta object for the containment reference list '{@link org.kermeta.kp.ImportFile#getPackageEquivalences <em>Package Equivalences</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package Equivalences</em>'.
   * @see org.kermeta.kp.ImportFile#getPackageEquivalences()
   * @see #getImportFile()
   * @generated
   */
	EReference getImportFile_PackageEquivalences();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	KpFactory getKpFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link org.kermeta.kp.impl.KermetaProjectImpl <em>Kermeta Project</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.kermeta.kp.impl.KermetaProjectImpl
     * @see org.kermeta.kp.impl.KpPackageImpl#getKermetaProject()
     * @generated
     */
		EClass KERMETA_PROJECT = eINSTANCE.getKermetaProject();

		/**
     * The meta object literal for the '<em><b>Eclipse Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute KERMETA_PROJECT__ECLIPSE_NAME = eINSTANCE.getKermetaProject_EclipseName();

		/**
     * The meta object literal for the '<em><b>Default Main Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KERMETA_PROJECT__DEFAULT_MAIN_CLASS = eINSTANCE.getKermetaProject_DefaultMainClass();

    /**
     * The meta object literal for the '<em><b>Default Main Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KERMETA_PROJECT__DEFAULT_MAIN_OPERATION = eINSTANCE.getKermetaProject_DefaultMainOperation();

    /**
     * The meta object literal for the '<em><b>Java Base Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute KERMETA_PROJECT__JAVA_BASE_PACKAGE = eINSTANCE.getKermetaProject_JavaBasePackage();

				/**
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KERMETA_PROJECT__METAMODELS = eINSTANCE.getKermetaProject_Metamodels();

        /**
     * The meta object literal for the '<em><b>Reusable Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference KERMETA_PROJECT__REUSABLE_RESOURCES = eINSTANCE.getKermetaProject_ReusableResources();

								/**
     * The meta object literal for the '<em><b>Imported Project Jars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference KERMETA_PROJECT__IMPORTED_PROJECT_JARS = eINSTANCE.getKermetaProject_ImportedProjectJars();

				/**
     * The meta object literal for the '<em><b>Imported Bytecode Jars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference KERMETA_PROJECT__IMPORTED_BYTECODE_JARS = eINSTANCE.getKermetaProject_ImportedBytecodeJars();

				/**
     * The meta object literal for the '<em><b>Imported Project Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES = eINSTANCE.getKermetaProject_ImportedProjectSources();

				/**
     * The meta object literal for the '{@link org.kermeta.kp.impl.PackageEquivalenceImpl <em>Package Equivalence</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.kermeta.kp.impl.PackageEquivalenceImpl
     * @see org.kermeta.kp.impl.KpPackageImpl#getPackageEquivalence()
     * @generated
     */
		EClass PACKAGE_EQUIVALENCE = eINSTANCE.getPackageEquivalence();

		/**
     * The meta object literal for the '<em><b>Ecore Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute PACKAGE_EQUIVALENCE__ECORE_PACKAGE = eINSTANCE.getPackageEquivalence_EcorePackage();

		/**
     * The meta object literal for the '<em><b>Java Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute PACKAGE_EQUIVALENCE__JAVA_PACKAGE = eINSTANCE.getPackageEquivalence_JavaPackage();

    /**
     * The meta object literal for the '{@link org.kermeta.kp.impl.MetamodelImpl <em>Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.kp.impl.MetamodelImpl
     * @see org.kermeta.kp.impl.KpPackageImpl#getMetamodel()
     * @generated
     */
    EClass METAMODEL = eINSTANCE.getMetamodel();

				/**
     * The meta object literal for the '<em><b>Imported Files</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference METAMODEL__IMPORTED_FILES = eINSTANCE.getMetamodel_ImportedFiles();

				/**
     * The meta object literal for the '<em><b>Metamodel Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute METAMODEL__METAMODEL_NAME = eINSTANCE.getMetamodel_MetamodelName();

				/**
     * The meta object literal for the '{@link org.kermeta.kp.impl.ReusableResourceImpl <em>Reusable Resource</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.kermeta.kp.impl.ReusableResourceImpl
     * @see org.kermeta.kp.impl.KpPackageImpl#getReusableResource()
     * @generated
     */
		EClass REUSABLE_RESOURCE = eINSTANCE.getReusableResource();

				/**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute REUSABLE_RESOURCE__URL = eINSTANCE.getReusableResource_Url();

				/**
     * The meta object literal for the '<em><b>Alternate Urls</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute REUSABLE_RESOURCE__ALTERNATE_URLS = eINSTANCE.getReusableResource_AlternateUrls();

				/**
     * The meta object literal for the '<em><b>Reusable Resource Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME = eINSTANCE.getReusableResource_ReusableResourceName();

				/**
     * The meta object literal for the '{@link org.kermeta.kp.impl.ImportProjectSourcesImpl <em>Import Project Sources</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.kermeta.kp.impl.ImportProjectSourcesImpl
     * @see org.kermeta.kp.impl.KpPackageImpl#getImportProjectSources()
     * @generated
     */
		EClass IMPORT_PROJECT_SOURCES = eINSTANCE.getImportProjectSources();

				/**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute IMPORT_PROJECT_SOURCES__URL = eINSTANCE.getImportProjectSources_Url();

				/**
     * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference METAMODEL__EXTENDS = eINSTANCE.getMetamodel_Extends();

				/**
     * The meta object literal for the '{@link org.kermeta.kp.impl.ImportFileImpl <em>Import File</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.kermeta.kp.impl.ImportFileImpl
     * @see org.kermeta.kp.impl.KpPackageImpl#getImportFile()
     * @generated
     */
		EClass IMPORT_FILE = eINSTANCE.getImportFile();

				/**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute IMPORT_FILE__URL = eINSTANCE.getImportFile_Url();

				/**
     * The meta object literal for the '<em><b>Bytecode From</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference IMPORT_FILE__BYTECODE_FROM = eINSTANCE.getImportFile_BytecodeFrom();

				/**
     * The meta object literal for the '<em><b>Package Equivalences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference IMPORT_FILE__PACKAGE_EQUIVALENCES = eINSTANCE.getImportFile_PackageEquivalences();

				/**
     * The meta object literal for the '{@link org.kermeta.kp.impl.ImportProjectJarImpl <em>Import Project Jar</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.kermeta.kp.impl.ImportProjectJarImpl
     * @see org.kermeta.kp.impl.KpPackageImpl#getImportProjectJar()
     * @generated
     */
		EClass IMPORT_PROJECT_JAR = eINSTANCE.getImportProjectJar();

				/**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute IMPORT_PROJECT_JAR__URL = eINSTANCE.getImportProjectJar_Url();

				/**
     * The meta object literal for the '{@link org.kermeta.kp.impl.ImportBytecodeJarImpl <em>Import Bytecode Jar</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.kermeta.kp.impl.ImportBytecodeJarImpl
     * @see org.kermeta.kp.impl.KpPackageImpl#getImportBytecodeJar()
     * @generated
     */
		EClass IMPORT_BYTECODE_JAR = eINSTANCE.getImportBytecodeJar();

				/**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute IMPORT_BYTECODE_JAR__URL = eINSTANCE.getImportBytecodeJar_Url();

	}

} //KpPackage
