/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sitacview.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SitacviewFactoryImpl extends EFactoryImpl implements SitacviewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SitacviewFactory init() {
		try {
			SitacviewFactory theSitacviewFactory = (SitacviewFactory)EPackage.Registry.INSTANCE.getEFactory("http://sitacview/1.0"); 
			if (theSitacviewFactory != null) {
				return theSitacviewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SitacviewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacviewFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SitacviewPackage.MOYEN_CLIPBOARD: return createMoyenClipboard();
			case SitacviewPackage.MAP_WIDGET: return createMapWidget();
			case SitacviewPackage.TAB_VIEW: return createTabView();
			case SitacviewPackage.VIEW: return createView();
			case SitacviewPackage.TITLED_VIEW: return createTitledView();
			case SitacviewPackage.LIB_TOOL_BOX: return createLibToolBox();
			case SitacviewPackage.MAP_ITEM_POINT: return createMapItemPoint();
			case SitacviewPackage.MAP_LINE: return createMapLine();
			case SitacviewPackage.LIBRARY: return createLibrary();
			case SitacviewPackage.TOOL_BOX: return createToolBox();
			case SitacviewPackage.MAP_ITEM: return createMapItem();
			case SitacviewPackage.MAP_ZONE: return createMapZone();
			case SitacviewPackage.MAP_POINT: return createMapPoint();
			case SitacviewPackage.ITEM_TYPE: return createItemType();
			case SitacviewPackage.PROPERTY_EDITOR: return createPropertyEditor();
			case SitacviewPackage.DRAGGABLE: return createDraggable();
			case SitacviewPackage.DRAG_TARGET: return createDragTarget();
			case SitacviewPackage.CHAT_PANEL: return createChatPanel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoyenClipboard createMoyenClipboard() {
		MoyenClipboardImpl moyenClipboard = new MoyenClipboardImpl();
		return moyenClipboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapWidget createMapWidget() {
		MapWidgetImpl mapWidget = new MapWidgetImpl();
		return mapWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabView createTabView() {
		TabViewImpl tabView = new TabViewImpl();
		return tabView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitledView createTitledView() {
		TitledViewImpl titledView = new TitledViewImpl();
		return titledView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibToolBox createLibToolBox() {
		LibToolBoxImpl libToolBox = new LibToolBoxImpl();
		return libToolBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapItemPoint createMapItemPoint() {
		MapItemPointImpl mapItemPoint = new MapItemPointImpl();
		return mapItemPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapLine createMapLine() {
		MapLineImpl mapLine = new MapLineImpl();
		return mapLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolBox createToolBox() {
		ToolBoxImpl toolBox = new ToolBoxImpl();
		return toolBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapItem createMapItem() {
		MapItemImpl mapItem = new MapItemImpl();
		return mapItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapZone createMapZone() {
		MapZoneImpl mapZone = new MapZoneImpl();
		return mapZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapPoint createMapPoint() {
		MapPointImpl mapPoint = new MapPointImpl();
		return mapPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEditor createPropertyEditor() {
		PropertyEditorImpl propertyEditor = new PropertyEditorImpl();
		return propertyEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Draggable createDraggable() {
		DraggableImpl draggable = new DraggableImpl();
		return draggable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DragTarget createDragTarget() {
		DragTargetImpl dragTarget = new DragTargetImpl();
		return dragTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChatPanel createChatPanel() {
		ChatPanelImpl chatPanel = new ChatPanelImpl();
		return chatPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacviewPackage getSitacviewPackage() {
		return (SitacviewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SitacviewPackage getPackage() {
		return SitacviewPackage.eINSTANCE;
	}

} //SitacviewFactoryImpl
