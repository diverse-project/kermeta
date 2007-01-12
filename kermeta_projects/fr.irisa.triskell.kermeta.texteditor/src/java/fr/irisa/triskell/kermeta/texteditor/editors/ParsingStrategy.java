package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;

import fr.irisa.triskell.kermeta.core.markers.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.parser.KermetaParserHelper;

public class ParsingStrategy implements IReconcilingStrategy {

	private KMTEditor editor;

	public ParsingStrategy(KMTEditor editor) {
		this.editor = editor;
	}
	
	public void reconcile(IRegion partition) {	
		if ( ! EditorConfiguration.getEditorCompletion().isCompleting() ) {
			KMTUnit unit = (KMTUnit) KermetaWorkspace.getInstance().getKermetaUnit( editor.getFile() );
			unit.messages.deleteParsingErrors();
			KermetaParserHelper.parse( unit, editor.getContent() );
			KermetaMarkersHelper.clearMarkers(editor.getFile());
			KermetaMarkersHelper.createMarkers(editor.getFile(), unit);
		}
	}

	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
	}

	public void setDocument(IDocument document) {
	}

}
