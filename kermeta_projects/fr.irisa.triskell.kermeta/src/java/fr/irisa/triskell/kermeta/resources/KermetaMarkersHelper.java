/*$Id: KermetaMarkersHelper.java,v 1.12 2008-04-25 07:53:55 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta
* File : 	KermetaMarkersHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 7, 2007
* Authors : ftanguy, dvojtise
*/
package fr.irisa.triskell.kermeta.resources;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.kermeta.io.ErrorMessage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.Message;
import org.kermeta.io.ParsingError;
import org.kermeta.io.WarningMessage;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNode;
import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.ModelReferenceHelper;
/**
 * This class provides helper functions to create and manage the Eclipse markers when used with Kermeta
 *
 */
public class KermetaMarkersHelper {

	private final static int LINE_MAX_SIZE = 80;
	
	
    /**
     * The marker type : must correspond to the type that is
     * declared in the extension "org.eclipse.core.resources.markers"
     * in fr.irisa.triskell.kermeta/plugin.xml
     *  (super type="org.eclipse.core.resources.problemmarker")
     */
    public static String getMarkerType() {
       // return "fr.irisa.triskell.kermeta.kpm.kermetaMarker";
    	return IMarker.PROBLEM;
    }
	
    /**
     *  Create markers for showing to the user the elements that are erroneous, or
     *  that are subjects to warnings.
     */
    public static void createMarkers(IFile file, KermetaUnit unit) {
    	
    	if ( unit.getUri().matches(".+\\.kmt") ) {
	    	for (ErrorMessage next : KermetaUnitHelper.getErrors(unit) ) 
	    		createMarkerForKMTFile(file, next, unit);
	    	for (WarningMessage next : KermetaUnitHelper.getWarnings(unit)) 
	    		createMarkerForKMTFile(file, next, unit);
    	} else {
    		for (ErrorMessage next : KermetaUnitHelper.getErrors(unit) ) 
	    		createError(file, next.getValue());
	    	for (WarningMessage next : KermetaUnitHelper.getWarnings(unit)) 
	    		createWarning(file, next.getValue());
    	}
    	
    }

    /**
     *  Create a marker for showing to the user the elements that are erroneous, or
     *  that are subjects to warnings.
     *  @param file the file currently edited
     *  @param message contains the message/warning/error, and the node that 
     *  contains the given message/warning/error
     *  @param unit the kermeta unit for the given file
     */
    public static void createMarkerForKMTFile(IFile file, Message message, KermetaUnit unit)
    {
    	String realMessage = formatMessage(message.getValue());

        try
        {
        //	if ( findMarker(file, realMessage) == null ) {
                HashMap <String, Object> map = new HashMap <String, Object> ();
                
                int offset = 0;
                int length = -1;
                
                if (message instanceof ParsingError) {
                	ParsingError pe = (ParsingError)message;
                	offset = pe.getOffset() -1;
                	length = pe.getLength();
                	if ( length == 0 ) {
                		length = 1;
                		offset--;
                	}
                }
               /* else if (message instanceof KMTUnitLoadError) {
                	offset = ((KMTUnitLoadError)message).getAstNode().getRangeStart();
                	length = ((KMTUnitLoadError)message).getAstNode().getRangeLength();	
                }*/
               else if( message.getTarget() != null ) {
            	   
            	   if ( message.getTarget() instanceof KermetaASTNode ) {
            		   KermetaASTNode node = (KermetaASTNode) message.getTarget(); 
            		   offset = node.getRangeStart() - 1;
                       length = node.getRangeLength();   
            	   } else if ( message.getTarget() instanceof fr.irisa.triskell.kermeta.language.structure.Object ) {
            	               	   
            		   fr.irisa.triskell.kermeta.language.structure.Object o = (fr.irisa.triskell.kermeta.language.structure.Object) message.getTarget();
            		   if ( unit.getTracer() != null ) {
            			   ModelReference mr = unit.getTracer().getModelReference( o );
            			   TextReference tr = ModelReferenceHelper.getFirstTextReference(mr);
	            		   if (tr != null) {
	            			   if(tr.getFileURI().equals( "platform:/resource" + file.getFullPath().toString())){
	            				   offset = tr.getCharBeginAt() - 1;
	            				   length = tr.getCharEndAt() - offset;	
	            			   }
	            		   }
            		   }
                    }
                    
                }
/*                else if(message.getAstNode() != null) {
                 */
                
                
                //if (offset > 0) offset--;
                
                if ( length != -1 ) {  
                
                	//MarkerUtilities.setLineNumber(map, line);
                	MarkerUtilities.setCharStart(map, offset);
                	MarkerUtilities.setCharEnd(map, offset + length);
                	
                	map.put("message", realMessage);
                	if(message instanceof ErrorMessage)
                		map.put("severity", new Integer(2));
                	else
                		if(message instanceof WarningMessage)
                			map.put("severity", new Integer(1));
                		else
                			map.put("severity", new Integer(0));
                	//map.put("charStart", new Integer(offset));
                	//map.put("charEnd", new Integer(offset + length)); 
                	int lineNumber = new Integer(ResourceHelper.calculateLineNumber(offset,file));
                	if(lineNumber != -1){
                		map.put("lineNumber", new Integer(lineNumber));
                	}
                	MarkerUtilities.createMarker(file, map, getMarkerType());
        		//MarkerUtilities.createMarker(file, null, getMarkerType());
                } else {
                	map.put("message", "Cannot locate error in file, maybe one of required file is erroneous.\n" + message.getValue());
                	if(message instanceof ErrorMessage)
                		map.put("severity", new Integer(2));
                	else
                		if(message instanceof WarningMessage)
                			map.put("severity", new Integer(1));
                		else
                			map.put("severity", new Integer(0));
                	map.put("charStart", 0);
                	map.put("charEnd", 0);        		
                	MarkerUtilities.createMarker(file, map, getMarkerType());
                }
        	
            
        }
        catch(CoreException ex)
        {
            ex.printStackTrace();
        }
    }
        
    
    /**
     *  Create a marker for showing to the user the elements that are errored, or
     *  that are subjects to warnings.
     *  @param file the file currently edited
     *  @param message contains the message/warning/error, and the node that 
     *  contains the given message/warning/error
     *  @param unit the kermeta unit for the given file
     */
    public static void createMarkerForKMFile(IFile file, Message message, KermetaUnit unit)
    {
        HashMap <String, Object> map = new HashMap <String, Object> ();
        String realMessage = formatMessage(message.getValue());

        try
        {
        	if ( findMarker(file, realMessage) == null ) {
                map.put("message", realMessage);
                if(message instanceof ErrorMessage)
                    map.put("severity", new Integer(2));
                else
                if(message instanceof WarningMessage)
                    map.put("severity", new Integer(1));
                else
                    map.put("severity", new Integer(0));
        		MarkerUtilities.createMarker(file, map, getMarkerType());
        	}
            
        }
        catch(CoreException ex)
        {
            ex.printStackTrace();
        }
    }
    
    /** Split message so that it is displayed in many lines instead of only one */
    private static String formatMessage(String message)
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
	
	
    
    /**
     *  Clear previous marker in the given file; in the texteditor, markers
     *  display messages/warning/errors icons at begining of lines in 
     *  the text editors and underline elements that are concerned by those
     *  messages (for example, invalid calls).
     */
    public static void clearMarkers(IFile file) {
        try {
            //file.deleteMarkers(getMarkerType(), true, 2);
        	if(file != null)
        		file.deleteMarkers(getMarkerType(), true, IResource.DEPTH_INFINITE);
        } catch(Exception ex) {
            //ex.printStackTrace();
        }
    }
    
    /**
     * @deprecated
     * @param file
     * @param message
     */
    public static void createMarker (IFile file, String message) {
    	createMarker(file, message, 2);
    }
    
    public static void createError (IFile file, String message) {
    	createMarker(file, message, 2);
    }
    
    public static void createMarker (IFile file, String message, int kind) {
    	
    	HashMap <String, Object> map = new HashMap <String, Object> ();
    	map.put("message", formatMessage(message));
    	
    	map.put("severity", new Integer(kind));
    	
        map.put("charStart", 0);
        map.put("charEnd", 0);
    	
        try
        {	
        	if ( (file != null) && findMarker(file, message) == null ) {
        		MarkerUtilities.createMarker(file, map, getMarkerType());
        	}
        }
        catch(CoreException ex) {}
    }
    
    public static void createWarning(IFile file, String message) {
    	createMarker(file, message, 1);
    }
    
    static private IMarker findMarker( IResource resource, String message ) throws CoreException {
    	IMarker[] markers = resource.findMarkers(getMarkerType(), false, IResource.DEPTH_ZERO);
    	IMarker foundMarker = null;
    	for (int index = 0; index < markers.length; index++ ) {
    		String currentMessage = ((String) markers[index].getAttribute("message")).replace("\n", "");
    		if ( currentMessage.equals(message.replace("\n", "")) )
    			foundMarker = markers[index];
    	}
    	return foundMarker;
    }

    static public void removeMarker( IResource resource, String message ) {
		try {
			if ( (resource != null) && resource.exists() ) {
				IMarker marker = findMarker(resource, message);
				if ( marker != null )
					marker.delete();
			}
		} catch (CoreException e) {}
    }
    
}
