/*$Id: KermetadocView.java,v 1.4 2008-04-25 10:08:52 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.ui
* File : 	ProblemDetailsView.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Jun, 2009
* Authors : 
*	Didier Vojtisek
* Selection mechanism based on the tutorial http://www.eclipse.org/articles/Article-WorkbenchSelections/article.html
*/
package fr.irisa.triskell.kermeta.ui.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IMarkSelection;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.markers.MarkerItem;

import fr.irisa.triskell.eclipse.resources.EclipseMarkerHelper;


/**
 * This view simply mirrors the current selection in the workbench window.
 * It works for both, element and text selection.
 */
public class ProblemDetailsView extends ViewPart {

	final static public String ID = "fr.irisa.triskell.kermeta.ui.views.problemdetails";
		
	// book used to switch between viewers
	private PageBook pagebook;
	private TableViewer tableviewer;
	private TextViewer textviewer;
	//private TextViewer markerdetailviewer;
	
	/** The Browser widget */
	private boolean isUsingBrowserWidget;
	/** The HTML widget. */
	private Browser markerdetailBrowser;
	/** The text widget. */
	private StyledText markerdetailStyledText;
	
	// the listener we register with the selection service 
	private ISelectionListener listener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart sourcepart, ISelection selection) {
			// we ignore our own selections
			if (sourcepart != ProblemDetailsView.this) {
			    showSelection(sourcepart, selection);
			}
		}
	};
	
	/**
	 * Shows the given selection in this view.
	 */
	public void showSelection(IWorkbenchPart sourcepart, ISelection selection) {
		setContentDescription(sourcepart.getTitle() + " (" + selection.getClass().getName() + ")");
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			if (ss.getFirstElement() instanceof MarkerItem){
				showMarkerDetails((MarkerItem)ss.getFirstElement());
			}
			else
				showItems(ss.toArray());
		}
		if (selection instanceof ITextSelection) {
			//sourcepart.getSite().
			ITextSelection ts  = (ITextSelection) selection;
			IEditorPart editor = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			IFileEditorInput input = (IFileEditorInput) (editor.getEditorInput());
			IFile file = input.getFile();
			
			// find Markers for the given selection
			EList<IMarker> markers = EclipseMarkerHelper.findMarkersForTextSelection(file, ts);
			showMarkersDetails(markers);

		}
		if (selection instanceof IMarkSelection) {
			IMarkSelection ms = (IMarkSelection) selection;
			try {
			    showText(ms.getDocument().get(ms.getOffset(), ms.getLength()));
			} catch (BadLocationException ble) { }
		}
	}
	
	private void showItems(Object[] items) {
		tableviewer.setInput(items);
		pagebook.showPage(tableviewer.getControl());
	}
	
	private void showText(String text) {
		textviewer.setDocument(new Document(text));
		pagebook.showPage(textviewer.getControl());
	}
	
	// used to not setText too often because it tends to emit a bip on the comuter !
	protected String previousText = "";
	private void showMarkersDetails(EList<IMarker> markers) {

		String text = "";
		for(IMarker marker : markers){
		
			try {
				text += "<b>Type</b> = " + marker.getType() + "<br>\n";
			} catch (CoreException e) {
			}
			text += "<b>Resource</b> = "  + marker.getResource()  + "<br>\n";
			try {
				for ( Object key  : marker.getAttributes().keySet()){
					if("message".equals(key)){
						text += "<b>"+key + "</b> = "  + marker.getAttribute(key.toString(), "").replaceAll("\n", "<br>")  + "<br>\n";
					}
					else
						text += "<b>"+key + "</b> = "  + marker.getAttribute(key.toString(), "")  + "<br>\n";
				}
			} catch (CoreException e) {
			}
		}

		if(isUsingBrowserWidget){
			if(!previousText.equals(text))
				markerdetailBrowser.setText(text);			
			pagebook.showPage(markerdetailBrowser);
		}
		else {
			// fall back to the styled text
			markerdetailStyledText.setText(text);
			pagebook.showPage(markerdetailStyledText);
		}
		previousText = text;
	}
	
	private void showMarkerDetails(MarkerItem markeritem) {
		IMarker marker = markeritem.getMarker();
		
		String text = "";
		try {
			text += "<b>Type</b> = " + marker.getType() + "<br>\n";
		} catch (CoreException e) {
		}
		text += "<b>Resource</b> = "  + marker.getResource()  + "<br>\n";
		try {
			for ( Object key  : marker.getAttributes().keySet()){

				text += "<b>"+key + "</b> = "  + marker.getAttribute(key.toString(), "")  + "<br>\n";
			}
		} catch (CoreException e) {
		}
		if(isUsingBrowserWidget){
			markerdetailBrowser.setText(text);		
			pagebook.showPage(markerdetailBrowser);
		}
		else {
			// fall back to the styled text
			markerdetailStyledText.setText(text);
			pagebook.showPage(markerdetailStyledText);
		}
		
		
	}
	
	public void createPartControl(Composite parent) {
		// the PageBook allows simple switching between two viewers
		pagebook = new PageBook(parent, SWT.NONE);
		
		tableviewer = new TableViewer(pagebook, SWT.NONE);
		tableviewer.setLabelProvider(new WorkbenchLabelProvider());
		tableviewer.setContentProvider(new ArrayContentProvider());
		
		// we're cooperative and also provide our selection
		// at least for the tableviewer
		getSite().setSelectionProvider(tableviewer);
		
		textviewer = new TextViewer(pagebook, SWT.H_SCROLL | SWT.V_SCROLL);
		textviewer.setEditable(false);
		
		//markerdetailviewer = new TextViewer(pagebook, SWT.H_SCROLL | SWT.V_SCROLL);
		//markerdetailviewer.setEditable(false);
		
		try {
			markerdetailBrowser= new Browser(pagebook, SWT.NONE);
			isUsingBrowserWidget= true;
			
			
		} catch (SWTError er) {

			/* The Browser widget throws an SWTError if it fails to
			 * instantiate properly. Application code should catch
			 * this SWTError and disable any feature requiring the
			 * Browser widget.
			 * Platform requirements for the SWT Browser widget are available
			 * from the SWT FAQ web site.
			 */

			isUsingBrowserWidget= false;
		}

		if (!isUsingBrowserWidget) {
			markerdetailStyledText= new StyledText(parent, SWT.V_SCROLL | SWT.H_SCROLL);
			markerdetailStyledText.setWordWrap(true);
			markerdetailStyledText.setEditable(false);
		}
		
		
		// add the listener in the selection service
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(listener);
	}

	public void setFocus() {
		pagebook.setFocus();
	}

	public void dispose() {
		// important: We need do unregister our listener when the view is disposed
		getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(listener);
		super.dispose();
	}

}
