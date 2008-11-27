/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimkPackage.java,v 1.9 2008-11-27 15:50:13 cfaucher Exp $
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
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

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
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__INTERNAL_CONTAINING_RESOURCE = SM_NAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

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
	 * The feature id for the '<em><b>SM Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__SM_METHODS = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__INTERNAL_CONTAINING_RESOURCE = SM_NAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

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
	 * The meta object id for the '{@link simk.impl.SMMethodImpl <em>SM Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.impl.SMMethodImpl
	 * @see simk.impl.SimkPackageImpl#getSMMethod()
	 * @generated
	 */
	int SM_METHOD = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__FILE = SM_NAMED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__TAG = SM_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__FILE_NAME = SM_NAMED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__LINE_NUMBER = SM_NAMED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__OWNED_TAGS = SM_NAMED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__OID = SM_NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__INTERNAL_CONTAINING_RESOURCE = SM_NAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__NAME = SM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__ABSTRACT = SM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__BODY = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__PARENT_EREFERENCE = SM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__STATIC = SM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent EOperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__PARENT_EOPERATION = SM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__TYPE_PARAMETERS = SM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__PARENT_EATTRIBUTE = SM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>SM Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__SM_PARAMETERS = SM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>SM Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__SM_RETURN = SM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__USAGES = SM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>SM Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__SM_CONTEXT = SM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD__ACCESS = SM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>SM Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_METHOD_FEATURE_COUNT = SM_NAMED_ELEMENT_FEATURE_COUNT + 12;

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
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>SM Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__SM_CLASS = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SM Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__SM_METHODS = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final Package QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__FINAL_PACKAGE_QNAME = StructurePackage.OBJECT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__INTERNAL_CONTAINING_RESOURCE = SM_NAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

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
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

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
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN__INTERNAL_CONTAINING_RESOURCE = SM_TYPED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

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
	 * The meta object id for the '{@link simk.SMAccess <em>SM Access</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simk.SMAccess
	 * @see simk.impl.SimkPackageImpl#getSMAccess()
	 * @generated
	 */
	int SM_ACCESS = 9;

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
	 * Returns the meta object for the containment reference list '{@link simk.SIMKModel#getSMMethods <em>SM Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SM Methods</em>'.
	 * @see simk.SIMKModel#getSMMethods()
	 * @see #getSIMKModel()
	 * @generated
	 */
	EReference getSIMKModel_SMMethods();

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
	 * Returns the meta object for class '{@link simk.SMMethod <em>SM Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Method</em>'.
	 * @see simk.SMMethod
	 * @generated
	 */
	EClass getSMMethod();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMMethod#is_abstract <em>abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>abstract</em>'.
	 * @see simk.SMMethod#is_abstract()
	 * @see #getSMMethod()
	 * @generated
	 */
	EAttribute getSMMethod__abstract();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMMethod#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see simk.SMMethod#getBody()
	 * @see #getSMMethod()
	 * @generated
	 */
	EAttribute getSMMethod_Body();

	/**
	 * Returns the meta object for the reference '{@link simk.SMMethod#getParentEReference <em>Parent EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent EReference</em>'.
	 * @see simk.SMMethod#getParentEReference()
	 * @see #getSMMethod()
	 * @generated
	 */
	EReference getSMMethod_ParentEReference();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMMethod#is_static <em>static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>static</em>'.
	 * @see simk.SMMethod#is_static()
	 * @see #getSMMethod()
	 * @generated
	 */
	EAttribute getSMMethod__static();

	/**
	 * Returns the meta object for the reference '{@link simk.SMMethod#getParentEOperation <em>Parent EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent EOperation</em>'.
	 * @see simk.SMMethod#getParentEOperation()
	 * @see #getSMMethod()
	 * @generated
	 */
	EReference getSMMethod_ParentEOperation();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMMethod#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Parameters</em>'.
	 * @see simk.SMMethod#getTypeParameters()
	 * @see #getSMMethod()
	 * @generated
	 */
	EAttribute getSMMethod_TypeParameters();

	/**
	 * Returns the meta object for the reference '{@link simk.SMMethod#getParentEAttribute <em>Parent EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent EAttribute</em>'.
	 * @see simk.SMMethod#getParentEAttribute()
	 * @see #getSMMethod()
	 * @generated
	 */
	EReference getSMMethod_ParentEAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link simk.SMMethod#getSMParameters <em>SM Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SM Parameters</em>'.
	 * @see simk.SMMethod#getSMParameters()
	 * @see #getSMMethod()
	 * @generated
	 */
	EReference getSMMethod_SMParameters();

	/**
	 * Returns the meta object for the containment reference '{@link simk.SMMethod#getSMReturn <em>SM Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SM Return</em>'.
	 * @see simk.SMMethod#getSMReturn()
	 * @see #getSMMethod()
	 * @generated
	 */
	EReference getSMMethod_SMReturn();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMMethod#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usages</em>'.
	 * @see simk.SMMethod#getUsages()
	 * @see #getSMMethod()
	 * @generated
	 */
	EAttribute getSMMethod_Usages();

	/**
	 * Returns the meta object for the reference '{@link simk.SMMethod#getSMContext <em>SM Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SM Context</em>'.
	 * @see simk.SMMethod#getSMContext()
	 * @see #getSMMethod()
	 * @generated
	 */
	EReference getSMMethod_SMContext();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMMethod#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see simk.SMMethod#getAccess()
	 * @see #getSMMethod()
	 * @generated
	 */
	EAttribute getSMMethod_Access();

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
	 * Returns the meta object for the reference list '{@link simk.SMContext#getSMMethods <em>SM Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SM Methods</em>'.
	 * @see simk.SMContext#getSMMethods()
	 * @see #getSMContext()
	 * @generated
	 */
	EReference getSMContext_SMMethods();

	/**
	 * Returns the meta object for the attribute '{@link simk.SMContext#getFinalPackageQName <em>Final Package QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Package QName</em>'.
	 * @see simk.SMContext#getFinalPackageQName()
	 * @see #getSMContext()
	 * @generated
	 */
	EAttribute getSMContext_FinalPackageQName();

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
	 * Returns the meta object for enum '{@link simk.SMAccess <em>SM Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SM Access</em>'.
	 * @see simk.SMAccess
	 * @generated
	 */
	EEnum getSMAccess();

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
		 * The meta object literal for the '<em><b>SM Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMK_MODEL__SM_METHODS = eINSTANCE.getSIMKModel_SMMethods();

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
		 * The meta object literal for the '{@link simk.impl.SMMethodImpl <em>SM Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.impl.SMMethodImpl
		 * @see simk.impl.SimkPackageImpl#getSMMethod()
		 * @generated
		 */
		EClass SM_METHOD = eINSTANCE.getSMMethod();

		/**
		 * The meta object literal for the '<em><b>abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_METHOD__ABSTRACT = eINSTANCE.getSMMethod__abstract();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_METHOD__BODY = eINSTANCE.getSMMethod_Body();

		/**
		 * The meta object literal for the '<em><b>Parent EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_METHOD__PARENT_EREFERENCE = eINSTANCE
				.getSMMethod_ParentEReference();

		/**
		 * The meta object literal for the '<em><b>static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_METHOD__STATIC = eINSTANCE.getSMMethod__static();

		/**
		 * The meta object literal for the '<em><b>Parent EOperation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_METHOD__PARENT_EOPERATION = eINSTANCE
				.getSMMethod_ParentEOperation();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_METHOD__TYPE_PARAMETERS = eINSTANCE
				.getSMMethod_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Parent EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_METHOD__PARENT_EATTRIBUTE = eINSTANCE
				.getSMMethod_ParentEAttribute();

		/**
		 * The meta object literal for the '<em><b>SM Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_METHOD__SM_PARAMETERS = eINSTANCE
				.getSMMethod_SMParameters();

		/**
		 * The meta object literal for the '<em><b>SM Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_METHOD__SM_RETURN = eINSTANCE.getSMMethod_SMReturn();

		/**
		 * The meta object literal for the '<em><b>Usages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_METHOD__USAGES = eINSTANCE.getSMMethod_Usages();

		/**
		 * The meta object literal for the '<em><b>SM Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_METHOD__SM_CONTEXT = eINSTANCE.getSMMethod_SMContext();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_METHOD__ACCESS = eINSTANCE.getSMMethod_Access();

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
		 * The meta object literal for the '<em><b>SM Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CONTEXT__SM_CLASS = eINSTANCE.getSMContext_SMClass();

		/**
		 * The meta object literal for the '<em><b>SM Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CONTEXT__SM_METHODS = eINSTANCE.getSMContext_SMMethods();

		/**
		 * The meta object literal for the '<em><b>Final Package QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_CONTEXT__FINAL_PACKAGE_QNAME = eINSTANCE
				.getSMContext_FinalPackageQName();

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

		/**
		 * The meta object literal for the '{@link simk.SMAccess <em>SM Access</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simk.SMAccess
		 * @see simk.impl.SimkPackageImpl#getSMAccess()
		 * @generated
		 */
		EEnum SM_ACCESS = eINSTANCE.getSMAccess();

	}

} //SimkPackage
