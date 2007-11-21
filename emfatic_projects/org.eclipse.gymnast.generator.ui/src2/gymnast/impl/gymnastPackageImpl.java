/**
 * <copyright>
 * </copyright>
 *
 * $Id: gymnastPackageImpl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast.impl;

import gymnast.AltRule;
import gymnast.AltRuleBody;
import gymnast.AltRuleDecl;
import gymnast.AltRuleKind;
import gymnast.AltSeq;
import gymnast.Attrs;
import gymnast.CompUnit;
import gymnast.Expr;
import gymnast.GymnastEASTNode;
import gymnast.HeaderSection;
import gymnast.ListRule;
import gymnast.ListRuleBody;
import gymnast.ListRuleDecl;
import gymnast.OptSubSeq;
import gymnast.Option;
import gymnast.OptionsSection;
import gymnast.Rule;
import gymnast.SeqRule;
import gymnast.SeqRuleDecl;
import gymnast.SimpleExpr;
import gymnast.TokenRule;
import gymnast.TokenRuleDecl;
import gymnast.gymnastFactory;
import gymnast.gymnastPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class gymnastPackageImpl extends EPackageImpl implements gymnastPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gymnastEASTNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altRuleDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altRuleBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listRuleDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listRuleBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqRuleDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenRuleDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optSubSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attrsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum altRuleKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gymnast.gymnastPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private gymnastPackageImpl() {
		super(eNS_URI, gymnastFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static gymnastPackage init() {
		if (isInited) return (gymnastPackage)EPackage.Registry.INSTANCE.getEPackage(gymnastPackage.eNS_URI);

		// Obtain or create and register package
		gymnastPackageImpl thegymnastPackage = (gymnastPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof gymnastPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new gymnastPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thegymnastPackage.createPackageContents();

		// Initialize created meta-data
		thegymnastPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thegymnastPackage.freeze();

		return thegymnastPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGymnastEASTNode() {
		return gymnastEASTNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompUnit() {
		return compUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompUnit_HeaderSection() {
		return (EReference)compUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompUnit_Grammar() {
		return (EReference)compUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderSection() {
		return headerSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderSection_Name() {
		return (EAttribute)headerSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderSection_OptionsSection() {
		return (EReference)headerSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionsSection() {
		return optionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionsSection_OptionList() {
		return (EReference)optionsSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Name() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltRule() {
		return altRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAltRule_Decl() {
		return (EReference)altRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAltRule_Body() {
		return (EReference)altRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltRuleDecl() {
		return altRuleDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAltRuleDecl_Kind() {
		return (EAttribute)altRuleDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAltRuleDecl_Name() {
		return (EAttribute)altRuleDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAltRuleDecl_Attrs() {
		return (EReference)altRuleDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltRuleBody() {
		return altRuleBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAltRuleBody_PreSeq() {
		return (EReference)altRuleBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAltRuleBody_Alts() {
		return (EReference)altRuleBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAltRuleBody_PostSeq() {
		return (EReference)altRuleBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltSeq() {
		return altSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAltSeq_Seq() {
		return (EReference)altSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListRule() {
		return listRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListRule_Decl() {
		return (EReference)listRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListRule_Body() {
		return (EReference)listRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListRuleDecl() {
		return listRuleDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListRuleDecl_Name() {
		return (EAttribute)listRuleDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListRuleDecl_Attrs() {
		return (EReference)listRuleDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListRuleBody() {
		return listRuleBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListRuleBody_ListExpr() {
		return (EReference)listRuleBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListRuleBody_Separator() {
		return (EReference)listRuleBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListRuleBody_ListExpr2() {
		return (EReference)listRuleBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListRuleBody_ListMark() {
		return (EAttribute)listRuleBodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeqRule() {
		return seqRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeqRule_Decl() {
		return (EReference)seqRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeqRule_Body() {
		return (EReference)seqRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeqRuleDecl() {
		return seqRuleDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqRuleDecl_Name() {
		return (EAttribute)seqRuleDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeqRuleDecl_Attrs() {
		return (EReference)seqRuleDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenRule() {
		return tokenRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenRule_Decl() {
		return (EReference)tokenRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenRule_Body() {
		return (EReference)tokenRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenRuleDecl() {
		return tokenRuleDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenRuleDecl_Name() {
		return (EAttribute)tokenRuleDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenRuleDecl_Attrs() {
		return (EReference)tokenRuleDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptSubSeq() {
		return optSubSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptSubSeq_Seq() {
		return (EReference)optSubSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleExpr() {
		return simpleExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleExpr_Name() {
		return (EAttribute)simpleExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleExpr_Value() {
		return (EAttribute)simpleExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleExpr_Attrs() {
		return (EReference)simpleExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttrs() {
		return attrsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttrs_AttrList() {
		return (EAttribute)attrsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpr() {
		return exprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAltRuleKind() {
		return altRuleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gymnastFactory getgymnastFactory() {
		return (gymnastFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gymnastEASTNodeEClass = createEClass(GYMNAST_EAST_NODE);

		compUnitEClass = createEClass(COMP_UNIT);
		createEReference(compUnitEClass, COMP_UNIT__HEADER_SECTION);
		createEReference(compUnitEClass, COMP_UNIT__GRAMMAR);

		headerSectionEClass = createEClass(HEADER_SECTION);
		createEAttribute(headerSectionEClass, HEADER_SECTION__NAME);
		createEReference(headerSectionEClass, HEADER_SECTION__OPTIONS_SECTION);

		optionsSectionEClass = createEClass(OPTIONS_SECTION);
		createEReference(optionsSectionEClass, OPTIONS_SECTION__OPTION_LIST);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__NAME);
		createEAttribute(optionEClass, OPTION__VALUE);

		altRuleEClass = createEClass(ALT_RULE);
		createEReference(altRuleEClass, ALT_RULE__DECL);
		createEReference(altRuleEClass, ALT_RULE__BODY);

		altRuleDeclEClass = createEClass(ALT_RULE_DECL);
		createEAttribute(altRuleDeclEClass, ALT_RULE_DECL__KIND);
		createEAttribute(altRuleDeclEClass, ALT_RULE_DECL__NAME);
		createEReference(altRuleDeclEClass, ALT_RULE_DECL__ATTRS);

		altRuleBodyEClass = createEClass(ALT_RULE_BODY);
		createEReference(altRuleBodyEClass, ALT_RULE_BODY__PRE_SEQ);
		createEReference(altRuleBodyEClass, ALT_RULE_BODY__ALTS);
		createEReference(altRuleBodyEClass, ALT_RULE_BODY__POST_SEQ);

		altSeqEClass = createEClass(ALT_SEQ);
		createEReference(altSeqEClass, ALT_SEQ__SEQ);

		listRuleEClass = createEClass(LIST_RULE);
		createEReference(listRuleEClass, LIST_RULE__DECL);
		createEReference(listRuleEClass, LIST_RULE__BODY);

		listRuleDeclEClass = createEClass(LIST_RULE_DECL);
		createEAttribute(listRuleDeclEClass, LIST_RULE_DECL__NAME);
		createEReference(listRuleDeclEClass, LIST_RULE_DECL__ATTRS);

		listRuleBodyEClass = createEClass(LIST_RULE_BODY);
		createEReference(listRuleBodyEClass, LIST_RULE_BODY__LIST_EXPR);
		createEReference(listRuleBodyEClass, LIST_RULE_BODY__SEPARATOR);
		createEReference(listRuleBodyEClass, LIST_RULE_BODY__LIST_EXPR2);
		createEAttribute(listRuleBodyEClass, LIST_RULE_BODY__LIST_MARK);

		seqRuleEClass = createEClass(SEQ_RULE);
		createEReference(seqRuleEClass, SEQ_RULE__DECL);
		createEReference(seqRuleEClass, SEQ_RULE__BODY);

		seqRuleDeclEClass = createEClass(SEQ_RULE_DECL);
		createEAttribute(seqRuleDeclEClass, SEQ_RULE_DECL__NAME);
		createEReference(seqRuleDeclEClass, SEQ_RULE_DECL__ATTRS);

		tokenRuleEClass = createEClass(TOKEN_RULE);
		createEReference(tokenRuleEClass, TOKEN_RULE__DECL);
		createEReference(tokenRuleEClass, TOKEN_RULE__BODY);

		tokenRuleDeclEClass = createEClass(TOKEN_RULE_DECL);
		createEAttribute(tokenRuleDeclEClass, TOKEN_RULE_DECL__NAME);
		createEReference(tokenRuleDeclEClass, TOKEN_RULE_DECL__ATTRS);

		optSubSeqEClass = createEClass(OPT_SUB_SEQ);
		createEReference(optSubSeqEClass, OPT_SUB_SEQ__SEQ);

		simpleExprEClass = createEClass(SIMPLE_EXPR);
		createEAttribute(simpleExprEClass, SIMPLE_EXPR__NAME);
		createEAttribute(simpleExprEClass, SIMPLE_EXPR__VALUE);
		createEReference(simpleExprEClass, SIMPLE_EXPR__ATTRS);

		attrsEClass = createEClass(ATTRS);
		createEAttribute(attrsEClass, ATTRS__ATTR_LIST);

		ruleEClass = createEClass(RULE);

		exprEClass = createEClass(EXPR);

		// Create enums
		altRuleKindEEnum = createEEnum(ALT_RULE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compUnitEClass.getESuperTypes().add(this.getGymnastEASTNode());
		headerSectionEClass.getESuperTypes().add(this.getGymnastEASTNode());
		optionsSectionEClass.getESuperTypes().add(this.getGymnastEASTNode());
		optionEClass.getESuperTypes().add(this.getGymnastEASTNode());
		altRuleEClass.getESuperTypes().add(this.getRule());
		altRuleDeclEClass.getESuperTypes().add(this.getGymnastEASTNode());
		altRuleBodyEClass.getESuperTypes().add(this.getGymnastEASTNode());
		altSeqEClass.getESuperTypes().add(this.getGymnastEASTNode());
		listRuleEClass.getESuperTypes().add(this.getRule());
		listRuleDeclEClass.getESuperTypes().add(this.getGymnastEASTNode());
		listRuleBodyEClass.getESuperTypes().add(this.getGymnastEASTNode());
		seqRuleEClass.getESuperTypes().add(this.getRule());
		seqRuleDeclEClass.getESuperTypes().add(this.getGymnastEASTNode());
		tokenRuleEClass.getESuperTypes().add(this.getRule());
		tokenRuleDeclEClass.getESuperTypes().add(this.getGymnastEASTNode());
		optSubSeqEClass.getESuperTypes().add(this.getExpr());
		simpleExprEClass.getESuperTypes().add(this.getExpr());
		attrsEClass.getESuperTypes().add(this.getGymnastEASTNode());
		ruleEClass.getESuperTypes().add(this.getGymnastEASTNode());
		exprEClass.getESuperTypes().add(this.getGymnastEASTNode());

		// Initialize classes and features; add operations and parameters
		initEClass(gymnastEASTNodeEClass, GymnastEASTNode.class, "GymnastEASTNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compUnitEClass, CompUnit.class, "CompUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompUnit_HeaderSection(), this.getHeaderSection(), null, "headerSection", null, 1, 1, CompUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompUnit_Grammar(), this.getRule(), null, "grammar", null, 0, -1, CompUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerSectionEClass, HeaderSection.class, "HeaderSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, HeaderSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderSection_OptionsSection(), this.getOptionsSection(), null, "optionsSection", null, 0, 1, HeaderSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsSectionEClass, OptionsSection.class, "OptionsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionsSection_OptionList(), this.getOption(), null, "optionList", null, 0, -1, OptionsSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(altRuleEClass, AltRule.class, "AltRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAltRule_Decl(), this.getAltRuleDecl(), null, "decl", null, 1, 1, AltRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAltRule_Body(), this.getAltRuleBody(), null, "body", null, 1, 1, AltRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(altRuleDeclEClass, AltRuleDecl.class, "AltRuleDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAltRuleDecl_Kind(), this.getAltRuleKind(), "kind", null, 0, 1, AltRuleDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAltRuleDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, AltRuleDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAltRuleDecl_Attrs(), this.getAttrs(), null, "attrs", null, 0, 1, AltRuleDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(altRuleBodyEClass, AltRuleBody.class, "AltRuleBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAltRuleBody_PreSeq(), this.getAltSeq(), null, "preSeq", null, 0, 1, AltRuleBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAltRuleBody_Alts(), this.getSimpleExpr(), null, "alts", null, 0, -1, AltRuleBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAltRuleBody_PostSeq(), this.getAltSeq(), null, "postSeq", null, 0, 1, AltRuleBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(altSeqEClass, AltSeq.class, "AltSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAltSeq_Seq(), this.getExpr(), null, "seq", null, 1, -1, AltSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listRuleEClass, ListRule.class, "ListRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListRule_Decl(), this.getListRuleDecl(), null, "decl", null, 1, 1, ListRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListRule_Body(), this.getListRuleBody(), null, "body", null, 1, 1, ListRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listRuleDeclEClass, ListRuleDecl.class, "ListRuleDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListRuleDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, ListRuleDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListRuleDecl_Attrs(), this.getAttrs(), null, "attrs", null, 0, 1, ListRuleDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listRuleBodyEClass, ListRuleBody.class, "ListRuleBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListRuleBody_ListExpr(), this.getSimpleExpr(), null, "listExpr", null, 1, 1, ListRuleBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListRuleBody_Separator(), this.getSimpleExpr(), null, "separator", null, 0, 1, ListRuleBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListRuleBody_ListExpr2(), this.getSimpleExpr(), null, "listExpr2", null, 0, 1, ListRuleBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListRuleBody_ListMark(), ecorePackage.getEString(), "listMark", null, 0, 1, ListRuleBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seqRuleEClass, SeqRule.class, "SeqRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeqRule_Decl(), this.getSeqRuleDecl(), null, "decl", null, 1, 1, SeqRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeqRule_Body(), this.getExpr(), null, "body", null, 1, -1, SeqRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seqRuleDeclEClass, SeqRuleDecl.class, "SeqRuleDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeqRuleDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, SeqRuleDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeqRuleDecl_Attrs(), this.getAttrs(), null, "attrs", null, 0, 1, SeqRuleDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenRuleEClass, TokenRule.class, "TokenRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTokenRule_Decl(), this.getTokenRuleDecl(), null, "decl", null, 1, 1, TokenRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenRule_Body(), this.getSimpleExpr(), null, "body", null, 0, -1, TokenRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenRuleDeclEClass, TokenRuleDecl.class, "TokenRuleDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenRuleDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, TokenRuleDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenRuleDecl_Attrs(), this.getAttrs(), null, "attrs", null, 0, 1, TokenRuleDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optSubSeqEClass, OptSubSeq.class, "OptSubSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptSubSeq_Seq(), this.getExpr(), null, "seq", null, 1, -1, OptSubSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleExprEClass, SimpleExpr.class, "SimpleExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleExpr_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleExpr_Value(), ecorePackage.getEString(), "value", null, 0, 1, SimpleExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleExpr_Attrs(), this.getAttrs(), null, "attrs", null, 0, 1, SimpleExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attrsEClass, Attrs.class, "Attrs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttrs_AttrList(), ecorePackage.getEString(), "attrList", null, 0, -1, Attrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exprEClass, Expr.class, "Expr", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(altRuleKindEEnum, AltRuleKind.class, "AltRuleKind");
		addEEnumLiteral(altRuleKindEEnum, AltRuleKind.ABSTRACT);
		addEEnumLiteral(altRuleKindEEnum, AltRuleKind.CONTAINER);
		addEEnumLiteral(altRuleKindEEnum, AltRuleKind.INTERFACE);

		// Create resource
		createResource(eNS_URI);
	}

} //gymnastPackageImpl
