/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sitacview.MapItem;
import sitacview.MapWidget;
import sitacview.SitacviewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitacview.impl.MapWidgetImpl#getActualZoomLevel <em>Actual Zoom Level</em>}</li>
 *   <li>{@link sitacview.impl.MapWidgetImpl#getActualLat <em>Actual Lat</em>}</li>
 *   <li>{@link sitacview.impl.MapWidgetImpl#getActualLong <em>Actual Long</em>}</li>
 *   <li>{@link sitacview.impl.MapWidgetImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapWidgetImpl extends ViewImpl implements MapWidget {
	/**
	 * The default value of the '{@link #getActualZoomLevel() <em>Actual Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualZoomLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_ZOOM_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualZoomLevel() <em>Actual Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualZoomLevel()
	 * @generated
	 * @ordered
	 */
	protected String actualZoomLevel = ACTUAL_ZOOM_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualLat() <em>Actual Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualLat()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_LAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualLat() <em>Actual Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualLat()
	 * @generated
	 * @ordered
	 */
	protected String actualLat = ACTUAL_LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualLong() <em>Actual Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualLong()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_LONG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualLong() <em>Actual Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualLong()
	 * @generated
	 * @ordered
	 */
	protected String actualLong = ACTUAL_LONG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SitacviewPackage.Literals.MAP_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActualZoomLevel() {
		return actualZoomLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualZoomLevel(String newActualZoomLevel) {
		String oldActualZoomLevel = actualZoomLevel;
		actualZoomLevel = newActualZoomLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacviewPackage.MAP_WIDGET__ACTUAL_ZOOM_LEVEL, oldActualZoomLevel, actualZoomLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActualLat() {
		return actualLat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualLat(String newActualLat) {
		String oldActualLat = actualLat;
		actualLat = newActualLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacviewPackage.MAP_WIDGET__ACTUAL_LAT, oldActualLat, actualLat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActualLong() {
		return actualLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualLong(String newActualLong) {
		String oldActualLong = actualLong;
		actualLong = newActualLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacviewPackage.MAP_WIDGET__ACTUAL_LONG, oldActualLong, actualLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getItems() {
		if (items == null) {
			items = new EObjectContainmentEList(MapItem.class, this, SitacviewPackage.MAP_WIDGET__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SitacviewPackage.MAP_WIDGET__ITEMS:
				return ((InternalEList)getItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacviewPackage.MAP_WIDGET__ACTUAL_ZOOM_LEVEL:
				return getActualZoomLevel();
			case SitacviewPackage.MAP_WIDGET__ACTUAL_LAT:
				return getActualLat();
			case SitacviewPackage.MAP_WIDGET__ACTUAL_LONG:
				return getActualLong();
			case SitacviewPackage.MAP_WIDGET__ITEMS:
				return getItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SitacviewPackage.MAP_WIDGET__ACTUAL_ZOOM_LEVEL:
				setActualZoomLevel((String)newValue);
				return;
			case SitacviewPackage.MAP_WIDGET__ACTUAL_LAT:
				setActualLat((String)newValue);
				return;
			case SitacviewPackage.MAP_WIDGET__ACTUAL_LONG:
				setActualLong((String)newValue);
				return;
			case SitacviewPackage.MAP_WIDGET__ITEMS:
				getItems().clear();
				getItems().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SitacviewPackage.MAP_WIDGET__ACTUAL_ZOOM_LEVEL:
				setActualZoomLevel(ACTUAL_ZOOM_LEVEL_EDEFAULT);
				return;
			case SitacviewPackage.MAP_WIDGET__ACTUAL_LAT:
				setActualLat(ACTUAL_LAT_EDEFAULT);
				return;
			case SitacviewPackage.MAP_WIDGET__ACTUAL_LONG:
				setActualLong(ACTUAL_LONG_EDEFAULT);
				return;
			case SitacviewPackage.MAP_WIDGET__ITEMS:
				getItems().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SitacviewPackage.MAP_WIDGET__ACTUAL_ZOOM_LEVEL:
				return ACTUAL_ZOOM_LEVEL_EDEFAULT == null ? actualZoomLevel != null : !ACTUAL_ZOOM_LEVEL_EDEFAULT.equals(actualZoomLevel);
			case SitacviewPackage.MAP_WIDGET__ACTUAL_LAT:
				return ACTUAL_LAT_EDEFAULT == null ? actualLat != null : !ACTUAL_LAT_EDEFAULT.equals(actualLat);
			case SitacviewPackage.MAP_WIDGET__ACTUAL_LONG:
				return ACTUAL_LONG_EDEFAULT == null ? actualLong != null : !ACTUAL_LONG_EDEFAULT.equals(actualLong);
			case SitacviewPackage.MAP_WIDGET__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (actualZoomLevel: ");
		result.append(actualZoomLevel);
		result.append(", actualLat: ");
		result.append(actualLat);
		result.append(", actualLong: ");
		result.append(actualLong);
		result.append(')');
		return result.toString();
	}

} //MapWidgetImpl
