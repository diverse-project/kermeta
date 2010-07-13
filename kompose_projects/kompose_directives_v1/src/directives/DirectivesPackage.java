/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package directives;

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
 * @see directives.DirectivesFactory
 * @model kind="package"
 * @generated
 */
public interface DirectivesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "directives";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://directives/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "directives";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DirectivesPackage eINSTANCE = directives.impl.DirectivesPackageImpl.init();

	/**
	 * The meta object id for the '{@link directives.impl.CompositionDirectiveImpl <em>Composition Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.CompositionDirectiveImpl
	 * @see directives.impl.DirectivesPackageImpl#getCompositionDirective()
	 * @generated
	 */
	int COMPOSITION_DIRECTIVE = 0;

	/**
	 * The number of structural features of the '<em>Composition Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_DIRECTIVE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link directives.impl.ElementDirectiveImpl <em>Element Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.ElementDirectiveImpl
	 * @see directives.impl.DirectivesPackageImpl#getElementDirective()
	 * @generated
	 */
	int ELEMENT_DIRECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DIRECTIVE__TARGET = COMPOSITION_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DIRECTIVE_FEATURE_COUNT = COMPOSITION_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link directives.impl.UnaryDirectiveImpl <em>Unary Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.UnaryDirectiveImpl
	 * @see directives.impl.DirectivesPackageImpl#getUnaryDirective()
	 * @generated
	 */
	int UNARY_DIRECTIVE = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DIRECTIVE__TARGET = ELEMENT_DIRECTIVE__TARGET;

	/**
	 * The number of structural features of the '<em>Unary Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DIRECTIVE_FEATURE_COUNT = ELEMENT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link directives.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.CreateImpl
	 * @see directives.impl.DirectivesPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__TARGET = UNARY_DIRECTIVE__TARGET;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CLASS_NAME = UNARY_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__TYPE = UNARY_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = UNARY_DIRECTIVE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link directives.impl.BinaryDirectiveImpl <em>Binary Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.BinaryDirectiveImpl
	 * @see directives.impl.DirectivesPackageImpl#getBinaryDirective()
	 * @generated
	 */
	int BINARY_DIRECTIVE = 11;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DIRECTIVE__TARGET = ELEMENT_DIRECTIVE__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DIRECTIVE__VALUE = ELEMENT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DIRECTIVE_FEATURE_COUNT = ELEMENT_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link directives.impl.ConcatImpl <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.ConcatImpl
	 * @see directives.impl.DirectivesPackageImpl#getConcat()
	 * @generated
	 */
	int CONCAT = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__TARGET = BINARY_DIRECTIVE__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__VALUE = BINARY_DIRECTIVE__VALUE;

	/**
	 * The feature id for the '<em><b>Property Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__PROPERTY_NAMES = BINARY_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FEATURE_COUNT = BINARY_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link directives.impl.ChangeImpl <em>Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.ChangeImpl
	 * @see directives.impl.DirectivesPackageImpl#getChange()
	 * @generated
	 */
	int CHANGE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__TARGET = BINARY_DIRECTIVE__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__VALUE = BINARY_DIRECTIVE__VALUE;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__PROPERTY_NAME = BINARY_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FEATURE_COUNT = BINARY_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link directives.impl.DestroyImpl <em>Destroy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.DestroyImpl
	 * @see directives.impl.DirectivesPackageImpl#getDestroy()
	 * @generated
	 */
	int DESTROY = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY__TARGET = UNARY_DIRECTIVE__TARGET;

	/**
	 * The number of structural features of the '<em>Destroy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_FEATURE_COUNT = UNARY_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link directives.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.MergeImpl
	 * @see directives.impl.DirectivesPackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__TARGET = BINARY_DIRECTIVE__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__VALUE = BINARY_DIRECTIVE__VALUE;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = BINARY_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link directives.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.SetImpl
	 * @see directives.impl.DirectivesPackageImpl#getSet()
	 * @generated
	 */
	int SET = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__TARGET = CHANGE__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__VALUE = CHANGE__VALUE;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__PROPERTY_NAME = CHANGE__PROPERTY_NAME;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link directives.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.AddImpl
	 * @see directives.impl.DirectivesPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__TARGET = CHANGE__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__VALUE = CHANGE__VALUE;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__PROPERTY_NAME = CHANGE__PROPERTY_NAME;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link directives.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.RemoveImpl
	 * @see directives.impl.DirectivesPackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__TARGET = CHANGE__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__VALUE = CHANGE__VALUE;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__PROPERTY_NAME = CHANGE__PROPERTY_NAME;

	/**
	 * The number of structural features of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link directives.impl.ElementRefImpl <em>Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.ElementRefImpl
	 * @see directives.impl.DirectivesPackageImpl#getElementRef()
	 * @generated
	 */
	int ELEMENT_REF = 19;

	/**
	 * The number of structural features of the '<em>Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REF_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link directives.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.LiteralImpl
	 * @see directives.impl.DirectivesPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 12;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link directives.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.StringLiteralImpl
	 * @see directives.impl.DirectivesPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link directives.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.BooleanLiteralImpl
	 * @see directives.impl.DirectivesPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link directives.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.IntegerLiteralImpl
	 * @see directives.impl.DirectivesPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link directives.impl.VoidLiteralImpl <em>Void Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.VoidLiteralImpl
	 * @see directives.impl.DirectivesPackageImpl#getVoidLiteral()
	 * @generated
	 */
	int VOID_LITERAL = 16;

	/**
	 * The number of structural features of the '<em>Void Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link directives.impl.ObjectRefImpl <em>Object Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.ObjectRefImpl
	 * @see directives.impl.DirectivesPackageImpl#getObjectRef()
	 * @generated
	 */
	int OBJECT_REF = 22;

	/**
	 * The number of structural features of the '<em>Object Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_FEATURE_COUNT = ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link directives.impl.IDRefImpl <em>ID Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.IDRefImpl
	 * @see directives.impl.DirectivesPackageImpl#getIDRef()
	 * @generated
	 */
	int ID_REF = 17;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REF__IDENTIFIER = OBJECT_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ID Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REF_FEATURE_COUNT = OBJECT_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link directives.impl.NameRefImpl <em>Name Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.NameRefImpl
	 * @see directives.impl.DirectivesPackageImpl#getNameRef()
	 * @generated
	 */
	int NAME_REF = 18;

	/**
	 * The feature id for the '<em><b>Qname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REF__QNAME = OBJECT_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REF_FEATURE_COUNT = OBJECT_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link directives.impl.MetaRefImpl <em>Meta Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.MetaRefImpl
	 * @see directives.impl.DirectivesPackageImpl#getMetaRef()
	 * @generated
	 */
	int META_REF = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_REF__NAME = ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_REF_FEATURE_COUNT = ELEMENT_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link directives.impl.PropRefImpl <em>Prop Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see directives.impl.PropRefImpl
	 * @see directives.impl.DirectivesPackageImpl#getPropRef()
	 * @generated
	 */
	int PROP_REF = 21;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_REF__PROPERTY = ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_REF__OBJECT = ELEMENT_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prop Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_REF_FEATURE_COUNT = ELEMENT_REF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see directives.impl.DirectivesPackageImpl#getString()
	 * @generated
	 */
	int STRING = 23;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see directives.impl.DirectivesPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 24;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see directives.impl.DirectivesPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 25;


	/**
	 * Returns the meta object for class '{@link directives.CompositionDirective <em>Composition Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Directive</em>'.
	 * @see directives.CompositionDirective
	 * @generated
	 */
	EClass getCompositionDirective();

	/**
	 * Returns the meta object for class '{@link directives.ElementDirective <em>Element Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Directive</em>'.
	 * @see directives.ElementDirective
	 * @generated
	 */
	EClass getElementDirective();

	/**
	 * Returns the meta object for the containment reference '{@link directives.ElementDirective#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see directives.ElementDirective#getTarget()
	 * @see #getElementDirective()
	 * @generated
	 */
	EReference getElementDirective_Target();

	/**
	 * Returns the meta object for class '{@link directives.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see directives.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the attribute '{@link directives.Create#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see directives.Create#getClassName()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_ClassName();

	/**
	 * Returns the meta object for the containment reference '{@link directives.Create#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see directives.Create#getType()
	 * @see #getCreate()
	 * @generated
	 */
	EReference getCreate_Type();

	/**
	 * Returns the meta object for class '{@link directives.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see directives.Concat
	 * @generated
	 */
	EClass getConcat();

	/**
	 * Returns the meta object for the attribute list '{@link directives.Concat#getPropertyNames <em>Property Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Names</em>'.
	 * @see directives.Concat#getPropertyNames()
	 * @see #getConcat()
	 * @generated
	 */
	EAttribute getConcat_PropertyNames();

	/**
	 * Returns the meta object for class '{@link directives.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change</em>'.
	 * @see directives.Change
	 * @generated
	 */
	EClass getChange();

	/**
	 * Returns the meta object for the attribute '{@link directives.Change#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see directives.Change#getPropertyName()
	 * @see #getChange()
	 * @generated
	 */
	EAttribute getChange_PropertyName();

	/**
	 * Returns the meta object for class '{@link directives.Destroy <em>Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy</em>'.
	 * @see directives.Destroy
	 * @generated
	 */
	EClass getDestroy();

	/**
	 * Returns the meta object for class '{@link directives.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see directives.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for class '{@link directives.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see directives.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for class '{@link directives.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see directives.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link directives.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see directives.Remove
	 * @generated
	 */
	EClass getRemove();

	/**
	 * Returns the meta object for class '{@link directives.UnaryDirective <em>Unary Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Directive</em>'.
	 * @see directives.UnaryDirective
	 * @generated
	 */
	EClass getUnaryDirective();

	/**
	 * Returns the meta object for class '{@link directives.BinaryDirective <em>Binary Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Directive</em>'.
	 * @see directives.BinaryDirective
	 * @generated
	 */
	EClass getBinaryDirective();

	/**
	 * Returns the meta object for the containment reference list '{@link directives.BinaryDirective#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see directives.BinaryDirective#getValue()
	 * @see #getBinaryDirective()
	 * @generated
	 */
	EReference getBinaryDirective_Value();

	/**
	 * Returns the meta object for class '{@link directives.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see directives.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link directives.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see directives.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link directives.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see directives.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link directives.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see directives.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link directives.BooleanLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see directives.BooleanLiteral#getValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link directives.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see directives.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link directives.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see directives.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link directives.VoidLiteral <em>Void Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Literal</em>'.
	 * @see directives.VoidLiteral
	 * @generated
	 */
	EClass getVoidLiteral();

	/**
	 * Returns the meta object for class '{@link directives.IDRef <em>ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ref</em>'.
	 * @see directives.IDRef
	 * @generated
	 */
	EClass getIDRef();

	/**
	 * Returns the meta object for the attribute '{@link directives.IDRef#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see directives.IDRef#getIdentifier()
	 * @see #getIDRef()
	 * @generated
	 */
	EAttribute getIDRef_Identifier();

	/**
	 * Returns the meta object for class '{@link directives.NameRef <em>Name Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Ref</em>'.
	 * @see directives.NameRef
	 * @generated
	 */
	EClass getNameRef();

	/**
	 * Returns the meta object for the attribute '{@link directives.NameRef#getQname <em>Qname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qname</em>'.
	 * @see directives.NameRef#getQname()
	 * @see #getNameRef()
	 * @generated
	 */
	EAttribute getNameRef_Qname();

	/**
	 * Returns the meta object for class '{@link directives.ElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Ref</em>'.
	 * @see directives.ElementRef
	 * @generated
	 */
	EClass getElementRef();

	/**
	 * Returns the meta object for class '{@link directives.MetaRef <em>Meta Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Ref</em>'.
	 * @see directives.MetaRef
	 * @generated
	 */
	EClass getMetaRef();

	/**
	 * Returns the meta object for the attribute '{@link directives.MetaRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see directives.MetaRef#getName()
	 * @see #getMetaRef()
	 * @generated
	 */
	EAttribute getMetaRef_Name();

	/**
	 * Returns the meta object for class '{@link directives.PropRef <em>Prop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prop Ref</em>'.
	 * @see directives.PropRef
	 * @generated
	 */
	EClass getPropRef();

	/**
	 * Returns the meta object for the attribute '{@link directives.PropRef#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see directives.PropRef#getProperty()
	 * @see #getPropRef()
	 * @generated
	 */
	EAttribute getPropRef_Property();

	/**
	 * Returns the meta object for the containment reference '{@link directives.PropRef#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see directives.PropRef#getObject()
	 * @see #getPropRef()
	 * @generated
	 */
	EReference getPropRef_Object();

	/**
	 * Returns the meta object for class '{@link directives.ObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref</em>'.
	 * @see directives.ObjectRef
	 * @generated
	 */
	EClass getObjectRef();

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
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DirectivesFactory getDirectivesFactory();

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
		 * The meta object literal for the '{@link directives.impl.CompositionDirectiveImpl <em>Composition Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.CompositionDirectiveImpl
		 * @see directives.impl.DirectivesPackageImpl#getCompositionDirective()
		 * @generated
		 */
		EClass COMPOSITION_DIRECTIVE = eINSTANCE.getCompositionDirective();

		/**
		 * The meta object literal for the '{@link directives.impl.ElementDirectiveImpl <em>Element Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.ElementDirectiveImpl
		 * @see directives.impl.DirectivesPackageImpl#getElementDirective()
		 * @generated
		 */
		EClass ELEMENT_DIRECTIVE = eINSTANCE.getElementDirective();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DIRECTIVE__TARGET = eINSTANCE.getElementDirective_Target();

		/**
		 * The meta object literal for the '{@link directives.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.CreateImpl
		 * @see directives.impl.DirectivesPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__CLASS_NAME = eINSTANCE.getCreate_ClassName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE__TYPE = eINSTANCE.getCreate_Type();

		/**
		 * The meta object literal for the '{@link directives.impl.ConcatImpl <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.ConcatImpl
		 * @see directives.impl.DirectivesPackageImpl#getConcat()
		 * @generated
		 */
		EClass CONCAT = eINSTANCE.getConcat();

		/**
		 * The meta object literal for the '<em><b>Property Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCAT__PROPERTY_NAMES = eINSTANCE.getConcat_PropertyNames();

		/**
		 * The meta object literal for the '{@link directives.impl.ChangeImpl <em>Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.ChangeImpl
		 * @see directives.impl.DirectivesPackageImpl#getChange()
		 * @generated
		 */
		EClass CHANGE = eINSTANCE.getChange();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE__PROPERTY_NAME = eINSTANCE.getChange_PropertyName();

		/**
		 * The meta object literal for the '{@link directives.impl.DestroyImpl <em>Destroy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.DestroyImpl
		 * @see directives.impl.DirectivesPackageImpl#getDestroy()
		 * @generated
		 */
		EClass DESTROY = eINSTANCE.getDestroy();

		/**
		 * The meta object literal for the '{@link directives.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.MergeImpl
		 * @see directives.impl.DirectivesPackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '{@link directives.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.SetImpl
		 * @see directives.impl.DirectivesPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '{@link directives.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.AddImpl
		 * @see directives.impl.DirectivesPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link directives.impl.RemoveImpl <em>Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.RemoveImpl
		 * @see directives.impl.DirectivesPackageImpl#getRemove()
		 * @generated
		 */
		EClass REMOVE = eINSTANCE.getRemove();

		/**
		 * The meta object literal for the '{@link directives.impl.UnaryDirectiveImpl <em>Unary Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.UnaryDirectiveImpl
		 * @see directives.impl.DirectivesPackageImpl#getUnaryDirective()
		 * @generated
		 */
		EClass UNARY_DIRECTIVE = eINSTANCE.getUnaryDirective();

		/**
		 * The meta object literal for the '{@link directives.impl.BinaryDirectiveImpl <em>Binary Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.BinaryDirectiveImpl
		 * @see directives.impl.DirectivesPackageImpl#getBinaryDirective()
		 * @generated
		 */
		EClass BINARY_DIRECTIVE = eINSTANCE.getBinaryDirective();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_DIRECTIVE__VALUE = eINSTANCE.getBinaryDirective_Value();

		/**
		 * The meta object literal for the '{@link directives.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.LiteralImpl
		 * @see directives.impl.DirectivesPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link directives.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.StringLiteralImpl
		 * @see directives.impl.DirectivesPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link directives.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.BooleanLiteralImpl
		 * @see directives.impl.DirectivesPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link directives.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.IntegerLiteralImpl
		 * @see directives.impl.DirectivesPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link directives.impl.VoidLiteralImpl <em>Void Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.VoidLiteralImpl
		 * @see directives.impl.DirectivesPackageImpl#getVoidLiteral()
		 * @generated
		 */
		EClass VOID_LITERAL = eINSTANCE.getVoidLiteral();

		/**
		 * The meta object literal for the '{@link directives.impl.IDRefImpl <em>ID Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.IDRefImpl
		 * @see directives.impl.DirectivesPackageImpl#getIDRef()
		 * @generated
		 */
		EClass ID_REF = eINSTANCE.getIDRef();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_REF__IDENTIFIER = eINSTANCE.getIDRef_Identifier();

		/**
		 * The meta object literal for the '{@link directives.impl.NameRefImpl <em>Name Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.NameRefImpl
		 * @see directives.impl.DirectivesPackageImpl#getNameRef()
		 * @generated
		 */
		EClass NAME_REF = eINSTANCE.getNameRef();

		/**
		 * The meta object literal for the '<em><b>Qname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_REF__QNAME = eINSTANCE.getNameRef_Qname();

		/**
		 * The meta object literal for the '{@link directives.impl.ElementRefImpl <em>Element Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.ElementRefImpl
		 * @see directives.impl.DirectivesPackageImpl#getElementRef()
		 * @generated
		 */
		EClass ELEMENT_REF = eINSTANCE.getElementRef();

		/**
		 * The meta object literal for the '{@link directives.impl.MetaRefImpl <em>Meta Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.MetaRefImpl
		 * @see directives.impl.DirectivesPackageImpl#getMetaRef()
		 * @generated
		 */
		EClass META_REF = eINSTANCE.getMetaRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_REF__NAME = eINSTANCE.getMetaRef_Name();

		/**
		 * The meta object literal for the '{@link directives.impl.PropRefImpl <em>Prop Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.PropRefImpl
		 * @see directives.impl.DirectivesPackageImpl#getPropRef()
		 * @generated
		 */
		EClass PROP_REF = eINSTANCE.getPropRef();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROP_REF__PROPERTY = eINSTANCE.getPropRef_Property();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROP_REF__OBJECT = eINSTANCE.getPropRef_Object();

		/**
		 * The meta object literal for the '{@link directives.impl.ObjectRefImpl <em>Object Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see directives.impl.ObjectRefImpl
		 * @see directives.impl.DirectivesPackageImpl#getObjectRef()
		 * @generated
		 */
		EClass OBJECT_REF = eINSTANCE.getObjectRef();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see directives.impl.DirectivesPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see directives.impl.DirectivesPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see directives.impl.DirectivesPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

	}

} //DirectivesPackage
