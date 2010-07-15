/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Item Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitacview.MapItemPoint#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitacview.SitacviewPackage#getMapItemPoint()
 * @model
 * @generated
 */
public interface MapItemPoint extends MapItem {
	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(MapPoint)
	 * @see sitacview.SitacviewPackage#getMapItemPoint_Pos()
	 * @model containment="true"
	 * @generated
	 */
	MapPoint getPos();

	/**
	 * Sets the value of the '{@link sitacview.MapItemPoint#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(MapPoint value);

} // MapItemPoint
