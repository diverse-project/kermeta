/*
 * Created on 12 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;


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

import fr.irisa.triskell.kermeta.behavior.impl.BehaviorPackageImpl;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.KMUnitParseError;
import fr.irisa.triskell.kermeta.loader.KMUnitWarning;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMLoaderModuleMCT;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
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
    	StructurePackageImpl.init();
    	BehaviorPackageImpl.init();
    	org.eclipse.core.resources.IFile file = _editor.getFile();
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
        EditorReconcilingStrategy.clearMarkers(file);
       // System.out.println("file.getFullPath().toOSString() : " + file.getFullPath().toOSString());
        try {
        	result = (KMTUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit("platform:/resource" + file.getFullPath().toString());
	        result.parseString(_document.get().replace('\t', ' '));
	        result.load();
        }
        catch(Exception e) {
        	if (result == null) {
        		e.printStackTrace();
        		return null;
        	}
        	else if (result.error.size() == 0)
        		result.error.add(new KMUnitError("INTERNAL ERROR : " + e, null));
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
    	Iterator it = unit.error.iterator();
    	while(it.hasNext()) createMarker(file, (KMUnitMessage)it.next());
    	it = unit.warning.iterator();
    	while(it.hasNext()) createMarker(file, (KMUnitMessage)it.next());
    }

    private static void createMarker(IFile file, KMUnitMessage message)
    {
        HashMap map = new HashMap();
        
        int offset = 0;
        int length = 1;
        
        if (message instanceof KMUnitParseError) {
        	KMUnitParseError pe = (KMUnitParseError)message;
        	offset = pe.getOffset();
        	length = pe.getLength();
        }
        if (message.getNode() != null) {
        	offset = message.getNode().getRangeStart();
        	length = message.getNode().getRangeLength();
        	
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
