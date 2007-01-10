package fr.irisa.triskell.kermeta.core.markers;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.texteditor.MarkerUtilities;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.message.KMUnitParseError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitWarning;

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
     *  Create markers for showing to the user the elements that are errored, or
     *  that are subjects to warnings.
     */
    public static void createMarkers(IFile file, KermetaUnit unit)
    {
    	for (Object next : unit.messages.getErrors()) createMarkerForKMTFile(file, (KMUnitMessage)next, (KMTUnit)unit);
    	for (Object next : unit.messages.getWarnings()) createMarkerForKMTFile(file, (KMUnitMessage)next, (KMTUnit)unit);
    }

    /**
     *  Create a marker for showing to the user the elements that are errored, or
     *  that are subjects to warnings.
     *  @param file the file currently edited
     *  @param message contains the message/warning/error, and the node that 
     *  contains the given message/warning/error
     *  @param unit the kermeta unit for the given file
     */
    public static void createMarkerForKMTFile(IFile file, KMUnitMessage message, KMTUnit unit)
    {
    	String realMessage = formatMessage(message.getMessage());

        try
        {
        	if ( ! findMarker(file, realMessage) ) {
                HashMap <String, Object> map = new HashMap <String, Object> ();
                
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
                
                map.put("message", realMessage);
                if(message instanceof KMUnitError)
                    map.put("severity", new Integer(2));
                else
                if(message instanceof KMUnitWarning)
                    map.put("severity", new Integer(1));
                else
                    map.put("severity", new Integer(0));
                map.put("charStart", new Integer(offset));
                map.put("charEnd", new Integer(offset + length));
                //map.put("transient", new Boolean(true));        		
        		MarkerUtilities.createMarker(file, map, getMarkerType());
        		//MarkerUtilities.createMarker(file, null, getMarkerType());
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
    public static void createMarkerForKMFile(IFile file, KMUnitMessage message, KMUnit unit)
    {
        HashMap <String, Object> map = new HashMap <String, Object> ();
        String realMessage = formatMessage(message.getMessage());

        try
        {
        	if ( ! findMarker(file, realMessage) ) {
                map.put("message", realMessage);
                if(message instanceof KMUnitError)
                    map.put("severity", new Integer(2));
                else
                if(message instanceof KMUnitWarning)
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
        	file.deleteMarkers(getMarkerType(), true, IResource.DEPTH_INFINITE);
        } catch(Exception ex) {
            //ex.printStackTrace();
        }
    }
    
    
    public static void createMarker (IFile file, String message) {
    	
    	HashMap <String, Object> map = new HashMap <String, Object> ();
    	map.put("message", formatMessage(message));
    	map.put("severity", new Integer(2));
        try
        {	
        	if ( ! findMarker(file, message) ) {
        		MarkerUtilities.createMarker(file, map, getMarkerType());
        	}
        }
        catch(CoreException ex)
        {
            //ex.printStackTrace();
        }
    }
    
    static private boolean findMarker( IResource resource, String message ) throws CoreException {
    	IMarker[] markers = resource.findMarkers(getMarkerType(), false, IResource.DEPTH_ZERO);
    	boolean foundMarker = false;
    	for (int index = 0; index < markers.length; index++ ) {
    		String currentMessage = (String) markers[index].getAttribute("message");
    		if ( currentMessage.equals(message) )
    			foundMarker = true;
    	}
    	return foundMarker;
    }

    
}
