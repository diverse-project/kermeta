/*
 * Created on 3 févr. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.subject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


public class Ghost {

    public Ghost (EStructuralFeature from, EStructuralFeature to, String value, EObject fromObject) {
        this.from  = from;
        this.to = to;
        this.value = value;
        this.fromObject = fromObject;
    }
    
    public EStructuralFeature getFrom () {
        return from;
    }
    
    public EStructuralFeature getTo () {
        return to;
    }
    
    public String getValue () {
        return value;
    }

    public EObject getFromObject () {
        return fromObject;
    }
    
    private EStructuralFeature from, to;
    private String value;
    private EObject fromObject;
}
