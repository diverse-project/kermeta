/**
 * <copyright>
 * </copyright>
 *
 * $Id: UtilsPackage.java,v 1.1 2008-07-02 09:43:42 ftanguy Exp $
 */
package kermeta.utils;

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
 * @see kermeta.utils.UtilsFactory
 * @model kind="package"
 *        annotation="kermeta documentation='/** \r\n * Contains special classes (Hashtable, Stack) that are not contained in Kermeta\r\n * metamodel\r\n * \r\n * <img src=\"./figures/utils_package.png\"/>\r\n \052/'"
 *        annotation="kermeta documentation='/** \r\n * Contains special classes (Hashtable, Stack) that are not contained in Kermeta\r\n * metamodel\r\n \052/'"
 * @generated
 */
public interface UtilsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "utils";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kermeta/utils";

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
	UtilsPackage eINSTANCE = kermeta.utils.impl.UtilsPackageImpl.init();

	/**
	 * The meta object id for the '{@link kermeta.utils.impl.HashtableImpl <em>Hashtable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.utils.impl.HashtableImpl
	 * @see kermeta.utils.impl.UtilsPackageImpl#getHashtable()
	 * @generated
	 */
	int HASHTABLE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTABLE__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTABLE__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The number of structural features of the '<em>Hashtable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTABLE_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.utils.impl.StringBufferImpl <em>String Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.utils.impl.StringBufferImpl
	 * @see kermeta.utils.impl.UtilsPackageImpl#getStringBuffer()
	 * @generated
	 */
	int STRING_BUFFER = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BUFFER__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BUFFER__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The number of structural features of the '<em>String Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BUFFER_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.utils.impl.StackImpl <em>Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.utils.impl.StackImpl
	 * @see kermeta.utils.impl.UtilsPackageImpl#getStack()
	 * @generated
	 */
	int STACK = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__TAG = StandardPackage.SEQUENCE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__OWNED_TAGS = StandardPackage.SEQUENCE__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__VALUES = StandardPackage.SEQUENCE__VALUES;

	/**
	 * The number of structural features of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_FEATURE_COUNT = StandardPackage.SEQUENCE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link kermeta.utils.Hashtable <em>Hashtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hashtable</em>'.
	 * @see kermeta.utils.Hashtable
	 * @generated
	 */
	EClass getHashtable();

	/**
	 * Returns the meta object for class '{@link kermeta.utils.StringBuffer <em>String Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Buffer</em>'.
	 * @see kermeta.utils.StringBuffer
	 * @generated
	 */
	EClass getStringBuffer();

	/**
	 * Returns the meta object for class '{@link kermeta.utils.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack</em>'.
	 * @see kermeta.utils.Stack
	 * @generated
	 */
	EClass getStack();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilsFactory getUtilsFactory();

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
		 * The meta object literal for the '{@link kermeta.utils.impl.HashtableImpl <em>Hashtable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.utils.impl.HashtableImpl
		 * @see kermeta.utils.impl.UtilsPackageImpl#getHashtable()
		 * @generated
		 */
		EClass HASHTABLE = eINSTANCE.getHashtable();

		/**
		 * The meta object literal for the '{@link kermeta.utils.impl.StringBufferImpl <em>String Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.utils.impl.StringBufferImpl
		 * @see kermeta.utils.impl.UtilsPackageImpl#getStringBuffer()
		 * @generated
		 */
		EClass STRING_BUFFER = eINSTANCE.getStringBuffer();

		/**
		 * The meta object literal for the '{@link kermeta.utils.impl.StackImpl <em>Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.utils.impl.StackImpl
		 * @see kermeta.utils.impl.UtilsPackageImpl#getStack()
		 * @generated
		 */
		EClass STACK = eINSTANCE.getStack();

	}

} //UtilsPackage
