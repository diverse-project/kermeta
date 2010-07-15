/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitacview.MapPoint#getLat <em>Lat</em>}</li>
 *   <li>{@link sitacview.MapPoint#getLong <em>Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitacview.SitacviewPackage#getMapPoint()
 * @model
 * @generated
 */
public interface MapPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(String)
	 * @see sitacview.SitacviewPackage#getMapPoint_Lat()
	 * @model
	 * @generated
	 */
	String getLat();

	/**
	 * Sets the value of the '{@link sitacview.MapPoint#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(String value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(String)
	 * @see sitacview.SitacviewPackage#getMapPoint_Long()
	 * @model
	 * @generated
	 */
	String getLong();

	/**
	 * Sets the value of the '{@link sitacview.MapPoint#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(String value);

} // MapPoint
