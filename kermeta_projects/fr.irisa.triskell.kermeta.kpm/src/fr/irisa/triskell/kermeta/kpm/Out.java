/**
 * <copyright>
 * </copyright>
 *
 * $Id: Out.java,v 1.5 2008-05-28 09:26:14 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An out corresponds to "something" to produce when a rule has been activated (ie the In conditions are true).
 * An out usually have an action to perform to produce the "something" which can be the result of a java action or a kermeta action. An out can be processed synchronously or not depending on the value of the independent field.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Out#getRule <em>Rule</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Out#isIndependant <em>Independant</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Out#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Out#getExtensionPoint <em>Extension Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getOut()
 * @model
 * @generated
 */
public interface Out extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.Rule#getOuts <em>Outs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getOut_Rule()
	 * @see fr.irisa.triskell.kermeta.kpm.Rule#getOuts
	 * @model opposite="outs" transient="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Out#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Independant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Independant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Independant</em>' attribute.
	 * @see #setIndependant(boolean)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getOut_Independant()
	 * @model default="false"
	 * @generated
	 */
	boolean isIndependant();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Out#isIndependant <em>Independant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Independant</em>' attribute.
	 * @see #isIndependant()
	 * @generated
	 */
	void setIndependant(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getOut_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Point</em>' attribute.
	 * @see #setExtensionPoint(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getOut_ExtensionPoint()
	 * @model
	 * @generated
	 */
	String getExtensionPoint();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Out#getExtensionPoint <em>Extension Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Point</em>' attribute.
	 * @see #getExtensionPoint()
	 * @generated
	 */
	void setExtensionPoint(String value);

} // Out