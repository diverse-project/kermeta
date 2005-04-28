/*
 * Created on 20 janv. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.ResourceBundle;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.texteditor.outline.KermetaOutline;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class Editor extends TextEditor {

	
	protected KermetaUnit mcunit; 
	protected KermetaOutline outline;
	
	/**
	 * Constructor
	 */
	public Editor() {
		super();
		setSourceViewerConfiguration(new EditorConfiguration(this));
	}
	
	
    public IFile getFile()
    {
        if(getEditorInput() instanceof IFileEditorInput)
        {
            IFileEditorInput input = (IFileEditorInput)getEditorInput();
            return input.getFile();
        } else
        {
            return null;
        }
    }
    
    public Object getAdapter(Class type) {
    	   if (type == IContentOutlinePage.class) {
    	     // Installing Outline
    	     if (outline == null) outline = new KermetaOutline(this);
    	       return outline;                       
    	   }
    	   return super.getAdapter(type);
    	  }
	
	/**********************************
	 * 			ACTIONS
	 **********************************/
	
	private static final String RESOURCE_BUNDLE= "org.eclipse.ui.editors.text.TextEditorMessages";
	private static ResourceBundle fgResourceBundle= ResourceBundle.getBundle(RESOURCE_BUNDLE);

	protected void createActions() {
		super.createActions();
			
		IAction a= new TextOperationAction(fgResourceBundle, "ContentAssistProposal.", this, ISourceViewer.CONTENTASSIST_PROPOSALS); 
		a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
		setAction("ContentAssistProposal", a); 
		
		a= new TextOperationAction(fgResourceBundle, "ContentAssistTip.", this, ISourceViewer.CONTENTASSIST_CONTEXT_INFORMATION); 
		a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_CONTEXT_INFORMATION);
		setAction("ContentAssistTip", a); 
	}

	
	/**
	 * @see org.eclipse.ui.texteditor.AbstractDecoratedTextEditor#initializeEditor()
	 *
	protected void doSetInput(IEditorInput input) throws CoreException {
		
		super.doSetInput(input);
		try {
			System.out.println(getEditorInput().getName());
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	/**
	 * @return Returns the mcunit.
	 */
	public KermetaUnit getMcunit() {
		return mcunit;
	}
	/**
	 * @param mcunit The mcunit to set.
	 */
	public void setMcunit(KermetaUnit mcunit) {
		this.mcunit = mcunit;
		if (outline != null)
			outline.update();
	}
}
