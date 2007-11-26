/**
 * <copyright>
 * </copyright>
 *
 * $Id: TrekModelElement.java,v 1.2 2007-11-26 17:04:18 cfaucher Exp $
 */
package org.kermeta.trek;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.trek.TrekModelElement#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.trek.TrekModelElement#getSummary <em>Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.trek.TrekPackage#getTrekModelElement()
 * @model abstract="true"
 * @generated
 */
public interface TrekModelElement extends EObject {
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
	 * @see org.kermeta.trek.TrekPackage#getTrekModelElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.TrekModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.kermeta.trek.TrekPackage#getTrekModelElement_Summary()
	 * @model default="" required="true"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.TrekModelElement#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

} // TrekModelElement
