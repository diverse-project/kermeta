/* $Id: NamedElementCompletionItem.java,v 1.5 2007-12-17 14:05:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : NamedElementCompletionItem.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 mai 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.completion;

import java.util.Iterator;

import org.eclipse.swt.graphics.Image;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.NamedElementHelper;

import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Using;

/**
 * @author Franck Fleurey
 */
public class NamedElementCompletionItem extends CompletionItem {

    protected NamedElement namedElement;
    
    protected static GetTextVisitor getTextVisitor =  new GetTextVisitor();
    protected static GetImageVisitor getImageVisitor =  new GetImageVisitor();
    
    private KermetaUnit kermetaUnit = null;
    
    public NamedElementCompletionItem(NamedElement n, KermetaUnit kermetaUnit) {
        namedElement = n;
        this.kermetaUnit = kermetaUnit;
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getLabel()
     */
    public String getLabel() {
        return getTextVisitor.accept(namedElement).toString();
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getDescription()
     */
    public String getDescription() {
        return getTextVisitor.getQualifiedName(namedElement);
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getImage()
     */
    public Image getImage() {
        return (Image)getImageVisitor.accept(namedElement);
    }

    
    public String getCompletionText() {
    	String s = NamedElementHelper.qualifiedName(namedElement);
    	boolean found = false;
    	Iterator<String> it = kermetaUnit.getUsings().iterator();
    	while ( ! found && it.hasNext() ) {
    		String using = it.next();
    		if ( s.matches(using + ".+") ) {
    			found = true;
    			s = s.replace(using, "");
    		}
    	}
        return s;
    }
    public int getCursorLocation() {
        return getCompletionText().length();
    }
}
