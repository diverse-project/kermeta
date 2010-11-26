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
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ObjectImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 0;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__KTAG = 0;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__KOWNED_TAGS = 1;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__KTYPE = 2;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 3;

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
	int TYPE_CONTAINER__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER__KTYPE = OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER__CONTAINED_TYPE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ABSTRACT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RAISED_EXCEPTION = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_PARAMETER = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__POST = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Super Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SUPER_OPERATION = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Unresolved Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_UNRESOLVED_OPERATIONS = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNING_CLASS = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE_PARAMETER = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 10;

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
	int TYPE__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__KTYPE = OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE_CONTAINER = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

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
	int NAMED_ELEMENT__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__KTYPE = OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__IS_ASPECT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__SUPER_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__TYPE_MAPPINGS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_ASPECT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUPER_TYPE = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPE_MAPPINGS = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_ASPECT = DATA_TYPE__IS_ASPECT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SUPER_TYPE = DATA_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Type Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TYPE_MAPPINGS = DATA_TYPE__TYPE_MAPPINGS;

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
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__IS_ASPECT = DATA_TYPE__IS_ASPECT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__SUPER_TYPE = DATA_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Type Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE_MAPPINGS = DATA_TYPE__TYPE_MAPPINGS;

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
	int TAG__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__KTYPE = OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__OBJECT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

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
	int ABSTRACT_PROPERTY__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__KTYPE = OBJECT__KTYPE;

	/**
	 * The number of structural features of the '<em>Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

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
	int GENERIC_TYPE_DEFINITION__KTAG = TYPE_DEFINITION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__KOWNED_TAGS = TYPE_DEFINITION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__KTYPE = TYPE_DEFINITION__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__CONTAINED_TYPE = TYPE_DEFINITION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__IS_ASPECT = TYPE_DEFINITION__IS_ASPECT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__SUPER_TYPE = TYPE_DEFINITION__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Type Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__TYPE_MAPPINGS = TYPE_DEFINITION__TYPE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION__TYPE_PARAMETER = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__IS_ASPECT = GENERIC_TYPE_DEFINITION__IS_ASPECT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__SUPER_TYPE = GENERIC_TYPE_DEFINITION__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Type Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__TYPE_MAPPINGS = GENERIC_TYPE_DEFINITION__TYPE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
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
	 * The number of structural features of the '<em>Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_FEATURE_COUNT = GENERIC_TYPE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.TypeDefinitionContainerImpl <em>Type Definition Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.TypeDefinitionContainerImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeDefinitionContainer()
	 * @generated
	 */
	int TYPE_DEFINITION_CONTAINER = 22;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_CONTAINER__KTAG = NAMED_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_CONTAINER__KOWNED_TAGS = NAMED_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_CONTAINER__KTYPE = NAMED_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Definition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	int MODELING_UNIT__KTAG = TYPE_DEFINITION_CONTAINER__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__KOWNED_TAGS = TYPE_DEFINITION_CONTAINER__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__KTYPE = TYPE_DEFINITION_CONTAINER__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__NAME = TYPE_DEFINITION_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__OWNED_TYPE_DEFINITION = TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__PACKAGES = TYPE_DEFINITION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__NAMESPACE_PREFIX = TYPE_DEFINITION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT__REQUIRES = TYPE_DEFINITION_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Modeling Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT_FEATURE_COUNT = TYPE_DEFINITION_CONTAINER_FEATURE_COUNT + 3;

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
	int REQUIRE__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__KTYPE = OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__URI = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Require</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ModelTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 28;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CONTAINED_TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__IS_ASPECT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__SUPER_TYPE = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__TYPE_MAPPINGS = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CONTENTS = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ModelTypeVariableImpl <em>Model Type Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ModelTypeVariableImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelTypeVariable()
	 * @generated
	 */
	int MODEL_TYPE_VARIABLE = 29;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_VARIABLE__KTAG = TYPE_VARIABLE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_VARIABLE__KOWNED_TAGS = TYPE_VARIABLE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_VARIABLE__KTYPE = TYPE_VARIABLE__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_VARIABLE__CONTAINED_TYPE = TYPE_VARIABLE__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Type Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_VARIABLE__TYPE_CONTAINER = TYPE_VARIABLE__TYPE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_VARIABLE__NAME = TYPE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_VARIABLE__SUPERTYPE = TYPE_VARIABLE__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Virtual Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_VARIABLE__VIRTUAL_TYPE = TYPE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Type Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_VARIABLE_FEATURE_COUNT = TYPE_VARIABLE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Model Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TYPE__MODEL_TYPE = OBJECT_TYPE_VARIABLE_FEATURE_COUNT + 1;

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
	int MODEL__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__KTYPE = OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTENTS = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ResourceImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 32;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__KTYPE = OBJECT__KTYPE;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ResourceGroupImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getResourceGroup()
	 * @generated
	 */
	int RESOURCE_GROUP = 33;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__KTAG = RESOURCE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__KOWNED_TAGS = RESOURCE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__KTYPE = RESOURCE__KTYPE;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__RESOURCES = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.SimpleResourceImpl <em>Simple Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.SimpleResourceImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getSimpleResource()
	 * @generated
	 */
	int SIMPLE_RESOURCE = 34;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOURCE__KTAG = RESOURCE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOURCE__KOWNED_TAGS = RESOURCE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOURCE__KTYPE = RESOURCE__KTYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOURCE__URI = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOURCE__CONTENTS = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.AbstractOperationImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getAbstractOperation()
	 * @generated
	 */
	int ABSTRACT_OPERATION = 35;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION__KTYPE = OBJECT__KTYPE;

	/**
	 * The number of structural features of the '<em>Abstract Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedTypeImpl <em>Unresolved Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedType()
	 * @generated
	 */
	int UNRESOLVED_TYPE = 36;

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
	 * The feature id for the '<em><b>Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__TYPE_IDENTIFIER = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__USINGS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__GENERICS = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unresolved Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedImpl <em>Unresolved</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolved()
	 * @generated
	 */
	int UNRESOLVED = 37;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED__KTYPE = OBJECT__KTYPE;

	/**
	 * The number of structural features of the '<em>Unresolved</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UnresolvedPropertyImpl <em>Unresolved Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UnresolvedPropertyImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolvedProperty()
	 * @generated
	 */
	int UNRESOLVED_PROPERTY = 38;

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
	int UNRESOLVED_OPERATION = 39;

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
	 * The feature id for the '<em><b>Operation Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_OPERATION__OPERATION_IDENTIFIER = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unresolved Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_OPERATION_FEATURE_COUNT = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.UsingImpl <em>Using</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.UsingImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUsing()
	 * @generated
	 */
	int USING = 40;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__KTYPE = OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>From QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__FROM_QNAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__TO_NAME = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Using</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.ProductTypeImpl <em>Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.ProductTypeImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getProductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 41;

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
	int FUNCTION_TYPE = 42;

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
	int VOID_TYPE = 43;

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
	 * The meta object id for the '{@link org.kermeta.language.structure.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.TypeMappingImpl
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeMapping()
	 * @generated
	 */
	int TYPE_MAPPING = 44;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__KTAG = OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__KOWNED_TAGS = OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__KTYPE = OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__MAPPING = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__TARGET_TYPE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__SOURCE_TYPE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.ConstraintLanguage <em>Constraint Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.ConstraintLanguage
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getConstraintLanguage()
	 * @generated
	 */
	int CONSTRAINT_LANGUAGE = 45;

	/**
	 * The meta object id for the '{@link org.kermeta.language.structure.ConstraintType <em>Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.ConstraintType
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getConstraintType()
	 * @generated
	 */
	int CONSTRAINT_TYPE = 46;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getString()
	 * @generated
	 */
	int STRING = 47;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 48;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 49;

	/**
	 * The meta object id for the '<em>Unlimited Natural</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnlimitedNatural()
	 * @generated
	 */
	int UNLIMITED_NATURAL = 50;


	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.kermeta.language.structure.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.Object#getKTag <em>KTag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>KTag</em>'.
	 * @see org.kermeta.language.structure.Object#getKTag()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_KTag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.Object#getKOwnedTags <em>KOwned Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>KOwned Tags</em>'.
	 * @see org.kermeta.language.structure.Object#getKOwnedTags()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_KOwnedTags();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.Object#getKType <em>KType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>KType</em>'.
	 * @see org.kermeta.language.structure.Object#getKType()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_KType();

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
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.TypeDefinition#getTypeMappings <em>Type Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Mappings</em>'.
	 * @see org.kermeta.language.structure.TypeDefinition#getTypeMappings()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_TypeMappings();

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
	 * Returns the meta object for class '{@link org.kermeta.language.structure.TypeDefinitionContainer <em>Type Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition Container</em>'.
	 * @see org.kermeta.language.structure.TypeDefinitionContainer
	 * @generated
	 */
	EClass getTypeDefinitionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.TypeDefinitionContainer#getOwnedTypeDefinition <em>Owned Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Type Definition</em>'.
	 * @see org.kermeta.language.structure.TypeDefinitionContainer#getOwnedTypeDefinition()
	 * @see #getTypeDefinitionContainer()
	 * @generated
	 */
	EReference getTypeDefinitionContainer_OwnedTypeDefinition();

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
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.GenericTypeDefinition#getTypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameter</em>'.
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
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see org.kermeta.language.structure.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ModelTypeVariable <em>Model Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type Variable</em>'.
	 * @see org.kermeta.language.structure.ModelTypeVariable
	 * @generated
	 */
	EClass getModelTypeVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.ModelTypeVariable#getVirtualType <em>Virtual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Type</em>'.
	 * @see org.kermeta.language.structure.ModelTypeVariable#getVirtualType()
	 * @see #getModelTypeVariable()
	 * @generated
	 */
	EReference getModelTypeVariable_VirtualType();

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
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.VirtualType#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Type</em>'.
	 * @see org.kermeta.language.structure.VirtualType#getModelType()
	 * @see #getVirtualType()
	 * @generated
	 */
	EReference getVirtualType_ModelType();

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
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.kermeta.language.structure.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.ResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Group</em>'.
	 * @see org.kermeta.language.structure.ResourceGroup
	 * @generated
	 */
	EClass getResourceGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.ResourceGroup#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.kermeta.language.structure.ResourceGroup#getResources()
	 * @see #getResourceGroup()
	 * @generated
	 */
	EReference getResourceGroup_Resources();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.SimpleResource <em>Simple Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Resource</em>'.
	 * @see org.kermeta.language.structure.SimpleResource
	 * @generated
	 */
	EClass getSimpleResource();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.structure.SimpleResource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.kermeta.language.structure.SimpleResource#getUri()
	 * @see #getSimpleResource()
	 * @generated
	 */
	EAttribute getSimpleResource_Uri();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.structure.SimpleResource#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contents</em>'.
	 * @see org.kermeta.language.structure.SimpleResource#getContents()
	 * @see #getSimpleResource()
	 * @generated
	 */
	EReference getSimpleResource_Contents();

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
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.structure.UnresolvedType#getGenerics <em>Generics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generics</em>'.
	 * @see org.kermeta.language.structure.UnresolvedType#getGenerics()
	 * @see #getUnresolvedType()
	 * @generated
	 */
	EReference getUnresolvedType_Generics();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.structure.Unresolved <em>Unresolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved</em>'.
	 * @see org.kermeta.language.structure.Unresolved
	 * @generated
	 */
	EClass getUnresolved();

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
	 * Returns the meta object for class '{@link org.kermeta.language.structure.TypeMapping <em>Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Mapping</em>'.
	 * @see org.kermeta.language.structure.TypeMapping
	 * @generated
	 */
	EClass getTypeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.structure.TypeMapping#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see org.kermeta.language.structure.TypeMapping#getMapping()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EReference getTypeMapping_Mapping();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.structure.TypeMapping#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see org.kermeta.language.structure.TypeMapping#getTargetType()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EReference getTypeMapping_TargetType();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.language.structure.TypeMapping#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Type</em>'.
	 * @see org.kermeta.language.structure.TypeMapping#getSourceType()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EReference getTypeMapping_SourceType();

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
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ObjectImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>KTag</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__KTAG = eINSTANCE.getObject_KTag();

		/**
		 * The meta object literal for the '<em><b>KOwned Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__KOWNED_TAGS = eINSTANCE.getObject_KOwnedTags();

		/**
		 * The meta object literal for the '<em><b>KType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__KTYPE = eINSTANCE.getObject_KType();

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
		 * The meta object literal for the '<em><b>Type Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__TYPE_MAPPINGS = eINSTANCE.getTypeDefinition_TypeMappings();

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
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.TypeDefinitionContainerImpl <em>Type Definition Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.TypeDefinitionContainerImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeDefinitionContainer()
		 * @generated
		 */
		EClass TYPE_DEFINITION_CONTAINER = eINSTANCE.getTypeDefinitionContainer();

		/**
		 * The meta object literal for the '<em><b>Owned Type Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION = eINSTANCE.getTypeDefinitionContainer_OwnedTypeDefinition();

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
		 * The meta object literal for the '<em><b>Type Parameter</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ModelTypeImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ModelTypeVariableImpl <em>Model Type Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ModelTypeVariableImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getModelTypeVariable()
		 * @generated
		 */
		EClass MODEL_TYPE_VARIABLE = eINSTANCE.getModelTypeVariable();

		/**
		 * The meta object literal for the '<em><b>Virtual Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE_VARIABLE__VIRTUAL_TYPE = eINSTANCE.getModelTypeVariable_VirtualType();

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
		 * The meta object literal for the '<em><b>Model Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_TYPE__MODEL_TYPE = eINSTANCE.getVirtualType_ModelType();

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
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ResourceImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.ResourceGroupImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getResourceGroup()
		 * @generated
		 */
		EClass RESOURCE_GROUP = eINSTANCE.getResourceGroup();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_GROUP__RESOURCES = eINSTANCE.getResourceGroup_Resources();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.SimpleResourceImpl <em>Simple Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.SimpleResourceImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getSimpleResource()
		 * @generated
		 */
		EClass SIMPLE_RESOURCE = eINSTANCE.getSimpleResource();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_RESOURCE__URI = eINSTANCE.getSimpleResource_Uri();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_RESOURCE__CONTENTS = eINSTANCE.getSimpleResource_Contents();

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
		 * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNRESOLVED_TYPE__USINGS = eINSTANCE.getUnresolvedType_Usings();

		/**
		 * The meta object literal for the '<em><b>Generics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNRESOLVED_TYPE__GENERICS = eINSTANCE.getUnresolvedType_Generics();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.UnresolvedImpl <em>Unresolved</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.UnresolvedImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getUnresolved()
		 * @generated
		 */
		EClass UNRESOLVED = eINSTANCE.getUnresolved();

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
		 * The meta object literal for the '{@link org.kermeta.language.structure.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.structure.impl.TypeMappingImpl
		 * @see org.kermeta.language.structure.impl.StructurePackageImpl#getTypeMapping()
		 * @generated
		 */
		EClass TYPE_MAPPING = eINSTANCE.getTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING__MAPPING = eINSTANCE.getTypeMapping_Mapping();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING__TARGET_TYPE = eINSTANCE.getTypeMapping_TargetType();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING__SOURCE_TYPE = eINSTANCE.getTypeMapping_SourceType();

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
