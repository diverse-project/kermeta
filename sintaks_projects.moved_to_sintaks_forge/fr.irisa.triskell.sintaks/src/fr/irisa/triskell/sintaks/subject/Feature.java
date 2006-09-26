/*
 * Created on 3 févr. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.subject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Feature {

    public Feature(EClass cl, EStructuralFeature sf) {
    	this.eClass = cl;
    	this.sf = sf;
    }
    
    public Feature (EStructuralFeature sf) {
    	this.sf = sf;
    	this.eClass = null;
    }
    
    public EStructuralFeature getEStructuralFeature() {
    	return sf;
    }
    
    public EClass getEClass() {
    	if(this.eClass == null)
    		return sf.getEContainingClass();
    	else
    		return this.eClass;
    }

    public String getAttributeName () {
        return sf.getName();
    }
    
    public String getClassName () {
    	return sf.getEContainingClass().getName();
    }
    
    public String getText () {
        return text;
    }
    
    public String toString () {
    	StringBuffer tmp = new StringBuffer ();
    	tmp.append(" ");
    	tmp.append(className);
    	tmp.append("@");
    	tmp.append(attributeName);
    	tmp.append(" ");
    	return tmp.toString();
    }

    private String className;
    private String attributeName;
    private String text;
    
    private EClass eClass;
    private EStructuralFeature sf;
}
