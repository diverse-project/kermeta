/* $Id: TouchEMFModelView.java,v 1.3 2007-07-30 14:33:16 ftanguy Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : TouchClassView.java
 * License : GPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.views;


import java.awt.Color;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import fr.irisa.triskell.kermeta.touchnavigator.TouchNavigatorPlugin;
import fr.irisa.triskell.kermeta.touchnavigator.graphlayout.EMFModelGLPanel;
import fr.irisa.triskell.utils.BooleanLock;


/**
 * This is a workbench view for the  Class TouchNavigator.
 * It uses the SWT_AWT component to make the link to the touchgraph library
 */

public class TouchEMFModelView extends ViewPart {
	//private TableViewer viewer;
	private Composite composite;
	private java.awt.Frame touchviewer;
	private Shell shell;
	private Action actionBack;
	private Action actionForward;
	private Action actionConfigure;
	private Action actionAbout;
	private Action actionRestartSWTAWT;
	private Action actionOpenModel;
	@SuppressWarnings("unused")
	private Action doubleClickAction;
	
	private EMFModelGLPanel modelGLPanel;

	public static TouchEMFModelView currentView= null;

	/** indicates that the View has been successfully initialized */
	public static BooleanLock readyLock = new BooleanLock(true);
	
	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	/*class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			return new String[] { "One", "Two", "Three" };
		}
	}*/
	/*class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().
					getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}*/
	

    /**
	 * This keeps track of the editing domain that is used to track all changes to the model.
	 */
	protected AdapterFactoryEditingDomain editingDomain;/**
	 * This is the one adapter factory used for providing views of the model.
	 */
	protected ComposedAdapterFactory adapterFactory;
	
	/**
	 * The constructor.
	 */
	public TouchEMFModelView() {
//		 Create an adapter factory that yields item providers.
		//
		List factories = new ArrayList();
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());

		adapterFactory = new ComposedAdapterFactory(factories);

		// Create the command stack that will notify this editor as commands are executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener
			(new CommandStackListener() {
				 public void commandStackChanged(final EventObject event) {
				/*	 getContainer().getDisplay().asyncExec
						 (new Runnable() {
							  public void run() {
								  firePropertyChange(IEditorPart.PROP_DIRTY);

								  // Try to select the affected objects.
								  //
								  Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
								  if (mostRecentCommand != null) {
									  setSelectionToViewer(mostRecentCommand.getAffectedObjects());
								  }
								  if (propertySheetPage != null && !propertySheetPage.getControl().isDisposed()) {
									  propertySheetPage.refresh();
								  }
							  }
						  });*/
				 }
			 });
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap());
		currentView = this;
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		/*viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());
		*/
		readyLock.setValue(false);
		composite = new Composite(parent, SWT.EMBEDDED);
		shell = composite.getShell();
		
		startSWTAWT(5000);
		
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		readyLock.setValue(true);
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				TouchEMFModelView.this.fillContextMenu(manager);
			}
		});
		/*
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
		*/
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		// TODO add configuration page manager.add(actionConfigure);
		manager.add(actionRestartSWTAWT);
		manager.add(new Separator());
		manager.add(actionAbout);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(actionBack);
		manager.add(actionForward);
		manager.add(actionOpenModel);
		// TODO DVK currently no configure manager.add(actionConfigure);
		manager.add(actionAbout);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(actionBack);
		manager.add(actionForward);
		manager.add(actionOpenModel);
		// manager.add(actionConfigure);
		// manager.add(actionAbout);
	}

	private void makeActions() {
		actionBack = new Action() {
			public void run() {
				modelGLPanel.goBack();
				//showMessage("Back button not implemented yet");
			}
		};
		actionBack.setText("Back");
		actionBack.setToolTipText("Go back to the previous node in history");
		actionBack.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_BACK));
		actionForward = new Action() {
			public void run() {
				modelGLPanel.goForward();
				//showMessage("Forward button not implemented yet");
			}
		};
		actionForward.setText("Forward");
		actionForward.setToolTipText("Go forward to the next node in history");
		actionForward.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD));
		
		/* DVK no configura action for a start 
		actionConfigure = new ConfigureAction(modelGLPanel);
		actionConfigure.setText("Configure Class TouchNavigator");
		actionConfigure.setToolTipText("Configure the various options of Kermeta Class TouchNavigator");
		actionConfigure.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		*/
		
		actionOpenModel = new Action(){
			public void run() {
				URI resourceURI = URI.createPlatformResourceURI("fr.irisa.triskell.kermeta.samples/KM.km");;
				Exception exception = null;
				Resource resource = null;
				try {
					// Load the resource through the editing domain.
					//
					resource = editingDomain.getResourceSet().getResource(resourceURI, true);
				}
				catch (Exception e) {
					exception = e;
					resource = editingDomain.getResourceSet().getResource(resourceURI, false);
				}
				modelGLPanel.loadGraph(editingDomain.getResourceSet(),resource);
				//showMessage("Forward button not implemented yet");
			}
		};
		actionOpenModel.setText("Open");
		actionOpenModel.setToolTipText("Open a Model file");
		actionOpenModel.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJ_FILE));
		
		actionAbout = new Action() {
			public void run() {
				showMessage("EMF Model TouchNavigator.\nBased on TouchGraph.\nThis is an alpha version, feel free to comment and suggest improvments in Kermeta bug tracker or on the mailing list.");
			}
		};
		actionAbout.setText("About");
		actionAbout.setToolTipText("About EMF Model TouchNavigator");
		actionAbout.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				/* ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());*/
				showMessage("Double-click detected");
			}
		};
		actionRestartSWTAWT = new Action(){
			public void run(){
				startSWTAWT(500);
			}
		};

		actionRestartSWTAWT.setText("Restart SWT AWT");
		actionRestartSWTAWT.setToolTipText("refresh the Eclipse SWT AWT container");
		actionRestartSWTAWT.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
	}

	private void hookDoubleClickAction() {
		/*viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});*/
		//showMessage("hookDoubleClickAction: Double-click detected");
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			shell,
			"EMF Model TouchNavigator View",
			message);
	}

	
	public void startSWTAWT(int delay){
		touchviewer = SWT_AWT.new_Frame(composite);	

		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {}
		readyLock.setValue(false);
		
		java.awt.Color c = new Color(composite.getBackground().getRed(), composite.getBackground().getGreen(), composite.getBackground().getBlue());
		modelGLPanel = new EMFModelGLPanel(c);
		touchviewer.add(modelGLPanel);
		readyLock.setValue(true);
		
	}
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}
	
	public void loadFile(String resourceLocation){
		URI resourceURI = URI.createPlatformResourceURI(resourceLocation);;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		}
		catch (Exception e) {
			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}
		TouchNavigatorPlugin.internalLog.debug("loadFile " + resourceLocation);
		
		modelGLPanel.loadGraph(editingDomain.getResourceSet(),resource);
	}
	
	public void selectFirstRootElement(){
		modelGLPanel.selectFirstRootElement();
	}
	
}