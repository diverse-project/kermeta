/**
 * <copyright>
 * </copyright>
 *
 * $Id: gymnastFactory.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gymnast.gymnastPackage
 * @generated
 */
public interface gymnastFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	gymnastFactory eINSTANCE = gymnast.impl.gymnastFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Comp Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Unit</em>'.
	 * @generated
	 */
	CompUnit createCompUnit();

	/**
	 * Returns a new object of class '<em>Header Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Section</em>'.
	 * @generated
	 */
	HeaderSection createHeaderSection();

	/**
	 * Returns a new object of class '<em>Options Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Options Section</em>'.
	 * @generated
	 */
	OptionsSection createOptionsSection();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Alt Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt Rule</em>'.
	 * @generated
	 */
	AltRule createAltRule();

	/**
	 * Returns a new object of class '<em>Alt Rule Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt Rule Decl</em>'.
	 * @generated
	 */
	AltRuleDecl createAltRuleDecl();

	/**
	 * Returns a new object of class '<em>Alt Rule Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt Rule Body</em>'.
	 * @generated
	 */
	AltRuleBody createAltRuleBody();

	/**
	 * Returns a new object of class '<em>Alt Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt Seq</em>'.
	 * @generated
	 */
	AltSeq createAltSeq();

	/**
	 * Returns a new object of class '<em>List Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Rule</em>'.
	 * @generated
	 */
	ListRule createListRule();

	/**
	 * Returns a new object of class '<em>List Rule Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Rule Decl</em>'.
	 * @generated
	 */
	ListRuleDecl createListRuleDecl();

	/**
	 * Returns a new object of class '<em>List Rule Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Rule Body</em>'.
	 * @generated
	 */
	ListRuleBody createListRuleBody();

	/**
	 * Returns a new object of class '<em>Seq Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq Rule</em>'.
	 * @generated
	 */
	SeqRule createSeqRule();

	/**
	 * Returns a new object of class '<em>Seq Rule Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq Rule Decl</em>'.
	 * @generated
	 */
	SeqRuleDecl createSeqRuleDecl();

	/**
	 * Returns a new object of class '<em>Token Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Rule</em>'.
	 * @generated
	 */
	TokenRule createTokenRule();

	/**
	 * Returns a new object of class '<em>Token Rule Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Rule Decl</em>'.
	 * @generated
	 */
	TokenRuleDecl createTokenRuleDecl();

	/**
	 * Returns a new object of class '<em>Opt Sub Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opt Sub Seq</em>'.
	 * @generated
	 */
	OptSubSeq createOptSubSeq();

	/**
	 * Returns a new object of class '<em>Simple Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Expr</em>'.
	 * @generated
	 */
	SimpleExpr createSimpleExpr();

	/**
	 * Returns a new object of class '<em>Attrs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attrs</em>'.
	 * @generated
	 */
	Attrs createAttrs();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	gymnastPackage getgymnastPackage();

} //gymnastFactory
