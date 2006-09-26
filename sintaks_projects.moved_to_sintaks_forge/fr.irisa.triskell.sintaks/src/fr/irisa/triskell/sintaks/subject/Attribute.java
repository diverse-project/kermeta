/*
 * Created on 3 févr. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.subject;

public class Attribute {

    protected Attribute (Feature feature, Object value) {
        this.feature = feature;
        this.value = value;
    }

    public Feature getFeature() {
        return feature;
    }
    
    public Object getObject () {
        return value;
    }
    
    private Feature feature;
    private Object value;    
}
