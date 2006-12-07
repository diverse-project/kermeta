/* $Id: EditorReconcilingStrategy.java,v 1.18 2006-12-07 13:47:43 ftanguy Exp $
 * Project : Kermeta texteditor
 * File : EditorReconcilingStrategy.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 12 févr. 2005
 * Author : ffleurey, zdrey
 */
package fr.irisa.triskell.kermeta.texteditor.editors;


import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.ui.texteditor.MarkerUtilities;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.message.KMUnitParseError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitWarning;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;

import fr.irisa.triskell.kermeta.kpm.helpers.MarkersHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;


/**
 * @author Franck Fleurey
 * 
 * @see IReconcilingStrategy for documentation
 * Rebuild the KermetaUnit in background ("background thread" is handled by 
 * jface itself).
 * TODO This has to be modified to optimize the edition.
 */
public class EditorReconcilingStrategy implements IReconcilingStrategy {

    private Editor _editor;
    private IDocument _document;
    private final static int LINE_MAX_SIZE = 80;
	
    public EditorReconcilingStrategy(Editor editor)
    {
        _editor = editor;
    }

    
    /**
	 * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#reconcile(org.eclipse.jface.text.reconciler.DirtyRegion, org.eclipse.jface.text.IRegion)
	 */	
    public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion)
    {
   /* 	try
    	{ 
    		if ( _editor.getKPMFile() == null ) {
    			KMTUnit unit = (KMTUnit) parse();
				MarkersHelper.clearMarkers(_editor.getFile());
				MarkersHelper.createMarkers( _editor.getFile(), unit);
    			_editor.setMcunit(unit);
    		}
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        	// TODO : if it is null, we should at least take in account the last
        	// valid KermetaUnit (for example : by creating a KermetaUnit
        	// when user saved a valid kermeta model).
            //_editor.setMcunit(null);
        }*/
    }
    
    /**
	 * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#reconcile(IRegion)
	 */
   public void reconcile(IRegion partition)
    {
    	/*try
        {
    		if ( _editor.getKPMFile() == null )
    			reconcile(null, null);
    		else {
    			KermetaUnit unit = _editor.getUnit();
    		
    			if ( _editor.isDirty() && ( unit != null ) ) {
    				//_editor.setMcunit(unit);
    				//MarkersHelper.clearMarkers(_editor.getFile());
    				//_editor.setMcunit( unit );
    				//MarkersHelper.createMarkers(_editor.getFile(), unit);
    			}
    		}
              
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
            //_editor.setMcunit(null);
        }*/
    }

    
    /**
	 * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#setDocument(org.eclipse.jface.text.IDocument)
	 */
    public void setDocument(IDocument document)
    {
        try
        {
        	 _document = document;
        	 //_editor.initializeUnit();
        	 reconcile(null, null);
        	// KermetaUnit unit = parse();
            //_editor.setMcunit(unit);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
           // _editor.setMcunit(null);
        }
    }

    /**
     * Parse the kermeta unit from the file that is currently edited.
     * Also set the markers (namely, the tips when an element is focused by the 
     * cursor) (uses the methods clearMarkers and createMarkers) 
     * 
     * @return a KermetaUnit of the "compiled" file.
     */
    private KermetaUnit parse()
    {   
    	//KermetaUnit unit = KermetaWorkspace.typeCheckFile( _editor.getFile() );
    	StdLibKermetaUnitHelper.setURItoDefault();
    	org.eclipse.core.resources.IFile file = _editor.getFile();
    	String uri = "platform:/resource" + file.getFullPath().toString();
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
    	MarkersHelper.clearMarkers(file);
        try {
        	result = (KMTUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
	        result.parseString(_document.get());
	        result.load();
	        result.typeCheck(null);
	        // FIXME : some time constraint checking returns weird results. See where...
	        //result.constraintCheck(null);
        }
        catch(Throwable e) {
            KermetaUnit.internalLog.error("load error ", e);
        	if (result == null) {
        		e.printStackTrace();
        		return null;
        	}
        	else if (!result.messages.unitHasError)
        		result.messages.addMessage(new KMUnitError("INTERNAL ERROR : " + e, null, null));
        }
        
        MarkersHelper.createMarkers(_editor.getFile(), result);
        return result;
    }

}
