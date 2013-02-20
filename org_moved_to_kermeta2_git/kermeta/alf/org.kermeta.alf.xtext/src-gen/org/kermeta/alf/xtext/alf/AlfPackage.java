/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf;

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
 * @see org.kermeta.alf.xtext.alf.AlfFactory
 * @model kind="package"
 * @generated
 */
public interface AlfPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "alf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.kermeta.org/alf/1_0_0/org3/kermeta/alf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "alf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlfPackage eINSTANCE = org.kermeta.alf.xtext.alf.impl.AlfPackageImpl.init();

  /**
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.CLASSSTRUCTImpl <em>CLASSSTRUCT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.CLASSSTRUCTImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getCLASSSTRUCT()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.CLASSOPImpl <em>CLASSOP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.CLASSOPImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getCLASSOP()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ValueSpecificationImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getValueSpecification()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.LITERALImpl <em>LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.LITERALImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLITERAL()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.BOOLEAN_LITERALImpl <em>BOOLEAN LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.BOOLEAN_LITERALImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getBOOLEAN_LITERAL()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.NUMBER_LITERALImpl <em>NUMBER LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.NUMBER_LITERALImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNUMBER_LITERAL()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.INTEGER_LITERALImpl <em>INTEGER LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.INTEGER_LITERALImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getINTEGER_LITERAL()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.UNLIMITED_LITERALImpl <em>UNLIMITED LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.UNLIMITED_LITERALImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getUNLIMITED_LITERAL()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.STRING_LITERALImpl <em>STRING LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.STRING_LITERALImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSTRING_LITERAL()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.NameExpressionImpl <em>Name Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.NameExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNameExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.QualifiedNamePathImpl <em>Qualified Name Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.QualifiedNamePathImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getQualifiedNamePath()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.UnqualifiedNameImpl <em>Unqualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.UnqualifiedNameImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getUnqualifiedName()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.TemplateBindingImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getTemplateBinding()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.NamedTemplateBindingImpl <em>Named Template Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.NamedTemplateBindingImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNamedTemplateBinding()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.QualifiedNameWithBindingImpl <em>Qualified Name With Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.QualifiedNameWithBindingImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getQualifiedNameWithBinding()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.TupleImpl <em>Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.TupleImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getTuple()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.TupleElementImpl <em>Tuple Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.TupleElementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getTupleElement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceElementImpl <em>Sequence Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SequenceElementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceElement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ConditionalTestExpressionImpl <em>Conditional Test Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ConditionalTestExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getConditionalTestExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ConditionalOrExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getConditionalOrExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ConditionalAndExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getConditionalAndExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.InclusiveOrExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getInclusiveOrExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ExclusiveOrExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getExclusiveOrExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.AndExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAndExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.EqualityExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getEqualityExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ClassificationExpressionImpl <em>Classification Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ClassificationExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassificationExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.RelationalExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getRelationalExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ShiftExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getShiftExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.AdditiveExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAdditiveExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.MultiplicativeExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getMultiplicativeExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.UnaryExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getUnaryExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.PrimaryExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getPrimaryExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SuffixExpressionImpl <em>Suffix Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SuffixExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSuffixExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.OperationCallExpressionImpl <em>Operation Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.OperationCallExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getOperationCallExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.OperationCallExpressionWithoutDotImpl <em>Operation Call Expression Without Dot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.OperationCallExpressionWithoutDotImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getOperationCallExpressionWithoutDot()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.PropertyCallExpressionImpl <em>Property Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.PropertyCallExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getPropertyCallExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.LinkOperationExpressionImpl <em>Link Operation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.LinkOperationExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLinkOperationExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.LinkOperationTupleImpl <em>Link Operation Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.LinkOperationTupleImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLinkOperationTuple()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.LinkOperationTupleElementImpl <em>Link Operation Tuple Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.LinkOperationTupleElementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLinkOperationTupleElement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceOperationExpressionImpl <em>Sequence Operation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SequenceOperationExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceOperationExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceReductionExpressionImpl <em>Sequence Reduction Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SequenceReductionExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceReductionExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceExpansionExpressionImpl <em>Sequence Expansion Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SequenceExpansionExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceExpansionExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SelectOrRejectOperationImpl <em>Select Or Reject Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SelectOrRejectOperationImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSelectOrRejectOperation()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.CollectOrIterateOperationImpl <em>Collect Or Iterate Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.CollectOrIterateOperationImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getCollectOrIterateOperation()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ForAllOrExistsOrOneOperationImpl <em>For All Or Exists Or One Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ForAllOrExistsOrOneOperationImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getForAllOrExistsOrOneOperation()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.IsUniqueOperationImpl <em>Is Unique Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.IsUniqueOperationImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getIsUniqueOperation()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.NonLiteralValueSpecificationImpl <em>Non Literal Value Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.NonLiteralValueSpecificationImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNonLiteralValueSpecification()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ParenthesizedExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getParenthesizedExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.NullExpressionImpl <em>Null Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.NullExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNullExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ThisExpressionImpl <em>This Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ThisExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getThisExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SuperInvocationExpressionImpl <em>Super Invocation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SuperInvocationExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSuperInvocationExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.InstanceCreationExpressionImpl <em>Instance Creation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.InstanceCreationExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getInstanceCreationExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceConstructionOrAccessCompletionImpl <em>Sequence Construction Or Access Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SequenceConstructionOrAccessCompletionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceConstructionOrAccessCompletion()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.AccessCompletionImpl <em>Access Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.AccessCompletionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAccessCompletion()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.PartialSequenceConstructionCompletionImpl <em>Partial Sequence Construction Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.PartialSequenceConstructionCompletionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getPartialSequenceConstructionCompletion()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceConstructionCompletionImpl <em>Sequence Construction Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SequenceConstructionCompletionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceConstructionCompletion()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceConstructionExpressionImpl <em>Sequence Construction Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SequenceConstructionExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceConstructionExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ClassExtentExpressionImpl <em>Class Extent Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ClassExtentExpressionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassExtentExpression()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.BlockImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getBlock()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.StatementSequenceImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getStatementSequence()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.StatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.InlineStatementImpl <em>Inline Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.InlineStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getInlineStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.AnnotatedStatementImpl <em>Annotated Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.AnnotatedStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAnnotatedStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.DocumentedStatementImpl <em>Documented Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.DocumentedStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getDocumentedStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.AnnotationImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAnnotation()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.BlockStatementImpl <em>Block Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.BlockStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getBlockStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.EmptyStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getEmptyStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.LocalNameDeclarationStatementImpl <em>Local Name Declaration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.LocalNameDeclarationStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLocalNameDeclarationStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.IfStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getIfStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SequentialClausesImpl <em>Sequential Clauses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SequentialClausesImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequentialClauses()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ConcurrentClausesImpl <em>Concurrent Clauses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ConcurrentClausesImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getConcurrentClauses()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.NonFinalClauseImpl <em>Non Final Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.NonFinalClauseImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNonFinalClause()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.FinalClauseImpl <em>Final Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.FinalClauseImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getFinalClause()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SwitchStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSwitchStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SwitchClauseImpl <em>Switch Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SwitchClauseImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSwitchClause()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SwitchCaseImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSwitchCase()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SwitchDefaultClauseImpl <em>Switch Default Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SwitchDefaultClauseImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSwitchDefaultClause()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.NonEmptyStatementSequenceImpl <em>Non Empty Statement Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.NonEmptyStatementSequenceImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNonEmptyStatementSequence()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.WhileStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getWhileStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.DoStatementImpl <em>Do Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.DoStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getDoStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ForStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getForStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ForControlImpl <em>For Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ForControlImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getForControl()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.LoopVariableDefinitionImpl <em>Loop Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.LoopVariableDefinitionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLoopVariableDefinition()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.BreakStatementImpl <em>Break Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.BreakStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getBreakStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ReturnStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getReturnStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.AcceptStatementImpl <em>Accept Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.AcceptStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAcceptStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SimpleAcceptStatementCompletionImpl <em>Simple Accept Statement Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SimpleAcceptStatementCompletionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSimpleAcceptStatementCompletion()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.CompoundAcceptStatementCompletionImpl <em>Compound Accept Statement Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.CompoundAcceptStatementCompletionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getCompoundAcceptStatementCompletion()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.AcceptBlockImpl <em>Accept Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.AcceptBlockImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAcceptBlock()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.AcceptClauseImpl <em>Accept Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.AcceptClauseImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAcceptClause()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ClassifyStatementImpl <em>Classify Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ClassifyStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassifyStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ClassificationClauseImpl <em>Classification Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ClassificationClauseImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassificationClause()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ClassificationFromClauseImpl <em>Classification From Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ClassificationFromClauseImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassificationFromClause()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ClassificationToClauseImpl <em>Classification To Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ClassificationToClauseImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassificationToClause()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ReclassifyAllClauseImpl <em>Reclassify All Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ReclassifyAllClauseImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getReclassifyAllClause()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.QualifiedNameListImpl <em>Qualified Name List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.QualifiedNameListImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getQualifiedNameList()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.InvocationOrAssignementOrDeclarationStatementImpl <em>Invocation Or Assignement Or Declaration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.InvocationOrAssignementOrDeclarationStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getInvocationOrAssignementOrDeclarationStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.SuperInvocationStatementImpl <em>Super Invocation Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.SuperInvocationStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSuperInvocationStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.ThisInvocationStatementImpl <em>This Invocation Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.ThisInvocationStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getThisInvocationStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.InstanceCreationInvocationStatementImpl <em>Instance Creation Invocation Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.InstanceCreationInvocationStatementImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getInstanceCreationInvocationStatement()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.VariableDeclarationCompletionImpl <em>Variable Declaration Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.VariableDeclarationCompletionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getVariableDeclarationCompletion()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.impl.AssignmentCompletionImpl <em>Assignment Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.impl.AssignmentCompletionImpl
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAssignmentCompletion()
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
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.BooleanValue <em>Boolean Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.BooleanValue
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 103;

  /**
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.LinkOperationKind <em>Link Operation Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.LinkOperationKind
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLinkOperationKind()
   * @generated
   */
  int LINK_OPERATION_KIND = 104;

  /**
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.SelectOrRejectOperator <em>Select Or Reject Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.SelectOrRejectOperator
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSelectOrRejectOperator()
   * @generated
   */
  int SELECT_OR_REJECT_OPERATOR = 105;

  /**
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.CollectOrIterateOperator <em>Collect Or Iterate Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.CollectOrIterateOperator
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getCollectOrIterateOperator()
   * @generated
   */
  int COLLECT_OR_ITERATE_OPERATOR = 106;

  /**
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperator <em>For All Or Exists Or One Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperator
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getForAllOrExistsOrOneOperator()
   * @generated
   */
  int FOR_ALL_OR_EXISTS_OR_ONE_OPERATOR = 107;

  /**
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.AnnotationKind <em>Annotation Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.AnnotationKind
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAnnotationKind()
   * @generated
   */
  int ANNOTATION_KIND = 108;

  /**
   * The meta object id for the '{@link org.kermeta.alf.xtext.alf.AssignmentOperator <em>Assignment Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kermeta.alf.xtext.alf.AssignmentOperator
   * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAssignmentOperator()
   * @generated
   */
  int ASSIGNMENT_OPERATOR = 109;


  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.CLASSSTRUCT <em>CLASSSTRUCT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CLASSSTRUCT</em>'.
   * @see org.kermeta.alf.xtext.alf.CLASSSTRUCT
   * @generated
   */
  EClass getCLASSSTRUCT();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.CLASSSTRUCT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.kermeta.alf.xtext.alf.CLASSSTRUCT#getName()
   * @see #getCLASSSTRUCT()
   * @generated
   */
  EAttribute getCLASSSTRUCT_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.CLASSSTRUCT#getClsop <em>Clsop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clsop</em>'.
   * @see org.kermeta.alf.xtext.alf.CLASSSTRUCT#getClsop()
   * @see #getCLASSSTRUCT()
   * @generated
   */
  EReference getCLASSSTRUCT_Clsop();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.CLASSOP <em>CLASSOP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CLASSOP</em>'.
   * @see org.kermeta.alf.xtext.alf.CLASSOP
   * @generated
   */
  EClass getCLASSOP();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.CLASSOP#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.kermeta.alf.xtext.alf.CLASSOP#getName()
   * @see #getCLASSOP()
   * @generated
   */
  EAttribute getCLASSOP_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.CLASSOP#getStat <em>Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stat</em>'.
   * @see org.kermeta.alf.xtext.alf.CLASSOP#getStat()
   * @see #getCLASSOP()
   * @generated
   */
  EReference getCLASSOP_Stat();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.LITERAL <em>LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LITERAL</em>'.
   * @see org.kermeta.alf.xtext.alf.LITERAL
   * @generated
   */
  EClass getLITERAL();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.LITERAL#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.LITERAL#getSuffix()
   * @see #getLITERAL()
   * @generated
   */
  EReference getLITERAL_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.BOOLEAN_LITERAL <em>BOOLEAN LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOOLEAN LITERAL</em>'.
   * @see org.kermeta.alf.xtext.alf.BOOLEAN_LITERAL
   * @generated
   */
  EClass getBOOLEAN_LITERAL();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.BOOLEAN_LITERAL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.kermeta.alf.xtext.alf.BOOLEAN_LITERAL#getValue()
   * @see #getBOOLEAN_LITERAL()
   * @generated
   */
  EAttribute getBOOLEAN_LITERAL_Value();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.NUMBER_LITERAL <em>NUMBER LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NUMBER LITERAL</em>'.
   * @see org.kermeta.alf.xtext.alf.NUMBER_LITERAL
   * @generated
   */
  EClass getNUMBER_LITERAL();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.NUMBER_LITERAL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.kermeta.alf.xtext.alf.NUMBER_LITERAL#getValue()
   * @see #getNUMBER_LITERAL()
   * @generated
   */
  EAttribute getNUMBER_LITERAL_Value();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.INTEGER_LITERAL <em>INTEGER LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>INTEGER LITERAL</em>'.
   * @see org.kermeta.alf.xtext.alf.INTEGER_LITERAL
   * @generated
   */
  EClass getINTEGER_LITERAL();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.UNLIMITED_LITERAL <em>UNLIMITED LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UNLIMITED LITERAL</em>'.
   * @see org.kermeta.alf.xtext.alf.UNLIMITED_LITERAL
   * @generated
   */
  EClass getUNLIMITED_LITERAL();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.STRING_LITERAL <em>STRING LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STRING LITERAL</em>'.
   * @see org.kermeta.alf.xtext.alf.STRING_LITERAL
   * @generated
   */
  EClass getSTRING_LITERAL();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.STRING_LITERAL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.kermeta.alf.xtext.alf.STRING_LITERAL#getValue()
   * @see #getSTRING_LITERAL()
   * @generated
   */
  EAttribute getSTRING_LITERAL_Value();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.NameExpression <em>Name Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.NameExpression
   * @generated
   */
  EClass getNameExpression();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.NameExpression#getPrefixOp <em>Prefix Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix Op</em>'.
   * @see org.kermeta.alf.xtext.alf.NameExpression#getPrefixOp()
   * @see #getNameExpression()
   * @generated
   */
  EAttribute getNameExpression_PrefixOp();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.NameExpression#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.kermeta.alf.xtext.alf.NameExpression#getPath()
   * @see #getNameExpression()
   * @generated
   */
  EReference getNameExpression_Path();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.NameExpression#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.kermeta.alf.xtext.alf.NameExpression#getId()
   * @see #getNameExpression()
   * @generated
   */
  EAttribute getNameExpression_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.NameExpression#getInvocationCompletion <em>Invocation Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invocation Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.NameExpression#getInvocationCompletion()
   * @see #getNameExpression()
   * @generated
   */
  EReference getNameExpression_InvocationCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.NameExpression#getSequenceConstructionCompletion <em>Sequence Construction Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Construction Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.NameExpression#getSequenceConstructionCompletion()
   * @see #getNameExpression()
   * @generated
   */
  EReference getNameExpression_SequenceConstructionCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.NameExpression#getPostfixOp <em>Postfix Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Postfix Op</em>'.
   * @see org.kermeta.alf.xtext.alf.NameExpression#getPostfixOp()
   * @see #getNameExpression()
   * @generated
   */
  EAttribute getNameExpression_PostfixOp();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.NameExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.NameExpression#getSuffix()
   * @see #getNameExpression()
   * @generated
   */
  EReference getNameExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.QualifiedNamePath <em>Qualified Name Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name Path</em>'.
   * @see org.kermeta.alf.xtext.alf.QualifiedNamePath
   * @generated
   */
  EClass getQualifiedNamePath();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.QualifiedNamePath#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespace</em>'.
   * @see org.kermeta.alf.xtext.alf.QualifiedNamePath#getNamespace()
   * @see #getQualifiedNamePath()
   * @generated
   */
  EReference getQualifiedNamePath_Namespace();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.UnqualifiedName <em>Unqualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqualified Name</em>'.
   * @see org.kermeta.alf.xtext.alf.UnqualifiedName
   * @generated
   */
  EClass getUnqualifiedName();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.UnqualifiedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.kermeta.alf.xtext.alf.UnqualifiedName#getName()
   * @see #getUnqualifiedName()
   * @generated
   */
  EAttribute getUnqualifiedName_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.UnqualifiedName#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template Binding</em>'.
   * @see org.kermeta.alf.xtext.alf.UnqualifiedName#getTemplateBinding()
   * @see #getUnqualifiedName()
   * @generated
   */
  EReference getUnqualifiedName_TemplateBinding();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.TemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Binding</em>'.
   * @see org.kermeta.alf.xtext.alf.TemplateBinding
   * @generated
   */
  EClass getTemplateBinding();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.TemplateBinding#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.kermeta.alf.xtext.alf.TemplateBinding#getBindings()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_Bindings();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.NamedTemplateBinding <em>Named Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Template Binding</em>'.
   * @see org.kermeta.alf.xtext.alf.NamedTemplateBinding
   * @generated
   */
  EClass getNamedTemplateBinding();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.NamedTemplateBinding#getFormal <em>Formal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Formal</em>'.
   * @see org.kermeta.alf.xtext.alf.NamedTemplateBinding#getFormal()
   * @see #getNamedTemplateBinding()
   * @generated
   */
  EAttribute getNamedTemplateBinding_Formal();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.NamedTemplateBinding#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual</em>'.
   * @see org.kermeta.alf.xtext.alf.NamedTemplateBinding#getActual()
   * @see #getNamedTemplateBinding()
   * @generated
   */
  EReference getNamedTemplateBinding_Actual();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.QualifiedNameWithBinding <em>Qualified Name With Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name With Binding</em>'.
   * @see org.kermeta.alf.xtext.alf.QualifiedNameWithBinding
   * @generated
   */
  EClass getQualifiedNameWithBinding();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.QualifiedNameWithBinding#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.kermeta.alf.xtext.alf.QualifiedNameWithBinding#getId()
   * @see #getQualifiedNameWithBinding()
   * @generated
   */
  EAttribute getQualifiedNameWithBinding_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.QualifiedNameWithBinding#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binding</em>'.
   * @see org.kermeta.alf.xtext.alf.QualifiedNameWithBinding#getBinding()
   * @see #getQualifiedNameWithBinding()
   * @generated
   */
  EReference getQualifiedNameWithBinding_Binding();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.QualifiedNameWithBinding#getRemaining <em>Remaining</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Remaining</em>'.
   * @see org.kermeta.alf.xtext.alf.QualifiedNameWithBinding#getRemaining()
   * @see #getQualifiedNameWithBinding()
   * @generated
   */
  EReference getQualifiedNameWithBinding_Remaining();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple</em>'.
   * @see org.kermeta.alf.xtext.alf.Tuple
   * @generated
   */
  EClass getTuple();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.Tuple#getTupleElements <em>Tuple Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tuple Elements</em>'.
   * @see org.kermeta.alf.xtext.alf.Tuple#getTupleElements()
   * @see #getTuple()
   * @generated
   */
  EReference getTuple_TupleElements();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.TupleElement <em>Tuple Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Element</em>'.
   * @see org.kermeta.alf.xtext.alf.TupleElement
   * @generated
   */
  EClass getTupleElement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.TupleElement#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see org.kermeta.alf.xtext.alf.TupleElement#getArgument()
   * @see #getTupleElement()
   * @generated
   */
  EReference getTupleElement_Argument();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ConditionalTestExpression <em>Conditional Test Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Test Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ConditionalTestExpression
   * @generated
   */
  EClass getConditionalTestExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ConditionalTestExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.ConditionalTestExpression#getExp()
   * @see #getConditionalTestExpression()
   * @generated
   */
  EReference getConditionalTestExpression_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ConditionalTestExpression#getWhenTrue <em>When True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When True</em>'.
   * @see org.kermeta.alf.xtext.alf.ConditionalTestExpression#getWhenTrue()
   * @see #getConditionalTestExpression()
   * @generated
   */
  EReference getConditionalTestExpression_WhenTrue();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ConditionalTestExpression#getWhenFalse <em>When False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When False</em>'.
   * @see org.kermeta.alf.xtext.alf.ConditionalTestExpression#getWhenFalse()
   * @see #getConditionalTestExpression()
   * @generated
   */
  EReference getConditionalTestExpression_WhenFalse();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Or Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ConditionalOrExpression
   * @generated
   */
  EClass getConditionalOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.ConditionalOrExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.ConditionalOrExpression#getExp()
   * @see #getConditionalOrExpression()
   * @generated
   */
  EReference getConditionalOrExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ConditionalAndExpression <em>Conditional And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional And Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ConditionalAndExpression
   * @generated
   */
  EClass getConditionalAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.ConditionalAndExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.ConditionalAndExpression#getExp()
   * @see #getConditionalAndExpression()
   * @generated
   */
  EReference getConditionalAndExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inclusive Or Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.InclusiveOrExpression
   * @generated
   */
  EClass getInclusiveOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.InclusiveOrExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.InclusiveOrExpression#getExp()
   * @see #getInclusiveOrExpression()
   * @generated
   */
  EReference getInclusiveOrExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusive Or Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ExclusiveOrExpression
   * @generated
   */
  EClass getExclusiveOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.ExclusiveOrExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.ExclusiveOrExpression#getExp()
   * @see #getExclusiveOrExpression()
   * @generated
   */
  EReference getExclusiveOrExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.AndExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.AndExpression#getExp()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.EqualityExpression
   * @generated
   */
  EClass getEqualityExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.EqualityExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.EqualityExpression#getExp()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Exp();

  /**
   * Returns the meta object for the attribute list '{@link org.kermeta.alf.xtext.alf.EqualityExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.EqualityExpression#getOp()
   * @see #getEqualityExpression()
   * @generated
   */
  EAttribute getEqualityExpression_Op();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ClassificationExpression <em>Classification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationExpression
   * @generated
   */
  EClass getClassificationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ClassificationExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationExpression#getExp()
   * @see #getClassificationExpression()
   * @generated
   */
  EReference getClassificationExpression_Exp();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.ClassificationExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationExpression#getOp()
   * @see #getClassificationExpression()
   * @generated
   */
  EAttribute getClassificationExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ClassificationExpression#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationExpression#getTypeName()
   * @see #getClassificationExpression()
   * @generated
   */
  EReference getClassificationExpression_TypeName();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.RelationalExpression
   * @generated
   */
  EClass getRelationalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.RelationalExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.kermeta.alf.xtext.alf.RelationalExpression#getLeft()
   * @see #getRelationalExpression()
   * @generated
   */
  EReference getRelationalExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.RelationalExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.RelationalExpression#getOp()
   * @see #getRelationalExpression()
   * @generated
   */
  EAttribute getRelationalExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.RelationalExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.kermeta.alf.xtext.alf.RelationalExpression#getRight()
   * @see #getRelationalExpression()
   * @generated
   */
  EReference getRelationalExpression_Right();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ShiftExpression <em>Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ShiftExpression
   * @generated
   */
  EClass getShiftExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.ShiftExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.ShiftExpression#getExp()
   * @see #getShiftExpression()
   * @generated
   */
  EReference getShiftExpression_Exp();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.ShiftExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.ShiftExpression#getOp()
   * @see #getShiftExpression()
   * @generated
   */
  EAttribute getShiftExpression_Op();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.AdditiveExpression
   * @generated
   */
  EClass getAdditiveExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.AdditiveExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.AdditiveExpression#getExp()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_Exp();

  /**
   * Returns the meta object for the attribute list '{@link org.kermeta.alf.xtext.alf.AdditiveExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.AdditiveExpression#getOp()
   * @see #getAdditiveExpression()
   * @generated
   */
  EAttribute getAdditiveExpression_Op();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.MultiplicativeExpression
   * @generated
   */
  EClass getMultiplicativeExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.MultiplicativeExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.MultiplicativeExpression#getExp()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EReference getMultiplicativeExpression_Exp();

  /**
   * Returns the meta object for the attribute list '{@link org.kermeta.alf.xtext.alf.MultiplicativeExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.MultiplicativeExpression#getOp()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EAttribute getMultiplicativeExpression_Op();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.UnaryExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.UnaryExpression#getOp()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.UnaryExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.kermeta.alf.xtext.alf.UnaryExpression#getExp()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.PrimaryExpression#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see org.kermeta.alf.xtext.alf.PrimaryExpression#getPrefix()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_Prefix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SuffixExpression <em>Suffix Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suffix Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.SuffixExpression
   * @generated
   */
  EClass getSuffixExpression();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.OperationCallExpression <em>Operation Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Call Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.OperationCallExpression
   * @generated
   */
  EClass getOperationCallExpression();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.OperationCallExpression#getOperationName <em>Operation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation Name</em>'.
   * @see org.kermeta.alf.xtext.alf.OperationCallExpression#getOperationName()
   * @see #getOperationCallExpression()
   * @generated
   */
  EAttribute getOperationCallExpression_OperationName();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.OperationCallExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.kermeta.alf.xtext.alf.OperationCallExpression#getTuple()
   * @see #getOperationCallExpression()
   * @generated
   */
  EReference getOperationCallExpression_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.OperationCallExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.OperationCallExpression#getSuffix()
   * @see #getOperationCallExpression()
   * @generated
   */
  EReference getOperationCallExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.OperationCallExpressionWithoutDot <em>Operation Call Expression Without Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Call Expression Without Dot</em>'.
   * @see org.kermeta.alf.xtext.alf.OperationCallExpressionWithoutDot
   * @generated
   */
  EClass getOperationCallExpressionWithoutDot();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.OperationCallExpressionWithoutDot#getOperationName <em>Operation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation Name</em>'.
   * @see org.kermeta.alf.xtext.alf.OperationCallExpressionWithoutDot#getOperationName()
   * @see #getOperationCallExpressionWithoutDot()
   * @generated
   */
  EAttribute getOperationCallExpressionWithoutDot_OperationName();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.OperationCallExpressionWithoutDot#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.kermeta.alf.xtext.alf.OperationCallExpressionWithoutDot#getTuple()
   * @see #getOperationCallExpressionWithoutDot()
   * @generated
   */
  EReference getOperationCallExpressionWithoutDot_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.OperationCallExpressionWithoutDot#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.OperationCallExpressionWithoutDot#getSuffix()
   * @see #getOperationCallExpressionWithoutDot()
   * @generated
   */
  EReference getOperationCallExpressionWithoutDot_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.PropertyCallExpression <em>Property Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Call Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.PropertyCallExpression
   * @generated
   */
  EClass getPropertyCallExpression();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.PropertyCallExpression#getPropertyName <em>Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Name</em>'.
   * @see org.kermeta.alf.xtext.alf.PropertyCallExpression#getPropertyName()
   * @see #getPropertyCallExpression()
   * @generated
   */
  EAttribute getPropertyCallExpression_PropertyName();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.PropertyCallExpression#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.kermeta.alf.xtext.alf.PropertyCallExpression#getIndex()
   * @see #getPropertyCallExpression()
   * @generated
   */
  EReference getPropertyCallExpression_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.PropertyCallExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.PropertyCallExpression#getSuffix()
   * @see #getPropertyCallExpression()
   * @generated
   */
  EReference getPropertyCallExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.LinkOperationExpression <em>Link Operation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Operation Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.LinkOperationExpression
   * @generated
   */
  EClass getLinkOperationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.LinkOperationExpression#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.kermeta.alf.xtext.alf.LinkOperationExpression#getKind()
   * @see #getLinkOperationExpression()
   * @generated
   */
  EAttribute getLinkOperationExpression_Kind();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.LinkOperationExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.kermeta.alf.xtext.alf.LinkOperationExpression#getTuple()
   * @see #getLinkOperationExpression()
   * @generated
   */
  EReference getLinkOperationExpression_Tuple();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.LinkOperationTuple <em>Link Operation Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Operation Tuple</em>'.
   * @see org.kermeta.alf.xtext.alf.LinkOperationTuple
   * @generated
   */
  EClass getLinkOperationTuple();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.LinkOperationTuple#getLinkOperationTupleElement <em>Link Operation Tuple Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Link Operation Tuple Element</em>'.
   * @see org.kermeta.alf.xtext.alf.LinkOperationTuple#getLinkOperationTupleElement()
   * @see #getLinkOperationTuple()
   * @generated
   */
  EReference getLinkOperationTuple_LinkOperationTupleElement();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.LinkOperationTupleElement <em>Link Operation Tuple Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Operation Tuple Element</em>'.
   * @see org.kermeta.alf.xtext.alf.LinkOperationTupleElement
   * @generated
   */
  EClass getLinkOperationTupleElement();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getObjectOrRole <em>Object Or Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Or Role</em>'.
   * @see org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getObjectOrRole()
   * @see #getLinkOperationTupleElement()
   * @generated
   */
  EAttribute getLinkOperationTupleElement_ObjectOrRole();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getRoleIndex <em>Role Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Role Index</em>'.
   * @see org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getRoleIndex()
   * @see #getLinkOperationTupleElement()
   * @generated
   */
  EReference getLinkOperationTupleElement_RoleIndex();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getObject()
   * @see #getLinkOperationTupleElement()
   * @generated
   */
  EAttribute getLinkOperationTupleElement_Object();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SequenceOperationExpression <em>Sequence Operation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Operation Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceOperationExpression
   * @generated
   */
  EClass getSequenceOperationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.SequenceOperationExpression#getOperationName <em>Operation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation Name</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceOperationExpression#getOperationName()
   * @see #getSequenceOperationExpression()
   * @generated
   */
  EAttribute getSequenceOperationExpression_OperationName();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceOperationExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceOperationExpression#getTuple()
   * @see #getSequenceOperationExpression()
   * @generated
   */
  EReference getSequenceOperationExpression_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceOperationExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceOperationExpression#getSuffix()
   * @see #getSequenceOperationExpression()
   * @generated
   */
  EReference getSequenceOperationExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SequenceReductionExpression <em>Sequence Reduction Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Reduction Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceReductionExpression
   * @generated
   */
  EClass getSequenceReductionExpression();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.SequenceReductionExpression#isIsOrdered <em>Is Ordered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Ordered</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceReductionExpression#isIsOrdered()
   * @see #getSequenceReductionExpression()
   * @generated
   */
  EAttribute getSequenceReductionExpression_IsOrdered();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceReductionExpression#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behavior</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceReductionExpression#getBehavior()
   * @see #getSequenceReductionExpression()
   * @generated
   */
  EReference getSequenceReductionExpression_Behavior();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceReductionExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceReductionExpression#getSuffix()
   * @see #getSequenceReductionExpression()
   * @generated
   */
  EReference getSequenceReductionExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SequenceExpansionExpression <em>Sequence Expansion Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Expansion Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceExpansionExpression
   * @generated
   */
  EClass getSequenceExpansionExpression();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.SequenceExpansionExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceExpansionExpression#getName()
   * @see #getSequenceExpansionExpression()
   * @generated
   */
  EAttribute getSequenceExpansionExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceExpansionExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceExpansionExpression#getExpr()
   * @see #getSequenceExpansionExpression()
   * @generated
   */
  EReference getSequenceExpansionExpression_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceExpansionExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceExpansionExpression#getSuffix()
   * @see #getSequenceExpansionExpression()
   * @generated
   */
  EReference getSequenceExpansionExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SelectOrRejectOperation <em>Select Or Reject Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Or Reject Operation</em>'.
   * @see org.kermeta.alf.xtext.alf.SelectOrRejectOperation
   * @generated
   */
  EClass getSelectOrRejectOperation();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.SelectOrRejectOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.SelectOrRejectOperation#getOp()
   * @see #getSelectOrRejectOperation()
   * @generated
   */
  EAttribute getSelectOrRejectOperation_Op();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.CollectOrIterateOperation <em>Collect Or Iterate Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collect Or Iterate Operation</em>'.
   * @see org.kermeta.alf.xtext.alf.CollectOrIterateOperation
   * @generated
   */
  EClass getCollectOrIterateOperation();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.CollectOrIterateOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.CollectOrIterateOperation#getOp()
   * @see #getCollectOrIterateOperation()
   * @generated
   */
  EAttribute getCollectOrIterateOperation_Op();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperation <em>For All Or Exists Or One Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For All Or Exists Or One Operation</em>'.
   * @see org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperation
   * @generated
   */
  EClass getForAllOrExistsOrOneOperation();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperation#getOp()
   * @see #getForAllOrExistsOrOneOperation()
   * @generated
   */
  EAttribute getForAllOrExistsOrOneOperation_Op();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.IsUniqueOperation <em>Is Unique Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Unique Operation</em>'.
   * @see org.kermeta.alf.xtext.alf.IsUniqueOperation
   * @generated
   */
  EClass getIsUniqueOperation();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ValueSpecification <em>Value Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Specification</em>'.
   * @see org.kermeta.alf.xtext.alf.ValueSpecification
   * @generated
   */
  EClass getValueSpecification();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.NonLiteralValueSpecification <em>Non Literal Value Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Literal Value Specification</em>'.
   * @see org.kermeta.alf.xtext.alf.NonLiteralValueSpecification
   * @generated
   */
  EClass getNonLiteralValueSpecification();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesized Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ParenthesizedExpression
   * @generated
   */
  EClass getParenthesizedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ParenthesizedExpression#getExpOrTypeCast <em>Exp Or Type Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Or Type Cast</em>'.
   * @see org.kermeta.alf.xtext.alf.ParenthesizedExpression#getExpOrTypeCast()
   * @see #getParenthesizedExpression()
   * @generated
   */
  EReference getParenthesizedExpression_ExpOrTypeCast();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ParenthesizedExpression#getCasted <em>Casted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Casted</em>'.
   * @see org.kermeta.alf.xtext.alf.ParenthesizedExpression#getCasted()
   * @see #getParenthesizedExpression()
   * @generated
   */
  EReference getParenthesizedExpression_Casted();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ParenthesizedExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.ParenthesizedExpression#getSuffix()
   * @see #getParenthesizedExpression()
   * @generated
   */
  EReference getParenthesizedExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.NullExpression <em>Null Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.NullExpression
   * @generated
   */
  EClass getNullExpression();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ThisExpression <em>This Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ThisExpression
   * @generated
   */
  EClass getThisExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ThisExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.ThisExpression#getSuffix()
   * @see #getThisExpression()
   * @generated
   */
  EReference getThisExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SuperInvocationExpression <em>Super Invocation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Invocation Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.SuperInvocationExpression
   * @generated
   */
  EClass getSuperInvocationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.SuperInvocationExpression#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.kermeta.alf.xtext.alf.SuperInvocationExpression#getClassName()
   * @see #getSuperInvocationExpression()
   * @generated
   */
  EAttribute getSuperInvocationExpression_ClassName();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SuperInvocationExpression#getOperationCallWithoutDot <em>Operation Call Without Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call Without Dot</em>'.
   * @see org.kermeta.alf.xtext.alf.SuperInvocationExpression#getOperationCallWithoutDot()
   * @see #getSuperInvocationExpression()
   * @generated
   */
  EReference getSuperInvocationExpression_OperationCallWithoutDot();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SuperInvocationExpression#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see org.kermeta.alf.xtext.alf.SuperInvocationExpression#getOperationCall()
   * @see #getSuperInvocationExpression()
   * @generated
   */
  EReference getSuperInvocationExpression_OperationCall();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.InstanceCreationExpression <em>Instance Creation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Creation Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.InstanceCreationExpression
   * @generated
   */
  EClass getInstanceCreationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.InstanceCreationExpression#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constructor</em>'.
   * @see org.kermeta.alf.xtext.alf.InstanceCreationExpression#getConstructor()
   * @see #getInstanceCreationExpression()
   * @generated
   */
  EReference getInstanceCreationExpression_Constructor();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.InstanceCreationExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.kermeta.alf.xtext.alf.InstanceCreationExpression#getTuple()
   * @see #getInstanceCreationExpression()
   * @generated
   */
  EReference getInstanceCreationExpression_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.InstanceCreationExpression#getSequenceConstuctionCompletion <em>Sequence Constuction Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Constuction Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.InstanceCreationExpression#getSequenceConstuctionCompletion()
   * @see #getInstanceCreationExpression()
   * @generated
   */
  EReference getInstanceCreationExpression_SequenceConstuctionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.InstanceCreationExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.kermeta.alf.xtext.alf.InstanceCreationExpression#getSuffix()
   * @see #getInstanceCreationExpression()
   * @generated
   */
  EReference getInstanceCreationExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion <em>Sequence Construction Or Access Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Construction Or Access Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion
   * @generated
   */
  EClass getSequenceConstructionOrAccessCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion#isMultiplicityIndicator()
   * @see #getSequenceConstructionOrAccessCompletion()
   * @generated
   */
  EAttribute getSequenceConstructionOrAccessCompletion_MultiplicityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion#getAccessCompletion <em>Access Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion#getAccessCompletion()
   * @see #getSequenceConstructionOrAccessCompletion()
   * @generated
   */
  EReference getSequenceConstructionOrAccessCompletion_AccessCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion#getSequenceCompletion <em>Sequence Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion#getSequenceCompletion()
   * @see #getSequenceConstructionOrAccessCompletion()
   * @generated
   */
  EReference getSequenceConstructionOrAccessCompletion_SequenceCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion#getExpression()
   * @see #getSequenceConstructionOrAccessCompletion()
   * @generated
   */
  EReference getSequenceConstructionOrAccessCompletion_Expression();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.AccessCompletion <em>Access Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.AccessCompletion
   * @generated
   */
  EClass getAccessCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.AccessCompletion#getAccessIndex <em>Access Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Index</em>'.
   * @see org.kermeta.alf.xtext.alf.AccessCompletion#getAccessIndex()
   * @see #getAccessCompletion()
   * @generated
   */
  EReference getAccessCompletion_AccessIndex();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.PartialSequenceConstructionCompletion <em>Partial Sequence Construction Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partial Sequence Construction Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.PartialSequenceConstructionCompletion
   * @generated
   */
  EClass getPartialSequenceConstructionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.PartialSequenceConstructionCompletion#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.PartialSequenceConstructionCompletion#getExpression()
   * @see #getPartialSequenceConstructionCompletion()
   * @generated
   */
  EReference getPartialSequenceConstructionCompletion_Expression();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SequenceConstructionCompletion <em>Sequence Construction Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Construction Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionCompletion
   * @generated
   */
  EClass getSequenceConstructionCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.SequenceConstructionCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionCompletion#isMultiplicityIndicator()
   * @see #getSequenceConstructionCompletion()
   * @generated
   */
  EAttribute getSequenceConstructionCompletion_MultiplicityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceConstructionCompletion#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionCompletion#getExpression()
   * @see #getSequenceConstructionCompletion()
   * @generated
   */
  EReference getSequenceConstructionCompletion_Expression();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SequenceConstructionExpression <em>Sequence Construction Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Construction Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionExpression
   * @generated
   */
  EClass getSequenceConstructionExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.SequenceConstructionExpression#getSequenceElement <em>Sequence Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequence Element</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionExpression#getSequenceElement()
   * @see #getSequenceConstructionExpression()
   * @generated
   */
  EReference getSequenceConstructionExpression_SequenceElement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SequenceConstructionExpression#getRangeUpper <em>Range Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range Upper</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceConstructionExpression#getRangeUpper()
   * @see #getSequenceConstructionExpression()
   * @generated
   */
  EReference getSequenceConstructionExpression_RangeUpper();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SequenceElement <em>Sequence Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Element</em>'.
   * @see org.kermeta.alf.xtext.alf.SequenceElement
   * @generated
   */
  EClass getSequenceElement();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ClassExtentExpression <em>Class Extent Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Extent Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassExtentExpression
   * @generated
   */
  EClass getClassExtentExpression();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.kermeta.alf.xtext.alf.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.Block#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see org.kermeta.alf.xtext.alf.Block#getSequence()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Sequence();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.StatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Sequence</em>'.
   * @see org.kermeta.alf.xtext.alf.StatementSequence
   * @generated
   */
  EClass getStatementSequence();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.StatementSequence#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.kermeta.alf.xtext.alf.StatementSequence#getStatements()
   * @see #getStatementSequence()
   * @generated
   */
  EReference getStatementSequence_Statements();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.InlineStatement <em>Inline Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.InlineStatement
   * @generated
   */
  EClass getInlineStatement();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.InlineStatement#getLangageName <em>Langage Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Langage Name</em>'.
   * @see org.kermeta.alf.xtext.alf.InlineStatement#getLangageName()
   * @see #getInlineStatement()
   * @generated
   */
  EAttribute getInlineStatement_LangageName();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.InlineStatement#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see org.kermeta.alf.xtext.alf.InlineStatement#getBody()
   * @see #getInlineStatement()
   * @generated
   */
  EAttribute getInlineStatement_Body();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.AnnotatedStatement <em>Annotated Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotated Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.AnnotatedStatement
   * @generated
   */
  EClass getAnnotatedStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.AnnotatedStatement#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see org.kermeta.alf.xtext.alf.AnnotatedStatement#getAnnotation()
   * @see #getAnnotatedStatement()
   * @generated
   */
  EReference getAnnotatedStatement_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.AnnotatedStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.kermeta.alf.xtext.alf.AnnotatedStatement#getBlock()
   * @see #getAnnotatedStatement()
   * @generated
   */
  EReference getAnnotatedStatement_Block();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.DocumentedStatement <em>Documented Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Documented Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.DocumentedStatement
   * @generated
   */
  EClass getDocumentedStatement();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.DocumentedStatement#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.kermeta.alf.xtext.alf.DocumentedStatement#getComment()
   * @see #getDocumentedStatement()
   * @generated
   */
  EAttribute getDocumentedStatement_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.DocumentedStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.DocumentedStatement#getStatement()
   * @see #getDocumentedStatement()
   * @generated
   */
  EReference getDocumentedStatement_Statement();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.kermeta.alf.xtext.alf.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.Annotation#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.kermeta.alf.xtext.alf.Annotation#getKind()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Kind();

  /**
   * Returns the meta object for the attribute list '{@link org.kermeta.alf.xtext.alf.Annotation#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see org.kermeta.alf.xtext.alf.Annotation#getArgs()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Args();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.BlockStatement
   * @generated
   */
  EClass getBlockStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.BlockStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.kermeta.alf.xtext.alf.BlockStatement#getBlock()
   * @see #getBlockStatement()
   * @generated
   */
  EReference getBlockStatement_Block();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.EmptyStatement <em>Empty Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.EmptyStatement
   * @generated
   */
  EClass getEmptyStatement();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement <em>Local Name Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Name Declaration Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement
   * @generated
   */
  EClass getLocalNameDeclarationStatement();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement#getVarName()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EAttribute getLocalNameDeclarationStatement_VarName();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement#getType()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EReference getLocalNameDeclarationStatement_Type();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
   * @see org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement#isMultiplicityIndicator()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EAttribute getLocalNameDeclarationStatement_MultiplicityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement#getInit()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EReference getLocalNameDeclarationStatement_Init();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.IfStatement#getSequentialClausses <em>Sequential Clausses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequential Clausses</em>'.
   * @see org.kermeta.alf.xtext.alf.IfStatement#getSequentialClausses()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_SequentialClausses();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.IfStatement#getFinalClause <em>Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Final Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.IfStatement#getFinalClause()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_FinalClause();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SequentialClauses <em>Sequential Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequential Clauses</em>'.
   * @see org.kermeta.alf.xtext.alf.SequentialClauses
   * @generated
   */
  EClass getSequentialClauses();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.SequentialClauses#getConccurentClauses <em>Conccurent Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conccurent Clauses</em>'.
   * @see org.kermeta.alf.xtext.alf.SequentialClauses#getConccurentClauses()
   * @see #getSequentialClauses()
   * @generated
   */
  EReference getSequentialClauses_ConccurentClauses();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ConcurrentClauses <em>Concurrent Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concurrent Clauses</em>'.
   * @see org.kermeta.alf.xtext.alf.ConcurrentClauses
   * @generated
   */
  EClass getConcurrentClauses();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.ConcurrentClauses#getNonFinalClause <em>Non Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Non Final Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.ConcurrentClauses#getNonFinalClause()
   * @see #getConcurrentClauses()
   * @generated
   */
  EReference getConcurrentClauses_NonFinalClause();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.NonFinalClause <em>Non Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Final Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.NonFinalClause
   * @generated
   */
  EClass getNonFinalClause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.NonFinalClause#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.kermeta.alf.xtext.alf.NonFinalClause#getCondition()
   * @see #getNonFinalClause()
   * @generated
   */
  EReference getNonFinalClause_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.NonFinalClause#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.kermeta.alf.xtext.alf.NonFinalClause#getBlock()
   * @see #getNonFinalClause()
   * @generated
   */
  EReference getNonFinalClause_Block();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.FinalClause <em>Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Final Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.FinalClause
   * @generated
   */
  EClass getFinalClause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.FinalClause#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.kermeta.alf.xtext.alf.FinalClause#getBlock()
   * @see #getFinalClause()
   * @generated
   */
  EReference getFinalClause_Block();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchStatement
   * @generated
   */
  EClass getSwitchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SwitchStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchStatement#getExpression()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.SwitchStatement#getSwitchClause <em>Switch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switch Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchStatement#getSwitchClause()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_SwitchClause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SwitchStatement#getDefaultClause <em>Default Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchStatement#getDefaultClause()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_DefaultClause();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SwitchClause <em>Switch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchClause
   * @generated
   */
  EClass getSwitchClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.SwitchClause#getSwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switch Case</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchClause#getSwitchCase()
   * @see #getSwitchClause()
   * @generated
   */
  EReference getSwitchClause_SwitchCase();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SwitchClause#getStatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchClause#getStatementSequence()
   * @see #getSwitchClause()
   * @generated
   */
  EReference getSwitchClause_StatementSequence();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Case</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchCase
   * @generated
   */
  EClass getSwitchCase();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SwitchCase#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchCase#getExpression()
   * @see #getSwitchCase()
   * @generated
   */
  EReference getSwitchCase_Expression();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SwitchDefaultClause <em>Switch Default Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Default Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchDefaultClause
   * @generated
   */
  EClass getSwitchDefaultClause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SwitchDefaultClause#getStatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
   * @see org.kermeta.alf.xtext.alf.SwitchDefaultClause#getStatementSequence()
   * @see #getSwitchDefaultClause()
   * @generated
   */
  EReference getSwitchDefaultClause_StatementSequence();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.NonEmptyStatementSequence <em>Non Empty Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Empty Statement Sequence</em>'.
   * @see org.kermeta.alf.xtext.alf.NonEmptyStatementSequence
   * @generated
   */
  EClass getNonEmptyStatementSequence();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.NonEmptyStatementSequence#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.NonEmptyStatementSequence#getStatement()
   * @see #getNonEmptyStatementSequence()
   * @generated
   */
  EReference getNonEmptyStatementSequence_Statement();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.WhileStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.kermeta.alf.xtext.alf.WhileStatement#getCondition()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.WhileStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.kermeta.alf.xtext.alf.WhileStatement#getBlock()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Block();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.DoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.DoStatement
   * @generated
   */
  EClass getDoStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.DoStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.kermeta.alf.xtext.alf.DoStatement#getBlock()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.DoStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.kermeta.alf.xtext.alf.DoStatement#getCondition()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_Condition();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ForStatement#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Control</em>'.
   * @see org.kermeta.alf.xtext.alf.ForStatement#getControl()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Control();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ForStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.kermeta.alf.xtext.alf.ForStatement#getBlock()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Block();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ForControl <em>For Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Control</em>'.
   * @see org.kermeta.alf.xtext.alf.ForControl
   * @generated
   */
  EClass getForControl();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.ForControl#getLoopVariableDefinition <em>Loop Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Loop Variable Definition</em>'.
   * @see org.kermeta.alf.xtext.alf.ForControl#getLoopVariableDefinition()
   * @see #getForControl()
   * @generated
   */
  EReference getForControl_LoopVariableDefinition();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.LoopVariableDefinition <em>Loop Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Variable Definition</em>'.
   * @see org.kermeta.alf.xtext.alf.LoopVariableDefinition
   * @generated
   */
  EClass getLoopVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.LoopVariableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.kermeta.alf.xtext.alf.LoopVariableDefinition#getName()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EAttribute getLoopVariableDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.LoopVariableDefinition#getExpression1 <em>Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression1</em>'.
   * @see org.kermeta.alf.xtext.alf.LoopVariableDefinition#getExpression1()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_Expression1();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.LoopVariableDefinition#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.kermeta.alf.xtext.alf.LoopVariableDefinition#getExpression2()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_Expression2();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.LoopVariableDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.kermeta.alf.xtext.alf.LoopVariableDefinition#getType()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.LoopVariableDefinition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.LoopVariableDefinition#getExpression()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_Expression();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.BreakStatement <em>Break Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.BreakStatement
   * @generated
   */
  EClass getBreakStatement();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ReturnStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ReturnStatement#getExpression()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.AcceptStatement <em>Accept Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.AcceptStatement
   * @generated
   */
  EClass getAcceptStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.AcceptStatement#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.AcceptStatement#getClause()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_Clause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.AcceptStatement#getSimpleAccept <em>Simple Accept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple Accept</em>'.
   * @see org.kermeta.alf.xtext.alf.AcceptStatement#getSimpleAccept()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_SimpleAccept();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.AcceptStatement#getCompoundAccept <em>Compound Accept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compound Accept</em>'.
   * @see org.kermeta.alf.xtext.alf.AcceptStatement#getCompoundAccept()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_CompoundAccept();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SimpleAcceptStatementCompletion <em>Simple Accept Statement Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Accept Statement Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.SimpleAcceptStatementCompletion
   * @generated
   */
  EClass getSimpleAcceptStatementCompletion();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.CompoundAcceptStatementCompletion <em>Compound Accept Statement Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Accept Statement Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.CompoundAcceptStatementCompletion
   * @generated
   */
  EClass getCompoundAcceptStatementCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.CompoundAcceptStatementCompletion#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.kermeta.alf.xtext.alf.CompoundAcceptStatementCompletion#getBlock()
   * @see #getCompoundAcceptStatementCompletion()
   * @generated
   */
  EReference getCompoundAcceptStatementCompletion_Block();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.CompoundAcceptStatementCompletion#getAcceptBlock <em>Accept Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Accept Block</em>'.
   * @see org.kermeta.alf.xtext.alf.CompoundAcceptStatementCompletion#getAcceptBlock()
   * @see #getCompoundAcceptStatementCompletion()
   * @generated
   */
  EReference getCompoundAcceptStatementCompletion_AcceptBlock();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.AcceptBlock <em>Accept Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Block</em>'.
   * @see org.kermeta.alf.xtext.alf.AcceptBlock
   * @generated
   */
  EClass getAcceptBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.AcceptBlock#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.AcceptBlock#getClause()
   * @see #getAcceptBlock()
   * @generated
   */
  EReference getAcceptBlock_Clause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.AcceptBlock#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.kermeta.alf.xtext.alf.AcceptBlock#getBlock()
   * @see #getAcceptBlock()
   * @generated
   */
  EReference getAcceptBlock_Block();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.AcceptClause <em>Accept Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.AcceptClause
   * @generated
   */
  EClass getAcceptClause();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.AcceptClause#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.kermeta.alf.xtext.alf.AcceptClause#getName()
   * @see #getAcceptClause()
   * @generated
   */
  EAttribute getAcceptClause_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.AcceptClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.kermeta.alf.xtext.alf.AcceptClause#getQualifiedNameList()
   * @see #getAcceptClause()
   * @generated
   */
  EReference getAcceptClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ClassifyStatement <em>Classify Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classify Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassifyStatement
   * @generated
   */
  EClass getClassifyStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ClassifyStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassifyStatement#getExpression()
   * @see #getClassifyStatement()
   * @generated
   */
  EReference getClassifyStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ClassifyStatement#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassifyStatement#getClause()
   * @see #getClassifyStatement()
   * @generated
   */
  EReference getClassifyStatement_Clause();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ClassificationClause <em>Classification Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationClause
   * @generated
   */
  EClass getClassificationClause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ClassificationClause#getClassifyFromClause <em>Classify From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classify From Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationClause#getClassifyFromClause()
   * @see #getClassificationClause()
   * @generated
   */
  EReference getClassificationClause_ClassifyFromClause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ClassificationClause#getClassifyToClause <em>Classify To Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classify To Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationClause#getClassifyToClause()
   * @see #getClassificationClause()
   * @generated
   */
  EReference getClassificationClause_ClassifyToClause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ClassificationClause#getReclassyAllClause <em>Reclassy All Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reclassy All Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationClause#getReclassyAllClause()
   * @see #getClassificationClause()
   * @generated
   */
  EReference getClassificationClause_ReclassyAllClause();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ClassificationFromClause <em>Classification From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification From Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationFromClause
   * @generated
   */
  EClass getClassificationFromClause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ClassificationFromClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationFromClause#getQualifiedNameList()
   * @see #getClassificationFromClause()
   * @generated
   */
  EReference getClassificationFromClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ClassificationToClause <em>Classification To Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification To Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationToClause
   * @generated
   */
  EClass getClassificationToClause();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ClassificationToClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.kermeta.alf.xtext.alf.ClassificationToClause#getQualifiedNameList()
   * @see #getClassificationToClause()
   * @generated
   */
  EReference getClassificationToClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ReclassifyAllClause <em>Reclassify All Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reclassify All Clause</em>'.
   * @see org.kermeta.alf.xtext.alf.ReclassifyAllClause
   * @generated
   */
  EClass getReclassifyAllClause();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.QualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name List</em>'.
   * @see org.kermeta.alf.xtext.alf.QualifiedNameList
   * @generated
   */
  EClass getQualifiedNameList();

  /**
   * Returns the meta object for the containment reference list '{@link org.kermeta.alf.xtext.alf.QualifiedNameList#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qualified Name</em>'.
   * @see org.kermeta.alf.xtext.alf.QualifiedNameList#getQualifiedName()
   * @see #getQualifiedNameList()
   * @generated
   */
  EReference getQualifiedNameList_QualifiedName();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.InvocationOrAssignementOrDeclarationStatement <em>Invocation Or Assignement Or Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invocation Or Assignement Or Declaration Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.InvocationOrAssignementOrDeclarationStatement
   * @generated
   */
  EClass getInvocationOrAssignementOrDeclarationStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.InvocationOrAssignementOrDeclarationStatement#getTypePart_OR_assignedPart_OR_invocationPart <em>Type Part OR assigned Part OR invocation Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Part OR assigned Part OR invocation Part</em>'.
   * @see org.kermeta.alf.xtext.alf.InvocationOrAssignementOrDeclarationStatement#getTypePart_OR_assignedPart_OR_invocationPart()
   * @see #getInvocationOrAssignementOrDeclarationStatement()
   * @generated
   */
  EReference getInvocationOrAssignementOrDeclarationStatement_TypePart_OR_assignedPart_OR_invocationPart();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.InvocationOrAssignementOrDeclarationStatement#getVariableDeclarationCompletion <em>Variable Declaration Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.InvocationOrAssignementOrDeclarationStatement#getVariableDeclarationCompletion()
   * @see #getInvocationOrAssignementOrDeclarationStatement()
   * @generated
   */
  EReference getInvocationOrAssignementOrDeclarationStatement_VariableDeclarationCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.InvocationOrAssignementOrDeclarationStatement#getAssignmentCompletion <em>Assignment Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.InvocationOrAssignementOrDeclarationStatement#getAssignmentCompletion()
   * @see #getInvocationOrAssignementOrDeclarationStatement()
   * @generated
   */
  EReference getInvocationOrAssignementOrDeclarationStatement_AssignmentCompletion();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.SuperInvocationStatement <em>Super Invocation Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Invocation Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.SuperInvocationStatement
   * @generated
   */
  EClass getSuperInvocationStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.SuperInvocationStatement#get_super <em>super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>super</em>'.
   * @see org.kermeta.alf.xtext.alf.SuperInvocationStatement#get_super()
   * @see #getSuperInvocationStatement()
   * @generated
   */
  EReference getSuperInvocationStatement__super();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.ThisInvocationStatement <em>This Invocation Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Invocation Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.ThisInvocationStatement
   * @generated
   */
  EClass getThisInvocationStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ThisInvocationStatement#get_this <em>this</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>this</em>'.
   * @see org.kermeta.alf.xtext.alf.ThisInvocationStatement#get_this()
   * @see #getThisInvocationStatement()
   * @generated
   */
  EReference getThisInvocationStatement__this();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.ThisInvocationStatement#getAssignmentCompletion <em>Assignment Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.ThisInvocationStatement#getAssignmentCompletion()
   * @see #getThisInvocationStatement()
   * @generated
   */
  EReference getThisInvocationStatement_AssignmentCompletion();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.InstanceCreationInvocationStatement <em>Instance Creation Invocation Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Creation Invocation Statement</em>'.
   * @see org.kermeta.alf.xtext.alf.InstanceCreationInvocationStatement
   * @generated
   */
  EClass getInstanceCreationInvocationStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.InstanceCreationInvocationStatement#get_new <em>new</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>new</em>'.
   * @see org.kermeta.alf.xtext.alf.InstanceCreationInvocationStatement#get_new()
   * @see #getInstanceCreationInvocationStatement()
   * @generated
   */
  EReference getInstanceCreationInvocationStatement__new();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.VariableDeclarationCompletion <em>Variable Declaration Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.VariableDeclarationCompletion
   * @generated
   */
  EClass getVariableDeclarationCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.VariableDeclarationCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
   * @see org.kermeta.alf.xtext.alf.VariableDeclarationCompletion#isMultiplicityIndicator()
   * @see #getVariableDeclarationCompletion()
   * @generated
   */
  EAttribute getVariableDeclarationCompletion_MultiplicityIndicator();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.VariableDeclarationCompletion#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Name</em>'.
   * @see org.kermeta.alf.xtext.alf.VariableDeclarationCompletion#getVariableName()
   * @see #getVariableDeclarationCompletion()
   * @generated
   */
  EAttribute getVariableDeclarationCompletion_VariableName();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.VariableDeclarationCompletion#getInitValue <em>Init Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init Value</em>'.
   * @see org.kermeta.alf.xtext.alf.VariableDeclarationCompletion#getInitValue()
   * @see #getVariableDeclarationCompletion()
   * @generated
   */
  EReference getVariableDeclarationCompletion_InitValue();

  /**
   * Returns the meta object for class '{@link org.kermeta.alf.xtext.alf.AssignmentCompletion <em>Assignment Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Completion</em>'.
   * @see org.kermeta.alf.xtext.alf.AssignmentCompletion
   * @generated
   */
  EClass getAssignmentCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.kermeta.alf.xtext.alf.AssignmentCompletion#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.kermeta.alf.xtext.alf.AssignmentCompletion#getOp()
   * @see #getAssignmentCompletion()
   * @generated
   */
  EAttribute getAssignmentCompletion_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.kermeta.alf.xtext.alf.AssignmentCompletion#getRightHandSide <em>Right Hand Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Hand Side</em>'.
   * @see org.kermeta.alf.xtext.alf.AssignmentCompletion#getRightHandSide()
   * @see #getAssignmentCompletion()
   * @generated
   */
  EReference getAssignmentCompletion_RightHandSide();

  /**
   * Returns the meta object for enum '{@link org.kermeta.alf.xtext.alf.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Value</em>'.
   * @see org.kermeta.alf.xtext.alf.BooleanValue
   * @generated
   */
  EEnum getBooleanValue();

  /**
   * Returns the meta object for enum '{@link org.kermeta.alf.xtext.alf.LinkOperationKind <em>Link Operation Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Link Operation Kind</em>'.
   * @see org.kermeta.alf.xtext.alf.LinkOperationKind
   * @generated
   */
  EEnum getLinkOperationKind();

  /**
   * Returns the meta object for enum '{@link org.kermeta.alf.xtext.alf.SelectOrRejectOperator <em>Select Or Reject Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Select Or Reject Operator</em>'.
   * @see org.kermeta.alf.xtext.alf.SelectOrRejectOperator
   * @generated
   */
  EEnum getSelectOrRejectOperator();

  /**
   * Returns the meta object for enum '{@link org.kermeta.alf.xtext.alf.CollectOrIterateOperator <em>Collect Or Iterate Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Collect Or Iterate Operator</em>'.
   * @see org.kermeta.alf.xtext.alf.CollectOrIterateOperator
   * @generated
   */
  EEnum getCollectOrIterateOperator();

  /**
   * Returns the meta object for enum '{@link org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperator <em>For All Or Exists Or One Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>For All Or Exists Or One Operator</em>'.
   * @see org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperator
   * @generated
   */
  EEnum getForAllOrExistsOrOneOperator();

  /**
   * Returns the meta object for enum '{@link org.kermeta.alf.xtext.alf.AnnotationKind <em>Annotation Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Annotation Kind</em>'.
   * @see org.kermeta.alf.xtext.alf.AnnotationKind
   * @generated
   */
  EEnum getAnnotationKind();

  /**
   * Returns the meta object for enum '{@link org.kermeta.alf.xtext.alf.AssignmentOperator <em>Assignment Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Assignment Operator</em>'.
   * @see org.kermeta.alf.xtext.alf.AssignmentOperator
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
  AlfFactory getAlfFactory();

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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.CLASSSTRUCTImpl <em>CLASSSTRUCT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.CLASSSTRUCTImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getCLASSSTRUCT()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.CLASSOPImpl <em>CLASSOP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.CLASSOPImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getCLASSOP()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.LITERALImpl <em>LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.LITERALImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLITERAL()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.BOOLEAN_LITERALImpl <em>BOOLEAN LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.BOOLEAN_LITERALImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getBOOLEAN_LITERAL()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.NUMBER_LITERALImpl <em>NUMBER LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.NUMBER_LITERALImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNUMBER_LITERAL()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.INTEGER_LITERALImpl <em>INTEGER LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.INTEGER_LITERALImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getINTEGER_LITERAL()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getINTEGER_LITERAL();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.UNLIMITED_LITERALImpl <em>UNLIMITED LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.UNLIMITED_LITERALImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getUNLIMITED_LITERAL()
     * @generated
     */
    EClass UNLIMITED_LITERAL = eINSTANCE.getUNLIMITED_LITERAL();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.STRING_LITERALImpl <em>STRING LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.STRING_LITERALImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSTRING_LITERAL()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.NameExpressionImpl <em>Name Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.NameExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNameExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.QualifiedNamePathImpl <em>Qualified Name Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.QualifiedNamePathImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getQualifiedNamePath()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.UnqualifiedNameImpl <em>Unqualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.UnqualifiedNameImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getUnqualifiedName()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.TemplateBindingImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getTemplateBinding()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.NamedTemplateBindingImpl <em>Named Template Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.NamedTemplateBindingImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNamedTemplateBinding()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.QualifiedNameWithBindingImpl <em>Qualified Name With Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.QualifiedNameWithBindingImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getQualifiedNameWithBinding()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.TupleImpl <em>Tuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.TupleImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getTuple()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.TupleElementImpl <em>Tuple Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.TupleElementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getTupleElement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ConditionalTestExpressionImpl <em>Conditional Test Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ConditionalTestExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getConditionalTestExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ConditionalOrExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getConditionalOrExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ConditionalAndExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getConditionalAndExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.InclusiveOrExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getInclusiveOrExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ExclusiveOrExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getExclusiveOrExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.AndExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAndExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.EqualityExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getEqualityExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ClassificationExpressionImpl <em>Classification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ClassificationExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassificationExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.RelationalExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getRelationalExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ShiftExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getShiftExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.AdditiveExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAdditiveExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.MultiplicativeExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getMultiplicativeExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.UnaryExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getUnaryExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.PrimaryExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getPrimaryExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SuffixExpressionImpl <em>Suffix Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SuffixExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSuffixExpression()
     * @generated
     */
    EClass SUFFIX_EXPRESSION = eINSTANCE.getSuffixExpression();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.OperationCallExpressionImpl <em>Operation Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.OperationCallExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getOperationCallExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.OperationCallExpressionWithoutDotImpl <em>Operation Call Expression Without Dot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.OperationCallExpressionWithoutDotImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getOperationCallExpressionWithoutDot()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.PropertyCallExpressionImpl <em>Property Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.PropertyCallExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getPropertyCallExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.LinkOperationExpressionImpl <em>Link Operation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.LinkOperationExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLinkOperationExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.LinkOperationTupleImpl <em>Link Operation Tuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.LinkOperationTupleImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLinkOperationTuple()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.LinkOperationTupleElementImpl <em>Link Operation Tuple Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.LinkOperationTupleElementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLinkOperationTupleElement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceOperationExpressionImpl <em>Sequence Operation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SequenceOperationExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceOperationExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceReductionExpressionImpl <em>Sequence Reduction Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SequenceReductionExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceReductionExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceExpansionExpressionImpl <em>Sequence Expansion Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SequenceExpansionExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceExpansionExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SelectOrRejectOperationImpl <em>Select Or Reject Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SelectOrRejectOperationImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSelectOrRejectOperation()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.CollectOrIterateOperationImpl <em>Collect Or Iterate Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.CollectOrIterateOperationImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getCollectOrIterateOperation()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ForAllOrExistsOrOneOperationImpl <em>For All Or Exists Or One Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ForAllOrExistsOrOneOperationImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getForAllOrExistsOrOneOperation()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.IsUniqueOperationImpl <em>Is Unique Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.IsUniqueOperationImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getIsUniqueOperation()
     * @generated
     */
    EClass IS_UNIQUE_OPERATION = eINSTANCE.getIsUniqueOperation();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ValueSpecificationImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getValueSpecification()
     * @generated
     */
    EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.NonLiteralValueSpecificationImpl <em>Non Literal Value Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.NonLiteralValueSpecificationImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNonLiteralValueSpecification()
     * @generated
     */
    EClass NON_LITERAL_VALUE_SPECIFICATION = eINSTANCE.getNonLiteralValueSpecification();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ParenthesizedExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getParenthesizedExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.NullExpressionImpl <em>Null Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.NullExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNullExpression()
     * @generated
     */
    EClass NULL_EXPRESSION = eINSTANCE.getNullExpression();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ThisExpressionImpl <em>This Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ThisExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getThisExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SuperInvocationExpressionImpl <em>Super Invocation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SuperInvocationExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSuperInvocationExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.InstanceCreationExpressionImpl <em>Instance Creation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.InstanceCreationExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getInstanceCreationExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceConstructionOrAccessCompletionImpl <em>Sequence Construction Or Access Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SequenceConstructionOrAccessCompletionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceConstructionOrAccessCompletion()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.AccessCompletionImpl <em>Access Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.AccessCompletionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAccessCompletion()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.PartialSequenceConstructionCompletionImpl <em>Partial Sequence Construction Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.PartialSequenceConstructionCompletionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getPartialSequenceConstructionCompletion()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceConstructionCompletionImpl <em>Sequence Construction Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SequenceConstructionCompletionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceConstructionCompletion()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceConstructionExpressionImpl <em>Sequence Construction Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SequenceConstructionExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceConstructionExpression()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SequenceElementImpl <em>Sequence Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SequenceElementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequenceElement()
     * @generated
     */
    EClass SEQUENCE_ELEMENT = eINSTANCE.getSequenceElement();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ClassExtentExpressionImpl <em>Class Extent Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ClassExtentExpressionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassExtentExpression()
     * @generated
     */
    EClass CLASS_EXTENT_EXPRESSION = eINSTANCE.getClassExtentExpression();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.BlockImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getBlock()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.StatementSequenceImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getStatementSequence()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.InlineStatementImpl <em>Inline Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.InlineStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getInlineStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.AnnotatedStatementImpl <em>Annotated Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.AnnotatedStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAnnotatedStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.DocumentedStatementImpl <em>Documented Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.DocumentedStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getDocumentedStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.StatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.AnnotationImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAnnotation()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.BlockStatementImpl <em>Block Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.BlockStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getBlockStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.EmptyStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getEmptyStatement()
     * @generated
     */
    EClass EMPTY_STATEMENT = eINSTANCE.getEmptyStatement();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.LocalNameDeclarationStatementImpl <em>Local Name Declaration Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.LocalNameDeclarationStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLocalNameDeclarationStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.IfStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getIfStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SequentialClausesImpl <em>Sequential Clauses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SequentialClausesImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSequentialClauses()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ConcurrentClausesImpl <em>Concurrent Clauses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ConcurrentClausesImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getConcurrentClauses()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.NonFinalClauseImpl <em>Non Final Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.NonFinalClauseImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNonFinalClause()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.FinalClauseImpl <em>Final Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.FinalClauseImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getFinalClause()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SwitchStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSwitchStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SwitchClauseImpl <em>Switch Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SwitchClauseImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSwitchClause()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SwitchCaseImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSwitchCase()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SwitchDefaultClauseImpl <em>Switch Default Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SwitchDefaultClauseImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSwitchDefaultClause()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.NonEmptyStatementSequenceImpl <em>Non Empty Statement Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.NonEmptyStatementSequenceImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getNonEmptyStatementSequence()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.WhileStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getWhileStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.DoStatementImpl <em>Do Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.DoStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getDoStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ForStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getForStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ForControlImpl <em>For Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ForControlImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getForControl()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.LoopVariableDefinitionImpl <em>Loop Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.LoopVariableDefinitionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLoopVariableDefinition()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.BreakStatementImpl <em>Break Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.BreakStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getBreakStatement()
     * @generated
     */
    EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ReturnStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getReturnStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.AcceptStatementImpl <em>Accept Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.AcceptStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAcceptStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SimpleAcceptStatementCompletionImpl <em>Simple Accept Statement Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SimpleAcceptStatementCompletionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSimpleAcceptStatementCompletion()
     * @generated
     */
    EClass SIMPLE_ACCEPT_STATEMENT_COMPLETION = eINSTANCE.getSimpleAcceptStatementCompletion();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.CompoundAcceptStatementCompletionImpl <em>Compound Accept Statement Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.CompoundAcceptStatementCompletionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getCompoundAcceptStatementCompletion()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.AcceptBlockImpl <em>Accept Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.AcceptBlockImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAcceptBlock()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.AcceptClauseImpl <em>Accept Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.AcceptClauseImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAcceptClause()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ClassifyStatementImpl <em>Classify Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ClassifyStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassifyStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ClassificationClauseImpl <em>Classification Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ClassificationClauseImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassificationClause()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ClassificationFromClauseImpl <em>Classification From Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ClassificationFromClauseImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassificationFromClause()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ClassificationToClauseImpl <em>Classification To Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ClassificationToClauseImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getClassificationToClause()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ReclassifyAllClauseImpl <em>Reclassify All Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ReclassifyAllClauseImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getReclassifyAllClause()
     * @generated
     */
    EClass RECLASSIFY_ALL_CLAUSE = eINSTANCE.getReclassifyAllClause();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.QualifiedNameListImpl <em>Qualified Name List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.QualifiedNameListImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getQualifiedNameList()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.InvocationOrAssignementOrDeclarationStatementImpl <em>Invocation Or Assignement Or Declaration Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.InvocationOrAssignementOrDeclarationStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getInvocationOrAssignementOrDeclarationStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.SuperInvocationStatementImpl <em>Super Invocation Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.SuperInvocationStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSuperInvocationStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.ThisInvocationStatementImpl <em>This Invocation Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.ThisInvocationStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getThisInvocationStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.InstanceCreationInvocationStatementImpl <em>Instance Creation Invocation Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.InstanceCreationInvocationStatementImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getInstanceCreationInvocationStatement()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.VariableDeclarationCompletionImpl <em>Variable Declaration Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.VariableDeclarationCompletionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getVariableDeclarationCompletion()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.impl.AssignmentCompletionImpl <em>Assignment Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.impl.AssignmentCompletionImpl
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAssignmentCompletion()
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
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.BooleanValue <em>Boolean Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.BooleanValue
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getBooleanValue()
     * @generated
     */
    EEnum BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.LinkOperationKind <em>Link Operation Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.LinkOperationKind
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getLinkOperationKind()
     * @generated
     */
    EEnum LINK_OPERATION_KIND = eINSTANCE.getLinkOperationKind();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.SelectOrRejectOperator <em>Select Or Reject Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.SelectOrRejectOperator
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getSelectOrRejectOperator()
     * @generated
     */
    EEnum SELECT_OR_REJECT_OPERATOR = eINSTANCE.getSelectOrRejectOperator();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.CollectOrIterateOperator <em>Collect Or Iterate Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.CollectOrIterateOperator
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getCollectOrIterateOperator()
     * @generated
     */
    EEnum COLLECT_OR_ITERATE_OPERATOR = eINSTANCE.getCollectOrIterateOperator();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperator <em>For All Or Exists Or One Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperator
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getForAllOrExistsOrOneOperator()
     * @generated
     */
    EEnum FOR_ALL_OR_EXISTS_OR_ONE_OPERATOR = eINSTANCE.getForAllOrExistsOrOneOperator();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.AnnotationKind <em>Annotation Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.AnnotationKind
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAnnotationKind()
     * @generated
     */
    EEnum ANNOTATION_KIND = eINSTANCE.getAnnotationKind();

    /**
     * The meta object literal for the '{@link org.kermeta.alf.xtext.alf.AssignmentOperator <em>Assignment Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kermeta.alf.xtext.alf.AssignmentOperator
     * @see org.kermeta.alf.xtext.alf.impl.AlfPackageImpl#getAssignmentOperator()
     * @generated
     */
    EEnum ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

  }

} //AlfPackage
