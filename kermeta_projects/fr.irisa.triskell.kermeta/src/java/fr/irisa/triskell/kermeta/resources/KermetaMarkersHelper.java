/*$Id: KermetaMarkersHelper.java,v 1.17 2008-09-26 12:15:43 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta
* File : 	KermetaMarkersHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 7, 2007
* Authors : ftanguy, dvojtise
*/
package fr.irisa.triskell.kermeta.resources;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.kermeta.io.ErrorMessage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.Message;
import org.kermeta.io.ParsingError;
import org.kermeta.io.WarningMessage;

import fr.irisa.triskell.eclipse.resources.EclipseMarkerHelper;
import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.ModelReferenceHelper;

/**
 * This class provides helper functions to create and manage the Eclipse markers when used with Kermeta
 *
 */
public class KermetaMarkersHelper extends EclipseMarkerHelper {

	
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
	    		ModelReference mr = unit.getTracer().getOneModelReference( (Object) m.getTarget() );
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
    	// make sure the string is not too long (it is pointless to have a marker longer than 20 lines, 
    	// and Eclipse don't really support large markers
    	String realMessage = message.getValue().length() > LINE_MAX_SIZE*20 ? message.getValue().substring(0, (LINE_MAX_SIZE*20) - 3)+"..." : message.getValue();
    	//String realMessage = formatMessage(trimmedMessage);
        try {
        	if (message instanceof ParsingError)
        		createParsingError(file, formatMessage(realMessage), (ParsingError) message);
        	else if ( message.getTarget() instanceof Object )
        		createMarker(file, realMessage, message, unit);
        	else if ( message.getTarget() instanceof ASTNode )
        		createMarker(file, realMessage, message, unit);
        	else {
              	realMessage = "Cannot locate error in file, maybe one of required file is erroneous.\n" + message.getValue();
               	if(message instanceof ErrorMessage)
               		markError(file, formatMessage(realMessage));
               	else if ( message instanceof WarningMessage )
              			markWarning(file, formatMessage(realMessage));
           		else
           			markInfo(file, formatMessage(realMessage));
        	}           
        } catch(CoreException ex) {
            ex.printStackTrace();
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
    
 
}
