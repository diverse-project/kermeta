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
 * A representation of the model object '<em><b>Map Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitacview.MapLine#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitacview.SitacviewPackage#getMapLine()
 * @model
 * @generated
 */
public interface MapLine extends MapItem {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link sitacview.MapPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see sitacview.SitacviewPackage#getMapLine_Points()
	 * @model type="sitacview.MapPoint" containment="true"
	 * @generated
	 */
	EList getPoints();

} // MapLine
