/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.type;

import art.AddElement;
import art.ModelElement;
import art.RemoveElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.Service#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getService()
 * @model abstract="true"
 *        annotation="kermeta ecore='true'"
 *        annotation="kermeta.inv validService=''"
 * @generated
 */
public interface Service extends ModelElement, AddElement, RemoveElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link art.type.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see art.type.TypePackage#getService_Operation()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<Operation> getOperation();

} // Service
