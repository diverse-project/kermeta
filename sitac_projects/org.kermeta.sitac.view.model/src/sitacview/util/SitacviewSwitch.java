/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import sitacview.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sitacview.SitacviewPackage
 * @generated
 */
public class SitacviewSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SitacviewPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacviewSwitch() {
		if (modelPackage == null) {
			modelPackage = SitacviewPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SitacviewPackage.MOYEN_CLIPBOARD: {
				MoyenClipboard moyenClipboard = (MoyenClipboard)theEObject;
				Object result = caseMoyenClipboard(moyenClipboard);
				if (result == null) result = caseView(moyenClipboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.MAP_WIDGET: {
				MapWidget mapWidget = (MapWidget)theEObject;
				Object result = caseMapWidget(mapWidget);
				if (result == null) result = caseView(mapWidget);
				if (result == null) result = caseDragTarget(mapWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.TAB_VIEW: {
				TabView tabView = (TabView)theEObject;
				Object result = caseTabView(tabView);
				if (result == null) result = caseView(tabView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.VIEW: {
				View view = (View)theEObject;
				Object result = caseView(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.TITLED_VIEW: {
				TitledView titledView = (TitledView)theEObject;
				Object result = caseTitledView(titledView);
				if (result == null) result = caseView(titledView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.LIB_TOOL_BOX: {
				LibToolBox libToolBox = (LibToolBox)theEObject;
				Object result = caseLibToolBox(libToolBox);
				if (result == null) result = caseToolBox(libToolBox);
				if (result == null) result = caseView(libToolBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.MAP_ITEM_POINT: {
				MapItemPoint mapItemPoint = (MapItemPoint)theEObject;
				Object result = caseMapItemPoint(mapItemPoint);
				if (result == null) result = caseMapItem(mapItemPoint);
				if (result == null) result = caseSelectable(mapItemPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.MAP_LINE: {
				MapLine mapLine = (MapLine)theEObject;
				Object result = caseMapLine(mapLine);
				if (result == null) result = caseMapItem(mapLine);
				if (result == null) result = caseSelectable(mapLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.LIBRARY: {
				Library library = (Library)theEObject;
				Object result = caseLibrary(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.TOOL_BOX: {
				ToolBox toolBox = (ToolBox)theEObject;
				Object result = caseToolBox(toolBox);
				if (result == null) result = caseView(toolBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.MAP_ITEM: {
				MapItem mapItem = (MapItem)theEObject;
				Object result = caseMapItem(mapItem);
				if (result == null) result = caseSelectable(mapItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.MAP_ZONE: {
				MapZone mapZone = (MapZone)theEObject;
				Object result = caseMapZone(mapZone);
				if (result == null) result = caseMapItem(mapZone);
				if (result == null) result = caseSelectable(mapZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.MAP_POINT: {
				MapPoint mapPoint = (MapPoint)theEObject;
				Object result = caseMapPoint(mapPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.SELECTABLE: {
				Selectable selectable = (Selectable)theEObject;
				Object result = caseSelectable(selectable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.ITEM_TYPE: {
				ItemType itemType = (ItemType)theEObject;
				Object result = caseItemType(itemType);
				if (result == null) result = caseDraggable(itemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.PROPERTY_EDITOR: {
				PropertyEditor propertyEditor = (PropertyEditor)theEObject;
				Object result = casePropertyEditor(propertyEditor);
				if (result == null) result = caseView(propertyEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.DRAGGABLE: {
				Draggable draggable = (Draggable)theEObject;
				Object result = caseDraggable(draggable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.DRAG_TARGET: {
				DragTarget dragTarget = (DragTarget)theEObject;
				Object result = caseDragTarget(dragTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacviewPackage.CHAT_PANEL: {
				ChatPanel chatPanel = (ChatPanel)theEObject;
				Object result = caseChatPanel(chatPanel);
				if (result == null) result = caseView(chatPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moyen Clipboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moyen Clipboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMoyenClipboard(MoyenClipboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapWidget(MapWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTabView(TabView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titled View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titled View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTitledView(TitledView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lib Tool Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lib Tool Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLibToolBox(LibToolBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Item Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Item Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapItemPoint(MapItemPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapLine(MapLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolBox(ToolBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapItem(MapItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapZone(MapZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapPoint(MapPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selectable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selectable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSelectable(Selectable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseItemType(ItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropertyEditor(PropertyEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Draggable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Draggable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDraggable(Draggable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drag Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drag Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDragTarget(DragTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chat Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chat Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChatPanel(ChatPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //SitacviewSwitch
