/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sitacview.ChatPanel;
import sitacview.DragTarget;
import sitacview.Draggable;
import sitacview.ItemType;
import sitacview.LibToolBox;
import sitacview.Library;
import sitacview.MapItem;
import sitacview.MapItemPoint;
import sitacview.MapLine;
import sitacview.MapPoint;
import sitacview.MapWidget;
import sitacview.MapZone;
import sitacview.MoyenClipboard;
import sitacview.PropertyEditor;
import sitacview.Selectable;
import sitacview.SitacviewFactory;
import sitacview.SitacviewPackage;
import sitacview.TabView;
import sitacview.TitledView;
import sitacview.ToolBox;
import sitacview.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SitacviewPackageImpl extends EPackageImpl implements SitacviewPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moyenClipboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titledViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libToolBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapItemPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass draggableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dragTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chatPanelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sitacview.SitacviewPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SitacviewPackageImpl() {
		super(eNS_URI, SitacviewFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SitacviewPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SitacviewPackage init() {
		if (isInited) return (SitacviewPackage)EPackage.Registry.INSTANCE.getEPackage(SitacviewPackage.eNS_URI);

		// Obtain or create and register package
		SitacviewPackageImpl theSitacviewPackage = (SitacviewPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SitacviewPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SitacviewPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSitacviewPackage.createPackageContents();

		// Initialize created meta-data
		theSitacviewPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSitacviewPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SitacviewPackage.eNS_URI, theSitacviewPackage);
		return theSitacviewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoyenClipboard() {
		return moyenClipboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapWidget() {
		return mapWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapWidget_ActualZoomLevel() {
		return (EAttribute)mapWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapWidget_ActualLat() {
		return (EAttribute)mapWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapWidget_ActualLong() {
		return (EAttribute)mapWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapWidget_Items() {
		return (EReference)mapWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabView() {
		return tabViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabView_Childs() {
		return (EReference)tabViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabView_Selected() {
		return (EReference)tabViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitledView() {
		return titledViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitledView_Name() {
		return (EAttribute)titledViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibToolBox() {
		return libToolBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibToolBox_Library() {
		return (EReference)libToolBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapItemPoint() {
		return mapItemPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapItemPoint_Pos() {
		return (EReference)mapItemPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapLine() {
		return mapLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLine_Points() {
		return (EReference)mapLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Items() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolBox() {
		return toolBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapItem() {
		return mapItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapZone() {
		return mapZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapZone_Points() {
		return (EReference)mapZoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapPoint() {
		return mapPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapPoint_Lat() {
		return (EAttribute)mapPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapPoint_Long() {
		return (EAttribute)mapPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectable() {
		return selectableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectable_Selected() {
		return (EAttribute)selectableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyEditor() {
		return propertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyEditor_Element() {
		return (EReference)propertyEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDraggable() {
		return draggableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDragTarget() {
		return dragTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChatPanel() {
		return chatPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacviewFactory getSitacviewFactory() {
		return (SitacviewFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		moyenClipboardEClass = createEClass(MOYEN_CLIPBOARD);

		mapWidgetEClass = createEClass(MAP_WIDGET);
		createEAttribute(mapWidgetEClass, MAP_WIDGET__ACTUAL_ZOOM_LEVEL);
		createEAttribute(mapWidgetEClass, MAP_WIDGET__ACTUAL_LAT);
		createEAttribute(mapWidgetEClass, MAP_WIDGET__ACTUAL_LONG);
		createEReference(mapWidgetEClass, MAP_WIDGET__ITEMS);

		tabViewEClass = createEClass(TAB_VIEW);
		createEReference(tabViewEClass, TAB_VIEW__CHILDS);
		createEReference(tabViewEClass, TAB_VIEW__SELECTED);

		viewEClass = createEClass(VIEW);

		titledViewEClass = createEClass(TITLED_VIEW);
		createEAttribute(titledViewEClass, TITLED_VIEW__NAME);

		libToolBoxEClass = createEClass(LIB_TOOL_BOX);
		createEReference(libToolBoxEClass, LIB_TOOL_BOX__LIBRARY);

		mapItemPointEClass = createEClass(MAP_ITEM_POINT);
		createEReference(mapItemPointEClass, MAP_ITEM_POINT__POS);

		mapLineEClass = createEClass(MAP_LINE);
		createEReference(mapLineEClass, MAP_LINE__POINTS);

		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__ITEMS);

		toolBoxEClass = createEClass(TOOL_BOX);

		mapItemEClass = createEClass(MAP_ITEM);

		mapZoneEClass = createEClass(MAP_ZONE);
		createEReference(mapZoneEClass, MAP_ZONE__POINTS);

		mapPointEClass = createEClass(MAP_POINT);
		createEAttribute(mapPointEClass, MAP_POINT__LAT);
		createEAttribute(mapPointEClass, MAP_POINT__LONG);

		selectableEClass = createEClass(SELECTABLE);
		createEAttribute(selectableEClass, SELECTABLE__SELECTED);

		itemTypeEClass = createEClass(ITEM_TYPE);

		propertyEditorEClass = createEClass(PROPERTY_EDITOR);
		createEReference(propertyEditorEClass, PROPERTY_EDITOR__ELEMENT);

		draggableEClass = createEClass(DRAGGABLE);

		dragTargetEClass = createEClass(DRAG_TARGET);

		chatPanelEClass = createEClass(CHAT_PANEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		moyenClipboardEClass.getESuperTypes().add(this.getView());
		mapWidgetEClass.getESuperTypes().add(this.getView());
		mapWidgetEClass.getESuperTypes().add(this.getDragTarget());
		tabViewEClass.getESuperTypes().add(this.getView());
		titledViewEClass.getESuperTypes().add(this.getView());
		libToolBoxEClass.getESuperTypes().add(this.getToolBox());
		mapItemPointEClass.getESuperTypes().add(this.getMapItem());
		mapLineEClass.getESuperTypes().add(this.getMapItem());
		toolBoxEClass.getESuperTypes().add(this.getView());
		mapItemEClass.getESuperTypes().add(this.getSelectable());
		mapZoneEClass.getESuperTypes().add(this.getMapItem());
		itemTypeEClass.getESuperTypes().add(this.getDraggable());
		propertyEditorEClass.getESuperTypes().add(this.getView());
		chatPanelEClass.getESuperTypes().add(this.getView());

		// Initialize classes and features; add operations and parameters
		initEClass(moyenClipboardEClass, MoyenClipboard.class, "MoyenClipboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapWidgetEClass, MapWidget.class, "MapWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapWidget_ActualZoomLevel(), ecorePackage.getEString(), "actualZoomLevel", null, 0, 1, MapWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapWidget_ActualLat(), ecorePackage.getEString(), "actualLat", null, 0, 1, MapWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapWidget_ActualLong(), ecorePackage.getEString(), "actualLong", null, 0, 1, MapWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapWidget_Items(), this.getMapItem(), null, "items", null, 0, -1, MapWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabViewEClass, TabView.class, "TabView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTabView_Childs(), this.getTitledView(), null, "childs", null, 0, -1, TabView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabView_Selected(), this.getTitledView(), null, "selected", null, 0, 1, TabView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(titledViewEClass, TitledView.class, "TitledView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitledView_Name(), ecorePackage.getEString(), "name", null, 0, 1, TitledView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libToolBoxEClass, LibToolBox.class, "LibToolBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibToolBox_Library(), this.getLibrary(), null, "library", null, 0, -1, LibToolBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapItemPointEClass, MapItemPoint.class, "MapItemPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapItemPoint_Pos(), this.getMapPoint(), null, "pos", null, 0, 1, MapItemPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapLineEClass, MapLine.class, "MapLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapLine_Points(), this.getMapPoint(), null, "points", null, 0, -1, MapLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_Items(), this.getItemType(), null, "items", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolBoxEClass, ToolBox.class, "ToolBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapItemEClass, MapItem.class, "MapItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapZoneEClass, MapZone.class, "MapZone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapZone_Points(), this.getMapPoint(), null, "points", null, 0, -1, MapZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapPointEClass, MapPoint.class, "MapPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapPoint_Lat(), ecorePackage.getEString(), "lat", null, 0, 1, MapPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapPoint_Long(), ecorePackage.getEString(), "long", null, 0, 1, MapPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectableEClass, Selectable.class, "Selectable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectable_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, Selectable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEditorEClass, PropertyEditor.class, "PropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyEditor_Element(), this.getSelectable(), null, "element", null, 0, 1, PropertyEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(draggableEClass, Draggable.class, "Draggable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dragTargetEClass, DragTarget.class, "DragTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chatPanelEClass, ChatPanel.class, "ChatPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SitacviewPackageImpl
