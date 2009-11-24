/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Usage#getUsedUnit <em>Used Unit</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Usage#getUserUnit <em>User Unit</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Usage#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUsage()
 * @model
 * @generated
 */
public interface Usage extends EObject {
	/**
	 * Returns the value of the '<em><b>Used Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.Unit#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Unit</em>' reference.
	 * @see #setUsedUnit(Unit)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUsage_UsedUnit()
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getUsedBy
	 * @model opposite="usedBy" required="true"
	 * @generated
	 */
	Unit getUsedUnit();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Usage#getUsedUnit <em>Used Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Unit</em>' reference.
	 * @see #getUsedUnit()
	 * @generated
	 */
	void setUsedUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>User Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.Unit#getUsedUsages <em>Used Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Unit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Unit</em>' container reference.
	 * @see #setUserUnit(Unit)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUsage_UserUnit()
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getUsedUsages
	 * @model opposite="usedUsages" required="true" transient="false"
	 * @generated
	 */
	Unit getUserUnit();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Usage#getUserUnit <em>User Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Unit</em>' container reference.
	 * @see #getUserUnit()
	 * @generated
	 */
	void setUserUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUsage_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Usage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Usage
