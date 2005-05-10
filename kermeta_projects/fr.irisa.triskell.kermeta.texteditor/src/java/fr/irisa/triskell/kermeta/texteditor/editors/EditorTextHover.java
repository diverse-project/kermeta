/*
 * Created on 12 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.texteditor.MarkerUtilities;

import fr.irisa.triskell.kermeta.ast.CompUnit;
import fr.irisa.triskell.kermeta.ast.FAssignement;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.typechecker.Type;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class EditorTextHover implements ITextHover, ITextHoverExtension, IInformationControlCreator {

	private Editor editor;
	
	/**
	 * 
	 */
	public EditorTextHover(Editor editor) {
		super();
		this.editor = editor;
	}
	
	

    public IInformationControlCreator getHoverControlCreator() {
        return this;
    }
    
    
    
    public IInformationControl createInformationControl(Shell parent) {
        KermetaInformationControl result = new KermetaInformationControl(parent);
        return result; 
    }
    
    KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
    
	/**
	 * @see org.eclipse.jface.text.ITextHover#getHoverInfo(org.eclipse.jface.text.ITextViewer, org.eclipse.jface.text.IRegion)
	 */
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
	    
	    
	    
		try {
			IMarker[] markers = editor.getFile().findMarkers(EditorReconcilingStrategy.getMarkerType(), true, 2);
			for (int i=0; i<markers.length; i++) {
				int start = MarkerUtilities.getCharStart(markers[i]);
				int end = MarkerUtilities.getCharEnd(markers[i]);
				int offset = hoverRegion.getOffset();
				if (offset >= start && offset <=end) return MarkerUtilities.getMessage(markers[i]);
			}
		} catch (CoreException e) {
			TexteditorPlugin.pluginLog.warn("error computing hover info", e);
		}
		
		//TexteditorPlugin.pluginLog.info("\n *** START HOVER *** offset=" + hoverRegion.getOffset()  + " length=" + hoverRegion.getLength());
		
		if (editor.mcunit != null && ((KMTUnit)editor.mcunit).getMctAST() != null) {
		    CompUnit unit = ((KMTUnit)editor.mcunit).getMctAST();
		    KermetaASTNode astnode = (KermetaASTNode)unit.getNodeAt(hoverRegion.getOffset(), hoverRegion.getLength());
		   // TexteditorPlugin.pluginLog.info(" * unit -> " + unit);
		    if (astnode != null) {
		        
		        //TexteditorPlugin.pluginLog.info(" * astnode -> " + astnode);
		        FObject fobj = getFObjectForNode(astnode);
		        
		        if (fobj != null && editor.mcunit.getTypeChecker() != null) {
		            //TexteditorPlugin.pluginLog.info(" * fobj -> " + fobj);
		            if (fobj instanceof FExpression) {
		                Type t = editor.mcunit.getTypeChecker().getTypeOfExpression((FExpression)fobj);
		                //TexteditorPlugin.pluginLog.info(" * Type -> " + t);
		                return pp.accept(fobj) + " : " + t;
		            }
		            
		        }
		    }
		}
		
		return null;
	}
	
	
	/**
     * 
     
    private FAssignement getFAssignement(KermetaASTNode astnode) {
        KermetaASTNode result = astnode;
        while(!(result instanceof FAssignement) && result != null) {
            result = (KermetaASTNode)result.getParent();
        }
        return (FAssignement)result;
    }
    
    private FExpression getFObjectForExpression(FAssignement node) {
        return (FExpression)getFObjectForNode(node);
    }
    
    private FObject getFObjectForNode(KermetaASTNode node) {
        
        KermetaASTNode currentNode = null;
        FObject result = null;
        
        ArrayList to_visit = new ArrayList();
        to_visit.add(node);
        
        while (result == null && to_visit.size()>0 ) {
            currentNode = (KermetaASTNode)to_visit.get(0);
            to_visit.remove(0);
            for(int i=0; i< currentNode.getChildCount(); i++) {
                to_visit.add(currentNode.getChild(i));
            }
            result = (FObject)editor.mcunit.getModelElementByNode(currentNode);
        }
        return result;
    }
    */
    private FObject getFObjectForNode(KermetaASTNode node) {
        
        KermetaASTNode currentNode = node;
        FObject result = null;

        
        while (result == null && currentNode != null) {
            
            result = (FObject)editor.mcunit.getModelElementByNode(currentNode);
            
            currentNode = (KermetaASTNode)currentNode.getParent();
            
        }
        return result;
    }
	

	/**
	 * @see org.eclipse.jface.text.ITextHover#getHoverRegion(org.eclipse.jface.text.ITextViewer, int)
	 */
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return new Region(offset, 0);
	}

}
