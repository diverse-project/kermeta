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
   * The feature id for the '<em><b>Metamodel Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__METAMODEL_NAME = 0;

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
   * The feature id for the '<em><b>Reusable Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__REUSABLE_RESOURCES = 4;

				/**
   * The feature id for the '<em><b>Imported Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__IMPORTED_PROJECTS = 5;

				/**
   * The feature id for the '<em><b>Imported Project Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES = 6;

		/**
   * The feature id for the '<em><b>Imported Files</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int KERMETA_PROJECT__IMPORTED_FILES = 7;

		/**
   * The feature id for the '<em><b>Required Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KERMETA_PROJECT__REQUIRED_TYPES = 8;

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
   * The meta object id for the '{@link org.kermeta.kp.impl.ReusableResourceImpl <em>Reusable Resource</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.ReusableResourceImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getReusableResource()
   * @generated
   */
	int REUSABLE_RESOURCE = 3;

		/**
   * The meta object id for the '{@link org.kermeta.kp.impl.ImportProjectSourcesImpl <em>Import Project Sources</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.ImportProjectSourcesImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getImportProjectSources()
   * @generated
   */
	int IMPORT_PROJECT_SOURCES = 4;

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
   * The feature id for the '<em><b>Reusable Resource Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME = 0;

		/**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REUSABLE_RESOURCE__URL = 1;

		/**
   * The feature id for the '<em><b>Alternate Urls</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REUSABLE_RESOURCE__ALTERNATE_URLS = 2;

		/**
   * The number of structural features of the '<em>Reusable Resource</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REUSABLE_RESOURCE_FEATURE_COUNT = 3;

		/**
   * The feature id for the '<em><b>Project Resource</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_PROJECT_SOURCES__PROJECT_RESOURCE = 0;

		/**
   * The number of structural features of the '<em>Import Project Sources</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_PROJECT_SOURCES_FEATURE_COUNT = 1;

		/**
   * The meta object id for the '{@link org.kermeta.kp.impl.ImportProjectImpl <em>Import Project</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.ImportProjectImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getImportProject()
   * @generated
   */
	int IMPORT_PROJECT = 5;

		/**
   * The feature id for the '<em><b>Project Resource</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_PROJECT__PROJECT_RESOURCE = 0;

		/**
   * The number of structural features of the '<em>Import Project</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMPORT_PROJECT_FEATURE_COUNT = 1;

		/**
   * The meta object id for the '{@link org.kermeta.kp.impl.RequiredTypeImpl <em>Required Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.kp.impl.RequiredTypeImpl
   * @see org.kermeta.kp.impl.KpPackageImpl#getRequiredType()
   * @generated
   */
  int REQUIRED_TYPE = 6;

    /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_TYPE__QUALIFIED_NAME = 0;

    /**
   * The number of structural features of the '<em>Required Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_TYPE_FEATURE_COUNT = 1;

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
   * Returns the meta object for the attribute '{@link org.kermeta.kp.KermetaProject#getMetamodelName <em>Metamodel Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metamodel Name</em>'.
   * @see org.kermeta.kp.KermetaProject#getMetamodelName()
   * @see #getKermetaProject()
   * @generated
   */
	EAttribute getKermetaProject_MetamodelName();

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
   * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getImportedProjects <em>Imported Projects</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imported Projects</em>'.
   * @see org.kermeta.kp.KermetaProject#getImportedProjects()
   * @see #getKermetaProject()
   * @generated
   */
	EReference getKermetaProject_ImportedProjects();

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
   * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getImportedFiles <em>Imported Files</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imported Files</em>'.
   * @see org.kermeta.kp.KermetaProject#getImportedFiles()
   * @see #getKermetaProject()
   * @generated
   */
	EReference getKermetaProject_ImportedFiles();

		/**
   * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getRequiredTypes <em>Required Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required Types</em>'.
   * @see org.kermeta.kp.KermetaProject#getRequiredTypes()
   * @see #getKermetaProject()
   * @generated
   */
  EReference getKermetaProject_RequiredTypes();

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
   * Returns the meta object for the reference '{@link org.kermeta.kp.ImportProjectSources#getProjectResource <em>Project Resource</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Project Resource</em>'.
   * @see org.kermeta.kp.ImportProjectSources#getProjectResource()
   * @see #getImportProjectSources()
   * @generated
   */
	EReference getImportProjectSources_ProjectResource();

	/**
   * Returns the meta object for class '{@link org.kermeta.kp.ImportProject <em>Import Project</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Project</em>'.
   * @see org.kermeta.kp.ImportProject
   * @generated
   */
	EClass getImportProject();

	/**
   * Returns the meta object for the reference '{@link org.kermeta.kp.ImportProject#getProjectResource <em>Project Resource</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Project Resource</em>'.
   * @see org.kermeta.kp.ImportProject#getProjectResource()
   * @see #getImportProject()
   * @generated
   */
	EReference getImportProject_ProjectResource();

	/**
   * Returns the meta object for class '{@link org.kermeta.kp.RequiredType <em>Required Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Type</em>'.
   * @see org.kermeta.kp.RequiredType
   * @generated
   */
  EClass getRequiredType();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.kp.RequiredType#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see org.kermeta.kp.RequiredType#getQualifiedName()
   * @see #getRequiredType()
   * @generated
   */
  EAttribute getRequiredType_QualifiedName();

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
     * The meta object literal for the '<em><b>Metamodel Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute KERMETA_PROJECT__METAMODEL_NAME = eINSTANCE.getKermetaProject_MetamodelName();

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
     * The meta object literal for the '<em><b>Reusable Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference KERMETA_PROJECT__REUSABLE_RESOURCES = eINSTANCE.getKermetaProject_ReusableResources();

								/**
     * The meta object literal for the '<em><b>Imported Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference KERMETA_PROJECT__IMPORTED_PROJECTS = eINSTANCE.getKermetaProject_ImportedProjects();

								/**
     * The meta object literal for the '<em><b>Imported Project Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES = eINSTANCE.getKermetaProject_ImportedProjectSources();

				/**
     * The meta object literal for the '<em><b>Imported Files</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference KERMETA_PROJECT__IMPORTED_FILES = eINSTANCE.getKermetaProject_ImportedFiles();

				/**
     * The meta object literal for the '<em><b>Required Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KERMETA_PROJECT__REQUIRED_TYPES = eINSTANCE.getKermetaProject_RequiredTypes();

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
     * The meta object literal for the '<em><b>Project Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference IMPORT_PROJECT_SOURCES__PROJECT_RESOURCE = eINSTANCE.getImportProjectSources_ProjectResource();

				/**
     * The meta object literal for the '{@link org.kermeta.kp.impl.ImportProjectImpl <em>Import Project</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.kermeta.kp.impl.ImportProjectImpl
     * @see org.kermeta.kp.impl.KpPackageImpl#getImportProject()
     * @generated
     */
		EClass IMPORT_PROJECT = eINSTANCE.getImportProject();

				/**
     * The meta object literal for the '<em><b>Project Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference IMPORT_PROJECT__PROJECT_RESOURCE = eINSTANCE.getImportProject_ProjectResource();

				/**
     * The meta object literal for the '{@link org.kermeta.kp.impl.RequiredTypeImpl <em>Required Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.kp.impl.RequiredTypeImpl
     * @see org.kermeta.kp.impl.KpPackageImpl#getRequiredType()
     * @generated
     */
    EClass REQUIRED_TYPE = eINSTANCE.getRequiredType();

        /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_TYPE__QUALIFIED_NAME = eINSTANCE.getRequiredType_QualifiedName();

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

	}

} //KpPackage
