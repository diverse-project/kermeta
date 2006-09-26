/*
 * Created on 3 févr. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.subject;

import org.eclipse.emf.ecore.EObject;


public class FakeReference {

    public FakeReference (Reference reference, String value, EObject fromObject, EObject toObject) {
        this.reference  = reference;
        this.value = value;
        this.fromObject = fromObject;
        this.toObject = toObject;
    }
    
    public Feature getFrom () {
        return reference.getFrom();
    }
    
    public Feature getTo () {
        return reference.getTo();
    }
    
    public String getValue () {
        return value;
    }

    public EObject getFromObject () {
        return fromObject;
    }
    
    public EObject getToObject () {
        return toObject;
    }

    private Reference reference;
    private String value;
    private EObject fromObject;
    private EObject toObject;
}
