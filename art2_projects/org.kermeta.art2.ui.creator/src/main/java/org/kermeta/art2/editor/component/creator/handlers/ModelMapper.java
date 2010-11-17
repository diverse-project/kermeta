/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.editor.component.creator.handlers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.kermeta.art2.editor.component.creator.model.Art2ModelElement;

/**
 *
 * @author gnain
 */
public class ModelMapper {

    private Map<Art2ModelElement, Object> map;

    public ModelMapper() {
        map = new HashMap<Art2ModelElement, Object>();
    }

    public void put(Art2ModelElement graphicalElement, Object modelElement) {
        map.put(graphicalElement, modelElement);
    }

    public Object getModelElement(Art2ModelElement graphicalElement) {
        return map.get(graphicalElement);
    }

    public Art2ModelElement getGraphicalElement(Object modelElement) {
        for (Map.Entry<Art2ModelElement, Object> e : map.entrySet()) {
            if (e.getValue() == modelElement) {
                return e.getKey();
            }
        }
        return null;
    }

    public void removeModelElement(Art2ModelElement graphicalElement) {
        map.remove(graphicalElement);
    }

    public void removeGraphicalElement(Object modelElement) {
        for (Map.Entry<Art2ModelElement, Object> e : Collections.unmodifiableSet(map.entrySet())) {
            if (e.getValue() == modelElement) {
                map.remove(e.getKey());
                return;
            }
        }
    }

    public void clear() {
        map.clear();
    }
}
