/**
 * <copyright>
 * </copyright>
 *
 * $Id: Expression.java,v 1.3 2008-05-28 09:26:14 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean evaluateIn(Unit unit);
} // Expression