package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.HashMap;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.parser.KermetaParserHelper;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;

public class ParsingStrategy implements IReconcilingStrategy {

	private KMTEditor editor;

	public ParsingStrategy(KMTEditor editor) {
		this.editor = editor;
	}
	
	public void reconcile(IRegion partition) {	
		if ( ! EditorConfiguration.getEditorCompletion().isCompleting() ) {
			KMTUnit unit = (KMTUnit) KermetaWorkspace.getInstance().getKermetaUnit( editor.getFile() );
			unit.messages.deleteParsingErrors();
			KermetaParserHelper.parse( unit, editor.getFileContent() );
			KermetaMarkersHelper.clearMarkers(editor.getFile());
			KermetaMarkersHelper.createMarkers(editor.getFile(), unit);
			
		/*	
			ASTNode root = unit.getMctAST().getRoot();
			
			int offset = root.getFirstChild().getOffset();
			int length = root.getFirstChild().getTextLength();
			
			System.out.println( "offset : " + offset + " and length : " + length);
			
			Position position = new Position(offset, length);
			
			HashMap newAnnotations = new HashMap();
	
			ProjectionAnnotation annotation = new ProjectionAnnotation();
			newAnnotations.put(annotation, position);
			
			editor.annotationModel.addAnnotation(annotation, position);*/
		}
	}

	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
	}

	public void setDocument(IDocument document) {
	}

}
