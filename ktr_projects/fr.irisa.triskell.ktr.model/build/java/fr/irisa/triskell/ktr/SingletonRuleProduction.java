/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingletonRuleProduction.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Rule Production</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.SingletonRuleProduction#getIdExpr <em>Id Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.ktr.KtrPackage#getSingletonRuleProduction()
 * @model annotation="kermeta documentation='/**\r\n * This class defines a singleton output of an InterpretationRule.\r\n \052/'"
 * @generated
 */
public interface SingletonRuleProduction extends RuleProduction {
	/**
	 * Returns the value of the '<em><b>Id Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Expr</em>' attribute.
	 * @see #setIdExpr(String)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getSingletonRuleProduction_IdExpr()
	 * @model dataType="fr.irisa.triskell.ktr.String" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** Expression that identifies the singleton object (based on input model elements) \052/'"
	 * @generated
	 */
	String getIdExpr();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.SingletonRuleProduction#getIdExpr <em>Id Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Expr</em>' attribute.
	 * @see #getIdExpr()
	 * @generated
	 */
	void setIdExpr(String value);

} // SingletonRuleProduction