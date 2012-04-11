/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

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
 * @see alfDsl.AlfDslFactory
 * @model kind="package"
 * @generated
 */
public interface AlfDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "alfDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/alf/AlfDsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alfDsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlfDslPackage eINSTANCE = alfDsl.impl.AlfDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link alfDsl.impl.CLASSSTRUCTImpl <em>CLASSSTRUCT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.CLASSSTRUCTImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getCLASSSTRUCT()
	 * @generated
	 */
	int CLASSSTRUCT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSSTRUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Clsop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSSTRUCT__CLSOP = 1;

	/**
	 * The number of structural features of the '<em>CLASSSTRUCT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSSTRUCT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.CLASSOPImpl <em>CLASSOP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.CLASSOPImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getCLASSOP()
	 * @generated
	 */
	int CLASSOP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSOP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSOP__STAT = 1;

	/**
	 * The number of structural features of the '<em>CLASSOP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSOP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ValueSpecificationImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 45;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.LITERALImpl <em>LITERAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.LITERALImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getLITERAL()
	 * @generated
	 */
	int LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__SUFFIX = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LITERAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.BOOLEAN_LITERALImpl <em>BOOLEAN LITERAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.BOOLEAN_LITERALImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getBOOLEAN_LITERAL()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__SUFFIX = LITERAL__SUFFIX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BOOLEAN LITERAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.NUMBER_LITERALImpl <em>NUMBER LITERAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.NUMBER_LITERALImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getNUMBER_LITERAL()
	 * @generated
	 */
	int NUMBER_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__SUFFIX = LITERAL__SUFFIX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NUMBER LITERAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.INTEGER_LITERALImpl <em>INTEGER LITERAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.INTEGER_LITERALImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getINTEGER_LITERAL()
	 * @generated
	 */
	int INTEGER_LITERAL = 5;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__SUFFIX = NUMBER_LITERAL__SUFFIX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = NUMBER_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>INTEGER LITERAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.UNLIMITED_LITERALImpl <em>UNLIMITED LITERAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.UNLIMITED_LITERALImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getUNLIMITED_LITERAL()
	 * @generated
	 */
	int UNLIMITED_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_LITERAL__SUFFIX = NUMBER_LITERAL__SUFFIX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_LITERAL__VALUE = NUMBER_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>UNLIMITED LITERAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.STRING_LITERALImpl <em>STRING LITERAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.STRING_LITERALImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSTRING_LITERAL()
	 * @generated
	 */
	int STRING_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__SUFFIX = LITERAL__SUFFIX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>STRING LITERAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.NameExpressionImpl <em>Name Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.NameExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getNameExpression()
	 * @generated
	 */
	int NAME_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Prefix Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__PREFIX_OP = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__PATH = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__ID = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invocation Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__INVOCATION_COMPLETION = VALUE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Construction Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__SEQUENCE_CONSTRUCTION_COMPLETION = VALUE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Postfix Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__POSTFIX_OP = VALUE_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__SUFFIX = VALUE_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Name Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link alfDsl.impl.QualifiedNamePathImpl <em>Qualified Name Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.QualifiedNamePathImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getQualifiedNamePath()
	 * @generated
	 */
	int QUALIFIED_NAME_PATH = 9;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_PATH__NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Qualified Name Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_PATH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.UnqualifiedNameImpl <em>Unqualified Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.UnqualifiedNameImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getUnqualifiedName()
	 * @generated
	 */
	int UNQUALIFIED_NAME = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNQUALIFIED_NAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNQUALIFIED_NAME__TEMPLATE_BINDING = 1;

	/**
	 * The number of structural features of the '<em>Unqualified Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNQUALIFIED_NAME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.TemplateBindingImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getTemplateBinding()
	 * @generated
	 */
	int TEMPLATE_BINDING = 11;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__BINDINGS = 0;

	/**
	 * The number of structural features of the '<em>Template Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.NamedTemplateBindingImpl <em>Named Template Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.NamedTemplateBindingImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getNamedTemplateBinding()
	 * @generated
	 */
	int NAMED_TEMPLATE_BINDING = 12;

	/**
	 * The feature id for the '<em><b>Formal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TEMPLATE_BINDING__FORMAL = 0;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TEMPLATE_BINDING__ACTUAL = 1;

	/**
	 * The number of structural features of the '<em>Named Template Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TEMPLATE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.QualifiedNameWithBindingImpl <em>Qualified Name With Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.QualifiedNameWithBindingImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getQualifiedNameWithBinding()
	 * @generated
	 */
	int QUALIFIED_NAME_WITH_BINDING = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_WITH_BINDING__ID = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_WITH_BINDING__BINDING = 1;

	/**
	 * The feature id for the '<em><b>Remaining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_WITH_BINDING__REMAINING = 2;

	/**
	 * The number of structural features of the '<em>Qualified Name With Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_WITH_BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.TupleImpl <em>Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.TupleImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getTuple()
	 * @generated
	 */
	int TUPLE = 14;

	/**
	 * The feature id for the '<em><b>Tuple Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__TUPLE_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.TupleElementImpl <em>Tuple Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.TupleElementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getTupleElement()
	 * @generated
	 */
	int TUPLE_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT__ARGUMENT = 0;

	/**
	 * The number of structural features of the '<em>Tuple Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SequenceElementImpl <em>Sequence Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SequenceElementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceElement()
	 * @generated
	 */
	int SEQUENCE_ELEMENT = 57;

	/**
	 * The number of structural features of the '<em>Sequence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 16;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = SEQUENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ConditionalTestExpressionImpl <em>Conditional Test Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ConditionalTestExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getConditionalTestExpression()
	 * @generated
	 */
	int CONDITIONAL_TEST_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TEST_EXPRESSION__EXP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>When False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Test Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TEST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ConditionalOrExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getConditionalOrExpression()
	 * @generated
	 */
	int CONDITIONAL_OR_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OR_EXPRESSION__EXP = 0;

	/**
	 * The number of structural features of the '<em>Conditional Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OR_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ConditionalAndExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getConditionalAndExpression()
	 * @generated
	 */
	int CONDITIONAL_AND_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_AND_EXPRESSION__EXP = 0;

	/**
	 * The number of structural features of the '<em>Conditional And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_AND_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.InclusiveOrExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getInclusiveOrExpression()
	 * @generated
	 */
	int INCLUSIVE_OR_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_OR_EXPRESSION__EXP = 0;

	/**
	 * The number of structural features of the '<em>Inclusive Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ExclusiveOrExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getExclusiveOrExpression()
	 * @generated
	 */
	int EXCLUSIVE_OR_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION__EXP = 0;

	/**
	 * The number of structural features of the '<em>Exclusive Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.AndExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__EXP = 0;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.EqualityExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getEqualityExpression()
	 * @generated
	 */
	int EQUALITY_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__EXP = 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__OP = 1;

	/**
	 * The number of structural features of the '<em>Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ClassificationExpressionImpl <em>Classification Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ClassificationExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getClassificationExpression()
	 * @generated
	 */
	int CLASSIFICATION_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_EXPRESSION__EXP = 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_EXPRESSION__OP = 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_EXPRESSION__TYPE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Classification Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.RelationalExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OP = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RIGHT = 2;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ShiftExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getShiftExpression()
	 * @generated
	 */
	int SHIFT_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__EXP = 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__OP = 1;

	/**
	 * The number of structural features of the '<em>Shift Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.AdditiveExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getAdditiveExpression()
	 * @generated
	 */
	int ADDITIVE_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__EXP = 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__OP = 1;

	/**
	 * The number of structural features of the '<em>Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.MultiplicativeExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getMultiplicativeExpression()
	 * @generated
	 */
	int MULTIPLICATIVE_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__EXP = 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__OP = 1;

	/**
	 * The number of structural features of the '<em>Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.UnaryExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OP = 0;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXP = 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.PrimaryExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getPrimaryExpression()
	 * @generated
	 */
	int PRIMARY_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION__PREFIX = 0;

	/**
	 * The number of structural features of the '<em>Primary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SuffixExpressionImpl <em>Suffix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SuffixExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSuffixExpression()
	 * @generated
	 */
	int SUFFIX_EXPRESSION = 31;

	/**
	 * The number of structural features of the '<em>Suffix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.OperationCallExpressionImpl <em>Operation Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.OperationCallExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getOperationCallExpression()
	 * @generated
	 */
	int OPERATION_CALL_EXPRESSION = 32;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXPRESSION__OPERATION_NAME = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXPRESSION__TUPLE = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXPRESSION__SUFFIX = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.OperationCallExpressionWithoutDotImpl <em>Operation Call Expression Without Dot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.OperationCallExpressionWithoutDotImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getOperationCallExpressionWithoutDot()
	 * @generated
	 */
	int OPERATION_CALL_EXPRESSION_WITHOUT_DOT = 33;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXPRESSION_WITHOUT_DOT__OPERATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE = 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX = 2;

	/**
	 * The number of structural features of the '<em>Operation Call Expression Without Dot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXPRESSION_WITHOUT_DOT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.PropertyCallExpressionImpl <em>Property Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.PropertyCallExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getPropertyCallExpression()
	 * @generated
	 */
	int PROPERTY_CALL_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__PROPERTY_NAME = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__INDEX = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__SUFFIX = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.LinkOperationExpressionImpl <em>Link Operation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.LinkOperationExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getLinkOperationExpression()
	 * @generated
	 */
	int LINK_OPERATION_EXPRESSION = 35;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_EXPRESSION__KIND = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_EXPRESSION__TUPLE = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.LinkOperationTupleImpl <em>Link Operation Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.LinkOperationTupleImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getLinkOperationTuple()
	 * @generated
	 */
	int LINK_OPERATION_TUPLE = 36;

	/**
	 * The feature id for the '<em><b>Link Operation Tuple Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_TUPLE__LINK_OPERATION_TUPLE_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Link Operation Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_TUPLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.LinkOperationTupleElementImpl <em>Link Operation Tuple Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.LinkOperationTupleElementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getLinkOperationTupleElement()
	 * @generated
	 */
	int LINK_OPERATION_TUPLE_ELEMENT = 37;

	/**
	 * The feature id for the '<em><b>Object Or Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Role Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_TUPLE_ELEMENT__OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Link Operation Tuple Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_TUPLE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SequenceOperationExpressionImpl <em>Sequence Operation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SequenceOperationExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceOperationExpression()
	 * @generated
	 */
	int SEQUENCE_OPERATION_EXPRESSION = 38;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_EXPRESSION__OPERATION_NAME = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_EXPRESSION__TUPLE = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_EXPRESSION__SUFFIX = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sequence Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SequenceReductionExpressionImpl <em>Sequence Reduction Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SequenceReductionExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceReductionExpression()
	 * @generated
	 */
	int SEQUENCE_REDUCTION_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_REDUCTION_EXPRESSION__IS_ORDERED = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_REDUCTION_EXPRESSION__BEHAVIOR = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_REDUCTION_EXPRESSION__SUFFIX = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sequence Reduction Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_REDUCTION_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SequenceExpansionExpressionImpl <em>Sequence Expansion Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SequenceExpansionExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceExpansionExpression()
	 * @generated
	 */
	int SEQUENCE_EXPANSION_EXPRESSION = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPANSION_EXPRESSION__NAME = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPANSION_EXPRESSION__EXPR = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPANSION_EXPRESSION__SUFFIX = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sequence Expansion Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SelectOrRejectOperationImpl <em>Select Or Reject Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SelectOrRejectOperationImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSelectOrRejectOperation()
	 * @generated
	 */
	int SELECT_OR_REJECT_OPERATION = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OR_REJECT_OPERATION__NAME = SEQUENCE_EXPANSION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OR_REJECT_OPERATION__EXPR = SEQUENCE_EXPANSION_EXPRESSION__EXPR;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OR_REJECT_OPERATION__SUFFIX = SEQUENCE_EXPANSION_EXPRESSION__SUFFIX;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OR_REJECT_OPERATION__OP = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Or Reject Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OR_REJECT_OPERATION_FEATURE_COUNT = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.CollectOrIterateOperationImpl <em>Collect Or Iterate Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.CollectOrIterateOperationImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getCollectOrIterateOperation()
	 * @generated
	 */
	int COLLECT_OR_ITERATE_OPERATION = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_OR_ITERATE_OPERATION__NAME = SEQUENCE_EXPANSION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_OR_ITERATE_OPERATION__EXPR = SEQUENCE_EXPANSION_EXPRESSION__EXPR;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_OR_ITERATE_OPERATION__SUFFIX = SEQUENCE_EXPANSION_EXPRESSION__SUFFIX;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_OR_ITERATE_OPERATION__OP = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collect Or Iterate Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_OR_ITERATE_OPERATION_FEATURE_COUNT = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ForAllOrExistsOrOneOperationImpl <em>For All Or Exists Or One Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ForAllOrExistsOrOneOperationImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getForAllOrExistsOrOneOperation()
	 * @generated
	 */
	int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__NAME = SEQUENCE_EXPANSION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__EXPR = SEQUENCE_EXPANSION_EXPRESSION__EXPR;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__SUFFIX = SEQUENCE_EXPANSION_EXPRESSION__SUFFIX;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__OP = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>For All Or Exists Or One Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION_FEATURE_COUNT = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.IsUniqueOperationImpl <em>Is Unique Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.IsUniqueOperationImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getIsUniqueOperation()
	 * @generated
	 */
	int IS_UNIQUE_OPERATION = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIQUE_OPERATION__NAME = SEQUENCE_EXPANSION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIQUE_OPERATION__EXPR = SEQUENCE_EXPANSION_EXPRESSION__EXPR;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIQUE_OPERATION__SUFFIX = SEQUENCE_EXPANSION_EXPRESSION__SUFFIX;

	/**
	 * The number of structural features of the '<em>Is Unique Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIQUE_OPERATION_FEATURE_COUNT = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.NonLiteralValueSpecificationImpl <em>Non Literal Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.NonLiteralValueSpecificationImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getNonLiteralValueSpecification()
	 * @generated
	 */
	int NON_LITERAL_VALUE_SPECIFICATION = 46;

	/**
	 * The number of structural features of the '<em>Non Literal Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_LITERAL_VALUE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ParenthesizedExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getParenthesizedExpression()
	 * @generated
	 */
	int PARENTHESIZED_EXPRESSION = 47;

	/**
	 * The feature id for the '<em><b>Exp Or Type Cast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION__EXP_OR_TYPE_CAST = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Casted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION__CASTED = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION__SUFFIX = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parenthesized Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.NullExpressionImpl <em>Null Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.NullExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getNullExpression()
	 * @generated
	 */
	int NULL_EXPRESSION = 48;

	/**
	 * The number of structural features of the '<em>Null Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ThisExpressionImpl <em>This Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ThisExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getThisExpression()
	 * @generated
	 */
	int THIS_EXPRESSION = 49;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION__SUFFIX = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>This Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SuperInvocationExpressionImpl <em>Super Invocation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SuperInvocationExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSuperInvocationExpression()
	 * @generated
	 */
	int SUPER_INVOCATION_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INVOCATION_EXPRESSION__CLASS_NAME = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Call Without Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INVOCATION_EXPRESSION__OPERATION_CALL_WITHOUT_DOT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INVOCATION_EXPRESSION__OPERATION_CALL = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Super Invocation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INVOCATION_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.InstanceCreationExpressionImpl <em>Instance Creation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.InstanceCreationExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getInstanceCreationExpression()
	 * @generated
	 */
	int INSTANCE_CREATION_EXPRESSION = 51;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__TUPLE = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Constuction Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__SUFFIX = VALUE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Instance Creation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SequenceConstructionOrAccessCompletionImpl <em>Sequence Construction Or Access Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SequenceConstructionOrAccessCompletionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceConstructionOrAccessCompletion()
	 * @generated
	 */
	int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION = 52;

	/**
	 * The feature id for the '<em><b>Multiplicity Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__MULTIPLICITY_INDICATOR = 0;

	/**
	 * The feature id for the '<em><b>Access Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__ACCESS_COMPLETION = 1;

	/**
	 * The feature id for the '<em><b>Sequence Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__SEQUENCE_COMPLETION = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Sequence Construction Or Access Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link alfDsl.impl.AccessCompletionImpl <em>Access Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.AccessCompletionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getAccessCompletion()
	 * @generated
	 */
	int ACCESS_COMPLETION = 53;

	/**
	 * The feature id for the '<em><b>Access Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_COMPLETION__ACCESS_INDEX = 0;

	/**
	 * The number of structural features of the '<em>Access Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_COMPLETION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.PartialSequenceConstructionCompletionImpl <em>Partial Sequence Construction Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.PartialSequenceConstructionCompletionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getPartialSequenceConstructionCompletion()
	 * @generated
	 */
	int PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION = 54;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Partial Sequence Construction Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SequenceConstructionCompletionImpl <em>Sequence Construction Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SequenceConstructionCompletionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceConstructionCompletion()
	 * @generated
	 */
	int SEQUENCE_CONSTRUCTION_COMPLETION = 55;

	/**
	 * The feature id for the '<em><b>Multiplicity Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_COMPLETION__MULTIPLICITY_INDICATOR = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Sequence Construction Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_COMPLETION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SequenceConstructionExpressionImpl <em>Sequence Construction Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SequenceConstructionExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceConstructionExpression()
	 * @generated
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Sequence Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_ELEMENT = SEQUENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__RANGE_UPPER = SEQUENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Construction Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION_FEATURE_COUNT = SEQUENCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ClassExtentExpressionImpl <em>Class Extent Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ClassExtentExpressionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getClassExtentExpression()
	 * @generated
	 */
	int CLASS_EXTENT_EXPRESSION = 58;

	/**
	 * The number of structural features of the '<em>Class Extent Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENT_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.BlockImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 59;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.StatementSequenceImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getStatementSequence()
	 * @generated
	 */
	int STATEMENT_SEQUENCE = 60;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_SEQUENCE__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Statement Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_SEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.StatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 64;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.InlineStatementImpl <em>Inline Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.InlineStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getInlineStatement()
	 * @generated
	 */
	int INLINE_STATEMENT = 61;

	/**
	 * The feature id for the '<em><b>Langage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_STATEMENT__LANGAGE_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inline Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.AnnotatedStatementImpl <em>Annotated Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.AnnotatedStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getAnnotatedStatement()
	 * @generated
	 */
	int ANNOTATED_STATEMENT = 62;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_STATEMENT__ANNOTATION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotated Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.DocumentedStatementImpl <em>Documented Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.DocumentedStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getDocumentedStatement()
	 * @generated
	 */
	int DOCUMENTED_STATEMENT = 63;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_STATEMENT__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_STATEMENT__STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Documented Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.AnnotationImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 65;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__KIND = 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ARGS = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.BlockStatementImpl <em>Block Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.BlockStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getBlockStatement()
	 * @generated
	 */
	int BLOCK_STATEMENT = 66;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.EmptyStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getEmptyStatement()
	 * @generated
	 */
	int EMPTY_STATEMENT = 67;

	/**
	 * The number of structural features of the '<em>Empty Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.LocalNameDeclarationStatementImpl <em>Local Name Declaration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.LocalNameDeclarationStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getLocalNameDeclarationStatement()
	 * @generated
	 */
	int LOCAL_NAME_DECLARATION_STATEMENT = 68;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME_DECLARATION_STATEMENT__VAR_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME_DECLARATION_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME_DECLARATION_STATEMENT__MULTIPLICITY_INDICATOR = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME_DECLARATION_STATEMENT__INIT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Local Name Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME_DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link alfDsl.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.IfStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 69;

	/**
	 * The feature id for the '<em><b>Sequential Clausses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__SEQUENTIAL_CLAUSSES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__FINAL_CLAUSE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SequentialClausesImpl <em>Sequential Clauses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SequentialClausesImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSequentialClauses()
	 * @generated
	 */
	int SEQUENTIAL_CLAUSES = 70;

	/**
	 * The feature id for the '<em><b>Conccurent Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_CLAUSES__CONCCURENT_CLAUSES = 0;

	/**
	 * The number of structural features of the '<em>Sequential Clauses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_CLAUSES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ConcurrentClausesImpl <em>Concurrent Clauses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ConcurrentClausesImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getConcurrentClauses()
	 * @generated
	 */
	int CONCURRENT_CLAUSES = 71;

	/**
	 * The feature id for the '<em><b>Non Final Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_CLAUSES__NON_FINAL_CLAUSE = 0;

	/**
	 * The number of structural features of the '<em>Concurrent Clauses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_CLAUSES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.NonFinalClauseImpl <em>Non Final Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.NonFinalClauseImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getNonFinalClause()
	 * @generated
	 */
	int NON_FINAL_CLAUSE = 72;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FINAL_CLAUSE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FINAL_CLAUSE__BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Non Final Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FINAL_CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.FinalClauseImpl <em>Final Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.FinalClauseImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getFinalClause()
	 * @generated
	 */
	int FINAL_CLAUSE = 73;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CLAUSE__BLOCK = 0;

	/**
	 * The number of structural features of the '<em>Final Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SwitchStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSwitchStatement()
	 * @generated
	 */
	int SWITCH_STATEMENT = 74;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switch Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__SWITCH_CLAUSE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__DEFAULT_CLAUSE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Switch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SwitchClauseImpl <em>Switch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SwitchClauseImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSwitchClause()
	 * @generated
	 */
	int SWITCH_CLAUSE = 75;

	/**
	 * The feature id for the '<em><b>Switch Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CLAUSE__SWITCH_CASE = 0;

	/**
	 * The feature id for the '<em><b>Statement Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CLAUSE__STATEMENT_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Switch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SwitchCaseImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSwitchCase()
	 * @generated
	 */
	int SWITCH_CASE = 76;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SwitchDefaultClauseImpl <em>Switch Default Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SwitchDefaultClauseImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSwitchDefaultClause()
	 * @generated
	 */
	int SWITCH_DEFAULT_CLAUSE = 77;

	/**
	 * The feature id for the '<em><b>Statement Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_CLAUSE__STATEMENT_SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Switch Default Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.NonEmptyStatementSequenceImpl <em>Non Empty Statement Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.NonEmptyStatementSequenceImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getNonEmptyStatementSequence()
	 * @generated
	 */
	int NON_EMPTY_STATEMENT_SEQUENCE = 78;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_EMPTY_STATEMENT_SEQUENCE__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Non Empty Statement Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_EMPTY_STATEMENT_SEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.WhileStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 79;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.DoStatementImpl <em>Do Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.DoStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getDoStatement()
	 * @generated
	 */
	int DO_STATEMENT = 80;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Do Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ForStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 81;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONTROL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ForControlImpl <em>For Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ForControlImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getForControl()
	 * @generated
	 */
	int FOR_CONTROL = 82;

	/**
	 * The feature id for the '<em><b>Loop Variable Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CONTROL__LOOP_VARIABLE_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>For Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CONTROL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.LoopVariableDefinitionImpl <em>Loop Variable Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.LoopVariableDefinitionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getLoopVariableDefinition()
	 * @generated
	 */
	int LOOP_VARIABLE_DEFINITION = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_VARIABLE_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_VARIABLE_DEFINITION__EXPRESSION1 = 1;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_VARIABLE_DEFINITION__EXPRESSION2 = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_VARIABLE_DEFINITION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_VARIABLE_DEFINITION__EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>Loop Variable Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_VARIABLE_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link alfDsl.impl.BreakStatementImpl <em>Break Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.BreakStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getBreakStatement()
	 * @generated
	 */
	int BREAK_STATEMENT = 84;

	/**
	 * The number of structural features of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ReturnStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 85;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.AcceptStatementImpl <em>Accept Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.AcceptStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getAcceptStatement()
	 * @generated
	 */
	int ACCEPT_STATEMENT = 86;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_STATEMENT__CLAUSE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simple Accept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_STATEMENT__SIMPLE_ACCEPT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compound Accept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_STATEMENT__COMPOUND_ACCEPT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Accept Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SimpleAcceptStatementCompletionImpl <em>Simple Accept Statement Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SimpleAcceptStatementCompletionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSimpleAcceptStatementCompletion()
	 * @generated
	 */
	int SIMPLE_ACCEPT_STATEMENT_COMPLETION = 87;

	/**
	 * The number of structural features of the '<em>Simple Accept Statement Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACCEPT_STATEMENT_COMPLETION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.CompoundAcceptStatementCompletionImpl <em>Compound Accept Statement Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.CompoundAcceptStatementCompletionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getCompoundAcceptStatementCompletion()
	 * @generated
	 */
	int COMPOUND_ACCEPT_STATEMENT_COMPLETION = 88;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Accept Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Compound Accept Statement Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ACCEPT_STATEMENT_COMPLETION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.AcceptBlockImpl <em>Accept Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.AcceptBlockImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getAcceptBlock()
	 * @generated
	 */
	int ACCEPT_BLOCK = 89;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_BLOCK__CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_BLOCK__BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Accept Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_BLOCK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.AcceptClauseImpl <em>Accept Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.AcceptClauseImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getAcceptClause()
	 * @generated
	 */
	int ACCEPT_CLAUSE = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CLAUSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CLAUSE__QUALIFIED_NAME_LIST = 1;

	/**
	 * The number of structural features of the '<em>Accept Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ClassifyStatementImpl <em>Classify Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ClassifyStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getClassifyStatement()
	 * @generated
	 */
	int CLASSIFY_STATEMENT = 91;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_STATEMENT__CLAUSE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classify Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ClassificationClauseImpl <em>Classification Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ClassificationClauseImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getClassificationClause()
	 * @generated
	 */
	int CLASSIFICATION_CLAUSE = 92;

	/**
	 * The feature id for the '<em><b>Classify From Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLAUSE__CLASSIFY_FROM_CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>Classify To Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLAUSE__CLASSIFY_TO_CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>Reclassy All Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLAUSE__RECLASSY_ALL_CLAUSE = 2;

	/**
	 * The number of structural features of the '<em>Classification Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLAUSE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ClassificationFromClauseImpl <em>Classification From Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ClassificationFromClauseImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getClassificationFromClause()
	 * @generated
	 */
	int CLASSIFICATION_FROM_CLAUSE = 93;

	/**
	 * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FROM_CLAUSE__QUALIFIED_NAME_LIST = 0;

	/**
	 * The number of structural features of the '<em>Classification From Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FROM_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ClassificationToClauseImpl <em>Classification To Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ClassificationToClauseImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getClassificationToClause()
	 * @generated
	 */
	int CLASSIFICATION_TO_CLAUSE = 94;

	/**
	 * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TO_CLAUSE__QUALIFIED_NAME_LIST = 0;

	/**
	 * The number of structural features of the '<em>Classification To Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TO_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ReclassifyAllClauseImpl <em>Reclassify All Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ReclassifyAllClauseImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getReclassifyAllClause()
	 * @generated
	 */
	int RECLASSIFY_ALL_CLAUSE = 95;

	/**
	 * The number of structural features of the '<em>Reclassify All Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_ALL_CLAUSE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alfDsl.impl.QualifiedNameListImpl <em>Qualified Name List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.QualifiedNameListImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getQualifiedNameList()
	 * @generated
	 */
	int QUALIFIED_NAME_LIST = 96;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_LIST__QUALIFIED_NAME = 0;

	/**
	 * The number of structural features of the '<em>Qualified Name List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.InvocationOrAssignementOrDeclarationStatementImpl <em>Invocation Or Assignement Or Declaration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.InvocationOrAssignementOrDeclarationStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getInvocationOrAssignementOrDeclarationStatement()
	 * @generated
	 */
	int INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT = 97;

	/**
	 * The feature id for the '<em><b>Type Part OR assigned Part OR invocation Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__TYPE_PART_OR_ASSIGNED_PART_OR_INVOCATION_PART = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Declaration Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__VARIABLE_DECLARATION_COMPLETION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assignment Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__ASSIGNMENT_COMPLETION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Invocation Or Assignement Or Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.SuperInvocationStatementImpl <em>Super Invocation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.SuperInvocationStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getSuperInvocationStatement()
	 * @generated
	 */
	int SUPER_INVOCATION_STATEMENT = 98;

	/**
	 * The feature id for the '<em><b>super</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INVOCATION_STATEMENT__SUPER = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Super Invocation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INVOCATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.ThisInvocationStatementImpl <em>This Invocation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.ThisInvocationStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getThisInvocationStatement()
	 * @generated
	 */
	int THIS_INVOCATION_STATEMENT = 99;

	/**
	 * The feature id for the '<em><b>this</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_INVOCATION_STATEMENT__THIS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignment Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_INVOCATION_STATEMENT__ASSIGNMENT_COMPLETION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>This Invocation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_INVOCATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alfDsl.impl.InstanceCreationInvocationStatementImpl <em>Instance Creation Invocation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.InstanceCreationInvocationStatementImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getInstanceCreationInvocationStatement()
	 * @generated
	 */
	int INSTANCE_CREATION_INVOCATION_STATEMENT = 100;

	/**
	 * The feature id for the '<em><b>new</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_INVOCATION_STATEMENT__NEW = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Creation Invocation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_INVOCATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alfDsl.impl.VariableDeclarationCompletionImpl <em>Variable Declaration Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.VariableDeclarationCompletionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getVariableDeclarationCompletion()
	 * @generated
	 */
	int VARIABLE_DECLARATION_COMPLETION = 101;

	/**
	 * The feature id for the '<em><b>Multiplicity Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_COMPLETION__MULTIPLICITY_INDICATOR = 0;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_COMPLETION__VARIABLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_COMPLETION__INIT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_COMPLETION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alfDsl.impl.AssignmentCompletionImpl <em>Assignment Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.impl.AssignmentCompletionImpl
	 * @see alfDsl.impl.AlfDslPackageImpl#getAssignmentCompletion()
	 * @generated
	 */
	int ASSIGNMENT_COMPLETION = 102;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_COMPLETION__OP = 0;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_COMPLETION__RIGHT_HAND_SIDE = 1;

	/**
	 * The number of structural features of the '<em>Assignment Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_COMPLETION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alfDsl.BooleanValue <em>Boolean Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.BooleanValue
	 * @see alfDsl.impl.AlfDslPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 103;

	/**
	 * The meta object id for the '{@link alfDsl.LinkOperationKind <em>Link Operation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.LinkOperationKind
	 * @see alfDsl.impl.AlfDslPackageImpl#getLinkOperationKind()
	 * @generated
	 */
	int LINK_OPERATION_KIND = 104;

	/**
	 * The meta object id for the '{@link alfDsl.SelectOrRejectOperator <em>Select Or Reject Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.SelectOrRejectOperator
	 * @see alfDsl.impl.AlfDslPackageImpl#getSelectOrRejectOperator()
	 * @generated
	 */
	int SELECT_OR_REJECT_OPERATOR = 105;

	/**
	 * The meta object id for the '{@link alfDsl.CollectOrIterateOperator <em>Collect Or Iterate Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.CollectOrIterateOperator
	 * @see alfDsl.impl.AlfDslPackageImpl#getCollectOrIterateOperator()
	 * @generated
	 */
	int COLLECT_OR_ITERATE_OPERATOR = 106;

	/**
	 * The meta object id for the '{@link alfDsl.ForAllOrExistsOrOneOperator <em>For All Or Exists Or One Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.ForAllOrExistsOrOneOperator
	 * @see alfDsl.impl.AlfDslPackageImpl#getForAllOrExistsOrOneOperator()
	 * @generated
	 */
	int FOR_ALL_OR_EXISTS_OR_ONE_OPERATOR = 107;

	/**
	 * The meta object id for the '{@link alfDsl.AnnotationKind <em>Annotation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.AnnotationKind
	 * @see alfDsl.impl.AlfDslPackageImpl#getAnnotationKind()
	 * @generated
	 */
	int ANNOTATION_KIND = 108;

	/**
	 * The meta object id for the '{@link alfDsl.AssignmentOperator <em>Assignment Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alfDsl.AssignmentOperator
	 * @see alfDsl.impl.AlfDslPackageImpl#getAssignmentOperator()
	 * @generated
	 */
	int ASSIGNMENT_OPERATOR = 109;


	/**
	 * Returns the meta object for class '{@link alfDsl.CLASSSTRUCT <em>CLASSSTRUCT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSSTRUCT</em>'.
	 * @see alfDsl.CLASSSTRUCT
	 * @generated
	 */
	EClass getCLASSSTRUCT();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.CLASSSTRUCT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alfDsl.CLASSSTRUCT#getName()
	 * @see #getCLASSSTRUCT()
	 * @generated
	 */
	EAttribute getCLASSSTRUCT_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.CLASSSTRUCT#getClsop <em>Clsop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clsop</em>'.
	 * @see alfDsl.CLASSSTRUCT#getClsop()
	 * @see #getCLASSSTRUCT()
	 * @generated
	 */
	EReference getCLASSSTRUCT_Clsop();

	/**
	 * Returns the meta object for class '{@link alfDsl.CLASSOP <em>CLASSOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSOP</em>'.
	 * @see alfDsl.CLASSOP
	 * @generated
	 */
	EClass getCLASSOP();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.CLASSOP#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alfDsl.CLASSOP#getName()
	 * @see #getCLASSOP()
	 * @generated
	 */
	EAttribute getCLASSOP_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.CLASSOP#getStat <em>Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stat</em>'.
	 * @see alfDsl.CLASSOP#getStat()
	 * @see #getCLASSOP()
	 * @generated
	 */
	EReference getCLASSOP_Stat();

	/**
	 * Returns the meta object for class '{@link alfDsl.LITERAL <em>LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LITERAL</em>'.
	 * @see alfDsl.LITERAL
	 * @generated
	 */
	EClass getLITERAL();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.LITERAL#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.LITERAL#getSuffix()
	 * @see #getLITERAL()
	 * @generated
	 */
	EReference getLITERAL_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.BOOLEAN_LITERAL <em>BOOLEAN LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOOLEAN LITERAL</em>'.
	 * @see alfDsl.BOOLEAN_LITERAL
	 * @generated
	 */
	EClass getBOOLEAN_LITERAL();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.BOOLEAN_LITERAL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see alfDsl.BOOLEAN_LITERAL#getValue()
	 * @see #getBOOLEAN_LITERAL()
	 * @generated
	 */
	EAttribute getBOOLEAN_LITERAL_Value();

	/**
	 * Returns the meta object for class '{@link alfDsl.NUMBER_LITERAL <em>NUMBER LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NUMBER LITERAL</em>'.
	 * @see alfDsl.NUMBER_LITERAL
	 * @generated
	 */
	EClass getNUMBER_LITERAL();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.NUMBER_LITERAL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see alfDsl.NUMBER_LITERAL#getValue()
	 * @see #getNUMBER_LITERAL()
	 * @generated
	 */
	EAttribute getNUMBER_LITERAL_Value();

	/**
	 * Returns the meta object for class '{@link alfDsl.INTEGER_LITERAL <em>INTEGER LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INTEGER LITERAL</em>'.
	 * @see alfDsl.INTEGER_LITERAL
	 * @generated
	 */
	EClass getINTEGER_LITERAL();

	/**
	 * Returns the meta object for class '{@link alfDsl.UNLIMITED_LITERAL <em>UNLIMITED LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UNLIMITED LITERAL</em>'.
	 * @see alfDsl.UNLIMITED_LITERAL
	 * @generated
	 */
	EClass getUNLIMITED_LITERAL();

	/**
	 * Returns the meta object for class '{@link alfDsl.STRING_LITERAL <em>STRING LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STRING LITERAL</em>'.
	 * @see alfDsl.STRING_LITERAL
	 * @generated
	 */
	EClass getSTRING_LITERAL();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.STRING_LITERAL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see alfDsl.STRING_LITERAL#getValue()
	 * @see #getSTRING_LITERAL()
	 * @generated
	 */
	EAttribute getSTRING_LITERAL_Value();

	/**
	 * Returns the meta object for class '{@link alfDsl.NameExpression <em>Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Expression</em>'.
	 * @see alfDsl.NameExpression
	 * @generated
	 */
	EClass getNameExpression();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.NameExpression#getPrefixOp <em>Prefix Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix Op</em>'.
	 * @see alfDsl.NameExpression#getPrefixOp()
	 * @see #getNameExpression()
	 * @generated
	 */
	EAttribute getNameExpression_PrefixOp();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.NameExpression#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see alfDsl.NameExpression#getPath()
	 * @see #getNameExpression()
	 * @generated
	 */
	EReference getNameExpression_Path();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.NameExpression#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see alfDsl.NameExpression#getId()
	 * @see #getNameExpression()
	 * @generated
	 */
	EAttribute getNameExpression_Id();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.NameExpression#getInvocationCompletion <em>Invocation Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invocation Completion</em>'.
	 * @see alfDsl.NameExpression#getInvocationCompletion()
	 * @see #getNameExpression()
	 * @generated
	 */
	EReference getNameExpression_InvocationCompletion();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.NameExpression#getSequenceConstructionCompletion <em>Sequence Construction Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Construction Completion</em>'.
	 * @see alfDsl.NameExpression#getSequenceConstructionCompletion()
	 * @see #getNameExpression()
	 * @generated
	 */
	EReference getNameExpression_SequenceConstructionCompletion();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.NameExpression#getPostfixOp <em>Postfix Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postfix Op</em>'.
	 * @see alfDsl.NameExpression#getPostfixOp()
	 * @see #getNameExpression()
	 * @generated
	 */
	EAttribute getNameExpression_PostfixOp();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.NameExpression#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.NameExpression#getSuffix()
	 * @see #getNameExpression()
	 * @generated
	 */
	EReference getNameExpression_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.QualifiedNamePath <em>Qualified Name Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Name Path</em>'.
	 * @see alfDsl.QualifiedNamePath
	 * @generated
	 */
	EClass getQualifiedNamePath();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.QualifiedNamePath#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespace</em>'.
	 * @see alfDsl.QualifiedNamePath#getNamespace()
	 * @see #getQualifiedNamePath()
	 * @generated
	 */
	EReference getQualifiedNamePath_Namespace();

	/**
	 * Returns the meta object for class '{@link alfDsl.UnqualifiedName <em>Unqualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unqualified Name</em>'.
	 * @see alfDsl.UnqualifiedName
	 * @generated
	 */
	EClass getUnqualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.UnqualifiedName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alfDsl.UnqualifiedName#getName()
	 * @see #getUnqualifiedName()
	 * @generated
	 */
	EAttribute getUnqualifiedName_Name();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.UnqualifiedName#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Binding</em>'.
	 * @see alfDsl.UnqualifiedName#getTemplateBinding()
	 * @see #getUnqualifiedName()
	 * @generated
	 */
	EReference getUnqualifiedName_TemplateBinding();

	/**
	 * Returns the meta object for class '{@link alfDsl.TemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Binding</em>'.
	 * @see alfDsl.TemplateBinding
	 * @generated
	 */
	EClass getTemplateBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.TemplateBinding#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see alfDsl.TemplateBinding#getBindings()
	 * @see #getTemplateBinding()
	 * @generated
	 */
	EReference getTemplateBinding_Bindings();

	/**
	 * Returns the meta object for class '{@link alfDsl.NamedTemplateBinding <em>Named Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Template Binding</em>'.
	 * @see alfDsl.NamedTemplateBinding
	 * @generated
	 */
	EClass getNamedTemplateBinding();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.NamedTemplateBinding#getFormal <em>Formal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal</em>'.
	 * @see alfDsl.NamedTemplateBinding#getFormal()
	 * @see #getNamedTemplateBinding()
	 * @generated
	 */
	EAttribute getNamedTemplateBinding_Formal();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.NamedTemplateBinding#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actual</em>'.
	 * @see alfDsl.NamedTemplateBinding#getActual()
	 * @see #getNamedTemplateBinding()
	 * @generated
	 */
	EReference getNamedTemplateBinding_Actual();

	/**
	 * Returns the meta object for class '{@link alfDsl.QualifiedNameWithBinding <em>Qualified Name With Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Name With Binding</em>'.
	 * @see alfDsl.QualifiedNameWithBinding
	 * @generated
	 */
	EClass getQualifiedNameWithBinding();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.QualifiedNameWithBinding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see alfDsl.QualifiedNameWithBinding#getId()
	 * @see #getQualifiedNameWithBinding()
	 * @generated
	 */
	EAttribute getQualifiedNameWithBinding_Id();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.QualifiedNameWithBinding#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see alfDsl.QualifiedNameWithBinding#getBinding()
	 * @see #getQualifiedNameWithBinding()
	 * @generated
	 */
	EReference getQualifiedNameWithBinding_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.QualifiedNameWithBinding#getRemaining <em>Remaining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remaining</em>'.
	 * @see alfDsl.QualifiedNameWithBinding#getRemaining()
	 * @see #getQualifiedNameWithBinding()
	 * @generated
	 */
	EReference getQualifiedNameWithBinding_Remaining();

	/**
	 * Returns the meta object for class '{@link alfDsl.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple</em>'.
	 * @see alfDsl.Tuple
	 * @generated
	 */
	EClass getTuple();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.Tuple#getTupleElements <em>Tuple Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Elements</em>'.
	 * @see alfDsl.Tuple#getTupleElements()
	 * @see #getTuple()
	 * @generated
	 */
	EReference getTuple_TupleElements();

	/**
	 * Returns the meta object for class '{@link alfDsl.TupleElement <em>Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Element</em>'.
	 * @see alfDsl.TupleElement
	 * @generated
	 */
	EClass getTupleElement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.TupleElement#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see alfDsl.TupleElement#getArgument()
	 * @see #getTupleElement()
	 * @generated
	 */
	EReference getTupleElement_Argument();

	/**
	 * Returns the meta object for class '{@link alfDsl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see alfDsl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link alfDsl.ConditionalTestExpression <em>Conditional Test Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Test Expression</em>'.
	 * @see alfDsl.ConditionalTestExpression
	 * @generated
	 */
	EClass getConditionalTestExpression();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ConditionalTestExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see alfDsl.ConditionalTestExpression#getExp()
	 * @see #getConditionalTestExpression()
	 * @generated
	 */
	EReference getConditionalTestExpression_Exp();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ConditionalTestExpression#getWhenTrue <em>When True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When True</em>'.
	 * @see alfDsl.ConditionalTestExpression#getWhenTrue()
	 * @see #getConditionalTestExpression()
	 * @generated
	 */
	EReference getConditionalTestExpression_WhenTrue();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ConditionalTestExpression#getWhenFalse <em>When False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When False</em>'.
	 * @see alfDsl.ConditionalTestExpression#getWhenFalse()
	 * @see #getConditionalTestExpression()
	 * @generated
	 */
	EReference getConditionalTestExpression_WhenFalse();

	/**
	 * Returns the meta object for class '{@link alfDsl.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Or Expression</em>'.
	 * @see alfDsl.ConditionalOrExpression
	 * @generated
	 */
	EClass getConditionalOrExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.ConditionalOrExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see alfDsl.ConditionalOrExpression#getExp()
	 * @see #getConditionalOrExpression()
	 * @generated
	 */
	EReference getConditionalOrExpression_Exp();

	/**
	 * Returns the meta object for class '{@link alfDsl.ConditionalAndExpression <em>Conditional And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional And Expression</em>'.
	 * @see alfDsl.ConditionalAndExpression
	 * @generated
	 */
	EClass getConditionalAndExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.ConditionalAndExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see alfDsl.ConditionalAndExpression#getExp()
	 * @see #getConditionalAndExpression()
	 * @generated
	 */
	EReference getConditionalAndExpression_Exp();

	/**
	 * Returns the meta object for class '{@link alfDsl.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusive Or Expression</em>'.
	 * @see alfDsl.InclusiveOrExpression
	 * @generated
	 */
	EClass getInclusiveOrExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.InclusiveOrExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see alfDsl.InclusiveOrExpression#getExp()
	 * @see #getInclusiveOrExpression()
	 * @generated
	 */
	EReference getInclusiveOrExpression_Exp();

	/**
	 * Returns the meta object for class '{@link alfDsl.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Or Expression</em>'.
	 * @see alfDsl.ExclusiveOrExpression
	 * @generated
	 */
	EClass getExclusiveOrExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.ExclusiveOrExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see alfDsl.ExclusiveOrExpression#getExp()
	 * @see #getExclusiveOrExpression()
	 * @generated
	 */
	EReference getExclusiveOrExpression_Exp();

	/**
	 * Returns the meta object for class '{@link alfDsl.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see alfDsl.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.AndExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see alfDsl.AndExpression#getExp()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Exp();

	/**
	 * Returns the meta object for class '{@link alfDsl.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Expression</em>'.
	 * @see alfDsl.EqualityExpression
	 * @generated
	 */
	EClass getEqualityExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.EqualityExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see alfDsl.EqualityExpression#getExp()
	 * @see #getEqualityExpression()
	 * @generated
	 */
	EReference getEqualityExpression_Exp();

	/**
	 * Returns the meta object for the attribute list '{@link alfDsl.EqualityExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Op</em>'.
	 * @see alfDsl.EqualityExpression#getOp()
	 * @see #getEqualityExpression()
	 * @generated
	 */
	EAttribute getEqualityExpression_Op();

	/**
	 * Returns the meta object for class '{@link alfDsl.ClassificationExpression <em>Classification Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Expression</em>'.
	 * @see alfDsl.ClassificationExpression
	 * @generated
	 */
	EClass getClassificationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ClassificationExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see alfDsl.ClassificationExpression#getExp()
	 * @see #getClassificationExpression()
	 * @generated
	 */
	EReference getClassificationExpression_Exp();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.ClassificationExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see alfDsl.ClassificationExpression#getOp()
	 * @see #getClassificationExpression()
	 * @generated
	 */
	EAttribute getClassificationExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ClassificationExpression#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Name</em>'.
	 * @see alfDsl.ClassificationExpression#getTypeName()
	 * @see #getClassificationExpression()
	 * @generated
	 */
	EReference getClassificationExpression_TypeName();

	/**
	 * Returns the meta object for class '{@link alfDsl.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see alfDsl.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.RelationalExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see alfDsl.RelationalExpression#getLeft()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Left();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.RelationalExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see alfDsl.RelationalExpression#getOp()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.RelationalExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see alfDsl.RelationalExpression#getRight()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Right();

	/**
	 * Returns the meta object for class '{@link alfDsl.ShiftExpression <em>Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Expression</em>'.
	 * @see alfDsl.ShiftExpression
	 * @generated
	 */
	EClass getShiftExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.ShiftExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see alfDsl.ShiftExpression#getExp()
	 * @see #getShiftExpression()
	 * @generated
	 */
	EReference getShiftExpression_Exp();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.ShiftExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see alfDsl.ShiftExpression#getOp()
	 * @see #getShiftExpression()
	 * @generated
	 */
	EAttribute getShiftExpression_Op();

	/**
	 * Returns the meta object for class '{@link alfDsl.AdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Expression</em>'.
	 * @see alfDsl.AdditiveExpression
	 * @generated
	 */
	EClass getAdditiveExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.AdditiveExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see alfDsl.AdditiveExpression#getExp()
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	EReference getAdditiveExpression_Exp();

	/**
	 * Returns the meta object for the attribute list '{@link alfDsl.AdditiveExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Op</em>'.
	 * @see alfDsl.AdditiveExpression#getOp()
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	EAttribute getAdditiveExpression_Op();

	/**
	 * Returns the meta object for class '{@link alfDsl.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicative Expression</em>'.
	 * @see alfDsl.MultiplicativeExpression
	 * @generated
	 */
	EClass getMultiplicativeExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.MultiplicativeExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see alfDsl.MultiplicativeExpression#getExp()
	 * @see #getMultiplicativeExpression()
	 * @generated
	 */
	EReference getMultiplicativeExpression_Exp();

	/**
	 * Returns the meta object for the attribute list '{@link alfDsl.MultiplicativeExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Op</em>'.
	 * @see alfDsl.MultiplicativeExpression#getOp()
	 * @see #getMultiplicativeExpression()
	 * @generated
	 */
	EAttribute getMultiplicativeExpression_Op();

	/**
	 * Returns the meta object for class '{@link alfDsl.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see alfDsl.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.UnaryExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see alfDsl.UnaryExpression#getOp()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.UnaryExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see alfDsl.UnaryExpression#getExp()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Exp();

	/**
	 * Returns the meta object for class '{@link alfDsl.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Expression</em>'.
	 * @see alfDsl.PrimaryExpression
	 * @generated
	 */
	EClass getPrimaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.PrimaryExpression#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix</em>'.
	 * @see alfDsl.PrimaryExpression#getPrefix()
	 * @see #getPrimaryExpression()
	 * @generated
	 */
	EReference getPrimaryExpression_Prefix();

	/**
	 * Returns the meta object for class '{@link alfDsl.SuffixExpression <em>Suffix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suffix Expression</em>'.
	 * @see alfDsl.SuffixExpression
	 * @generated
	 */
	EClass getSuffixExpression();

	/**
	 * Returns the meta object for class '{@link alfDsl.OperationCallExpression <em>Operation Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Expression</em>'.
	 * @see alfDsl.OperationCallExpression
	 * @generated
	 */
	EClass getOperationCallExpression();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.OperationCallExpression#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see alfDsl.OperationCallExpression#getOperationName()
	 * @see #getOperationCallExpression()
	 * @generated
	 */
	EAttribute getOperationCallExpression_OperationName();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.OperationCallExpression#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple</em>'.
	 * @see alfDsl.OperationCallExpression#getTuple()
	 * @see #getOperationCallExpression()
	 * @generated
	 */
	EReference getOperationCallExpression_Tuple();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.OperationCallExpression#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.OperationCallExpression#getSuffix()
	 * @see #getOperationCallExpression()
	 * @generated
	 */
	EReference getOperationCallExpression_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.OperationCallExpressionWithoutDot <em>Operation Call Expression Without Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Expression Without Dot</em>'.
	 * @see alfDsl.OperationCallExpressionWithoutDot
	 * @generated
	 */
	EClass getOperationCallExpressionWithoutDot();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.OperationCallExpressionWithoutDot#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see alfDsl.OperationCallExpressionWithoutDot#getOperationName()
	 * @see #getOperationCallExpressionWithoutDot()
	 * @generated
	 */
	EAttribute getOperationCallExpressionWithoutDot_OperationName();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.OperationCallExpressionWithoutDot#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple</em>'.
	 * @see alfDsl.OperationCallExpressionWithoutDot#getTuple()
	 * @see #getOperationCallExpressionWithoutDot()
	 * @generated
	 */
	EReference getOperationCallExpressionWithoutDot_Tuple();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.OperationCallExpressionWithoutDot#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.OperationCallExpressionWithoutDot#getSuffix()
	 * @see #getOperationCallExpressionWithoutDot()
	 * @generated
	 */
	EReference getOperationCallExpressionWithoutDot_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.PropertyCallExpression <em>Property Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Call Expression</em>'.
	 * @see alfDsl.PropertyCallExpression
	 * @generated
	 */
	EClass getPropertyCallExpression();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.PropertyCallExpression#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see alfDsl.PropertyCallExpression#getPropertyName()
	 * @see #getPropertyCallExpression()
	 * @generated
	 */
	EAttribute getPropertyCallExpression_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.PropertyCallExpression#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see alfDsl.PropertyCallExpression#getIndex()
	 * @see #getPropertyCallExpression()
	 * @generated
	 */
	EReference getPropertyCallExpression_Index();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.PropertyCallExpression#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.PropertyCallExpression#getSuffix()
	 * @see #getPropertyCallExpression()
	 * @generated
	 */
	EReference getPropertyCallExpression_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.LinkOperationExpression <em>Link Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Operation Expression</em>'.
	 * @see alfDsl.LinkOperationExpression
	 * @generated
	 */
	EClass getLinkOperationExpression();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.LinkOperationExpression#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see alfDsl.LinkOperationExpression#getKind()
	 * @see #getLinkOperationExpression()
	 * @generated
	 */
	EAttribute getLinkOperationExpression_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.LinkOperationExpression#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple</em>'.
	 * @see alfDsl.LinkOperationExpression#getTuple()
	 * @see #getLinkOperationExpression()
	 * @generated
	 */
	EReference getLinkOperationExpression_Tuple();

	/**
	 * Returns the meta object for class '{@link alfDsl.LinkOperationTuple <em>Link Operation Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Operation Tuple</em>'.
	 * @see alfDsl.LinkOperationTuple
	 * @generated
	 */
	EClass getLinkOperationTuple();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.LinkOperationTuple#getLinkOperationTupleElement <em>Link Operation Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Operation Tuple Element</em>'.
	 * @see alfDsl.LinkOperationTuple#getLinkOperationTupleElement()
	 * @see #getLinkOperationTuple()
	 * @generated
	 */
	EReference getLinkOperationTuple_LinkOperationTupleElement();

	/**
	 * Returns the meta object for class '{@link alfDsl.LinkOperationTupleElement <em>Link Operation Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Operation Tuple Element</em>'.
	 * @see alfDsl.LinkOperationTupleElement
	 * @generated
	 */
	EClass getLinkOperationTupleElement();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.LinkOperationTupleElement#getObjectOrRole <em>Object Or Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Or Role</em>'.
	 * @see alfDsl.LinkOperationTupleElement#getObjectOrRole()
	 * @see #getLinkOperationTupleElement()
	 * @generated
	 */
	EAttribute getLinkOperationTupleElement_ObjectOrRole();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.LinkOperationTupleElement#getRoleIndex <em>Role Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Index</em>'.
	 * @see alfDsl.LinkOperationTupleElement#getRoleIndex()
	 * @see #getLinkOperationTupleElement()
	 * @generated
	 */
	EReference getLinkOperationTupleElement_RoleIndex();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.LinkOperationTupleElement#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see alfDsl.LinkOperationTupleElement#getObject()
	 * @see #getLinkOperationTupleElement()
	 * @generated
	 */
	EAttribute getLinkOperationTupleElement_Object();

	/**
	 * Returns the meta object for class '{@link alfDsl.SequenceOperationExpression <em>Sequence Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Operation Expression</em>'.
	 * @see alfDsl.SequenceOperationExpression
	 * @generated
	 */
	EClass getSequenceOperationExpression();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.SequenceOperationExpression#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see alfDsl.SequenceOperationExpression#getOperationName()
	 * @see #getSequenceOperationExpression()
	 * @generated
	 */
	EAttribute getSequenceOperationExpression_OperationName();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceOperationExpression#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple</em>'.
	 * @see alfDsl.SequenceOperationExpression#getTuple()
	 * @see #getSequenceOperationExpression()
	 * @generated
	 */
	EReference getSequenceOperationExpression_Tuple();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceOperationExpression#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.SequenceOperationExpression#getSuffix()
	 * @see #getSequenceOperationExpression()
	 * @generated
	 */
	EReference getSequenceOperationExpression_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.SequenceReductionExpression <em>Sequence Reduction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Reduction Expression</em>'.
	 * @see alfDsl.SequenceReductionExpression
	 * @generated
	 */
	EClass getSequenceReductionExpression();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.SequenceReductionExpression#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see alfDsl.SequenceReductionExpression#isIsOrdered()
	 * @see #getSequenceReductionExpression()
	 * @generated
	 */
	EAttribute getSequenceReductionExpression_IsOrdered();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceReductionExpression#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see alfDsl.SequenceReductionExpression#getBehavior()
	 * @see #getSequenceReductionExpression()
	 * @generated
	 */
	EReference getSequenceReductionExpression_Behavior();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceReductionExpression#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.SequenceReductionExpression#getSuffix()
	 * @see #getSequenceReductionExpression()
	 * @generated
	 */
	EReference getSequenceReductionExpression_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.SequenceExpansionExpression <em>Sequence Expansion Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Expansion Expression</em>'.
	 * @see alfDsl.SequenceExpansionExpression
	 * @generated
	 */
	EClass getSequenceExpansionExpression();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.SequenceExpansionExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alfDsl.SequenceExpansionExpression#getName()
	 * @see #getSequenceExpansionExpression()
	 * @generated
	 */
	EAttribute getSequenceExpansionExpression_Name();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceExpansionExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see alfDsl.SequenceExpansionExpression#getExpr()
	 * @see #getSequenceExpansionExpression()
	 * @generated
	 */
	EReference getSequenceExpansionExpression_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceExpansionExpression#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.SequenceExpansionExpression#getSuffix()
	 * @see #getSequenceExpansionExpression()
	 * @generated
	 */
	EReference getSequenceExpansionExpression_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.SelectOrRejectOperation <em>Select Or Reject Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Or Reject Operation</em>'.
	 * @see alfDsl.SelectOrRejectOperation
	 * @generated
	 */
	EClass getSelectOrRejectOperation();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.SelectOrRejectOperation#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see alfDsl.SelectOrRejectOperation#getOp()
	 * @see #getSelectOrRejectOperation()
	 * @generated
	 */
	EAttribute getSelectOrRejectOperation_Op();

	/**
	 * Returns the meta object for class '{@link alfDsl.CollectOrIterateOperation <em>Collect Or Iterate Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collect Or Iterate Operation</em>'.
	 * @see alfDsl.CollectOrIterateOperation
	 * @generated
	 */
	EClass getCollectOrIterateOperation();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.CollectOrIterateOperation#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see alfDsl.CollectOrIterateOperation#getOp()
	 * @see #getCollectOrIterateOperation()
	 * @generated
	 */
	EAttribute getCollectOrIterateOperation_Op();

	/**
	 * Returns the meta object for class '{@link alfDsl.ForAllOrExistsOrOneOperation <em>For All Or Exists Or One Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For All Or Exists Or One Operation</em>'.
	 * @see alfDsl.ForAllOrExistsOrOneOperation
	 * @generated
	 */
	EClass getForAllOrExistsOrOneOperation();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.ForAllOrExistsOrOneOperation#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see alfDsl.ForAllOrExistsOrOneOperation#getOp()
	 * @see #getForAllOrExistsOrOneOperation()
	 * @generated
	 */
	EAttribute getForAllOrExistsOrOneOperation_Op();

	/**
	 * Returns the meta object for class '{@link alfDsl.IsUniqueOperation <em>Is Unique Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Unique Operation</em>'.
	 * @see alfDsl.IsUniqueOperation
	 * @generated
	 */
	EClass getIsUniqueOperation();

	/**
	 * Returns the meta object for class '{@link alfDsl.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see alfDsl.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link alfDsl.NonLiteralValueSpecification <em>Non Literal Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Literal Value Specification</em>'.
	 * @see alfDsl.NonLiteralValueSpecification
	 * @generated
	 */
	EClass getNonLiteralValueSpecification();

	/**
	 * Returns the meta object for class '{@link alfDsl.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesized Expression</em>'.
	 * @see alfDsl.ParenthesizedExpression
	 * @generated
	 */
	EClass getParenthesizedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ParenthesizedExpression#getExpOrTypeCast <em>Exp Or Type Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp Or Type Cast</em>'.
	 * @see alfDsl.ParenthesizedExpression#getExpOrTypeCast()
	 * @see #getParenthesizedExpression()
	 * @generated
	 */
	EReference getParenthesizedExpression_ExpOrTypeCast();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ParenthesizedExpression#getCasted <em>Casted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Casted</em>'.
	 * @see alfDsl.ParenthesizedExpression#getCasted()
	 * @see #getParenthesizedExpression()
	 * @generated
	 */
	EReference getParenthesizedExpression_Casted();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ParenthesizedExpression#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.ParenthesizedExpression#getSuffix()
	 * @see #getParenthesizedExpression()
	 * @generated
	 */
	EReference getParenthesizedExpression_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.NullExpression <em>Null Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Expression</em>'.
	 * @see alfDsl.NullExpression
	 * @generated
	 */
	EClass getNullExpression();

	/**
	 * Returns the meta object for class '{@link alfDsl.ThisExpression <em>This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This Expression</em>'.
	 * @see alfDsl.ThisExpression
	 * @generated
	 */
	EClass getThisExpression();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ThisExpression#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.ThisExpression#getSuffix()
	 * @see #getThisExpression()
	 * @generated
	 */
	EReference getThisExpression_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.SuperInvocationExpression <em>Super Invocation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Invocation Expression</em>'.
	 * @see alfDsl.SuperInvocationExpression
	 * @generated
	 */
	EClass getSuperInvocationExpression();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.SuperInvocationExpression#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see alfDsl.SuperInvocationExpression#getClassName()
	 * @see #getSuperInvocationExpression()
	 * @generated
	 */
	EAttribute getSuperInvocationExpression_ClassName();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SuperInvocationExpression#getOperationCallWithoutDot <em>Operation Call Without Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Call Without Dot</em>'.
	 * @see alfDsl.SuperInvocationExpression#getOperationCallWithoutDot()
	 * @see #getSuperInvocationExpression()
	 * @generated
	 */
	EReference getSuperInvocationExpression_OperationCallWithoutDot();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SuperInvocationExpression#getOperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Call</em>'.
	 * @see alfDsl.SuperInvocationExpression#getOperationCall()
	 * @see #getSuperInvocationExpression()
	 * @generated
	 */
	EReference getSuperInvocationExpression_OperationCall();

	/**
	 * Returns the meta object for class '{@link alfDsl.InstanceCreationExpression <em>Instance Creation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Creation Expression</em>'.
	 * @see alfDsl.InstanceCreationExpression
	 * @generated
	 */
	EClass getInstanceCreationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.InstanceCreationExpression#getConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constructor</em>'.
	 * @see alfDsl.InstanceCreationExpression#getConstructor()
	 * @see #getInstanceCreationExpression()
	 * @generated
	 */
	EReference getInstanceCreationExpression_Constructor();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.InstanceCreationExpression#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple</em>'.
	 * @see alfDsl.InstanceCreationExpression#getTuple()
	 * @see #getInstanceCreationExpression()
	 * @generated
	 */
	EReference getInstanceCreationExpression_Tuple();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.InstanceCreationExpression#getSequenceConstuctionCompletion <em>Sequence Constuction Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Constuction Completion</em>'.
	 * @see alfDsl.InstanceCreationExpression#getSequenceConstuctionCompletion()
	 * @see #getInstanceCreationExpression()
	 * @generated
	 */
	EReference getInstanceCreationExpression_SequenceConstuctionCompletion();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.InstanceCreationExpression#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see alfDsl.InstanceCreationExpression#getSuffix()
	 * @see #getInstanceCreationExpression()
	 * @generated
	 */
	EReference getInstanceCreationExpression_Suffix();

	/**
	 * Returns the meta object for class '{@link alfDsl.SequenceConstructionOrAccessCompletion <em>Sequence Construction Or Access Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Construction Or Access Completion</em>'.
	 * @see alfDsl.SequenceConstructionOrAccessCompletion
	 * @generated
	 */
	EClass getSequenceConstructionOrAccessCompletion();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.SequenceConstructionOrAccessCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
	 * @see alfDsl.SequenceConstructionOrAccessCompletion#isMultiplicityIndicator()
	 * @see #getSequenceConstructionOrAccessCompletion()
	 * @generated
	 */
	EAttribute getSequenceConstructionOrAccessCompletion_MultiplicityIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceConstructionOrAccessCompletion#getAccessCompletion <em>Access Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Completion</em>'.
	 * @see alfDsl.SequenceConstructionOrAccessCompletion#getAccessCompletion()
	 * @see #getSequenceConstructionOrAccessCompletion()
	 * @generated
	 */
	EReference getSequenceConstructionOrAccessCompletion_AccessCompletion();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceConstructionOrAccessCompletion#getSequenceCompletion <em>Sequence Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Completion</em>'.
	 * @see alfDsl.SequenceConstructionOrAccessCompletion#getSequenceCompletion()
	 * @see #getSequenceConstructionOrAccessCompletion()
	 * @generated
	 */
	EReference getSequenceConstructionOrAccessCompletion_SequenceCompletion();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceConstructionOrAccessCompletion#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see alfDsl.SequenceConstructionOrAccessCompletion#getExpression()
	 * @see #getSequenceConstructionOrAccessCompletion()
	 * @generated
	 */
	EReference getSequenceConstructionOrAccessCompletion_Expression();

	/**
	 * Returns the meta object for class '{@link alfDsl.AccessCompletion <em>Access Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Completion</em>'.
	 * @see alfDsl.AccessCompletion
	 * @generated
	 */
	EClass getAccessCompletion();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.AccessCompletion#getAccessIndex <em>Access Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Index</em>'.
	 * @see alfDsl.AccessCompletion#getAccessIndex()
	 * @see #getAccessCompletion()
	 * @generated
	 */
	EReference getAccessCompletion_AccessIndex();

	/**
	 * Returns the meta object for class '{@link alfDsl.PartialSequenceConstructionCompletion <em>Partial Sequence Construction Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Sequence Construction Completion</em>'.
	 * @see alfDsl.PartialSequenceConstructionCompletion
	 * @generated
	 */
	EClass getPartialSequenceConstructionCompletion();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.PartialSequenceConstructionCompletion#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see alfDsl.PartialSequenceConstructionCompletion#getExpression()
	 * @see #getPartialSequenceConstructionCompletion()
	 * @generated
	 */
	EReference getPartialSequenceConstructionCompletion_Expression();

	/**
	 * Returns the meta object for class '{@link alfDsl.SequenceConstructionCompletion <em>Sequence Construction Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Construction Completion</em>'.
	 * @see alfDsl.SequenceConstructionCompletion
	 * @generated
	 */
	EClass getSequenceConstructionCompletion();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.SequenceConstructionCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
	 * @see alfDsl.SequenceConstructionCompletion#isMultiplicityIndicator()
	 * @see #getSequenceConstructionCompletion()
	 * @generated
	 */
	EAttribute getSequenceConstructionCompletion_MultiplicityIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceConstructionCompletion#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see alfDsl.SequenceConstructionCompletion#getExpression()
	 * @see #getSequenceConstructionCompletion()
	 * @generated
	 */
	EReference getSequenceConstructionCompletion_Expression();

	/**
	 * Returns the meta object for class '{@link alfDsl.SequenceConstructionExpression <em>Sequence Construction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Construction Expression</em>'.
	 * @see alfDsl.SequenceConstructionExpression
	 * @generated
	 */
	EClass getSequenceConstructionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.SequenceConstructionExpression#getSequenceElement <em>Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Element</em>'.
	 * @see alfDsl.SequenceConstructionExpression#getSequenceElement()
	 * @see #getSequenceConstructionExpression()
	 * @generated
	 */
	EReference getSequenceConstructionExpression_SequenceElement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SequenceConstructionExpression#getRangeUpper <em>Range Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range Upper</em>'.
	 * @see alfDsl.SequenceConstructionExpression#getRangeUpper()
	 * @see #getSequenceConstructionExpression()
	 * @generated
	 */
	EReference getSequenceConstructionExpression_RangeUpper();

	/**
	 * Returns the meta object for class '{@link alfDsl.SequenceElement <em>Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Element</em>'.
	 * @see alfDsl.SequenceElement
	 * @generated
	 */
	EClass getSequenceElement();

	/**
	 * Returns the meta object for class '{@link alfDsl.ClassExtentExpression <em>Class Extent Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Extent Expression</em>'.
	 * @see alfDsl.ClassExtentExpression
	 * @generated
	 */
	EClass getClassExtentExpression();

	/**
	 * Returns the meta object for class '{@link alfDsl.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see alfDsl.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.Block#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see alfDsl.Block#getSequence()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Sequence();

	/**
	 * Returns the meta object for class '{@link alfDsl.StatementSequence <em>Statement Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Sequence</em>'.
	 * @see alfDsl.StatementSequence
	 * @generated
	 */
	EClass getStatementSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.StatementSequence#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see alfDsl.StatementSequence#getStatements()
	 * @see #getStatementSequence()
	 * @generated
	 */
	EReference getStatementSequence_Statements();

	/**
	 * Returns the meta object for class '{@link alfDsl.InlineStatement <em>Inline Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Statement</em>'.
	 * @see alfDsl.InlineStatement
	 * @generated
	 */
	EClass getInlineStatement();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.InlineStatement#getLangageName <em>Langage Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Langage Name</em>'.
	 * @see alfDsl.InlineStatement#getLangageName()
	 * @see #getInlineStatement()
	 * @generated
	 */
	EAttribute getInlineStatement_LangageName();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.InlineStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see alfDsl.InlineStatement#getBody()
	 * @see #getInlineStatement()
	 * @generated
	 */
	EAttribute getInlineStatement_Body();

	/**
	 * Returns the meta object for class '{@link alfDsl.AnnotatedStatement <em>Annotated Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Statement</em>'.
	 * @see alfDsl.AnnotatedStatement
	 * @generated
	 */
	EClass getAnnotatedStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.AnnotatedStatement#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see alfDsl.AnnotatedStatement#getAnnotation()
	 * @see #getAnnotatedStatement()
	 * @generated
	 */
	EReference getAnnotatedStatement_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.AnnotatedStatement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see alfDsl.AnnotatedStatement#getBlock()
	 * @see #getAnnotatedStatement()
	 * @generated
	 */
	EReference getAnnotatedStatement_Block();

	/**
	 * Returns the meta object for class '{@link alfDsl.DocumentedStatement <em>Documented Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documented Statement</em>'.
	 * @see alfDsl.DocumentedStatement
	 * @generated
	 */
	EClass getDocumentedStatement();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.DocumentedStatement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see alfDsl.DocumentedStatement#getComment()
	 * @see #getDocumentedStatement()
	 * @generated
	 */
	EAttribute getDocumentedStatement_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.DocumentedStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see alfDsl.DocumentedStatement#getStatement()
	 * @see #getDocumentedStatement()
	 * @generated
	 */
	EReference getDocumentedStatement_Statement();

	/**
	 * Returns the meta object for class '{@link alfDsl.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see alfDsl.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link alfDsl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see alfDsl.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.Annotation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see alfDsl.Annotation#getKind()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Kind();

	/**
	 * Returns the meta object for the attribute list '{@link alfDsl.Annotation#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see alfDsl.Annotation#getArgs()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Args();

	/**
	 * Returns the meta object for class '{@link alfDsl.BlockStatement <em>Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Statement</em>'.
	 * @see alfDsl.BlockStatement
	 * @generated
	 */
	EClass getBlockStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.BlockStatement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see alfDsl.BlockStatement#getBlock()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_Block();

	/**
	 * Returns the meta object for class '{@link alfDsl.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Statement</em>'.
	 * @see alfDsl.EmptyStatement
	 * @generated
	 */
	EClass getEmptyStatement();

	/**
	 * Returns the meta object for class '{@link alfDsl.LocalNameDeclarationStatement <em>Local Name Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Name Declaration Statement</em>'.
	 * @see alfDsl.LocalNameDeclarationStatement
	 * @generated
	 */
	EClass getLocalNameDeclarationStatement();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.LocalNameDeclarationStatement#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see alfDsl.LocalNameDeclarationStatement#getVarName()
	 * @see #getLocalNameDeclarationStatement()
	 * @generated
	 */
	EAttribute getLocalNameDeclarationStatement_VarName();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.LocalNameDeclarationStatement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see alfDsl.LocalNameDeclarationStatement#getType()
	 * @see #getLocalNameDeclarationStatement()
	 * @generated
	 */
	EReference getLocalNameDeclarationStatement_Type();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.LocalNameDeclarationStatement#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
	 * @see alfDsl.LocalNameDeclarationStatement#isMultiplicityIndicator()
	 * @see #getLocalNameDeclarationStatement()
	 * @generated
	 */
	EAttribute getLocalNameDeclarationStatement_MultiplicityIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.LocalNameDeclarationStatement#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see alfDsl.LocalNameDeclarationStatement#getInit()
	 * @see #getLocalNameDeclarationStatement()
	 * @generated
	 */
	EReference getLocalNameDeclarationStatement_Init();

	/**
	 * Returns the meta object for class '{@link alfDsl.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see alfDsl.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.IfStatement#getSequentialClausses <em>Sequential Clausses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequential Clausses</em>'.
	 * @see alfDsl.IfStatement#getSequentialClausses()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_SequentialClausses();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.IfStatement#getFinalClause <em>Final Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Clause</em>'.
	 * @see alfDsl.IfStatement#getFinalClause()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_FinalClause();

	/**
	 * Returns the meta object for class '{@link alfDsl.SequentialClauses <em>Sequential Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Clauses</em>'.
	 * @see alfDsl.SequentialClauses
	 * @generated
	 */
	EClass getSequentialClauses();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.SequentialClauses#getConccurentClauses <em>Conccurent Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conccurent Clauses</em>'.
	 * @see alfDsl.SequentialClauses#getConccurentClauses()
	 * @see #getSequentialClauses()
	 * @generated
	 */
	EReference getSequentialClauses_ConccurentClauses();

	/**
	 * Returns the meta object for class '{@link alfDsl.ConcurrentClauses <em>Concurrent Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrent Clauses</em>'.
	 * @see alfDsl.ConcurrentClauses
	 * @generated
	 */
	EClass getConcurrentClauses();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.ConcurrentClauses#getNonFinalClause <em>Non Final Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Non Final Clause</em>'.
	 * @see alfDsl.ConcurrentClauses#getNonFinalClause()
	 * @see #getConcurrentClauses()
	 * @generated
	 */
	EReference getConcurrentClauses_NonFinalClause();

	/**
	 * Returns the meta object for class '{@link alfDsl.NonFinalClause <em>Non Final Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Final Clause</em>'.
	 * @see alfDsl.NonFinalClause
	 * @generated
	 */
	EClass getNonFinalClause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.NonFinalClause#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see alfDsl.NonFinalClause#getCondition()
	 * @see #getNonFinalClause()
	 * @generated
	 */
	EReference getNonFinalClause_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.NonFinalClause#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see alfDsl.NonFinalClause#getBlock()
	 * @see #getNonFinalClause()
	 * @generated
	 */
	EReference getNonFinalClause_Block();

	/**
	 * Returns the meta object for class '{@link alfDsl.FinalClause <em>Final Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Clause</em>'.
	 * @see alfDsl.FinalClause
	 * @generated
	 */
	EClass getFinalClause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.FinalClause#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see alfDsl.FinalClause#getBlock()
	 * @see #getFinalClause()
	 * @generated
	 */
	EReference getFinalClause_Block();

	/**
	 * Returns the meta object for class '{@link alfDsl.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Statement</em>'.
	 * @see alfDsl.SwitchStatement
	 * @generated
	 */
	EClass getSwitchStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SwitchStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see alfDsl.SwitchStatement#getExpression()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.SwitchStatement#getSwitchClause <em>Switch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switch Clause</em>'.
	 * @see alfDsl.SwitchStatement#getSwitchClause()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_SwitchClause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SwitchStatement#getDefaultClause <em>Default Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Clause</em>'.
	 * @see alfDsl.SwitchStatement#getDefaultClause()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_DefaultClause();

	/**
	 * Returns the meta object for class '{@link alfDsl.SwitchClause <em>Switch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Clause</em>'.
	 * @see alfDsl.SwitchClause
	 * @generated
	 */
	EClass getSwitchClause();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.SwitchClause#getSwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switch Case</em>'.
	 * @see alfDsl.SwitchClause#getSwitchCase()
	 * @see #getSwitchClause()
	 * @generated
	 */
	EReference getSwitchClause_SwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SwitchClause#getStatementSequence <em>Statement Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
	 * @see alfDsl.SwitchClause#getStatementSequence()
	 * @see #getSwitchClause()
	 * @generated
	 */
	EReference getSwitchClause_StatementSequence();

	/**
	 * Returns the meta object for class '{@link alfDsl.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case</em>'.
	 * @see alfDsl.SwitchCase
	 * @generated
	 */
	EClass getSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SwitchCase#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see alfDsl.SwitchCase#getExpression()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EReference getSwitchCase_Expression();

	/**
	 * Returns the meta object for class '{@link alfDsl.SwitchDefaultClause <em>Switch Default Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Default Clause</em>'.
	 * @see alfDsl.SwitchDefaultClause
	 * @generated
	 */
	EClass getSwitchDefaultClause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SwitchDefaultClause#getStatementSequence <em>Statement Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
	 * @see alfDsl.SwitchDefaultClause#getStatementSequence()
	 * @see #getSwitchDefaultClause()
	 * @generated
	 */
	EReference getSwitchDefaultClause_StatementSequence();

	/**
	 * Returns the meta object for class '{@link alfDsl.NonEmptyStatementSequence <em>Non Empty Statement Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Empty Statement Sequence</em>'.
	 * @see alfDsl.NonEmptyStatementSequence
	 * @generated
	 */
	EClass getNonEmptyStatementSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.NonEmptyStatementSequence#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see alfDsl.NonEmptyStatementSequence#getStatement()
	 * @see #getNonEmptyStatementSequence()
	 * @generated
	 */
	EReference getNonEmptyStatementSequence_Statement();

	/**
	 * Returns the meta object for class '{@link alfDsl.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see alfDsl.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.WhileStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see alfDsl.WhileStatement#getCondition()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.WhileStatement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see alfDsl.WhileStatement#getBlock()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Block();

	/**
	 * Returns the meta object for class '{@link alfDsl.DoStatement <em>Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Statement</em>'.
	 * @see alfDsl.DoStatement
	 * @generated
	 */
	EClass getDoStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.DoStatement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see alfDsl.DoStatement#getBlock()
	 * @see #getDoStatement()
	 * @generated
	 */
	EReference getDoStatement_Block();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.DoStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see alfDsl.DoStatement#getCondition()
	 * @see #getDoStatement()
	 * @generated
	 */
	EReference getDoStatement_Condition();

	/**
	 * Returns the meta object for class '{@link alfDsl.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see alfDsl.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ForStatement#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see alfDsl.ForStatement#getControl()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Control();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ForStatement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see alfDsl.ForStatement#getBlock()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Block();

	/**
	 * Returns the meta object for class '{@link alfDsl.ForControl <em>For Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Control</em>'.
	 * @see alfDsl.ForControl
	 * @generated
	 */
	EClass getForControl();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.ForControl#getLoopVariableDefinition <em>Loop Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Variable Definition</em>'.
	 * @see alfDsl.ForControl#getLoopVariableDefinition()
	 * @see #getForControl()
	 * @generated
	 */
	EReference getForControl_LoopVariableDefinition();

	/**
	 * Returns the meta object for class '{@link alfDsl.LoopVariableDefinition <em>Loop Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Variable Definition</em>'.
	 * @see alfDsl.LoopVariableDefinition
	 * @generated
	 */
	EClass getLoopVariableDefinition();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.LoopVariableDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alfDsl.LoopVariableDefinition#getName()
	 * @see #getLoopVariableDefinition()
	 * @generated
	 */
	EAttribute getLoopVariableDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.LoopVariableDefinition#getExpression1 <em>Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression1</em>'.
	 * @see alfDsl.LoopVariableDefinition#getExpression1()
	 * @see #getLoopVariableDefinition()
	 * @generated
	 */
	EReference getLoopVariableDefinition_Expression1();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.LoopVariableDefinition#getExpression2 <em>Expression2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression2</em>'.
	 * @see alfDsl.LoopVariableDefinition#getExpression2()
	 * @see #getLoopVariableDefinition()
	 * @generated
	 */
	EReference getLoopVariableDefinition_Expression2();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.LoopVariableDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see alfDsl.LoopVariableDefinition#getType()
	 * @see #getLoopVariableDefinition()
	 * @generated
	 */
	EReference getLoopVariableDefinition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.LoopVariableDefinition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see alfDsl.LoopVariableDefinition#getExpression()
	 * @see #getLoopVariableDefinition()
	 * @generated
	 */
	EReference getLoopVariableDefinition_Expression();

	/**
	 * Returns the meta object for class '{@link alfDsl.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Statement</em>'.
	 * @see alfDsl.BreakStatement
	 * @generated
	 */
	EClass getBreakStatement();

	/**
	 * Returns the meta object for class '{@link alfDsl.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see alfDsl.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ReturnStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see alfDsl.ReturnStatement#getExpression()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_Expression();

	/**
	 * Returns the meta object for class '{@link alfDsl.AcceptStatement <em>Accept Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Statement</em>'.
	 * @see alfDsl.AcceptStatement
	 * @generated
	 */
	EClass getAcceptStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.AcceptStatement#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clause</em>'.
	 * @see alfDsl.AcceptStatement#getClause()
	 * @see #getAcceptStatement()
	 * @generated
	 */
	EReference getAcceptStatement_Clause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.AcceptStatement#getSimpleAccept <em>Simple Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Accept</em>'.
	 * @see alfDsl.AcceptStatement#getSimpleAccept()
	 * @see #getAcceptStatement()
	 * @generated
	 */
	EReference getAcceptStatement_SimpleAccept();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.AcceptStatement#getCompoundAccept <em>Compound Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compound Accept</em>'.
	 * @see alfDsl.AcceptStatement#getCompoundAccept()
	 * @see #getAcceptStatement()
	 * @generated
	 */
	EReference getAcceptStatement_CompoundAccept();

	/**
	 * Returns the meta object for class '{@link alfDsl.SimpleAcceptStatementCompletion <em>Simple Accept Statement Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Accept Statement Completion</em>'.
	 * @see alfDsl.SimpleAcceptStatementCompletion
	 * @generated
	 */
	EClass getSimpleAcceptStatementCompletion();

	/**
	 * Returns the meta object for class '{@link alfDsl.CompoundAcceptStatementCompletion <em>Compound Accept Statement Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Accept Statement Completion</em>'.
	 * @see alfDsl.CompoundAcceptStatementCompletion
	 * @generated
	 */
	EClass getCompoundAcceptStatementCompletion();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.CompoundAcceptStatementCompletion#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see alfDsl.CompoundAcceptStatementCompletion#getBlock()
	 * @see #getCompoundAcceptStatementCompletion()
	 * @generated
	 */
	EReference getCompoundAcceptStatementCompletion_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.CompoundAcceptStatementCompletion#getAcceptBlock <em>Accept Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accept Block</em>'.
	 * @see alfDsl.CompoundAcceptStatementCompletion#getAcceptBlock()
	 * @see #getCompoundAcceptStatementCompletion()
	 * @generated
	 */
	EReference getCompoundAcceptStatementCompletion_AcceptBlock();

	/**
	 * Returns the meta object for class '{@link alfDsl.AcceptBlock <em>Accept Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Block</em>'.
	 * @see alfDsl.AcceptBlock
	 * @generated
	 */
	EClass getAcceptBlock();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.AcceptBlock#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clause</em>'.
	 * @see alfDsl.AcceptBlock#getClause()
	 * @see #getAcceptBlock()
	 * @generated
	 */
	EReference getAcceptBlock_Clause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.AcceptBlock#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see alfDsl.AcceptBlock#getBlock()
	 * @see #getAcceptBlock()
	 * @generated
	 */
	EReference getAcceptBlock_Block();

	/**
	 * Returns the meta object for class '{@link alfDsl.AcceptClause <em>Accept Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Clause</em>'.
	 * @see alfDsl.AcceptClause
	 * @generated
	 */
	EClass getAcceptClause();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.AcceptClause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alfDsl.AcceptClause#getName()
	 * @see #getAcceptClause()
	 * @generated
	 */
	EAttribute getAcceptClause_Name();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.AcceptClause#getQualifiedNameList <em>Qualified Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
	 * @see alfDsl.AcceptClause#getQualifiedNameList()
	 * @see #getAcceptClause()
	 * @generated
	 */
	EReference getAcceptClause_QualifiedNameList();

	/**
	 * Returns the meta object for class '{@link alfDsl.ClassifyStatement <em>Classify Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classify Statement</em>'.
	 * @see alfDsl.ClassifyStatement
	 * @generated
	 */
	EClass getClassifyStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ClassifyStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see alfDsl.ClassifyStatement#getExpression()
	 * @see #getClassifyStatement()
	 * @generated
	 */
	EReference getClassifyStatement_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ClassifyStatement#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clause</em>'.
	 * @see alfDsl.ClassifyStatement#getClause()
	 * @see #getClassifyStatement()
	 * @generated
	 */
	EReference getClassifyStatement_Clause();

	/**
	 * Returns the meta object for class '{@link alfDsl.ClassificationClause <em>Classification Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Clause</em>'.
	 * @see alfDsl.ClassificationClause
	 * @generated
	 */
	EClass getClassificationClause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ClassificationClause#getClassifyFromClause <em>Classify From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classify From Clause</em>'.
	 * @see alfDsl.ClassificationClause#getClassifyFromClause()
	 * @see #getClassificationClause()
	 * @generated
	 */
	EReference getClassificationClause_ClassifyFromClause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ClassificationClause#getClassifyToClause <em>Classify To Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classify To Clause</em>'.
	 * @see alfDsl.ClassificationClause#getClassifyToClause()
	 * @see #getClassificationClause()
	 * @generated
	 */
	EReference getClassificationClause_ClassifyToClause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ClassificationClause#getReclassyAllClause <em>Reclassy All Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reclassy All Clause</em>'.
	 * @see alfDsl.ClassificationClause#getReclassyAllClause()
	 * @see #getClassificationClause()
	 * @generated
	 */
	EReference getClassificationClause_ReclassyAllClause();

	/**
	 * Returns the meta object for class '{@link alfDsl.ClassificationFromClause <em>Classification From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification From Clause</em>'.
	 * @see alfDsl.ClassificationFromClause
	 * @generated
	 */
	EClass getClassificationFromClause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ClassificationFromClause#getQualifiedNameList <em>Qualified Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
	 * @see alfDsl.ClassificationFromClause#getQualifiedNameList()
	 * @see #getClassificationFromClause()
	 * @generated
	 */
	EReference getClassificationFromClause_QualifiedNameList();

	/**
	 * Returns the meta object for class '{@link alfDsl.ClassificationToClause <em>Classification To Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification To Clause</em>'.
	 * @see alfDsl.ClassificationToClause
	 * @generated
	 */
	EClass getClassificationToClause();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ClassificationToClause#getQualifiedNameList <em>Qualified Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
	 * @see alfDsl.ClassificationToClause#getQualifiedNameList()
	 * @see #getClassificationToClause()
	 * @generated
	 */
	EReference getClassificationToClause_QualifiedNameList();

	/**
	 * Returns the meta object for class '{@link alfDsl.ReclassifyAllClause <em>Reclassify All Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reclassify All Clause</em>'.
	 * @see alfDsl.ReclassifyAllClause
	 * @generated
	 */
	EClass getReclassifyAllClause();

	/**
	 * Returns the meta object for class '{@link alfDsl.QualifiedNameList <em>Qualified Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Name List</em>'.
	 * @see alfDsl.QualifiedNameList
	 * @generated
	 */
	EClass getQualifiedNameList();

	/**
	 * Returns the meta object for the containment reference list '{@link alfDsl.QualifiedNameList#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualified Name</em>'.
	 * @see alfDsl.QualifiedNameList#getQualifiedName()
	 * @see #getQualifiedNameList()
	 * @generated
	 */
	EReference getQualifiedNameList_QualifiedName();

	/**
	 * Returns the meta object for class '{@link alfDsl.InvocationOrAssignementOrDeclarationStatement <em>Invocation Or Assignement Or Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Or Assignement Or Declaration Statement</em>'.
	 * @see alfDsl.InvocationOrAssignementOrDeclarationStatement
	 * @generated
	 */
	EClass getInvocationOrAssignementOrDeclarationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.InvocationOrAssignementOrDeclarationStatement#getTypePart_OR_assignedPart_OR_invocationPart <em>Type Part OR assigned Part OR invocation Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Part OR assigned Part OR invocation Part</em>'.
	 * @see alfDsl.InvocationOrAssignementOrDeclarationStatement#getTypePart_OR_assignedPart_OR_invocationPart()
	 * @see #getInvocationOrAssignementOrDeclarationStatement()
	 * @generated
	 */
	EReference getInvocationOrAssignementOrDeclarationStatement_TypePart_OR_assignedPart_OR_invocationPart();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.InvocationOrAssignementOrDeclarationStatement#getVariableDeclarationCompletion <em>Variable Declaration Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Declaration Completion</em>'.
	 * @see alfDsl.InvocationOrAssignementOrDeclarationStatement#getVariableDeclarationCompletion()
	 * @see #getInvocationOrAssignementOrDeclarationStatement()
	 * @generated
	 */
	EReference getInvocationOrAssignementOrDeclarationStatement_VariableDeclarationCompletion();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.InvocationOrAssignementOrDeclarationStatement#getAssignmentCompletion <em>Assignment Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment Completion</em>'.
	 * @see alfDsl.InvocationOrAssignementOrDeclarationStatement#getAssignmentCompletion()
	 * @see #getInvocationOrAssignementOrDeclarationStatement()
	 * @generated
	 */
	EReference getInvocationOrAssignementOrDeclarationStatement_AssignmentCompletion();

	/**
	 * Returns the meta object for class '{@link alfDsl.SuperInvocationStatement <em>Super Invocation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Invocation Statement</em>'.
	 * @see alfDsl.SuperInvocationStatement
	 * @generated
	 */
	EClass getSuperInvocationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.SuperInvocationStatement#get_super <em>super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>super</em>'.
	 * @see alfDsl.SuperInvocationStatement#get_super()
	 * @see #getSuperInvocationStatement()
	 * @generated
	 */
	EReference getSuperInvocationStatement__super();

	/**
	 * Returns the meta object for class '{@link alfDsl.ThisInvocationStatement <em>This Invocation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This Invocation Statement</em>'.
	 * @see alfDsl.ThisInvocationStatement
	 * @generated
	 */
	EClass getThisInvocationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ThisInvocationStatement#get_this <em>this</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>this</em>'.
	 * @see alfDsl.ThisInvocationStatement#get_this()
	 * @see #getThisInvocationStatement()
	 * @generated
	 */
	EReference getThisInvocationStatement__this();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.ThisInvocationStatement#getAssignmentCompletion <em>Assignment Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment Completion</em>'.
	 * @see alfDsl.ThisInvocationStatement#getAssignmentCompletion()
	 * @see #getThisInvocationStatement()
	 * @generated
	 */
	EReference getThisInvocationStatement_AssignmentCompletion();

	/**
	 * Returns the meta object for class '{@link alfDsl.InstanceCreationInvocationStatement <em>Instance Creation Invocation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Creation Invocation Statement</em>'.
	 * @see alfDsl.InstanceCreationInvocationStatement
	 * @generated
	 */
	EClass getInstanceCreationInvocationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.InstanceCreationInvocationStatement#get_new <em>new</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>new</em>'.
	 * @see alfDsl.InstanceCreationInvocationStatement#get_new()
	 * @see #getInstanceCreationInvocationStatement()
	 * @generated
	 */
	EReference getInstanceCreationInvocationStatement__new();

	/**
	 * Returns the meta object for class '{@link alfDsl.VariableDeclarationCompletion <em>Variable Declaration Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Completion</em>'.
	 * @see alfDsl.VariableDeclarationCompletion
	 * @generated
	 */
	EClass getVariableDeclarationCompletion();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.VariableDeclarationCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
	 * @see alfDsl.VariableDeclarationCompletion#isMultiplicityIndicator()
	 * @see #getVariableDeclarationCompletion()
	 * @generated
	 */
	EAttribute getVariableDeclarationCompletion_MultiplicityIndicator();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.VariableDeclarationCompletion#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see alfDsl.VariableDeclarationCompletion#getVariableName()
	 * @see #getVariableDeclarationCompletion()
	 * @generated
	 */
	EAttribute getVariableDeclarationCompletion_VariableName();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.VariableDeclarationCompletion#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Value</em>'.
	 * @see alfDsl.VariableDeclarationCompletion#getInitValue()
	 * @see #getVariableDeclarationCompletion()
	 * @generated
	 */
	EReference getVariableDeclarationCompletion_InitValue();

	/**
	 * Returns the meta object for class '{@link alfDsl.AssignmentCompletion <em>Assignment Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Completion</em>'.
	 * @see alfDsl.AssignmentCompletion
	 * @generated
	 */
	EClass getAssignmentCompletion();

	/**
	 * Returns the meta object for the attribute '{@link alfDsl.AssignmentCompletion#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see alfDsl.AssignmentCompletion#getOp()
	 * @see #getAssignmentCompletion()
	 * @generated
	 */
	EAttribute getAssignmentCompletion_Op();

	/**
	 * Returns the meta object for the containment reference '{@link alfDsl.AssignmentCompletion#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hand Side</em>'.
	 * @see alfDsl.AssignmentCompletion#getRightHandSide()
	 * @see #getAssignmentCompletion()
	 * @generated
	 */
	EReference getAssignmentCompletion_RightHandSide();

	/**
	 * Returns the meta object for enum '{@link alfDsl.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Value</em>'.
	 * @see alfDsl.BooleanValue
	 * @generated
	 */
	EEnum getBooleanValue();

	/**
	 * Returns the meta object for enum '{@link alfDsl.LinkOperationKind <em>Link Operation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Operation Kind</em>'.
	 * @see alfDsl.LinkOperationKind
	 * @generated
	 */
	EEnum getLinkOperationKind();

	/**
	 * Returns the meta object for enum '{@link alfDsl.SelectOrRejectOperator <em>Select Or Reject Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Select Or Reject Operator</em>'.
	 * @see alfDsl.SelectOrRejectOperator
	 * @generated
	 */
	EEnum getSelectOrRejectOperator();

	/**
	 * Returns the meta object for enum '{@link alfDsl.CollectOrIterateOperator <em>Collect Or Iterate Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collect Or Iterate Operator</em>'.
	 * @see alfDsl.CollectOrIterateOperator
	 * @generated
	 */
	EEnum getCollectOrIterateOperator();

	/**
	 * Returns the meta object for enum '{@link alfDsl.ForAllOrExistsOrOneOperator <em>For All Or Exists Or One Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>For All Or Exists Or One Operator</em>'.
	 * @see alfDsl.ForAllOrExistsOrOneOperator
	 * @generated
	 */
	EEnum getForAllOrExistsOrOneOperator();

	/**
	 * Returns the meta object for enum '{@link alfDsl.AnnotationKind <em>Annotation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Annotation Kind</em>'.
	 * @see alfDsl.AnnotationKind
	 * @generated
	 */
	EEnum getAnnotationKind();

	/**
	 * Returns the meta object for enum '{@link alfDsl.AssignmentOperator <em>Assignment Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assignment Operator</em>'.
	 * @see alfDsl.AssignmentOperator
	 * @generated
	 */
	EEnum getAssignmentOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlfDslFactory getAlfDslFactory();

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
		 * The meta object literal for the '{@link alfDsl.impl.CLASSSTRUCTImpl <em>CLASSSTRUCT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.CLASSSTRUCTImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getCLASSSTRUCT()
		 * @generated
		 */
		EClass CLASSSTRUCT = eINSTANCE.getCLASSSTRUCT();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSSTRUCT__NAME = eINSTANCE.getCLASSSTRUCT_Name();

		/**
		 * The meta object literal for the '<em><b>Clsop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSSTRUCT__CLSOP = eINSTANCE.getCLASSSTRUCT_Clsop();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.CLASSOPImpl <em>CLASSOP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.CLASSOPImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getCLASSOP()
		 * @generated
		 */
		EClass CLASSOP = eINSTANCE.getCLASSOP();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSOP__NAME = eINSTANCE.getCLASSOP_Name();

		/**
		 * The meta object literal for the '<em><b>Stat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSOP__STAT = eINSTANCE.getCLASSOP_Stat();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.LITERALImpl <em>LITERAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.LITERALImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getLITERAL()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLITERAL();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__SUFFIX = eINSTANCE.getLITERAL_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.BOOLEAN_LITERALImpl <em>BOOLEAN LITERAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.BOOLEAN_LITERALImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getBOOLEAN_LITERAL()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBOOLEAN_LITERAL();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBOOLEAN_LITERAL_Value();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.NUMBER_LITERALImpl <em>NUMBER LITERAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.NUMBER_LITERALImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getNUMBER_LITERAL()
		 * @generated
		 */
		EClass NUMBER_LITERAL = eINSTANCE.getNUMBER_LITERAL();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNUMBER_LITERAL_Value();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.INTEGER_LITERALImpl <em>INTEGER LITERAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.INTEGER_LITERALImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getINTEGER_LITERAL()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getINTEGER_LITERAL();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.UNLIMITED_LITERALImpl <em>UNLIMITED LITERAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.UNLIMITED_LITERALImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getUNLIMITED_LITERAL()
		 * @generated
		 */
		EClass UNLIMITED_LITERAL = eINSTANCE.getUNLIMITED_LITERAL();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.STRING_LITERALImpl <em>STRING LITERAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.STRING_LITERALImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSTRING_LITERAL()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getSTRING_LITERAL();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getSTRING_LITERAL_Value();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.NameExpressionImpl <em>Name Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.NameExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getNameExpression()
		 * @generated
		 */
		EClass NAME_EXPRESSION = eINSTANCE.getNameExpression();

		/**
		 * The meta object literal for the '<em><b>Prefix Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_EXPRESSION__PREFIX_OP = eINSTANCE.getNameExpression_PrefixOp();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_EXPRESSION__PATH = eINSTANCE.getNameExpression_Path();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_EXPRESSION__ID = eINSTANCE.getNameExpression_Id();

		/**
		 * The meta object literal for the '<em><b>Invocation Completion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_EXPRESSION__INVOCATION_COMPLETION = eINSTANCE.getNameExpression_InvocationCompletion();

		/**
		 * The meta object literal for the '<em><b>Sequence Construction Completion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_EXPRESSION__SEQUENCE_CONSTRUCTION_COMPLETION = eINSTANCE.getNameExpression_SequenceConstructionCompletion();

		/**
		 * The meta object literal for the '<em><b>Postfix Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_EXPRESSION__POSTFIX_OP = eINSTANCE.getNameExpression_PostfixOp();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_EXPRESSION__SUFFIX = eINSTANCE.getNameExpression_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.QualifiedNamePathImpl <em>Qualified Name Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.QualifiedNamePathImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getQualifiedNamePath()
		 * @generated
		 */
		EClass QUALIFIED_NAME_PATH = eINSTANCE.getQualifiedNamePath();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_NAME_PATH__NAMESPACE = eINSTANCE.getQualifiedNamePath_Namespace();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.UnqualifiedNameImpl <em>Unqualified Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.UnqualifiedNameImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getUnqualifiedName()
		 * @generated
		 */
		EClass UNQUALIFIED_NAME = eINSTANCE.getUnqualifiedName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNQUALIFIED_NAME__NAME = eINSTANCE.getUnqualifiedName_Name();

		/**
		 * The meta object literal for the '<em><b>Template Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNQUALIFIED_NAME__TEMPLATE_BINDING = eINSTANCE.getUnqualifiedName_TemplateBinding();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.TemplateBindingImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getTemplateBinding()
		 * @generated
		 */
		EClass TEMPLATE_BINDING = eINSTANCE.getTemplateBinding();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BINDING__BINDINGS = eINSTANCE.getTemplateBinding_Bindings();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.NamedTemplateBindingImpl <em>Named Template Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.NamedTemplateBindingImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getNamedTemplateBinding()
		 * @generated
		 */
		EClass NAMED_TEMPLATE_BINDING = eINSTANCE.getNamedTemplateBinding();

		/**
		 * The meta object literal for the '<em><b>Formal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_TEMPLATE_BINDING__FORMAL = eINSTANCE.getNamedTemplateBinding_Formal();

		/**
		 * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TEMPLATE_BINDING__ACTUAL = eINSTANCE.getNamedTemplateBinding_Actual();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.QualifiedNameWithBindingImpl <em>Qualified Name With Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.QualifiedNameWithBindingImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getQualifiedNameWithBinding()
		 * @generated
		 */
		EClass QUALIFIED_NAME_WITH_BINDING = eINSTANCE.getQualifiedNameWithBinding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_NAME_WITH_BINDING__ID = eINSTANCE.getQualifiedNameWithBinding_Id();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_NAME_WITH_BINDING__BINDING = eINSTANCE.getQualifiedNameWithBinding_Binding();

		/**
		 * The meta object literal for the '<em><b>Remaining</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_NAME_WITH_BINDING__REMAINING = eINSTANCE.getQualifiedNameWithBinding_Remaining();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.TupleImpl <em>Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.TupleImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getTuple()
		 * @generated
		 */
		EClass TUPLE = eINSTANCE.getTuple();

		/**
		 * The meta object literal for the '<em><b>Tuple Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE__TUPLE_ELEMENTS = eINSTANCE.getTuple_TupleElements();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.TupleElementImpl <em>Tuple Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.TupleElementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getTupleElement()
		 * @generated
		 */
		EClass TUPLE_ELEMENT = eINSTANCE.getTupleElement();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_ELEMENT__ARGUMENT = eINSTANCE.getTupleElement_Argument();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ConditionalTestExpressionImpl <em>Conditional Test Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ConditionalTestExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getConditionalTestExpression()
		 * @generated
		 */
		EClass CONDITIONAL_TEST_EXPRESSION = eINSTANCE.getConditionalTestExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_TEST_EXPRESSION__EXP = eINSTANCE.getConditionalTestExpression_Exp();

		/**
		 * The meta object literal for the '<em><b>When True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE = eINSTANCE.getConditionalTestExpression_WhenTrue();

		/**
		 * The meta object literal for the '<em><b>When False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE = eINSTANCE.getConditionalTestExpression_WhenFalse();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ConditionalOrExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getConditionalOrExpression()
		 * @generated
		 */
		EClass CONDITIONAL_OR_EXPRESSION = eINSTANCE.getConditionalOrExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OR_EXPRESSION__EXP = eINSTANCE.getConditionalOrExpression_Exp();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ConditionalAndExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getConditionalAndExpression()
		 * @generated
		 */
		EClass CONDITIONAL_AND_EXPRESSION = eINSTANCE.getConditionalAndExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_AND_EXPRESSION__EXP = eINSTANCE.getConditionalAndExpression_Exp();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.InclusiveOrExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getInclusiveOrExpression()
		 * @generated
		 */
		EClass INCLUSIVE_OR_EXPRESSION = eINSTANCE.getInclusiveOrExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSIVE_OR_EXPRESSION__EXP = eINSTANCE.getInclusiveOrExpression_Exp();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ExclusiveOrExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getExclusiveOrExpression()
		 * @generated
		 */
		EClass EXCLUSIVE_OR_EXPRESSION = eINSTANCE.getExclusiveOrExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_OR_EXPRESSION__EXP = eINSTANCE.getExclusiveOrExpression_Exp();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.AndExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__EXP = eINSTANCE.getAndExpression_Exp();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.EqualityExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getEqualityExpression()
		 * @generated
		 */
		EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY_EXPRESSION__EXP = eINSTANCE.getEqualityExpression_Exp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALITY_EXPRESSION__OP = eINSTANCE.getEqualityExpression_Op();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ClassificationExpressionImpl <em>Classification Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ClassificationExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getClassificationExpression()
		 * @generated
		 */
		EClass CLASSIFICATION_EXPRESSION = eINSTANCE.getClassificationExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_EXPRESSION__EXP = eINSTANCE.getClassificationExpression_Exp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_EXPRESSION__OP = eINSTANCE.getClassificationExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_EXPRESSION__TYPE_NAME = eINSTANCE.getClassificationExpression_TypeName();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.RelationalExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__LEFT = eINSTANCE.getRelationalExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__OP = eINSTANCE.getRelationalExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__RIGHT = eINSTANCE.getRelationalExpression_Right();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ShiftExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getShiftExpression()
		 * @generated
		 */
		EClass SHIFT_EXPRESSION = eINSTANCE.getShiftExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT_EXPRESSION__EXP = eINSTANCE.getShiftExpression_Exp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT_EXPRESSION__OP = eINSTANCE.getShiftExpression_Op();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.AdditiveExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getAdditiveExpression()
		 * @generated
		 */
		EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIVE_EXPRESSION__EXP = eINSTANCE.getAdditiveExpression_Exp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIVE_EXPRESSION__OP = eINSTANCE.getAdditiveExpression_Op();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.MultiplicativeExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getMultiplicativeExpression()
		 * @generated
		 */
		EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICATIVE_EXPRESSION__EXP = eINSTANCE.getMultiplicativeExpression_Exp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICATIVE_EXPRESSION__OP = eINSTANCE.getMultiplicativeExpression_Op();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.UnaryExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OP = eINSTANCE.getUnaryExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__EXP = eINSTANCE.getUnaryExpression_Exp();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.PrimaryExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getPrimaryExpression()
		 * @generated
		 */
		EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_EXPRESSION__PREFIX = eINSTANCE.getPrimaryExpression_Prefix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SuffixExpressionImpl <em>Suffix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SuffixExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSuffixExpression()
		 * @generated
		 */
		EClass SUFFIX_EXPRESSION = eINSTANCE.getSuffixExpression();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.OperationCallExpressionImpl <em>Operation Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.OperationCallExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getOperationCallExpression()
		 * @generated
		 */
		EClass OPERATION_CALL_EXPRESSION = eINSTANCE.getOperationCallExpression();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL_EXPRESSION__OPERATION_NAME = eINSTANCE.getOperationCallExpression_OperationName();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_EXPRESSION__TUPLE = eINSTANCE.getOperationCallExpression_Tuple();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_EXPRESSION__SUFFIX = eINSTANCE.getOperationCallExpression_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.OperationCallExpressionWithoutDotImpl <em>Operation Call Expression Without Dot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.OperationCallExpressionWithoutDotImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getOperationCallExpressionWithoutDot()
		 * @generated
		 */
		EClass OPERATION_CALL_EXPRESSION_WITHOUT_DOT = eINSTANCE.getOperationCallExpressionWithoutDot();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL_EXPRESSION_WITHOUT_DOT__OPERATION_NAME = eINSTANCE.getOperationCallExpressionWithoutDot_OperationName();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE = eINSTANCE.getOperationCallExpressionWithoutDot_Tuple();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX = eINSTANCE.getOperationCallExpressionWithoutDot_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.PropertyCallExpressionImpl <em>Property Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.PropertyCallExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getPropertyCallExpression()
		 * @generated
		 */
		EClass PROPERTY_CALL_EXPRESSION = eINSTANCE.getPropertyCallExpression();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CALL_EXPRESSION__PROPERTY_NAME = eINSTANCE.getPropertyCallExpression_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXPRESSION__INDEX = eINSTANCE.getPropertyCallExpression_Index();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXPRESSION__SUFFIX = eINSTANCE.getPropertyCallExpression_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.LinkOperationExpressionImpl <em>Link Operation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.LinkOperationExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getLinkOperationExpression()
		 * @generated
		 */
		EClass LINK_OPERATION_EXPRESSION = eINSTANCE.getLinkOperationExpression();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_OPERATION_EXPRESSION__KIND = eINSTANCE.getLinkOperationExpression_Kind();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_OPERATION_EXPRESSION__TUPLE = eINSTANCE.getLinkOperationExpression_Tuple();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.LinkOperationTupleImpl <em>Link Operation Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.LinkOperationTupleImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getLinkOperationTuple()
		 * @generated
		 */
		EClass LINK_OPERATION_TUPLE = eINSTANCE.getLinkOperationTuple();

		/**
		 * The meta object literal for the '<em><b>Link Operation Tuple Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_OPERATION_TUPLE__LINK_OPERATION_TUPLE_ELEMENT = eINSTANCE.getLinkOperationTuple_LinkOperationTupleElement();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.LinkOperationTupleElementImpl <em>Link Operation Tuple Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.LinkOperationTupleElementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getLinkOperationTupleElement()
		 * @generated
		 */
		EClass LINK_OPERATION_TUPLE_ELEMENT = eINSTANCE.getLinkOperationTupleElement();

		/**
		 * The meta object literal for the '<em><b>Object Or Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE = eINSTANCE.getLinkOperationTupleElement_ObjectOrRole();

		/**
		 * The meta object literal for the '<em><b>Role Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX = eINSTANCE.getLinkOperationTupleElement_RoleIndex();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_OPERATION_TUPLE_ELEMENT__OBJECT = eINSTANCE.getLinkOperationTupleElement_Object();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SequenceOperationExpressionImpl <em>Sequence Operation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SequenceOperationExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceOperationExpression()
		 * @generated
		 */
		EClass SEQUENCE_OPERATION_EXPRESSION = eINSTANCE.getSequenceOperationExpression();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_OPERATION_EXPRESSION__OPERATION_NAME = eINSTANCE.getSequenceOperationExpression_OperationName();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_OPERATION_EXPRESSION__TUPLE = eINSTANCE.getSequenceOperationExpression_Tuple();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_OPERATION_EXPRESSION__SUFFIX = eINSTANCE.getSequenceOperationExpression_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SequenceReductionExpressionImpl <em>Sequence Reduction Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SequenceReductionExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceReductionExpression()
		 * @generated
		 */
		EClass SEQUENCE_REDUCTION_EXPRESSION = eINSTANCE.getSequenceReductionExpression();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_REDUCTION_EXPRESSION__IS_ORDERED = eINSTANCE.getSequenceReductionExpression_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_REDUCTION_EXPRESSION__BEHAVIOR = eINSTANCE.getSequenceReductionExpression_Behavior();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_REDUCTION_EXPRESSION__SUFFIX = eINSTANCE.getSequenceReductionExpression_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SequenceExpansionExpressionImpl <em>Sequence Expansion Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SequenceExpansionExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceExpansionExpression()
		 * @generated
		 */
		EClass SEQUENCE_EXPANSION_EXPRESSION = eINSTANCE.getSequenceExpansionExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_EXPANSION_EXPRESSION__NAME = eINSTANCE.getSequenceExpansionExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_EXPANSION_EXPRESSION__EXPR = eINSTANCE.getSequenceExpansionExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_EXPANSION_EXPRESSION__SUFFIX = eINSTANCE.getSequenceExpansionExpression_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SelectOrRejectOperationImpl <em>Select Or Reject Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SelectOrRejectOperationImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSelectOrRejectOperation()
		 * @generated
		 */
		EClass SELECT_OR_REJECT_OPERATION = eINSTANCE.getSelectOrRejectOperation();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_OR_REJECT_OPERATION__OP = eINSTANCE.getSelectOrRejectOperation_Op();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.CollectOrIterateOperationImpl <em>Collect Or Iterate Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.CollectOrIterateOperationImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getCollectOrIterateOperation()
		 * @generated
		 */
		EClass COLLECT_OR_ITERATE_OPERATION = eINSTANCE.getCollectOrIterateOperation();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECT_OR_ITERATE_OPERATION__OP = eINSTANCE.getCollectOrIterateOperation_Op();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ForAllOrExistsOrOneOperationImpl <em>For All Or Exists Or One Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ForAllOrExistsOrOneOperationImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getForAllOrExistsOrOneOperation()
		 * @generated
		 */
		EClass FOR_ALL_OR_EXISTS_OR_ONE_OPERATION = eINSTANCE.getForAllOrExistsOrOneOperation();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__OP = eINSTANCE.getForAllOrExistsOrOneOperation_Op();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.IsUniqueOperationImpl <em>Is Unique Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.IsUniqueOperationImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getIsUniqueOperation()
		 * @generated
		 */
		EClass IS_UNIQUE_OPERATION = eINSTANCE.getIsUniqueOperation();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ValueSpecificationImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.NonLiteralValueSpecificationImpl <em>Non Literal Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.NonLiteralValueSpecificationImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getNonLiteralValueSpecification()
		 * @generated
		 */
		EClass NON_LITERAL_VALUE_SPECIFICATION = eINSTANCE.getNonLiteralValueSpecification();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ParenthesizedExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getParenthesizedExpression()
		 * @generated
		 */
		EClass PARENTHESIZED_EXPRESSION = eINSTANCE.getParenthesizedExpression();

		/**
		 * The meta object literal for the '<em><b>Exp Or Type Cast</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIZED_EXPRESSION__EXP_OR_TYPE_CAST = eINSTANCE.getParenthesizedExpression_ExpOrTypeCast();

		/**
		 * The meta object literal for the '<em><b>Casted</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIZED_EXPRESSION__CASTED = eINSTANCE.getParenthesizedExpression_Casted();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIZED_EXPRESSION__SUFFIX = eINSTANCE.getParenthesizedExpression_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.NullExpressionImpl <em>Null Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.NullExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getNullExpression()
		 * @generated
		 */
		EClass NULL_EXPRESSION = eINSTANCE.getNullExpression();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ThisExpressionImpl <em>This Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ThisExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getThisExpression()
		 * @generated
		 */
		EClass THIS_EXPRESSION = eINSTANCE.getThisExpression();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIS_EXPRESSION__SUFFIX = eINSTANCE.getThisExpression_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SuperInvocationExpressionImpl <em>Super Invocation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SuperInvocationExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSuperInvocationExpression()
		 * @generated
		 */
		EClass SUPER_INVOCATION_EXPRESSION = eINSTANCE.getSuperInvocationExpression();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_INVOCATION_EXPRESSION__CLASS_NAME = eINSTANCE.getSuperInvocationExpression_ClassName();

		/**
		 * The meta object literal for the '<em><b>Operation Call Without Dot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_INVOCATION_EXPRESSION__OPERATION_CALL_WITHOUT_DOT = eINSTANCE.getSuperInvocationExpression_OperationCallWithoutDot();

		/**
		 * The meta object literal for the '<em><b>Operation Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_INVOCATION_EXPRESSION__OPERATION_CALL = eINSTANCE.getSuperInvocationExpression_OperationCall();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.InstanceCreationExpressionImpl <em>Instance Creation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.InstanceCreationExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getInstanceCreationExpression()
		 * @generated
		 */
		EClass INSTANCE_CREATION_EXPRESSION = eINSTANCE.getInstanceCreationExpression();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR = eINSTANCE.getInstanceCreationExpression_Constructor();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION_EXPRESSION__TUPLE = eINSTANCE.getInstanceCreationExpression_Tuple();

		/**
		 * The meta object literal for the '<em><b>Sequence Constuction Completion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION = eINSTANCE.getInstanceCreationExpression_SequenceConstuctionCompletion();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION_EXPRESSION__SUFFIX = eINSTANCE.getInstanceCreationExpression_Suffix();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SequenceConstructionOrAccessCompletionImpl <em>Sequence Construction Or Access Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SequenceConstructionOrAccessCompletionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceConstructionOrAccessCompletion()
		 * @generated
		 */
		EClass SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION = eINSTANCE.getSequenceConstructionOrAccessCompletion();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__MULTIPLICITY_INDICATOR = eINSTANCE.getSequenceConstructionOrAccessCompletion_MultiplicityIndicator();

		/**
		 * The meta object literal for the '<em><b>Access Completion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__ACCESS_COMPLETION = eINSTANCE.getSequenceConstructionOrAccessCompletion_AccessCompletion();

		/**
		 * The meta object literal for the '<em><b>Sequence Completion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__SEQUENCE_COMPLETION = eINSTANCE.getSequenceConstructionOrAccessCompletion_SequenceCompletion();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__EXPRESSION = eINSTANCE.getSequenceConstructionOrAccessCompletion_Expression();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.AccessCompletionImpl <em>Access Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.AccessCompletionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getAccessCompletion()
		 * @generated
		 */
		EClass ACCESS_COMPLETION = eINSTANCE.getAccessCompletion();

		/**
		 * The meta object literal for the '<em><b>Access Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_COMPLETION__ACCESS_INDEX = eINSTANCE.getAccessCompletion_AccessIndex();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.PartialSequenceConstructionCompletionImpl <em>Partial Sequence Construction Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.PartialSequenceConstructionCompletionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getPartialSequenceConstructionCompletion()
		 * @generated
		 */
		EClass PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION = eINSTANCE.getPartialSequenceConstructionCompletion();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION = eINSTANCE.getPartialSequenceConstructionCompletion_Expression();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SequenceConstructionCompletionImpl <em>Sequence Construction Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SequenceConstructionCompletionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceConstructionCompletion()
		 * @generated
		 */
		EClass SEQUENCE_CONSTRUCTION_COMPLETION = eINSTANCE.getSequenceConstructionCompletion();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_CONSTRUCTION_COMPLETION__MULTIPLICITY_INDICATOR = eINSTANCE.getSequenceConstructionCompletion_MultiplicityIndicator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION = eINSTANCE.getSequenceConstructionCompletion_Expression();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SequenceConstructionExpressionImpl <em>Sequence Construction Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SequenceConstructionExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceConstructionExpression()
		 * @generated
		 */
		EClass SEQUENCE_CONSTRUCTION_EXPRESSION = eINSTANCE.getSequenceConstructionExpression();

		/**
		 * The meta object literal for the '<em><b>Sequence Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_ELEMENT = eINSTANCE.getSequenceConstructionExpression_SequenceElement();

		/**
		 * The meta object literal for the '<em><b>Range Upper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_CONSTRUCTION_EXPRESSION__RANGE_UPPER = eINSTANCE.getSequenceConstructionExpression_RangeUpper();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SequenceElementImpl <em>Sequence Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SequenceElementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSequenceElement()
		 * @generated
		 */
		EClass SEQUENCE_ELEMENT = eINSTANCE.getSequenceElement();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ClassExtentExpressionImpl <em>Class Extent Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ClassExtentExpressionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getClassExtentExpression()
		 * @generated
		 */
		EClass CLASS_EXTENT_EXPRESSION = eINSTANCE.getClassExtentExpression();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.BlockImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__SEQUENCE = eINSTANCE.getBlock_Sequence();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.StatementSequenceImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getStatementSequence()
		 * @generated
		 */
		EClass STATEMENT_SEQUENCE = eINSTANCE.getStatementSequence();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_SEQUENCE__STATEMENTS = eINSTANCE.getStatementSequence_Statements();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.InlineStatementImpl <em>Inline Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.InlineStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getInlineStatement()
		 * @generated
		 */
		EClass INLINE_STATEMENT = eINSTANCE.getInlineStatement();

		/**
		 * The meta object literal for the '<em><b>Langage Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_STATEMENT__LANGAGE_NAME = eINSTANCE.getInlineStatement_LangageName();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_STATEMENT__BODY = eINSTANCE.getInlineStatement_Body();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.AnnotatedStatementImpl <em>Annotated Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.AnnotatedStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getAnnotatedStatement()
		 * @generated
		 */
		EClass ANNOTATED_STATEMENT = eINSTANCE.getAnnotatedStatement();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_STATEMENT__ANNOTATION = eINSTANCE.getAnnotatedStatement_Annotation();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_STATEMENT__BLOCK = eINSTANCE.getAnnotatedStatement_Block();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.DocumentedStatementImpl <em>Documented Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.DocumentedStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getDocumentedStatement()
		 * @generated
		 */
		EClass DOCUMENTED_STATEMENT = eINSTANCE.getDocumentedStatement();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED_STATEMENT__COMMENT = eINSTANCE.getDocumentedStatement_Comment();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED_STATEMENT__STATEMENT = eINSTANCE.getDocumentedStatement_Statement();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.StatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.AnnotationImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__KIND = eINSTANCE.getAnnotation_Kind();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__ARGS = eINSTANCE.getAnnotation_Args();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.BlockStatementImpl <em>Block Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.BlockStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getBlockStatement()
		 * @generated
		 */
		EClass BLOCK_STATEMENT = eINSTANCE.getBlockStatement();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__BLOCK = eINSTANCE.getBlockStatement_Block();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.EmptyStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getEmptyStatement()
		 * @generated
		 */
		EClass EMPTY_STATEMENT = eINSTANCE.getEmptyStatement();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.LocalNameDeclarationStatementImpl <em>Local Name Declaration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.LocalNameDeclarationStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getLocalNameDeclarationStatement()
		 * @generated
		 */
		EClass LOCAL_NAME_DECLARATION_STATEMENT = eINSTANCE.getLocalNameDeclarationStatement();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_NAME_DECLARATION_STATEMENT__VAR_NAME = eINSTANCE.getLocalNameDeclarationStatement_VarName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_NAME_DECLARATION_STATEMENT__TYPE = eINSTANCE.getLocalNameDeclarationStatement_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_NAME_DECLARATION_STATEMENT__MULTIPLICITY_INDICATOR = eINSTANCE.getLocalNameDeclarationStatement_MultiplicityIndicator();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_NAME_DECLARATION_STATEMENT__INIT = eINSTANCE.getLocalNameDeclarationStatement_Init();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.IfStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Sequential Clausses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__SEQUENTIAL_CLAUSSES = eINSTANCE.getIfStatement_SequentialClausses();

		/**
		 * The meta object literal for the '<em><b>Final Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__FINAL_CLAUSE = eINSTANCE.getIfStatement_FinalClause();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SequentialClausesImpl <em>Sequential Clauses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SequentialClausesImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSequentialClauses()
		 * @generated
		 */
		EClass SEQUENTIAL_CLAUSES = eINSTANCE.getSequentialClauses();

		/**
		 * The meta object literal for the '<em><b>Conccurent Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_CLAUSES__CONCCURENT_CLAUSES = eINSTANCE.getSequentialClauses_ConccurentClauses();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ConcurrentClausesImpl <em>Concurrent Clauses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ConcurrentClausesImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getConcurrentClauses()
		 * @generated
		 */
		EClass CONCURRENT_CLAUSES = eINSTANCE.getConcurrentClauses();

		/**
		 * The meta object literal for the '<em><b>Non Final Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCURRENT_CLAUSES__NON_FINAL_CLAUSE = eINSTANCE.getConcurrentClauses_NonFinalClause();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.NonFinalClauseImpl <em>Non Final Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.NonFinalClauseImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getNonFinalClause()
		 * @generated
		 */
		EClass NON_FINAL_CLAUSE = eINSTANCE.getNonFinalClause();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_FINAL_CLAUSE__CONDITION = eINSTANCE.getNonFinalClause_Condition();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_FINAL_CLAUSE__BLOCK = eINSTANCE.getNonFinalClause_Block();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.FinalClauseImpl <em>Final Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.FinalClauseImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getFinalClause()
		 * @generated
		 */
		EClass FINAL_CLAUSE = eINSTANCE.getFinalClause();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_CLAUSE__BLOCK = eINSTANCE.getFinalClause_Block();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SwitchStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSwitchStatement()
		 * @generated
		 */
		EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__EXPRESSION = eINSTANCE.getSwitchStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Switch Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__SWITCH_CLAUSE = eINSTANCE.getSwitchStatement_SwitchClause();

		/**
		 * The meta object literal for the '<em><b>Default Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__DEFAULT_CLAUSE = eINSTANCE.getSwitchStatement_DefaultClause();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SwitchClauseImpl <em>Switch Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SwitchClauseImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSwitchClause()
		 * @generated
		 */
		EClass SWITCH_CLAUSE = eINSTANCE.getSwitchClause();

		/**
		 * The meta object literal for the '<em><b>Switch Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CLAUSE__SWITCH_CASE = eINSTANCE.getSwitchClause_SwitchCase();

		/**
		 * The meta object literal for the '<em><b>Statement Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CLAUSE__STATEMENT_SEQUENCE = eINSTANCE.getSwitchClause_StatementSequence();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SwitchCaseImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSwitchCase()
		 * @generated
		 */
		EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE__EXPRESSION = eINSTANCE.getSwitchCase_Expression();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SwitchDefaultClauseImpl <em>Switch Default Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SwitchDefaultClauseImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSwitchDefaultClause()
		 * @generated
		 */
		EClass SWITCH_DEFAULT_CLAUSE = eINSTANCE.getSwitchDefaultClause();

		/**
		 * The meta object literal for the '<em><b>Statement Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_DEFAULT_CLAUSE__STATEMENT_SEQUENCE = eINSTANCE.getSwitchDefaultClause_StatementSequence();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.NonEmptyStatementSequenceImpl <em>Non Empty Statement Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.NonEmptyStatementSequenceImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getNonEmptyStatementSequence()
		 * @generated
		 */
		EClass NON_EMPTY_STATEMENT_SEQUENCE = eINSTANCE.getNonEmptyStatementSequence();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_EMPTY_STATEMENT_SEQUENCE__STATEMENT = eINSTANCE.getNonEmptyStatementSequence_Statement();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.WhileStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__BLOCK = eINSTANCE.getWhileStatement_Block();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.DoStatementImpl <em>Do Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.DoStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getDoStatement()
		 * @generated
		 */
		EClass DO_STATEMENT = eINSTANCE.getDoStatement();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_STATEMENT__BLOCK = eINSTANCE.getDoStatement_Block();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_STATEMENT__CONDITION = eINSTANCE.getDoStatement_Condition();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ForStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__CONTROL = eINSTANCE.getForStatement_Control();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__BLOCK = eINSTANCE.getForStatement_Block();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ForControlImpl <em>For Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ForControlImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getForControl()
		 * @generated
		 */
		EClass FOR_CONTROL = eINSTANCE.getForControl();

		/**
		 * The meta object literal for the '<em><b>Loop Variable Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_CONTROL__LOOP_VARIABLE_DEFINITION = eINSTANCE.getForControl_LoopVariableDefinition();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.LoopVariableDefinitionImpl <em>Loop Variable Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.LoopVariableDefinitionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getLoopVariableDefinition()
		 * @generated
		 */
		EClass LOOP_VARIABLE_DEFINITION = eINSTANCE.getLoopVariableDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_VARIABLE_DEFINITION__NAME = eINSTANCE.getLoopVariableDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_VARIABLE_DEFINITION__EXPRESSION1 = eINSTANCE.getLoopVariableDefinition_Expression1();

		/**
		 * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_VARIABLE_DEFINITION__EXPRESSION2 = eINSTANCE.getLoopVariableDefinition_Expression2();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_VARIABLE_DEFINITION__TYPE = eINSTANCE.getLoopVariableDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_VARIABLE_DEFINITION__EXPRESSION = eINSTANCE.getLoopVariableDefinition_Expression();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.BreakStatementImpl <em>Break Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.BreakStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getBreakStatement()
		 * @generated
		 */
		EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ReturnStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.AcceptStatementImpl <em>Accept Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.AcceptStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getAcceptStatement()
		 * @generated
		 */
		EClass ACCEPT_STATEMENT = eINSTANCE.getAcceptStatement();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_STATEMENT__CLAUSE = eINSTANCE.getAcceptStatement_Clause();

		/**
		 * The meta object literal for the '<em><b>Simple Accept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_STATEMENT__SIMPLE_ACCEPT = eINSTANCE.getAcceptStatement_SimpleAccept();

		/**
		 * The meta object literal for the '<em><b>Compound Accept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_STATEMENT__COMPOUND_ACCEPT = eINSTANCE.getAcceptStatement_CompoundAccept();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SimpleAcceptStatementCompletionImpl <em>Simple Accept Statement Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SimpleAcceptStatementCompletionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSimpleAcceptStatementCompletion()
		 * @generated
		 */
		EClass SIMPLE_ACCEPT_STATEMENT_COMPLETION = eINSTANCE.getSimpleAcceptStatementCompletion();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.CompoundAcceptStatementCompletionImpl <em>Compound Accept Statement Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.CompoundAcceptStatementCompletionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getCompoundAcceptStatementCompletion()
		 * @generated
		 */
		EClass COMPOUND_ACCEPT_STATEMENT_COMPLETION = eINSTANCE.getCompoundAcceptStatementCompletion();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK = eINSTANCE.getCompoundAcceptStatementCompletion_Block();

		/**
		 * The meta object literal for the '<em><b>Accept Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK = eINSTANCE.getCompoundAcceptStatementCompletion_AcceptBlock();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.AcceptBlockImpl <em>Accept Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.AcceptBlockImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getAcceptBlock()
		 * @generated
		 */
		EClass ACCEPT_BLOCK = eINSTANCE.getAcceptBlock();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_BLOCK__CLAUSE = eINSTANCE.getAcceptBlock_Clause();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_BLOCK__BLOCK = eINSTANCE.getAcceptBlock_Block();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.AcceptClauseImpl <em>Accept Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.AcceptClauseImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getAcceptClause()
		 * @generated
		 */
		EClass ACCEPT_CLAUSE = eINSTANCE.getAcceptClause();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_CLAUSE__NAME = eINSTANCE.getAcceptClause_Name();

		/**
		 * The meta object literal for the '<em><b>Qualified Name List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_CLAUSE__QUALIFIED_NAME_LIST = eINSTANCE.getAcceptClause_QualifiedNameList();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ClassifyStatementImpl <em>Classify Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ClassifyStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getClassifyStatement()
		 * @generated
		 */
		EClass CLASSIFY_STATEMENT = eINSTANCE.getClassifyStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFY_STATEMENT__EXPRESSION = eINSTANCE.getClassifyStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFY_STATEMENT__CLAUSE = eINSTANCE.getClassifyStatement_Clause();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ClassificationClauseImpl <em>Classification Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ClassificationClauseImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getClassificationClause()
		 * @generated
		 */
		EClass CLASSIFICATION_CLAUSE = eINSTANCE.getClassificationClause();

		/**
		 * The meta object literal for the '<em><b>Classify From Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CLAUSE__CLASSIFY_FROM_CLAUSE = eINSTANCE.getClassificationClause_ClassifyFromClause();

		/**
		 * The meta object literal for the '<em><b>Classify To Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CLAUSE__CLASSIFY_TO_CLAUSE = eINSTANCE.getClassificationClause_ClassifyToClause();

		/**
		 * The meta object literal for the '<em><b>Reclassy All Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CLAUSE__RECLASSY_ALL_CLAUSE = eINSTANCE.getClassificationClause_ReclassyAllClause();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ClassificationFromClauseImpl <em>Classification From Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ClassificationFromClauseImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getClassificationFromClause()
		 * @generated
		 */
		EClass CLASSIFICATION_FROM_CLAUSE = eINSTANCE.getClassificationFromClause();

		/**
		 * The meta object literal for the '<em><b>Qualified Name List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_FROM_CLAUSE__QUALIFIED_NAME_LIST = eINSTANCE.getClassificationFromClause_QualifiedNameList();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ClassificationToClauseImpl <em>Classification To Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ClassificationToClauseImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getClassificationToClause()
		 * @generated
		 */
		EClass CLASSIFICATION_TO_CLAUSE = eINSTANCE.getClassificationToClause();

		/**
		 * The meta object literal for the '<em><b>Qualified Name List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_TO_CLAUSE__QUALIFIED_NAME_LIST = eINSTANCE.getClassificationToClause_QualifiedNameList();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ReclassifyAllClauseImpl <em>Reclassify All Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ReclassifyAllClauseImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getReclassifyAllClause()
		 * @generated
		 */
		EClass RECLASSIFY_ALL_CLAUSE = eINSTANCE.getReclassifyAllClause();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.QualifiedNameListImpl <em>Qualified Name List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.QualifiedNameListImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getQualifiedNameList()
		 * @generated
		 */
		EClass QUALIFIED_NAME_LIST = eINSTANCE.getQualifiedNameList();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_NAME_LIST__QUALIFIED_NAME = eINSTANCE.getQualifiedNameList_QualifiedName();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.InvocationOrAssignementOrDeclarationStatementImpl <em>Invocation Or Assignement Or Declaration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.InvocationOrAssignementOrDeclarationStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getInvocationOrAssignementOrDeclarationStatement()
		 * @generated
		 */
		EClass INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT = eINSTANCE.getInvocationOrAssignementOrDeclarationStatement();

		/**
		 * The meta object literal for the '<em><b>Type Part OR assigned Part OR invocation Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__TYPE_PART_OR_ASSIGNED_PART_OR_INVOCATION_PART = eINSTANCE.getInvocationOrAssignementOrDeclarationStatement_TypePart_OR_assignedPart_OR_invocationPart();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration Completion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__VARIABLE_DECLARATION_COMPLETION = eINSTANCE.getInvocationOrAssignementOrDeclarationStatement_VariableDeclarationCompletion();

		/**
		 * The meta object literal for the '<em><b>Assignment Completion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__ASSIGNMENT_COMPLETION = eINSTANCE.getInvocationOrAssignementOrDeclarationStatement_AssignmentCompletion();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.SuperInvocationStatementImpl <em>Super Invocation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.SuperInvocationStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getSuperInvocationStatement()
		 * @generated
		 */
		EClass SUPER_INVOCATION_STATEMENT = eINSTANCE.getSuperInvocationStatement();

		/**
		 * The meta object literal for the '<em><b>super</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_INVOCATION_STATEMENT__SUPER = eINSTANCE.getSuperInvocationStatement__super();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.ThisInvocationStatementImpl <em>This Invocation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.ThisInvocationStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getThisInvocationStatement()
		 * @generated
		 */
		EClass THIS_INVOCATION_STATEMENT = eINSTANCE.getThisInvocationStatement();

		/**
		 * The meta object literal for the '<em><b>this</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIS_INVOCATION_STATEMENT__THIS = eINSTANCE.getThisInvocationStatement__this();

		/**
		 * The meta object literal for the '<em><b>Assignment Completion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIS_INVOCATION_STATEMENT__ASSIGNMENT_COMPLETION = eINSTANCE.getThisInvocationStatement_AssignmentCompletion();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.InstanceCreationInvocationStatementImpl <em>Instance Creation Invocation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.InstanceCreationInvocationStatementImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getInstanceCreationInvocationStatement()
		 * @generated
		 */
		EClass INSTANCE_CREATION_INVOCATION_STATEMENT = eINSTANCE.getInstanceCreationInvocationStatement();

		/**
		 * The meta object literal for the '<em><b>new</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION_INVOCATION_STATEMENT__NEW = eINSTANCE.getInstanceCreationInvocationStatement__new();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.VariableDeclarationCompletionImpl <em>Variable Declaration Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.VariableDeclarationCompletionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getVariableDeclarationCompletion()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION_COMPLETION = eINSTANCE.getVariableDeclarationCompletion();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION_COMPLETION__MULTIPLICITY_INDICATOR = eINSTANCE.getVariableDeclarationCompletion_MultiplicityIndicator();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION_COMPLETION__VARIABLE_NAME = eINSTANCE.getVariableDeclarationCompletion_VariableName();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_COMPLETION__INIT_VALUE = eINSTANCE.getVariableDeclarationCompletion_InitValue();

		/**
		 * The meta object literal for the '{@link alfDsl.impl.AssignmentCompletionImpl <em>Assignment Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.impl.AssignmentCompletionImpl
		 * @see alfDsl.impl.AlfDslPackageImpl#getAssignmentCompletion()
		 * @generated
		 */
		EClass ASSIGNMENT_COMPLETION = eINSTANCE.getAssignmentCompletion();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_COMPLETION__OP = eINSTANCE.getAssignmentCompletion_Op();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_COMPLETION__RIGHT_HAND_SIDE = eINSTANCE.getAssignmentCompletion_RightHandSide();

		/**
		 * The meta object literal for the '{@link alfDsl.BooleanValue <em>Boolean Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.BooleanValue
		 * @see alfDsl.impl.AlfDslPackageImpl#getBooleanValue()
		 * @generated
		 */
		EEnum BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '{@link alfDsl.LinkOperationKind <em>Link Operation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.LinkOperationKind
		 * @see alfDsl.impl.AlfDslPackageImpl#getLinkOperationKind()
		 * @generated
		 */
		EEnum LINK_OPERATION_KIND = eINSTANCE.getLinkOperationKind();

		/**
		 * The meta object literal for the '{@link alfDsl.SelectOrRejectOperator <em>Select Or Reject Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.SelectOrRejectOperator
		 * @see alfDsl.impl.AlfDslPackageImpl#getSelectOrRejectOperator()
		 * @generated
		 */
		EEnum SELECT_OR_REJECT_OPERATOR = eINSTANCE.getSelectOrRejectOperator();

		/**
		 * The meta object literal for the '{@link alfDsl.CollectOrIterateOperator <em>Collect Or Iterate Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.CollectOrIterateOperator
		 * @see alfDsl.impl.AlfDslPackageImpl#getCollectOrIterateOperator()
		 * @generated
		 */
		EEnum COLLECT_OR_ITERATE_OPERATOR = eINSTANCE.getCollectOrIterateOperator();

		/**
		 * The meta object literal for the '{@link alfDsl.ForAllOrExistsOrOneOperator <em>For All Or Exists Or One Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.ForAllOrExistsOrOneOperator
		 * @see alfDsl.impl.AlfDslPackageImpl#getForAllOrExistsOrOneOperator()
		 * @generated
		 */
		EEnum FOR_ALL_OR_EXISTS_OR_ONE_OPERATOR = eINSTANCE.getForAllOrExistsOrOneOperator();

		/**
		 * The meta object literal for the '{@link alfDsl.AnnotationKind <em>Annotation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.AnnotationKind
		 * @see alfDsl.impl.AlfDslPackageImpl#getAnnotationKind()
		 * @generated
		 */
		EEnum ANNOTATION_KIND = eINSTANCE.getAnnotationKind();

		/**
		 * The meta object literal for the '{@link alfDsl.AssignmentOperator <em>Assignment Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alfDsl.AssignmentOperator
		 * @see alfDsl.impl.AlfDslPackageImpl#getAssignmentOperator()
		 * @generated
		 */
		EEnum ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

	}

} //AlfDslPackage
