/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: StandardPackage.java,v 1.2 2008-07-25 12:40:11 ftanguy Exp $
 */
package kermeta.standard;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see kermeta.standard.StandardFactory
 * @model kind="package"
 *        annotation="kermeta documentation='/**\r\n * Defines Collection types \r\n * <img src=\"./figures/collections_view.png\"/>\r\n \052/'"
 *        annotation="kermeta documentation='/**\r\n * Defines primitive types \r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/primitive_types_view.png\"/>\r\n \052/'"
 *        annotation="kermeta documentation='/**\r\n * Contains types dedicated to dealing with java objects\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/java_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface StandardPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "standard";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.kermeta.org/kermeta/standard/kermeta_temp_uri";

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
  StandardPackage eINSTANCE = kermeta.standard.impl.StandardPackageImpl.init();

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.CollectionImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getCollection()
	 * @generated
	 */
  int COLLECTION = 0;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION__TAG = StructurePackage.OBJECT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__VALUES = StructurePackage.OBJECT_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.SetImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getSet()
	 * @generated
	 */
  int SET = 1;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET__TAG = COLLECTION__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET__OWNED_TAGS = COLLECTION__OWNED_TAGS;

  /**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__VALUES = COLLECTION__VALUES;

		/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.BagImpl <em>Bag</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.BagImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getBag()
	 * @generated
	 */
  int BAG = 2;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BAG__TAG = COLLECTION__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BAG__OWNED_TAGS = COLLECTION__OWNED_TAGS;

  /**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__VALUES = COLLECTION__VALUES;

		/**
	 * The number of structural features of the '<em>Bag</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BAG_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.OrderedCollectionImpl <em>Ordered Collection</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.OrderedCollectionImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getOrderedCollection()
	 * @generated
	 */
  int ORDERED_COLLECTION = 3;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_COLLECTION__TAG = COLLECTION__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_COLLECTION__OWNED_TAGS = COLLECTION__OWNED_TAGS;

  /**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__VALUES = COLLECTION__VALUES;

		/**
	 * The number of structural features of the '<em>Ordered Collection</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_COLLECTION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.OrderedSetImpl <em>Ordered Set</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.OrderedSetImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getOrderedSet()
	 * @generated
	 */
  int ORDERED_SET = 4;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_SET__TAG = SET__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_SET__OWNED_TAGS = SET__OWNED_TAGS;

  /**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET__VALUES = SET__VALUES;

		/**
	 * The number of structural features of the '<em>Ordered Set</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_SET_FEATURE_COUNT = SET_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.SequenceImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getSequence()
	 * @generated
	 */
  int SEQUENCE = 5;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE__TAG = BAG__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE__OWNED_TAGS = BAG__OWNED_TAGS;

  /**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__VALUES = BAG__VALUES;

		/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE_FEATURE_COUNT = BAG_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.IteratorImpl <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.IteratorImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getIterator()
	 * @generated
	 */
  int ITERATOR = 6;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR__TAG = StructurePackage.OBJECT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
	 * The feature id for the '<em><b>Java Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__JAVA_ITERATOR = StructurePackage.OBJECT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Kermeta Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__KERMETA_COLLECTION = StructurePackage.OBJECT_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.VoidImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getVoid()
	 * @generated
	 */
  int VOID = 7;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VOID__TAG = StructurePackage.OBJECT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VOID__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
	 * The number of structural features of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VOID_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.ValueTypeImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getValueType()
	 * @generated
	 */
  int VALUE_TYPE = 8;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_TYPE__TAG = StructurePackage.OBJECT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_TYPE__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_TYPE_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.ComparableImpl <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.ComparableImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getComparable()
	 * @generated
	 */
  int COMPARABLE = 9;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPARABLE__TAG = StructurePackage.OBJECT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPARABLE__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
	 * The number of structural features of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPARABLE_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.SummableImpl <em>Summable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.SummableImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getSummable()
	 * @generated
	 */
  int SUMMABLE = 10;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUMMABLE__TAG = StructurePackage.OBJECT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUMMABLE__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
	 * The number of structural features of the '<em>Summable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUMMABLE_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.NotComparableExceptionImpl <em>Not Comparable Exception</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.NotComparableExceptionImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getNotComparableException()
	 * @generated
	 */
  int NOT_COMPARABLE_EXCEPTION = 11;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT_COMPARABLE_EXCEPTION__TAG = ExceptionsPackage.EXCEPTION__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT_COMPARABLE_EXCEPTION__OWNED_TAGS = ExceptionsPackage.EXCEPTION__OWNED_TAGS;

  /**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT_COMPARABLE_EXCEPTION__MESSAGE = ExceptionsPackage.EXCEPTION__MESSAGE;

  /**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT_COMPARABLE_EXCEPTION__NESTED_EXCEPTION = ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION;

  /**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT_COMPARABLE_EXCEPTION__STACK_TRACE = ExceptionsPackage.EXCEPTION__STACK_TRACE;

  /**
	 * The number of structural features of the '<em>Not Comparable Exception</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT_COMPARABLE_EXCEPTION_FEATURE_COUNT = ExceptionsPackage.EXCEPTION_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.UnknownJavaObjectImpl <em>Unknown Java Object</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.UnknownJavaObjectImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getUnknownJavaObject()
	 * @generated
	 */
  int UNKNOWN_JAVA_OBJECT = 12;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNKNOWN_JAVA_OBJECT__TAG = StructurePackage.OBJECT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNKNOWN_JAVA_OBJECT__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
	 * The number of structural features of the '<em>Unknown Java Object</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNKNOWN_JAVA_OBJECT_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link kermeta.standard.impl.KermetaSpecialTypesAliasImpl <em>Kermeta Special Types Alias</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.KermetaSpecialTypesAliasImpl
	 * @see kermeta.standard.impl.StandardPackageImpl#getKermetaSpecialTypesAlias()
	 * @generated
	 */
  int KERMETA_SPECIAL_TYPES_ALIAS = 13;

  /**
	 * The number of structural features of the '<em>Kermeta Special Types Alias</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int KERMETA_SPECIAL_TYPES_ALIAS_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.StandardPackageImpl#getBoolean()
	 * @generated
	 */
  int BOOLEAN = 14;

  /**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.StandardPackageImpl#getInteger()
	 * @generated
	 */
  int INTEGER = 15;

  /**
	 * The meta object id for the '<em>Real</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see kermeta.standard.impl.StandardPackageImpl#getReal()
	 * @generated
	 */
  int REAL = 16;

  /**
	 * The meta object id for the '<em>Character</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see kermeta.standard.impl.StandardPackageImpl#getCharacter()
	 * @generated
	 */
  int CHARACTER = 17;

  /**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see kermeta.standard.impl.StandardPackageImpl#getString()
	 * @generated
	 */
  int STRING = 18;

  /**
	 * The meta object id for the '<em>Unlimited Natural</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see kermeta.standard.impl.StandardPackageImpl#getUnlimitedNatural()
	 * @generated
	 */
  int UNLIMITED_NATURAL = 19;


  /**
	 * The meta object id for the '<em>Java Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Iterator
	 * @see kermeta.standard.impl.StandardPackageImpl#getJavaIterator()
	 * @generated
	 */
	int JAVA_ITERATOR = 20;


		/**
	 * Returns the meta object for class '{@link kermeta.standard.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see kermeta.standard.Collection
	 * @generated
	 */
  EClass getCollection();

  /**
	 * Returns the meta object for the attribute '{@link kermeta.standard.Collection#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see kermeta.standard.Collection#getValues()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Values();

		/**
	 * Returns the meta object for class '{@link kermeta.standard.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see kermeta.standard.Set
	 * @generated
	 */
  EClass getSet();

  /**
	 * Returns the meta object for class '{@link kermeta.standard.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag</em>'.
	 * @see kermeta.standard.Bag
	 * @generated
	 */
  EClass getBag();

  /**
	 * Returns the meta object for class '{@link kermeta.standard.OrderedCollection <em>Ordered Collection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Collection</em>'.
	 * @see kermeta.standard.OrderedCollection
	 * @generated
	 */
  EClass getOrderedCollection();

  /**
	 * Returns the meta object for class '{@link kermeta.standard.OrderedSet <em>Ordered Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set</em>'.
	 * @see kermeta.standard.OrderedSet
	 * @generated
	 */
  EClass getOrderedSet();

  /**
	 * Returns the meta object for class '{@link kermeta.standard.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see kermeta.standard.Sequence
	 * @generated
	 */
  EClass getSequence();

  /**
	 * Returns the meta object for class '{@link kermeta.standard.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see kermeta.standard.Iterator
	 * @generated
	 */
  EClass getIterator();

  /**
	 * Returns the meta object for the attribute '{@link kermeta.standard.Iterator#getJavaIterator <em>Java Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Iterator</em>'.
	 * @see kermeta.standard.Iterator#getJavaIterator()
	 * @see #getIterator()
	 * @generated
	 */
	EAttribute getIterator_JavaIterator();

		/**
	 * Returns the meta object for the reference '{@link kermeta.standard.Iterator#getKermetaCollection <em>Kermeta Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kermeta Collection</em>'.
	 * @see kermeta.standard.Iterator#getKermetaCollection()
	 * @see #getIterator()
	 * @generated
	 */
	EReference getIterator_KermetaCollection();

		/**
	 * Returns the meta object for class '{@link kermeta.standard.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see kermeta.standard.Void
	 * @generated
	 */
  EClass getVoid();

  /**
	 * Returns the meta object for class '{@link kermeta.standard.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see kermeta.standard.ValueType
	 * @generated
	 */
  EClass getValueType();

  /**
	 * Returns the meta object for class '{@link kermeta.standard.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see kermeta.standard.Comparable
	 * @generated
	 */
  EClass getComparable();

  /**
	 * Returns the meta object for class '{@link kermeta.standard.Summable <em>Summable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summable</em>'.
	 * @see kermeta.standard.Summable
	 * @generated
	 */
  EClass getSummable();

  /**
	 * Returns the meta object for class '{@link kermeta.standard.NotComparableException <em>Not Comparable Exception</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Comparable Exception</em>'.
	 * @see kermeta.standard.NotComparableException
	 * @generated
	 */
  EClass getNotComparableException();

  /**
	 * Returns the meta object for class '{@link kermeta.standard.UnknownJavaObject <em>Unknown Java Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Java Object</em>'.
	 * @see kermeta.standard.UnknownJavaObject
	 * @generated
	 */
  EClass getUnknownJavaObject();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecore.EObject <em>Kermeta Special Types Alias</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kermeta Special Types Alias</em>'.
	 * @see org.eclipse.emf.ecore.EObject
	 * @model instanceClass="org.eclipse.emf.ecore.EObject"
	 *        annotation="kermeta alias='KermetaSpecialTypesAlias'"
	 * @generated
	 */
  EClass getKermetaSpecialTypesAlias();

  /**
	 * Returns the meta object for data type '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
  EDataType getBoolean();

  /**
	 * Returns the meta object for data type '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
  EDataType getInteger();

  /**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Real</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Real</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
  EDataType getReal();

  /**
	 * Returns the meta object for data type '<em>Character</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Character</em>'.
	 * @model instanceClass="char"
	 * @generated
	 */
  EDataType getCharacter();

  /**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
  EDataType getString();

  /**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unlimited Natural</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        annotation="kermeta alias='kermeta::standard::Integer'"
	 *        annotation="kermeta documentation='/**\r\n * Unlimited natural is used for reflection.\r\n * It is mapped to integer.equals().\r\n * Any negative number is interpreted as \'*\'\r\n \052/'"
	 * @generated
	 */
  EDataType getUnlimitedNatural();

  /**
	 * Returns the meta object for data type '{@link java.util.Iterator <em>Java Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Iterator</em>'.
	 * @see java.util.Iterator
	 * @model instanceClass="java.util.Iterator" typeParameters="G"
	 * @generated
	 */
	EDataType getJavaIterator();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  StandardFactory getStandardFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.CollectionImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getCollection()
		 * @generated
		 */
    EClass COLLECTION = eINSTANCE.getCollection();

    /**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__VALUES = eINSTANCE.getCollection_Values();

				/**
		 * The meta object literal for the '{@link kermeta.standard.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.SetImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getSet()
		 * @generated
		 */
    EClass SET = eINSTANCE.getSet();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.BagImpl <em>Bag</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.BagImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getBag()
		 * @generated
		 */
    EClass BAG = eINSTANCE.getBag();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.OrderedCollectionImpl <em>Ordered Collection</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.OrderedCollectionImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getOrderedCollection()
		 * @generated
		 */
    EClass ORDERED_COLLECTION = eINSTANCE.getOrderedCollection();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.OrderedSetImpl <em>Ordered Set</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.OrderedSetImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getOrderedSet()
		 * @generated
		 */
    EClass ORDERED_SET = eINSTANCE.getOrderedSet();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.SequenceImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getSequence()
		 * @generated
		 */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.IteratorImpl <em>Iterator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.IteratorImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getIterator()
		 * @generated
		 */
    EClass ITERATOR = eINSTANCE.getIterator();

    /**
		 * The meta object literal for the '<em><b>Java Iterator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR__JAVA_ITERATOR = eINSTANCE.getIterator_JavaIterator();

				/**
		 * The meta object literal for the '<em><b>Kermeta Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR__KERMETA_COLLECTION = eINSTANCE.getIterator_KermetaCollection();

				/**
		 * The meta object literal for the '{@link kermeta.standard.impl.VoidImpl <em>Void</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.VoidImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getVoid()
		 * @generated
		 */
    EClass VOID = eINSTANCE.getVoid();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.ValueTypeImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getValueType()
		 * @generated
		 */
    EClass VALUE_TYPE = eINSTANCE.getValueType();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.ComparableImpl <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.ComparableImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getComparable()
		 * @generated
		 */
    EClass COMPARABLE = eINSTANCE.getComparable();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.SummableImpl <em>Summable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.SummableImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getSummable()
		 * @generated
		 */
    EClass SUMMABLE = eINSTANCE.getSummable();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.NotComparableExceptionImpl <em>Not Comparable Exception</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.NotComparableExceptionImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getNotComparableException()
		 * @generated
		 */
    EClass NOT_COMPARABLE_EXCEPTION = eINSTANCE.getNotComparableException();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.UnknownJavaObjectImpl <em>Unknown Java Object</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.UnknownJavaObjectImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getUnknownJavaObject()
		 * @generated
		 */
    EClass UNKNOWN_JAVA_OBJECT = eINSTANCE.getUnknownJavaObject();

    /**
		 * The meta object literal for the '{@link kermeta.standard.impl.KermetaSpecialTypesAliasImpl <em>Kermeta Special Types Alias</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.KermetaSpecialTypesAliasImpl
		 * @see kermeta.standard.impl.StandardPackageImpl#getKermetaSpecialTypesAlias()
		 * @generated
		 */
    EClass KERMETA_SPECIAL_TYPES_ALIAS = eINSTANCE.getKermetaSpecialTypesAlias();

    /**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.StandardPackageImpl#getBoolean()
		 * @generated
		 */
    EDataType BOOLEAN = eINSTANCE.getBoolean();

    /**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.StandardPackageImpl#getInteger()
		 * @generated
		 */
    EDataType INTEGER = eINSTANCE.getInteger();

    /**
		 * The meta object literal for the '<em>Real</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see kermeta.standard.impl.StandardPackageImpl#getReal()
		 * @generated
		 */
    EDataType REAL = eINSTANCE.getReal();

    /**
		 * The meta object literal for the '<em>Character</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see kermeta.standard.impl.StandardPackageImpl#getCharacter()
		 * @generated
		 */
    EDataType CHARACTER = eINSTANCE.getCharacter();

    /**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see kermeta.standard.impl.StandardPackageImpl#getString()
		 * @generated
		 */
    EDataType STRING = eINSTANCE.getString();

    /**
		 * The meta object literal for the '<em>Unlimited Natural</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see kermeta.standard.impl.StandardPackageImpl#getUnlimitedNatural()
		 * @generated
		 */
    EDataType UNLIMITED_NATURAL = eINSTANCE.getUnlimitedNatural();

				/**
		 * The meta object literal for the '<em>Java Iterator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see kermeta.standard.impl.StandardPackageImpl#getJavaIterator()
		 * @generated
		 */
		EDataType JAVA_ITERATOR = eINSTANCE.getJavaIterator();

  }

} //StandardPackage
