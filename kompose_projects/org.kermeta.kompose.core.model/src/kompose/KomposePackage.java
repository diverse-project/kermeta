/**
 * <copyright>
 * </copyright>
 *
 * $Id: KomposePackage.java,v 1.4 2009-02-08 14:32:28 mclavreu Exp $
 */
package kompose;

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
 * @see kompose.KomposeFactory
 * @model kind="package"
 * @generated
 */
public interface KomposePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kompose";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kompose";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kompose";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KomposePackage eINSTANCE = kompose.impl.KomposePackageImpl.init();

	/**
	 * The meta object id for the '{@link kompose.impl.CompositionDirectiveImpl <em>Composition Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.CompositionDirectiveImpl
	 * @see kompose.impl.KomposePackageImpl#getCompositionDirective()
	 * @generated
	 */
	int COMPOSITION_DIRECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_DIRECTIVE__CONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Composition Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_DIRECTIVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link kompose.impl.ElementDirectiveImpl <em>Element Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.ElementDirectiveImpl
	 * @see kompose.impl.KomposePackageImpl#getElementDirective()
	 * @generated
	 */
	int ELEMENT_DIRECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DIRECTIVE__CONTEXT = COMPOSITION_DIRECTIVE__CONTEXT;

	/**
	 * The number of structural features of the '<em>Element Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DIRECTIVE_FEATURE_COUNT = COMPOSITION_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kompose.impl.ChangeImpl <em>Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.ChangeImpl
	 * @see kompose.impl.KomposePackageImpl#getChange()
	 * @generated
	 */
	int CHANGE = 9;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__CONTEXT = ELEMENT_DIRECTIVE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__PROPERTY_NAME = ELEMENT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__TARGET = ELEMENT_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__VALUE = ELEMENT_DIRECTIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FEATURE_COUNT = ELEMENT_DIRECTIVE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kompose.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.RemoveImpl
	 * @see kompose.impl.KomposePackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__CONTEXT = CHANGE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__PROPERTY_NAME = CHANGE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__TARGET = CHANGE__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__VALUE = CHANGE__VALUE;

	/**
	 * The number of structural features of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kompose.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.AddImpl
	 * @see kompose.impl.KomposePackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__CONTEXT = CHANGE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__PROPERTY_NAME = CHANGE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__TARGET = CHANGE__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__VALUE = CHANGE__VALUE;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kompose.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.CreateImpl
	 * @see kompose.impl.KomposePackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CONTEXT = ELEMENT_DIRECTIVE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CLASS_NAME = ELEMENT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__IDENTIFIER = ELEMENT_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = ELEMENT_DIRECTIVE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kompose.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.SetImpl
	 * @see kompose.impl.KomposePackageImpl#getSet()
	 * @generated
	 */
	int SET = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CONTEXT = CHANGE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__PROPERTY_NAME = CHANGE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__TARGET = CHANGE__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__VALUE = CHANGE__VALUE;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kompose.impl.ElementRefImpl <em>Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.ElementRefImpl
	 * @see kompose.impl.KomposePackageImpl#getElementRef()
	 * @generated
	 */
	int ELEMENT_REF = 6;

	/**
	 * The number of structural features of the '<em>Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REF_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompose.impl.NameRefImpl <em>Name Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.NameRefImpl
	 * @see kompose.impl.KomposePackageImpl#getNameRef()
	 * @generated
	 */
	int NAME_REF = 7;

	/**
	 * The feature id for the '<em><b>Qname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REF__QNAME = ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REF_FEATURE_COUNT = ELEMENT_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kompose.impl.IDRefImpl <em>ID Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.IDRefImpl
	 * @see kompose.impl.KomposePackageImpl#getIDRef()
	 * @generated
	 */
	int ID_REF = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REF__IDENTIFIER = ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ID Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REF_FEATURE_COUNT = ELEMENT_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kompose.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.LiteralImpl
	 * @see kompose.impl.KomposePackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 10;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kompose.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.StringLiteralImpl
	 * @see kompose.impl.KomposePackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 11;

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
	 * The meta object id for the '{@link kompose.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.BooleanLiteralImpl
	 * @see kompose.impl.KomposePackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 12;

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
	 * The meta object id for the '{@link kompose.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.IntegerLiteralImpl
	 * @see kompose.impl.KomposePackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 13;

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
	 * The meta object id for the '{@link kompose.impl.VoidLiteralImpl <em>Void Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.VoidLiteralImpl
	 * @see kompose.impl.KomposePackageImpl#getVoidLiteral()
	 * @generated
	 */
	int VOID_LITERAL = 14;

	/**
	 * The number of structural features of the '<em>Void Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kompose.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.ContextImpl
	 * @see kompose.impl.KomposePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 15;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompose.impl.ComposerImpl <em>Composer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.ComposerImpl
	 * @see kompose.impl.KomposePackageImpl#getComposer()
	 * @generated
	 */
	int COMPOSER = 16;

	/**
	 * The feature id for the '<em><b>Predirectives PM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__PREDIRECTIVES_PM = 0;

	/**
	 * The feature id for the '<em><b>Postdirectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__POSTDIRECTIVES = 1;

	/**
	 * The feature id for the '<em><b>Primary Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__PRIMARY_MODEL_URI = 2;

	/**
	 * The feature id for the '<em><b>Aspect Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__ASPECT_MODEL_URI = 3;

	/**
	 * The feature id for the '<em><b>Composed Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__COMPOSED_MODEL_URI = 4;

	/**
	 * The feature id for the '<em><b>Predirectives AM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__PREDIRECTIVES_AM = 5;

	/**
	 * The feature id for the '<em><b>Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__METAMODEL_NAME = 6;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__MODE = 7;

	/**
	 * The number of structural features of the '<em>Composer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link kompose.impl.MergeableImpl <em>Mergeable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.MergeableImpl
	 * @see kompose.impl.KomposePackageImpl#getMergeable()
	 * @generated
	 */
	int MERGEABLE = 17;

	/**
	 * The number of structural features of the '<em>Mergeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGEABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompose.impl.ConcatImpl <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.ConcatImpl
	 * @see kompose.impl.KomposePackageImpl#getConcat()
	 * @generated
	 */
	int CONCAT = 18;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__CONTEXT = ELEMENT_DIRECTIVE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Property Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__PROPERTY_NAMES = ELEMENT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__TARGET = ELEMENT_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__VALUE = ELEMENT_DIRECTIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FEATURE_COUNT = ELEMENT_DIRECTIVE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kompose.Modes <em>Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.Modes
	 * @see kompose.impl.KomposePackageImpl#getModes()
	 * @generated
	 */
	int MODES = 19;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see kompose.impl.KomposePackageImpl#getString()
	 * @generated
	 */
	int STRING = 20;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see kompose.impl.KomposePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 21;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see kompose.impl.KomposePackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 22;


	/**
	 * Returns the meta object for class '{@link kompose.ElementDirective <em>Element Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Directive</em>'.
	 * @see kompose.ElementDirective
	 * @generated
	 */
	EClass getElementDirective();

	/**
	 * Returns the meta object for class '{@link kompose.CompositionDirective <em>Composition Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Directive</em>'.
	 * @see kompose.CompositionDirective
	 * @generated
	 */
	EClass getCompositionDirective();

	/**
	 * Returns the meta object for the reference '{@link kompose.CompositionDirective#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see kompose.CompositionDirective#getContext()
	 * @see #getCompositionDirective()
	 * @generated
	 */
	EReference getCompositionDirective_Context();

	/**
	 * Returns the meta object for class '{@link kompose.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see kompose.Remove
	 * @generated
	 */
	EClass getRemove();

	/**
	 * Returns the meta object for class '{@link kompose.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see kompose.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link kompose.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see kompose.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Create#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see kompose.Create#getClassName()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Create#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see kompose.Create#getIdentifier()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Identifier();

	/**
	 * Returns the meta object for class '{@link kompose.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see kompose.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for class '{@link kompose.ElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Ref</em>'.
	 * @see kompose.ElementRef
	 * @generated
	 */
	EClass getElementRef();

	/**
	 * Returns the meta object for class '{@link kompose.NameRef <em>Name Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Ref</em>'.
	 * @see kompose.NameRef
	 * @generated
	 */
	EClass getNameRef();

	/**
	 * Returns the meta object for the attribute '{@link kompose.NameRef#getQname <em>Qname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qname</em>'.
	 * @see kompose.NameRef#getQname()
	 * @see #getNameRef()
	 * @generated
	 */
	EAttribute getNameRef_Qname();

	/**
	 * Returns the meta object for class '{@link kompose.IDRef <em>ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ref</em>'.
	 * @see kompose.IDRef
	 * @generated
	 */
	EClass getIDRef();

	/**
	 * Returns the meta object for the attribute '{@link kompose.IDRef#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see kompose.IDRef#getIdentifier()
	 * @see #getIDRef()
	 * @generated
	 */
	EAttribute getIDRef_Identifier();

	/**
	 * Returns the meta object for class '{@link kompose.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change</em>'.
	 * @see kompose.Change
	 * @generated
	 */
	EClass getChange();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Change#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see kompose.Change#getPropertyName()
	 * @see #getChange()
	 * @generated
	 */
	EAttribute getChange_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link kompose.Change#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see kompose.Change#getTarget()
	 * @see #getChange()
	 * @generated
	 */
	EReference getChange_Target();

	/**
	 * Returns the meta object for the containment reference '{@link kompose.Change#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see kompose.Change#getValue()
	 * @see #getChange()
	 * @generated
	 */
	EReference getChange_Value();

	/**
	 * Returns the meta object for class '{@link kompose.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see kompose.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link kompose.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see kompose.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link kompose.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kompose.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link kompose.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see kompose.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link kompose.BooleanLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kompose.BooleanLiteral#getValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link kompose.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see kompose.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link kompose.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kompose.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link kompose.VoidLiteral <em>Void Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Literal</em>'.
	 * @see kompose.VoidLiteral
	 * @generated
	 */
	EClass getVoidLiteral();

	/**
	 * Returns the meta object for class '{@link kompose.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see kompose.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link kompose.Composer <em>Composer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composer</em>'.
	 * @see kompose.Composer
	 * @generated
	 */
	EClass getComposer();

	/**
	 * Returns the meta object for the containment reference list '{@link kompose.Composer#getPredirectivesPM <em>Predirectives PM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predirectives PM</em>'.
	 * @see kompose.Composer#getPredirectivesPM()
	 * @see #getComposer()
	 * @generated
	 */
	EReference getComposer_PredirectivesPM();

	/**
	 * Returns the meta object for the containment reference list '{@link kompose.Composer#getPostdirectives <em>Postdirectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postdirectives</em>'.
	 * @see kompose.Composer#getPostdirectives()
	 * @see #getComposer()
	 * @generated
	 */
	EReference getComposer_Postdirectives();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Composer#getPrimaryModelURI <em>Primary Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Model URI</em>'.
	 * @see kompose.Composer#getPrimaryModelURI()
	 * @see #getComposer()
	 * @generated
	 */
	EAttribute getComposer_PrimaryModelURI();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Composer#getAspectModelURI <em>Aspect Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Model URI</em>'.
	 * @see kompose.Composer#getAspectModelURI()
	 * @see #getComposer()
	 * @generated
	 */
	EAttribute getComposer_AspectModelURI();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Composer#getComposedModelURI <em>Composed Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composed Model URI</em>'.
	 * @see kompose.Composer#getComposedModelURI()
	 * @see #getComposer()
	 * @generated
	 */
	EAttribute getComposer_ComposedModelURI();

	/**
	 * Returns the meta object for the containment reference list '{@link kompose.Composer#getPredirectivesAM <em>Predirectives AM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predirectives AM</em>'.
	 * @see kompose.Composer#getPredirectivesAM()
	 * @see #getComposer()
	 * @generated
	 */
	EReference getComposer_PredirectivesAM();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Composer#getMetamodelName <em>Metamodel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Name</em>'.
	 * @see kompose.Composer#getMetamodelName()
	 * @see #getComposer()
	 * @generated
	 */
	EAttribute getComposer_MetamodelName();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Composer#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kompose.Composer#getMode()
	 * @see #getComposer()
	 * @generated
	 */
	EAttribute getComposer_Mode();

	/**
	 * Returns the meta object for class '{@link kompose.Mergeable <em>Mergeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mergeable</em>'.
	 * @see kompose.Mergeable
	 * @generated
	 */
	EClass getMergeable();

	/**
	 * Returns the meta object for class '{@link kompose.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see kompose.Concat
	 * @generated
	 */
	EClass getConcat();

	/**
	 * Returns the meta object for the attribute list '{@link kompose.Concat#getPropertyNames <em>Property Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Names</em>'.
	 * @see kompose.Concat#getPropertyNames()
	 * @see #getConcat()
	 * @generated
	 */
	EAttribute getConcat_PropertyNames();

	/**
	 * Returns the meta object for the containment reference '{@link kompose.Concat#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see kompose.Concat#getTarget()
	 * @see #getConcat()
	 * @generated
	 */
	EReference getConcat_Target();

	/**
	 * Returns the meta object for the containment reference '{@link kompose.Concat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see kompose.Concat#getValue()
	 * @see #getConcat()
	 * @generated
	 */
	EReference getConcat_Value();

	/**
	 * Returns the meta object for enum '{@link kompose.Modes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modes</em>'.
	 * @see kompose.Modes
	 * @generated
	 */
	EEnum getModes();

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
	KomposeFactory getKomposeFactory();

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
		 * The meta object literal for the '{@link kompose.impl.ElementDirectiveImpl <em>Element Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.ElementDirectiveImpl
		 * @see kompose.impl.KomposePackageImpl#getElementDirective()
		 * @generated
		 */
		EClass ELEMENT_DIRECTIVE = eINSTANCE.getElementDirective();

		/**
		 * The meta object literal for the '{@link kompose.impl.CompositionDirectiveImpl <em>Composition Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.CompositionDirectiveImpl
		 * @see kompose.impl.KomposePackageImpl#getCompositionDirective()
		 * @generated
		 */
		EClass COMPOSITION_DIRECTIVE = eINSTANCE.getCompositionDirective();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_DIRECTIVE__CONTEXT = eINSTANCE.getCompositionDirective_Context();

		/**
		 * The meta object literal for the '{@link kompose.impl.RemoveImpl <em>Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.RemoveImpl
		 * @see kompose.impl.KomposePackageImpl#getRemove()
		 * @generated
		 */
		EClass REMOVE = eINSTANCE.getRemove();

		/**
		 * The meta object literal for the '{@link kompose.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.AddImpl
		 * @see kompose.impl.KomposePackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link kompose.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.CreateImpl
		 * @see kompose.impl.KomposePackageImpl#getCreate()
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
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__IDENTIFIER = eINSTANCE.getCreate_Identifier();

		/**
		 * The meta object literal for the '{@link kompose.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.SetImpl
		 * @see kompose.impl.KomposePackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '{@link kompose.impl.ElementRefImpl <em>Element Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.ElementRefImpl
		 * @see kompose.impl.KomposePackageImpl#getElementRef()
		 * @generated
		 */
		EClass ELEMENT_REF = eINSTANCE.getElementRef();

		/**
		 * The meta object literal for the '{@link kompose.impl.NameRefImpl <em>Name Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.NameRefImpl
		 * @see kompose.impl.KomposePackageImpl#getNameRef()
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
		 * The meta object literal for the '{@link kompose.impl.IDRefImpl <em>ID Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.IDRefImpl
		 * @see kompose.impl.KomposePackageImpl#getIDRef()
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
		 * The meta object literal for the '{@link kompose.impl.ChangeImpl <em>Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.ChangeImpl
		 * @see kompose.impl.KomposePackageImpl#getChange()
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
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE__TARGET = eINSTANCE.getChange_Target();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE__VALUE = eINSTANCE.getChange_Value();

		/**
		 * The meta object literal for the '{@link kompose.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.LiteralImpl
		 * @see kompose.impl.KomposePackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link kompose.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.StringLiteralImpl
		 * @see kompose.impl.KomposePackageImpl#getStringLiteral()
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
		 * The meta object literal for the '{@link kompose.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.BooleanLiteralImpl
		 * @see kompose.impl.KomposePackageImpl#getBooleanLiteral()
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
		 * The meta object literal for the '{@link kompose.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.IntegerLiteralImpl
		 * @see kompose.impl.KomposePackageImpl#getIntegerLiteral()
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
		 * The meta object literal for the '{@link kompose.impl.VoidLiteralImpl <em>Void Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.VoidLiteralImpl
		 * @see kompose.impl.KomposePackageImpl#getVoidLiteral()
		 * @generated
		 */
		EClass VOID_LITERAL = eINSTANCE.getVoidLiteral();

		/**
		 * The meta object literal for the '{@link kompose.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.ContextImpl
		 * @see kompose.impl.KomposePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link kompose.impl.ComposerImpl <em>Composer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.ComposerImpl
		 * @see kompose.impl.KomposePackageImpl#getComposer()
		 * @generated
		 */
		EClass COMPOSER = eINSTANCE.getComposer();

		/**
		 * The meta object literal for the '<em><b>Predirectives PM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSER__PREDIRECTIVES_PM = eINSTANCE.getComposer_PredirectivesPM();

		/**
		 * The meta object literal for the '<em><b>Postdirectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSER__POSTDIRECTIVES = eINSTANCE.getComposer_Postdirectives();

		/**
		 * The meta object literal for the '<em><b>Primary Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSER__PRIMARY_MODEL_URI = eINSTANCE.getComposer_PrimaryModelURI();

		/**
		 * The meta object literal for the '<em><b>Aspect Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSER__ASPECT_MODEL_URI = eINSTANCE.getComposer_AspectModelURI();

		/**
		 * The meta object literal for the '<em><b>Composed Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSER__COMPOSED_MODEL_URI = eINSTANCE.getComposer_ComposedModelURI();

		/**
		 * The meta object literal for the '<em><b>Predirectives AM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSER__PREDIRECTIVES_AM = eINSTANCE.getComposer_PredirectivesAM();

		/**
		 * The meta object literal for the '<em><b>Metamodel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSER__METAMODEL_NAME = eINSTANCE.getComposer_MetamodelName();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSER__MODE = eINSTANCE.getComposer_Mode();

		/**
		 * The meta object literal for the '{@link kompose.impl.MergeableImpl <em>Mergeable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.MergeableImpl
		 * @see kompose.impl.KomposePackageImpl#getMergeable()
		 * @generated
		 */
		EClass MERGEABLE = eINSTANCE.getMergeable();

		/**
		 * The meta object literal for the '{@link kompose.impl.ConcatImpl <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.ConcatImpl
		 * @see kompose.impl.KomposePackageImpl#getConcat()
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
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCAT__TARGET = eINSTANCE.getConcat_Target();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCAT__VALUE = eINSTANCE.getConcat_Value();

		/**
		 * The meta object literal for the '{@link kompose.Modes <em>Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.Modes
		 * @see kompose.impl.KomposePackageImpl#getModes()
		 * @generated
		 */
		EEnum MODES = eINSTANCE.getModes();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see kompose.impl.KomposePackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see kompose.impl.KomposePackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see kompose.impl.KomposePackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

	}

} //KomposePackage
