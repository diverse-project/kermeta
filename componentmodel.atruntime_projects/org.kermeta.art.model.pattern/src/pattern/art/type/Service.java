/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.type;

import org.eclipse.emf.common.util.EList;

import pattern.art.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.type.Service#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.type.TypePackage#getService()
 * @model
 * @generated
 */
public interface Service extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link pattern.art.type.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see pattern.art.type.TypePackage#getService_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

} // Service
