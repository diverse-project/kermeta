/* $Id: EditorReconcilingStrategy.java,v 1.16 2008-02-14 15:53:50 cfaucher Exp $
 * Project : Kermeta texteditor
 * File : EditorReconcilingStrategy.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 12 f�vr. 2005
 * Author : ffleurey, zdrey
 */
package fr.irisa.triskell.kermeta.graphicaleditor.editor;


import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;


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
    	org.eclipse.core.resources.IFile file = ResourceHelper.getIFile(resource.getURI().toString());
    	String uri = "platform:/resource" + file.getFullPath().toString();
    	IOPlugin.getDefault().unload( uri );
    	KermetaUnit result = null;
        EditorReconcilingStrategy.clearMarkers(file);
       
        try {
			result = IOPlugin.getDefault().getEditionKermetaUnitStore().get( uri );
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
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
		KermetaTypeChecker typechecker = new KermetaTypeChecker(result);
		typechecker.checkUnit();
		
		if ( ! result.isIndirectlyErroneous() ) {
			KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker(result);
			constraintchecker.checkUnit();
		}
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
    	KermetaMarkersHelper.createMarkers(file, unit);
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
