/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelReference.java,v 1.2 2007-07-31 12:34:31 dtouzet Exp $
 */
package fr.irisa.triskell.traceability;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.traceability.ModelReference#getRefObject <em>Ref Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getModelReference()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a reference to a model element\r\n \052/'"
 * @generated
 */
public interface ModelReference extends Reference {
	/**
	 * Returns the value of the '<em><b>Ref Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Object</em>' reference.
	 * @see #setRefObject(EObject)
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getModelReference_RefObject()
	 * @model required="true"
	 * @generated
	 */
	EObject getRefObject();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.traceability.ModelReference#getRefObject <em>Ref Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Object</em>' reference.
	 * @see #getRefObject()
	 * @generated
	 */
	void setRefObject(EObject value);

} // ModelReference
