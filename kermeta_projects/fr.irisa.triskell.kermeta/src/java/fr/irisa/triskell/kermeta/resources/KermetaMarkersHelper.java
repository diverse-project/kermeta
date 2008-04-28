/*$Id: KermetaMarkersHelper.java,v 1.13 2008-04-28 11:51:26 ftanguy Exp $
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
import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.kermeta.io.ErrorMessage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.Message;
import org.kermeta.io.ParsingError;
import org.kermeta.io.WarningMessage;

import fr.irisa.triskell.kermeta.language.structure.Object;
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
    	return IMarker.PROBLEM;
    }
	
    /**
     *  Create markers for showing to the user the elements that are erroneous, or
     *  that are subjects to warnings.
     */
    public static void createMarkers(IFile file, KermetaUnit unit) {    	
    	if ( unit.getUri().matches(".+\\.kmt") )
    		for ( Message m : unit.getMessages() )
    			createMarkerForKMTFile(file, m, unit);
    	else
    		for ( Message m : unit.getMessages() )
	    		createMarker(file, m);
    }

    public static void markError(IFile file, String message) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_ERROR, null, null );
    }
    
    private static void markError(IFile file, String message, int charStart, int charStop) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_ERROR, charStart, charStop );
    }
    
    private static void markWarning(IFile file, String message) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_WARNING, null, null );
    }
    
    private static void markWarning(IFile file, String message, int charStart, int charStop) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_WARNING, charStart, charStop );
    }
    
    private static void markInfo(IFile file, String message) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_INFO, null, null );
    }
    
    private static void markInfo(IFile file, String message, int charStart, int charStop) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_INFO, charStart, charStop );
    }
    
    private static void mark(IFile file, String message, int severity, Integer charStart, Integer charStop) throws CoreException {
     	HashMap<String, java.lang.Object> datas = new HashMap<String, java.lang.Object>();
        datas.put( IMarker.MESSAGE, message );
        datas.put( IMarker.SEVERITY, severity );
        
        if ( charStart != null )
        	datas.put( IMarker.CHAR_START, charStart );
        else
        	datas.put( IMarker.CHAR_START, 0 );
 
        if ( charStop != null )
           	datas.put( IMarker.CHAR_END, charStop );
       	else
       		datas.put( IMarker.CHAR_END, 0 );
        
        MarkerUtilities.createMarker( file, datas, getMarkerType() );
    }
    
    private static void createParsingError(IFile file, String message, ParsingError error) throws CoreException {
		int offset = error.getOffset();
		int length = error.getLength();
		if ( length == 0 ) {
			length = 1;
			offset--;
        }
		markError(file, message, offset, offset + length);
    }
    
    private static void createMarker(IFile file, String message, Message m, KermetaUnit unit) throws CoreException {
    	if ( m.getTarget() instanceof Object ) {
	    	if ( unit.getTracer() != null ) {
	    		ModelReference mr = unit.getTracer().getModelReference( (Object) m.getTarget() );
	    		TextReference tr = ModelReferenceHelper.getFirstTextReference(mr);
	    		if (tr != null) {
	    			String filePath = "platform:/resource" + file.getFullPath().toString();
	    			if ( tr.getFileURI().equals( filePath ) ) {
	 				   if ( m instanceof ErrorMessage )
	 					   markError(file, message, tr.getCharBeginAt(), tr.getCharEndAt());
	 				   else if ( m instanceof WarningMessage )
	 					   markWarning(file, message, tr.getCharBeginAt(), tr.getCharEndAt());
	    			}
	 		   }
	    	}
    	} else if ( m.getTarget() instanceof ASTNode ) {
    	   	ASTNode node = (ASTNode) m.getTarget();
        	if ( m instanceof ErrorMessage )
        		markError(file, message, node.getRangeStart(), node.getRangeEnd());
        	else if ( m instanceof WarningMessage )
        		markWarning(file, message, node.getRangeStart(), node.getRangeEnd());
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
    public static void createMarkerForKMTFile(IFile file, Message message, KermetaUnit unit) {
    	String realMessage = formatMessage(message.getValue());
        try {
        	if (message instanceof ParsingError)
        		createParsingError(file, realMessage, (ParsingError) message);
        	else if ( message.getTarget() instanceof Object )
        		createMarker(file, realMessage, message, unit);
        	else if ( message.getTarget() instanceof ASTNode )
        		createMarker(file, realMessage, message, unit);
        	else {
              	realMessage = "Cannot locate error in file, maybe one of required file is erroneous.\n" + message.getValue();
               	if(message instanceof ErrorMessage)
               		markError(file, realMessage);
               	else if ( message instanceof WarningMessage )
              			markWarning(file, realMessage);
           		else
           			markInfo(file, realMessage);
        	}           
        } catch(CoreException ex) {
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
    public static void createMarker(IFile file, Message message) {
        String realMessage = formatMessage(message.getValue());
        try {
        	if ( findMarker(file, realMessage) == null ) {
        		if(message instanceof ErrorMessage)
                	markError(file, realMessage);
                else if(message instanceof WarningMessage)
                    markWarning(file, realMessage);
                else
                    markInfo(file, realMessage);
        	}
        } catch(CoreException ex) {
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
        	if ( file != null )
        		file.deleteMarkers(getMarkerType(), true, IResource.DEPTH_INFINITE);
        } catch(Exception ex) {
            //ex.printStackTrace();
        }
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
