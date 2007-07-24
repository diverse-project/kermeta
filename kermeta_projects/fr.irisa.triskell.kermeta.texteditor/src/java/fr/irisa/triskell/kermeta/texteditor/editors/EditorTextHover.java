/* $Id: EditorTextHover.java,v 1.23 2007-07-24 13:46:56 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : EditorTextHover.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 feb. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
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
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;


/**
 * @author Franck Fleurey
 */
public class EditorTextHover implements ITextHover, ITextHoverExtension, IInformationControlCreator {

	private KMTEditor editor;

	//////////////////////////
	//////////////////////////
	//		Constructor		//
	//////////////////////////
	//////////////////////////
	public EditorTextHover(KMTEditor editor) {
		super();
		this.editor = editor;		
	}
	//////////////////////////////////
	//////////////////////////////////
	//		End of Constructor		//
	//////////////////////////////////
	//////////////////////////////////

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
	 * @returns the String that appears in the popup bubble on an element focused
	 * by the cursor. 
	 */
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		
	    try {
			IMarker[] markers = editor.getFile().findMarkers(KermetaMarkersHelper.getMarkerType(), true, 2);
			for (int i=0; i<markers.length; i++) {
				int start = MarkerUtilities.getCharStart(markers[i]);
				int end = MarkerUtilities.getCharEnd(markers[i]);
				int offset = hoverRegion.getOffset();
				if (offset >= start && offset <=end) return MarkerUtilities.getMessage(markers[i]);
			}
		} catch (CoreException e) {
			TexteditorPlugin.pluginLog.warn("error computing hover info", e);
		}
		
		/*if (editor.mcunit != null && ((KMTUnit)editor.mcunit).getMctAST() != null) {
		    CompUnit unit = ((KMTUnit)editor.mcunit).getMctAST();
		    KermetaASTNode astnode = (KermetaASTNode)unit.getNodeAt(hoverRegion.getOffset(), hoverRegion.getLength());
		    // TexteditorPlugin.pluginLog.info(" * unit -> " + unit);
		    if (astnode != null) {
		        //TexteditorPlugin.pluginLog.info(" * astnode -> " + astnode);
		        fr.irisa.triskell.kermeta.language.structure.Object fobj = editor.getFObjectForNode(astnode);
		        String ftags = "";

		        // Notify other plugin of this event
		        Iterator it = TexteditorPlugin.getDefault().kermetaEditorEventListeners.iterator();
				while(it.hasNext())
				{
					KermetaEditorEventListener listener = (KermetaEditorEventListener)it.next();
					listener.textHoverCalled(fobj);
				}
				
		        //TexteditorPlugin.pluginLog.info(" * fobj -> " + fobj);
		        if (fobj instanceof Expression)
		        {
		            Expression fexp = (Expression)fobj;
		            // Find the tag of the CallFeature definition!
		            if (fexp instanceof CallFeature)
		            {

		                return ppDefinitionForCallFeature((CallFeature)fexp);
		            }
		            else if (fexp.getStaticType() != null) {
		                Type t = new SimpleType(fexp.getStaticType());
		                //TexteditorPlugin.pluginLog.info(" * Type -> " + t);
		                // return the source code representation or the signature
		                // of the element pointed by the cursor
		                return pp.accept(fobj) + " : " + t + "\n" + ftags;
		            }
		        }
		        else if(fobj instanceof fr.irisa.triskell.kermeta.language.structure.Class){
		        	fr.irisa.triskell.kermeta.language.structure.Class aClass = (fr.irisa.triskell.kermeta.language.structure.Class)fobj;
					ftags = kdocPrettyPrint(aClass.getTypeDefinition().getTag());
					return NamedElementHelper.getMangledQualifiedName(aClass.getTypeDefinition())+ "\n" + ftags;
		        }
		        
		    }
		}*/
		
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
	    {	Tag tag = (Tag)it.next();
	    	pptags += tagdict.containsKey(tag.getValue())?"":pp.accept(tag);
	        tagdict.put(tag.getValue(), "");
	    }
	    if (pptags.startsWith("/**"))
	        pptags = pptags.substring(3, pptags.length()-2);
	    pptags = pptags.replaceAll("(\n)?[ \\t\\x0B\\f\\r]*\\*","$1");
	    return pptags;
	}

	
	/**
	 * Get the definition of the CallFEature :
	 * - FEnumeration
	 * - FClass <- FTypeLiteral ?
	 * - FOperation
	 * - Property
	 */
	private fr.irisa.triskell.kermeta.language.structure.Object getDefinitionForCallFeature(CallFeature feature)
	{
	    if (feature.getStaticOperation() != null)
	    {
	        return feature.getStaticOperation();
	    }
	    if (feature.getStaticProperty() != null)
	    {
	        return feature.getStaticProperty();
	    }
	    else // return the CallFeature itself
	    {
	        System.err.println("the definition : " + feature.getName() + feature);
	        return feature;
	    }
	}
	
	public String ppDefinitionForCallFeature(CallFeature feature)
	{
	    if (feature.getStaticOperation() != null)
	    {
	        //return feature.getFStaticOperation();
	        return pp.ppSimplifiedFOperationInContext(feature.getStaticOperation()) + 
        	"\n" +
        	kdocPrettyPrint(feature.getStaticOperation().getTag());
	    }
	    if (feature.getStaticProperty() != null)
	    {
	        return pp.ppSimplifiedPropertyInContext(feature.getStaticProperty()) + 
	        	"\n" +
	        	kdocPrettyPrint(feature.getStaticProperty().getTag());
	    }
	    else // return the CallFeature itself
	    {
	        System.err.println("the definition : " + feature.getName() + feature);
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
