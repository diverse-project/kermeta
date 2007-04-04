/**
 * <copyright>
 * </copyright>
 *
 * $Id: Filter.java,v 1.2 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getFilter()
 * @model abstract="true"
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean matches(Unit unit);

} // Filter