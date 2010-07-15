/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitacview.Library#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitacview.SitacviewPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link sitacview.ItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see sitacview.SitacviewPackage#getLibrary_Items()
	 * @model type="sitacview.ItemType"
	 * @generated
	 */
	EList getItems();

} // Library
