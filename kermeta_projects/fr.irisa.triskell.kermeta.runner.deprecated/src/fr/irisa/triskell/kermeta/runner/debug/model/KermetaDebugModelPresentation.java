/* $Id: KermetaDebugModelPresentation.java,v 1.4 2005-12-01 18:29:06 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaDebugModelPresentation.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IWatchExpression;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.jface.util.ListenerList;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.launching.KermetaSourceLocator;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

/**
 * 
 */
public class KermetaDebugModelPresentation implements IDebugModelPresentation {

	static public String KERMETA_DEBUG_MODEL_ID = "fr.irisa.triskell.kermeta.runner.debug";
	
	protected ListenerList listeners= new ListenerList();		
	
	public KermetaDebugModelPresentation()
	{
		System.err.println("Kermeta Debug Model Presentation");
	}
    /** (non-Javadoc)
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
        return null;
    }

    /**
     * Return the text that will be displayed in the Eclipse debug GUI.
     * If null by default, then the getName() method will be called instead on the
     * given <code>element</code>.
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    public String getText(Object element) {
    	if (element instanceof KermetaDebugTarget 
				|| element instanceof KermetaStackFrame 	
				|| element instanceof KermetaDebugThread
				|| element instanceof KermetaVariable) {
			return null;	// defaults work 
		} 
    	
    	else if (element instanceof KermetaBreakpoint) {
			IMarker marker = ((KermetaBreakpoint)element).getMarker();
			// Do something
		
		} 
    	
    	else if (element instanceof IWatchExpression) {
			try {
				IWatchExpression watch_expression = (IWatchExpression)element;
				IValue value = watch_expression.getValue();
				if (value != null) {
					return "\"" + watch_expression.getExpressionText() + "\"= " + 
						value.getValueString();
				}else{
					return null;
				}
			}catch( DebugException e ){
				return null;
			}
		}
    	// TODO : (to check) is there a debug element that is not processed here?
		return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.IDebugModelPresentation#computeDetail(org.eclipse.debug.core.model.IValue, org.eclipse.debug.ui.IValueDetailListener)
     */
    public void computeDetail(IValue value, IValueDetailListener listener) {
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

    /**
     * @see org.eclipse.debug.ui.ISourcePresentation#getEditorId(org.eclipse.ui.IEditorInput, java.lang.Object)
     */
    public String getEditorId(IEditorInput input, Object element) {
    	System.out.println("KermetaDebugModelPresentation : Call of getEditorId method");
        return RunnerPlugin.PLUGIN_EDITOR_ID;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void addListener(ILabelProviderListener listener) {
        // TODO Auto-generated method stub
    	System.err.println("I added a listener in KermetaDebugModelPresentation.");
    	listeners.add(listener);
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
    	listeners.remove(listener);
    }

}
