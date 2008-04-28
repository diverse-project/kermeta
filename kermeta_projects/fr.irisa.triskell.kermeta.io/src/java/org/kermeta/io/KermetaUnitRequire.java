/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaUnitRequire.java,v 1.2 2008-04-28 11:50:15 ftanguy Exp $
 */
package org.kermeta.io;

import fr.irisa.triskell.kermeta.language.structure.Require;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta Unit Require</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.KermetaUnitRequire#getKermetaUnit <em>Kermeta Unit</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnitRequire#getRequire <em>Require</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getKermetaUnitRequire()
 * @model
 * @generated
 */
public interface KermetaUnitRequire extends EObject {
	/**
	 * Returns the value of the '<em><b>Kermeta Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kermeta Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kermeta Unit</em>' reference.
	 * @see #setKermetaUnit(KermetaUnit)
	 * @see org.kermeta.io.IoPackage#getKermetaUnitRequire_KermetaUnit()
	 * @model required="true"
	 * @generated
	 */
	KermetaUnit getKermetaUnit();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnitRequire#getKermetaUnit <em>Kermeta Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kermeta Unit</em>' reference.
	 * @see #getKermetaUnit()
	 * @generated
	 */
	void setKermetaUnit(KermetaUnit value);

	/**
	 * Returns the value of the '<em><b>Require</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require</em>' reference.
	 * @see #setRequire(Require)
	 * @see org.kermeta.io.IoPackage#getKermetaUnitRequire_Require()
	 * @model required="true"
	 * @generated
	 */
	Require getRequire();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnitRequire#getRequire <em>Require</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require</em>' reference.
	 * @see #getRequire()
	 * @generated
	 */
	void setRequire(Require value);

} // KermetaUnitRequire
