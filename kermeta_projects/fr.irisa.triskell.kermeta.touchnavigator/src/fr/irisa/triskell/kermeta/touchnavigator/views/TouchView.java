package fr.irisa.triskell.kermeta.touchnavigator.views;


import java.awt.Color;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;

import com.touchgraph.graphlayout.GLPanel;

import fr.irisa.triskell.kermeta.touchnavigator.actions.ConfigureAction;
import fr.irisa.triskell.kermeta.touchnavigator.graphlayout.KermetaGLPanel;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class TouchView extends ViewPart {
	//private TableViewer viewer;
	private java.awt.Frame touchviewer;
	private Shell shell;
	private Action actionBack;
	private Action actionForward;
	private Action actionConfigure;
	private Action actionAbout;
	private Action doubleClickAction;
	
	private KermetaGLPanel kGLPanel;

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			return new String[] { "One", "Two", "Three" };
		}
	}
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
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
	}
	
	/**
	 * The constructor.
	 */
	public TouchView() {
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
		Composite composite = new Composite(parent, SWT.EMBEDDED);
		shell = composite.getShell();
		touchviewer = SWT_AWT.new_Frame(composite);		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.awt.Color c = new Color(parent.getBackground().getRed(), parent.getBackground().getGreen(), parent.getBackground().getBlue());
		kGLPanel = new KermetaGLPanel(c);
		touchviewer.add(kGLPanel);
		
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				TouchView.this.fillContextMenu(manager);
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
		manager.add(actionConfigure);
		manager.add(new Separator());
		manager.add(actionAbout);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(actionBack);
		manager.add(actionForward);
		manager.add(actionConfigure);
		manager.add(actionAbout);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(actionBack);
		manager.add(actionForward);
		// manager.add(actionConfigure);
		// manager.add(actionAbout);
	}

	private void makeActions() {
		actionBack = new Action() {
			public void run() {
				kGLPanel.goBack();
				//showMessage("Back button not implemented yet");
			}
		};
		actionBack.setText("Back");
		actionBack.setToolTipText("Go back to the previous node in history");
		actionBack.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_BACK));
		actionForward = new Action() {
			public void run() {
				kGLPanel.goForward();
				showMessage("Back button not implemented yet");
			}
		};
		actionForward.setText("Forward");
		actionForward.setToolTipText("Go forward to the next node in history");
		actionForward.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD));
		
		actionConfigure = new ConfigureAction(kGLPanel);
		actionConfigure.setText("Configure Class TouchNavigator");
		actionConfigure.setToolTipText("Configure the various options of Kermeta Class TouchNavigator");
		actionConfigure.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		actionAbout = new Action() {
			public void run() {
				showMessage("Kermeta Class TouchNavigator.\nBased on TouchGraph.");
			}
		};
		actionAbout.setText("About");
		actionAbout.setToolTipText("About Kermeta Class TouchNavigator");
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
			"TouchNavigator View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}
}