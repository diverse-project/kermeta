/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestEntry.java,v 1.1 2007-04-04 13:43:56 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.interest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.interest.InterestEntry#getKey <em>Key</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.interest.InterestEntry#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage#getInterestEntry()
 * @model
 * @generated
 */
public interface InterestEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(InterestKey)
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage#getInterestEntry_Key()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterestKey getKey();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestEntry#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(InterestKey value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage#getInterestEntry_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // InterestEntry