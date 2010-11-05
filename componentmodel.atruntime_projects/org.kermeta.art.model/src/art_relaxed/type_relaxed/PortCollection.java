/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.type_relaxed;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.type_relaxed.PortCollection#getIds <em>Ids</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getPortCollection()
 * @model
 * @generated
 */
public interface PortCollection extends AbstractPort {
	/**
	 * Returns the value of the '<em><b>Ids</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.type_relaxed.PortId}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' containment reference list.
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getPortCollection_Ids()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PortId> getIds();

} // PortCollection
