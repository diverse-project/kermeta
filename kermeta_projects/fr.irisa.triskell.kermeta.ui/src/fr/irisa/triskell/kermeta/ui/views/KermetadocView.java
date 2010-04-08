/*$Id: KermetadocView.java,v 1.4 2008-04-25 10:08:52 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Sep, 2007
* Authors : 
*	Didier Vojtisek
*/
package fr.irisa.triskell.kermeta.ui.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.kermeta.io.KermetaUnit;
import org.kermeta.texteditor.KermetaEditorEventListener;
import org.kermeta.texteditor.KermetaTextEditor;

import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.ui.textPresentation.KMTDocHTMLPrettyPrinter;
import fr.irisa.triskell.kermeta.ui.textPresentation.PrintableFinder;

/**
 * View which shows Javadoc for a given Java element.
 *
 * FIXME: As of 3.0 selectAll() and getSelection() is not working
 *			see https://bugs.eclipse.org/bugs/show_bug.cgi?id=63022
 *
 * @since 3.0
 */
public class KermetadocView extends ViewPart implements KermetaEditorEventListener {

	final static public String ID = "fr.irisa.triskell.kermeta.ui.views.kermetadoc";
	
	/** The Browser widget */
	private boolean fIsUsingBrowserWidget;
	/** The HTML widget. */
	private Browser fBrowser;
	/** The text widget. */
	private StyledText fText;
	
	
	
	private Shell shell;
	
	private Action actionAbout;
		

	private Object lastValidUpdate = null;
	
	private TexteditorPlugin textEditorPlugin = null;


	

	private String currentHTMLDocumentation =  "";
		

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
		
		internalCreatePartControl(parent);
		
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

		registerToTextEditor();
	}
	
	protected void internalCreatePartControl(Composite parent) {
		try {
			fBrowser= new Browser(parent, SWT.NONE);
			fIsUsingBrowserWidget= true;
			
			
		} catch (SWTError er) {

			/* The Browser widget throws an SWTError if it fails to
			 * instantiate properly. Application code should catch
			 * this SWTError and disable any feature requiring the
			 * Browser widget.
			 * Platform requirements for the SWT Browser widget are available
			 * from the SWT FAQ web site.
			 */

		/*	IPreferenceStore store= JavaPlugin.getDefault().getPreferenceStore();
			boolean doNotWarn= store.getBoolean(DO_NOT_WARN_PREFERENCE_KEY);
			if (WARNING_DIALOG_ENABLED && !doNotWarn) {
				String title= "KermetadocView_error_noBrowser_title";
				String message= "KermetadocView_error_noBrowser_message";
				String toggleMessage= "KermetadocView_error_noBrowser_doNotWarn";
				MessageDialogWithToggle dialog= MessageDialogWithToggle.openError(parent.getShell(), title, message, toggleMessage, false, null, null); 
				if (dialog.getReturnCode() == Window.OK)
					store.setValue(DO_NOT_WARN_PREFERENCE_KEY, dialog.getToggleState());
			}*/

			fIsUsingBrowserWidget= false;
		}

		if (!fIsUsingBrowserWidget) {
			fText= new StyledText(parent, SWT.V_SCROLL | SWT.H_SCROLL);
			fText.setEditable(false);
			
		}
		inititalizeColors();
	}
	protected Control getControl() {
		if (fIsUsingBrowserWidget)
			return fBrowser;
		else
			return fText;
	}
	
	private void inititalizeColors() {
		if (getSite().getShell().isDisposed())
			return;

		Display display= getSite().getShell().getDisplay();
		if (display == null || display.isDisposed())
			return;

		getControl().setForeground(display.getSystemColor(SWT.COLOR_INFO_FOREGROUND));
		
		ColorRegistry registry= JFaceResources.getColorRegistry();
		// same color as Javadoc
		RGB fBackgroundColorRGB= registry.getRGB("org.eclipse.jdt.ui.JavadocView.backgroundColor");
		Color bgColor;
		if (fBackgroundColorRGB == null) {
			bgColor= display.getSystemColor(SWT.COLOR_INFO_BACKGROUND);
		} else {
			bgColor= new Color(display, fBackgroundColorRGB);
		}
		
		getControl().setBackground(bgColor);
//		getControl().update();
	}
	
	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				KermetadocView.this.fillContextMenu(manager);
			}
		});
		/*
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
		*/
	}
	private void hookDoubleClickAction() {
		/*viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});*/
		//showMessage("hookDoubleClickAction: Double-click detected");
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		//manager.add(actionConfigure);
		//manager.add(actionRestartSWTAWT);
		//manager.add(new Separator());
		manager.add(actionAbout);
	}

	private void fillContextMenu(IMenuManager manager) {
		//manager.add(actionBack);
		//manager.add(actionForward);
		//manager.add(actionConfigure);
		manager.add(actionAbout);
		// Other plug-ins can contribute there actions here
		//manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		//manager.add(actionBack);
		//manager.add(actionForward);
		// manager.add(actionConfigure);
		// manager.add(actionAbout);
	}

	private void makeActions() {
		
		actionAbout = new Action() {
			public void run() {
				showMessage("Kermetadoc presents a simplified view of the documentation associated to your Kermeta model elements");
			}
		};
		actionAbout.setText("About");
		actionAbout.setToolTipText("About Kermetadoc view");
		actionAbout.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));		
		
	}

	/* The real work of doing the doc
	 * 
	 */
	public void updateHTMLDocumentationFrom(KermetaUnit rootUnit, Object n) {
		
		Boolean isValidUpdate = false;
		String newHTMLDocumentation = "";
		if(n != null && n != lastValidUpdate)
			if (n instanceof EObject){	
				PrintableFinder finder = new PrintableFinder();
				EObject printableObject = (EObject)finder.accept((EObject)n);
				if(printableObject != null){					
					newHTMLDocumentation = (String)new KMTDocHTMLPrettyPrinter(rootUnit).getHTMLDoc(printableObject);
				
					if(newHTMLDocumentation != null) // maybe the getHTMLDoc doesn't work for this kind of object
						isValidUpdate = true;
				}
			}
		if(isValidUpdate){
			currentHTMLDocumentation = newHTMLDocumentation;
			lastValidUpdate = n;
			refresh();
		}
	}
	
	
	private void showMessage(String message) {
		MessageDialog.openInformation(
			shell,
			"Kermetadoc View",
			message);
	}
	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}
	
	/**
	 * @see KermetaEditorEventListener#textHoverCalled()
	 */
	public void textHoverCalled(fr.irisa.triskell.kermeta.language.structure.Object fobj) {
		updateHTMLDocumentationFrom(KermetaUnitHelper.getKermetaUnitFromObject(fobj),fobj);
	}
	
	/**
	 * @see KermetaEditorEventListener#outlineSelectionChanged()
	 */
	public void outlineSelectionChanged(fr.irisa.triskell.kermeta.language.structure.Object fobj) {
		updateHTMLDocumentationFrom(KermetaUnitHelper.getKermetaUnitFromObject(fobj),fobj);
	}
	/** 
	 * Action when a kermetaEditor selection was changed
	 * @see org.kermeta.texteditor.KermetaEditorEventListener#selectionChanged()
	 */
	public void selectionChanged() {
		
		
	}
	/** 
	 * Action when a kermetaEditor unit was changed
	 * @see fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener#unitChanged()
	 */
	public void unitGotFocus(KermetaTextEditor editor) {
	}
	
	/**
	 * Refreshes the view.
	 */
	private void refresh() {
		registerToTextEditor();
		
		String docHtml= currentHTMLDocumentation;

		if (fIsUsingBrowserWidget) {
			// make sure to use the UI Thread
			Display.getDefault().asyncExec(new Runnable() {
			      public void run() {
						fBrowser.setText(currentHTMLDocumentation);
			      }
			    });
		} else {
			fText.setText(docHtml);
			
		}
	}
	
	protected void internalDispose(){
		textEditorPlugin.unregisterListener(this);
	}
	
	private void registerToTextEditor() {
		if(textEditorPlugin == null) {
			textEditorPlugin = TexteditorPlugin.getDefault();
			textEditorPlugin.registerListener(this);
		}
		
	}

	public void contentAssistSelectionChanged(fr.irisa.triskell.kermeta.language.structure.Object o) {
		updateHTMLDocumentationFrom(KermetaUnitHelper.getKermetaUnitFromObject(o),o);
	}
}
