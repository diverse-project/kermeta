/**
 * <copyright>
 * </copyright>
 *
 * $Id: Dependency.java,v 1.6 2007-05-15 15:22:53 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getType <em>Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getFrom <em>From</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(RuleType)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_Type()
	 * @model required="true"
	 * @generated
	 */
	RuleType getType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RuleType value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Unit)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_From()
	 * @model required="true"
	 * @generated
	 */
	Unit getFrom();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Unit value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Unit)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_To()
	 * @model required="true"
	 * @generated
	 */
	Unit getTo();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Unit value);

} // Dependency