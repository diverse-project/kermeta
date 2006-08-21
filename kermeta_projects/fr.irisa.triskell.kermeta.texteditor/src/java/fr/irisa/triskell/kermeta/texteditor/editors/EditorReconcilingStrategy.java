/* $Id: EditorReconcilingStrategy.java,v 1.15 2006-08-21 15:26:57 zdrey Exp $
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
import java.util.Iterator;

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
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;

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
    	try
    	{ 
        	KermetaUnit unit = parse();
             _editor.setMcunit(unit);
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        	// TODO : if it is null, we should at least take in account the last
        	// valid KermetaUnit (for example : by creating a KermetaUnit
        	// when user saved a valid kermeta model).
            _editor.setMcunit(null);
        }
    }
    
    /**
	 * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#reconcile(IRegion)
	 */
    public void reconcile(IRegion partition)
    {
    	try
        {
        	KermetaUnit unit = parse();
              _editor.setMcunit(unit);
              
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
            _editor.setMcunit(null);
        }
    }

    
    /**
	 * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#setDocument(org.eclipse.jface.text.IDocument)
	 */
    public void setDocument(IDocument document)
    {
        try
        {
        	 _document = document;
        	 KermetaUnit unit = parse();
            _editor.setMcunit(unit);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            _editor.setMcunit(null);
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
        KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
    	org.eclipse.core.resources.IFile file = _editor.getFile();
    	String uri = "platform:/resource" + file.getFullPath().toString();
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
        EditorReconcilingStrategy.clearMarkers(file);
        try {
        	result = (KMTUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
	        result.parseString(_document.get().replace('\t', ' '));
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
        
        EditorReconcilingStrategy.createMarkers(file, result);
        return result;
    }
    
    /**
     *  Clear previous marker in the given file; in the texteditor, markers
     *  display messages/warning/errors icons at begining of lines in 
     *  the text editors and underline elements that are concerned by those
     *  messages (for example, invalid calls).
     */
    public static void clearMarkers(IFile file) {
        try {
            file.deleteMarkers(getMarkerType(), true, 2);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     *  Create markers for showing to the user the elements that are errored, or
     *  that are subjects to warnings.
     */
    private static void createMarkers(IFile file, KermetaUnit unit)
    {
    	for (Object next : unit.messages.getErrors()) createMarker(file, (KMUnitMessage)next, (KMTUnit)unit);
    	for (Object next : unit.messages.getWarnings()) createMarker(file, (KMUnitMessage)next, (KMTUnit)unit);
    }

    /**
     *  Create a marker for showing to the user the elements that are errored, or
     *  that are subjects to warnings.
     *  @param file the file currently edited
     *  @param message contains the message/warning/error, and the node that 
     *  contains the given message/warning/error
     *  @param unit the kermeta unit for the given file
     */
    private static void createMarker(IFile file, KMUnitMessage message, KMTUnit unit)
    {
        HashMap map = new HashMap();
        
        int offset = 0;
        int length = 1;
        
        if (message instanceof KMUnitParseError) {
        	KMUnitParseError pe = (KMUnitParseError)message;
        	offset = pe.getOffset();
        	length = pe.getLength();
        }
        else if (message instanceof KMTUnitLoadError) {
        	offset = ((KMTUnitLoadError)message).getAstNode().getRangeStart();
        	length = ((KMTUnitLoadError)message).getAstNode().getRangeLength();	
        }
        else if(message.getNode() != null) {
            KermetaASTNode astn = unit.getKMTAstNodeForModelElement(message.getNode());
            if (astn != null) {
                offset = astn.getRangeStart();
                length = astn.getRangeLength();	
            }
        }
        else if(message.getAstNode() != null) {
            KermetaASTNode astn = message.getAstNode();
            offset = astn.getRangeStart();
            length = astn.getRangeLength();
        }
        
        
        if (offset > 0) offset--;
        
        map.put("message", formatMessage(message.getMessage()));
        if(message instanceof KMUnitError)
            map.put("severity", new Integer(2));
        else
        if(message instanceof KMUnitWarning)
            map.put("severity", new Integer(1));
        else
            map.put("severity", new Integer(0));
        map.put("charStart", new Integer(offset));
        map.put("charEnd", new Integer(offset + length));
        map.put("transient", new Boolean(true));
        try
        {
            MarkerUtilities.createMarker(file, map, getMarkerType());
        }
        catch(CoreException ex)
        {
            ex.printStackTrace();
        }
    }
    
    /**
     * The marker type : must correspond to the type that is
     * declared in the extension "org.eclipse.core.resources.markers"
     * in fr.irisa.triskell.kermeta/plugin.xml
     *  (super type="org.eclipse.core.resources.problemmarker")
     */
    public static String getMarkerType()
    {
        return "org.eclipse.core.resources.problemmarker";
    }
	
    /** Split message so that it is displayed in many lines instead of only one */
    public static String formatMessage(String message)
    {
    	String result = "";
    	int line_start=0; int line_end=0; String ret_char = "\n";
    	if (message.length() >  LINE_MAX_SIZE )
    	{
    		int linenumber = message.length()/LINE_MAX_SIZE;
    		for (int i=0; i<=linenumber; i++)
    		{
    			line_start = LINE_MAX_SIZE*i;
    			line_end   = LINE_MAX_SIZE*(i+1);
    			if (message.length()<line_end) {line_end = message.length();ret_char="";}
    			result += message.substring(line_start, line_end) + ret_char ;
    		}
    	}
    	else
    		result = message;
    	return result;
    }

}
