/**
 * <copyright>
 * </copyright>
 *
 * $Id: gymnastFactoryImpl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast.impl;

import gymnast.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class gymnastFactoryImpl extends EFactoryImpl implements gymnastFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static gymnastFactory init() {
		try {
			gymnastFactory thegymnastFactory = (gymnastFactory)EPackage.Registry.INSTANCE.getEFactory("gymnast"); 
			if (thegymnastFactory != null) {
				return thegymnastFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new gymnastFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gymnastFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case gymnastPackage.COMP_UNIT: return createCompUnit();
			case gymnastPackage.HEADER_SECTION: return createHeaderSection();
			case gymnastPackage.OPTIONS_SECTION: return createOptionsSection();
			case gymnastPackage.OPTION: return createOption();
			case gymnastPackage.ALT_RULE: return createAltRule();
			case gymnastPackage.ALT_RULE_DECL: return createAltRuleDecl();
			case gymnastPackage.ALT_RULE_BODY: return createAltRuleBody();
			case gymnastPackage.ALT_SEQ: return createAltSeq();
			case gymnastPackage.LIST_RULE: return createListRule();
			case gymnastPackage.LIST_RULE_DECL: return createListRuleDecl();
			case gymnastPackage.LIST_RULE_BODY: return createListRuleBody();
			case gymnastPackage.SEQ_RULE: return createSeqRule();
			case gymnastPackage.SEQ_RULE_DECL: return createSeqRuleDecl();
			case gymnastPackage.TOKEN_RULE: return createTokenRule();
			case gymnastPackage.TOKEN_RULE_DECL: return createTokenRuleDecl();
			case gymnastPackage.OPT_SUB_SEQ: return createOptSubSeq();
			case gymnastPackage.SIMPLE_EXPR: return createSimpleExpr();
			case gymnastPackage.ATTRS: return createAttrs();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case gymnastPackage.ALT_RULE_KIND:
				return createAltRuleKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case gymnastPackage.ALT_RULE_KIND:
				return convertAltRuleKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompUnit createCompUnit() {
		CompUnitImpl compUnit = new CompUnitImpl();
		return compUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderSection createHeaderSection() {
		HeaderSectionImpl headerSection = new HeaderSectionImpl();
		return headerSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsSection createOptionsSection() {
		OptionsSectionImpl optionsSection = new OptionsSectionImpl();
		return optionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltRule createAltRule() {
		AltRuleImpl altRule = new AltRuleImpl();
		return altRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltRuleDecl createAltRuleDecl() {
		AltRuleDeclImpl altRuleDecl = new AltRuleDeclImpl();
		return altRuleDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltRuleBody createAltRuleBody() {
		AltRuleBodyImpl altRuleBody = new AltRuleBodyImpl();
		return altRuleBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltSeq createAltSeq() {
		AltSeqImpl altSeq = new AltSeqImpl();
		return altSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRule createListRule() {
		ListRuleImpl listRule = new ListRuleImpl();
		return listRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRuleDecl createListRuleDecl() {
		ListRuleDeclImpl listRuleDecl = new ListRuleDeclImpl();
		return listRuleDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRuleBody createListRuleBody() {
		ListRuleBodyImpl listRuleBody = new ListRuleBodyImpl();
		return listRuleBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqRule createSeqRule() {
		SeqRuleImpl seqRule = new SeqRuleImpl();
		return seqRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqRuleDecl createSeqRuleDecl() {
		SeqRuleDeclImpl seqRuleDecl = new SeqRuleDeclImpl();
		return seqRuleDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenRule createTokenRule() {
		TokenRuleImpl tokenRule = new TokenRuleImpl();
		return tokenRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenRuleDecl createTokenRuleDecl() {
		TokenRuleDeclImpl tokenRuleDecl = new TokenRuleDeclImpl();
		return tokenRuleDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptSubSeq createOptSubSeq() {
		OptSubSeqImpl optSubSeq = new OptSubSeqImpl();
		return optSubSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpr createSimpleExpr() {
		SimpleExprImpl simpleExpr = new SimpleExprImpl();
		return simpleExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attrs createAttrs() {
		AttrsImpl attrs = new AttrsImpl();
		return attrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltRuleKind createAltRuleKindFromString(EDataType eDataType, String initialValue) {
		AltRuleKind result = AltRuleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltRuleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gymnastPackage getgymnastPackage() {
		return (gymnastPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static gymnastPackage getPackage() {
		return gymnastPackage.eINSTANCE;
	}

} //gymnastFactoryImpl
