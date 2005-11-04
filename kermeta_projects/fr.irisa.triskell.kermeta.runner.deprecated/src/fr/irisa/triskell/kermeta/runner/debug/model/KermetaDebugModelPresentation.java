/* $Id: KermetaDebugModelPresentation.java,v 1.1 2005-11-04 17:01:08 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaDebugModelPresentation.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;

/**
 * 
 */
public class KermetaDebugModelPresentation implements IDebugModelPresentation {

	static public String KERMETA_DEBUG_MODEL_ID = "fr.irisa.triskell.kermeta.runner.debug";
	
	public KermetaDebugModelPresentation()
	{
		System.err.println("Kermeta Debug Model Presentation");
	}
    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.IDebugModelPresentation#setAttribute(java.lang.String, java.lang.Object)
     */
    public void setAttribute(String attribute, Object value) {
        // TODO Auto-generated method stub
    	System.err.println("I set an attribute in KermetaDebugModelPresentation.");
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    public Image getImage(Object element) {
        // TODO Auto-generated method stub
        System.err.println("IMAGE");
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    public String getText(Object element) {
        // TODO Auto-generated method stub
        return "Les bidochons sont revenus";
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.IDebugModelPresentation#computeDetail(org.eclipse.debug.core.model.IValue, org.eclipse.debug.ui.IValueDetailListener)
     */
    public void computeDetail(IValue value, IValueDetailListener listener) {
        // TODO Auto-generated method stub
    	System.out.println("KermetaDebugModelPresentation : Call of computeDetail method");
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ISourcePresentation#getEditorInput(java.lang.Object)
     */
    public IEditorInput getEditorInput(Object element) {
    	System.out.println("KermetaDebugModelPresentation : Call of getEditorInput method");
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ISourcePresentation#getEditorId(org.eclipse.ui.IEditorInput, java.lang.Object)
     */
    public String getEditorId(IEditorInput input, Object element) {
    	System.out.println("KermetaDebugModelPresentation : Call of getEditorId method");
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void addListener(ILabelProviderListener listener) {
        // TODO Auto-generated method stub
    	System.err.println("I added a listener in KermetaDebugModelPresentation.");

    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
     */
    public void dispose() {
        // TODO Auto-generated method stub
    	System.err.println("I disposed in KermetaDebugModelPresentation.");
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
     */
    public boolean isLabelProperty(Object element, String property) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void removeListener(ILabelProviderListener listener) {
        // TODO Auto-generated method stub
    	System.err.println("I removed a KermetaDebugModelPresentation.");
    }

}
