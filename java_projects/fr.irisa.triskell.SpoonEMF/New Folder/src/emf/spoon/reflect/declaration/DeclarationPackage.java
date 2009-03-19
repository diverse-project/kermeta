package emf.spoon.reflect.declaration;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import emf.spoon.facade.FacadePackage;

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
 * @see emf.spoon.reflect.declaration.DeclarationFactory
 * @model kind="package"
 * @generated
 */
public interface DeclarationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "declaration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spoon#reflect.declaration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spoon.reflect.declaration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarationPackage eINSTANCE = emf.spoon.reflect.declaration.impl.DeclarationPackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtElementImpl <em>Ct Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtElementImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtElement()
	 * @generated
	 */
	int CT_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ELEMENT__ANNOTATIONS = FacadePackage.CT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ELEMENT__POSITION = FacadePackage.CT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ELEMENT__DOC_COMMENT = FacadePackage.CT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ELEMENT__PARENT = FacadePackage.CT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ct Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ELEMENT_FEATURE_COUNT = FacadePackage.CT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtAnnotationImpl <em>Ct Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtAnnotationImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtAnnotation()
	 * @generated
	 */
	int CT_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION__ANNOTATIONS = CT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION__POSITION = CT_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION__DOC_COMMENT = CT_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION__PARENT = CT_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Annotation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION__ANNOTATION_TYPE = CT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION__ACTUAL_ANNOTATION = CT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements Val</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION__ELEMENTS_VAL = CT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_FEATURE_COUNT = CT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtNamedElementImpl <em>Ct Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtNamedElementImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtNamedElement()
	 * @generated
	 */
	int CT_NAMED_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NAMED_ELEMENT__ANNOTATIONS = CT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NAMED_ELEMENT__POSITION = CT_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NAMED_ELEMENT__DOC_COMMENT = CT_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NAMED_ELEMENT__PARENT = CT_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NAMED_ELEMENT__MODIFIERS = CT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NAMED_ELEMENT__SIMPLE_NAME = CT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NAMED_ELEMENT__REFERENCE = CT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NAMED_ELEMENT_FEATURE_COUNT = CT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl <em>Ct Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtSimpleType()
	 * @generated
	 */
	int CT_SIMPLE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__ANNOTATIONS = CT_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__POSITION = CT_NAMED_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__DOC_COMMENT = CT_NAMED_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__PARENT = CT_NAMED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__MODIFIERS = CT_NAMED_ELEMENT__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__SIMPLE_NAME = CT_NAMED_ELEMENT__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__REFERENCE = CT_NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>INNERTTYPE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR = CT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__FIELDS = CT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__NESTED_TYPES = CT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__ACTUAL_CLASS = CT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__DECLARING_TYPE = CT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__ALL_FIELDS = CT_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__TOP_LEVEL = CT_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__PACKAGE = CT_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE__QUALIFIED_NAME = CT_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Ct Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE_FEATURE_COUNT = CT_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtAnnotationTypeImpl <em>Ct Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtAnnotationTypeImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtAnnotationType()
	 * @generated
	 */
	int CT_ANNOTATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__ANNOTATIONS = CT_SIMPLE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__POSITION = CT_SIMPLE_TYPE__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__DOC_COMMENT = CT_SIMPLE_TYPE__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__PARENT = CT_SIMPLE_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__MODIFIERS = CT_SIMPLE_TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__SIMPLE_NAME = CT_SIMPLE_TYPE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__REFERENCE = CT_SIMPLE_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>INNERTTYPE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__INNERTTYPE_SEPARATOR = CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__FIELDS = CT_SIMPLE_TYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__NESTED_TYPES = CT_SIMPLE_TYPE__NESTED_TYPES;

	/**
	 * The feature id for the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__ACTUAL_CLASS = CT_SIMPLE_TYPE__ACTUAL_CLASS;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__DECLARING_TYPE = CT_SIMPLE_TYPE__DECLARING_TYPE;

	/**
	 * The feature id for the '<em><b>All Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__ALL_FIELDS = CT_SIMPLE_TYPE__ALL_FIELDS;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__TOP_LEVEL = CT_SIMPLE_TYPE__TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__PACKAGE = CT_SIMPLE_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE__QUALIFIED_NAME = CT_SIMPLE_TYPE__QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Ct Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE_FEATURE_COUNT = CT_SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtAnonymousExecutableImpl <em>Ct Anonymous Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtAnonymousExecutableImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtAnonymousExecutable()
	 * @generated
	 */
	int CT_ANONYMOUS_EXECUTABLE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANONYMOUS_EXECUTABLE__ANNOTATIONS = CT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANONYMOUS_EXECUTABLE__POSITION = CT_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANONYMOUS_EXECUTABLE__DOC_COMMENT = CT_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANONYMOUS_EXECUTABLE__PARENT = CT_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANONYMOUS_EXECUTABLE__MODIFIERS = CT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANONYMOUS_EXECUTABLE__BODY = CT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANONYMOUS_EXECUTABLE__OWNER_CLASS = CT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Anonymous Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANONYMOUS_EXECUTABLE_FEATURE_COUNT = CT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtGenericElementImpl <em>Ct Generic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtGenericElementImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtGenericElement()
	 * @generated
	 */
	int CT_GENERIC_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_GENERIC_ELEMENT__ANNOTATIONS = CT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_GENERIC_ELEMENT__POSITION = CT_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_GENERIC_ELEMENT__DOC_COMMENT = CT_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_GENERIC_ELEMENT__PARENT = CT_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Formal Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_GENERIC_ELEMENT__FORMAL_TYPE_PARAMETERS = CT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_GENERIC_ELEMENT_FEATURE_COUNT = CT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtTypeImpl <em>Ct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtTypeImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtType()
	 * @generated
	 */
	int CT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__ANNOTATIONS = CT_GENERIC_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__POSITION = CT_GENERIC_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__DOC_COMMENT = CT_GENERIC_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__PARENT = CT_GENERIC_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Formal Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__FORMAL_TYPE_PARAMETERS = CT_GENERIC_ELEMENT__FORMAL_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__MODIFIERS = CT_GENERIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__SIMPLE_NAME = CT_GENERIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__REFERENCE = CT_GENERIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>INNERTTYPE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__INNERTTYPE_SEPARATOR = CT_GENERIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__FIELDS = CT_GENERIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__NESTED_TYPES = CT_GENERIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__ACTUAL_CLASS = CT_GENERIC_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__DECLARING_TYPE = CT_GENERIC_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>All Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__ALL_FIELDS = CT_GENERIC_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__TOP_LEVEL = CT_GENERIC_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__PACKAGE = CT_GENERIC_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__QUALIFIED_NAME = CT_GENERIC_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__METHODS = CT_GENERIC_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Superinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__SUPERINTERFACES = CT_GENERIC_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>All Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE__ALL_METHODS = CT_GENERIC_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Ct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_FEATURE_COUNT = CT_GENERIC_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtClassImpl <em>Ct Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtClassImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtClass()
	 * @generated
	 */
	int CT_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__ANNOTATIONS = CT_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__POSITION = CT_TYPE__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__DOC_COMMENT = CT_TYPE__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__PARENT = CT_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Formal Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__FORMAL_TYPE_PARAMETERS = CT_TYPE__FORMAL_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__MODIFIERS = CT_TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__SIMPLE_NAME = CT_TYPE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__REFERENCE = CT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>INNERTTYPE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__INNERTTYPE_SEPARATOR = CT_TYPE__INNERTTYPE_SEPARATOR;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__FIELDS = CT_TYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__NESTED_TYPES = CT_TYPE__NESTED_TYPES;

	/**
	 * The feature id for the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__ACTUAL_CLASS = CT_TYPE__ACTUAL_CLASS;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__DECLARING_TYPE = CT_TYPE__DECLARING_TYPE;

	/**
	 * The feature id for the '<em><b>All Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__ALL_FIELDS = CT_TYPE__ALL_FIELDS;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__TOP_LEVEL = CT_TYPE__TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__PACKAGE = CT_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__QUALIFIED_NAME = CT_TYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__METHODS = CT_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Superinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__SUPERINTERFACES = CT_TYPE__SUPERINTERFACES;

	/**
	 * The feature id for the '<em><b>All Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__ALL_METHODS = CT_TYPE__ALL_METHODS;

	/**
	 * The feature id for the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__SUPERCLASS = CT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anonymous Executables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__ANONYMOUS_EXECUTABLES = CT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS__CONSTRUCTORS = CT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS_FEATURE_COUNT = CT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtExecutableImpl <em>Ct Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtExecutableImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtExecutable()
	 * @generated
	 */
	int CT_EXECUTABLE = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__ANNOTATIONS = CT_GENERIC_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__POSITION = CT_GENERIC_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__DOC_COMMENT = CT_GENERIC_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__PARENT = CT_GENERIC_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Formal Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__FORMAL_TYPE_PARAMETERS = CT_GENERIC_ELEMENT__FORMAL_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__MODIFIERS = CT_GENERIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__SIMPLE_NAME = CT_GENERIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__REFERENCE = CT_GENERIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EXECUTABLE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__EXECUTABLE_SEPARATOR = CT_GENERIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__PARAMETERS = CT_GENERIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__BODY = CT_GENERIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thrown Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__THROWN_TYPES = CT_GENERIC_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE__DECLARING_TYPE = CT_GENERIC_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ct Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_FEATURE_COUNT = CT_GENERIC_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtConstructorImpl <em>Ct Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtConstructorImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtConstructor()
	 * @generated
	 */
	int CT_CONSTRUCTOR = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__ANNOTATIONS = CT_EXECUTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__POSITION = CT_EXECUTABLE__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__DOC_COMMENT = CT_EXECUTABLE__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__PARENT = CT_EXECUTABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Formal Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__FORMAL_TYPE_PARAMETERS = CT_EXECUTABLE__FORMAL_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__MODIFIERS = CT_EXECUTABLE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__SIMPLE_NAME = CT_EXECUTABLE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__REFERENCE = CT_EXECUTABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>EXECUTABLE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__EXECUTABLE_SEPARATOR = CT_EXECUTABLE__EXECUTABLE_SEPARATOR;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__PARAMETERS = CT_EXECUTABLE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__BODY = CT_EXECUTABLE__BODY;

	/**
	 * The feature id for the '<em><b>Thrown Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__THROWN_TYPES = CT_EXECUTABLE__THROWN_TYPES;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR__DECLARING_TYPE = CT_EXECUTABLE__DECLARING_TYPE;

	/**
	 * The number of structural features of the '<em>Ct Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR_FEATURE_COUNT = CT_EXECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtEnumImpl <em>Ct Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtEnumImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtEnum()
	 * @generated
	 */
	int CT_ENUM = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__ANNOTATIONS = CT_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__POSITION = CT_TYPE__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__DOC_COMMENT = CT_TYPE__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__PARENT = CT_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Formal Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__FORMAL_TYPE_PARAMETERS = CT_TYPE__FORMAL_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__MODIFIERS = CT_TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__SIMPLE_NAME = CT_TYPE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__REFERENCE = CT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>INNERTTYPE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__INNERTTYPE_SEPARATOR = CT_TYPE__INNERTTYPE_SEPARATOR;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__FIELDS = CT_TYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__NESTED_TYPES = CT_TYPE__NESTED_TYPES;

	/**
	 * The feature id for the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__ACTUAL_CLASS = CT_TYPE__ACTUAL_CLASS;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__DECLARING_TYPE = CT_TYPE__DECLARING_TYPE;

	/**
	 * The feature id for the '<em><b>All Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__ALL_FIELDS = CT_TYPE__ALL_FIELDS;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__TOP_LEVEL = CT_TYPE__TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__PACKAGE = CT_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__QUALIFIED_NAME = CT_TYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__METHODS = CT_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Superinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__SUPERINTERFACES = CT_TYPE__SUPERINTERFACES;

	/**
	 * The feature id for the '<em><b>All Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM__ALL_METHODS = CT_TYPE__ALL_METHODS;

	/**
	 * The number of structural features of the '<em>Ct Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM_FEATURE_COUNT = CT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtFieldImpl <em>Ct Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtFieldImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtField()
	 * @generated
	 */
	int CT_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__ANNOTATIONS = CT_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__POSITION = CT_NAMED_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__DOC_COMMENT = CT_NAMED_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__PARENT = CT_NAMED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__MODIFIERS = CT_NAMED_ELEMENT__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__SIMPLE_NAME = CT_NAMED_ELEMENT__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__REFERENCE = CT_NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__TYPE = CT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__DEFAULT_EXPRESSION = CT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>FIELD SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__FIELD_SEPARATOR = CT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD__DECLARING_TYPE = CT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ct Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_FEATURE_COUNT = CT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtInterfaceImpl <em>Ct Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtInterfaceImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtInterface()
	 * @generated
	 */
	int CT_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__ANNOTATIONS = CT_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__POSITION = CT_TYPE__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__DOC_COMMENT = CT_TYPE__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__PARENT = CT_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Formal Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__FORMAL_TYPE_PARAMETERS = CT_TYPE__FORMAL_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__MODIFIERS = CT_TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__SIMPLE_NAME = CT_TYPE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__REFERENCE = CT_TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>INNERTTYPE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__INNERTTYPE_SEPARATOR = CT_TYPE__INNERTTYPE_SEPARATOR;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__FIELDS = CT_TYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__NESTED_TYPES = CT_TYPE__NESTED_TYPES;

	/**
	 * The feature id for the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__ACTUAL_CLASS = CT_TYPE__ACTUAL_CLASS;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__DECLARING_TYPE = CT_TYPE__DECLARING_TYPE;

	/**
	 * The feature id for the '<em><b>All Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__ALL_FIELDS = CT_TYPE__ALL_FIELDS;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__TOP_LEVEL = CT_TYPE__TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__PACKAGE = CT_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__QUALIFIED_NAME = CT_TYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__METHODS = CT_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Superinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__SUPERINTERFACES = CT_TYPE__SUPERINTERFACES;

	/**
	 * The feature id for the '<em><b>All Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE__ALL_METHODS = CT_TYPE__ALL_METHODS;

	/**
	 * The number of structural features of the '<em>Ct Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE_FEATURE_COUNT = CT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtMethodImpl <em>Ct Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtMethodImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtMethod()
	 * @generated
	 */
	int CT_METHOD = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__ANNOTATIONS = CT_EXECUTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__POSITION = CT_EXECUTABLE__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__DOC_COMMENT = CT_EXECUTABLE__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__PARENT = CT_EXECUTABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Formal Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__FORMAL_TYPE_PARAMETERS = CT_EXECUTABLE__FORMAL_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__MODIFIERS = CT_EXECUTABLE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__SIMPLE_NAME = CT_EXECUTABLE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__REFERENCE = CT_EXECUTABLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>EXECUTABLE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__EXECUTABLE_SEPARATOR = CT_EXECUTABLE__EXECUTABLE_SEPARATOR;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__PARAMETERS = CT_EXECUTABLE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__BODY = CT_EXECUTABLE__BODY;

	/**
	 * The feature id for the '<em><b>Thrown Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__THROWN_TYPES = CT_EXECUTABLE__THROWN_TYPES;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__DECLARING_TYPE = CT_EXECUTABLE__DECLARING_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD__TYPE = CT_EXECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD_FEATURE_COUNT = CT_EXECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtModifiableImpl <em>Ct Modifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtModifiableImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtModifiable()
	 * @generated
	 */
	int CT_MODIFIABLE = 12;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_MODIFIABLE__MODIFIERS = FacadePackage.CT_MODIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Modifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_MODIFIABLE_FEATURE_COUNT = FacadePackage.CT_MODIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtPackageImpl <em>Ct Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtPackageImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtPackage()
	 * @generated
	 */
	int CT_PACKAGE = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__ANNOTATIONS = CT_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__POSITION = CT_NAMED_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__DOC_COMMENT = CT_NAMED_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__PARENT = CT_NAMED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__MODIFIERS = CT_NAMED_ELEMENT__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__SIMPLE_NAME = CT_NAMED_ELEMENT__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__REFERENCE = CT_NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>PACKAGE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__PACKAGE_SEPARATOR = CT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TOP LEVEL PACKAGE NAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__TOP_LEVEL_PACKAGE_NAME = CT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__PACKAGES = CT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__TYPES = CT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__QUALIFIED_NAME = CT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Declaring Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE__DECLARING_PACKAGE = CT_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ct Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE_FEATURE_COUNT = CT_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtParameterImpl <em>Ct Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtParameterImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtParameter()
	 * @generated
	 */
	int CT_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER__ANNOTATIONS = CT_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER__POSITION = CT_NAMED_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER__DOC_COMMENT = CT_NAMED_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER__PARENT = CT_NAMED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER__MODIFIERS = CT_NAMED_ELEMENT__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER__SIMPLE_NAME = CT_NAMED_ELEMENT__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER__REFERENCE = CT_NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER__TYPE = CT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER__DEFAULT_EXPRESSION = CT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER__VAR_ARGS = CT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER_FEATURE_COUNT = CT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtTypeParameterImpl <em>Ct Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtTypeParameterImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtTypeParameter()
	 * @generated
	 */
	int CT_TYPE_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER__ANNOTATIONS = CT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER__POSITION = CT_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER__DOC_COMMENT = CT_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER__PARENT = CT_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER__NAME = CT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER__BOUNDS = CT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_FEATURE_COUNT = CT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtTypedElementImpl <em>Ct Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtTypedElementImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtTypedElement()
	 * @generated
	 */
	int CT_TYPED_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPED_ELEMENT__TYPE = FacadePackage.CT_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPED_ELEMENT_FEATURE_COUNT = FacadePackage.CT_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtVariableImpl <em>Ct Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtVariableImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtVariable()
	 * @generated
	 */
	int CT_VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE__ANNOTATIONS = CT_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE__POSITION = CT_NAMED_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE__DOC_COMMENT = CT_NAMED_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE__PARENT = CT_NAMED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE__MODIFIERS = CT_NAMED_ELEMENT__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE__SIMPLE_NAME = CT_NAMED_ELEMENT__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE__REFERENCE = CT_NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE__TYPE = CT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE__DEFAULT_EXPRESSION = CT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_FEATURE_COUNT = CT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.SourcePositionImpl <em>Source Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.SourcePositionImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getSourcePosition()
	 * @generated
	 */
	int SOURCE_POSITION = 21;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_POSITION__LINE = FacadePackage.SOURCE_POSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_POSITION__COLUMN = FacadePackage.SOURCE_POSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_POSITION__FILE = FacadePackage.SOURCE_POSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_POSITION_FEATURE_COUNT = FacadePackage.SOURCE_POSITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.declaration.impl.CtAnnotationElementValueImpl <em>Ct Annotation Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.declaration.impl.CtAnnotationElementValueImpl
	 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtAnnotationElementValue()
	 * @generated
	 */
	int CT_ANNOTATION_ELEMENT_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_ELEMENT_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value String</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_ELEMENT_VALUE__VALUE_STRING = 1;

	/**
	 * The feature id for the '<em><b>Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_ELEMENT_VALUE__VALUE_REF = 2;

	/**
	 * The feature id for the '<em><b>Value Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_ELEMENT_VALUE__VALUE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_ELEMENT_VALUE__MANY = 4;

	/**
	 * The number of structural features of the '<em>Ct Annotation Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_ELEMENT_VALUE_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtAnnotation <em>Ct Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Annotation</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotation
	 * @generated
	 */
	EClass getCtAnnotation();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtAnnotation#getAnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotation Type</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotation#getAnnotationType()
	 * @see #getCtAnnotation()
	 * @generated
	 */
	EReference getCtAnnotation_AnnotationType();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtAnnotation#getActualAnnotation <em>Actual Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Annotation</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotation#getActualAnnotation()
	 * @see #getCtAnnotation()
	 * @generated
	 */
	EAttribute getCtAnnotation_ActualAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.spoon.reflect.declaration.CtAnnotation#getElementsVal <em>Elements Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements Val</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotation#getElementsVal()
	 * @see #getCtAnnotation()
	 * @generated
	 */
	EReference getCtAnnotation_ElementsVal();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtAnnotationType <em>Ct Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Annotation Type</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotationType
	 * @generated
	 */
	EClass getCtAnnotationType();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtAnonymousExecutable <em>Ct Anonymous Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Anonymous Executable</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnonymousExecutable
	 * @generated
	 */
	EClass getCtAnonymousExecutable();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtAnonymousExecutable#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnonymousExecutable#getBody()
	 * @see #getCtAnonymousExecutable()
	 * @generated
	 */
	EReference getCtAnonymousExecutable_Body();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtAnonymousExecutable#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Class</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnonymousExecutable#getOwnerClass()
	 * @see #getCtAnonymousExecutable()
	 * @generated
	 */
	EReference getCtAnonymousExecutable_OwnerClass();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtClass <em>Ct Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Class</em>'.
	 * @see emf.spoon.reflect.declaration.CtClass
	 * @generated
	 */
	EClass getCtClass();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtClass#getSuperclass <em>Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superclass</em>'.
	 * @see emf.spoon.reflect.declaration.CtClass#getSuperclass()
	 * @see #getCtClass()
	 * @generated
	 */
	EReference getCtClass_Superclass();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtClass#getAnonymousExecutables <em>Anonymous Executables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Anonymous Executables</em>'.
	 * @see emf.spoon.reflect.declaration.CtClass#getAnonymousExecutables()
	 * @see #getCtClass()
	 * @generated
	 */
	EReference getCtClass_AnonymousExecutables();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtClass#getConstructors <em>Constructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constructors</em>'.
	 * @see emf.spoon.reflect.declaration.CtClass#getConstructors()
	 * @see #getCtClass()
	 * @generated
	 */
	EReference getCtClass_Constructors();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtConstructor <em>Ct Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Constructor</em>'.
	 * @see emf.spoon.reflect.declaration.CtConstructor
	 * @generated
	 */
	EClass getCtConstructor();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtElement <em>Ct Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Element</em>'.
	 * @see emf.spoon.reflect.declaration.CtElement
	 * @generated
	 */
	EClass getCtElement();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see emf.spoon.reflect.declaration.CtElement#getAnnotations()
	 * @see #getCtElement()
	 * @generated
	 */
	EReference getCtElement_Annotations();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtElement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see emf.spoon.reflect.declaration.CtElement#getPosition()
	 * @see #getCtElement()
	 * @generated
	 */
	EReference getCtElement_Position();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtElement#getDocComment <em>Doc Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Comment</em>'.
	 * @see emf.spoon.reflect.declaration.CtElement#getDocComment()
	 * @see #getCtElement()
	 * @generated
	 */
	EAttribute getCtElement_DocComment();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see emf.spoon.reflect.declaration.CtElement#getParent()
	 * @see #getCtElement()
	 * @generated
	 */
	EReference getCtElement_Parent();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtEnum <em>Ct Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Enum</em>'.
	 * @see emf.spoon.reflect.declaration.CtEnum
	 * @generated
	 */
	EClass getCtEnum();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtExecutable <em>Ct Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Executable</em>'.
	 * @see emf.spoon.reflect.declaration.CtExecutable
	 * @generated
	 */
	EClass getCtExecutable();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtExecutable#getEXECUTABLE_SEPARATOR <em>EXECUTABLE SEPARATOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EXECUTABLE SEPARATOR</em>'.
	 * @see emf.spoon.reflect.declaration.CtExecutable#getEXECUTABLE_SEPARATOR()
	 * @see #getCtExecutable()
	 * @generated
	 */
	EAttribute getCtExecutable_EXECUTABLE_SEPARATOR();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtExecutable#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see emf.spoon.reflect.declaration.CtExecutable#getParameters()
	 * @see #getCtExecutable()
	 * @generated
	 */
	EReference getCtExecutable_Parameters();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtExecutable#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see emf.spoon.reflect.declaration.CtExecutable#getBody()
	 * @see #getCtExecutable()
	 * @generated
	 */
	EReference getCtExecutable_Body();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtExecutable#getThrownTypes <em>Thrown Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thrown Types</em>'.
	 * @see emf.spoon.reflect.declaration.CtExecutable#getThrownTypes()
	 * @see #getCtExecutable()
	 * @generated
	 */
	EReference getCtExecutable_ThrownTypes();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtExecutable#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Type</em>'.
	 * @see emf.spoon.reflect.declaration.CtExecutable#getDeclaringType()
	 * @see #getCtExecutable()
	 * @generated
	 */
	EReference getCtExecutable_DeclaringType();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtField <em>Ct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Field</em>'.
	 * @see emf.spoon.reflect.declaration.CtField
	 * @generated
	 */
	EClass getCtField();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtField#getFIELD_SEPARATOR <em>FIELD SEPARATOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FIELD SEPARATOR</em>'.
	 * @see emf.spoon.reflect.declaration.CtField#getFIELD_SEPARATOR()
	 * @see #getCtField()
	 * @generated
	 */
	EAttribute getCtField_FIELD_SEPARATOR();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtField#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Type</em>'.
	 * @see emf.spoon.reflect.declaration.CtField#getDeclaringType()
	 * @see #getCtField()
	 * @generated
	 */
	EReference getCtField_DeclaringType();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtGenericElement <em>Ct Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Generic Element</em>'.
	 * @see emf.spoon.reflect.declaration.CtGenericElement
	 * @generated
	 */
	EClass getCtGenericElement();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtGenericElement#getFormalTypeParameters <em>Formal Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formal Type Parameters</em>'.
	 * @see emf.spoon.reflect.declaration.CtGenericElement#getFormalTypeParameters()
	 * @see #getCtGenericElement()
	 * @generated
	 */
	EReference getCtGenericElement_FormalTypeParameters();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtInterface <em>Ct Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Interface</em>'.
	 * @see emf.spoon.reflect.declaration.CtInterface
	 * @generated
	 */
	EClass getCtInterface();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtMethod <em>Ct Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Method</em>'.
	 * @see emf.spoon.reflect.declaration.CtMethod
	 * @generated
	 */
	EClass getCtMethod();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtModifiable <em>Ct Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Modifiable</em>'.
	 * @see emf.spoon.reflect.declaration.CtModifiable
	 * @generated
	 */
	EClass getCtModifiable();

	/**
	 * Returns the meta object for the attribute list '{@link emf.spoon.reflect.declaration.CtModifiable#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see emf.spoon.reflect.declaration.CtModifiable#getModifiers()
	 * @see #getCtModifiable()
	 * @generated
	 */
	EAttribute getCtModifiable_Modifiers();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtNamedElement <em>Ct Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Named Element</em>'.
	 * @see emf.spoon.reflect.declaration.CtNamedElement
	 * @generated
	 */
	EClass getCtNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtNamedElement#getSimpleName <em>Simple Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Name</em>'.
	 * @see emf.spoon.reflect.declaration.CtNamedElement#getSimpleName()
	 * @see #getCtNamedElement()
	 * @generated
	 */
	EAttribute getCtNamedElement_SimpleName();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtNamedElement#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see emf.spoon.reflect.declaration.CtNamedElement#getReference()
	 * @see #getCtNamedElement()
	 * @generated
	 */
	EReference getCtNamedElement_Reference();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtPackage <em>Ct Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Package</em>'.
	 * @see emf.spoon.reflect.declaration.CtPackage
	 * @generated
	 */
	EClass getCtPackage();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtPackage#getPACKAGE_SEPARATOR <em>PACKAGE SEPARATOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PACKAGE SEPARATOR</em>'.
	 * @see emf.spoon.reflect.declaration.CtPackage#getPACKAGE_SEPARATOR()
	 * @see #getCtPackage()
	 * @generated
	 */
	EAttribute getCtPackage_PACKAGE_SEPARATOR();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtPackage#getTOP_LEVEL_PACKAGE_NAME <em>TOP LEVEL PACKAGE NAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TOP LEVEL PACKAGE NAME</em>'.
	 * @see emf.spoon.reflect.declaration.CtPackage#getTOP_LEVEL_PACKAGE_NAME()
	 * @see #getCtPackage()
	 * @generated
	 */
	EAttribute getCtPackage_TOP_LEVEL_PACKAGE_NAME();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Packages</em>'.
	 * @see emf.spoon.reflect.declaration.CtPackage#getPackages()
	 * @see #getCtPackage()
	 * @generated
	 */
	EReference getCtPackage_Packages();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtPackage#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see emf.spoon.reflect.declaration.CtPackage#getTypes()
	 * @see #getCtPackage()
	 * @generated
	 */
	EReference getCtPackage_Types();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtPackage#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see emf.spoon.reflect.declaration.CtPackage#getQualifiedName()
	 * @see #getCtPackage()
	 * @generated
	 */
	EAttribute getCtPackage_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtPackage#getDeclaringPackage <em>Declaring Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Package</em>'.
	 * @see emf.spoon.reflect.declaration.CtPackage#getDeclaringPackage()
	 * @see #getCtPackage()
	 * @generated
	 */
	EReference getCtPackage_DeclaringPackage();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtParameter <em>Ct Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Parameter</em>'.
	 * @see emf.spoon.reflect.declaration.CtParameter
	 * @generated
	 */
	EClass getCtParameter();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtParameter#getVarArgs <em>Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Args</em>'.
	 * @see emf.spoon.reflect.declaration.CtParameter#getVarArgs()
	 * @see #getCtParameter()
	 * @generated
	 */
	EAttribute getCtParameter_VarArgs();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtSimpleType <em>Ct Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Simple Type</em>'.
	 * @see emf.spoon.reflect.declaration.CtSimpleType
	 * @generated
	 */
	EClass getCtSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtSimpleType#getINNERTTYPE_SEPARATOR <em>INNERTTYPE SEPARATOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>INNERTTYPE SEPARATOR</em>'.
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getINNERTTYPE_SEPARATOR()
	 * @see #getCtSimpleType()
	 * @generated
	 */
	EAttribute getCtSimpleType_INNERTTYPE_SEPARATOR();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtSimpleType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getFields()
	 * @see #getCtSimpleType()
	 * @generated
	 */
	EReference getCtSimpleType_Fields();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtSimpleType#getNestedTypes <em>Nested Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nested Types</em>'.
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getNestedTypes()
	 * @see #getCtSimpleType()
	 * @generated
	 */
	EReference getCtSimpleType_NestedTypes();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtSimpleType#getActualClass <em>Actual Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Class</em>'.
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getActualClass()
	 * @see #getCtSimpleType()
	 * @generated
	 */
	EAttribute getCtSimpleType_ActualClass();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtSimpleType#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Type</em>'.
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getDeclaringType()
	 * @see #getCtSimpleType()
	 * @generated
	 */
	EReference getCtSimpleType_DeclaringType();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtSimpleType#getAllFields <em>All Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Fields</em>'.
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getAllFields()
	 * @see #getCtSimpleType()
	 * @generated
	 */
	EReference getCtSimpleType_AllFields();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtSimpleType#getTopLevel <em>Top Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Level</em>'.
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getTopLevel()
	 * @see #getCtSimpleType()
	 * @generated
	 */
	EAttribute getCtSimpleType_TopLevel();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtSimpleType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getPackage()
	 * @see #getCtSimpleType()
	 * @generated
	 */
	EReference getCtSimpleType_Package();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtSimpleType#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getQualifiedName()
	 * @see #getCtSimpleType()
	 * @generated
	 */
	EAttribute getCtSimpleType_QualifiedName();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtType <em>Ct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Type</em>'.
	 * @see emf.spoon.reflect.declaration.CtType
	 * @generated
	 */
	EClass getCtType();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtType#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Methods</em>'.
	 * @see emf.spoon.reflect.declaration.CtType#getMethods()
	 * @see #getCtType()
	 * @generated
	 */
	EReference getCtType_Methods();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtType#getSuperinterfaces <em>Superinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superinterfaces</em>'.
	 * @see emf.spoon.reflect.declaration.CtType#getSuperinterfaces()
	 * @see #getCtType()
	 * @generated
	 */
	EReference getCtType_Superinterfaces();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtType#getAllMethods <em>All Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Methods</em>'.
	 * @see emf.spoon.reflect.declaration.CtType#getAllMethods()
	 * @see #getCtType()
	 * @generated
	 */
	EReference getCtType_AllMethods();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtTypeParameter <em>Ct Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Type Parameter</em>'.
	 * @see emf.spoon.reflect.declaration.CtTypeParameter
	 * @generated
	 */
	EClass getCtTypeParameter();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtTypeParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emf.spoon.reflect.declaration.CtTypeParameter#getName()
	 * @see #getCtTypeParameter()
	 * @generated
	 */
	EAttribute getCtTypeParameter_Name();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtTypeParameter#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bounds</em>'.
	 * @see emf.spoon.reflect.declaration.CtTypeParameter#getBounds()
	 * @see #getCtTypeParameter()
	 * @generated
	 */
	EReference getCtTypeParameter_Bounds();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtTypedElement <em>Ct Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Typed Element</em>'.
	 * @see emf.spoon.reflect.declaration.CtTypedElement
	 * @generated
	 */
	EClass getCtTypedElement();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see emf.spoon.reflect.declaration.CtTypedElement#getType()
	 * @see #getCtTypedElement()
	 * @generated
	 */
	EReference getCtTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtVariable <em>Ct Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Variable</em>'.
	 * @see emf.spoon.reflect.declaration.CtVariable
	 * @generated
	 */
	EClass getCtVariable();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.declaration.CtVariable#getDefaultExpression <em>Default Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Expression</em>'.
	 * @see emf.spoon.reflect.declaration.CtVariable#getDefaultExpression()
	 * @see #getCtVariable()
	 * @generated
	 */
	EReference getCtVariable_DefaultExpression();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.SourcePosition <em>Source Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Position</em>'.
	 * @see emf.spoon.reflect.declaration.SourcePosition
	 * @generated
	 */
	EClass getSourcePosition();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.SourcePosition#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see emf.spoon.reflect.declaration.SourcePosition#getLine()
	 * @see #getSourcePosition()
	 * @generated
	 */
	EAttribute getSourcePosition_Line();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.SourcePosition#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see emf.spoon.reflect.declaration.SourcePosition#getColumn()
	 * @see #getSourcePosition()
	 * @generated
	 */
	EAttribute getSourcePosition_Column();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.SourcePosition#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see emf.spoon.reflect.declaration.SourcePosition#getFile()
	 * @see #getSourcePosition()
	 * @generated
	 */
	EAttribute getSourcePosition_File();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.declaration.CtAnnotationElementValue <em>Ct Annotation Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Annotation Element Value</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotationElementValue
	 * @generated
	 */
	EClass getCtAnnotationElementValue();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotationElementValue#getKey()
	 * @see #getCtAnnotationElementValue()
	 * @generated
	 */
	EAttribute getCtAnnotationElementValue_Key();

	/**
	 * Returns the meta object for the attribute list '{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value String</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotationElementValue#getValueString()
	 * @see #getCtAnnotationElementValue()
	 * @generated
	 */
	EAttribute getCtAnnotationElementValue_ValueString();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getValueRef <em>Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Ref</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotationElementValue#getValueRef()
	 * @see #getCtAnnotationElementValue()
	 * @generated
	 */
	EReference getCtAnnotationElementValue_ValueRef();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getValueElement <em>Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Element</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotationElementValue#getValueElement()
	 * @see #getCtAnnotationElementValue()
	 * @generated
	 */
	EReference getCtAnnotationElementValue_ValueElement();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see emf.spoon.reflect.declaration.CtAnnotationElementValue#getMany()
	 * @see #getCtAnnotationElementValue()
	 * @generated
	 */
	EAttribute getCtAnnotationElementValue_Many();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeclarationFactory getDeclarationFactory();

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
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtAnnotationImpl <em>Ct Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtAnnotationImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtAnnotation()
		 * @generated
		 */
		EClass CT_ANNOTATION = eINSTANCE.getCtAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotation Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ANNOTATION__ANNOTATION_TYPE = eINSTANCE.getCtAnnotation_AnnotationType();

		/**
		 * The meta object literal for the '<em><b>Actual Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_ANNOTATION__ACTUAL_ANNOTATION = eINSTANCE.getCtAnnotation_ActualAnnotation();

		/**
		 * The meta object literal for the '<em><b>Elements Val</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ANNOTATION__ELEMENTS_VAL = eINSTANCE.getCtAnnotation_ElementsVal();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtAnnotationTypeImpl <em>Ct Annotation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtAnnotationTypeImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtAnnotationType()
		 * @generated
		 */
		EClass CT_ANNOTATION_TYPE = eINSTANCE.getCtAnnotationType();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtAnonymousExecutableImpl <em>Ct Anonymous Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtAnonymousExecutableImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtAnonymousExecutable()
		 * @generated
		 */
		EClass CT_ANONYMOUS_EXECUTABLE = eINSTANCE.getCtAnonymousExecutable();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ANONYMOUS_EXECUTABLE__BODY = eINSTANCE.getCtAnonymousExecutable_Body();

		/**
		 * The meta object literal for the '<em><b>Owner Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ANONYMOUS_EXECUTABLE__OWNER_CLASS = eINSTANCE.getCtAnonymousExecutable_OwnerClass();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtClassImpl <em>Ct Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtClassImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtClass()
		 * @generated
		 */
		EClass CT_CLASS = eINSTANCE.getCtClass();

		/**
		 * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CLASS__SUPERCLASS = eINSTANCE.getCtClass_Superclass();

		/**
		 * The meta object literal for the '<em><b>Anonymous Executables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CLASS__ANONYMOUS_EXECUTABLES = eINSTANCE.getCtClass_AnonymousExecutables();

		/**
		 * The meta object literal for the '<em><b>Constructors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CLASS__CONSTRUCTORS = eINSTANCE.getCtClass_Constructors();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtConstructorImpl <em>Ct Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtConstructorImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtConstructor()
		 * @generated
		 */
		EClass CT_CONSTRUCTOR = eINSTANCE.getCtConstructor();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtElementImpl <em>Ct Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtElementImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtElement()
		 * @generated
		 */
		EClass CT_ELEMENT = eINSTANCE.getCtElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ELEMENT__ANNOTATIONS = eINSTANCE.getCtElement_Annotations();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ELEMENT__POSITION = eINSTANCE.getCtElement_Position();

		/**
		 * The meta object literal for the '<em><b>Doc Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_ELEMENT__DOC_COMMENT = eINSTANCE.getCtElement_DocComment();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ELEMENT__PARENT = eINSTANCE.getCtElement_Parent();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtEnumImpl <em>Ct Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtEnumImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtEnum()
		 * @generated
		 */
		EClass CT_ENUM = eINSTANCE.getCtEnum();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtExecutableImpl <em>Ct Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtExecutableImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtExecutable()
		 * @generated
		 */
		EClass CT_EXECUTABLE = eINSTANCE.getCtExecutable();

		/**
		 * The meta object literal for the '<em><b>EXECUTABLE SEPARATOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_EXECUTABLE__EXECUTABLE_SEPARATOR = eINSTANCE.getCtExecutable_EXECUTABLE_SEPARATOR();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_EXECUTABLE__PARAMETERS = eINSTANCE.getCtExecutable_Parameters();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_EXECUTABLE__BODY = eINSTANCE.getCtExecutable_Body();

		/**
		 * The meta object literal for the '<em><b>Thrown Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_EXECUTABLE__THROWN_TYPES = eINSTANCE.getCtExecutable_ThrownTypes();

		/**
		 * The meta object literal for the '<em><b>Declaring Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_EXECUTABLE__DECLARING_TYPE = eINSTANCE.getCtExecutable_DeclaringType();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtFieldImpl <em>Ct Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtFieldImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtField()
		 * @generated
		 */
		EClass CT_FIELD = eINSTANCE.getCtField();

		/**
		 * The meta object literal for the '<em><b>FIELD SEPARATOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_FIELD__FIELD_SEPARATOR = eINSTANCE.getCtField_FIELD_SEPARATOR();

		/**
		 * The meta object literal for the '<em><b>Declaring Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_FIELD__DECLARING_TYPE = eINSTANCE.getCtField_DeclaringType();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtGenericElementImpl <em>Ct Generic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtGenericElementImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtGenericElement()
		 * @generated
		 */
		EClass CT_GENERIC_ELEMENT = eINSTANCE.getCtGenericElement();

		/**
		 * The meta object literal for the '<em><b>Formal Type Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_GENERIC_ELEMENT__FORMAL_TYPE_PARAMETERS = eINSTANCE.getCtGenericElement_FormalTypeParameters();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtInterfaceImpl <em>Ct Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtInterfaceImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtInterface()
		 * @generated
		 */
		EClass CT_INTERFACE = eINSTANCE.getCtInterface();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtMethodImpl <em>Ct Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtMethodImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtMethod()
		 * @generated
		 */
		EClass CT_METHOD = eINSTANCE.getCtMethod();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtModifiableImpl <em>Ct Modifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtModifiableImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtModifiable()
		 * @generated
		 */
		EClass CT_MODIFIABLE = eINSTANCE.getCtModifiable();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_MODIFIABLE__MODIFIERS = eINSTANCE.getCtModifiable_Modifiers();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtNamedElementImpl <em>Ct Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtNamedElementImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtNamedElement()
		 * @generated
		 */
		EClass CT_NAMED_ELEMENT = eINSTANCE.getCtNamedElement();

		/**
		 * The meta object literal for the '<em><b>Simple Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_NAMED_ELEMENT__SIMPLE_NAME = eINSTANCE.getCtNamedElement_SimpleName();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_NAMED_ELEMENT__REFERENCE = eINSTANCE.getCtNamedElement_Reference();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtPackageImpl <em>Ct Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtPackageImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtPackage()
		 * @generated
		 */
		EClass CT_PACKAGE = eINSTANCE.getCtPackage();

		/**
		 * The meta object literal for the '<em><b>PACKAGE SEPARATOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_PACKAGE__PACKAGE_SEPARATOR = eINSTANCE.getCtPackage_PACKAGE_SEPARATOR();

		/**
		 * The meta object literal for the '<em><b>TOP LEVEL PACKAGE NAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_PACKAGE__TOP_LEVEL_PACKAGE_NAME = eINSTANCE.getCtPackage_TOP_LEVEL_PACKAGE_NAME();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_PACKAGE__PACKAGES = eINSTANCE.getCtPackage_Packages();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_PACKAGE__TYPES = eINSTANCE.getCtPackage_Types();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_PACKAGE__QUALIFIED_NAME = eINSTANCE.getCtPackage_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Declaring Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_PACKAGE__DECLARING_PACKAGE = eINSTANCE.getCtPackage_DeclaringPackage();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtParameterImpl <em>Ct Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtParameterImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtParameter()
		 * @generated
		 */
		EClass CT_PARAMETER = eINSTANCE.getCtParameter();

		/**
		 * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_PARAMETER__VAR_ARGS = eINSTANCE.getCtParameter_VarArgs();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl <em>Ct Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtSimpleType()
		 * @generated
		 */
		EClass CT_SIMPLE_TYPE = eINSTANCE.getCtSimpleType();

		/**
		 * The meta object literal for the '<em><b>INNERTTYPE SEPARATOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR = eINSTANCE.getCtSimpleType_INNERTTYPE_SEPARATOR();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_SIMPLE_TYPE__FIELDS = eINSTANCE.getCtSimpleType_Fields();

		/**
		 * The meta object literal for the '<em><b>Nested Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_SIMPLE_TYPE__NESTED_TYPES = eINSTANCE.getCtSimpleType_NestedTypes();

		/**
		 * The meta object literal for the '<em><b>Actual Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_SIMPLE_TYPE__ACTUAL_CLASS = eINSTANCE.getCtSimpleType_ActualClass();

		/**
		 * The meta object literal for the '<em><b>Declaring Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_SIMPLE_TYPE__DECLARING_TYPE = eINSTANCE.getCtSimpleType_DeclaringType();

		/**
		 * The meta object literal for the '<em><b>All Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_SIMPLE_TYPE__ALL_FIELDS = eINSTANCE.getCtSimpleType_AllFields();

		/**
		 * The meta object literal for the '<em><b>Top Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_SIMPLE_TYPE__TOP_LEVEL = eINSTANCE.getCtSimpleType_TopLevel();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_SIMPLE_TYPE__PACKAGE = eINSTANCE.getCtSimpleType_Package();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_SIMPLE_TYPE__QUALIFIED_NAME = eINSTANCE.getCtSimpleType_QualifiedName();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtTypeImpl <em>Ct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtTypeImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtType()
		 * @generated
		 */
		EClass CT_TYPE = eINSTANCE.getCtType();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TYPE__METHODS = eINSTANCE.getCtType_Methods();

		/**
		 * The meta object literal for the '<em><b>Superinterfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TYPE__SUPERINTERFACES = eINSTANCE.getCtType_Superinterfaces();

		/**
		 * The meta object literal for the '<em><b>All Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TYPE__ALL_METHODS = eINSTANCE.getCtType_AllMethods();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtTypeParameterImpl <em>Ct Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtTypeParameterImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtTypeParameter()
		 * @generated
		 */
		EClass CT_TYPE_PARAMETER = eINSTANCE.getCtTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_TYPE_PARAMETER__NAME = eINSTANCE.getCtTypeParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TYPE_PARAMETER__BOUNDS = eINSTANCE.getCtTypeParameter_Bounds();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtTypedElementImpl <em>Ct Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtTypedElementImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtTypedElement()
		 * @generated
		 */
		EClass CT_TYPED_ELEMENT = eINSTANCE.getCtTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TYPED_ELEMENT__TYPE = eINSTANCE.getCtTypedElement_Type();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtVariableImpl <em>Ct Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtVariableImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtVariable()
		 * @generated
		 */
		EClass CT_VARIABLE = eINSTANCE.getCtVariable();

		/**
		 * The meta object literal for the '<em><b>Default Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_VARIABLE__DEFAULT_EXPRESSION = eINSTANCE.getCtVariable_DefaultExpression();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.SourcePositionImpl <em>Source Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.SourcePositionImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getSourcePosition()
		 * @generated
		 */
		EClass SOURCE_POSITION = eINSTANCE.getSourcePosition();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_POSITION__LINE = eINSTANCE.getSourcePosition_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_POSITION__COLUMN = eINSTANCE.getSourcePosition_Column();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_POSITION__FILE = eINSTANCE.getSourcePosition_File();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.declaration.impl.CtAnnotationElementValueImpl <em>Ct Annotation Element Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.declaration.impl.CtAnnotationElementValueImpl
		 * @see emf.spoon.reflect.declaration.impl.DeclarationPackageImpl#getCtAnnotationElementValue()
		 * @generated
		 */
		EClass CT_ANNOTATION_ELEMENT_VALUE = eINSTANCE.getCtAnnotationElementValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_ANNOTATION_ELEMENT_VALUE__KEY = eINSTANCE.getCtAnnotationElementValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value String</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_ANNOTATION_ELEMENT_VALUE__VALUE_STRING = eINSTANCE.getCtAnnotationElementValue_ValueString();

		/**
		 * The meta object literal for the '<em><b>Value Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ANNOTATION_ELEMENT_VALUE__VALUE_REF = eINSTANCE.getCtAnnotationElementValue_ValueRef();

		/**
		 * The meta object literal for the '<em><b>Value Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ANNOTATION_ELEMENT_VALUE__VALUE_ELEMENT = eINSTANCE.getCtAnnotationElementValue_ValueElement();
 
		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_ANNOTATION_ELEMENT_VALUE__MANY = eINSTANCE.getCtAnnotationElementValue_Many();

	}

} //DeclarationPackage
