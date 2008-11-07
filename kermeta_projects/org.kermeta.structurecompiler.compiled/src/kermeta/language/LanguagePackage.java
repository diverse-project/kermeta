/**
 * <copyright>
 * </copyright>
 *
 * $Id: LanguagePackage.java,v 1.8 2008-11-07 08:53:49 cfaucher Exp $
 */
package kermeta.language;

import kermeta.language.structure.StructurePackage;

import kermeta.standard.StandardPackage;

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
 * @see kermeta.language.LanguageFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/kermeta/1_2_0//kermeta/language'"
 *        annotation="kermeta documentation='/**\n *\n * func : <Object -> Object> because we need to visit the tags.\n *\n \052/'"
 *        annotation="kermeta usage='containment_traversable'"
 *        annotation="kermeta documentation='/**\r\n * Contains the implementation of Kermeta reflective collections.\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/language_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface LanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "language";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kermeta/1_2_0//kermeta/language/kermeta_temp_uri";

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
	LanguagePackage eINSTANCE = kermeta.language.impl.LanguagePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link kermeta.language.impl.ReflectiveCollectionImpl <em>Reflective Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.language.impl.ReflectiveCollectionImpl
	 * @see kermeta.language.impl.LanguagePackageImpl#getReflectiveCollection()
	 * @generated
	 */
	int REFLECTIVE_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_COLLECTION__TAG = StandardPackage.SET__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_COLLECTION__FILE = StandardPackage.SET__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_COLLECTION__FILE_NAME = StandardPackage.SET__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_COLLECTION__LINE_NUMBER = StandardPackage.SET__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_COLLECTION__OWNED_TAGS = StandardPackage.SET__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_COLLECTION__OID = StandardPackage.SET__OID;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_COLLECTION__VALUES = StandardPackage.SET__VALUES;

	/**
	 * The number of structural features of the '<em>Reflective Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_COLLECTION_FEATURE_COUNT = StandardPackage.SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.language.impl.ReflectiveSequenceImpl <em>Reflective Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.language.impl.ReflectiveSequenceImpl
	 * @see kermeta.language.impl.LanguagePackageImpl#getReflectiveSequence()
	 * @generated
	 */
	int REFLECTIVE_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_SEQUENCE__TAG = StandardPackage.ORDERED_SET__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_SEQUENCE__FILE = StandardPackage.ORDERED_SET__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_SEQUENCE__FILE_NAME = StandardPackage.ORDERED_SET__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_SEQUENCE__LINE_NUMBER = StandardPackage.ORDERED_SET__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_SEQUENCE__OWNED_TAGS = StandardPackage.ORDERED_SET__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_SEQUENCE__OID = StandardPackage.ORDERED_SET__OID;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_SEQUENCE__VALUES = StandardPackage.ORDERED_SET__VALUES;

	/**
	 * The number of structural features of the '<em>Reflective Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_SEQUENCE_FEATURE_COUNT = StandardPackage.ORDERED_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.language.impl.DummyClassImpl <em>Dummy Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.language.impl.DummyClassImpl
	 * @see kermeta.language.impl.LanguagePackageImpl#getDummyClass()
	 * @generated
	 */
	int DUMMY_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS__OID = StructurePackage.OBJECT__OID;

	/**
	 * The number of structural features of the '<em>Dummy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link kermeta.language.ReflectiveCollection <em>Reflective Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflective Collection</em>'.
	 * @see kermeta.language.ReflectiveCollection
	 * @generated
	 */
	EClass getReflectiveCollection();

	/**
	 * Returns the meta object for class '{@link kermeta.language.ReflectiveSequence <em>Reflective Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflective Sequence</em>'.
	 * @see kermeta.language.ReflectiveSequence
	 * @generated
	 */
	EClass getReflectiveSequence();

	/**
	 * Returns the meta object for class '{@link kermeta.language.DummyClass <em>Dummy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy Class</em>'.
	 * @see kermeta.language.DummyClass
	 * @generated
	 */
	EClass getDummyClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LanguageFactory getLanguageFactory();

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
		 * The meta object literal for the '{@link kermeta.language.impl.ReflectiveCollectionImpl <em>Reflective Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.language.impl.ReflectiveCollectionImpl
		 * @see kermeta.language.impl.LanguagePackageImpl#getReflectiveCollection()
		 * @generated
		 */
		EClass REFLECTIVE_COLLECTION = eINSTANCE.getReflectiveCollection();

		/**
		 * The meta object literal for the '{@link kermeta.language.impl.ReflectiveSequenceImpl <em>Reflective Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.language.impl.ReflectiveSequenceImpl
		 * @see kermeta.language.impl.LanguagePackageImpl#getReflectiveSequence()
		 * @generated
		 */
		EClass REFLECTIVE_SEQUENCE = eINSTANCE.getReflectiveSequence();

		/**
		 * The meta object literal for the '{@link kermeta.language.impl.DummyClassImpl <em>Dummy Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.language.impl.DummyClassImpl
		 * @see kermeta.language.impl.LanguagePackageImpl#getDummyClass()
		 * @generated
		 */
		EClass DUMMY_CLASS = eINSTANCE.getDummyClass();

	}

} //LanguagePackage
