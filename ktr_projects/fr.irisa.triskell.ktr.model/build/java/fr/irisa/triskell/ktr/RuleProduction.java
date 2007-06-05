/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuleProduction.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Production</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.RuleProduction#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RuleProduction#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RuleProduction#getTargetModel <em>Target Model</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RuleProduction#getInitExpr <em>Init Expr</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RuleProduction#getOwningRule <em>Owning Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleProduction()
 * @model annotation="kermeta documentation='/**\r\n * This class defines one of the \"outputs\" of an InterpretationRule\r\n \052/'"
 * @generated
 */
public interface RuleProduction extends EObject {
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
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleProduction_Name()
	 * @model dataType="fr.irisa.triskell.ktr.String" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** Name of the RuleProduction \052/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RuleProduction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' reference.
	 * @see #setTargetElement(EClass)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleProduction_TargetElement()
	 * @model required="true"
	 *        annotation="kermeta documentation='/** Ecore type of output model element allocated by the RuleProduction \052/'"
	 * @generated
	 */
	EClass getTargetElement();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RuleProduction#getTargetElement <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(EClass value);

	/**
	 * Returns the value of the '<em><b>Target Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Model</em>' attribute.
	 * @see #setTargetModel(String)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleProduction_TargetModel()
	 * @model dataType="fr.irisa.triskell.ktr.String"
	 *        annotation="kermeta isComposite='true' documentation='/** Name of the model to which output elements must be assigned \052/'"
	 * @generated
	 */
	String getTargetModel();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RuleProduction#getTargetModel <em>Target Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Model</em>' attribute.
	 * @see #getTargetModel()
	 * @generated
	 */
	void setTargetModel(String value);

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
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleProduction_InitExpr()
	 * @model dataType="fr.irisa.triskell.ktr.String"
	 *        annotation="kermeta isComposite='true' documentation='/** Kermeta initialization expression of the allocated output model element \052/'"
	 * @generated
	 */
	String getInitExpr();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RuleProduction#getInitExpr <em>Init Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expr</em>' attribute.
	 * @see #getInitExpr()
	 * @generated
	 */
	void setInitExpr(String value);

	/**
	 * Returns the value of the '<em><b>Owning Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.ktr.InterpretationRule#getProductions <em>Productions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Rule</em>' container reference.
	 * @see #setOwningRule(InterpretationRule)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRuleProduction_OwningRule()
	 * @see fr.irisa.triskell.ktr.InterpretationRule#getProductions
	 * @model opposite="productions" required="true"
	 *        annotation="kermeta documentation='/** Reference to the InterpretationRule \052/'"
	 * @generated
	 */
	InterpretationRule getOwningRule();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RuleProduction#getOwningRule <em>Owning Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Rule</em>' container reference.
	 * @see #getOwningRule()
	 * @generated
	 */
	void setOwningRule(InterpretationRule value);

} // RuleProduction