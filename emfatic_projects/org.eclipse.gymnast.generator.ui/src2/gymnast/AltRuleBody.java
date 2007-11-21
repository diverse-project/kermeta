/**
 * <copyright>
 * </copyright>
 *
 * $Id: AltRuleBody.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alt Rule Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.AltRuleBody#getPreSeq <em>Pre Seq</em>}</li>
 *   <li>{@link gymnast.AltRuleBody#getAlts <em>Alts</em>}</li>
 *   <li>{@link gymnast.AltRuleBody#getPostSeq <em>Post Seq</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getAltRuleBody()
 * @model
 * @generated
 */
public interface AltRuleBody extends GymnastEASTNode {
	/**
	 * Returns the value of the '<em><b>Pre Seq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Seq</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Seq</em>' reference.
	 * @see #setPreSeq(AltSeq)
	 * @see gymnast.gymnastPackage#getAltRuleBody_PreSeq()
	 * @model
	 * @generated
	 */
	AltSeq getPreSeq();

	/**
	 * Sets the value of the '{@link gymnast.AltRuleBody#getPreSeq <em>Pre Seq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Seq</em>' reference.
	 * @see #getPreSeq()
	 * @generated
	 */
	void setPreSeq(AltSeq value);

	/**
	 * Returns the value of the '<em><b>Alts</b></em>' reference list.
	 * The list contents are of type {@link gymnast.SimpleExpr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alts</em>' reference list.
	 * @see gymnast.gymnastPackage#getAltRuleBody_Alts()
	 * @model type="gymnast.SimpleExpr"
	 * @generated
	 */
	EList<SimpleExpr> getAlts();

	/**
	 * Returns the value of the '<em><b>Post Seq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Seq</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Seq</em>' reference.
	 * @see #setPostSeq(AltSeq)
	 * @see gymnast.gymnastPackage#getAltRuleBody_PostSeq()
	 * @model
	 * @generated
	 */
	AltSeq getPostSeq();

	/**
	 * Sets the value of the '{@link gymnast.AltRuleBody#getPostSeq <em>Post Seq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Seq</em>' reference.
	 * @see #getPostSeq()
	 * @generated
	 */
	void setPostSeq(AltSeq value);

} // AltRuleBody
