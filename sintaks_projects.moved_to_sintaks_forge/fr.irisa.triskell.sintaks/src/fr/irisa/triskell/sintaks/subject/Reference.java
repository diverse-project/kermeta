/*
 * Created on 3 févr. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.subject;

import org.eclipse.emf.ecore.EStructuralFeature;

public class Reference {

    public Reference (Feature from, Feature to) {
        this.from = from;
        this.to = to;
    }
    
    public Reference (EStructuralFeature fromSf, EStructuralFeature toSf) {
        this.from = new Feature (fromSf);
        this.to   = new Feature (toSf);
    }

    public Feature getFrom () {
        return from;
    }
    
    public Feature getTo () {
        return to;
    }
    
    private Feature from;
    private Feature to;
}
