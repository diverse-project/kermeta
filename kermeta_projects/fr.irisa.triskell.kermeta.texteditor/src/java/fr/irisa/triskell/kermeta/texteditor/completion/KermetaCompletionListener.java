/* $Id: KermetaCompletionListener.java,v 1.2 2007-06-27 12:36:00 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : KermetaCompletionListener.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 
* Author : ftanguy (ftanguy@irisa.fr)
*/

package fr.irisa.triskell.kermeta.texteditor.completion;

import org.eclipse.jface.text.contentassist.ContentAssistEvent;
import org.eclipse.jface.text.contentassist.ICompletionListener;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

/**
 * This listener is used to set the isCompletion field from EditorCompletion class.
 * 
 * It is usefull to not parsing when the auto completion is processing.
 * 
 * @author ftanguy
 *
 */
public class KermetaCompletionListener implements ICompletionListener {

	private EditorCompletion editorCompletion;
	
	public KermetaCompletionListener(EditorCompletion editorCompletion) {
		this.editorCompletion = editorCompletion;
	}
	
	public void assistSessionEnded(ContentAssistEvent event) {
		editorCompletion.setIsCompleting(false);
	}

	public void assistSessionStarted(ContentAssistEvent event) {
		editorCompletion.setIsCompleting(true);
	}

	public void selectionChanged(ICompletionProposal proposal,
			boolean smartToggle) {
		// TODO Auto-generated method stub

	}

}
