/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterpretationPatternModel.java,v 1.2 2007-07-31 13:19:21 dtouzet Exp $
 */
package fr.irisa.triskell.ktr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interpretation Pattern Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.InterpretationPatternModel#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.ktr.InterpretationPatternModel#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.ktr.KtrPackage#getInterpretationPatternModel()
 * @model annotation="kermeta documentation='/**\r\n * This class describes the structure and the behavior of an interpretation pattern model\r\n \052/'"
 *        annotation="kermeta.inv rulesName='rules.each{r1 | not (rules.exists{r2 | (r1.isNotEqual(r2)) and (r1.name.equals(r2.name))})}'"
 *        annotation="kermeta.inv.doc documentation='/** All InterpretationRules must have a distinct name \052/'"
 * @generated
 */
public interface InterpretationPatternModel extends EObject {
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
	 * @see fr.irisa.triskell.ktr.KtrPackage#getInterpretationPatternModel_Name()
	 * @model dataType="fr.irisa.triskell.ktr.String" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** Name of the Interpretation model \052/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.ktr.InterpretationPatternModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.ktr.InterpretationRule}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.ktr.InterpretationRule#getOwningModel <em>Owning Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see fr.irisa.triskell.ktr.KtrPackage#getInterpretationPatternModel_Rules()
	 * @see fr.irisa.triskell.ktr.InterpretationRule#getOwningModel
	 * @model opposite="owningModel" containment="true"
	 *        annotation="kermeta documentation='/** Interpretation rules defined by the interpretation model \052/'"
	 * @generated
	 */
	EList<InterpretationRule> getRules();

} // InterpretationPatternModel