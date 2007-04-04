/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestKey.java,v 1.1 2007-04-04 13:43:56 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.interest;

import fr.irisa.triskell.kermeta.extension.Interest;

import fr.irisa.triskell.kermeta.kpm.Unit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.interest.InterestKey#getDeclaringObject <em>Declaring Object</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.interest.InterestKey#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage#getInterestKey()
 * @model
 * @generated
 */
public interface InterestKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Declaring Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaring Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Object</em>' attribute.
	 * @see #setDeclaringObject(Interest)
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage#getInterestKey_DeclaringObject()
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.interest.Interest" required="true"
	 * @generated
	 */
	Interest getDeclaringObject();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestKey#getDeclaringObject <em>Declaring Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Object</em>' attribute.
	 * @see #getDeclaringObject()
	 * @generated
	 */
	void setDeclaringObject(Interest value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage#getInterestKey_Unit()
	 * @model required="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestKey#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // InterestKey