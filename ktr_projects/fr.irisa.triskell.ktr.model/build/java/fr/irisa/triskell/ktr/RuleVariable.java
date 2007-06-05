/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuleVariable.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.RuleVariable#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RuleVariable#getInitExpr <em>Init Expr</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RuleVariable#getVarType <em>Var Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RuleVariable#getOwningRule <em>Owning Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleVariable()
 * @model annotation="kermeta documentation='/**\r\n * This class defines a variable of an InterpretationRule.\r\n \052/'"
 * @generated
 */
public interface RuleVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleVariable_Name()
	 * @model dataType="fr.irisa.triskell.ktr.String" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** Name of the variable \052/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RuleVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Init Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Expr</em>' attribute.
	 * @see #setInitExpr(String)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleVariable_InitExpr()
	 * @model dataType="fr.irisa.triskell.ktr.String" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** Kermeta expression for variable initialization \052/'"
	 * @generated
	 */
	String getInitExpr();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RuleVariable#getInitExpr <em>Init Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expr</em>' attribute.
	 * @see #getInitExpr()
	 * @generated
	 */
	void setInitExpr(String value);

	/**
	 * Returns the value of the '<em><b>Var Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Type</em>' reference.
	 * @see #setVarType(EClass)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleVariable_VarType()
	 * @model required="true"
	 *        annotation="kermeta documentation='/** Ecore type of the variable \052/'"
	 * @generated
	 */
	EClass getVarType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RuleVariable#getVarType <em>Var Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Type</em>' reference.
	 * @see #getVarType()
	 * @generated
	 */
	void setVarType(EClass value);

	/**
	 * Returns the value of the '<em><b>Owning Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.ktr.InterpretationRule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Rule</em>' container reference.
	 * @see #setOwningRule(InterpretationRule)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleVariable_OwningRule()
	 * @see fr.irisa.triskell.ktr.InterpretationRule#getVariables
	 * @model opposite="variables" required="true"
	 *        annotation="kermeta documentation='/** Reference to the InterpretationRule \052/'"
	 * @generated
	 */
	InterpretationRule getOwningRule();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RuleVariable#getOwningRule <em>Owning Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Rule</em>' container reference.
	 * @see #getOwningRule()
	 * @generated
	 */
	void setOwningRule(InterpretationRule value);

} // RuleVariable