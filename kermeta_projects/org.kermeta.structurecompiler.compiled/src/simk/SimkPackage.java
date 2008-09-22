/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimkPackage.java,v 1.3 2008-09-22 14:49:06 cfaucher Exp $
 */
package simk;

import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see simk.SimkFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/simk'"
 * @generated
 */
public interface SimkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/simk/kermeta_temp_uri";

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
	SimkPackage eINSTANCE = simk.impl.SimkPackageImpl.init();

	/**
	 * The meta object id for the '{@link simk.impl.SMNamedElementImpl <em>SM Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.impl.SMNamedElementImpl
	 * @see simk.impl.SimkPackageImpl#getSMNamedElement()
	 * @generated
	 */
	int SM_NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT__CONTAINER = StructurePackage.OBJECT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT__NAME = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SM Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simk.impl.SIMKModelImpl <em>SIMK Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.impl.SIMKModelImpl
	 * @see simk.impl.SimkPackageImpl#getSIMKModel()
	 * @generated
	 */
	int SIMK_MODEL = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__FILE = SM_NAMED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__TAG = SM_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__FILE_NAME = SM_NAMED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__LINE_NUMBER = SM_NAMED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__OWNED_TAGS = SM_NAMED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__OID = SM_NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__CONTAINER = SM_NAMED_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__NAME = SM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>SM Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__SM_CONTEXTS = SM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__STATIC_METHODS = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SIMK Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL_FEATURE_COUNT = SM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simk.impl.SMClassImpl <em>SM Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.impl.SMClassImpl
	 * @see simk.impl.SimkPackageImpl#getSMClass()
	 * @generated
	 */
	int SM_CLASS = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__FILE = SM_NAMED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__TAG = SM_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__FILE_NAME = SM_NAMED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__LINE_NUMBER = SM_NAMED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__OWNED_TAGS = SM_NAMED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__OID = SM_NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__CONTAINER = SM_NAMED_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__NAME = SM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__CONTEXT = SM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__USAGES = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SM Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS_FEATURE_COUNT = SM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simk.impl.StaticMethodImpl <em>Static Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.impl.StaticMethodImpl
	 * @see simk.impl.SimkPackageImpl#getStaticMethod()
	 * @generated
	 */
	int STATIC_METHOD = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__FILE = SM_NAMED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__TAG = SM_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__FILE_NAME = SM_NAMED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__LINE_NUMBER = SM_NAMED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__OWNED_TAGS = SM_NAMED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__OID = SM_NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__CONTAINER = SM_NAMED_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__NAME = SM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__BODY = SM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__TYPE_PARAMETERS = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__PARENT_ATTRIBUTE = SM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>SM Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__SM_PARAMETERS = SM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>SM Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__SM_RETURN = SM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__USAGES = SM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__PARENT_METHOD = SM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>SM Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__SM_CONTEXT = SM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__PARENT_REFERENCE = SM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Static Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD_FEATURE_COUNT = SM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link simk.impl.SMContextImpl <em>SM Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.impl.SMContextImpl
	 * @see simk.impl.SimkPackageImpl#getSMContext()
	 * @generated
	 */
	int SM_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__CONTAINER = StructurePackage.OBJECT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Qualified Name Final Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__STATIC_METHODS = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>SM Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__SM_CLASS = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SM Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link simk.impl.SMParameterImpl <em>SM Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.impl.SMParameterImpl
	 * @see simk.impl.SimkPackageImpl#getSMParameter()
	 * @generated
	 */
	int SM_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__FILE = SM_NAMED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__TAG = SM_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__FILE_NAME = SM_NAMED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__LINE_NUMBER = SM_NAMED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__OWNED_TAGS = SM_NAMED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__OID = SM_NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__CONTAINER = SM_NAMED_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__NAME = SM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__TYPE = SM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SM Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER_FEATURE_COUNT = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simk.impl.SMTypedElementImpl <em>SM Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.impl.SMTypedElementImpl
	 * @see simk.impl.SimkPackageImpl#getSMTypedElement()
	 * @generated
	 */
	int SM_TYPED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT__CONTAINER = StructurePackage.OBJECT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT__TYPE = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SM Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simk.impl.SMReturnImpl <em>SM Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.impl.SMReturnImpl
	 * @see simk.impl.SimkPackageImpl#getSMReturn()
	 * @generated
	 */
	int SM_RETURN = 7;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN__FILE = SM_TYPED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN__TAG = SM_TYPED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN__FILE_NAME = SM_TYPED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN__LINE_NUMBER = SM_TYPED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN__OWNED_TAGS = SM_TYPED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN__OID = SM_TYPED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN__CONTAINER = SM_TYPED_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN__TYPE = SM_TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>SM Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN_FEATURE_COUNT = SM_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simk.SMUsage <em>SM Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.SMUsage
	 * @see simk.impl.SimkPackageImpl#getSMUsage()
	 * @generated
	 */
	int SM_USAGE = 8;

	/**
	 * Returns the meta object for class '{@link simk.SIMKModel <em>SIMK Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIMK Model</em>'.
	 * @see simk.SIMKModel
	 * @generated
	 */
	EClass getSIMKModel();

	/**
	 * Returns the meta object for the containment reference list '{@link simk.SIMKModel#getSMContexts <em>SM Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SM Contexts</em>'.
	 * @see simk.SIMKModel#getSMContexts()
	 * @see #getSIMKModel()
	 * @generated
	 */
	EReference getSIMKModel_SMContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link simk.SIMKModel#getStaticMethods <em>Static Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Static Methods</em>'.
	 * @see simk.SIMKModel#getStaticMethods()
	 * @see #getSIMKModel()
	 * @generated
	 */
	EReference getSIMKModel_StaticMethods();

	/**
	 * Returns the meta object for class '{@link simk.SMClass <em>SM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Class</em>'.
	 * @see simk.SMClass
	 * @generated
	 */
	EClass getSMClass();

	/**
	 * Returns the meta object for the container reference '{@link simk.SMClass#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see simk.SMClass#getContext()
	 * @see #getSMClass()
	 * @generated
	 */
	EReference getSMClass_Context();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMClass#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usages</em>'.
	 * @see simk.SMClass#getUsages()
	 * @see #getSMClass()
	 * @generated
	 */
	EAttribute getSMClass_Usages();

	/**
	 * Returns the meta object for class '{@link simk.StaticMethod <em>Static Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Method</em>'.
	 * @see simk.StaticMethod
	 * @generated
	 */
	EClass getStaticMethod();

	/**
	 * Returns the meta object for the attribute '{@link simk.StaticMethod#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see simk.StaticMethod#getBody()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EAttribute getStaticMethod_Body();

	/**
	 * Returns the meta object for the attribute '{@link simk.StaticMethod#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Parameters</em>'.
	 * @see simk.StaticMethod#getTypeParameters()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EAttribute getStaticMethod_TypeParameters();

	/**
	 * Returns the meta object for the reference '{@link simk.StaticMethod#getParentAttribute <em>Parent Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Attribute</em>'.
	 * @see simk.StaticMethod#getParentAttribute()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_ParentAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link simk.StaticMethod#getSMParameters <em>SM Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SM Parameters</em>'.
	 * @see simk.StaticMethod#getSMParameters()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_SMParameters();

	/**
	 * Returns the meta object for the containment reference '{@link simk.StaticMethod#getSMReturn <em>SM Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SM Return</em>'.
	 * @see simk.StaticMethod#getSMReturn()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_SMReturn();

	/**
	 * Returns the meta object for the attribute '{@link simk.StaticMethod#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usages</em>'.
	 * @see simk.StaticMethod#getUsages()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EAttribute getStaticMethod_Usages();

	/**
	 * Returns the meta object for the reference '{@link simk.StaticMethod#getParentMethod <em>Parent Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Method</em>'.
	 * @see simk.StaticMethod#getParentMethod()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_ParentMethod();

	/**
	 * Returns the meta object for the reference '{@link simk.StaticMethod#getSMContext <em>SM Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SM Context</em>'.
	 * @see simk.StaticMethod#getSMContext()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_SMContext();

	/**
	 * Returns the meta object for the reference '{@link simk.StaticMethod#getParentReference <em>Parent Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Reference</em>'.
	 * @see simk.StaticMethod#getParentReference()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_ParentReference();

	/**
	 * Returns the meta object for class '{@link simk.SMContext <em>SM Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Context</em>'.
	 * @see simk.SMContext
	 * @generated
	 */
	EClass getSMContext();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMContext#getQualifiedNameFinalPackage <em>Qualified Name Final Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name Final Package</em>'.
	 * @see simk.SMContext#getQualifiedNameFinalPackage()
	 * @see #getSMContext()
	 * @generated
	 */
	EAttribute getSMContext_QualifiedNameFinalPackage();

	/**
	 * Returns the meta object for the reference list '{@link simk.SMContext#getStaticMethods <em>Static Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Static Methods</em>'.
	 * @see simk.SMContext#getStaticMethods()
	 * @see #getSMContext()
	 * @generated
	 */
	EReference getSMContext_StaticMethods();

	/**
	 * Returns the meta object for the containment reference '{@link simk.SMContext#getSMClass <em>SM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SM Class</em>'.
	 * @see simk.SMContext#getSMClass()
	 * @see #getSMContext()
	 * @generated
	 */
	EReference getSMContext_SMClass();

	/**
	 * Returns the meta object for class '{@link simk.SMNamedElement <em>SM Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Named Element</em>'.
	 * @see simk.SMNamedElement
	 * @generated
	 */
	EClass getSMNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simk.SMNamedElement#getName()
	 * @see #getSMNamedElement()
	 * @generated
	 */
	EAttribute getSMNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link simk.SMParameter <em>SM Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Parameter</em>'.
	 * @see simk.SMParameter
	 * @generated
	 */
	EClass getSMParameter();

	/**
	 * Returns the meta object for class '{@link simk.SMTypedElement <em>SM Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Typed Element</em>'.
	 * @see simk.SMTypedElement
	 * @generated
	 */
	EClass getSMTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see simk.SMTypedElement#getType()
	 * @see #getSMTypedElement()
	 * @generated
	 */
	EAttribute getSMTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link simk.SMReturn <em>SM Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Return</em>'.
	 * @see simk.SMReturn
	 * @generated
	 */
	EClass getSMReturn();

	/**
	 * Returns the meta object for enum '{@link simk.SMUsage <em>SM Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SM Usage</em>'.
	 * @see simk.SMUsage
	 * @generated
	 */
	EEnum getSMUsage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimkFactory getSimkFactory();

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
		 * The meta object literal for the '{@link simk.impl.SIMKModelImpl <em>SIMK Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.impl.SIMKModelImpl
		 * @see simk.impl.SimkPackageImpl#getSIMKModel()
		 * @generated
		 */
		EClass SIMK_MODEL = eINSTANCE.getSIMKModel();

		/**
		 * The meta object literal for the '<em><b>SM Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMK_MODEL__SM_CONTEXTS = eINSTANCE
				.getSIMKModel_SMContexts();

		/**
		 * The meta object literal for the '<em><b>Static Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMK_MODEL__STATIC_METHODS = eINSTANCE
				.getSIMKModel_StaticMethods();

		/**
		 * The meta object literal for the '{@link simk.impl.SMClassImpl <em>SM Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.impl.SMClassImpl
		 * @see simk.impl.SimkPackageImpl#getSMClass()
		 * @generated
		 */
		EClass SM_CLASS = eINSTANCE.getSMClass();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CLASS__CONTEXT = eINSTANCE.getSMClass_Context();

		/**
		 * The meta object literal for the '<em><b>Usages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_CLASS__USAGES = eINSTANCE.getSMClass_Usages();

		/**
		 * The meta object literal for the '{@link simk.impl.StaticMethodImpl <em>Static Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.impl.StaticMethodImpl
		 * @see simk.impl.SimkPackageImpl#getStaticMethod()
		 * @generated
		 */
		EClass STATIC_METHOD = eINSTANCE.getStaticMethod();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_METHOD__BODY = eINSTANCE.getStaticMethod_Body();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_METHOD__TYPE_PARAMETERS = eINSTANCE
				.getStaticMethod_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Parent Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__PARENT_ATTRIBUTE = eINSTANCE
				.getStaticMethod_ParentAttribute();

		/**
		 * The meta object literal for the '<em><b>SM Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__SM_PARAMETERS = eINSTANCE
				.getStaticMethod_SMParameters();

		/**
		 * The meta object literal for the '<em><b>SM Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__SM_RETURN = eINSTANCE
				.getStaticMethod_SMReturn();

		/**
		 * The meta object literal for the '<em><b>Usages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_METHOD__USAGES = eINSTANCE.getStaticMethod_Usages();

		/**
		 * The meta object literal for the '<em><b>Parent Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__PARENT_METHOD = eINSTANCE
				.getStaticMethod_ParentMethod();

		/**
		 * The meta object literal for the '<em><b>SM Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__SM_CONTEXT = eINSTANCE
				.getStaticMethod_SMContext();

		/**
		 * The meta object literal for the '<em><b>Parent Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__PARENT_REFERENCE = eINSTANCE
				.getStaticMethod_ParentReference();

		/**
		 * The meta object literal for the '{@link simk.impl.SMContextImpl <em>SM Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.impl.SMContextImpl
		 * @see simk.impl.SimkPackageImpl#getSMContext()
		 * @generated
		 */
		EClass SM_CONTEXT = eINSTANCE.getSMContext();

		/**
		 * The meta object literal for the '<em><b>Qualified Name Final Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE = eINSTANCE
				.getSMContext_QualifiedNameFinalPackage();

		/**
		 * The meta object literal for the '<em><b>Static Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CONTEXT__STATIC_METHODS = eINSTANCE
				.getSMContext_StaticMethods();

		/**
		 * The meta object literal for the '<em><b>SM Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CONTEXT__SM_CLASS = eINSTANCE.getSMContext_SMClass();

		/**
		 * The meta object literal for the '{@link simk.impl.SMNamedElementImpl <em>SM Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.impl.SMNamedElementImpl
		 * @see simk.impl.SimkPackageImpl#getSMNamedElement()
		 * @generated
		 */
		EClass SM_NAMED_ELEMENT = eINSTANCE.getSMNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_NAMED_ELEMENT__NAME = eINSTANCE.getSMNamedElement_Name();

		/**
		 * The meta object literal for the '{@link simk.impl.SMParameterImpl <em>SM Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.impl.SMParameterImpl
		 * @see simk.impl.SimkPackageImpl#getSMParameter()
		 * @generated
		 */
		EClass SM_PARAMETER = eINSTANCE.getSMParameter();

		/**
		 * The meta object literal for the '{@link simk.impl.SMTypedElementImpl <em>SM Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.impl.SMTypedElementImpl
		 * @see simk.impl.SimkPackageImpl#getSMTypedElement()
		 * @generated
		 */
		EClass SM_TYPED_ELEMENT = eINSTANCE.getSMTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_TYPED_ELEMENT__TYPE = eINSTANCE.getSMTypedElement_Type();

		/**
		 * The meta object literal for the '{@link simk.impl.SMReturnImpl <em>SM Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.impl.SMReturnImpl
		 * @see simk.impl.SimkPackageImpl#getSMReturn()
		 * @generated
		 */
		EClass SM_RETURN = eINSTANCE.getSMReturn();

		/**
		 * The meta object literal for the '{@link simk.SMUsage <em>SM Usage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.SMUsage
		 * @see simk.impl.SimkPackageImpl#getSMUsage()
		 * @generated
		 */
		EEnum SM_USAGE = eINSTANCE.getSMUsage();

	}

} //SimkPackage
