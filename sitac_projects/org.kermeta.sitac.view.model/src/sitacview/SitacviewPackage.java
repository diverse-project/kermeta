/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sitacview.SitacviewFactory
 * @model kind="package"
 * @generated
 */
public interface SitacviewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sitacview";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sitacview/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sitacview";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SitacviewPackage eINSTANCE = sitacview.impl.SitacviewPackageImpl.init();

	/**
	 * The meta object id for the '{@link sitacview.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.ViewImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sitacview.impl.MoyenClipboardImpl <em>Moyen Clipboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.MoyenClipboardImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getMoyenClipboard()
	 * @generated
	 */
	int MOYEN_CLIPBOARD = 0;

	/**
	 * The number of structural features of the '<em>Moyen Clipboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN_CLIPBOARD_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sitacview.impl.MapWidgetImpl <em>Map Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.MapWidgetImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getMapWidget()
	 * @generated
	 */
	int MAP_WIDGET = 1;

	/**
	 * The feature id for the '<em><b>Actual Zoom Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_WIDGET__ACTUAL_ZOOM_LEVEL = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_WIDGET__ACTUAL_LAT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actual Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_WIDGET__ACTUAL_LONG = VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_WIDGET__ITEMS = VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Map Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_WIDGET_FEATURE_COUNT = VIEW_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sitacview.impl.TabViewImpl <em>Tab View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.TabViewImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getTabView()
	 * @generated
	 */
	int TAB_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__CHILDS = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__SELECTED = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tab View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sitacview.impl.TitledViewImpl <em>Titled View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.TitledViewImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getTitledView()
	 * @generated
	 */
	int TITLED_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_VIEW__NAME = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Titled View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitacview.impl.ToolBoxImpl <em>Tool Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.ToolBoxImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getToolBox()
	 * @generated
	 */
	int TOOL_BOX = 9;

	/**
	 * The number of structural features of the '<em>Tool Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BOX_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sitacview.impl.LibToolBoxImpl <em>Lib Tool Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.LibToolBoxImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getLibToolBox()
	 * @generated
	 */
	int LIB_TOOL_BOX = 5;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_TOOL_BOX__LIBRARY = TOOL_BOX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lib Tool Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_TOOL_BOX_FEATURE_COUNT = TOOL_BOX_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitacview.impl.SelectableImpl <em>Selectable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.SelectableImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getSelectable()
	 * @generated
	 */
	int SELECTABLE = 13;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE__SELECTED = 0;

	/**
	 * The number of structural features of the '<em>Selectable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sitacview.impl.MapItemImpl <em>Map Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.MapItemImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getMapItem()
	 * @generated
	 */
	int MAP_ITEM = 10;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ITEM__SELECTED = SELECTABLE__SELECTED;

	/**
	 * The number of structural features of the '<em>Map Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ITEM_FEATURE_COUNT = SELECTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sitacview.impl.MapItemPointImpl <em>Map Item Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.MapItemPointImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getMapItemPoint()
	 * @generated
	 */
	int MAP_ITEM_POINT = 6;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ITEM_POINT__SELECTED = MAP_ITEM__SELECTED;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ITEM_POINT__POS = MAP_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Item Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ITEM_POINT_FEATURE_COUNT = MAP_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitacview.impl.MapLineImpl <em>Map Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.MapLineImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getMapLine()
	 * @generated
	 */
	int MAP_LINE = 7;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LINE__SELECTED = MAP_ITEM__SELECTED;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LINE__POINTS = MAP_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LINE_FEATURE_COUNT = MAP_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitacview.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.LibraryImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sitacview.impl.MapZoneImpl <em>Map Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.MapZoneImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getMapZone()
	 * @generated
	 */
	int MAP_ZONE = 11;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ZONE__SELECTED = MAP_ITEM__SELECTED;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ZONE__POINTS = MAP_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ZONE_FEATURE_COUNT = MAP_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitacview.impl.MapPointImpl <em>Map Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.MapPointImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getMapPoint()
	 * @generated
	 */
	int MAP_POINT = 12;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POINT__LAT = 0;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POINT__LONG = 1;

	/**
	 * The number of structural features of the '<em>Map Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sitacview.impl.DraggableImpl <em>Draggable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.DraggableImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getDraggable()
	 * @generated
	 */
	int DRAGGABLE = 16;

	/**
	 * The number of structural features of the '<em>Draggable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGGABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sitacview.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.ItemTypeImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 14;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = DRAGGABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sitacview.impl.PropertyEditorImpl <em>Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.PropertyEditorImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getPropertyEditor()
	 * @generated
	 */
	int PROPERTY_EDITOR = 15;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDITOR__ELEMENT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDITOR_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitacview.impl.DragTargetImpl <em>Drag Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.DragTargetImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getDragTarget()
	 * @generated
	 */
	int DRAG_TARGET = 17;

	/**
	 * The number of structural features of the '<em>Drag Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAG_TARGET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sitacview.impl.ChatPanelImpl <em>Chat Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitacview.impl.ChatPanelImpl
	 * @see sitacview.impl.SitacviewPackageImpl#getChatPanel()
	 * @generated
	 */
	int CHAT_PANEL = 18;

	/**
	 * The number of structural features of the '<em>Chat Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_PANEL_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link sitacview.MoyenClipboard <em>Moyen Clipboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moyen Clipboard</em>'.
	 * @see sitacview.MoyenClipboard
	 * @generated
	 */
	EClass getMoyenClipboard();

	/**
	 * Returns the meta object for class '{@link sitacview.MapWidget <em>Map Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Widget</em>'.
	 * @see sitacview.MapWidget
	 * @generated
	 */
	EClass getMapWidget();

	/**
	 * Returns the meta object for the attribute '{@link sitacview.MapWidget#getActualZoomLevel <em>Actual Zoom Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Zoom Level</em>'.
	 * @see sitacview.MapWidget#getActualZoomLevel()
	 * @see #getMapWidget()
	 * @generated
	 */
	EAttribute getMapWidget_ActualZoomLevel();

	/**
	 * Returns the meta object for the attribute '{@link sitacview.MapWidget#getActualLat <em>Actual Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Lat</em>'.
	 * @see sitacview.MapWidget#getActualLat()
	 * @see #getMapWidget()
	 * @generated
	 */
	EAttribute getMapWidget_ActualLat();

	/**
	 * Returns the meta object for the attribute '{@link sitacview.MapWidget#getActualLong <em>Actual Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Long</em>'.
	 * @see sitacview.MapWidget#getActualLong()
	 * @see #getMapWidget()
	 * @generated
	 */
	EAttribute getMapWidget_ActualLong();

	/**
	 * Returns the meta object for the containment reference list '{@link sitacview.MapWidget#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see sitacview.MapWidget#getItems()
	 * @see #getMapWidget()
	 * @generated
	 */
	EReference getMapWidget_Items();

	/**
	 * Returns the meta object for class '{@link sitacview.TabView <em>Tab View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab View</em>'.
	 * @see sitacview.TabView
	 * @generated
	 */
	EClass getTabView();

	/**
	 * Returns the meta object for the containment reference list '{@link sitacview.TabView#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see sitacview.TabView#getChilds()
	 * @see #getTabView()
	 * @generated
	 */
	EReference getTabView_Childs();

	/**
	 * Returns the meta object for the reference '{@link sitacview.TabView#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected</em>'.
	 * @see sitacview.TabView#getSelected()
	 * @see #getTabView()
	 * @generated
	 */
	EReference getTabView_Selected();

	/**
	 * Returns the meta object for class '{@link sitacview.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see sitacview.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for class '{@link sitacview.TitledView <em>Titled View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titled View</em>'.
	 * @see sitacview.TitledView
	 * @generated
	 */
	EClass getTitledView();

	/**
	 * Returns the meta object for the attribute '{@link sitacview.TitledView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sitacview.TitledView#getName()
	 * @see #getTitledView()
	 * @generated
	 */
	EAttribute getTitledView_Name();

	/**
	 * Returns the meta object for class '{@link sitacview.LibToolBox <em>Lib Tool Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lib Tool Box</em>'.
	 * @see sitacview.LibToolBox
	 * @generated
	 */
	EClass getLibToolBox();

	/**
	 * Returns the meta object for the containment reference list '{@link sitacview.LibToolBox#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library</em>'.
	 * @see sitacview.LibToolBox#getLibrary()
	 * @see #getLibToolBox()
	 * @generated
	 */
	EReference getLibToolBox_Library();

	/**
	 * Returns the meta object for class '{@link sitacview.MapItemPoint <em>Map Item Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Item Point</em>'.
	 * @see sitacview.MapItemPoint
	 * @generated
	 */
	EClass getMapItemPoint();

	/**
	 * Returns the meta object for the containment reference '{@link sitacview.MapItemPoint#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see sitacview.MapItemPoint#getPos()
	 * @see #getMapItemPoint()
	 * @generated
	 */
	EReference getMapItemPoint_Pos();

	/**
	 * Returns the meta object for class '{@link sitacview.MapLine <em>Map Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Line</em>'.
	 * @see sitacview.MapLine
	 * @generated
	 */
	EClass getMapLine();

	/**
	 * Returns the meta object for the containment reference list '{@link sitacview.MapLine#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see sitacview.MapLine#getPoints()
	 * @see #getMapLine()
	 * @generated
	 */
	EReference getMapLine_Points();

	/**
	 * Returns the meta object for class '{@link sitacview.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see sitacview.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the reference list '{@link sitacview.Library#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see sitacview.Library#getItems()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Items();

	/**
	 * Returns the meta object for class '{@link sitacview.ToolBox <em>Tool Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Box</em>'.
	 * @see sitacview.ToolBox
	 * @generated
	 */
	EClass getToolBox();

	/**
	 * Returns the meta object for class '{@link sitacview.MapItem <em>Map Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Item</em>'.
	 * @see sitacview.MapItem
	 * @generated
	 */
	EClass getMapItem();

	/**
	 * Returns the meta object for class '{@link sitacview.MapZone <em>Map Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Zone</em>'.
	 * @see sitacview.MapZone
	 * @generated
	 */
	EClass getMapZone();

	/**
	 * Returns the meta object for the containment reference list '{@link sitacview.MapZone#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see sitacview.MapZone#getPoints()
	 * @see #getMapZone()
	 * @generated
	 */
	EReference getMapZone_Points();

	/**
	 * Returns the meta object for class '{@link sitacview.MapPoint <em>Map Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Point</em>'.
	 * @see sitacview.MapPoint
	 * @generated
	 */
	EClass getMapPoint();

	/**
	 * Returns the meta object for the attribute '{@link sitacview.MapPoint#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see sitacview.MapPoint#getLat()
	 * @see #getMapPoint()
	 * @generated
	 */
	EAttribute getMapPoint_Lat();

	/**
	 * Returns the meta object for the attribute '{@link sitacview.MapPoint#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see sitacview.MapPoint#getLong()
	 * @see #getMapPoint()
	 * @generated
	 */
	EAttribute getMapPoint_Long();

	/**
	 * Returns the meta object for class '{@link sitacview.Selectable <em>Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selectable</em>'.
	 * @see sitacview.Selectable
	 * @generated
	 */
	EClass getSelectable();

	/**
	 * Returns the meta object for the attribute '{@link sitacview.Selectable#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see sitacview.Selectable#isSelected()
	 * @see #getSelectable()
	 * @generated
	 */
	EAttribute getSelectable_Selected();

	/**
	 * Returns the meta object for class '{@link sitacview.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see sitacview.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for class '{@link sitacview.PropertyEditor <em>Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Editor</em>'.
	 * @see sitacview.PropertyEditor
	 * @generated
	 */
	EClass getPropertyEditor();

	/**
	 * Returns the meta object for the reference '{@link sitacview.PropertyEditor#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see sitacview.PropertyEditor#getElement()
	 * @see #getPropertyEditor()
	 * @generated
	 */
	EReference getPropertyEditor_Element();

	/**
	 * Returns the meta object for class '{@link sitacview.Draggable <em>Draggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Draggable</em>'.
	 * @see sitacview.Draggable
	 * @generated
	 */
	EClass getDraggable();

	/**
	 * Returns the meta object for class '{@link sitacview.DragTarget <em>Drag Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drag Target</em>'.
	 * @see sitacview.DragTarget
	 * @generated
	 */
	EClass getDragTarget();

	/**
	 * Returns the meta object for class '{@link sitacview.ChatPanel <em>Chat Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chat Panel</em>'.
	 * @see sitacview.ChatPanel
	 * @generated
	 */
	EClass getChatPanel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SitacviewFactory getSitacviewFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sitacview.impl.MoyenClipboardImpl <em>Moyen Clipboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.MoyenClipboardImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getMoyenClipboard()
		 * @generated
		 */
		EClass MOYEN_CLIPBOARD = eINSTANCE.getMoyenClipboard();

		/**
		 * The meta object literal for the '{@link sitacview.impl.MapWidgetImpl <em>Map Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.MapWidgetImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getMapWidget()
		 * @generated
		 */
		EClass MAP_WIDGET = eINSTANCE.getMapWidget();

		/**
		 * The meta object literal for the '<em><b>Actual Zoom Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_WIDGET__ACTUAL_ZOOM_LEVEL = eINSTANCE.getMapWidget_ActualZoomLevel();

		/**
		 * The meta object literal for the '<em><b>Actual Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_WIDGET__ACTUAL_LAT = eINSTANCE.getMapWidget_ActualLat();

		/**
		 * The meta object literal for the '<em><b>Actual Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_WIDGET__ACTUAL_LONG = eINSTANCE.getMapWidget_ActualLong();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_WIDGET__ITEMS = eINSTANCE.getMapWidget_Items();

		/**
		 * The meta object literal for the '{@link sitacview.impl.TabViewImpl <em>Tab View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.TabViewImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getTabView()
		 * @generated
		 */
		EClass TAB_VIEW = eINSTANCE.getTabView();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_VIEW__CHILDS = eINSTANCE.getTabView_Childs();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_VIEW__SELECTED = eINSTANCE.getTabView_Selected();

		/**
		 * The meta object literal for the '{@link sitacview.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.ViewImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '{@link sitacview.impl.TitledViewImpl <em>Titled View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.TitledViewImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getTitledView()
		 * @generated
		 */
		EClass TITLED_VIEW = eINSTANCE.getTitledView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLED_VIEW__NAME = eINSTANCE.getTitledView_Name();

		/**
		 * The meta object literal for the '{@link sitacview.impl.LibToolBoxImpl <em>Lib Tool Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.LibToolBoxImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getLibToolBox()
		 * @generated
		 */
		EClass LIB_TOOL_BOX = eINSTANCE.getLibToolBox();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIB_TOOL_BOX__LIBRARY = eINSTANCE.getLibToolBox_Library();

		/**
		 * The meta object literal for the '{@link sitacview.impl.MapItemPointImpl <em>Map Item Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.MapItemPointImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getMapItemPoint()
		 * @generated
		 */
		EClass MAP_ITEM_POINT = eINSTANCE.getMapItemPoint();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ITEM_POINT__POS = eINSTANCE.getMapItemPoint_Pos();

		/**
		 * The meta object literal for the '{@link sitacview.impl.MapLineImpl <em>Map Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.MapLineImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getMapLine()
		 * @generated
		 */
		EClass MAP_LINE = eINSTANCE.getMapLine();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_LINE__POINTS = eINSTANCE.getMapLine_Points();

		/**
		 * The meta object literal for the '{@link sitacview.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.LibraryImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__ITEMS = eINSTANCE.getLibrary_Items();

		/**
		 * The meta object literal for the '{@link sitacview.impl.ToolBoxImpl <em>Tool Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.ToolBoxImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getToolBox()
		 * @generated
		 */
		EClass TOOL_BOX = eINSTANCE.getToolBox();

		/**
		 * The meta object literal for the '{@link sitacview.impl.MapItemImpl <em>Map Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.MapItemImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getMapItem()
		 * @generated
		 */
		EClass MAP_ITEM = eINSTANCE.getMapItem();

		/**
		 * The meta object literal for the '{@link sitacview.impl.MapZoneImpl <em>Map Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.MapZoneImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getMapZone()
		 * @generated
		 */
		EClass MAP_ZONE = eINSTANCE.getMapZone();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ZONE__POINTS = eINSTANCE.getMapZone_Points();

		/**
		 * The meta object literal for the '{@link sitacview.impl.MapPointImpl <em>Map Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.MapPointImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getMapPoint()
		 * @generated
		 */
		EClass MAP_POINT = eINSTANCE.getMapPoint();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_POINT__LAT = eINSTANCE.getMapPoint_Lat();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_POINT__LONG = eINSTANCE.getMapPoint_Long();

		/**
		 * The meta object literal for the '{@link sitacview.impl.SelectableImpl <em>Selectable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.SelectableImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getSelectable()
		 * @generated
		 */
		EClass SELECTABLE = eINSTANCE.getSelectable();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTABLE__SELECTED = eINSTANCE.getSelectable_Selected();

		/**
		 * The meta object literal for the '{@link sitacview.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.ItemTypeImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '{@link sitacview.impl.PropertyEditorImpl <em>Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.PropertyEditorImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getPropertyEditor()
		 * @generated
		 */
		EClass PROPERTY_EDITOR = eINSTANCE.getPropertyEditor();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_EDITOR__ELEMENT = eINSTANCE.getPropertyEditor_Element();

		/**
		 * The meta object literal for the '{@link sitacview.impl.DraggableImpl <em>Draggable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.DraggableImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getDraggable()
		 * @generated
		 */
		EClass DRAGGABLE = eINSTANCE.getDraggable();

		/**
		 * The meta object literal for the '{@link sitacview.impl.DragTargetImpl <em>Drag Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.DragTargetImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getDragTarget()
		 * @generated
		 */
		EClass DRAG_TARGET = eINSTANCE.getDragTarget();

		/**
		 * The meta object literal for the '{@link sitacview.impl.ChatPanelImpl <em>Chat Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitacview.impl.ChatPanelImpl
		 * @see sitacview.impl.SitacviewPackageImpl#getChatPanel()
		 * @generated
		 */
		EClass CHAT_PANEL = eINSTANCE.getChatPanel();

	}

} //SitacviewPackage
