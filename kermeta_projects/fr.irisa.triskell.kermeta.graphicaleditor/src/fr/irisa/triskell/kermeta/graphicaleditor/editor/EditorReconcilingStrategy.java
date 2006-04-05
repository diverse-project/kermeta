/* $Id: EditorReconcilingStrategy.java,v 1.1 2006-04-05 19:00:14 zdrey Exp $
 * Project : Kermeta texteditor
 * File : EditorReconcilingStrategy.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 12 févr. 2005
 * Author : ffleurey, zdrey
 */
package fr.irisa.triskell.kermeta.graphicaleditor.editor;


import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.topcased.modeler.editor.Modeler;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.KMUnitParseError;
import fr.irisa.triskell.kermeta.loader.KMUnitWarning;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

/**
 * @author Franck Fleurey
 */
public class EditorReconcilingStrategy implements IReconcilingStrategy {

    private final static int LINE_MAX_SIZE = 80;
	
    public EditorReconcilingStrategy()
    {
    }
    
    
    public static KermetaUnit parse(String filestring)
    {
        KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
    	
    	//StructurePackageImpl.init();
    	//BehaviorPackageImpl.init();
    	
    	org.eclipse.core.resources.IFile file = KermetaPlugin.getIFileFromString(filestring);
    	String uri = "platform:/resource" + file.getFullPath().toString();
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KermetaUnit result = null;
        EditorReconcilingStrategy.clearMarkers(file);
       // System.out.println("file.getFullPath().toOSString() : " + file.getFullPath().toOSString());
        try {
        	result = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
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
        
        EditorReconcilingStrategy.createMarkers(file, result);
        return result;
    }
    
    public static void clearMarkers(IFile file) {
        try {
        	System.out.println("clear markers : " ) ;
            file.deleteMarkers(getMarkerType(), true, 5);
            //file.deleteMarkers(, true, 5);
            System.out.println("marker : " + file.getMarker(1));
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void createMarkers(IFile file, KermetaUnit unit)
    {
    	Iterator it = unit.messages.getErrors().iterator();
    	while(it.hasNext()) createMarker(file, (KMUnitMessage)it.next(), unit);
    	it = unit.messages.getWarnings().iterator();
    	while(it.hasNext()) createMarker(file, (KMUnitMessage)it.next(), unit);
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
    
    
    private static void createMarker(IFile file, KMUnitMessage message, KermetaUnit unit)
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
	
    /** split message so that it is displayed in many lines instead of only one */
    public static String formatMessage(String message)
    {
    	String result = "";
    	int line_start=0; int line_end=0; String ret_char = "\n";
    	if (message.length() >  LINE_MAX_SIZE)
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

	public void setDocument(IDocument document) {
		// TODO Auto-generated method stub
		
	}

	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
		// TODO Auto-generated method stub
		
	}

	public void reconcile(IRegion partition) {
		// TODO Auto-generated method stub
		
	}

}
