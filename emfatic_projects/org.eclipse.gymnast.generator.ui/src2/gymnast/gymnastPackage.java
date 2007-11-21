/**
 * <copyright>
 * </copyright>
 *
 * $Id: gymnastPackage.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;

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
 * @see gymnast.gymnastFactory
 * @model kind="package"
 * @generated
 */
public interface gymnastPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gymnast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "gymnast";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gymnast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	gymnastPackage eINSTANCE = gymnast.impl.gymnastPackageImpl.init();

	/**
	 * The meta object id for the '{@link gymnast.GymnastEASTNode <em>Gymnast EAST Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.GymnastEASTNode
	 * @see gymnast.impl.gymnastPackageImpl#getGymnastEASTNode()
	 * @generated
	 */
	int GYMNAST_EAST_NODE = 0;

	/**
	 * The number of structural features of the '<em>Gymnast EAST Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYMNAST_EAST_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link gymnast.impl.CompUnitImpl <em>Comp Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.CompUnitImpl
	 * @see gymnast.impl.gymnastPackageImpl#getCompUnit()
	 * @generated
	 */
	int COMP_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Header Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_UNIT__HEADER_SECTION = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_UNIT__GRAMMAR = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comp Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_UNIT_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gymnast.impl.HeaderSectionImpl <em>Header Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.HeaderSectionImpl
	 * @see gymnast.impl.gymnastPackageImpl#getHeaderSection()
	 * @generated
	 */
	int HEADER_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SECTION__NAME = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SECTION__OPTIONS_SECTION = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Header Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SECTION_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gymnast.impl.OptionsSectionImpl <em>Options Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.OptionsSectionImpl
	 * @see gymnast.impl.gymnastPackageImpl#getOptionsSection()
	 * @generated
	 */
	int OPTIONS_SECTION = 3;

	/**
	 * The feature id for the '<em><b>Option List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_SECTION__OPTION_LIST = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Options Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_SECTION_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gymnast.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.OptionImpl
	 * @see gymnast.impl.gymnastPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gymnast.Rule <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.Rule
	 * @see gymnast.impl.gymnastPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 19;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gymnast.impl.AltRuleImpl <em>Alt Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.AltRuleImpl
	 * @see gymnast.impl.gymnastPackageImpl#getAltRule()
	 * @generated
	 */
	int ALT_RULE = 5;

	/**
	 * The feature id for the '<em><b>Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE__DECL = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE__BODY = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alt Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gymnast.impl.AltRuleDeclImpl <em>Alt Rule Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.AltRuleDeclImpl
	 * @see gymnast.impl.gymnastPackageImpl#getAltRuleDecl()
	 * @generated
	 */
	int ALT_RULE_DECL = 6;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE_DECL__KIND = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE_DECL__NAME = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attrs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE_DECL__ATTRS = GYMNAST_EAST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alt Rule Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE_DECL_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gymnast.impl.AltRuleBodyImpl <em>Alt Rule Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.AltRuleBodyImpl
	 * @see gymnast.impl.gymnastPackageImpl#getAltRuleBody()
	 * @generated
	 */
	int ALT_RULE_BODY = 7;

	/**
	 * The feature id for the '<em><b>Pre Seq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE_BODY__PRE_SEQ = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE_BODY__ALTS = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post Seq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE_BODY__POST_SEQ = GYMNAST_EAST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alt Rule Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_RULE_BODY_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gymnast.impl.AltSeqImpl <em>Alt Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.AltSeqImpl
	 * @see gymnast.impl.gymnastPackageImpl#getAltSeq()
	 * @generated
	 */
	int ALT_SEQ = 8;

	/**
	 * The feature id for the '<em><b>Seq</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SEQ__SEQ = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alt Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SEQ_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gymnast.impl.ListRuleImpl <em>List Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.ListRuleImpl
	 * @see gymnast.impl.gymnastPackageImpl#getListRule()
	 * @generated
	 */
	int LIST_RULE = 9;

	/**
	 * The feature id for the '<em><b>Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE__DECL = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE__BODY = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gymnast.impl.ListRuleDeclImpl <em>List Rule Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.ListRuleDeclImpl
	 * @see gymnast.impl.gymnastPackageImpl#getListRuleDecl()
	 * @generated
	 */
	int LIST_RULE_DECL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE_DECL__NAME = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attrs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE_DECL__ATTRS = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Rule Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE_DECL_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gymnast.impl.ListRuleBodyImpl <em>List Rule Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.ListRuleBodyImpl
	 * @see gymnast.impl.gymnastPackageImpl#getListRuleBody()
	 * @generated
	 */
	int LIST_RULE_BODY = 11;

	/**
	 * The feature id for the '<em><b>List Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE_BODY__LIST_EXPR = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE_BODY__SEPARATOR = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Expr2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE_BODY__LIST_EXPR2 = GYMNAST_EAST_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>List Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE_BODY__LIST_MARK = GYMNAST_EAST_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>List Rule Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RULE_BODY_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gymnast.impl.SeqRuleImpl <em>Seq Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.SeqRuleImpl
	 * @see gymnast.impl.gymnastPackageImpl#getSeqRule()
	 * @generated
	 */
	int SEQ_RULE = 12;

	/**
	 * The feature id for the '<em><b>Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_RULE__DECL = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_RULE__BODY = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Seq Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gymnast.impl.SeqRuleDeclImpl <em>Seq Rule Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.SeqRuleDeclImpl
	 * @see gymnast.impl.gymnastPackageImpl#getSeqRuleDecl()
	 * @generated
	 */
	int SEQ_RULE_DECL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_RULE_DECL__NAME = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attrs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_RULE_DECL__ATTRS = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Seq Rule Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_RULE_DECL_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gymnast.impl.TokenRuleImpl <em>Token Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.TokenRuleImpl
	 * @see gymnast.impl.gymnastPackageImpl#getTokenRule()
	 * @generated
	 */
	int TOKEN_RULE = 14;

	/**
	 * The feature id for the '<em><b>Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_RULE__DECL = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_RULE__BODY = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gymnast.impl.TokenRuleDeclImpl <em>Token Rule Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.TokenRuleDeclImpl
	 * @see gymnast.impl.gymnastPackageImpl#getTokenRuleDecl()
	 * @generated
	 */
	int TOKEN_RULE_DECL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_RULE_DECL__NAME = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attrs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_RULE_DECL__ATTRS = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Rule Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_RULE_DECL_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gymnast.Expr <em>Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.Expr
	 * @see gymnast.impl.gymnastPackageImpl#getExpr()
	 * @generated
	 */
	int EXPR = 20;

	/**
	 * The number of structural features of the '<em>Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gymnast.impl.OptSubSeqImpl <em>Opt Sub Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.OptSubSeqImpl
	 * @see gymnast.impl.gymnastPackageImpl#getOptSubSeq()
	 * @generated
	 */
	int OPT_SUB_SEQ = 16;

	/**
	 * The feature id for the '<em><b>Seq</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_SUB_SEQ__SEQ = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opt Sub Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_SUB_SEQ_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gymnast.impl.SimpleExprImpl <em>Simple Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.SimpleExprImpl
	 * @see gymnast.impl.gymnastPackageImpl#getSimpleExpr()
	 * @generated
	 */
	int SIMPLE_EXPR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPR__NAME = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPR__VALUE = EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attrs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPR__ATTRS = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gymnast.impl.AttrsImpl <em>Attrs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.impl.AttrsImpl
	 * @see gymnast.impl.gymnastPackageImpl#getAttrs()
	 * @generated
	 */
	int ATTRS = 18;

	/**
	 * The feature id for the '<em><b>Attr List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRS__ATTR_LIST = GYMNAST_EAST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attrs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRS_FEATURE_COUNT = GYMNAST_EAST_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gymnast.AltRuleKind <em>Alt Rule Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gymnast.AltRuleKind
	 * @see gymnast.impl.gymnastPackageImpl#getAltRuleKind()
	 * @generated
	 */
	int ALT_RULE_KIND = 21;


	/**
	 * Returns the meta object for class '{@link gymnast.GymnastEASTNode <em>Gymnast EAST Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gymnast EAST Node</em>'.
	 * @see gymnast.GymnastEASTNode
	 * @generated
	 */
	EClass getGymnastEASTNode();

	/**
	 * Returns the meta object for class '{@link gymnast.CompUnit <em>Comp Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Unit</em>'.
	 * @see gymnast.CompUnit
	 * @generated
	 */
	EClass getCompUnit();

	/**
	 * Returns the meta object for the reference '{@link gymnast.CompUnit#getHeaderSection <em>Header Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Header Section</em>'.
	 * @see gymnast.CompUnit#getHeaderSection()
	 * @see #getCompUnit()
	 * @generated
	 */
	EReference getCompUnit_HeaderSection();

	/**
	 * Returns the meta object for the reference list '{@link gymnast.CompUnit#getGrammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grammar</em>'.
	 * @see gymnast.CompUnit#getGrammar()
	 * @see #getCompUnit()
	 * @generated
	 */
	EReference getCompUnit_Grammar();

	/**
	 * Returns the meta object for class '{@link gymnast.HeaderSection <em>Header Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Section</em>'.
	 * @see gymnast.HeaderSection
	 * @generated
	 */
	EClass getHeaderSection();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.HeaderSection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gymnast.HeaderSection#getName()
	 * @see #getHeaderSection()
	 * @generated
	 */
	EAttribute getHeaderSection_Name();

	/**
	 * Returns the meta object for the reference '{@link gymnast.HeaderSection#getOptionsSection <em>Options Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Options Section</em>'.
	 * @see gymnast.HeaderSection#getOptionsSection()
	 * @see #getHeaderSection()
	 * @generated
	 */
	EReference getHeaderSection_OptionsSection();

	/**
	 * Returns the meta object for class '{@link gymnast.OptionsSection <em>Options Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Section</em>'.
	 * @see gymnast.OptionsSection
	 * @generated
	 */
	EClass getOptionsSection();

	/**
	 * Returns the meta object for the reference list '{@link gymnast.OptionsSection#getOptionList <em>Option List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Option List</em>'.
	 * @see gymnast.OptionsSection#getOptionList()
	 * @see #getOptionsSection()
	 * @generated
	 */
	EReference getOptionsSection_OptionList();

	/**
	 * Returns the meta object for class '{@link gymnast.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see gymnast.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gymnast.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gymnast.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for class '{@link gymnast.AltRule <em>Alt Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Rule</em>'.
	 * @see gymnast.AltRule
	 * @generated
	 */
	EClass getAltRule();

	/**
	 * Returns the meta object for the reference '{@link gymnast.AltRule#getDecl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decl</em>'.
	 * @see gymnast.AltRule#getDecl()
	 * @see #getAltRule()
	 * @generated
	 */
	EReference getAltRule_Decl();

	/**
	 * Returns the meta object for the reference '{@link gymnast.AltRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see gymnast.AltRule#getBody()
	 * @see #getAltRule()
	 * @generated
	 */
	EReference getAltRule_Body();

	/**
	 * Returns the meta object for class '{@link gymnast.AltRuleDecl <em>Alt Rule Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Rule Decl</em>'.
	 * @see gymnast.AltRuleDecl
	 * @generated
	 */
	EClass getAltRuleDecl();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.AltRuleDecl#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gymnast.AltRuleDecl#getKind()
	 * @see #getAltRuleDecl()
	 * @generated
	 */
	EAttribute getAltRuleDecl_Kind();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.AltRuleDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gymnast.AltRuleDecl#getName()
	 * @see #getAltRuleDecl()
	 * @generated
	 */
	EAttribute getAltRuleDecl_Name();

	/**
	 * Returns the meta object for the reference '{@link gymnast.AltRuleDecl#getAttrs <em>Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attrs</em>'.
	 * @see gymnast.AltRuleDecl#getAttrs()
	 * @see #getAltRuleDecl()
	 * @generated
	 */
	EReference getAltRuleDecl_Attrs();

	/**
	 * Returns the meta object for class '{@link gymnast.AltRuleBody <em>Alt Rule Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Rule Body</em>'.
	 * @see gymnast.AltRuleBody
	 * @generated
	 */
	EClass getAltRuleBody();

	/**
	 * Returns the meta object for the reference '{@link gymnast.AltRuleBody#getPreSeq <em>Pre Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Seq</em>'.
	 * @see gymnast.AltRuleBody#getPreSeq()
	 * @see #getAltRuleBody()
	 * @generated
	 */
	EReference getAltRuleBody_PreSeq();

	/**
	 * Returns the meta object for the reference list '{@link gymnast.AltRuleBody#getAlts <em>Alts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alts</em>'.
	 * @see gymnast.AltRuleBody#getAlts()
	 * @see #getAltRuleBody()
	 * @generated
	 */
	EReference getAltRuleBody_Alts();

	/**
	 * Returns the meta object for the reference '{@link gymnast.AltRuleBody#getPostSeq <em>Post Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post Seq</em>'.
	 * @see gymnast.AltRuleBody#getPostSeq()
	 * @see #getAltRuleBody()
	 * @generated
	 */
	EReference getAltRuleBody_PostSeq();

	/**
	 * Returns the meta object for class '{@link gymnast.AltSeq <em>Alt Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Seq</em>'.
	 * @see gymnast.AltSeq
	 * @generated
	 */
	EClass getAltSeq();

	/**
	 * Returns the meta object for the reference list '{@link gymnast.AltSeq#getSeq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Seq</em>'.
	 * @see gymnast.AltSeq#getSeq()
	 * @see #getAltSeq()
	 * @generated
	 */
	EReference getAltSeq_Seq();

	/**
	 * Returns the meta object for class '{@link gymnast.ListRule <em>List Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Rule</em>'.
	 * @see gymnast.ListRule
	 * @generated
	 */
	EClass getListRule();

	/**
	 * Returns the meta object for the reference '{@link gymnast.ListRule#getDecl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decl</em>'.
	 * @see gymnast.ListRule#getDecl()
	 * @see #getListRule()
	 * @generated
	 */
	EReference getListRule_Decl();

	/**
	 * Returns the meta object for the reference '{@link gymnast.ListRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see gymnast.ListRule#getBody()
	 * @see #getListRule()
	 * @generated
	 */
	EReference getListRule_Body();

	/**
	 * Returns the meta object for class '{@link gymnast.ListRuleDecl <em>List Rule Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Rule Decl</em>'.
	 * @see gymnast.ListRuleDecl
	 * @generated
	 */
	EClass getListRuleDecl();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.ListRuleDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gymnast.ListRuleDecl#getName()
	 * @see #getListRuleDecl()
	 * @generated
	 */
	EAttribute getListRuleDecl_Name();

	/**
	 * Returns the meta object for the reference '{@link gymnast.ListRuleDecl#getAttrs <em>Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attrs</em>'.
	 * @see gymnast.ListRuleDecl#getAttrs()
	 * @see #getListRuleDecl()
	 * @generated
	 */
	EReference getListRuleDecl_Attrs();

	/**
	 * Returns the meta object for class '{@link gymnast.ListRuleBody <em>List Rule Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Rule Body</em>'.
	 * @see gymnast.ListRuleBody
	 * @generated
	 */
	EClass getListRuleBody();

	/**
	 * Returns the meta object for the reference '{@link gymnast.ListRuleBody#getListExpr <em>List Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>List Expr</em>'.
	 * @see gymnast.ListRuleBody#getListExpr()
	 * @see #getListRuleBody()
	 * @generated
	 */
	EReference getListRuleBody_ListExpr();

	/**
	 * Returns the meta object for the reference '{@link gymnast.ListRuleBody#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Separator</em>'.
	 * @see gymnast.ListRuleBody#getSeparator()
	 * @see #getListRuleBody()
	 * @generated
	 */
	EReference getListRuleBody_Separator();

	/**
	 * Returns the meta object for the reference '{@link gymnast.ListRuleBody#getListExpr2 <em>List Expr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>List Expr2</em>'.
	 * @see gymnast.ListRuleBody#getListExpr2()
	 * @see #getListRuleBody()
	 * @generated
	 */
	EReference getListRuleBody_ListExpr2();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.ListRuleBody#getListMark <em>List Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Mark</em>'.
	 * @see gymnast.ListRuleBody#getListMark()
	 * @see #getListRuleBody()
	 * @generated
	 */
	EAttribute getListRuleBody_ListMark();

	/**
	 * Returns the meta object for class '{@link gymnast.SeqRule <em>Seq Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Rule</em>'.
	 * @see gymnast.SeqRule
	 * @generated
	 */
	EClass getSeqRule();

	/**
	 * Returns the meta object for the reference '{@link gymnast.SeqRule#getDecl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decl</em>'.
	 * @see gymnast.SeqRule#getDecl()
	 * @see #getSeqRule()
	 * @generated
	 */
	EReference getSeqRule_Decl();

	/**
	 * Returns the meta object for the reference list '{@link gymnast.SeqRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see gymnast.SeqRule#getBody()
	 * @see #getSeqRule()
	 * @generated
	 */
	EReference getSeqRule_Body();

	/**
	 * Returns the meta object for class '{@link gymnast.SeqRuleDecl <em>Seq Rule Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Rule Decl</em>'.
	 * @see gymnast.SeqRuleDecl
	 * @generated
	 */
	EClass getSeqRuleDecl();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.SeqRuleDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gymnast.SeqRuleDecl#getName()
	 * @see #getSeqRuleDecl()
	 * @generated
	 */
	EAttribute getSeqRuleDecl_Name();

	/**
	 * Returns the meta object for the reference '{@link gymnast.SeqRuleDecl#getAttrs <em>Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attrs</em>'.
	 * @see gymnast.SeqRuleDecl#getAttrs()
	 * @see #getSeqRuleDecl()
	 * @generated
	 */
	EReference getSeqRuleDecl_Attrs();

	/**
	 * Returns the meta object for class '{@link gymnast.TokenRule <em>Token Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Rule</em>'.
	 * @see gymnast.TokenRule
	 * @generated
	 */
	EClass getTokenRule();

	/**
	 * Returns the meta object for the reference '{@link gymnast.TokenRule#getDecl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decl</em>'.
	 * @see gymnast.TokenRule#getDecl()
	 * @see #getTokenRule()
	 * @generated
	 */
	EReference getTokenRule_Decl();

	/**
	 * Returns the meta object for the reference list '{@link gymnast.TokenRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see gymnast.TokenRule#getBody()
	 * @see #getTokenRule()
	 * @generated
	 */
	EReference getTokenRule_Body();

	/**
	 * Returns the meta object for class '{@link gymnast.TokenRuleDecl <em>Token Rule Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Rule Decl</em>'.
	 * @see gymnast.TokenRuleDecl
	 * @generated
	 */
	EClass getTokenRuleDecl();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.TokenRuleDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gymnast.TokenRuleDecl#getName()
	 * @see #getTokenRuleDecl()
	 * @generated
	 */
	EAttribute getTokenRuleDecl_Name();

	/**
	 * Returns the meta object for the reference '{@link gymnast.TokenRuleDecl#getAttrs <em>Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attrs</em>'.
	 * @see gymnast.TokenRuleDecl#getAttrs()
	 * @see #getTokenRuleDecl()
	 * @generated
	 */
	EReference getTokenRuleDecl_Attrs();

	/**
	 * Returns the meta object for class '{@link gymnast.OptSubSeq <em>Opt Sub Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opt Sub Seq</em>'.
	 * @see gymnast.OptSubSeq
	 * @generated
	 */
	EClass getOptSubSeq();

	/**
	 * Returns the meta object for the reference list '{@link gymnast.OptSubSeq#getSeq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Seq</em>'.
	 * @see gymnast.OptSubSeq#getSeq()
	 * @see #getOptSubSeq()
	 * @generated
	 */
	EReference getOptSubSeq_Seq();

	/**
	 * Returns the meta object for class '{@link gymnast.SimpleExpr <em>Simple Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Expr</em>'.
	 * @see gymnast.SimpleExpr
	 * @generated
	 */
	EClass getSimpleExpr();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.SimpleExpr#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gymnast.SimpleExpr#getName()
	 * @see #getSimpleExpr()
	 * @generated
	 */
	EAttribute getSimpleExpr_Name();

	/**
	 * Returns the meta object for the attribute '{@link gymnast.SimpleExpr#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gymnast.SimpleExpr#getValue()
	 * @see #getSimpleExpr()
	 * @generated
	 */
	EAttribute getSimpleExpr_Value();

	/**
	 * Returns the meta object for the reference '{@link gymnast.SimpleExpr#getAttrs <em>Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attrs</em>'.
	 * @see gymnast.SimpleExpr#getAttrs()
	 * @see #getSimpleExpr()
	 * @generated
	 */
	EReference getSimpleExpr_Attrs();

	/**
	 * Returns the meta object for class '{@link gymnast.Attrs <em>Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attrs</em>'.
	 * @see gymnast.Attrs
	 * @generated
	 */
	EClass getAttrs();

	/**
	 * Returns the meta object for the attribute list '{@link gymnast.Attrs#getAttrList <em>Attr List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attr List</em>'.
	 * @see gymnast.Attrs#getAttrList()
	 * @see #getAttrs()
	 * @generated
	 */
	EAttribute getAttrs_AttrList();

	/**
	 * Returns the meta object for class '{@link gymnast.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see gymnast.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for class '{@link gymnast.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr</em>'.
	 * @see gymnast.Expr
	 * @generated
	 */
	EClass getExpr();

	/**
	 * Returns the meta object for enum '{@link gymnast.AltRuleKind <em>Alt Rule Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alt Rule Kind</em>'.
	 * @see gymnast.AltRuleKind
	 * @generated
	 */
	EEnum getAltRuleKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	gymnastFactory getgymnastFactory();

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
		 * The meta object literal for the '{@link gymnast.GymnastEASTNode <em>Gymnast EAST Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.GymnastEASTNode
		 * @see gymnast.impl.gymnastPackageImpl#getGymnastEASTNode()
		 * @generated
		 */
		EClass GYMNAST_EAST_NODE = eINSTANCE.getGymnastEASTNode();

		/**
		 * The meta object literal for the '{@link gymnast.impl.CompUnitImpl <em>Comp Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.CompUnitImpl
		 * @see gymnast.impl.gymnastPackageImpl#getCompUnit()
		 * @generated
		 */
		EClass COMP_UNIT = eINSTANCE.getCompUnit();

		/**
		 * The meta object literal for the '<em><b>Header Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_UNIT__HEADER_SECTION = eINSTANCE.getCompUnit_HeaderSection();

		/**
		 * The meta object literal for the '<em><b>Grammar</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_UNIT__GRAMMAR = eINSTANCE.getCompUnit_Grammar();

		/**
		 * The meta object literal for the '{@link gymnast.impl.HeaderSectionImpl <em>Header Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.HeaderSectionImpl
		 * @see gymnast.impl.gymnastPackageImpl#getHeaderSection()
		 * @generated
		 */
		EClass HEADER_SECTION = eINSTANCE.getHeaderSection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_SECTION__NAME = eINSTANCE.getHeaderSection_Name();

		/**
		 * The meta object literal for the '<em><b>Options Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_SECTION__OPTIONS_SECTION = eINSTANCE.getHeaderSection_OptionsSection();

		/**
		 * The meta object literal for the '{@link gymnast.impl.OptionsSectionImpl <em>Options Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.OptionsSectionImpl
		 * @see gymnast.impl.gymnastPackageImpl#getOptionsSection()
		 * @generated
		 */
		EClass OPTIONS_SECTION = eINSTANCE.getOptionsSection();

		/**
		 * The meta object literal for the '<em><b>Option List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS_SECTION__OPTION_LIST = eINSTANCE.getOptionsSection_OptionList();

		/**
		 * The meta object literal for the '{@link gymnast.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.OptionImpl
		 * @see gymnast.impl.gymnastPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link gymnast.impl.AltRuleImpl <em>Alt Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.AltRuleImpl
		 * @see gymnast.impl.gymnastPackageImpl#getAltRule()
		 * @generated
		 */
		EClass ALT_RULE = eINSTANCE.getAltRule();

		/**
		 * The meta object literal for the '<em><b>Decl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_RULE__DECL = eINSTANCE.getAltRule_Decl();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_RULE__BODY = eINSTANCE.getAltRule_Body();

		/**
		 * The meta object literal for the '{@link gymnast.impl.AltRuleDeclImpl <em>Alt Rule Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.AltRuleDeclImpl
		 * @see gymnast.impl.gymnastPackageImpl#getAltRuleDecl()
		 * @generated
		 */
		EClass ALT_RULE_DECL = eINSTANCE.getAltRuleDecl();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALT_RULE_DECL__KIND = eINSTANCE.getAltRuleDecl_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALT_RULE_DECL__NAME = eINSTANCE.getAltRuleDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Attrs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_RULE_DECL__ATTRS = eINSTANCE.getAltRuleDecl_Attrs();

		/**
		 * The meta object literal for the '{@link gymnast.impl.AltRuleBodyImpl <em>Alt Rule Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.AltRuleBodyImpl
		 * @see gymnast.impl.gymnastPackageImpl#getAltRuleBody()
		 * @generated
		 */
		EClass ALT_RULE_BODY = eINSTANCE.getAltRuleBody();

		/**
		 * The meta object literal for the '<em><b>Pre Seq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_RULE_BODY__PRE_SEQ = eINSTANCE.getAltRuleBody_PreSeq();

		/**
		 * The meta object literal for the '<em><b>Alts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_RULE_BODY__ALTS = eINSTANCE.getAltRuleBody_Alts();

		/**
		 * The meta object literal for the '<em><b>Post Seq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_RULE_BODY__POST_SEQ = eINSTANCE.getAltRuleBody_PostSeq();

		/**
		 * The meta object literal for the '{@link gymnast.impl.AltSeqImpl <em>Alt Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.AltSeqImpl
		 * @see gymnast.impl.gymnastPackageImpl#getAltSeq()
		 * @generated
		 */
		EClass ALT_SEQ = eINSTANCE.getAltSeq();

		/**
		 * The meta object literal for the '<em><b>Seq</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_SEQ__SEQ = eINSTANCE.getAltSeq_Seq();

		/**
		 * The meta object literal for the '{@link gymnast.impl.ListRuleImpl <em>List Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.ListRuleImpl
		 * @see gymnast.impl.gymnastPackageImpl#getListRule()
		 * @generated
		 */
		EClass LIST_RULE = eINSTANCE.getListRule();

		/**
		 * The meta object literal for the '<em><b>Decl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_RULE__DECL = eINSTANCE.getListRule_Decl();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_RULE__BODY = eINSTANCE.getListRule_Body();

		/**
		 * The meta object literal for the '{@link gymnast.impl.ListRuleDeclImpl <em>List Rule Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.ListRuleDeclImpl
		 * @see gymnast.impl.gymnastPackageImpl#getListRuleDecl()
		 * @generated
		 */
		EClass LIST_RULE_DECL = eINSTANCE.getListRuleDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_RULE_DECL__NAME = eINSTANCE.getListRuleDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Attrs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_RULE_DECL__ATTRS = eINSTANCE.getListRuleDecl_Attrs();

		/**
		 * The meta object literal for the '{@link gymnast.impl.ListRuleBodyImpl <em>List Rule Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.ListRuleBodyImpl
		 * @see gymnast.impl.gymnastPackageImpl#getListRuleBody()
		 * @generated
		 */
		EClass LIST_RULE_BODY = eINSTANCE.getListRuleBody();

		/**
		 * The meta object literal for the '<em><b>List Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_RULE_BODY__LIST_EXPR = eINSTANCE.getListRuleBody_ListExpr();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_RULE_BODY__SEPARATOR = eINSTANCE.getListRuleBody_Separator();

		/**
		 * The meta object literal for the '<em><b>List Expr2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_RULE_BODY__LIST_EXPR2 = eINSTANCE.getListRuleBody_ListExpr2();

		/**
		 * The meta object literal for the '<em><b>List Mark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_RULE_BODY__LIST_MARK = eINSTANCE.getListRuleBody_ListMark();

		/**
		 * The meta object literal for the '{@link gymnast.impl.SeqRuleImpl <em>Seq Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.SeqRuleImpl
		 * @see gymnast.impl.gymnastPackageImpl#getSeqRule()
		 * @generated
		 */
		EClass SEQ_RULE = eINSTANCE.getSeqRule();

		/**
		 * The meta object literal for the '<em><b>Decl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ_RULE__DECL = eINSTANCE.getSeqRule_Decl();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ_RULE__BODY = eINSTANCE.getSeqRule_Body();

		/**
		 * The meta object literal for the '{@link gymnast.impl.SeqRuleDeclImpl <em>Seq Rule Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.SeqRuleDeclImpl
		 * @see gymnast.impl.gymnastPackageImpl#getSeqRuleDecl()
		 * @generated
		 */
		EClass SEQ_RULE_DECL = eINSTANCE.getSeqRuleDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_RULE_DECL__NAME = eINSTANCE.getSeqRuleDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Attrs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ_RULE_DECL__ATTRS = eINSTANCE.getSeqRuleDecl_Attrs();

		/**
		 * The meta object literal for the '{@link gymnast.impl.TokenRuleImpl <em>Token Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.TokenRuleImpl
		 * @see gymnast.impl.gymnastPackageImpl#getTokenRule()
		 * @generated
		 */
		EClass TOKEN_RULE = eINSTANCE.getTokenRule();

		/**
		 * The meta object literal for the '<em><b>Decl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_RULE__DECL = eINSTANCE.getTokenRule_Decl();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_RULE__BODY = eINSTANCE.getTokenRule_Body();

		/**
		 * The meta object literal for the '{@link gymnast.impl.TokenRuleDeclImpl <em>Token Rule Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.TokenRuleDeclImpl
		 * @see gymnast.impl.gymnastPackageImpl#getTokenRuleDecl()
		 * @generated
		 */
		EClass TOKEN_RULE_DECL = eINSTANCE.getTokenRuleDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_RULE_DECL__NAME = eINSTANCE.getTokenRuleDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Attrs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_RULE_DECL__ATTRS = eINSTANCE.getTokenRuleDecl_Attrs();

		/**
		 * The meta object literal for the '{@link gymnast.impl.OptSubSeqImpl <em>Opt Sub Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.OptSubSeqImpl
		 * @see gymnast.impl.gymnastPackageImpl#getOptSubSeq()
		 * @generated
		 */
		EClass OPT_SUB_SEQ = eINSTANCE.getOptSubSeq();

		/**
		 * The meta object literal for the '<em><b>Seq</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPT_SUB_SEQ__SEQ = eINSTANCE.getOptSubSeq_Seq();

		/**
		 * The meta object literal for the '{@link gymnast.impl.SimpleExprImpl <em>Simple Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.SimpleExprImpl
		 * @see gymnast.impl.gymnastPackageImpl#getSimpleExpr()
		 * @generated
		 */
		EClass SIMPLE_EXPR = eINSTANCE.getSimpleExpr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_EXPR__NAME = eINSTANCE.getSimpleExpr_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_EXPR__VALUE = eINSTANCE.getSimpleExpr_Value();

		/**
		 * The meta object literal for the '<em><b>Attrs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_EXPR__ATTRS = eINSTANCE.getSimpleExpr_Attrs();

		/**
		 * The meta object literal for the '{@link gymnast.impl.AttrsImpl <em>Attrs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.impl.AttrsImpl
		 * @see gymnast.impl.gymnastPackageImpl#getAttrs()
		 * @generated
		 */
		EClass ATTRS = eINSTANCE.getAttrs();

		/**
		 * The meta object literal for the '<em><b>Attr List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRS__ATTR_LIST = eINSTANCE.getAttrs_AttrList();

		/**
		 * The meta object literal for the '{@link gymnast.Rule <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.Rule
		 * @see gymnast.impl.gymnastPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '{@link gymnast.Expr <em>Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.Expr
		 * @see gymnast.impl.gymnastPackageImpl#getExpr()
		 * @generated
		 */
		EClass EXPR = eINSTANCE.getExpr();

		/**
		 * The meta object literal for the '{@link gymnast.AltRuleKind <em>Alt Rule Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gymnast.AltRuleKind
		 * @see gymnast.impl.gymnastPackageImpl#getAltRuleKind()
		 * @generated
		 */
		EEnum ALT_RULE_KIND = eINSTANCE.getAltRuleKind();

	}

} //gymnastPackage
