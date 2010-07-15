/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sitacview.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sitacview.SitacviewPackage
 * @generated
 */
public class SitacviewAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SitacviewPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacviewAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SitacviewPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SitacviewSwitch modelSwitch =
		new SitacviewSwitch() {
			public Object caseMoyenClipboard(MoyenClipboard object) {
				return createMoyenClipboardAdapter();
			}
			public Object caseMapWidget(MapWidget object) {
				return createMapWidgetAdapter();
			}
			public Object caseTabView(TabView object) {
				return createTabViewAdapter();
			}
			public Object caseView(View object) {
				return createViewAdapter();
			}
			public Object caseTitledView(TitledView object) {
				return createTitledViewAdapter();
			}
			public Object caseLibToolBox(LibToolBox object) {
				return createLibToolBoxAdapter();
			}
			public Object caseMapItemPoint(MapItemPoint object) {
				return createMapItemPointAdapter();
			}
			public Object caseMapLine(MapLine object) {
				return createMapLineAdapter();
			}
			public Object caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			public Object caseToolBox(ToolBox object) {
				return createToolBoxAdapter();
			}
			public Object caseMapItem(MapItem object) {
				return createMapItemAdapter();
			}
			public Object caseMapZone(MapZone object) {
				return createMapZoneAdapter();
			}
			public Object caseMapPoint(MapPoint object) {
				return createMapPointAdapter();
			}
			public Object caseSelectable(Selectable object) {
				return createSelectableAdapter();
			}
			public Object caseItemType(ItemType object) {
				return createItemTypeAdapter();
			}
			public Object casePropertyEditor(PropertyEditor object) {
				return createPropertyEditorAdapter();
			}
			public Object caseDraggable(Draggable object) {
				return createDraggableAdapter();
			}
			public Object caseDragTarget(DragTarget object) {
				return createDragTargetAdapter();
			}
			public Object caseChatPanel(ChatPanel object) {
				return createChatPanelAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sitacview.MoyenClipboard <em>Moyen Clipboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.MoyenClipboard
	 * @generated
	 */
	public Adapter createMoyenClipboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.MapWidget <em>Map Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.MapWidget
	 * @generated
	 */
	public Adapter createMapWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.TabView <em>Tab View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.TabView
	 * @generated
	 */
	public Adapter createTabViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.TitledView <em>Titled View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.TitledView
	 * @generated
	 */
	public Adapter createTitledViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.LibToolBox <em>Lib Tool Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.LibToolBox
	 * @generated
	 */
	public Adapter createLibToolBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.MapItemPoint <em>Map Item Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.MapItemPoint
	 * @generated
	 */
	public Adapter createMapItemPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.MapLine <em>Map Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.MapLine
	 * @generated
	 */
	public Adapter createMapLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.ToolBox <em>Tool Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.ToolBox
	 * @generated
	 */
	public Adapter createToolBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.MapItem <em>Map Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.MapItem
	 * @generated
	 */
	public Adapter createMapItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.MapZone <em>Map Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.MapZone
	 * @generated
	 */
	public Adapter createMapZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.MapPoint <em>Map Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.MapPoint
	 * @generated
	 */
	public Adapter createMapPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.Selectable <em>Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.Selectable
	 * @generated
	 */
	public Adapter createSelectableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.PropertyEditor <em>Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.PropertyEditor
	 * @generated
	 */
	public Adapter createPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.Draggable <em>Draggable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.Draggable
	 * @generated
	 */
	public Adapter createDraggableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.DragTarget <em>Drag Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.DragTarget
	 * @generated
	 */
	public Adapter createDragTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitacview.ChatPanel <em>Chat Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitacview.ChatPanel
	 * @generated
	 */
	public Adapter createChatPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SitacviewAdapterFactory
