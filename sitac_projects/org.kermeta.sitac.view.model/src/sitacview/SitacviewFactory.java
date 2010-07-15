/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sitacview.SitacviewPackage
 * @generated
 */
public interface SitacviewFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SitacviewFactory eINSTANCE = sitacview.impl.SitacviewFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Moyen Clipboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moyen Clipboard</em>'.
	 * @generated
	 */
	MoyenClipboard createMoyenClipboard();

	/**
	 * Returns a new object of class '<em>Map Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Widget</em>'.
	 * @generated
	 */
	MapWidget createMapWidget();

	/**
	 * Returns a new object of class '<em>Tab View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab View</em>'.
	 * @generated
	 */
	TabView createTabView();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Titled View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titled View</em>'.
	 * @generated
	 */
	TitledView createTitledView();

	/**
	 * Returns a new object of class '<em>Lib Tool Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lib Tool Box</em>'.
	 * @generated
	 */
	LibToolBox createLibToolBox();

	/**
	 * Returns a new object of class '<em>Map Item Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Item Point</em>'.
	 * @generated
	 */
	MapItemPoint createMapItemPoint();

	/**
	 * Returns a new object of class '<em>Map Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Line</em>'.
	 * @generated
	 */
	MapLine createMapLine();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Tool Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Box</em>'.
	 * @generated
	 */
	ToolBox createToolBox();

	/**
	 * Returns a new object of class '<em>Map Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Item</em>'.
	 * @generated
	 */
	MapItem createMapItem();

	/**
	 * Returns a new object of class '<em>Map Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Zone</em>'.
	 * @generated
	 */
	MapZone createMapZone();

	/**
	 * Returns a new object of class '<em>Map Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Point</em>'.
	 * @generated
	 */
	MapPoint createMapPoint();

	/**
	 * Returns a new object of class '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type</em>'.
	 * @generated
	 */
	ItemType createItemType();

	/**
	 * Returns a new object of class '<em>Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Editor</em>'.
	 * @generated
	 */
	PropertyEditor createPropertyEditor();

	/**
	 * Returns a new object of class '<em>Draggable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Draggable</em>'.
	 * @generated
	 */
	Draggable createDraggable();

	/**
	 * Returns a new object of class '<em>Drag Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drag Target</em>'.
	 * @generated
	 */
	DragTarget createDragTarget();

	/**
	 * Returns a new object of class '<em>Chat Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chat Panel</em>'.
	 * @generated
	 */
	ChatPanel createChatPanel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SitacviewPackage getSitacviewPackage();

} //SitacviewFactory
