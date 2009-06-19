/*$Id: EclipseMarkerHelper.java,v 1.1 2008-08-13 11:18:02 dvojtise Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EclipseMarkerHelper.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 13 ao�t 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.eclipse.resources;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.texteditor.MarkerUtilities;


public class EclipseMarkerHelper {
	protected final static int LINE_MAX_SIZE = 80;
	
    /**
     * The marker type : must correspond to the type that is
     * declared in the extension "org.eclipse.core.resources.markers"
     * in fr.irisa.triskell.kermeta/plugin.xml
     *  (super type="org.eclipse.core.resources.problemmarker")
     */
    public static String getMarkerType() {
    	return IMarker.PROBLEM;
    }
	    

    public static void markError(IFile file, String message) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_ERROR, null, null );
    }
    
    public static void markError(IFile file, String message, int charStart, int charStop) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_ERROR, charStart, charStop );
    }
    
    public static void markWarning(IFile file, String message) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_WARNING, null, null );
    }
    
    public static void markWarning(IFile file, String message, int charStart, int charStop) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_WARNING, charStart, charStop );
    }
    
    public static void markInfo(IFile file, String message) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_INFO, null, null );
    }
    
    public static void markInfo(IFile file, String message, int charStart, int charStop) throws CoreException {
    	mark(file, message, IMarker.SEVERITY_INFO, charStart, charStop );
    }
    
    protected static void mark(IFile file, String message, int severity, Integer charStart, Integer charStop) throws CoreException {
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
    
   
 
    
    /** Split message so that it is displayed in many lines instead of only one */
    protected static String formatMessage(String message)
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
  
    static protected IMarker findMarker( IResource resource, String message ) throws CoreException {
    	IMarker[] markers = resource.findMarkers(getMarkerType(), false, IResource.DEPTH_ZERO);
    	IMarker foundMarker = null;
    	for (int index = 0; index < markers.length; index++ ) {
    		String currentMessage = ((String) markers[index].getAttribute("message")).replace("\n", "");
    		if ( currentMessage.equals(message.replace("\n", "")) )
    			foundMarker = markers[index];
    	}
    	return foundMarker;
    }

    /**
     * retrieves the Markers for the given text selection
     * @param resource
     * @param ts
     * @return
     * @throws CoreException
     */
    static public EList<IMarker> findMarkersForTextSelection( IResource resource, ITextSelection ts ) {
    	
    	EList<IMarker> founMarkers = new BasicEList<IMarker>();
    	IMarker[] markers;
		try {
			markers = resource.findMarkers(getMarkerType(), false, IResource.DEPTH_ZERO);
		
	    	for (int index = 0; index < markers.length; index++ ) {
	    		Integer markerCharStart = (Integer) markers[index].getAttribute(IMarker.CHAR_START);
	    		Integer markerCharEnd = (Integer) markers[index].getAttribute(IMarker.CHAR_END);
	    		
	    		if(ts.getOffset() > markerCharStart && ts.getOffset()< markerCharEnd)
	    			founMarkers.add(markers[index]);
	    	}
		} catch (CoreException e) {
			e.printStackTrace();
		}
    	return founMarkers;
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
