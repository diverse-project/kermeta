/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.PortCollection#getIds <em>Ids</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getPortCollection()
 * @model
 * @generated
 */
public interface PortCollection extends AbstractPort {
	/**
	 * Returns the value of the '<em><b>Ids</b></em>' containment reference list.
	 * The list contents are of type {@link art.type.PortId}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' containment reference list.
	 * @see art.type.TypePackage#getPortCollection_Ids()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PortId> getIds();

} // PortCollection
