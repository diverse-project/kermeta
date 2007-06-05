/**
 * <copyright>
 * </copyright>
 *
 * $Id: RulePattern.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.RulePattern#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RulePattern#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RulePattern#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RulePattern#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.RulePattern#getOwningRule <em>Owning Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.ktr.KtrPackage#getRulePattern()
 * @model annotation="kermeta documentation='/**\r\n * This class defines the matching pattern of an InterpretationRule\r\n \052/'"
 * @generated
 */
public interface RulePattern extends EObject {
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
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRulePattern_Name()
	 * @model dataType="fr.irisa.triskell.ktr.String" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** Name of the RulePattern \052/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RulePattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' reference.
	 * @see #setSourceElement(EClass)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRulePattern_SourceElement()
	 * @model required="true"
	 *        annotation="kermeta documentation='/** Ecore type of input model elements matched by the RulePattern \052/'"
	 * @generated
	 */
	EClass getSourceElement();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RulePattern#getSourceElement <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(EClass value);

	/**
	 * Returns the value of the '<em><b>Source Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Model</em>' attribute.
	 * @see #setSourceModel(String)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRulePattern_SourceModel()
	 * @model dataType="fr.irisa.triskell.ktr.String"
	 *        annotation="kermeta isComposite='true' documentation='/** Name of the model from which input elements must be matched \052/'"
	 * @generated
	 */
	String getSourceModel();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RulePattern#getSourceModel <em>Source Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Model</em>' attribute.
	 * @see #getSourceModel()
	 * @generated
	 */
	void setSourceModel(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRulePattern_Condition()
	 * @model dataType="fr.irisa.triskell.ktr.String"
	 *        annotation="kermeta isComposite='true' documentation='/** Kermeta condition expression that has to be validated by the input model element \052/'"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RulePattern#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Owning Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.ktr.InterpretationRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Rule</em>' container reference.
	 * @see #setOwningRule(InterpretationRule)
	 * @see fr.irisa.triskell.ktr.KtrPackage#getRulePattern_OwningRule()
	 * @see fr.irisa.triskell.ktr.InterpretationRule#getSource
	 * @model opposite="source" required="true"
	 *        annotation="kermeta documentation='/** Reference to the InterpretationRule \052/'"
	 * @generated
	 */
	InterpretationRule getOwningRule();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.RulePattern#getOwningRule <em>Owning Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Rule</em>' container reference.
	 * @see #getOwningRule()
	 * @generated
	 */
	void setOwningRule(InterpretationRule value);

} // RulePattern