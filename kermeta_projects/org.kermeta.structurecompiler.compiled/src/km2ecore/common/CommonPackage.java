/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommonPackage.java,v 1.10 2009-01-21 09:16:13 cfaucher Exp $
 */
package km2ecore.common;

import kermeta.language.structure.StructurePackage;

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
 * @see km2ecore.common.CommonFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/km2ecore/common'"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/km2ecore/common/kermeta_temp_uri";

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
	CommonPackage eINSTANCE = km2ecore.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link km2ecore.common.impl.JavaKeyWordListImpl <em>Java Key Word List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.common.impl.JavaKeyWordListImpl
	 * @see km2ecore.common.impl.CommonPackageImpl#getJavaKeyWordList()
	 * @generated
	 */
	int JAVA_KEY_WORD_LIST = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_KEY_WORD_LIST__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_KEY_WORD_LIST__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_KEY_WORD_LIST__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_KEY_WORD_LIST__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_KEY_WORD_LIST__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_KEY_WORD_LIST__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_KEY_WORD_LIST__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_KEY_WORD_LIST__KEYWORDS = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Key Word List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_KEY_WORD_LIST_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link km2ecore.common.JavaKeyWordList <em>Java Key Word List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Key Word List</em>'.
	 * @see km2ecore.common.JavaKeyWordList
	 * @generated
	 */
	EClass getJavaKeyWordList();

	/**
	 * Returns the meta object for the containment reference '{@link km2ecore.common.JavaKeyWordList#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keywords</em>'.
	 * @see km2ecore.common.JavaKeyWordList#getKeywords()
	 * @see #getJavaKeyWordList()
	 * @generated
	 */
	EReference getJavaKeyWordList_Keywords();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link km2ecore.common.impl.JavaKeyWordListImpl <em>Java Key Word List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.common.impl.JavaKeyWordListImpl
		 * @see km2ecore.common.impl.CommonPackageImpl#getJavaKeyWordList()
		 * @generated
		 */
		EClass JAVA_KEY_WORD_LIST = eINSTANCE.getJavaKeyWordList();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_KEY_WORD_LIST__KEYWORDS = eINSTANCE
				.getJavaKeyWordList_Keywords();

	}

} //CommonPackage
