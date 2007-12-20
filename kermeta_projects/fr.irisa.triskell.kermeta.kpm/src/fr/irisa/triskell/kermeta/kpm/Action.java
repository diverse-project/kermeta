/**
 * <copyright>
 * </copyright>
 *
 * $Id: Action.java,v 1.7 2007-12-20 09:13:07 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Action#getExtensionPoint <em>Extension Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Point</em>' attribute.
	 * @see #setExtensionPoint(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getAction_ExtensionPoint()
	 * @model
	 * @generated
	 */
	String getExtensionPoint();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Action#getExtensionPoint <em>Extension Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Point</em>' attribute.
	 * @see #getExtensionPoint()
	 * @generated
	 */
	void setExtensionPoint(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model monitorDataType="fr.irisa.triskell.kermeta.kpm.IProgressMonitor"
	 * @generated
	 */
	void execute(Unit unit, IProgressMonitor monitor, Map<String, Object> args);

} // Action