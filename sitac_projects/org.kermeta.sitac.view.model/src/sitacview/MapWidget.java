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
 * A representation of the model object '<em><b>Map Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitacview.MapWidget#getActualZoomLevel <em>Actual Zoom Level</em>}</li>
 *   <li>{@link sitacview.MapWidget#getActualLat <em>Actual Lat</em>}</li>
 *   <li>{@link sitacview.MapWidget#getActualLong <em>Actual Long</em>}</li>
 *   <li>{@link sitacview.MapWidget#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitacview.SitacviewPackage#getMapWidget()
 * @model
 * @generated
 */
public interface MapWidget extends View, DragTarget {
	/**
	 * Returns the value of the '<em><b>Actual Zoom Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Zoom Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Zoom Level</em>' attribute.
	 * @see #setActualZoomLevel(String)
	 * @see sitacview.SitacviewPackage#getMapWidget_ActualZoomLevel()
	 * @model
	 * @generated
	 */
	String getActualZoomLevel();

	/**
	 * Sets the value of the '{@link sitacview.MapWidget#getActualZoomLevel <em>Actual Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Zoom Level</em>' attribute.
	 * @see #getActualZoomLevel()
	 * @generated
	 */
	void setActualZoomLevel(String value);

	/**
	 * Returns the value of the '<em><b>Actual Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Lat</em>' attribute.
	 * @see #setActualLat(String)
	 * @see sitacview.SitacviewPackage#getMapWidget_ActualLat()
	 * @model
	 * @generated
	 */
	String getActualLat();

	/**
	 * Sets the value of the '{@link sitacview.MapWidget#getActualLat <em>Actual Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Lat</em>' attribute.
	 * @see #getActualLat()
	 * @generated
	 */
	void setActualLat(String value);

	/**
	 * Returns the value of the '<em><b>Actual Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Long</em>' attribute.
	 * @see #setActualLong(String)
	 * @see sitacview.SitacviewPackage#getMapWidget_ActualLong()
	 * @model
	 * @generated
	 */
	String getActualLong();

	/**
	 * Sets the value of the '{@link sitacview.MapWidget#getActualLong <em>Actual Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Long</em>' attribute.
	 * @see #getActualLong()
	 * @generated
	 */
	void setActualLong(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link sitacview.MapItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see sitacview.SitacviewPackage#getMapWidget_Items()
	 * @model type="sitacview.MapItem" containment="true"
	 * @generated
	 */
	EList getItems();

} // MapWidget
