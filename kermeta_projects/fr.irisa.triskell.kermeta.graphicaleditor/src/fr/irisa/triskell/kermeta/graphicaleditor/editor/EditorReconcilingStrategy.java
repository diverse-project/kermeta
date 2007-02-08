/* $Id: EditorReconcilingStrategy.java,v 1.9 2007-02-08 17:10:19 cfaucher Exp $
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.ui.texteditor.MarkerUtilities;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.message.KMUnitParseError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitWarning;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

/**
 * @author Franck Fleurey
 */
public class EditorReconcilingStrategy implements IReconcilingStrategy {

    private final static int LINE_MAX_SIZE = 80;
	
    public EditorReconcilingStrategy()
    {
    }
    
    /**
     * Parses the given resource. This consists on loading a KermetaUnit for it. *
     * Note : we don't type-check it, nor constraint-check!
     * */
    public static KermetaUnit parse(Resource resource)
    {
    	StdLibKermetaUnitHelper.setURItoDefault();
    	org.eclipse.core.resources.IFile file = ResourceHelper.getIFile(resource.getURI().toString());
    	String uri = "platform:/resource" + file.getFullPath().toString();
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMUnit result = null;
        EditorReconcilingStrategy.clearMarkers(file);
       // System.out.println("file.getFullPath().toOSString() : " + file.getFullPath().toOSString());
        try {
        	result = (KMUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
        	result.setResource(resource);
	        result.load();
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
     * Parses and checks the given resource!
     */
    public static KermetaUnit parseAndCheck(Resource resource)
    {
    	KermetaUnit result = parse(resource);
        // Set type_check boolean to false so that we can check again 
        result.setType_checked(false);
        result.typeCheck(null);
        result.constraintCheck(null);
        return result;
    }
    
    public static void clearMarkers(IFile file) {
        try {
        	System.out.println("clear markers : " ) ;
            file.deleteMarkers(getMarkerType(), true, 5);
            //file.deleteMarkers(, true, 5);
            //System.out.println("marker : " + file.getMarker(1));
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
            ASTNode astn = message.getAstNode();
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
