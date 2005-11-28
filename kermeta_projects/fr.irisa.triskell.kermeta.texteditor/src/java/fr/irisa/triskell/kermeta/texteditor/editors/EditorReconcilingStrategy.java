/* $Id: EditorReconcilingStrategy.java,v 1.11 2005-11-28 12:46:43 dvojtise Exp $
 * Project : Kermeta texteditor
 * File : EditorReconcilingStrategy.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 12 f�vr. 2005
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
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.KMUnitParseError;
import fr.irisa.triskell.kermeta.loader.KMUnitWarning;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;

/**
 * @author Franck Fleurey
 */
public class EditorReconcilingStrategy implements IReconcilingStrategy {

    private Editor _editor;
    private IDocument _document;
	
    public EditorReconcilingStrategy(Editor editor)
    {
        _editor = editor;
    }

    public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion)
    {
    	System.out.println("reconcile(DirtyRegion dirtyRegion, IRegion subRegion)");
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

    public void reconcile(IRegion partition)
    {
    	System.out.println("reconcile(DirtyRegion dirtyRegion, IRegion subRegion)");
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

    private KermetaUnit parse()
    {
        KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
    	
    	//StructurePackageImpl.init();
    	//BehaviorPackageImpl.init();
    	
    	org.eclipse.core.resources.IFile file = _editor.getFile();
    	String uri = "platform:/resource" + file.getFullPath().toString();
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
        EditorReconcilingStrategy.clearMarkers(file);
       // System.out.println("file.getFullPath().toOSString() : " + file.getFullPath().toOSString());
        try {
        	result = (KMTUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
	        result.parseString(_document.get().replace('\t', ' '));
	        result.load();
	        
	        result.typeCheck(null);

	        result.constraintCheck(null);
	        
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
        
        EditorReconcilingStrategy.createMarker(file, result);
        return result;
    }
    
    public static void clearMarkers(IFile file) {
        try {
            file.deleteMarkers(getMarkerType(), true, 2);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void createMarker(IFile file, KermetaUnit unit)
    {
    	Iterator it = unit.messages.getErrors().iterator();
    	while(it.hasNext()) createMarker(file, (KMUnitMessage)it.next(), (KMTUnit)unit);
    	it = unit.messages.getWarnings().iterator();
    	while(it.hasNext()) createMarker(file, (KMUnitMessage)it.next(), (KMTUnit)unit);
    }

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
        
        map.put("message", message.getMessage());
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
    
    public static String getMarkerType()
    {
        return "org.eclipse.core.resources.problemmarker";
    }
	

}
