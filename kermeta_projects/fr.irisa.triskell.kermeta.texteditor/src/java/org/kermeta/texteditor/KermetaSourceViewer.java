

/*$Id: KermetaSourceViewer.java,v 1.2 2008-06-11 14:36:46 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaSourceViewer.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 déc. 07
* Authors : paco
*/

package org.kermeta.texteditor;

import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;

public class KermetaSourceViewer extends ProjectionViewer {
	
	public KermetaSourceViewer(Composite parent, IVerticalRuler ruler, IOverviewRuler overviewRuler, boolean showsAnnotationOverview, int styles) {
		super(parent, ruler, overviewRuler, showsAnnotationOverview, styles);
	}
	
/*	@Override
	public void configure(SourceViewerConfiguration configuration) {
		super.configure(configuration);
		addTextListener( new ITextListener() {
			public void textChanged(TextEvent event) {
				TextSelection selection = (TextSelection) getSelection();
				if ( selection.getLength() != 0 ) {
					if ( canDoOperation( SourceViewer.FORMAT) ) {
						doOperation(SourceViewer.FORMAT);
						// Update marker visuals.
						IDocument doc = getDocument();
						IAnnotationModel model = getAnnotationModel();
						model.disconnect(doc);
						model.connect(doc);
					}
				}
			}
		});

	}*/
}


