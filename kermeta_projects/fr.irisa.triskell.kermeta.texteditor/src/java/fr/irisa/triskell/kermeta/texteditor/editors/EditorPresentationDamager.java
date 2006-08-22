/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.presentation.IPresentationDamager;

/**
 * @author Franck Fleurey
 * @author Zoé Drey
 * @author Cyril Faucher
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 * 
 * @see IPresentationDamager for documentation about this class.
 */
public class EditorPresentationDamager implements IPresentationDamager {

	protected IDocument doc;
	
	public EditorPresentationDamager() {
		super();
	}

	/**
	 * @see org.eclipse.jface.text.presentation.IPresentationDamager#setDocument(org.eclipse.jface.text.IDocument)
	 */
	public void setDocument(IDocument document) {
		doc = document;

	}

	/**
	 * @see org.eclipse.jface.text.presentation.IPresentationDamager#getDamageRegion(org.eclipse.jface.text.ITypedRegion, org.eclipse.jface.text.DocumentEvent, boolean)
	 */
	public IRegion getDamageRegion(ITypedRegion partition, DocumentEvent event, boolean documentPartitioningChanged) {
		if (doc != null) {
			// TODO : this is really unefficient, but it does work :-(
			String document = doc.get();
			int start = event.getOffset();
			
			int stop = start;
			if (event.getText() != null) { // Resolve the Contol-D bug (Bugs item #1154)
				stop += event.getText().length();
			}
			
			while( start > 0) {
				if (start >= document.length() - 2 ) {
					start--;
					continue;
				}
				if (document.charAt(start) == '/' && document.charAt(start + 1)== '*') break;
				start--;
			}
			while( stop < document.length() ) {
				if (stop == 0) {
					stop++;
					continue;
				}
				if ((document.charAt(stop - 1) == '*' && document.charAt(stop)== '/')) break;
				stop ++;
			}
			
			return new Region(start, stop - start);
		}
		else return null;
	}

}
