/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.utils;

import kermeta.language.structure.StructurePackage;

import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/kermeta/1_2_0//kermeta/utils'"
 *        annotation="kermeta documentation='/** \n * Contains special classes (Hashtable, Stack) that are not contained in Kermeta\n * metamodel\n * \n * <img src=\"./figures/utils_package.png\"/>\n \052/'"
 *        annotation="kermeta documentation='/** \n * Contains special classes (Hashtable, Stack) that are not contained in Kermeta\n * metamodel\n \052/'"
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
	String eNS_URI = "http://www.kermeta.org/kermeta/1_2_0//kermeta/utils/kermeta_temp_uri";

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
	 * The meta object id for the '{@link kermeta.utils.impl.StringBufferImpl <em>String Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.utils.impl.StringBufferImpl
	 * @see kermeta.utils.impl.UtilsPackageImpl#getStringBuffer()
	 * @generated
	 */
	int STRING_BUFFER = 0;

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
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BUFFER__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BUFFER__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BUFFER__CONTENT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BUFFER_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kermeta.utils.impl.HashtableImpl <em>Hashtable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.utils.impl.HashtableImpl
	 * @see kermeta.utils.impl.UtilsPackageImpl#getHashtable()
	 * @generated
	 */
	int HASHTABLE = 1;

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
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTABLE__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTABLE__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Wrapped Hashtable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTABLE__WRAPPED_HASHTABLE = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hashtable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTABLE_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__OID = StandardPackage.SEQUENCE__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__INTERNAL_CONTAINING_RESOURCE = StandardPackage.SEQUENCE__INTERNAL_CONTAINING_RESOURCE;

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
	 * The meta object id for the '<em>Kermeta Property String Buffer content</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.StringBuffer
	 * @see kermeta.utils.impl.UtilsPackageImpl#getKermetaProperty_StringBuffer_content()
	 * @generated
	 */
	int KERMETA_PROPERTY_STRING_BUFFER_CONTENT = 3;

	/**
	 * The meta object id for the '<em>Kermeta Property Hashtable wrapped Hashtable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Hashtable
	 * @see kermeta.utils.impl.UtilsPackageImpl#getKermetaProperty_Hashtable_wrappedHashtable()
	 * @generated
	 */
	int KERMETA_PROPERTY_HASHTABLE_WRAPPED_HASHTABLE = 4;

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
	 * Returns the meta object for the attribute '{@link kermeta.utils.StringBuffer#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see kermeta.utils.StringBuffer#getContent()
	 * @see #getStringBuffer()
	 * @generated
	 */
	EAttribute getStringBuffer_Content();

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
	 * Returns the meta object for the attribute '{@link kermeta.utils.Hashtable#getWrappedHashtable <em>Wrapped Hashtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrapped Hashtable</em>'.
	 * @see kermeta.utils.Hashtable#getWrappedHashtable()
	 * @see #getHashtable()
	 * @generated
	 */
	EAttribute getHashtable_WrappedHashtable();

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
	 * Returns the meta object for data type '{@link java.lang.StringBuffer <em>Kermeta Property String Buffer content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kermeta Property String Buffer content</em>'.
	 * @see java.lang.StringBuffer
	 * @model instanceClass="java.lang.StringBuffer"
	 * @generated
	 */
	EDataType getKermetaProperty_StringBuffer_content();

	/**
	 * Returns the meta object for data type '{@link java.util.Hashtable <em>Kermeta Property Hashtable wrapped Hashtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kermeta Property Hashtable wrapped Hashtable</em>'.
	 * @see java.util.Hashtable
	 * @model instanceClass="java.util.Hashtable" typeParameters="K V"
	 * @generated
	 */
	EDataType getKermetaProperty_Hashtable_wrappedHashtable();

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
		 * The meta object literal for the '{@link kermeta.utils.impl.StringBufferImpl <em>String Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.utils.impl.StringBufferImpl
		 * @see kermeta.utils.impl.UtilsPackageImpl#getStringBuffer()
		 * @generated
		 */
		EClass STRING_BUFFER = eINSTANCE.getStringBuffer();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_BUFFER__CONTENT = eINSTANCE.getStringBuffer_Content();

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
		 * The meta object literal for the '<em><b>Wrapped Hashtable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASHTABLE__WRAPPED_HASHTABLE = eINSTANCE
				.getHashtable_WrappedHashtable();

		/**
		 * The meta object literal for the '{@link kermeta.utils.impl.StackImpl <em>Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.utils.impl.StackImpl
		 * @see kermeta.utils.impl.UtilsPackageImpl#getStack()
		 * @generated
		 */
		EClass STACK = eINSTANCE.getStack();

		/**
		 * The meta object literal for the '<em>Kermeta Property String Buffer content</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.StringBuffer
		 * @see kermeta.utils.impl.UtilsPackageImpl#getKermetaProperty_StringBuffer_content()
		 * @generated
		 */
		EDataType KERMETA_PROPERTY_STRING_BUFFER_CONTENT = eINSTANCE
				.getKermetaProperty_StringBuffer_content();

		/**
		 * The meta object literal for the '<em>Kermeta Property Hashtable wrapped Hashtable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Hashtable
		 * @see kermeta.utils.impl.UtilsPackageImpl#getKermetaProperty_Hashtable_wrappedHashtable()
		 * @generated
		 */
		EDataType KERMETA_PROPERTY_HASHTABLE_WRAPPED_HASHTABLE = eINSTANCE
				.getKermetaProperty_Hashtable_wrappedHashtable();

	}

} //UtilsPackage
