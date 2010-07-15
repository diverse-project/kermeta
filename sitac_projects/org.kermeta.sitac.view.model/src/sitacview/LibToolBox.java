/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lib Tool Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitacview.LibToolBox#getLibrary <em>Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitacview.SitacviewPackage#getLibToolBox()
 * @model
 * @generated
 */
public interface LibToolBox extends ToolBox {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link sitacview.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see sitacview.SitacviewPackage#getLibToolBox_Library()
	 * @model type="sitacview.Library" containment="true"
	 * @generated
	 */
	EList getLibrary();

} // LibToolBox
