/* $Id$
 * Project    : org.kermeta.language.texteditor.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 *           Francois Fouquet 
 */
package org.kermeta.language.texteditor.eclipse;

import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

public class KermetaEditorConfiguration extends TextSourceViewerConfiguration {

	private org.kermeta.language.texteditor.eclipse.KermetaColorManager colorManager;
	private org.kermeta.language.texteditor.eclipse.KermetaEditor theEditor;
	
	// Create a new editor configuration.
	//
	// @param editor
	// @param colorManager
	///
	public KermetaEditorConfiguration(org.kermeta.language.texteditor.eclipse.KermetaEditor editor, org.kermeta.language.texteditor.eclipse.KermetaColorManager colorManager) {
		this.theEditor = editor;
		this.colorManager = colorManager;
	}
	
	public org.eclipse.jface.text.presentation.IPresentationReconciler getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		org.eclipse.jface.text.presentation.PresentationReconciler reconciler = new org.eclipse.jface.text.presentation.PresentationReconciler();
		
		
		ScannerBasedDamagerRepairer repairer = new ScannerBasedDamagerRepairer(getScanner());
		reconciler.setDamager(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		return reconciler;
	}
	
	// @param fileExtension
	// @return
	protected org.kermeta.language.texteditor.eclipse.KermetaTokenScanner getScanner() {
		return new org.kermeta.language.texteditor.eclipse.KermetaScanner(colorManager,theEditor);
	}
	
	
}
