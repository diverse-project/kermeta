/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.diagnostic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.diagnostic.ModelReference#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.diagnostic.DiagnosticPackage#getModelReference()
 * @model
 * @generated
 */
public interface ModelReference extends Reference {
	/**
	 * Returns the value of the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Object</em>' reference.
	 * @see #setReferencedObject(EObject)
	 * @see org.kermeta.diagnostic.DiagnosticPackage#getModelReference_ReferencedObject()
	 * @model required="true"
	 * @generated
	 */
	EObject getReferencedObject();

	/**
	 * Sets the value of the '{@link org.kermeta.diagnostic.ModelReference#getReferencedObject <em>Referenced Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Object</em>' reference.
	 * @see #getReferencedObject()
	 * @generated
	 */
	void setReferencedObject(EObject value);

} // ModelReference
