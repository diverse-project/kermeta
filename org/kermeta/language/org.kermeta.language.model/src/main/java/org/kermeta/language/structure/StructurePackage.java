/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * <!-- begin-model-doc -->
 * Contains all the abstract classes used in the reflection mechanism. Implements the <b>derived
 * properties</b> contained in the classes; declares the abstract operations.
 * Concrete implementation is in kermeta.language.structure.
 * <img src="platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/reflection_package.png">
 * <!-- end-model-doc -->
 * @see org.kermeta.language.structure.StructureFactory
 * @model kind="package"
 * @generated
 */
public interface StructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kermeta/2_0_0//org/kermeta/language/structure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org_kermeta_language_structure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructurePackage eINSTANCE = org.kermeta.language.structure.impl.StructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.KermetaModelElementImpl <em>Kermeta Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.KermetaModelElementImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getKermetaModelElement()
	 * @generated
	 */
	int KERMETA_MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_MODEL_ELEMENT__KTAG = 0;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_MODEL_ELEMENT__KOWNED_TAGS = 1;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_MODEL_ELEMENT__KTYPE = 2;

	/**
	 * The number of structural features of the '<em>Kermeta Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.TypeContainerImpl <em>Type Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.TypeContainerImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeContainer()
	 * @generated
	 */
	int TYPE_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER__CONTAINED_TYPE = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.TypedElementImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__KTAG = TYPE_CONTAINER__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__KOWNED_TAGS = TYPE_CONTAINER__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__KTYPE = TYPE_CONTAINER__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__CONTAINED_TYPE = TYPE_CONTAINER__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = TYPE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = TYPE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = TYPE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.MultiplicityElementImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getMultiplicityElement()
	 * @generated
	 */
	int MULTIPLICITY_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__KTAG = TYPED_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__KOWNED_TAGS = TYPED_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__KTYPE = TYPED_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__CONTAINED_TYPE = TYPED_ELEMENT__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__IS_ORDERED = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__IS_UNIQUE = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__LOWER = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UPPER = TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.OperationImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__KTAG = MULTIPLICITY_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__KOWNED_TAGS = MULTIPLICITY_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__KTYPE = MULTIPLICITY_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONTAINED_TYPE = MULTIPLICITY_ELEMENT__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = MULTIPLICITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = MULTIPLICITY_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ORDERED = MULTIPLICITY_ELEMENT__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_UNIQUE = MULTIPLICITY_ELEMENT__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LOWER = MULTIPLICITY_ELEMENT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UPPER = MULTIPLICITY_ELEMENT__UPPER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RAISED_EXCEPTION = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_PARAMETER = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__POST = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Super Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SUPER_OPERATION = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Unresolved Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_UNRESOLVED_OPERATIONS = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNING_CLASS = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE_PARAMETER = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ABSTRACT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UNIQUE_NAME = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.PropertyImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KTAG = MULTIPLICITY_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KOWNED_TAGS = MULTIPLICITY_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KTYPE = MULTIPLICITY_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONTAINED_TYPE = MULTIPLICITY_ELEMENT__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = MULTIPLICITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = MULTIPLICITY_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ORDERED = MULTIPLICITY_ELEMENT__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_UNIQUE = MULTIPLICITY_ELEMENT__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER = MULTIPLICITY_ELEMENT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER = MULTIPLICITY_ELEMENT__UPPER;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPPOSITE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_READ_ONLY = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_COMPOSITE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_DERIVED = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ID = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Getter Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GETTER_BODY = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Setter Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SETTER_BODY = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Getter Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_GETTER_ABSTRACT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Setter Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_SETTER_ABSTRACT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Unresolved Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNED_UNRESOLVED_PROPERTIES = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNING_CLASS = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.TypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE_CONTAINER = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.NamedElementImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.EnumerationLiteralImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 5;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__KTAG = NAMED_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__KOWNED_TAGS = NAMED_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__KTYPE = NAMED_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__ENUMERATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.TypeVariableBindingImpl <em>Type Variable Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.TypeVariableBindingImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeVariableBinding()
	 * @generated
	 */
	int TYPE_VARIABLE_BINDING = 6;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE_BINDING__KTAG = TYPE_CONTAINER__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE_BINDING__KOWNED_TAGS = TYPE_CONTAINER__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE_BINDING__KTYPE = TYPE_CONTAINER__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE_BINDING__CONTAINED_TYPE = TYPE_CONTAINER__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE_BINDING__VARIABLE = TYPE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE_BINDING__TYPE = TYPE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Variable Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE_BINDING_FEATURE_COUNT = TYPE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.TypeDefinitionImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__KTAG = NAMED_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__KOWNED_TAGS = NAMED_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__KTYPE = NAMED_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__CONTAINED_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__SUPER_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__IS_ASPECT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ParameterizedTypeImpl <em>Parameterized Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ParameterizedTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getParameterizedType()
	 * @generated
	 */
	int PARAMETERIZED_TYPE = 25;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__KTAG = TYPE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__KOWNED_TAGS = TYPE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__KTYPE = TYPE__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__TYPE_CONTAINER = TYPE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Virtual Type Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Param Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__TYPE_PARAM_BINDING = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__TYPE_DEFINITION = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameterized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ClassImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 9;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__KTAG = PARAMETERIZED_TYPE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__KOWNED_TAGS = PARAMETERIZED_TYPE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__KTYPE = PARAMETERIZED_TYPE__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPE_CONTAINER = PARAMETERIZED_TYPE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Virtual Type Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VIRTUAL_TYPE_BINDING = PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING;

	/**
	 * The feature id for the '<em><b>Type Param Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPE_PARAM_BINDING = PARAMETERIZED_TYPE__TYPE_PARAM_BINDING;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPE_DEFINITION = PARAMETERIZED_TYPE__TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ATTRIBUTE = PARAMETERIZED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_OPERATION = PARAMETERIZED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASS = PARAMETERIZED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = PARAMETERIZED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = PARAMETERIZED_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = PARAMETERIZED_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.DataTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__KTAG = TYPE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__KOWNED_TAGS = TYPE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__KTYPE = TYPE__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPE_CONTAINER = TYPE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CONTAINED_TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUPER_TYPE = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_ASPECT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.EnumerationImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 11;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__KTAG = DATA_TYPE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__KOWNED_TAGS = DATA_TYPE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__KTYPE = DATA_TYPE__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TYPE_CONTAINER = DATA_TYPE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CONTAINED_TYPE = DATA_TYPE__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SUPER_TYPE = DATA_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_ASPECT = DATA_TYPE__IS_ASPECT;

	/**
	 * The feature id for the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_LITERAL = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.PackageImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 13;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__KTAG = NAMED_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__KOWNED_TAGS = NAMED_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__KTYPE = NAMED_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_TYPE_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NESTED_PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NESTING_PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__URI = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Adaptation Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_ADAPTATION_OPERATORS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ParameterImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KTAG = MULTIPLICITY_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KOWNED_TAGS = MULTIPLICITY_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KTYPE = MULTIPLICITY_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONTAINED_TYPE = MULTIPLICITY_ELEMENT__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = MULTIPLICITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = MULTIPLICITY_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_ORDERED = MULTIPLICITY_ELEMENT__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_UNIQUE = MULTIPLICITY_ELEMENT__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOWER = MULTIPLICITY_ELEMENT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UPPER = MULTIPLICITY_ELEMENT__UPPER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPERATION = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.PrimitiveTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__KTAG = DATA_TYPE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__KOWNED_TAGS = DATA_TYPE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__KTYPE = DATA_TYPE__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE_CONTAINER = DATA_TYPE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__CONTAINED_TYPE = DATA_TYPE__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__SUPER_TYPE = DATA_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__IS_ASPECT = DATA_TYPE__IS_ASPECT;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__INSTANCE_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.TagImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTag()
	 * @generated
	 */
	int TAG = 17;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUE = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__OBJECT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.AbstractPropertyImpl <em>Abstract Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.AbstractPropertyImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getAbstractProperty()
	 * @generated
	 */
	int ABSTRACT_PROPERTY = 18;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The number of structural features of the '<em>Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ConstraintImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__KTAG = NAMED_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__KOWNED_TAGS = NAMED_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__KTYPE = NAMED_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BODY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__STEREOTYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LANGUAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inv Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__INV_OWNER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pre Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PRE_OWNER = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Post Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__POST_OWNER = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ModelElementTypeDefinitionImpl <em>Model Element Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ModelElementTypeDefinitionImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelElementTypeDefinition()
	 * @generated
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION = 55;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION__KTAG = TYPE_DEFINITION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION__KOWNED_TAGS = TYPE_DEFINITION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION__KTYPE = TYPE_DEFINITION__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION__CONTAINED_TYPE = TYPE_DEFINITION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION__SUPER_TYPE = TYPE_DEFINITION__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION__IS_ASPECT = TYPE_DEFINITION__IS_ASPECT;

	/**
	 * The number of structural features of the '<em>Model Element Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.GenericTypeDefinitionImpl <em>Generic Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.GenericTypeDefinitionImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getGenericTypeDefinition()
	 * @generated
	 */
	int GENERIC_TYPE_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__KTAG = MODEL_ELEMENT_TYPE_DEFINITION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__KOWNED_TAGS = MODEL_ELEMENT_TYPE_DEFINITION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__KTYPE = MODEL_ELEMENT_TYPE_DEFINITION__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__NAME = MODEL_ELEMENT_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__CONTAINED_TYPE = MODEL_ELEMENT_TYPE_DEFINITION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__SUPER_TYPE = MODEL_ELEMENT_TYPE_DEFINITION__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__IS_ASPECT = MODEL_ELEMENT_TYPE_DEFINITION__IS_ASPECT;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__TYPE_PARAMETER = MODEL_ELEMENT_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION_FEATURE_COUNT = MODEL_ELEMENT_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ClassDefinitionImpl <em>Class Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ClassDefinitionImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getClassDefinition()
	 * @generated
	 */
	int CLASS_DEFINITION = 20;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__KTAG = GENERIC_TYPE_DEFINITION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__KOWNED_TAGS = GENERIC_TYPE_DEFINITION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__KTYPE = GENERIC_TYPE_DEFINITION__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__NAME = GENERIC_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__CONTAINED_TYPE = GENERIC_TYPE_DEFINITION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__SUPER_TYPE = GENERIC_TYPE_DEFINITION__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__IS_ASPECT = GENERIC_TYPE_DEFINITION__IS_ASPECT;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__TYPE_PARAMETER = GENERIC_TYPE_DEFINITION__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Inv</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__INV = GENERIC_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__IS_ABSTRACT = GENERIC_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__OWNED_ATTRIBUTE = GENERIC_TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__OWNED_OPERATION = GENERIC_TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__IS_SINGLETON = GENERIC_TYPE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__IS_FINAL = GENERIC_TYPE_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_FEATURE_COUNT = GENERIC_TYPE_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ModelingUnitImpl <em>Modeling Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ModelingUnitImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelingUnit()
	 * @generated
	 */
	int MODELING_UNIT = 21;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__NAME = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__PACKAGES = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__NAMESPACE_PREFIX = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__REQUIRES = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Modeling Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ModelElementTypeDefinitionContainerImpl <em>Model Element Type Definition Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ModelElementTypeDefinitionContainerImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelElementTypeDefinitionContainer()
	 * @generated
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER = 22;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__KTAG = NAMED_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__KOWNED_TAGS = NAMED_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__KTYPE = NAMED_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Element Type Definition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.RequireImpl <em>Require</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.RequireImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getRequire()
	 * @generated
	 */
	int REQUIRE = 23;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__URI = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Require</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.TypeVariableImpl <em>Type Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.TypeVariableImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeVariable()
	 * @generated
	 */
	int TYPE_VARIABLE = 26;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE__KTAG = TYPE_CONTAINER__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE__KOWNED_TAGS = TYPE_CONTAINER__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE__KTYPE = TYPE_CONTAINER__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE__CONTAINED_TYPE = TYPE_CONTAINER__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE__TYPE_CONTAINER = TYPE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE__NAME = TYPE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE__SUPERTYPE = TYPE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE_FEATURE_COUNT = TYPE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ObjectTypeVariableImpl <em>Object Type Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ObjectTypeVariableImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getObjectTypeVariable()
	 * @generated
	 */
	int OBJECT_TYPE_VARIABLE = 27;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_VARIABLE__KTAG = TYPE_VARIABLE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_VARIABLE__KOWNED_TAGS = TYPE_VARIABLE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_VARIABLE__KTYPE = TYPE_VARIABLE__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_VARIABLE__CONTAINED_TYPE = TYPE_VARIABLE__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_VARIABLE__TYPE_CONTAINER = TYPE_VARIABLE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_VARIABLE__NAME = TYPE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_VARIABLE__SUPERTYPE = TYPE_VARIABLE__SUPERTYPE;

	/**
	 * The number of structural features of the '<em>Object Type Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_VARIABLE_FEATURE_COUNT = TYPE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.MetamodelImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 28;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__KTAG = TYPE_DEFINITION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__KOWNED_TAGS = TYPE_DEFINITION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__KTYPE = TYPE_DEFINITION__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__CONTAINED_TYPE = TYPE_DEFINITION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__SUPER_TYPE = TYPE_DEFINITION__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__IS_ASPECT = TYPE_DEFINITION__IS_ASPECT;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__PACKAGES = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__NAMESPACE_PREFIX = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__REQUIRES = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__OWNED_BINDINGS = TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__OWNED_METAMODELS = TYPE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.MetamodelVariableImpl <em>Metamodel Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.MetamodelVariableImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getMetamodelVariable()
	 * @generated
	 */
	int METAMODEL_VARIABLE = 29;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABLE__KTAG = TYPE_VARIABLE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABLE__KOWNED_TAGS = TYPE_VARIABLE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABLE__KTYPE = TYPE_VARIABLE__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABLE__CONTAINED_TYPE = TYPE_VARIABLE__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABLE__TYPE_CONTAINER = TYPE_VARIABLE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABLE__NAME = TYPE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABLE__SUPERTYPE = TYPE_VARIABLE__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Virtual Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABLE__VIRTUAL_TYPE = TYPE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metamodel Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABLE_FEATURE_COUNT = TYPE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ModelTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 56;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.VirtualTypeImpl <em>Virtual Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.VirtualTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getVirtualType()
	 * @generated
	 */
	int VIRTUAL_TYPE = 30;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__KTAG = OBJECT_TYPE_VARIABLE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__KOWNED_TAGS = OBJECT_TYPE_VARIABLE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__KTYPE = OBJECT_TYPE_VARIABLE__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__CONTAINED_TYPE = OBJECT_TYPE_VARIABLE__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__TYPE_CONTAINER = OBJECT_TYPE_VARIABLE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__NAME = OBJECT_TYPE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__SUPERTYPE = OBJECT_TYPE_VARIABLE__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Class Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__CLASS_DEFINITION = OBJECT_TYPE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__METAMODEL_VARIABLE = OBJECT_TYPE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Param Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__TYPE_PARAM_BINDING = OBJECT_TYPE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Virtual Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE_FEATURE_COUNT = OBJECT_TYPE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ModelImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 31;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTENTS = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.AbstractOperationImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getAbstractOperation()
	 * @generated
	 */
	int ABSTRACT_OPERATION = 32;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The number of structural features of the '<em>Abstract Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedTypeImpl <em>Unresolved Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedType()
	 * @generated
	 */
	int UNRESOLVED_TYPE = 33;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__KTAG = TYPE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__KOWNED_TAGS = TYPE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__KTYPE = TYPE__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__TYPE_CONTAINER = TYPE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__CONTAINED_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__USINGS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__GENERICS = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__TYPE_IDENTIFIER = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Unresolved Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedReferenceImpl <em>Unresolved Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedReferenceImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedReference()
	 * @generated
	 */
	int UNRESOLVED_REFERENCE = 34;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The number of structural features of the '<em>Unresolved Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedPropertyImpl <em>Unresolved Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedPropertyImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedProperty()
	 * @generated
	 */
	int UNRESOLVED_PROPERTY = 35;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_PROPERTY__KTAG = ABSTRACT_PROPERTY__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_PROPERTY__KOWNED_TAGS = ABSTRACT_PROPERTY__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_PROPERTY__KTYPE = ABSTRACT_PROPERTY__KTYPE;

	/**
	 * The feature id for the '<em><b>Property Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_PROPERTY__PROPERTY_IDENTIFIER = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unresolved Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_PROPERTY_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedOperationImpl <em>Unresolved Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedOperationImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedOperation()
	 * @generated
	 */
	int UNRESOLVED_OPERATION = 36;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_OPERATION__KTAG = ABSTRACT_OPERATION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_OPERATION__KOWNED_TAGS = ABSTRACT_OPERATION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_OPERATION__KTYPE = ABSTRACT_OPERATION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_OPERATION__CONTAINED_TYPE = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_OPERATION__OPERATION_IDENTIFIER = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_OPERATION__FROM = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unresolved Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_OPERATION_FEATURE_COUNT = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UsingImpl <em>Using</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UsingImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUsing()
	 * @generated
	 */
	int USING = 37;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>From QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__FROM_QNAME = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__TO_NAME = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Using</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ProductTypeImpl <em>Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ProductTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getProductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 38;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__KTAG = TYPE_CONTAINER__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__KOWNED_TAGS = TYPE_CONTAINER__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__KTYPE = TYPE_CONTAINER__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__CONTAINED_TYPE = TYPE_CONTAINER__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__TYPE_CONTAINER = TYPE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__TYPE = TYPE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_FEATURE_COUNT = TYPE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.FunctionTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 39;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__KTAG = TYPE_CONTAINER__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__KOWNED_TAGS = TYPE_CONTAINER__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__KTYPE = TYPE_CONTAINER__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__CONTAINED_TYPE = TYPE_CONTAINER__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__TYPE_CONTAINER = TYPE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__LEFT = TYPE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__RIGHT = TYPE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = TYPE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.VoidTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 40;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__KTAG = TYPE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__KOWNED_TAGS = TYPE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__KTYPE = TYPE__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__TYPE_CONTAINER = TYPE__TYPE_CONTAINER;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedInferredTypeImpl <em>Unresolved Inferred Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedInferredTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedInferredType()
	 * @generated
	 */
	int UNRESOLVED_INFERRED_TYPE = 41;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INFERRED_TYPE__KTAG = UNRESOLVED_REFERENCE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INFERRED_TYPE__KOWNED_TAGS = UNRESOLVED_REFERENCE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INFERRED_TYPE__KTYPE = UNRESOLVED_REFERENCE__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INFERRED_TYPE__TYPE_CONTAINER = UNRESOLVED_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unresolved Inferred Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INFERRED_TYPE_FEATURE_COUNT = UNRESOLVED_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedTypeVariableImpl <em>Unresolved Type Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedTypeVariableImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedTypeVariable()
	 * @generated
	 */
	int UNRESOLVED_TYPE_VARIABLE = 42;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_VARIABLE__KTAG = UNRESOLVED_REFERENCE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_VARIABLE__KOWNED_TAGS = UNRESOLVED_REFERENCE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_VARIABLE__KTYPE = UNRESOLVED_REFERENCE__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_VARIABLE__CONTAINED_TYPE = UNRESOLVED_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_VARIABLE__TYPE_CONTAINER = UNRESOLVED_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_VARIABLE__NAME = UNRESOLVED_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_VARIABLE__SUPERTYPE = UNRESOLVED_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Unresolved Type Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_VARIABLE_FEATURE_COUNT = UNRESOLVED_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.MetamodelBindingImpl <em>Metamodel Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.MetamodelBindingImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getMetamodelBinding()
	 * @generated
	 */
	int METAMODEL_BINDING = 43;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BINDING__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BINDING__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BINDING__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Bound Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BINDING__BOUND_METAMODEL = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Class Definition Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BINDING__OWNED_CLASS_DEFINITION_BINDINGS = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Used Adaptation Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BINDING__USED_ADAPTATION_OPERATORS = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BINDING__OWNED_ENUMERATION_BINDINGS = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Metamodel Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BINDING_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ClassDefinitionBindingImpl <em>Class Definition Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ClassDefinitionBindingImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getClassDefinitionBinding()
	 * @generated
	 */
	int CLASS_DEFINITION_BINDING = 44;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_BINDING__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_BINDING__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_BINDING__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Owned Property Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Operation Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_BINDING__SOURCE = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_BINDING__TARGET = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Definition Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_BINDING_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.EnumerationBindingImpl <em>Enumeration Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.EnumerationBindingImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getEnumerationBinding()
	 * @generated
	 */
	int ENUMERATION_BINDING = 45;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_BINDING__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_BINDING__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_BINDING__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_BINDING__SOURCE = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_BINDING__TARGET = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_BINDING_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.PropertyBindingImpl <em>Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.PropertyBindingImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getPropertyBinding()
	 * @generated
	 */
	int PROPERTY_BINDING = 46;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__SOURCE = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__TARGET = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.OperationBindingImpl <em>Operation Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.OperationBindingImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getOperationBinding()
	 * @generated
	 */
	int OPERATION_BINDING = 47;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINDING__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINDING__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINDING__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINDING__SOURCE = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINDING__TARGET = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINDING_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.AdaptationOperatorImpl <em>Adaptation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.AdaptationOperatorImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getAdaptationOperator()
	 * @generated
	 */
	int ADAPTATION_OPERATOR = 48;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_OPERATOR__KTAG = NAMED_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_OPERATOR__KOWNED_TAGS = NAMED_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_OPERATOR__KTYPE = NAMED_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_OPERATOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_OPERATOR__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adaptation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_OPERATOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UseAdaptationOperatorImpl <em>Use Adaptation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UseAdaptationOperatorImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUseAdaptationOperator()
	 * @generated
	 */
	int USE_ADAPTATION_OPERATOR = 49;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ADAPTATION_OPERATOR__KTAG = KERMETA_MODEL_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ADAPTATION_OPERATOR__KOWNED_TAGS = KERMETA_MODEL_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ADAPTATION_OPERATOR__KTYPE = KERMETA_MODEL_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ADAPTATION_OPERATOR__PARAMETERS = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Unresolved</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ADAPTATION_OPERATOR__OWNED_UNRESOLVED = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Used Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ADAPTATION_OPERATOR__USED_OPERATOR = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Use Adaptation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ADAPTATION_OPERATOR_FEATURE_COUNT = KERMETA_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.PropertyAdaptationOperatorImpl <em>Property Adaptation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.PropertyAdaptationOperatorImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getPropertyAdaptationOperator()
	 * @generated
	 */
	int PROPERTY_ADAPTATION_OPERATOR = 50;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR__KTAG = ADAPTATION_OPERATOR__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR__KOWNED_TAGS = ADAPTATION_OPERATOR__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR__KTYPE = ADAPTATION_OPERATOR__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR__NAME = ADAPTATION_OPERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR__PARAMETERS = ADAPTATION_OPERATOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR__TARGET = ADAPTATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR__GETTER = ADAPTATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR__SETTER = ADAPTATION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Adder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR__ADDER = ADAPTATION_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR__REMOVER = ADAPTATION_OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Property Adaptation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ADAPTATION_OPERATOR_FEATURE_COUNT = ADAPTATION_OPERATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedAdaptationOperatorImpl <em>Unresolved Adaptation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedAdaptationOperatorImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedAdaptationOperator()
	 * @generated
	 */
	int UNRESOLVED_ADAPTATION_OPERATOR = 51;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ADAPTATION_OPERATOR__KTAG = ADAPTATION_OPERATOR__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ADAPTATION_OPERATOR__KOWNED_TAGS = ADAPTATION_OPERATOR__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ADAPTATION_OPERATOR__KTYPE = ADAPTATION_OPERATOR__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ADAPTATION_OPERATOR__NAME = ADAPTATION_OPERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ADAPTATION_OPERATOR__PARAMETERS = ADAPTATION_OPERATOR__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Unresolved Adaptation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ADAPTATION_OPERATOR_FEATURE_COUNT = ADAPTATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.AdaptationParameterImpl <em>Adaptation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.AdaptationParameterImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getAdaptationParameter()
	 * @generated
	 */
	int ADAPTATION_PARAMETER = 52;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_PARAMETER__KTAG = TYPED_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_PARAMETER__KOWNED_TAGS = TYPED_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_PARAMETER__KTYPE = TYPED_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_PARAMETER__CONTAINED_TYPE = TYPED_ELEMENT__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_PARAMETER__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_PARAMETER__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Adaptation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.OperationAdaptationOperatorImpl <em>Operation Adaptation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.OperationAdaptationOperatorImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getOperationAdaptationOperator()
	 * @generated
	 */
	int OPERATION_ADAPTATION_OPERATOR = 53;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADAPTATION_OPERATOR__KTAG = ADAPTATION_OPERATOR__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADAPTATION_OPERATOR__KOWNED_TAGS = ADAPTATION_OPERATOR__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADAPTATION_OPERATOR__KTYPE = ADAPTATION_OPERATOR__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADAPTATION_OPERATOR__NAME = ADAPTATION_OPERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADAPTATION_OPERATOR__PARAMETERS = ADAPTATION_OPERATOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADAPTATION_OPERATOR__BODY = ADAPTATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADAPTATION_OPERATOR__TARGET = ADAPTATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Adaptation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADAPTATION_OPERATOR_FEATURE_COUNT = ADAPTATION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedMetamodelImpl <em>Unresolved Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedMetamodelImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedMetamodel()
	 * @generated
	 */
	int UNRESOLVED_METAMODEL = 54;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METAMODEL__KTAG = MODELING_UNIT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METAMODEL__KOWNED_TAGS = MODELING_UNIT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METAMODEL__KTYPE = MODELING_UNIT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METAMODEL__NAME = MODELING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METAMODEL__PACKAGES = MODELING_UNIT__PACKAGES;

	/**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METAMODEL__NAMESPACE_PREFIX = MODELING_UNIT__NAMESPACE_PREFIX;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METAMODEL__REQUIRES = MODELING_UNIT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Owned Modeling Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METAMODEL__OWNED_MODELING_UNITS = MODELING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unresolved Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METAMODEL_FEATURE_COUNT = MODELING_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__KTAG = TYPE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__KOWNED_TAGS = TYPE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__KTYPE = TYPE__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__TYPE_CONTAINER = TYPE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__TYPE_DEFINITION = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.ConstraintLanguage <em>Constraint Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.ConstraintLanguage
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getConstraintLanguage()
	 * @generated
	 */
	int CONSTRAINT_LANGUAGE = 57;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.ConstraintType <em>Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.ConstraintType
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getConstraintType()
	 * @generated
	 */
	int CONSTRAINT_TYPE = 58;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getString()
	 * @generated
	 */
	int STRING = 59;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 60;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 61;

	/**
	 * The meta object id for the '<em>Unlimited Natural</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnlimitedNatural()
	 * @generated
	 */
	int UNLIMITED_NATURAL = 62;


	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.KermetaModelElement <em>Kermeta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kermeta Model Element</em>'.
	 * @see org.kermeta.language.structure.KermetaModelElement
	 * @generated
	 */
	EClass getKermetaModelElement();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.KermetaModelElement#getKTag <em>KTag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>KTag</em>'.
	 * @see org.kermeta.language.structure.KermetaModelElement#getKTag()
	 * @see #getKermetaModelElement()
	 * @generated
	 */
	EReference getKermetaModelElement_KTag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.KermetaModelElement#getKOwnedTags <em>KOwned Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>KOwned Tags</em>'.
	 * @see org.kermeta.language.structure.KermetaModelElement#getKOwnedTags()
	 * @see #getKermetaModelElement()
	 * @generated
	 */
	EReference getKermetaModelElement_KOwnedTags();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.KermetaModelElement#getKType <em>KType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>KType</em>'.
	 * @see org.kermeta.language.structure.KermetaModelElement#getKType()
	 * @see #getKermetaModelElement()
	 * @generated
	 */
	EReference getKermetaModelElement_KType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.kermeta.language.structure.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Operation#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.kermeta.language.structure.Operation#getIsAbstract()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsAbstract();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.Operation#getRaisedException <em>Raised Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Raised Exception</em>'.
	 * @see org.kermeta.language.structure.Operation#getRaisedException()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_RaisedException();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Operation#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see org.kermeta.language.structure.Operation#getOwnedParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OwnedParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Operation#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.kermeta.language.structure.Operation#getPre()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Operation#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post</em>'.
	 * @see org.kermeta.language.structure.Operation#getPost()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Post();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.structure.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.kermeta.language.structure.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Body();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.Operation#getSuperOperation <em>Super Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Operation</em>'.
	 * @see org.kermeta.language.structure.Operation#getSuperOperation()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_SuperOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Operation#getOwnedUnresolvedOperations <em>Owned Unresolved Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Unresolved Operations</em>'.
	 * @see org.kermeta.language.structure.Operation#getOwnedUnresolvedOperations()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OwnedUnresolvedOperations();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Class</em>'.
	 * @see org.kermeta.language.structure.Operation#getOwningClass()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OwningClass();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.Operation#getTypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Parameter</em>'.
	 * @see org.kermeta.language.structure.Operation#getTypeParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_TypeParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Operation#getUniqueName <em>Unique Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see org.kermeta.language.structure.Operation#getUniqueName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_UniqueName();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.kermeta.language.structure.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.Property#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.kermeta.language.structure.Property#getOpposite()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Property#getIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see org.kermeta.language.structure.Property#getIsReadOnly()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Property#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.kermeta.language.structure.Property#getDefault()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Property#getIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see org.kermeta.language.structure.Property#getIsComposite()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsComposite();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Property#getIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see org.kermeta.language.structure.Property#getIsDerived()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Property#getIsID <em>Is ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is ID</em>'.
	 * @see org.kermeta.language.structure.Property#getIsID()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsID();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.structure.Property#getGetterBody <em>Getter Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Getter Body</em>'.
	 * @see org.kermeta.language.structure.Property#getGetterBody()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_GetterBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.structure.Property#getSetterBody <em>Setter Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setter Body</em>'.
	 * @see org.kermeta.language.structure.Property#getSetterBody()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_SetterBody();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Property#getIsGetterAbstract <em>Is Getter Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Getter Abstract</em>'.
	 * @see org.kermeta.language.structure.Property#getIsGetterAbstract()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsGetterAbstract();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Property#getIsSetterAbstract <em>Is Setter Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Setter Abstract</em>'.
	 * @see org.kermeta.language.structure.Property#getIsSetterAbstract()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsSetterAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Property#getOwnedUnresolvedProperties <em>Owned Unresolved Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Unresolved Properties</em>'.
	 * @see org.kermeta.language.structure.Property#getOwnedUnresolvedProperties()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_OwnedUnresolvedProperties();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Class</em>'.
	 * @see org.kermeta.language.structure.Property#getOwningClass()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_OwningClass();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.kermeta.language.structure.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type Container</em>'.
	 * @see org.kermeta.language.structure.Type#getTypeContainer()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_TypeContainer();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.TypeContainer <em>Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Container</em>'.
	 * @see org.kermeta.language.structure.TypeContainer
	 * @generated
	 */
	EClass getTypeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.TypeContainer#getContainedType <em>Contained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Type</em>'.
	 * @see org.kermeta.language.structure.TypeContainer#getContainedType()
	 * @see #getTypeContainer()
	 * @generated
	 */
	EReference getTypeContainer_ContainedType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see org.kermeta.language.structure.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enumeration</em>'.
	 * @see org.kermeta.language.structure.EnumerationLiteral#getEnumeration()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EReference getEnumerationLiteral_Enumeration();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.TypeVariableBinding <em>Type Variable Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Variable Binding</em>'.
	 * @see org.kermeta.language.structure.TypeVariableBinding
	 * @generated
	 */
	EClass getTypeVariableBinding();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.TypeVariableBinding#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.kermeta.language.structure.TypeVariableBinding#getVariable()
	 * @see #getTypeVariableBinding()
	 * @generated
	 */
	EReference getTypeVariableBinding_Variable();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.TypeVariableBinding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.kermeta.language.structure.TypeVariableBinding#getType()
	 * @see #getTypeVariableBinding()
	 * @generated
	 */
	EReference getTypeVariableBinding_Type();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see org.kermeta.language.structure.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.MultiplicityElement#getIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see org.kermeta.language.structure.MultiplicityElement#getIsOrdered()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.MultiplicityElement#getIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see org.kermeta.language.structure.MultiplicityElement#getIsUnique()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.MultiplicityElement#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.kermeta.language.structure.MultiplicityElement#getLower()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Lower();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.MultiplicityElement#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.kermeta.language.structure.MultiplicityElement#getUpper()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Upper();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see org.kermeta.language.structure.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.TypeDefinition#getIsAspect <em>Is Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Aspect</em>'.
	 * @see org.kermeta.language.structure.TypeDefinition#getIsAspect()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EAttribute getTypeDefinition_IsAspect();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.TypeDefinition#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Type</em>'.
	 * @see org.kermeta.language.structure.TypeDefinition#getSuperType()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_SuperType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.kermeta.language.structure.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.Class#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Attribute</em>'.
	 * @see org.kermeta.language.structure.Class#getOwnedAttribute()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedAttribute();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Operation</em>'.
	 * @see org.kermeta.language.structure.Class#getOwnedOperation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedOperation();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.Class#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see org.kermeta.language.structure.Class#getSuperClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SuperClass();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Class#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.kermeta.language.structure.Class#getIsAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.language.structure.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.kermeta.language.structure.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.kermeta.language.structure.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Enumeration#getOwnedLiteral <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Literal</em>'.
	 * @see org.kermeta.language.structure.Enumeration#getOwnedLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_OwnedLiteral();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.kermeta.language.structure.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.language.structure.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.kermeta.language.structure.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Package</em>'.
	 * @see org.kermeta.language.structure.Package#getNestedPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_NestedPackage();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Nesting Package</em>'.
	 * @see org.kermeta.language.structure.Package#getNestingPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_NestingPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Package#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.kermeta.language.structure.Package#getUri()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Package#getOwnedAdaptationOperators <em>Owned Adaptation Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Adaptation Operators</em>'.
	 * @see org.kermeta.language.structure.Package#getOwnedAdaptationOperators()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedAdaptationOperators();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.kermeta.language.structure.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see org.kermeta.language.structure.Parameter#getOperation()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Operation();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.kermeta.language.structure.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.PrimitiveType#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Type</em>'.
	 * @see org.kermeta.language.structure.PrimitiveType#getInstanceType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EReference getPrimitiveType_InstanceType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see org.kermeta.language.structure.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.kermeta.language.structure.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.kermeta.language.structure.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.language.structure.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Tag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.kermeta.language.structure.Tag#getValue()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Value();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.Tag#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see org.kermeta.language.structure.Tag#getObject()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Object();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.AbstractProperty <em>Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Property</em>'.
	 * @see org.kermeta.language.structure.AbstractProperty
	 * @generated
	 */
	EClass getAbstractProperty();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.kermeta.language.structure.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.structure.Constraint#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.kermeta.language.structure.Constraint#getBody()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Constraint#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see org.kermeta.language.structure.Constraint#getStereotype()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Constraint#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.kermeta.language.structure.Constraint#getLanguage()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Language();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inv Owner</em>'.
	 * @see org.kermeta.language.structure.Constraint#getInvOwner()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_InvOwner();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pre Owner</em>'.
	 * @see org.kermeta.language.structure.Constraint#getPreOwner()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_PreOwner();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Post Owner</em>'.
	 * @see org.kermeta.language.structure.Constraint#getPostOwner()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_PostOwner();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ClassDefinition <em>Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Definition</em>'.
	 * @see org.kermeta.language.structure.ClassDefinition
	 * @generated
	 */
	EClass getClassDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ClassDefinition#getInv <em>Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inv</em>'.
	 * @see org.kermeta.language.structure.ClassDefinition#getInv()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EReference getClassDefinition_Inv();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.ClassDefinition#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.kermeta.language.structure.ClassDefinition#getIsAbstract()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EAttribute getClassDefinition_IsAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ClassDefinition#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see org.kermeta.language.structure.ClassDefinition#getOwnedAttribute()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EReference getClassDefinition_OwnedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ClassDefinition#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
	 * @see org.kermeta.language.structure.ClassDefinition#getOwnedOperation()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EReference getClassDefinition_OwnedOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.ClassDefinition#getIsSingleton <em>Is Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Singleton</em>'.
	 * @see org.kermeta.language.structure.ClassDefinition#getIsSingleton()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EAttribute getClassDefinition_IsSingleton();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.ClassDefinition#getIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see org.kermeta.language.structure.ClassDefinition#getIsFinal()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EAttribute getClassDefinition_IsFinal();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ModelingUnit <em>Modeling Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Unit</em>'.
	 * @see org.kermeta.language.structure.ModelingUnit
	 * @generated
	 */
	EClass getModelingUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ModelingUnit#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.kermeta.language.structure.ModelingUnit#getPackages()
	 * @see #getModelingUnit()
	 * @generated
	 */
	EReference getModelingUnit_Packages();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.ModelingUnit#getNamespacePrefix <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
	 * @see org.kermeta.language.structure.ModelingUnit#getNamespacePrefix()
	 * @see #getModelingUnit()
	 * @generated
	 */
	EAttribute getModelingUnit_NamespacePrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ModelingUnit#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see org.kermeta.language.structure.ModelingUnit#getRequires()
	 * @see #getModelingUnit()
	 * @generated
	 */
	EReference getModelingUnit_Requires();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ModelElementTypeDefinitionContainer <em>Model Element Type Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Type Definition Container</em>'.
	 * @see org.kermeta.language.structure.ModelElementTypeDefinitionContainer
	 * @generated
	 */
	EClass getModelElementTypeDefinitionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ModelElementTypeDefinitionContainer#getOwnedTypeDefinition <em>Owned Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Type Definition</em>'.
	 * @see org.kermeta.language.structure.ModelElementTypeDefinitionContainer#getOwnedTypeDefinition()
	 * @see #getModelElementTypeDefinitionContainer()
	 * @generated
	 */
	EReference getModelElementTypeDefinitionContainer_OwnedTypeDefinition();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Require <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require</em>'.
	 * @see org.kermeta.language.structure.Require
	 * @generated
	 */
	EClass getRequire();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Require#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.kermeta.language.structure.Require#getUri()
	 * @see #getRequire()
	 * @generated
	 */
	EAttribute getRequire_Uri();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.GenericTypeDefinition <em>Generic Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Type Definition</em>'.
	 * @see org.kermeta.language.structure.GenericTypeDefinition
	 * @generated
	 */
	EClass getGenericTypeDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.GenericTypeDefinition#getTypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Parameter</em>'.
	 * @see org.kermeta.language.structure.GenericTypeDefinition#getTypeParameter()
	 * @see #getGenericTypeDefinition()
	 * @generated
	 */
	EReference getGenericTypeDefinition_TypeParameter();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ParameterizedType <em>Parameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Type</em>'.
	 * @see org.kermeta.language.structure.ParameterizedType
	 * @generated
	 */
	EClass getParameterizedType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ParameterizedType#getVirtualTypeBinding <em>Virtual Type Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Type Binding</em>'.
	 * @see org.kermeta.language.structure.ParameterizedType#getVirtualTypeBinding()
	 * @see #getParameterizedType()
	 * @generated
	 */
	EReference getParameterizedType_VirtualTypeBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ParameterizedType#getTypeParamBinding <em>Type Param Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Param Binding</em>'.
	 * @see org.kermeta.language.structure.ParameterizedType#getTypeParamBinding()
	 * @see #getParameterizedType()
	 * @generated
	 */
	EReference getParameterizedType_TypeParamBinding();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.ParameterizedType#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Definition</em>'.
	 * @see org.kermeta.language.structure.ParameterizedType#getTypeDefinition()
	 * @see #getParameterizedType()
	 * @generated
	 */
	EReference getParameterizedType_TypeDefinition();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.TypeVariable <em>Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Variable</em>'.
	 * @see org.kermeta.language.structure.TypeVariable
	 * @generated
	 */
	EClass getTypeVariable();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.TypeVariable#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertype</em>'.
	 * @see org.kermeta.language.structure.TypeVariable#getSupertype()
	 * @see #getTypeVariable()
	 * @generated
	 */
	EReference getTypeVariable_Supertype();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ObjectTypeVariable <em>Object Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type Variable</em>'.
	 * @see org.kermeta.language.structure.ObjectTypeVariable
	 * @generated
	 */
	EClass getObjectTypeVariable();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see org.kermeta.language.structure.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Metamodel#getOwnedBindings <em>Owned Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Bindings</em>'.
	 * @see org.kermeta.language.structure.Metamodel#getOwnedBindings()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_OwnedBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Metamodel#getOwnedMetamodels <em>Owned Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Metamodels</em>'.
	 * @see org.kermeta.language.structure.Metamodel#getOwnedMetamodels()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_OwnedMetamodels();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.MetamodelVariable <em>Metamodel Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Variable</em>'.
	 * @see org.kermeta.language.structure.MetamodelVariable
	 * @generated
	 */
	EClass getMetamodelVariable();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.MetamodelVariable#getVirtualType <em>Virtual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtual Type</em>'.
	 * @see org.kermeta.language.structure.MetamodelVariable#getVirtualType()
	 * @see #getMetamodelVariable()
	 * @generated
	 */
	EReference getMetamodelVariable_VirtualType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see org.kermeta.language.structure.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.ModelType#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Definition</em>'.
	 * @see org.kermeta.language.structure.ModelType#getTypeDefinition()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_TypeDefinition();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.VirtualType <em>Virtual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Type</em>'.
	 * @see org.kermeta.language.structure.VirtualType
	 * @generated
	 */
	EClass getVirtualType();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.VirtualType#getClassDefinition <em>Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Definition</em>'.
	 * @see org.kermeta.language.structure.VirtualType#getClassDefinition()
	 * @see #getVirtualType()
	 * @generated
	 */
	EReference getVirtualType_ClassDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.VirtualType#getMetamodelVariable <em>Metamodel Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel Variable</em>'.
	 * @see org.kermeta.language.structure.VirtualType#getMetamodelVariable()
	 * @see #getVirtualType()
	 * @generated
	 */
	EReference getVirtualType_MetamodelVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.VirtualType#getTypeParamBinding <em>Type Param Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Param Binding</em>'.
	 * @see org.kermeta.language.structure.VirtualType#getTypeParamBinding()
	 * @see #getVirtualType()
	 * @generated
	 */
	EReference getVirtualType_TypeParamBinding();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.kermeta.language.structure.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.Model#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contents</em>'.
	 * @see org.kermeta.language.structure.Model#getContents()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Contents();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.AbstractOperation <em>Abstract Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Operation</em>'.
	 * @see org.kermeta.language.structure.AbstractOperation
	 * @generated
	 */
	EClass getAbstractOperation();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.UnresolvedType <em>Unresolved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Type</em>'.
	 * @see org.kermeta.language.structure.UnresolvedType
	 * @generated
	 */
	EClass getUnresolvedType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.UnresolvedType#getTypeIdentifier <em>Type Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Identifier</em>'.
	 * @see org.kermeta.language.structure.UnresolvedType#getTypeIdentifier()
	 * @see #getUnresolvedType()
	 * @generated
	 */
	EAttribute getUnresolvedType_TypeIdentifier();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.UnresolvedReference <em>Unresolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Reference</em>'.
	 * @see org.kermeta.language.structure.UnresolvedReference
	 * @generated
	 */
	EClass getUnresolvedReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.UnresolvedType#getUsings <em>Usings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usings</em>'.
	 * @see org.kermeta.language.structure.UnresolvedType#getUsings()
	 * @see #getUnresolvedType()
	 * @generated
	 */
	EReference getUnresolvedType_Usings();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.UnresolvedType#getGenerics <em>Generics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generics</em>'.
	 * @see org.kermeta.language.structure.UnresolvedType#getGenerics()
	 * @see #getUnresolvedType()
	 * @generated
	 */
	EReference getUnresolvedType_Generics();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.UnresolvedProperty <em>Unresolved Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Property</em>'.
	 * @see org.kermeta.language.structure.UnresolvedProperty
	 * @generated
	 */
	EClass getUnresolvedProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.UnresolvedProperty#getPropertyIdentifier <em>Property Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Identifier</em>'.
	 * @see org.kermeta.language.structure.UnresolvedProperty#getPropertyIdentifier()
	 * @see #getUnresolvedProperty()
	 * @generated
	 */
	EAttribute getUnresolvedProperty_PropertyIdentifier();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.UnresolvedOperation <em>Unresolved Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Operation</em>'.
	 * @see org.kermeta.language.structure.UnresolvedOperation
	 * @generated
	 */
	EClass getUnresolvedOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.UnresolvedOperation#getOperationIdentifier <em>Operation Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Identifier</em>'.
	 * @see org.kermeta.language.structure.UnresolvedOperation#getOperationIdentifier()
	 * @see #getUnresolvedOperation()
	 * @generated
	 */
	EAttribute getUnresolvedOperation_OperationIdentifier();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.UnresolvedOperation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.kermeta.language.structure.UnresolvedOperation#getFrom()
	 * @see #getUnresolvedOperation()
	 * @generated
	 */
	EReference getUnresolvedOperation_From();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Using <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Using</em>'.
	 * @see org.kermeta.language.structure.Using
	 * @generated
	 */
	EClass getUsing();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Using#getFromQName <em>From QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From QName</em>'.
	 * @see org.kermeta.language.structure.Using#getFromQName()
	 * @see #getUsing()
	 * @generated
	 */
	EAttribute getUsing_FromQName();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.Using#getToName <em>To Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Name</em>'.
	 * @see org.kermeta.language.structure.Using#getToName()
	 * @see #getUsing()
	 * @generated
	 */
	EAttribute getUsing_ToName();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Type</em>'.
	 * @see org.kermeta.language.structure.ProductType
	 * @generated
	 */
	EClass getProductType();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.ProductType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.kermeta.language.structure.ProductType#getType()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_Type();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see org.kermeta.language.structure.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.FunctionType#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.kermeta.language.structure.FunctionType#getLeft()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_Left();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.FunctionType#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.kermeta.language.structure.FunctionType#getRight()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_Right();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see org.kermeta.language.structure.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.UnresolvedInferredType <em>Unresolved Inferred Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Inferred Type</em>'.
	 * @see org.kermeta.language.structure.UnresolvedInferredType
	 * @generated
	 */
	EClass getUnresolvedInferredType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.UnresolvedTypeVariable <em>Unresolved Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Type Variable</em>'.
	 * @see org.kermeta.language.structure.UnresolvedTypeVariable
	 * @generated
	 */
	EClass getUnresolvedTypeVariable();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.MetamodelBinding <em>Metamodel Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Binding</em>'.
	 * @see org.kermeta.language.structure.MetamodelBinding
	 * @generated
	 */
	EClass getMetamodelBinding();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.MetamodelBinding#getBoundMetamodel <em>Bound Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Metamodel</em>'.
	 * @see org.kermeta.language.structure.MetamodelBinding#getBoundMetamodel()
	 * @see #getMetamodelBinding()
	 * @generated
	 */
	EReference getMetamodelBinding_BoundMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.MetamodelBinding#getOwnedClassDefinitionBindings <em>Owned Class Definition Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Class Definition Bindings</em>'.
	 * @see org.kermeta.language.structure.MetamodelBinding#getOwnedClassDefinitionBindings()
	 * @see #getMetamodelBinding()
	 * @generated
	 */
	EReference getMetamodelBinding_OwnedClassDefinitionBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.MetamodelBinding#getUsedAdaptationOperators <em>Used Adaptation Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Adaptation Operators</em>'.
	 * @see org.kermeta.language.structure.MetamodelBinding#getUsedAdaptationOperators()
	 * @see #getMetamodelBinding()
	 * @generated
	 */
	EReference getMetamodelBinding_UsedAdaptationOperators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.MetamodelBinding#getOwnedEnumerationBindings <em>Owned Enumeration Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Enumeration Bindings</em>'.
	 * @see org.kermeta.language.structure.MetamodelBinding#getOwnedEnumerationBindings()
	 * @see #getMetamodelBinding()
	 * @generated
	 */
	EReference getMetamodelBinding_OwnedEnumerationBindings();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ClassDefinitionBinding <em>Class Definition Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Definition Binding</em>'.
	 * @see org.kermeta.language.structure.ClassDefinitionBinding
	 * @generated
	 */
	EClass getClassDefinitionBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ClassDefinitionBinding#getOwnedPropertyBindings <em>Owned Property Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property Bindings</em>'.
	 * @see org.kermeta.language.structure.ClassDefinitionBinding#getOwnedPropertyBindings()
	 * @see #getClassDefinitionBinding()
	 * @generated
	 */
	EReference getClassDefinitionBinding_OwnedPropertyBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ClassDefinitionBinding#getOwnedOperationBindings <em>Owned Operation Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation Bindings</em>'.
	 * @see org.kermeta.language.structure.ClassDefinitionBinding#getOwnedOperationBindings()
	 * @see #getClassDefinitionBinding()
	 * @generated
	 */
	EReference getClassDefinitionBinding_OwnedOperationBindings();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.ClassDefinitionBinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.kermeta.language.structure.ClassDefinitionBinding#getSource()
	 * @see #getClassDefinitionBinding()
	 * @generated
	 */
	EReference getClassDefinitionBinding_Source();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.ClassDefinitionBinding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.kermeta.language.structure.ClassDefinitionBinding#getTarget()
	 * @see #getClassDefinitionBinding()
	 * @generated
	 */
	EReference getClassDefinitionBinding_Target();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.EnumerationBinding <em>Enumeration Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Binding</em>'.
	 * @see org.kermeta.language.structure.EnumerationBinding
	 * @generated
	 */
	EClass getEnumerationBinding();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.EnumerationBinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.kermeta.language.structure.EnumerationBinding#getSource()
	 * @see #getEnumerationBinding()
	 * @generated
	 */
	EReference getEnumerationBinding_Source();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.EnumerationBinding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.kermeta.language.structure.EnumerationBinding#getTarget()
	 * @see #getEnumerationBinding()
	 * @generated
	 */
	EReference getEnumerationBinding_Target();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.PropertyBinding <em>Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Binding</em>'.
	 * @see org.kermeta.language.structure.PropertyBinding
	 * @generated
	 */
	EClass getPropertyBinding();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.PropertyBinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.kermeta.language.structure.PropertyBinding#getSource()
	 * @see #getPropertyBinding()
	 * @generated
	 */
	EReference getPropertyBinding_Source();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.PropertyBinding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.kermeta.language.structure.PropertyBinding#getTarget()
	 * @see #getPropertyBinding()
	 * @generated
	 */
	EReference getPropertyBinding_Target();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.OperationBinding <em>Operation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Binding</em>'.
	 * @see org.kermeta.language.structure.OperationBinding
	 * @generated
	 */
	EClass getOperationBinding();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.OperationBinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.kermeta.language.structure.OperationBinding#getSource()
	 * @see #getOperationBinding()
	 * @generated
	 */
	EReference getOperationBinding_Source();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.OperationBinding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.kermeta.language.structure.OperationBinding#getTarget()
	 * @see #getOperationBinding()
	 * @generated
	 */
	EReference getOperationBinding_Target();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.AdaptationOperator <em>Adaptation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Operator</em>'.
	 * @see org.kermeta.language.structure.AdaptationOperator
	 * @generated
	 */
	EClass getAdaptationOperator();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.AdaptationOperator#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.kermeta.language.structure.AdaptationOperator#getParameters()
	 * @see #getAdaptationOperator()
	 * @generated
	 */
	EReference getAdaptationOperator_Parameters();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.UseAdaptationOperator <em>Use Adaptation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Adaptation Operator</em>'.
	 * @see org.kermeta.language.structure.UseAdaptationOperator
	 * @generated
	 */
	EClass getUseAdaptationOperator();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.UseAdaptationOperator#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.kermeta.language.structure.UseAdaptationOperator#getParameters()
	 * @see #getUseAdaptationOperator()
	 * @generated
	 */
	EReference getUseAdaptationOperator_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.UseAdaptationOperator#getOwnedUnresolved <em>Owned Unresolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Unresolved</em>'.
	 * @see org.kermeta.language.structure.UseAdaptationOperator#getOwnedUnresolved()
	 * @see #getUseAdaptationOperator()
	 * @generated
	 */
	EReference getUseAdaptationOperator_OwnedUnresolved();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.UseAdaptationOperator#getUsedOperator <em>Used Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Used Operator</em>'.
	 * @see org.kermeta.language.structure.UseAdaptationOperator#getUsedOperator()
	 * @see #getUseAdaptationOperator()
	 * @generated
	 */
	EReference getUseAdaptationOperator_UsedOperator();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.PropertyAdaptationOperator <em>Property Adaptation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Adaptation Operator</em>'.
	 * @see org.kermeta.language.structure.PropertyAdaptationOperator
	 * @generated
	 */
	EClass getPropertyAdaptationOperator();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.PropertyAdaptationOperator#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.kermeta.language.structure.PropertyAdaptationOperator#getTarget()
	 * @see #getPropertyAdaptationOperator()
	 * @generated
	 */
	EReference getPropertyAdaptationOperator_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.PropertyAdaptationOperator#getGetter <em>Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter</em>'.
	 * @see org.kermeta.language.structure.PropertyAdaptationOperator#getGetter()
	 * @see #getPropertyAdaptationOperator()
	 * @generated
	 */
	EAttribute getPropertyAdaptationOperator_Getter();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.PropertyAdaptationOperator#getSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setter</em>'.
	 * @see org.kermeta.language.structure.PropertyAdaptationOperator#getSetter()
	 * @see #getPropertyAdaptationOperator()
	 * @generated
	 */
	EAttribute getPropertyAdaptationOperator_Setter();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.PropertyAdaptationOperator#getAdder <em>Adder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adder</em>'.
	 * @see org.kermeta.language.structure.PropertyAdaptationOperator#getAdder()
	 * @see #getPropertyAdaptationOperator()
	 * @generated
	 */
	EAttribute getPropertyAdaptationOperator_Adder();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.PropertyAdaptationOperator#getRemover <em>Remover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remover</em>'.
	 * @see org.kermeta.language.structure.PropertyAdaptationOperator#getRemover()
	 * @see #getPropertyAdaptationOperator()
	 * @generated
	 */
	EAttribute getPropertyAdaptationOperator_Remover();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.UnresolvedAdaptationOperator <em>Unresolved Adaptation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Adaptation Operator</em>'.
	 * @see org.kermeta.language.structure.UnresolvedAdaptationOperator
	 * @generated
	 */
	EClass getUnresolvedAdaptationOperator();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.AdaptationParameter <em>Adaptation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Parameter</em>'.
	 * @see org.kermeta.language.structure.AdaptationParameter
	 * @generated
	 */
	EClass getAdaptationParameter();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.OperationAdaptationOperator <em>Operation Adaptation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Adaptation Operator</em>'.
	 * @see org.kermeta.language.structure.OperationAdaptationOperator
	 * @generated
	 */
	EClass getOperationAdaptationOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.OperationAdaptationOperator#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.kermeta.language.structure.OperationAdaptationOperator#getBody()
	 * @see #getOperationAdaptationOperator()
	 * @generated
	 */
	EAttribute getOperationAdaptationOperator_Body();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.OperationAdaptationOperator#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.kermeta.language.structure.OperationAdaptationOperator#getTarget()
	 * @see #getOperationAdaptationOperator()
	 * @generated
	 */
	EReference getOperationAdaptationOperator_Target();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.UnresolvedMetamodel <em>Unresolved Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Metamodel</em>'.
	 * @see org.kermeta.language.structure.UnresolvedMetamodel
	 * @generated
	 */
	EClass getUnresolvedMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.UnresolvedMetamodel#getOwnedModelingUnits <em>Owned Modeling Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Modeling Units</em>'.
	 * @see org.kermeta.language.structure.UnresolvedMetamodel#getOwnedModelingUnits()
	 * @see #getUnresolvedMetamodel()
	 * @generated
	 */
	EReference getUnresolvedMetamodel_OwnedModelingUnits();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ModelElementTypeDefinition <em>Model Element Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Type Definition</em>'.
	 * @see org.kermeta.language.structure.ModelElementTypeDefinition
	 * @generated
	 */
	EClass getModelElementTypeDefinition();

	/**
	 * Returns the meta object for enum '{@link org.kermeta.language.structure.ConstraintLanguage <em>Constraint Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Language</em>'.
	 * @see org.kermeta.language.structure.ConstraintLanguage
	 * @generated
	 */
	EEnum getConstraintLanguage();

	/**
	 * Returns the meta object for enum '{@link org.kermeta.language.structure.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Type</em>'.
	 * @see org.kermeta.language.structure.ConstraintType
	 * @generated
	 */
	EEnum getConstraintType();

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
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
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
	 * Returns the meta object for data type '<em>Unlimited Natural</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unlimited Natural</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getUnlimitedNatural();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructureFactory getStructureFactory();

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
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.KermetaModelElementImpl <em>Kermeta Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.KermetaModelElementImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getKermetaModelElement()
		 * @generated
		 */
		EClass KERMETA_MODEL_ELEMENT = eINSTANCE.getKermetaModelElement();

		/**
		 * The meta object literal for the '<em><b>KTag</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_MODEL_ELEMENT__KTAG = eINSTANCE.getKermetaModelElement_KTag();

		/**
		 * The meta object literal for the '<em><b>KOwned Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_MODEL_ELEMENT__KOWNED_TAGS = eINSTANCE.getKermetaModelElement_KOwnedTags();

		/**
		 * The meta object literal for the '<em><b>KType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_MODEL_ELEMENT__KTYPE = eINSTANCE.getKermetaModelElement_KType();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.OperationImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_ABSTRACT = eINSTANCE.getOperation_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Raised Exception</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RAISED_EXCEPTION = eINSTANCE.getOperation_RaisedException();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OWNED_PARAMETER = eINSTANCE.getOperation_OwnedParameter();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PRE = eINSTANCE.getOperation_Pre();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__POST = eINSTANCE.getOperation_Post();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '<em><b>Super Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__SUPER_OPERATION = eINSTANCE.getOperation_SuperOperation();

		/**
		 * The meta object literal for the '<em><b>Owned Unresolved Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OWNED_UNRESOLVED_OPERATIONS = eINSTANCE.getOperation_OwnedUnresolvedOperations();

		/**
		 * The meta object literal for the '<em><b>Owning Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OWNING_CLASS = eINSTANCE.getOperation_OwningClass();

		/**
		 * The meta object literal for the '<em><b>Type Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__TYPE_PARAMETER = eINSTANCE.getOperation_TypeParameter();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__UNIQUE_NAME = eINSTANCE.getOperation_UniqueName();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.PropertyImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OPPOSITE = eINSTANCE.getProperty_Opposite();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_READ_ONLY = eINSTANCE.getProperty_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DEFAULT = eINSTANCE.getProperty_Default();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_COMPOSITE = eINSTANCE.getProperty_IsComposite();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_DERIVED = eINSTANCE.getProperty_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_ID = eINSTANCE.getProperty_IsID();

		/**
		 * The meta object literal for the '<em><b>Getter Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__GETTER_BODY = eINSTANCE.getProperty_GetterBody();

		/**
		 * The meta object literal for the '<em><b>Setter Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SETTER_BODY = eINSTANCE.getProperty_SetterBody();

		/**
		 * The meta object literal for the '<em><b>Is Getter Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_GETTER_ABSTRACT = eINSTANCE.getProperty_IsGetterAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Setter Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_SETTER_ABSTRACT = eINSTANCE.getProperty_IsSetterAbstract();

		/**
		 * The meta object literal for the '<em><b>Owned Unresolved Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OWNED_UNRESOLVED_PROPERTIES = eINSTANCE.getProperty_OwnedUnresolvedProperties();

		/**
		 * The meta object literal for the '<em><b>Owning Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OWNING_CLASS = eINSTANCE.getProperty_OwningClass();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.TypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Type Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__TYPE_CONTAINER = eINSTANCE.getType_TypeContainer();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.TypeContainerImpl <em>Type Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.TypeContainerImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeContainer()
		 * @generated
		 */
		EClass TYPE_CONTAINER = eINSTANCE.getTypeContainer();

		/**
		 * The meta object literal for the '<em><b>Contained Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CONTAINER__CONTAINED_TYPE = eINSTANCE.getTypeContainer_ContainedType();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.EnumerationLiteralImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL__ENUMERATION = eINSTANCE.getEnumerationLiteral_Enumeration();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.TypeVariableBindingImpl <em>Type Variable Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.TypeVariableBindingImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeVariableBinding()
		 * @generated
		 */
		EClass TYPE_VARIABLE_BINDING = eINSTANCE.getTypeVariableBinding();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_VARIABLE_BINDING__VARIABLE = eINSTANCE.getTypeVariableBinding_Variable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_VARIABLE_BINDING__TYPE = eINSTANCE.getTypeVariableBinding_Type();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.MultiplicityElementImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getMultiplicityElement()
		 * @generated
		 */
		EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__IS_ORDERED = eINSTANCE.getMultiplicityElement_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__IS_UNIQUE = eINSTANCE.getMultiplicityElement_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__LOWER = eINSTANCE.getMultiplicityElement_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__UPPER = eINSTANCE.getMultiplicityElement_Upper();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.TypeDefinitionImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Is Aspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEFINITION__IS_ASPECT = eINSTANCE.getTypeDefinition_IsAspect();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__SUPER_TYPE = eINSTANCE.getTypeDefinition_SuperType();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ClassImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_ATTRIBUTE = eINSTANCE.getClass_OwnedAttribute();

		/**
		 * The meta object literal for the '<em><b>Owned Operation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_OPERATION = eINSTANCE.getClass_OwnedOperation();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPER_CLASS = eINSTANCE.getClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.DataTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.EnumerationImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Owned Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__OWNED_LITERAL = eINSTANCE.getEnumeration_OwnedLiteral();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.NamedElementImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.PackageImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Nested Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NESTED_PACKAGE = eINSTANCE.getPackage_NestedPackage();

		/**
		 * The meta object literal for the '<em><b>Nesting Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NESTING_PACKAGE = eINSTANCE.getPackage_NestingPackage();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__URI = eINSTANCE.getPackage_Uri();

		/**
		 * The meta object literal for the '<em><b>Owned Adaptation Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OWNED_ADAPTATION_OPERATORS = eINSTANCE.getPackage_OwnedAdaptationOperators();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ParameterImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OPERATION = eINSTANCE.getParameter_Operation();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.PrimitiveTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE__INSTANCE_TYPE = eINSTANCE.getPrimitiveType_InstanceType();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.TypedElementImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.TagImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__VALUE = eINSTANCE.getTag_Value();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__OBJECT = eINSTANCE.getTag_Object();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.AbstractPropertyImpl <em>Abstract Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.AbstractPropertyImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getAbstractProperty()
		 * @generated
		 */
		EClass ABSTRACT_PROPERTY = eINSTANCE.getAbstractProperty();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ConstraintImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__BODY = eINSTANCE.getConstraint_Body();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__STEREOTYPE = eINSTANCE.getConstraint_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__LANGUAGE = eINSTANCE.getConstraint_Language();

		/**
		 * The meta object literal for the '<em><b>Inv Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__INV_OWNER = eINSTANCE.getConstraint_InvOwner();

		/**
		 * The meta object literal for the '<em><b>Pre Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__PRE_OWNER = eINSTANCE.getConstraint_PreOwner();

		/**
		 * The meta object literal for the '<em><b>Post Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__POST_OWNER = eINSTANCE.getConstraint_PostOwner();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ClassDefinitionImpl <em>Class Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ClassDefinitionImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getClassDefinition()
		 * @generated
		 */
		EClass CLASS_DEFINITION = eINSTANCE.getClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Inv</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION__INV = eINSTANCE.getClassDefinition_Inv();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DEFINITION__IS_ABSTRACT = eINSTANCE.getClassDefinition_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION__OWNED_ATTRIBUTE = eINSTANCE.getClassDefinition_OwnedAttribute();

		/**
		 * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION__OWNED_OPERATION = eINSTANCE.getClassDefinition_OwnedOperation();

		/**
		 * The meta object literal for the '<em><b>Is Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DEFINITION__IS_SINGLETON = eINSTANCE.getClassDefinition_IsSingleton();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DEFINITION__IS_FINAL = eINSTANCE.getClassDefinition_IsFinal();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ModelingUnitImpl <em>Modeling Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ModelingUnitImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelingUnit()
		 * @generated
		 */
		EClass MODELING_UNIT = eINSTANCE.getModelingUnit();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_UNIT__PACKAGES = eINSTANCE.getModelingUnit_Packages();

		/**
		 * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELING_UNIT__NAMESPACE_PREFIX = eINSTANCE.getModelingUnit_NamespacePrefix();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_UNIT__REQUIRES = eINSTANCE.getModelingUnit_Requires();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ModelElementTypeDefinitionContainerImpl <em>Model Element Type Definition Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ModelElementTypeDefinitionContainerImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelElementTypeDefinitionContainer()
		 * @generated
		 */
		EClass MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER = eINSTANCE.getModelElementTypeDefinitionContainer();

		/**
		 * The meta object literal for the '<em><b>Owned Type Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION = eINSTANCE.getModelElementTypeDefinitionContainer_OwnedTypeDefinition();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.RequireImpl <em>Require</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.RequireImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getRequire()
		 * @generated
		 */
		EClass REQUIRE = eINSTANCE.getRequire();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRE__URI = eINSTANCE.getRequire_Uri();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.GenericTypeDefinitionImpl <em>Generic Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.GenericTypeDefinitionImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getGenericTypeDefinition()
		 * @generated
		 */
		EClass GENERIC_TYPE_DEFINITION = eINSTANCE.getGenericTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Type Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE_DEFINITION__TYPE_PARAMETER = eINSTANCE.getGenericTypeDefinition_TypeParameter();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ParameterizedTypeImpl <em>Parameterized Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ParameterizedTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getParameterizedType()
		 * @generated
		 */
		EClass PARAMETERIZED_TYPE = eINSTANCE.getParameterizedType();

		/**
		 * The meta object literal for the '<em><b>Virtual Type Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING = eINSTANCE.getParameterizedType_VirtualTypeBinding();

		/**
		 * The meta object literal for the '<em><b>Type Param Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_TYPE__TYPE_PARAM_BINDING = eINSTANCE.getParameterizedType_TypeParamBinding();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_TYPE__TYPE_DEFINITION = eINSTANCE.getParameterizedType_TypeDefinition();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.TypeVariableImpl <em>Type Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.TypeVariableImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeVariable()
		 * @generated
		 */
		EClass TYPE_VARIABLE = eINSTANCE.getTypeVariable();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_VARIABLE__SUPERTYPE = eINSTANCE.getTypeVariable_Supertype();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ObjectTypeVariableImpl <em>Object Type Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ObjectTypeVariableImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getObjectTypeVariable()
		 * @generated
		 */
		EClass OBJECT_TYPE_VARIABLE = eINSTANCE.getObjectTypeVariable();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.MetamodelImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Owned Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__OWNED_BINDINGS = eINSTANCE.getMetamodel_OwnedBindings();

		/**
		 * The meta object literal for the '<em><b>Owned Metamodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__OWNED_METAMODELS = eINSTANCE.getMetamodel_OwnedMetamodels();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.MetamodelVariableImpl <em>Metamodel Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.MetamodelVariableImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getMetamodelVariable()
		 * @generated
		 */
		EClass METAMODEL_VARIABLE = eINSTANCE.getMetamodelVariable();

		/**
		 * The meta object literal for the '<em><b>Virtual Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_VARIABLE__VIRTUAL_TYPE = eINSTANCE.getMetamodelVariable_VirtualType();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ModelTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__TYPE_DEFINITION = eINSTANCE.getModelType_TypeDefinition();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.VirtualTypeImpl <em>Virtual Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.VirtualTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getVirtualType()
		 * @generated
		 */
		EClass VIRTUAL_TYPE = eINSTANCE.getVirtualType();

		/**
		 * The meta object literal for the '<em><b>Class Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_TYPE__CLASS_DEFINITION = eINSTANCE.getVirtualType_ClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Metamodel Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_TYPE__METAMODEL_VARIABLE = eINSTANCE.getVirtualType_MetamodelVariable();

		/**
		 * The meta object literal for the '<em><b>Type Param Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_TYPE__TYPE_PARAM_BINDING = eINSTANCE.getVirtualType_TypeParamBinding();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ModelImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTENTS = eINSTANCE.getModel_Contents();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.AbstractOperationImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getAbstractOperation()
		 * @generated
		 */
		EClass ABSTRACT_OPERATION = eINSTANCE.getAbstractOperation();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UnresolvedTypeImpl <em>Unresolved Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UnresolvedTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedType()
		 * @generated
		 */
		EClass UNRESOLVED_TYPE = eINSTANCE.getUnresolvedType();

		/**
		 * The meta object literal for the '<em><b>Type Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNRESOLVED_TYPE__TYPE_IDENTIFIER = eINSTANCE.getUnresolvedType_TypeIdentifier();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UnresolvedReferenceImpl <em>Unresolved Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UnresolvedReferenceImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedReference()
		 * @generated
		 */
		EClass UNRESOLVED_REFERENCE = eINSTANCE.getUnresolvedReference();

		/**
		 * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNRESOLVED_TYPE__USINGS = eINSTANCE.getUnresolvedType_Usings();

		/**
		 * The meta object literal for the '<em><b>Generics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNRESOLVED_TYPE__GENERICS = eINSTANCE.getUnresolvedType_Generics();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UnresolvedPropertyImpl <em>Unresolved Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UnresolvedPropertyImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedProperty()
		 * @generated
		 */
		EClass UNRESOLVED_PROPERTY = eINSTANCE.getUnresolvedProperty();

		/**
		 * The meta object literal for the '<em><b>Property Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNRESOLVED_PROPERTY__PROPERTY_IDENTIFIER = eINSTANCE.getUnresolvedProperty_PropertyIdentifier();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UnresolvedOperationImpl <em>Unresolved Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UnresolvedOperationImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedOperation()
		 * @generated
		 */
		EClass UNRESOLVED_OPERATION = eINSTANCE.getUnresolvedOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNRESOLVED_OPERATION__OPERATION_IDENTIFIER = eINSTANCE.getUnresolvedOperation_OperationIdentifier();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNRESOLVED_OPERATION__FROM = eINSTANCE.getUnresolvedOperation_From();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UsingImpl <em>Using</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UsingImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUsing()
		 * @generated
		 */
		EClass USING = eINSTANCE.getUsing();

		/**
		 * The meta object literal for the '<em><b>From QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USING__FROM_QNAME = eINSTANCE.getUsing_FromQName();

		/**
		 * The meta object literal for the '<em><b>To Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USING__TO_NAME = eINSTANCE.getUsing_ToName();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ProductTypeImpl <em>Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ProductTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getProductType()
		 * @generated
		 */
		EClass PRODUCT_TYPE = eINSTANCE.getProductType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE__TYPE = eINSTANCE.getProductType_Type();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.FunctionTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__LEFT = eINSTANCE.getFunctionType_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__RIGHT = eINSTANCE.getFunctionType_Right();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.VoidTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UnresolvedInferredTypeImpl <em>Unresolved Inferred Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UnresolvedInferredTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedInferredType()
		 * @generated
		 */
		EClass UNRESOLVED_INFERRED_TYPE = eINSTANCE.getUnresolvedInferredType();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UnresolvedTypeVariableImpl <em>Unresolved Type Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UnresolvedTypeVariableImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedTypeVariable()
		 * @generated
		 */
		EClass UNRESOLVED_TYPE_VARIABLE = eINSTANCE.getUnresolvedTypeVariable();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.MetamodelBindingImpl <em>Metamodel Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.MetamodelBindingImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getMetamodelBinding()
		 * @generated
		 */
		EClass METAMODEL_BINDING = eINSTANCE.getMetamodelBinding();

		/**
		 * The meta object literal for the '<em><b>Bound Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_BINDING__BOUND_METAMODEL = eINSTANCE.getMetamodelBinding_BoundMetamodel();

		/**
		 * The meta object literal for the '<em><b>Owned Class Definition Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_BINDING__OWNED_CLASS_DEFINITION_BINDINGS = eINSTANCE.getMetamodelBinding_OwnedClassDefinitionBindings();

		/**
		 * The meta object literal for the '<em><b>Used Adaptation Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_BINDING__USED_ADAPTATION_OPERATORS = eINSTANCE.getMetamodelBinding_UsedAdaptationOperators();

		/**
		 * The meta object literal for the '<em><b>Owned Enumeration Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_BINDING__OWNED_ENUMERATION_BINDINGS = eINSTANCE.getMetamodelBinding_OwnedEnumerationBindings();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ClassDefinitionBindingImpl <em>Class Definition Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ClassDefinitionBindingImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getClassDefinitionBinding()
		 * @generated
		 */
		EClass CLASS_DEFINITION_BINDING = eINSTANCE.getClassDefinitionBinding();

		/**
		 * The meta object literal for the '<em><b>Owned Property Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS = eINSTANCE.getClassDefinitionBinding_OwnedPropertyBindings();

		/**
		 * The meta object literal for the '<em><b>Owned Operation Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS = eINSTANCE.getClassDefinitionBinding_OwnedOperationBindings();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION_BINDING__SOURCE = eINSTANCE.getClassDefinitionBinding_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION_BINDING__TARGET = eINSTANCE.getClassDefinitionBinding_Target();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.EnumerationBindingImpl <em>Enumeration Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.EnumerationBindingImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getEnumerationBinding()
		 * @generated
		 */
		EClass ENUMERATION_BINDING = eINSTANCE.getEnumerationBinding();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_BINDING__SOURCE = eINSTANCE.getEnumerationBinding_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_BINDING__TARGET = eINSTANCE.getEnumerationBinding_Target();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.PropertyBindingImpl <em>Property Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.PropertyBindingImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getPropertyBinding()
		 * @generated
		 */
		EClass PROPERTY_BINDING = eINSTANCE.getPropertyBinding();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_BINDING__SOURCE = eINSTANCE.getPropertyBinding_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_BINDING__TARGET = eINSTANCE.getPropertyBinding_Target();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.OperationBindingImpl <em>Operation Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.OperationBindingImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getOperationBinding()
		 * @generated
		 */
		EClass OPERATION_BINDING = eINSTANCE.getOperationBinding();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BINDING__SOURCE = eINSTANCE.getOperationBinding_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BINDING__TARGET = eINSTANCE.getOperationBinding_Target();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.AdaptationOperatorImpl <em>Adaptation Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.AdaptationOperatorImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getAdaptationOperator()
		 * @generated
		 */
		EClass ADAPTATION_OPERATOR = eINSTANCE.getAdaptationOperator();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_OPERATOR__PARAMETERS = eINSTANCE.getAdaptationOperator_Parameters();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UseAdaptationOperatorImpl <em>Use Adaptation Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UseAdaptationOperatorImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUseAdaptationOperator()
		 * @generated
		 */
		EClass USE_ADAPTATION_OPERATOR = eINSTANCE.getUseAdaptationOperator();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_ADAPTATION_OPERATOR__PARAMETERS = eINSTANCE.getUseAdaptationOperator_Parameters();

		/**
		 * The meta object literal for the '<em><b>Owned Unresolved</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_ADAPTATION_OPERATOR__OWNED_UNRESOLVED = eINSTANCE.getUseAdaptationOperator_OwnedUnresolved();

		/**
		 * The meta object literal for the '<em><b>Used Operator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_ADAPTATION_OPERATOR__USED_OPERATOR = eINSTANCE.getUseAdaptationOperator_UsedOperator();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.PropertyAdaptationOperatorImpl <em>Property Adaptation Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.PropertyAdaptationOperatorImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getPropertyAdaptationOperator()
		 * @generated
		 */
		EClass PROPERTY_ADAPTATION_OPERATOR = eINSTANCE.getPropertyAdaptationOperator();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ADAPTATION_OPERATOR__TARGET = eINSTANCE.getPropertyAdaptationOperator_Target();

		/**
		 * The meta object literal for the '<em><b>Getter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ADAPTATION_OPERATOR__GETTER = eINSTANCE.getPropertyAdaptationOperator_Getter();

		/**
		 * The meta object literal for the '<em><b>Setter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ADAPTATION_OPERATOR__SETTER = eINSTANCE.getPropertyAdaptationOperator_Setter();

		/**
		 * The meta object literal for the '<em><b>Adder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ADAPTATION_OPERATOR__ADDER = eINSTANCE.getPropertyAdaptationOperator_Adder();

		/**
		 * The meta object literal for the '<em><b>Remover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ADAPTATION_OPERATOR__REMOVER = eINSTANCE.getPropertyAdaptationOperator_Remover();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UnresolvedAdaptationOperatorImpl <em>Unresolved Adaptation Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UnresolvedAdaptationOperatorImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedAdaptationOperator()
		 * @generated
		 */
		EClass UNRESOLVED_ADAPTATION_OPERATOR = eINSTANCE.getUnresolvedAdaptationOperator();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.AdaptationParameterImpl <em>Adaptation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.AdaptationParameterImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getAdaptationParameter()
		 * @generated
		 */
		EClass ADAPTATION_PARAMETER = eINSTANCE.getAdaptationParameter();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.OperationAdaptationOperatorImpl <em>Operation Adaptation Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.OperationAdaptationOperatorImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getOperationAdaptationOperator()
		 * @generated
		 */
		EClass OPERATION_ADAPTATION_OPERATOR = eINSTANCE.getOperationAdaptationOperator();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ADAPTATION_OPERATOR__BODY = eINSTANCE.getOperationAdaptationOperator_Body();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ADAPTATION_OPERATOR__TARGET = eINSTANCE.getOperationAdaptationOperator_Target();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UnresolvedMetamodelImpl <em>Unresolved Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UnresolvedMetamodelImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedMetamodel()
		 * @generated
		 */
		EClass UNRESOLVED_METAMODEL = eINSTANCE.getUnresolvedMetamodel();

		/**
		 * The meta object literal for the '<em><b>Owned Modeling Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNRESOLVED_METAMODEL__OWNED_MODELING_UNITS = eINSTANCE.getUnresolvedMetamodel_OwnedModelingUnits();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ModelElementTypeDefinitionImpl <em>Model Element Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ModelElementTypeDefinitionImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelElementTypeDefinition()
		 * @generated
		 */
		EClass MODEL_ELEMENT_TYPE_DEFINITION = eINSTANCE.getModelElementTypeDefinition();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.ConstraintLanguage <em>Constraint Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.ConstraintLanguage
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getConstraintLanguage()
		 * @generated
		 */
		EEnum CONSTRAINT_LANGUAGE = eINSTANCE.getConstraintLanguage();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.ConstraintType <em>Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.ConstraintType
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getConstraintType()
		 * @generated
		 */
		EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Unlimited Natural</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnlimitedNatural()
		 * @generated
		 */
		EDataType UNLIMITED_NATURAL = eINSTANCE.getUnlimitedNatural();

	}

} //StructurePackage
