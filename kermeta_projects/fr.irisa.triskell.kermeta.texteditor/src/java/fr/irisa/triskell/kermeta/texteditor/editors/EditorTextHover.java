/*
 * Created on 12 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.texteditor.MarkerUtilities;

import fr.irisa.triskell.kermeta.ast.CompUnit;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FTag;

import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.Type;
import fr.irisa.triskell.kermeta.utils.KMTHelper;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 */
public class EditorTextHover implements ITextHover, ITextHoverExtension, IInformationControlCreator {

	private Editor editor;
	
	///////////////////////////////////////////////////////////////////////
	//
	// Begin "Generic" implementation for Text hover functionnality
	//
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * (Copied from JDT source)
	 * Get the command to show kermeta doc. This command should have been defined in the plugin
	 * (extension org.eclipse.ui.commands) 
	 * @see AbstractJavaTextEditor
	 */
/*	private ICommand fCommand;
	{
		ICommandManager commandManager= PlatformUI.getWorkbench().getCommandSupport().getCommandManager();
		fCommand= commandManager.getCommand(IKermetaEditorActionDefinitionIds.SHOW_KDOC);
		if (!fCommand.isDefined())
			fCommand= null;
	}*/
	

	/**
	 * (Copied from JDT source) 
	 * Returns the array of valid key sequence bindings for the
	 * show tool tip description command.
	 * (F2) was defined in the plugin
	 * @return the array with the {@link KeySequence}s
	 * @see AbstractJavaTextEditor
	 */
/*	private KeySequence[] getKeySequences() {
		if (fCommand != null) {
			List list= fCommand.getKeySequenceBindings();
			if (!list.isEmpty()) {
				KeySequence[] keySequences= new KeySequence[list.size()];
				for (int i= 0; i < keySequences.length; i++) {
					keySequences[i]= ((IKeySequenceBinding) list.get(i)).getKeySequence();
				}
				return keySequences;
			}		
		}
		return null;
	}*/
	
	
	///////////////////////////////////////////////////////////////////////
	//
	// End of "Generic" implementation for Text hover functionnality
	//
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * 
	 */
	public EditorTextHover(Editor editor) {
		super();
		this.editor = editor;
		//IJavaEditorActionDefinitionIds.SHOW_JAVADOC;
//		IJavaEditorActionDefinitionIds
		// IInformationProvider
		
	}
	
	

    public IInformationControlCreator getHoverControlCreator() {
        return this;
    }
    
    
    
    public IInformationControl createInformationControl(Shell parent) {
        KermetaInformationControl result = new KermetaInformationControl(parent);
        return result; 
    }
    
    KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
    
	/**
	 * @see org.eclipse.jface.text.ITextHover#getHoverInfo(org.eclipse.jface.text.ITextViewer, org.eclipse.jface.text.IRegion)
	 */
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
	    
	    
	    
		try {
			IMarker[] markers = editor.getFile().findMarkers(EditorReconcilingStrategy.getMarkerType(), true, 2);
			for (int i=0; i<markers.length; i++) {
				int start = MarkerUtilities.getCharStart(markers[i]);
				int end = MarkerUtilities.getCharEnd(markers[i]);
				int offset = hoverRegion.getOffset();
				if (offset >= start && offset <=end) return MarkerUtilities.getMessage(markers[i]);
			}
		} catch (CoreException e) {
			TexteditorPlugin.pluginLog.warn("error computing hover info", e);
		}
		
		//TexteditorPlugin.pluginLog.info("\n *** START HOVER *** offset=" + hoverRegion.getOffset()  + " length=" + hoverRegion.getLength());
		
		if (editor.mcunit != null && ((KMTUnit)editor.mcunit).getMctAST() != null) {
		    CompUnit unit = ((KMTUnit)editor.mcunit).getMctAST();
		    KermetaASTNode astnode = (KermetaASTNode)unit.getNodeAt(hoverRegion.getOffset(), hoverRegion.getLength());
		   // TexteditorPlugin.pluginLog.info(" * unit -> " + unit);
		    if (astnode != null) {
		        
		        //TexteditorPlugin.pluginLog.info(" * astnode -> " + astnode);
		        FObject fobj = editor.getFObjectForNode(astnode);
		        String ftags = "";
		        

		        // Notify other plugin of this event
		        Iterator it = TexteditorPlugin.getDefault().kermetaEditorEventListeners.iterator();
				while(it.hasNext())
				{
					KermetaEditorEventListener listener = (KermetaEditorEventListener)it.next();
					listener.textHoverCalled(fobj);
				}
				
		        //TexteditorPlugin.pluginLog.info(" * fobj -> " + fobj);
		        if (fobj instanceof FExpression)
		        {
		            FExpression fexp = (FExpression)fobj;
		            String result = "";
		            // Find the tag of the FCallFeature definition!
		            if (fexp instanceof FCallFeature)
		            {
		                /*FObject fdef = this.getDefinitionForFCallFeature((FCallFeature)fexp);
		                if (fdef != null)
		                {
		                    ftags = kdocPrettyPrint(fdef.getFTag());
		                }*/
		                return ppDefinitionForCallFeature((FCallFeature)fexp);
		            }
		            else if (fexp.getFStaticType() != null) {
		                Type t = new SimpleType(fexp.getFStaticType());
		                //TexteditorPlugin.pluginLog.info(" * Type -> " + t);
		                // return the source code representation or the signature
		                // of the element pointed by the cursor
		                return pp.accept(fobj) + " : " + t + "\n" + ftags;
		            }
		        }
		        else if(fobj instanceof FClass){
					FClass aClass = (FClass)fobj;
					ftags = kdocPrettyPrint(aClass.getFTypeDefinition().getFTag());
					return KMTHelper.getQualifiedName(aClass.getFTypeDefinition())+ "\n" + ftags;
		        }
		        
		    }
		}
		
		return null;
	}
	
	/**
	 * Return a prettyprint of the given ftags.
	 * @param ftags
	 * @return
	 */
	private String kdocPrettyPrint(EList taglist)
	{
	    // FIXME : totally ugly patch, until duplicate tags are removed from the 
	    // KM model itself..(bad "inheritance" handling of tags?)
	    Iterator it = taglist.iterator();
	    Hashtable tagdict = new Hashtable();
	    String pptags = "";
	    while (it.hasNext())
	    {	FTag tag = (FTag)it.next();
	    	pptags += tagdict.containsKey(tag.getFValue())?"":pp.accept(tag);
	        tagdict.put(tag.getFValue(), "");
	    }
	    if (pptags.startsWith("/**"))
	        pptags = pptags.substring(3, pptags.length()-2);
	    pptags = pptags.replaceAll("(\n)?[ \\t\\x0B\\f\\r]*\\*","$1");
	    return pptags;
	}
	
	/**
     * 
     
    private FAssignement getFAssignement(KermetaASTNode astnode) {
        KermetaASTNode result = astnode;
        while(!(result instanceof FAssignement) && result != null) {
            result = (KermetaASTNode)result.getParent();
        }
        return (FAssignement)result;
    }
    
    private FExpression getFObjectForExpression(FAssignement node) {
        return (FExpression)getFObjectForNode(node);
    }
    
    private FObject getFObjectForNode(KermetaASTNode node) {
        
        KermetaASTNode currentNode = null;
        FObject result = null;
        
        ArrayList to_visit = new ArrayList();
        to_visit.add(node);
        
        while (result == null && to_visit.size()>0 ) {
            currentNode = (KermetaASTNode)to_visit.get(0);
            to_visit.remove(0);
            for(int i=0; i< currentNode.getChildCount(); i++) {
                to_visit.add(currentNode.getChild(i));
            }
            result = (FObject)editor.mcunit.getModelElementByNode(currentNode);
        }
        return result;
    }
    */
	
	/**
	 * Get the definition of the CallFEature :
	 * - FEnumeration
	 * - FClass <- FTypeLiteral ?
	 * - FOperation
	 * - FProperty
	 */
	private FObject getDefinitionForFCallFeature(FCallFeature feature)
	{
	    if (feature.getFStaticOperation() != null)
	    {
	        return feature.getFStaticOperation();
	    }
	    if (feature.getFStaticProperty() != null)
	    {
	        return feature.getFStaticProperty();
	    }
	    else // return the CallFeature itself
	    {
	        System.err.println("the definition : " + feature.getFName() + feature);
	        return feature;
	    }
	}
	
	public String ppDefinitionForCallFeature(FCallFeature feature)
	{
	    if (feature.getFStaticOperation() != null)
	    {
	        //return feature.getFStaticOperation();
	        return pp.ppSimplifiedFOperationInContext(feature.getFStaticOperation()) + 
        	"\n" +
        	kdocPrettyPrint(feature.getFStaticOperation().getFTag());
	    }
	    if (feature.getFStaticProperty() != null)
	    {
	        return pp.ppSimplifiedFPropertyInContext(feature.getFStaticProperty()) + 
	        	"\n" +
	        	kdocPrettyPrint(feature.getFStaticProperty().getFTag());
	    }
	    else // return the CallFeature itself
	    {
	        System.err.println("the definition : " + feature.getFName() + feature);
	        return pp.accept(feature).toString();
	    }
	} 
	

	

	/**
	 * @see org.eclipse.jface.text.ITextHover#getHoverRegion(org.eclipse.jface.text.ITextViewer, int)
	 */
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return new Region(offset, 0);
	}

}
