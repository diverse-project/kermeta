/* $Id: KermetaEditorConfiguration.java 13210 2010-10-27 16:27:58Z hrambelo $
 * Project    : org.kermeta.language.texteditor.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 *           Francois Fouquet 
 */
package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

public class KermetaEditorConfiguration extends TextSourceViewerConfiguration {

	private org.kermeta.language.texteditor.eclipse.internal.KermetaColorManager colorManager;
	private org.kermeta.language.texteditor.eclipse.internal.KermetaEditor theEditor;
	
	// Create a new editor configuration.
	//
	// @param editor
	// @param colorManager
	///
	public KermetaEditorConfiguration(org.kermeta.language.texteditor.eclipse.internal.KermetaEditor editor, org.kermeta.language.texteditor.eclipse.internal.KermetaColorManager colorManager) {
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
	protected org.kermeta.language.texteditor.eclipse.internal.KermetaTokenScanner getScanner() {
		return new org.kermeta.language.texteditor.eclipse.internal.KermetaScanner(colorManager,theEditor);
	}
	
	
}