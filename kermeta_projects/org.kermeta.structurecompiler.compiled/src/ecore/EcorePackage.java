/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package ecore;

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
 * @see ecore.EcoreFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="kermeta ecore='true'"
 * @generated
 */
public interface EcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/2002/Ecore/kermeta_temp_uri";

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
	EcorePackage eINSTANCE = ecore.impl.EcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.impl.EObjectImpl <em>EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EObjectImpl
	 * @see ecore.impl.EcorePackageImpl#getEObject()
	 * @generated
	 */
	int EOBJECT = 10;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The number of structural features of the '<em>EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecore.impl.EModelElementImpl <em>EModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EModelElementImpl
	 * @see ecore.impl.EcorePackageImpl#getEModelElement()
	 * @generated
	 */
	int EMODEL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__TAG = EOBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__FILE = EOBJECT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__FILE_NAME = EOBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__LINE_NUMBER = EOBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__OWNED_TAGS = EOBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__OID = EOBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__INTERNAL_CONTAINING_RESOURCE = EOBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__EANNOTATIONS = EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_FEATURE_COUNT = EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ecore.impl.ENamedElementImpl <em>ENamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.ENamedElementImpl
	 * @see ecore.impl.EcorePackageImpl#getENamedElement()
	 * @generated
	 */
	int ENAMED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__TAG = EMODEL_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__FILE = EMODEL_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__FILE_NAME = EMODEL_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__LINE_NUMBER = EMODEL_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__OWNED_TAGS = EMODEL_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__OID = EMODEL_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE = EMODEL_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__NAME = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ecore.impl.ETypedElementImpl <em>ETyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.ETypedElementImpl
	 * @see ecore.impl.EcorePackageImpl#getETypedElement()
	 * @generated
	 */
	int ETYPED_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__TAG = ENAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__FILE = ENAMED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__FILE_NAME = ENAMED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__LINE_NUMBER = ENAMED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__OWNED_TAGS = ENAMED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__OID = ENAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__INTERNAL_CONTAINING_RESOURCE = ENAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__LOWER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__UNIQUE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__ETYPE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__ORDERED = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__UPPER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__EGENERIC_TYPE = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ecore.impl.EStructuralFeatureImpl <em>EStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EStructuralFeatureImpl
	 * @see ecore.impl.EcorePackageImpl#getEStructuralFeature()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE = 15;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__TAG = ETYPED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__FILE = ETYPED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__FILE_NAME = ETYPED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__LINE_NUMBER = ETYPED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__OWNED_TAGS = ETYPED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__OID = ETYPED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__INTERNAL_CONTAINING_RESOURCE = ETYPED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__VOLATILE = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__TRANSIENT = ETYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UNSETTABLE = ETYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DERIVED = ETYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__CHANGEABLE = ETYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ecore.impl.EAttributeImpl <em>EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EAttributeImpl
	 * @see ecore.impl.EcorePackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__TAG = ESTRUCTURAL_FEATURE__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__FILE = ESTRUCTURAL_FEATURE__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__FILE_NAME = ESTRUCTURAL_FEATURE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__LINE_NUMBER = ESTRUCTURAL_FEATURE__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__OWNED_TAGS = ESTRUCTURAL_FEATURE__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__OID = ESTRUCTURAL_FEATURE__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__INTERNAL_CONTAINING_RESOURCE = ESTRUCTURAL_FEATURE__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EANNOTATIONS = ESTRUCTURAL_FEATURE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__NAME = ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UNIQUE = ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ORDERED = ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EGENERIC_TYPE = ESTRUCTURAL_FEATURE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__VOLATILE = ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DEFAULT_VALUE_LITERAL = ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__TRANSIENT = ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UNSETTABLE = ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DERIVED = ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__CHANGEABLE = ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ID = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ecore.impl.EAnnotationImpl <em>EAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EAnnotationImpl
	 * @see ecore.impl.EcorePackageImpl#getEAnnotation()
	 * @generated
	 */
	int EANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__TAG = EMODEL_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__FILE = EMODEL_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__FILE_NAME = EMODEL_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__LINE_NUMBER = EMODEL_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__OWNED_TAGS = EMODEL_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__OID = EMODEL_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__INTERNAL_CONTAINING_RESOURCE = EMODEL_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__REFERENCES = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__SOURCE = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__DETAILS = EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__CONTENTS = EMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__EMODEL_ELEMENT = EMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ecore.impl.EClassifierImpl <em>EClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EClassifierImpl
	 * @see ecore.impl.EcorePackageImpl#getEClassifier()
	 * @generated
	 */
	int ECLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__TAG = ENAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__FILE = ENAMED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__FILE_NAME = ENAMED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__LINE_NUMBER = ENAMED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__OWNED_TAGS = ENAMED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__OID = ENAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INTERNAL_CONTAINING_RESOURCE = ENAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_CLASS_NAME = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__EPACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__ETYPE_PARAMETERS = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_TYPE_NAME = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ecore.impl.EClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EClassImpl
	 * @see ecore.impl.EcorePackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__TAG = ECLASSIFIER__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__FILE = ECLASSIFIER__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__FILE_NAME = ECLASSIFIER__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__LINE_NUMBER = ECLASSIFIER__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__OWNED_TAGS = ECLASSIFIER__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__OID = ECLASSIFIER__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INTERNAL_CONTAINING_RESOURCE = ECLASSIFIER__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EANNOTATIONS = ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NAME = ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_CLASS_NAME = ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EPACKAGE = ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ETYPE_PARAMETERS = ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_TYPE_NAME = ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESTRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ABSTRACT = ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EOPERATIONS = ECLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INTERFACE = ECLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EGENERIC_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ecore.impl.EDataTypeImpl <em>EData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EDataTypeImpl
	 * @see ecore.impl.EcorePackageImpl#getEDataType()
	 * @generated
	 */
	int EDATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__TAG = ECLASSIFIER__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__FILE = ECLASSIFIER__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__FILE_NAME = ECLASSIFIER__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__LINE_NUMBER = ECLASSIFIER__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__OWNED_TAGS = ECLASSIFIER__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__OID = ECLASSIFIER__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INTERNAL_CONTAINING_RESOURCE = ECLASSIFIER__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__EANNOTATIONS = ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__NAME = ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_CLASS_NAME = ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__EPACKAGE = ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__ETYPE_PARAMETERS = ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_TYPE_NAME = ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__SERIALIZABLE = ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ecore.impl.EEnumImpl <em>EEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EEnumImpl
	 * @see ecore.impl.EcorePackageImpl#getEEnum()
	 * @generated
	 */
	int EENUM = 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__TAG = EDATA_TYPE__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__FILE = EDATA_TYPE__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__FILE_NAME = EDATA_TYPE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__LINE_NUMBER = EDATA_TYPE__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__OWNED_TAGS = EDATA_TYPE__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__OID = EDATA_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INTERNAL_CONTAINING_RESOURCE = EDATA_TYPE__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__EANNOTATIONS = EDATA_TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__NAME = EDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_CLASS_NAME = EDATA_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__EPACKAGE = EDATA_TYPE__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__ETYPE_PARAMETERS = EDATA_TYPE__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_TYPE_NAME = EDATA_TYPE__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__SERIALIZABLE = EDATA_TYPE__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ELiterals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__ELITERALS = EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_FEATURE_COUNT = EDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ecore.impl.EEnumLiteralImpl <em>EEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EEnumLiteralImpl
	 * @see ecore.impl.EcorePackageImpl#getEEnumLiteral()
	 * @generated
	 */
	int EENUM_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__TAG = ENAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__FILE = ENAMED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__FILE_NAME = ENAMED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__LINE_NUMBER = ENAMED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__OWNED_TAGS = ENAMED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__OID = ENAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__INTERNAL_CONTAINING_RESOURCE = ENAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>EEnum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__EENUM = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__VALUE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__LITERAL = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ecore.impl.EFactoryImpl <em>EFactory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EFactoryImpl
	 * @see ecore.impl.EcorePackageImpl#getEFactory()
	 * @generated
	 */
	int EFACTORY = 7;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__TAG = EMODEL_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__FILE = EMODEL_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__FILE_NAME = EMODEL_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__LINE_NUMBER = EMODEL_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__OWNED_TAGS = EMODEL_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__OID = EMODEL_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__INTERNAL_CONTAINING_RESOURCE = EMODEL_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__EPACKAGE = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ecore.impl.EOperationImpl <em>EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EOperationImpl
	 * @see ecore.impl.EcorePackageImpl#getEOperation()
	 * @generated
	 */
	int EOPERATION = 11;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__TAG = ETYPED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__FILE = ETYPED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__FILE_NAME = ETYPED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__LINE_NUMBER = ETYPED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__OWNED_TAGS = ETYPED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__OID = ETYPED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__INTERNAL_CONTAINING_RESOURCE = ETYPED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EGENERIC_EXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EPARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ETYPE_PARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EExceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EEXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ecore.impl.EPackageImpl <em>EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EPackageImpl
	 * @see ecore.impl.EcorePackageImpl#getEPackage()
	 * @generated
	 */
	int EPACKAGE = 12;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__TAG = ENAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__FILE = ENAMED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__FILE_NAME = ENAMED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__LINE_NUMBER = ENAMED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__OWNED_TAGS = ENAMED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__OID = ENAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__INTERNAL_CONTAINING_RESOURCE = ENAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NS_URI = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ESUBPACKAGES = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ESUPER_PACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NS_PREFIX = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__EFACTORY_INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ECLASSIFIERS = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ecore.impl.EParameterImpl <em>EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EParameterImpl
	 * @see ecore.impl.EcorePackageImpl#getEParameter()
	 * @generated
	 */
	int EPARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__TAG = ETYPED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__FILE = ETYPED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__FILE_NAME = ETYPED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__LINE_NUMBER = ETYPED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__OWNED_TAGS = ETYPED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__OID = ETYPED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__INTERNAL_CONTAINING_RESOURCE = ETYPED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EOPERATION = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ecore.impl.EReferenceImpl <em>EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EReferenceImpl
	 * @see ecore.impl.EcorePackageImpl#getEReference()
	 * @generated
	 */
	int EREFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__TAG = ESTRUCTURAL_FEATURE__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__FILE = ESTRUCTURAL_FEATURE__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__FILE_NAME = ESTRUCTURAL_FEATURE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__LINE_NUMBER = ESTRUCTURAL_FEATURE__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__OWNED_TAGS = ESTRUCTURAL_FEATURE__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__OID = ESTRUCTURAL_FEATURE__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__INTERNAL_CONTAINING_RESOURCE = ESTRUCTURAL_FEATURE__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EANNOTATIONS = ESTRUCTURAL_FEATURE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__NAME = ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UNIQUE = ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ORDERED = ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EGENERIC_TYPE = ESTRUCTURAL_FEATURE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__VOLATILE = ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DEFAULT_VALUE_LITERAL = ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__TRANSIENT = ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UNSETTABLE = ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DERIVED = ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CHANGEABLE = ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EOPPOSITE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__RESOLVE_PROXIES = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EKEYS = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CONTAINMENT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ecore.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EStringToStringMapEntryImpl
	 * @see ecore.impl.EcorePackageImpl#getEStringToStringMapEntry()
	 * @generated
	 */
	int ESTRING_TO_STRING_MAP_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__VALUE = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__KEY = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ecore.impl.EGenericTypeImpl <em>EGeneric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EGenericTypeImpl
	 * @see ecore.impl.EcorePackageImpl#getEGenericType()
	 * @generated
	 */
	int EGENERIC_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__TAG = EOBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__FILE = EOBJECT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__FILE_NAME = EOBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__LINE_NUMBER = EOBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__OWNED_TAGS = EOBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__OID = EOBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__INTERNAL_CONTAINING_RESOURCE = EOBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EUpper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__EUPPER_BOUND = EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EType Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ETYPE_ARGUMENTS = EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ECLASSIFIER = EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EType Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ETYPE_PARAMETER = EOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ELower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ELOWER_BOUND = EOBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE_FEATURE_COUNT = EOBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ecore.impl.ETypeParameterImpl <em>EType Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.ETypeParameterImpl
	 * @see ecore.impl.EcorePackageImpl#getETypeParameter()
	 * @generated
	 */
	int ETYPE_PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__TAG = ENAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__FILE = ENAMED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__FILE_NAME = ENAMED_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__LINE_NUMBER = ENAMED_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__OWNED_TAGS = ENAMED_ELEMENT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__OID = ENAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__INTERNAL_CONTAINING_RESOURCE = ENAMED_ELEMENT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>EBounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__EBOUNDS = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>EBoolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EcorePackageImpl#getEBoolean()
	 * @generated
	 */
	int EBOOLEAN = 20;

	/**
	 * The meta object id for the '<em>EString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ecore.impl.EcorePackageImpl#getEString()
	 * @generated
	 */
	int ESTRING = 21;

	/**
	 * The meta object id for the '<em>EJava Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see ecore.impl.EcorePackageImpl#getEJavaClass()
	 * @generated
	 */
	int EJAVA_CLASS = 22;

	/**
	 * The meta object id for the '<em>EJava Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ecore.impl.EcorePackageImpl#getEJavaObject()
	 * @generated
	 */
	int EJAVA_OBJECT = 23;

	/**
	 * The meta object id for the '<em>EInt</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EcorePackageImpl#getEInt()
	 * @generated
	 */
	int EINT = 24;

	/**
	 * The meta object id for the '<em>EEnumerator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see ecore.impl.EcorePackageImpl#getEEnumerator()
	 * @generated
	 */
	int EENUMERATOR = 25;

	/**
	 * The meta object id for the '<em>EBig Decimal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see ecore.impl.EcorePackageImpl#getEBigDecimal()
	 * @generated
	 */
	int EBIG_DECIMAL = 26;

	/**
	 * The meta object id for the '<em>EBig Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see ecore.impl.EcorePackageImpl#getEBigInteger()
	 * @generated
	 */
	int EBIG_INTEGER = 27;

	/**
	 * The meta object id for the '<em>EBoolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see ecore.impl.EcorePackageImpl#getEBooleanObject()
	 * @generated
	 */
	int EBOOLEAN_OBJECT = 28;

	/**
	 * The meta object id for the '<em>EByte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EcorePackageImpl#getEByte()
	 * @generated
	 */
	int EBYTE = 29;

	/**
	 * The meta object id for the '<em>EByte Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EcorePackageImpl#getEByteArray()
	 * @generated
	 */
	int EBYTE_ARRAY = 30;

	/**
	 * The meta object id for the '<em>EByte Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Byte
	 * @see ecore.impl.EcorePackageImpl#getEByteObject()
	 * @generated
	 */
	int EBYTE_OBJECT = 31;

	/**
	 * The meta object id for the '<em>EChar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EcorePackageImpl#getEChar()
	 * @generated
	 */
	int ECHAR = 32;

	/**
	 * The meta object id for the '<em>ECharacter Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Character
	 * @see ecore.impl.EcorePackageImpl#getECharacterObject()
	 * @generated
	 */
	int ECHARACTER_OBJECT = 33;

	/**
	 * The meta object id for the '<em>EDate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see ecore.impl.EcorePackageImpl#getEDate()
	 * @generated
	 */
	int EDATE = 34;

	/**
	 * The meta object id for the '<em>EDiagnostic Chain</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @see ecore.impl.EcorePackageImpl#getEDiagnosticChain()
	 * @generated
	 */
	int EDIAGNOSTIC_CHAIN = 35;

	/**
	 * The meta object id for the '<em>EDouble</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EcorePackageImpl#getEDouble()
	 * @generated
	 */
	int EDOUBLE = 36;

	/**
	 * The meta object id for the '<em>EDouble Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see ecore.impl.EcorePackageImpl#getEDoubleObject()
	 * @generated
	 */
	int EDOUBLE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>EE List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see ecore.impl.EcorePackageImpl#getEEList()
	 * @generated
	 */
	int EE_LIST = 38;

	/**
	 * The meta object id for the '<em>EFeature Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.FeatureMap
	 * @see ecore.impl.EcorePackageImpl#getEFeatureMap()
	 * @generated
	 */
	int EFEATURE_MAP = 39;

	/**
	 * The meta object id for the '<em>EFeature Map Entry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
	 * @see ecore.impl.EcorePackageImpl#getEFeatureMapEntry()
	 * @generated
	 */
	int EFEATURE_MAP_ENTRY = 40;

	/**
	 * The meta object id for the '<em>EFloat</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EcorePackageImpl#getEFloat()
	 * @generated
	 */
	int EFLOAT = 41;

	/**
	 * The meta object id for the '<em>EFloat Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see ecore.impl.EcorePackageImpl#getEFloatObject()
	 * @generated
	 */
	int EFLOAT_OBJECT = 42;

	/**
	 * The meta object id for the '<em>EInteger Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see ecore.impl.EcorePackageImpl#getEIntegerObject()
	 * @generated
	 */
	int EINTEGER_OBJECT = 43;

	/**
	 * The meta object id for the '<em>ELong</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EcorePackageImpl#getELong()
	 * @generated
	 */
	int ELONG = 44;

	/**
	 * The meta object id for the '<em>ELong Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see ecore.impl.EcorePackageImpl#getELongObject()
	 * @generated
	 */
	int ELONG_OBJECT = 45;

	/**
	 * The meta object id for the '<em>EMap</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ecore.impl.EcorePackageImpl#getEMap()
	 * @generated
	 */
	int EMAP = 46;

	/**
	 * The meta object id for the '<em>EResource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see ecore.impl.EcorePackageImpl#getEResource()
	 * @generated
	 */
	int ERESOURCE = 47;

	/**
	 * The meta object id for the '<em>EResource Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @see ecore.impl.EcorePackageImpl#getEResourceSet()
	 * @generated
	 */
	int ERESOURCE_SET = 48;

	/**
	 * The meta object id for the '<em>EShort</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.EcorePackageImpl#getEShort()
	 * @generated
	 */
	int ESHORT = 49;

	/**
	 * The meta object id for the '<em>EShort Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see ecore.impl.EcorePackageImpl#getEShortObject()
	 * @generated
	 */
	int ESHORT_OBJECT = 50;

	/**
	 * The meta object id for the '<em>ETree Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.TreeIterator
	 * @see ecore.impl.EcorePackageImpl#getETreeIterator()
	 * @generated
	 */
	int ETREE_ITERATOR = 51;

	/**
	 * Returns the meta object for class '{@link ecore.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute</em>'.
	 * @see ecore.EAttribute
	 * @generated
	 */
	EClass getEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EAttribute#isID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ecore.EAttribute#isID()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_ID();

	/**
	 * Returns the meta object for class '{@link ecore.EAnnotation <em>EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAnnotation</em>'.
	 * @see ecore.EAnnotation
	 * @generated
	 */
	EClass getEAnnotation();

	/**
	 * Returns the meta object for the reference list '{@link ecore.EAnnotation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see ecore.EAnnotation#getReferences()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_References();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see ecore.EAnnotation#getSource()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EAttribute getEAnnotation_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EAnnotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Details</em>'.
	 * @see ecore.EAnnotation#getDetails()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Details();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EAnnotation#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see ecore.EAnnotation#getContents()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Contents();

	/**
	 * Returns the meta object for the container reference '{@link ecore.EAnnotation#getEModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EModel Element</em>'.
	 * @see ecore.EAnnotation#getEModelElement()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_EModelElement();

	/**
	 * Returns the meta object for class '{@link ecore.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see ecore.EClass
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EStructural Features</em>'.
	 * @see ecore.EClass#getEStructuralFeatures()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EStructuralFeatures();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EClass#is_abstract <em>abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>abstract</em>'.
	 * @see ecore.EClass#is_abstract()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass__abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EOperations</em>'.
	 * @see ecore.EClass#getEOperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EOperations();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EClass#is_interface <em>interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>interface</em>'.
	 * @see ecore.EClass#is_interface()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass__interface();

	/**
	 * Returns the meta object for the reference list '{@link ecore.EClass#getESuperTypes <em>ESuper Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ESuper Types</em>'.
	 * @see ecore.EClass#getESuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_ESuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EGeneric Super Types</em>'.
	 * @see ecore.EClass#getEGenericSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EGenericSuperTypes();

	/**
	 * Returns the meta object for class '{@link ecore.EClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClassifier</em>'.
	 * @see ecore.EClassifier
	 * @generated
	 */
	EClass getEClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EClassifier#getInstanceClassName <em>Instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class Name</em>'.
	 * @see ecore.EClassifier#getInstanceClassName()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceClassName();

	/**
	 * Returns the meta object for the container reference '{@link ecore.EClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EPackage</em>'.
	 * @see ecore.EClassifier#getEPackage()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_EPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EClassifier#getETypeParameters <em>EType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Parameters</em>'.
	 * @see ecore.EClassifier#getETypeParameters()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_ETypeParameters();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type Name</em>'.
	 * @see ecore.EClassifier#getInstanceTypeName()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceTypeName();

	/**
	 * Returns the meta object for class '{@link ecore.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Type</em>'.
	 * @see ecore.EDataType
	 * @generated
	 */
	EClass getEDataType();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EDataType#isSerializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serializable</em>'.
	 * @see ecore.EDataType#isSerializable()
	 * @see #getEDataType()
	 * @generated
	 */
	EAttribute getEDataType_Serializable();

	/**
	 * Returns the meta object for class '{@link ecore.EEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum</em>'.
	 * @see ecore.EEnum
	 * @generated
	 */
	EClass getEEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ELiterals</em>'.
	 * @see ecore.EEnum#getELiterals()
	 * @see #getEEnum()
	 * @generated
	 */
	EReference getEEnum_ELiterals();

	/**
	 * Returns the meta object for class '{@link ecore.EEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Literal</em>'.
	 * @see ecore.EEnumLiteral
	 * @generated
	 */
	EClass getEEnumLiteral();

	/**
	 * Returns the meta object for the container reference '{@link ecore.EEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EEnum</em>'.
	 * @see ecore.EEnumLiteral#getEEnum()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EReference getEEnumLiteral_EEnum();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EEnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ecore.EEnumLiteral#getValue()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EEnumLiteral#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see ecore.EEnumLiteral#getInstance()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Instance();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EEnumLiteral#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see ecore.EEnumLiteral#getLiteral()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Literal();

	/**
	 * Returns the meta object for class '{@link ecore.EFactory <em>EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFactory</em>'.
	 * @see ecore.EFactory
	 * @generated
	 */
	EClass getEFactory();

	/**
	 * Returns the meta object for the reference '{@link ecore.EFactory#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see ecore.EFactory#getEPackage()
	 * @see #getEFactory()
	 * @generated
	 */
	EReference getEFactory_EPackage();

	/**
	 * Returns the meta object for class '{@link ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EModel Element</em>'.
	 * @see ecore.EModelElement
	 * @generated
	 */
	EClass getEModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EModelElement#getEAnnotations <em>EAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EAnnotations</em>'.
	 * @see ecore.EModelElement#getEAnnotations()
	 * @see #getEModelElement()
	 * @generated
	 */
	EReference getEModelElement_EAnnotations();

	/**
	 * Returns the meta object for class '{@link ecore.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENamed Element</em>'.
	 * @see ecore.ENamedElement
	 * @generated
	 */
	EClass getENamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ecore.ENamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.ENamedElement#getName()
	 * @see #getENamedElement()
	 * @generated
	 */
	EAttribute getENamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ecore.EObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject</em>'.
	 * @see ecore.EObject
	 * @generated
	 */
	EClass getEObject();

	/**
	 * Returns the meta object for class '{@link ecore.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOperation</em>'.
	 * @see ecore.EOperation
	 * @generated
	 */
	EClass getEOperation();

	/**
	 * Returns the meta object for the container reference '{@link ecore.EOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see ecore.EOperation#getEContainingClass()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EContainingClass();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EOperation#getEGenericExceptions <em>EGeneric Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EGeneric Exceptions</em>'.
	 * @see ecore.EOperation#getEGenericExceptions()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EGenericExceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EOperation#getEParameters <em>EParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EParameters</em>'.
	 * @see ecore.EOperation#getEParameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EOperation#getETypeParameters <em>EType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Parameters</em>'.
	 * @see ecore.EOperation#getETypeParameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_ETypeParameters();

	/**
	 * Returns the meta object for the reference list '{@link ecore.EOperation#getEExceptions <em>EExceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EExceptions</em>'.
	 * @see ecore.EOperation#getEExceptions()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EExceptions();

	/**
	 * Returns the meta object for class '{@link ecore.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage</em>'.
	 * @see ecore.EPackage
	 * @generated
	 */
	EClass getEPackage();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EPackage#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see ecore.EPackage#getNsURI()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_NsURI();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EPackage#getESubpackages <em>ESubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESubpackages</em>'.
	 * @see ecore.EPackage#getESubpackages()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_ESubpackages();

	/**
	 * Returns the meta object for the container reference '{@link ecore.EPackage#getESuperPackage <em>ESuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ESuper Package</em>'.
	 * @see ecore.EPackage#getESuperPackage()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_ESuperPackage();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EPackage#getNsPrefix <em>Ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Prefix</em>'.
	 * @see ecore.EPackage#getNsPrefix()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_NsPrefix();

	/**
	 * Returns the meta object for the reference '{@link ecore.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EFactory Instance</em>'.
	 * @see ecore.EPackage#getEFactoryInstance()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_EFactoryInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EClassifiers</em>'.
	 * @see ecore.EPackage#getEClassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_EClassifiers();

	/**
	 * Returns the meta object for class '{@link ecore.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EParameter</em>'.
	 * @see ecore.EParameter
	 * @generated
	 */
	EClass getEParameter();

	/**
	 * Returns the meta object for the container reference '{@link ecore.EParameter#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EOperation</em>'.
	 * @see ecore.EParameter#getEOperation()
	 * @see #getEParameter()
	 * @generated
	 */
	EReference getEParameter_EOperation();

	/**
	 * Returns the meta object for class '{@link ecore.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference</em>'.
	 * @see ecore.EReference
	 * @generated
	 */
	EClass getEReference();

	/**
	 * Returns the meta object for the reference '{@link ecore.EReference#getEOpposite <em>EOpposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOpposite</em>'.
	 * @see ecore.EReference#getEOpposite()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EOpposite();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EReference#isResolveProxies <em>Resolve Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Proxies</em>'.
	 * @see ecore.EReference#isResolveProxies()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_ResolveProxies();

	/**
	 * Returns the meta object for the reference list '{@link ecore.EReference#getEKeys <em>EKeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EKeys</em>'.
	 * @see ecore.EReference#getEKeys()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EKeys();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EReference#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see ecore.EReference#isContainment()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Containment();

	/**
	 * Returns the meta object for class '{@link ecore.EStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature</em>'.
	 * @see ecore.EStructuralFeature
	 * @generated
	 */
	EClass getEStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EStructuralFeature#is_volatile <em>volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>volatile</em>'.
	 * @see ecore.EStructuralFeature#is_volatile()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature__volatile();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Literal</em>'.
	 * @see ecore.EStructuralFeature#getDefaultValueLiteral()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_DefaultValueLiteral();

	/**
	 * Returns the meta object for the container reference '{@link ecore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see ecore.EStructuralFeature#getEContainingClass()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EReference getEStructuralFeature_EContainingClass();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EStructuralFeature#is_transient <em>transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>transient</em>'.
	 * @see ecore.EStructuralFeature#is_transient()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature__transient();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EStructuralFeature#isUnsettable <em>Unsettable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsettable</em>'.
	 * @see ecore.EStructuralFeature#isUnsettable()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Unsettable();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EStructuralFeature#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see ecore.EStructuralFeature#isDerived()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Derived();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EStructuralFeature#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see ecore.EStructuralFeature#isChangeable()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Changeable();

	/**
	 * Returns the meta object for class '{@link ecore.ETypedElement <em>ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETyped Element</em>'.
	 * @see ecore.ETypedElement
	 * @generated
	 */
	EClass getETypedElement();

	/**
	 * Returns the meta object for the attribute '{@link ecore.ETypedElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see ecore.ETypedElement#getLowerBound()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ecore.ETypedElement#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see ecore.ETypedElement#isUnique()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Unique();

	/**
	 * Returns the meta object for the reference '{@link ecore.ETypedElement#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecore.ETypedElement#getEType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_EType();

	/**
	 * Returns the meta object for the attribute '{@link ecore.ETypedElement#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see ecore.ETypedElement#isOrdered()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link ecore.ETypedElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see ecore.ETypedElement#getUpperBound()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link ecore.ETypedElement#getEGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EGeneric Type</em>'.
	 * @see ecore.ETypedElement#getEGenericType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_EGenericType();

	/**
	 * Returns the meta object for class '{@link ecore.EStringToStringMapEntry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To String Map Entry</em>'.
	 * @see ecore.EStringToStringMapEntry
	 * @generated
	 */
	EClass getEStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EStringToStringMapEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ecore.EStringToStringMapEntry#getValue()
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for the attribute '{@link ecore.EStringToStringMapEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see ecore.EStringToStringMapEntry#getKey()
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for class '{@link ecore.EGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGeneric Type</em>'.
	 * @see ecore.EGenericType
	 * @generated
	 */
	EClass getEGenericType();

	/**
	 * Returns the meta object for the containment reference '{@link ecore.EGenericType#getEUpperBound <em>EUpper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EUpper Bound</em>'.
	 * @see ecore.EGenericType#getEUpperBound()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_EUpperBound();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.EGenericType#getETypeArguments <em>EType Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Arguments</em>'.
	 * @see ecore.EGenericType#getETypeArguments()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ETypeArguments();

	/**
	 * Returns the meta object for the reference '{@link ecore.EGenericType#getEClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClassifier</em>'.
	 * @see ecore.EGenericType#getEClassifier()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_EClassifier();

	/**
	 * Returns the meta object for the reference '{@link ecore.EGenericType#getETypeParameter <em>EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType Parameter</em>'.
	 * @see ecore.EGenericType#getETypeParameter()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ETypeParameter();

	/**
	 * Returns the meta object for the containment reference '{@link ecore.EGenericType#getELowerBound <em>ELower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ELower Bound</em>'.
	 * @see ecore.EGenericType#getELowerBound()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ELowerBound();

	/**
	 * Returns the meta object for class '{@link ecore.ETypeParameter <em>EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EType Parameter</em>'.
	 * @see ecore.ETypeParameter
	 * @generated
	 */
	EClass getETypeParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.ETypeParameter#getEBounds <em>EBounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EBounds</em>'.
	 * @see ecore.ETypeParameter#getEBounds()
	 * @see #getETypeParameter()
	 * @generated
	 */
	EReference getETypeParameter_EBounds();

	/**
	 * Returns the meta object for data type '<em>EBoolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBoolean</em>'.
	 * @model instanceClass="boolean"
	 *        annotation="kermeta alias='kermeta::standard::Boolean'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='boolean'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EString</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        annotation="kermeta alias='kermeta::standard::String'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.String'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>EJava Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJava Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class" typeParameters="T"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.Class'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 *        annotation="kermeta ecore.EDataType_eTypeParameters='T'"
	 * @generated
	 */
	EDataType getEJavaClass();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>EJava Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJava Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.Object'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEJavaObject();

	/**
	 * Returns the meta object for data type '<em>EInt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInt</em>'.
	 * @model instanceClass="int"
	 *        annotation="kermeta alias='kermeta::standard::Integer'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='int'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEInt();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>EEnumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EEnumerator</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator" serializeable="false"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='org.eclipse.emf.common.util.Enumerator'"
	 * @generated
	 */
	EDataType getEEnumerator();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>EBig Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBig Decimal</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.math.BigDecimal'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEBigDecimal();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>EBig Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBig Integer</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.math.BigInteger'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEBigInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>EBoolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBoolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        annotation="kermeta alias='kermeta::standard::Boolean'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.Boolean'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEBooleanObject();

	/**
	 * Returns the meta object for data type '<em>EByte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte</em>'.
	 * @model instanceClass="byte"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='byte'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEByte();

	/**
	 * Returns the meta object for data type '<em>EByte Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte Array</em>'.
	 * @model instanceClass="byte[]"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='byte[]'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEByteArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.Byte <em>EByte Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte Object</em>'.
	 * @see java.lang.Byte
	 * @model instanceClass="java.lang.Byte"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.Byte'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEByteObject();

	/**
	 * Returns the meta object for data type '<em>EChar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EChar</em>'.
	 * @model instanceClass="char"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='char'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEChar();

	/**
	 * Returns the meta object for data type '{@link java.lang.Character <em>ECharacter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ECharacter Object</em>'.
	 * @see java.lang.Character
	 * @model instanceClass="java.lang.Character"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.Character'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getECharacterObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>EDate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDate</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.util.Date'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEDate();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.DiagnosticChain <em>EDiagnostic Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDiagnostic Chain</em>'.
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @model instanceClass="org.eclipse.emf.common.util.DiagnosticChain" serializeable="false"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='org.eclipse.emf.common.util.DiagnosticChain'"
	 * @generated
	 */
	EDataType getEDiagnosticChain();

	/**
	 * Returns the meta object for data type '<em>EDouble</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble</em>'.
	 * @model instanceClass="double"
	 *        annotation="kermeta alias='kermeta::standard::Real'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='double'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEDouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>EDouble Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        annotation="kermeta alias='kermeta::standard::Real'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.Double'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEDoubleObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>EE List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EE List</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList" serializeable="false" typeParameters="E"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='org.eclipse.emf.common.util.EList'"
	 *        annotation="kermeta ecore.EDataType_eTypeParameters='E'"
	 * @generated
	 */
	EDataType getEEList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.FeatureMap <em>EFeature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFeature Map</em>'.
	 * @see org.eclipse.emf.ecore.util.FeatureMap
	 * @model instanceClass="org.eclipse.emf.ecore.util.FeatureMap" serializeable="false"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='org.eclipse.emf.ecore.util.FeatureMap'"
	 * @generated
	 */
	EDataType getEFeatureMap();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.FeatureMap.Entry <em>EFeature Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFeature Map Entry</em>'.
	 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
	 * @model instanceClass="org.eclipse.emf.ecore.util.FeatureMap$Entry" serializeable="false"
	 *        annotation="kermeta alias='kermeta::ecore::EFeatureMapEntry'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='org.eclipse.emf.ecore.util.FeatureMap$Entry'"
	 * @generated
	 */
	EDataType getEFeatureMapEntry();

	/**
	 * Returns the meta object for data type '<em>EFloat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFloat</em>'.
	 * @model instanceClass="float"
	 *        annotation="kermeta alias='kermeta::standard::Real'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='float'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>EFloat Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFloat Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        annotation="kermeta alias='kermeta::standard::Real'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.Float'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEFloatObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>EInteger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInteger Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        annotation="kermeta alias='kermeta::standard::Integer'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.Integer'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEIntegerObject();

	/**
	 * Returns the meta object for data type '<em>ELong</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ELong</em>'.
	 * @model instanceClass="long"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='long'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getELong();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>ELong Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ELong Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.Long'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getELongObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>EMap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EMap</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" serializeable="false" typeParameters="K V"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.util.Map'"
	 *        annotation="kermeta ecore.EDataType_eTypeParameters='K , V'"
	 * @generated
	 */
	EDataType getEMap();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>EResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EResource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource" serializeable="false"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='org.eclipse.emf.ecore.resource.Resource'"
	 * @generated
	 */
	EDataType getEResource();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.ResourceSet <em>EResource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EResource Set</em>'.
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @model instanceClass="org.eclipse.emf.ecore.resource.ResourceSet" serializeable="false"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='org.eclipse.emf.ecore.resource.ResourceSet'"
	 * @generated
	 */
	EDataType getEResourceSet();

	/**
	 * Returns the meta object for data type '<em>EShort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EShort</em>'.
	 * @model instanceClass="short"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='short'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEShort();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>EShort Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EShort Object</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='java.lang.Short'"
	 *        annotation="kermeta ecore.EDataType_isSerializable='true'"
	 * @generated
	 */
	EDataType getEShortObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.TreeIterator <em>ETree Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ETree Iterator</em>'.
	 * @see org.eclipse.emf.common.util.TreeIterator
	 * @model instanceClass="org.eclipse.emf.common.util.TreeIterator" serializeable="false" typeParameters="E"
	 *        annotation="kermeta alias='kermeta::language::structure::Object'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore.EDataType_instanceClassName='org.eclipse.emf.common.util.TreeIterator'"
	 *        annotation="kermeta ecore.EDataType_eTypeParameters='E'"
	 * @generated
	 */
	EDataType getETreeIterator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreFactory getEcoreFactory();

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
		 * The meta object literal for the '{@link ecore.impl.EAttributeImpl <em>EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EAttributeImpl
		 * @see ecore.impl.EcorePackageImpl#getEAttribute()
		 * @generated
		 */
		EClass EATTRIBUTE = eINSTANCE.getEAttribute();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE__ID = eINSTANCE.getEAttribute_ID();

		/**
		 * The meta object literal for the '{@link ecore.impl.EAnnotationImpl <em>EAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EAnnotationImpl
		 * @see ecore.impl.EcorePackageImpl#getEAnnotation()
		 * @generated
		 */
		EClass EANNOTATION = eINSTANCE.getEAnnotation();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__REFERENCES = eINSTANCE
				.getEAnnotation_References();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EANNOTATION__SOURCE = eINSTANCE.getEAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__DETAILS = eINSTANCE.getEAnnotation_Details();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__CONTENTS = eINSTANCE.getEAnnotation_Contents();

		/**
		 * The meta object literal for the '<em><b>EModel Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__EMODEL_ELEMENT = eINSTANCE
				.getEAnnotation_EModelElement();

		/**
		 * The meta object literal for the '{@link ecore.impl.EClassImpl <em>EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EClassImpl
		 * @see ecore.impl.EcorePackageImpl#getEClass()
		 * @generated
		 */
		EClass ECLASS = eINSTANCE.getEClass();

		/**
		 * The meta object literal for the '<em><b>EStructural Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ESTRUCTURAL_FEATURES = eINSTANCE
				.getEClass_EStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__ABSTRACT = eINSTANCE.getEClass__abstract();

		/**
		 * The meta object literal for the '<em><b>EOperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EOPERATIONS = eINSTANCE.getEClass_EOperations();

		/**
		 * The meta object literal for the '<em><b>interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__INTERFACE = eINSTANCE.getEClass__interface();

		/**
		 * The meta object literal for the '<em><b>ESuper Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ESUPER_TYPES = eINSTANCE.getEClass_ESuperTypes();

		/**
		 * The meta object literal for the '<em><b>EGeneric Super Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EGENERIC_SUPER_TYPES = eINSTANCE
				.getEClass_EGenericSuperTypes();

		/**
		 * The meta object literal for the '{@link ecore.impl.EClassifierImpl <em>EClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EClassifierImpl
		 * @see ecore.impl.EcorePackageImpl#getEClassifier()
		 * @generated
		 */
		EClass ECLASSIFIER = eINSTANCE.getEClassifier();

		/**
		 * The meta object literal for the '<em><b>Instance Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSIFIER__INSTANCE_CLASS_NAME = eINSTANCE
				.getEClassifier_InstanceClassName();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSIFIER__EPACKAGE = eINSTANCE.getEClassifier_EPackage();

		/**
		 * The meta object literal for the '<em><b>EType Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSIFIER__ETYPE_PARAMETERS = eINSTANCE
				.getEClassifier_ETypeParameters();

		/**
		 * The meta object literal for the '<em><b>Instance Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSIFIER__INSTANCE_TYPE_NAME = eINSTANCE
				.getEClassifier_InstanceTypeName();

		/**
		 * The meta object literal for the '{@link ecore.impl.EDataTypeImpl <em>EData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EDataTypeImpl
		 * @see ecore.impl.EcorePackageImpl#getEDataType()
		 * @generated
		 */
		EClass EDATA_TYPE = eINSTANCE.getEDataType();

		/**
		 * The meta object literal for the '<em><b>Serializable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDATA_TYPE__SERIALIZABLE = eINSTANCE
				.getEDataType_Serializable();

		/**
		 * The meta object literal for the '{@link ecore.impl.EEnumImpl <em>EEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EEnumImpl
		 * @see ecore.impl.EcorePackageImpl#getEEnum()
		 * @generated
		 */
		EClass EENUM = eINSTANCE.getEEnum();

		/**
		 * The meta object literal for the '<em><b>ELiterals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM__ELITERALS = eINSTANCE.getEEnum_ELiterals();

		/**
		 * The meta object literal for the '{@link ecore.impl.EEnumLiteralImpl <em>EEnum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EEnumLiteralImpl
		 * @see ecore.impl.EcorePackageImpl#getEEnumLiteral()
		 * @generated
		 */
		EClass EENUM_LITERAL = eINSTANCE.getEEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>EEnum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM_LITERAL__EENUM = eINSTANCE.getEEnumLiteral_EEnum();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL__VALUE = eINSTANCE.getEEnumLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL__INSTANCE = eINSTANCE
				.getEEnumLiteral_Instance();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL__LITERAL = eINSTANCE.getEEnumLiteral_Literal();

		/**
		 * The meta object literal for the '{@link ecore.impl.EFactoryImpl <em>EFactory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EFactoryImpl
		 * @see ecore.impl.EcorePackageImpl#getEFactory()
		 * @generated
		 */
		EClass EFACTORY = eINSTANCE.getEFactory();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFACTORY__EPACKAGE = eINSTANCE.getEFactory_EPackage();

		/**
		 * The meta object literal for the '{@link ecore.impl.EModelElementImpl <em>EModel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EModelElementImpl
		 * @see ecore.impl.EcorePackageImpl#getEModelElement()
		 * @generated
		 */
		EClass EMODEL_ELEMENT = eINSTANCE.getEModelElement();

		/**
		 * The meta object literal for the '<em><b>EAnnotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMODEL_ELEMENT__EANNOTATIONS = eINSTANCE
				.getEModelElement_EAnnotations();

		/**
		 * The meta object literal for the '{@link ecore.impl.ENamedElementImpl <em>ENamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.ENamedElementImpl
		 * @see ecore.impl.EcorePackageImpl#getENamedElement()
		 * @generated
		 */
		EClass ENAMED_ELEMENT = eINSTANCE.getENamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENAMED_ELEMENT__NAME = eINSTANCE.getENamedElement_Name();

		/**
		 * The meta object literal for the '{@link ecore.impl.EObjectImpl <em>EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EObjectImpl
		 * @see ecore.impl.EcorePackageImpl#getEObject()
		 * @generated
		 */
		EClass EOBJECT = eINSTANCE.getEObject();

		/**
		 * The meta object literal for the '{@link ecore.impl.EOperationImpl <em>EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EOperationImpl
		 * @see ecore.impl.EcorePackageImpl#getEOperation()
		 * @generated
		 */
		EClass EOPERATION = eINSTANCE.getEOperation();

		/**
		 * The meta object literal for the '<em><b>EContaining Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__ECONTAINING_CLASS = eINSTANCE
				.getEOperation_EContainingClass();

		/**
		 * The meta object literal for the '<em><b>EGeneric Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__EGENERIC_EXCEPTIONS = eINSTANCE
				.getEOperation_EGenericExceptions();

		/**
		 * The meta object literal for the '<em><b>EParameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__EPARAMETERS = eINSTANCE
				.getEOperation_EParameters();

		/**
		 * The meta object literal for the '<em><b>EType Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__ETYPE_PARAMETERS = eINSTANCE
				.getEOperation_ETypeParameters();

		/**
		 * The meta object literal for the '<em><b>EExceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__EEXCEPTIONS = eINSTANCE
				.getEOperation_EExceptions();

		/**
		 * The meta object literal for the '{@link ecore.impl.EPackageImpl <em>EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EPackageImpl
		 * @see ecore.impl.EcorePackageImpl#getEPackage()
		 * @generated
		 */
		EClass EPACKAGE = eINSTANCE.getEPackage();

		/**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE__NS_URI = eINSTANCE.getEPackage_NsURI();

		/**
		 * The meta object literal for the '<em><b>ESubpackages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ESUBPACKAGES = eINSTANCE
				.getEPackage_ESubpackages();

		/**
		 * The meta object literal for the '<em><b>ESuper Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ESUPER_PACKAGE = eINSTANCE
				.getEPackage_ESuperPackage();

		/**
		 * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE__NS_PREFIX = eINSTANCE.getEPackage_NsPrefix();

		/**
		 * The meta object literal for the '<em><b>EFactory Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__EFACTORY_INSTANCE = eINSTANCE
				.getEPackage_EFactoryInstance();

		/**
		 * The meta object literal for the '<em><b>EClassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ECLASSIFIERS = eINSTANCE
				.getEPackage_EClassifiers();

		/**
		 * The meta object literal for the '{@link ecore.impl.EParameterImpl <em>EParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EParameterImpl
		 * @see ecore.impl.EcorePackageImpl#getEParameter()
		 * @generated
		 */
		EClass EPARAMETER = eINSTANCE.getEParameter();

		/**
		 * The meta object literal for the '<em><b>EOperation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPARAMETER__EOPERATION = eINSTANCE
				.getEParameter_EOperation();

		/**
		 * The meta object literal for the '{@link ecore.impl.EReferenceImpl <em>EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EReferenceImpl
		 * @see ecore.impl.EcorePackageImpl#getEReference()
		 * @generated
		 */
		EClass EREFERENCE = eINSTANCE.getEReference();

		/**
		 * The meta object literal for the '<em><b>EOpposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE__EOPPOSITE = eINSTANCE.getEReference_EOpposite();

		/**
		 * The meta object literal for the '<em><b>Resolve Proxies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__RESOLVE_PROXIES = eINSTANCE
				.getEReference_ResolveProxies();

		/**
		 * The meta object literal for the '<em><b>EKeys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE__EKEYS = eINSTANCE.getEReference_EKeys();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__CONTAINMENT = eINSTANCE
				.getEReference_Containment();

		/**
		 * The meta object literal for the '{@link ecore.impl.EStructuralFeatureImpl <em>EStructural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EStructuralFeatureImpl
		 * @see ecore.impl.EcorePackageImpl#getEStructuralFeature()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE = eINSTANCE.getEStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__VOLATILE = eINSTANCE
				.getEStructuralFeature__volatile();

		/**
		 * The meta object literal for the '<em><b>Default Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = eINSTANCE
				.getEStructuralFeature_DefaultValueLiteral();

		/**
		 * The meta object literal for the '<em><b>EContaining Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = eINSTANCE
				.getEStructuralFeature_EContainingClass();

		/**
		 * The meta object literal for the '<em><b>transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__TRANSIENT = eINSTANCE
				.getEStructuralFeature__transient();

		/**
		 * The meta object literal for the '<em><b>Unsettable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__UNSETTABLE = eINSTANCE
				.getEStructuralFeature_Unsettable();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__DERIVED = eINSTANCE
				.getEStructuralFeature_Derived();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__CHANGEABLE = eINSTANCE
				.getEStructuralFeature_Changeable();

		/**
		 * The meta object literal for the '{@link ecore.impl.ETypedElementImpl <em>ETyped Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.ETypedElementImpl
		 * @see ecore.impl.EcorePackageImpl#getETypedElement()
		 * @generated
		 */
		EClass ETYPED_ELEMENT = eINSTANCE.getETypedElement();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__LOWER_BOUND = eINSTANCE
				.getETypedElement_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__UNIQUE = eINSTANCE.getETypedElement_Unique();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPED_ELEMENT__ETYPE = eINSTANCE.getETypedElement_EType();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__ORDERED = eINSTANCE
				.getETypedElement_Ordered();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__UPPER_BOUND = eINSTANCE
				.getETypedElement_UpperBound();

		/**
		 * The meta object literal for the '<em><b>EGeneric Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPED_ELEMENT__EGENERIC_TYPE = eINSTANCE
				.getETypedElement_EGenericType();

		/**
		 * The meta object literal for the '{@link ecore.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EStringToStringMapEntryImpl
		 * @see ecore.impl.EcorePackageImpl#getEStringToStringMapEntry()
		 * @generated
		 */
		EClass ESTRING_TO_STRING_MAP_ENTRY = eINSTANCE
				.getEStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE
				.getEStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE
				.getEStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '{@link ecore.impl.EGenericTypeImpl <em>EGeneric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EGenericTypeImpl
		 * @see ecore.impl.EcorePackageImpl#getEGenericType()
		 * @generated
		 */
		EClass EGENERIC_TYPE = eINSTANCE.getEGenericType();

		/**
		 * The meta object literal for the '<em><b>EUpper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__EUPPER_BOUND = eINSTANCE
				.getEGenericType_EUpperBound();

		/**
		 * The meta object literal for the '<em><b>EType Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ETYPE_ARGUMENTS = eINSTANCE
				.getEGenericType_ETypeArguments();

		/**
		 * The meta object literal for the '<em><b>EClassifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ECLASSIFIER = eINSTANCE
				.getEGenericType_EClassifier();

		/**
		 * The meta object literal for the '<em><b>EType Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ETYPE_PARAMETER = eINSTANCE
				.getEGenericType_ETypeParameter();

		/**
		 * The meta object literal for the '<em><b>ELower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ELOWER_BOUND = eINSTANCE
				.getEGenericType_ELowerBound();

		/**
		 * The meta object literal for the '{@link ecore.impl.ETypeParameterImpl <em>EType Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.ETypeParameterImpl
		 * @see ecore.impl.EcorePackageImpl#getETypeParameter()
		 * @generated
		 */
		EClass ETYPE_PARAMETER = eINSTANCE.getETypeParameter();

		/**
		 * The meta object literal for the '<em><b>EBounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE_PARAMETER__EBOUNDS = eINSTANCE
				.getETypeParameter_EBounds();

		/**
		 * The meta object literal for the '<em>EBoolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EcorePackageImpl#getEBoolean()
		 * @generated
		 */
		EDataType EBOOLEAN = eINSTANCE.getEBoolean();

		/**
		 * The meta object literal for the '<em>EString</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ecore.impl.EcorePackageImpl#getEString()
		 * @generated
		 */
		EDataType ESTRING = eINSTANCE.getEString();

		/**
		 * The meta object literal for the '<em>EJava Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see ecore.impl.EcorePackageImpl#getEJavaClass()
		 * @generated
		 */
		EDataType EJAVA_CLASS = eINSTANCE.getEJavaClass();

		/**
		 * The meta object literal for the '<em>EJava Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see ecore.impl.EcorePackageImpl#getEJavaObject()
		 * @generated
		 */
		EDataType EJAVA_OBJECT = eINSTANCE.getEJavaObject();

		/**
		 * The meta object literal for the '<em>EInt</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EcorePackageImpl#getEInt()
		 * @generated
		 */
		EDataType EINT = eINSTANCE.getEInt();

		/**
		 * The meta object literal for the '<em>EEnumerator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see ecore.impl.EcorePackageImpl#getEEnumerator()
		 * @generated
		 */
		EDataType EENUMERATOR = eINSTANCE.getEEnumerator();

		/**
		 * The meta object literal for the '<em>EBig Decimal</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see ecore.impl.EcorePackageImpl#getEBigDecimal()
		 * @generated
		 */
		EDataType EBIG_DECIMAL = eINSTANCE.getEBigDecimal();

		/**
		 * The meta object literal for the '<em>EBig Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see ecore.impl.EcorePackageImpl#getEBigInteger()
		 * @generated
		 */
		EDataType EBIG_INTEGER = eINSTANCE.getEBigInteger();

		/**
		 * The meta object literal for the '<em>EBoolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see ecore.impl.EcorePackageImpl#getEBooleanObject()
		 * @generated
		 */
		EDataType EBOOLEAN_OBJECT = eINSTANCE.getEBooleanObject();

		/**
		 * The meta object literal for the '<em>EByte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EcorePackageImpl#getEByte()
		 * @generated
		 */
		EDataType EBYTE = eINSTANCE.getEByte();

		/**
		 * The meta object literal for the '<em>EByte Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EcorePackageImpl#getEByteArray()
		 * @generated
		 */
		EDataType EBYTE_ARRAY = eINSTANCE.getEByteArray();

		/**
		 * The meta object literal for the '<em>EByte Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Byte
		 * @see ecore.impl.EcorePackageImpl#getEByteObject()
		 * @generated
		 */
		EDataType EBYTE_OBJECT = eINSTANCE.getEByteObject();

		/**
		 * The meta object literal for the '<em>EChar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EcorePackageImpl#getEChar()
		 * @generated
		 */
		EDataType ECHAR = eINSTANCE.getEChar();

		/**
		 * The meta object literal for the '<em>ECharacter Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Character
		 * @see ecore.impl.EcorePackageImpl#getECharacterObject()
		 * @generated
		 */
		EDataType ECHARACTER_OBJECT = eINSTANCE.getECharacterObject();

		/**
		 * The meta object literal for the '<em>EDate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see ecore.impl.EcorePackageImpl#getEDate()
		 * @generated
		 */
		EDataType EDATE = eINSTANCE.getEDate();

		/**
		 * The meta object literal for the '<em>EDiagnostic Chain</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.DiagnosticChain
		 * @see ecore.impl.EcorePackageImpl#getEDiagnosticChain()
		 * @generated
		 */
		EDataType EDIAGNOSTIC_CHAIN = eINSTANCE.getEDiagnosticChain();

		/**
		 * The meta object literal for the '<em>EDouble</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EcorePackageImpl#getEDouble()
		 * @generated
		 */
		EDataType EDOUBLE = eINSTANCE.getEDouble();

		/**
		 * The meta object literal for the '<em>EDouble Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see ecore.impl.EcorePackageImpl#getEDoubleObject()
		 * @generated
		 */
		EDataType EDOUBLE_OBJECT = eINSTANCE.getEDoubleObject();

		/**
		 * The meta object literal for the '<em>EE List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see ecore.impl.EcorePackageImpl#getEEList()
		 * @generated
		 */
		EDataType EE_LIST = eINSTANCE.getEEList();

		/**
		 * The meta object literal for the '<em>EFeature Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.util.FeatureMap
		 * @see ecore.impl.EcorePackageImpl#getEFeatureMap()
		 * @generated
		 */
		EDataType EFEATURE_MAP = eINSTANCE.getEFeatureMap();

		/**
		 * The meta object literal for the '<em>EFeature Map Entry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
		 * @see ecore.impl.EcorePackageImpl#getEFeatureMapEntry()
		 * @generated
		 */
		EDataType EFEATURE_MAP_ENTRY = eINSTANCE.getEFeatureMapEntry();

		/**
		 * The meta object literal for the '<em>EFloat</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EcorePackageImpl#getEFloat()
		 * @generated
		 */
		EDataType EFLOAT = eINSTANCE.getEFloat();

		/**
		 * The meta object literal for the '<em>EFloat Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see ecore.impl.EcorePackageImpl#getEFloatObject()
		 * @generated
		 */
		EDataType EFLOAT_OBJECT = eINSTANCE.getEFloatObject();

		/**
		 * The meta object literal for the '<em>EInteger Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see ecore.impl.EcorePackageImpl#getEIntegerObject()
		 * @generated
		 */
		EDataType EINTEGER_OBJECT = eINSTANCE.getEIntegerObject();

		/**
		 * The meta object literal for the '<em>ELong</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EcorePackageImpl#getELong()
		 * @generated
		 */
		EDataType ELONG = eINSTANCE.getELong();

		/**
		 * The meta object literal for the '<em>ELong Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see ecore.impl.EcorePackageImpl#getELongObject()
		 * @generated
		 */
		EDataType ELONG_OBJECT = eINSTANCE.getELongObject();

		/**
		 * The meta object literal for the '<em>EMap</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ecore.impl.EcorePackageImpl#getEMap()
		 * @generated
		 */
		EDataType EMAP = eINSTANCE.getEMap();

		/**
		 * The meta object literal for the '<em>EResource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see ecore.impl.EcorePackageImpl#getEResource()
		 * @generated
		 */
		EDataType ERESOURCE = eINSTANCE.getEResource();

		/**
		 * The meta object literal for the '<em>EResource Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.ResourceSet
		 * @see ecore.impl.EcorePackageImpl#getEResourceSet()
		 * @generated
		 */
		EDataType ERESOURCE_SET = eINSTANCE.getEResourceSet();

		/**
		 * The meta object literal for the '<em>EShort</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.EcorePackageImpl#getEShort()
		 * @generated
		 */
		EDataType ESHORT = eINSTANCE.getEShort();

		/**
		 * The meta object literal for the '<em>EShort Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see ecore.impl.EcorePackageImpl#getEShortObject()
		 * @generated
		 */
		EDataType ESHORT_OBJECT = eINSTANCE.getEShortObject();

		/**
		 * The meta object literal for the '<em>ETree Iterator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.TreeIterator
		 * @see ecore.impl.EcorePackageImpl#getETreeIterator()
		 * @generated
		 */
		EDataType ETREE_ITERATOR = eINSTANCE.getETreeIterator();

	}

} //EcorePackage
