/**
 * <copyright>
 * </copyright>
 *
 * $Id: Filter.java,v 1.1 2006-12-12 16:06:11 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.core.resources.IResource;

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
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.boolean"
	 * @generated
	 */
	boolean apply(Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.boolean" resourceDataType="fr.irisa.triskell.kermeta.kpm.IResource"
	 * @generated
	 */
	boolean apply(IResource resource);

} // Filter