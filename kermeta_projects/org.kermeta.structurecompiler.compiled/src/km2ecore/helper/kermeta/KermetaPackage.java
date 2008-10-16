/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaPackage.java,v 1.5 2008-10-16 13:18:18 cfaucher Exp $
 */
package km2ecore.helper.kermeta;

import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see km2ecore.helper.kermeta.KermetaFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/km2ecore/helper/kermeta'"
 * @generated
 */
public interface KermetaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kermeta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/km2ecore/helper/kermeta/kermeta_temp_uri";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KermetaPackage eINSTANCE = km2ecore.helper.kermeta.impl.KermetaPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link km2ecore.helper.kermeta.impl.CompilerHelperJavaImpl <em>Compiler Helper Java</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.helper.kermeta.impl.CompilerHelperJavaImpl
	 * @see km2ecore.helper.kermeta.impl.KermetaPackageImpl#getCompilerHelperJava()
	 * @generated
	 */
	int COMPILER_HELPER_JAVA = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_HELPER_JAVA__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_HELPER_JAVA__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_HELPER_JAVA__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_HELPER_JAVA__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_HELPER_JAVA__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_HELPER_JAVA__OID = StructurePackage.OBJECT__OID;

	/**
	 * The number of structural features of the '<em>Compiler Helper Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_HELPER_JAVA_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link km2ecore.helper.kermeta.impl.ConstraintHelperImpl <em>Constraint Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.helper.kermeta.impl.ConstraintHelperImpl
	 * @see km2ecore.helper.kermeta.impl.KermetaPackageImpl#getConstraintHelper()
	 * @generated
	 */
	int CONSTRAINT_HELPER = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_HELPER__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_HELPER__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_HELPER__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_HELPER__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_HELPER__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_HELPER__OID = StructurePackage.OBJECT__OID;

	/**
	 * The number of structural features of the '<em>Constraint Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_HELPER_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link km2ecore.helper.kermeta.impl.GenericTypeDefinitionHelperImpl <em>Generic Type Definition Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.helper.kermeta.impl.GenericTypeDefinitionHelperImpl
	 * @see km2ecore.helper.kermeta.impl.KermetaPackageImpl#getGenericTypeDefinitionHelper()
	 * @generated
	 */
	int GENERIC_TYPE_DEFINITION_HELPER = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION_HELPER__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION_HELPER__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION_HELPER__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION_HELPER__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION_HELPER__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION_HELPER__OID = StructurePackage.OBJECT__OID;

	/**
	 * The number of structural features of the '<em>Generic Type Definition Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION_HELPER_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link km2ecore.helper.kermeta.CompilerHelperJava <em>Compiler Helper Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compiler Helper Java</em>'.
	 * @see km2ecore.helper.kermeta.CompilerHelperJava
	 * @generated
	 */
	EClass getCompilerHelperJava();

	/**
	 * Returns the meta object for class '{@link km2ecore.helper.kermeta.ConstraintHelper <em>Constraint Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Helper</em>'.
	 * @see km2ecore.helper.kermeta.ConstraintHelper
	 * @generated
	 */
	EClass getConstraintHelper();

	/**
	 * Returns the meta object for class '{@link km2ecore.helper.kermeta.GenericTypeDefinitionHelper <em>Generic Type Definition Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Type Definition Helper</em>'.
	 * @see km2ecore.helper.kermeta.GenericTypeDefinitionHelper
	 * @generated
	 */
	EClass getGenericTypeDefinitionHelper();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KermetaFactory getKermetaFactory();

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
		 * The meta object literal for the '{@link km2ecore.helper.kermeta.impl.CompilerHelperJavaImpl <em>Compiler Helper Java</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.helper.kermeta.impl.CompilerHelperJavaImpl
		 * @see km2ecore.helper.kermeta.impl.KermetaPackageImpl#getCompilerHelperJava()
		 * @generated
		 */
		EClass COMPILER_HELPER_JAVA = eINSTANCE.getCompilerHelperJava();

		/**
		 * The meta object literal for the '{@link km2ecore.helper.kermeta.impl.ConstraintHelperImpl <em>Constraint Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.helper.kermeta.impl.ConstraintHelperImpl
		 * @see km2ecore.helper.kermeta.impl.KermetaPackageImpl#getConstraintHelper()
		 * @generated
		 */
		EClass CONSTRAINT_HELPER = eINSTANCE.getConstraintHelper();

		/**
		 * The meta object literal for the '{@link km2ecore.helper.kermeta.impl.GenericTypeDefinitionHelperImpl <em>Generic Type Definition Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.helper.kermeta.impl.GenericTypeDefinitionHelperImpl
		 * @see km2ecore.helper.kermeta.impl.KermetaPackageImpl#getGenericTypeDefinitionHelper()
		 * @generated
		 */
		EClass GENERIC_TYPE_DEFINITION_HELPER = eINSTANCE
				.getGenericTypeDefinitionHelper();

	}

} //KermetaPackage
