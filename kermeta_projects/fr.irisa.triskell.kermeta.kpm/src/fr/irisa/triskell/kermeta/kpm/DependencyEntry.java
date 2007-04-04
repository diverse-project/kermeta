/**
 * <copyright>
 * </copyright>
 *
 * $Id: DependencyEntry.java,v 1.1 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.DependencyEntry#getType <em>Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.DependencyEntry#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependencyEntry()
 * @model
 * @generated
 */
public interface DependencyEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DependencyType)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependencyEntry_Type()
	 * @model required="true"
	 * @generated
	 */
	DependencyType getType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.DependencyEntry#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DependencyType value);

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
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependencyEntry_Unit()
	 * @model required="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.DependencyEntry#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // DependencyEntry