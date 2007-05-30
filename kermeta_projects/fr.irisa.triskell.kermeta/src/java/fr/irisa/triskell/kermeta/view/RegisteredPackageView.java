/*$Id: RegisteredPackageView.java,v 1.3 2007-05-30 07:26:21 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta
* File : 	RegisteredPackageView.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 01 jan. 07
* Authors : cfaucher
*/

package fr.irisa.triskell.kermeta.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableTreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.KermetaConstants;
import fr.irisa.triskell.kermeta.KermetaIcons;
import fr.irisa.triskell.kermeta.popup.actions.EcoreUnregisterPackageAction;


public class RegisteredPackageView extends ViewPart {

	private TableTreeViewer viewer;

	// structure of the TableViewer
	//private TableColumn typeColumn; // for the image
	private TableColumn uriColumn; // for the uri
	private TableColumn packageNameColumn; // for the package name
	private TableColumn originColumn; // for the origin of the package
	
	private EcoreUnregisterPackageAction unregisterPackageAction;
	
	public static final String ID = "fr.irisa.triskell.kermeta.viewregisteredpackages";


	/** The content provider class is responsible for providing
	 * objects to the view. It can wrap existing objects in
	 * adapters or simply return objects as-is. These objects may
	 * be sensitive to the current input of the view, or ignore it
	 * and always show the same content (Task List, for
	 * example).
	 */
	public class ViewContentProvider implements ITreeContentProvider
	{
		
		public void inputChanged( Viewer v, Object oldInput, Object newInput) {
			
		}

		public void dispose() {
		}

		/**
		 * returns the list of children of this element
		 */
		public Object[] getChildren(Object arg0) {
			return EMFRegistryHelper.getRegisteredChildren((String)arg0).toArray();			
		}
		
		
		/**
		 * tells if the given element has children 
		 */
		public boolean hasChildren(Object arg0) {
			Object obj = Registry.INSTANCE.get( arg0 );
			// a good guess about if we have children or not is if we have subpackages
			// a better evaluation should get only valid children , ie. registered children as in getChildren method
			if(obj instanceof EPackage) {
				if(((EPackage) obj).getESubpackages().size() != 0) return true;
			}
			return false;
		}
		public Object getParent(Object arg0) {
			Object result = null;
			Object obj = Registry.INSTANCE.get( arg0 );
			if(obj instanceof EPackage) {
				EPackage p = (EPackage) obj;
				if(p.eContainer() != null){
					String nsURI = ((EPackage)p.eContainer()).getNsURI();
					if(EMFRegistryHelper.isRegistered(nsURI)){
						result = nsURI;
					}
				}
			}
			return result;
		}
		/**
		 * element for the Table from the registered instances
		 */
		public Object[] getElements(Object parent) {			
			ArrayList<String> table = new ArrayList<String>(); 
			Set kSet = Registry.INSTANCE.keySet();
			Iterator it = kSet.iterator();
			while(it.hasNext()) {
				String uri = (String) it.next();
				Object obj = Registry.INSTANCE.get( uri );
				if(obj instanceof EPackage) {
					//EPackage p = (EPackage) obj;	
					// add only root packages
					if(getParent(uri)== null)
						table.add(uri);
				}
			}
			return table.toArray();
		}


	}
	/**
	 * The label provider class is responsible for translating
	 * objects into text and images that are displayed
	 * in the various cells of the table.
	 */
	class ViewLabelProvider extends LabelProvider  implements ITableLabelProvider
	{
		public String getColumnText(Object obj, int index) {
			switch (index) {
			case 0: // URI column				
				return getText(obj);

			case 1: // Package name column
				if(obj != null){
					return ((EPackage)Registry.INSTANCE.get(obj)).getName();
				}
				return "";
			case 2: // origin column
				if(obj != null){
					if(EMFRegistryHelper.isDynamicallyRegistered((String)obj)){ // if this is exactly an EPackage then this comes from a files, otherwise it comes from generated java
						EPackage pack = (EPackage)Registry.INSTANCE.get(obj);
						return "" + getText(pack.eResource().getURI());
					}
					else return "generated java in plugin";
				}
				return "";
			default:
				return "";

			}
		}

		public Image getColumnImage(Object obj, int index) {
			if ((index == 2)){				
				return getImage(Registry.INSTANCE.get(obj));

			}
			return null;
		}

		public Image getImage(Object obj) {
			if(obj.getClass() == EPackageImpl.class){ // if this is exactly an EPackage then this comes from a files, otherwise it comes from generated java
				return KermetaIcons.get(KermetaConstants.IMG_ECORE_FILE);
				/*return PlatformUI.getWorkbench().getSharedImages()
				.getImage(org.eclipse.ui.ISharedImages.IMG_OBJ_FILE);*/
			}
			else return KermetaIcons.get(KermetaConstants.IMG_GENERATED_PACKAGE); 
				//return PlatformUI.getWorkbench().getSharedImages()
			//.getImage(org.eclipse.ui.ISharedImages.IMG_OBJ_ELEMENT);
			// org.eclipse.ui.ISharedImages
			//org.eclipse.jdt.ui.ISharedImages.;
		}
	}

	/**
	 * 
	 */
	public RegisteredPackageView() {
		super();
		setContentDescription("Registered packages:");
	}

	@Override
	public void createPartControl(Composite parent) {

		viewer = new TableTreeViewer(
				parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		
		// set up the table
		final Table table = viewer.getTableTree().getTable();

		
		uriColumn = new TableColumn(table, SWT.LEFT);
		uriColumn.setText("Registered URI");
		uriColumn.setWidth(300);

		packageNameColumn = new TableColumn(table, SWT.LEFT);
		packageNameColumn.setText("Package name");
		packageNameColumn.setWidth(120);

		originColumn = new TableColumn(table, SWT.LEFT);
		originColumn.setText("Origin");
		originColumn.setWidth(350);
		
		table.setHeaderVisible(true);
		table.setLinesVisible(false);		

		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setInput(getViewSite());
		

	    // Expand everything
		viewer.expandAll();
	    
		createActions();
		createContextMenu();
	}

	/**
	 * used by createPartControl
	 * Create the actions
	 *
	 */
	private void createActions() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		ISharedImages platformImages = workbench.getSharedImages();
		unregisterPackageAction = new EcoreUnregisterPackageAction(this, "Unregister");
		unregisterPackageAction.setImageDescriptor(platformImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		unregisterPackageAction.setDisabledImageDescriptor(platformImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
		unregisterPackageAction.setToolTipText("unregister the selected packages");
	}
	/**
	 * used by createPartControl
	 * Create the contextMenu
	 *
	 */
	private void createContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager m) {
				RegisteredPackageView.this.fillContextMenu(m);
			}
		});
		Menu menu =
			menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	/**
	 * used to create the context menu
	 * it is able to filter the actions corresponding to the selection ...
	 *
	 */
	private void fillContextMenu(IMenuManager menuMgr) {
		// filter only dynamically registered packages
		unregisterPackageAction.setEnabled(isSelectionDynamicallyRegistered((IStructuredSelection)viewer.getSelection()));
		menuMgr.add(unregisterPackageAction);
		menuMgr.add(new Separator(
				IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	/**
	 * get the selection
	 * @return a table of the URI selected
	 */
	public String[] getSelectedPackages() {
		IStructuredSelection selection =
			(IStructuredSelection) viewer.getSelection();
		String[] items = new String[selection.size()];
		Iterator iter = selection.iterator();
		int index = 0;
		while (iter.hasNext())
			items[index++] = (String) iter.next();
		return items;
	}
	
	@Override
	public void setFocus() {		
		refresh();
	}


	/**
	 * rebuild the view, also refresh its content from the ContentProvider
	 *
	 */
	public void refresh(){		
		viewer.refresh();
	}
	
		private boolean isSelectionDynamicallyRegistered(IStructuredSelection selection){
		boolean result = true;
		if(selection.isEmpty()) return false;
		Iterator iter = selection.iterator();
		while (iter.hasNext()){
			String uri = (String) iter.next();
			if(!EMFRegistryHelper.isDynamicallyRegistered(uri)){
				return false;
			}
		}
		return result;
	}
}
