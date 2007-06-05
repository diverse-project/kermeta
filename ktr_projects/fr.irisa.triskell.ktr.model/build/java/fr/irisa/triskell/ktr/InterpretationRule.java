/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterpretationRule.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interpretation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.InterpretationRule#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.InterpretationRule#getSource <em>Source</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.InterpretationRule#getProductions <em>Productions</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.InterpretationRule#getVariables <em>Variables</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.InterpretationRule#getSuperRule <em>Super Rule</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.InterpretationRule#getOwningModel <em>Owning Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.ktr.KtrPackage#getInterpretationRule()
 * @model annotation="kermeta documentation='/**\r\n * This class defines an interpretation rule of the InterpretationPatternModel\r\n \052/'"
 * @generated
 */
public interface InterpretationRule extends EObject {
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
	 * @see fr.irisa.triskell.ktr.KtrPackage#getInterpretationRule_Name()
	 * @model dataType="fr.irisa.triskell.ktr.String" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** Name of the InterpretationRule \052/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.InterpretationRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.ktr.RulePattern#getOwningRule <em>Owning Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(RulePattern)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getInterpretationRule_Source()
	 * @see fr.irisa.triskell.ktr.RulePattern#getOwningRule
	 * @model opposite="owningRule" containment="true" required="true"
	 *        annotation="kermeta documentation='/** Pattern of the InterpretationRule \052/'"
	 * @generated
	 */
	RulePattern getSource();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.InterpretationRule#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RulePattern value);

	/**
	 * Returns the value of the '<em><b>Productions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.ktr.RuleProduction}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.ktr.RuleProduction#getOwningRule <em>Owning Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productions</em>' containment reference list.
	 * @see fr.irisa.triskell.ktr.KtrPackage#getInterpretationRule_Productions()
	 * @see fr.irisa.triskell.ktr.RuleProduction#getOwningRule
	 * @model type="fr.irisa.triskell.ktr.RuleProduction" opposite="owningRule" containment="true"
	 *        annotation="kermeta documentation='/** Set of production of the InterpretationRule \052/'"
	 * @generated
	 */
	EList getProductions();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.ktr.RuleVariable}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.ktr.RuleVariable#getOwningRule <em>Owning Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see fr.irisa.triskell.ktr.KtrPackage#getInterpretationRule_Variables()
	 * @see fr.irisa.triskell.ktr.RuleVariable#getOwningRule
	 * @model type="fr.irisa.triskell.ktr.RuleVariable" opposite="owningRule" containment="true"
	 *        annotation="kermeta documentation='/** Set of variables of the InterpretationRule \052/'"
	 * @generated
	 */
	EList getVariables();

	/**
	 * Returns the value of the '<em><b>Super Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Rule</em>' reference.
	 * @see #setSuperRule(InterpretationRule)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getInterpretationRule_SuperRule()
	 * @model annotation="kermeta documentation='/** Link to the super rule of the InterpretationRule \052/'"
	 * @generated
	 */
	InterpretationRule getSuperRule();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.InterpretationRule#getSuperRule <em>Super Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Rule</em>' reference.
	 * @see #getSuperRule()
	 * @generated
	 */
	void setSuperRule(InterpretationRule value);

	/**
	 * Returns the value of the '<em><b>Owning Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.ktr.InterpretationPatternModel#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Model</em>' container reference.
	 * @see #setOwningModel(InterpretationPatternModel)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getInterpretationRule_OwningModel()
	 * @see fr.irisa.triskell.ktr.InterpretationPatternModel#getRules
	 * @model opposite="rules" required="true"
	 *        annotation="kermeta documentation='/** Reference to the InterpretationPatternModel \052/'"
	 * @generated
	 */
	InterpretationPatternModel getOwningModel();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.InterpretationRule#getOwningModel <em>Owning Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Model</em>' container reference.
	 * @see #getOwningModel()
	 * @generated
	 */
	void setOwningModel(InterpretationPatternModel value);

} // InterpretationRule