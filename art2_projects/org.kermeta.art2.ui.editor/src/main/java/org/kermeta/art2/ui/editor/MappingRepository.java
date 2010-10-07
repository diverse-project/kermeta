/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor;

import java.util.HashMap;
import org.eclipse.emf.ecore.EObject;

/**
 *
 * @author ffouquet
 */
public class MappingRepository {

    private HashMap<Object, EObject> uiTOemf = new HashMap<Object, EObject>();
    private HashMap<EObject, Object> emfTOui = new HashMap<EObject, Object>();

    public void unbind(Object uio, EObject emfo){
        uiTOemf.remove(uio);
        emfTOui.remove(emfo);
    }

    public void bind(Object uio, EObject emfo) {
        uiTOemf.put(uio, emfo);
        emfTOui.put(emfo, uio);
    }

    public Object get(Object o) {
        if (uiTOemf.containsKey(o) || emfTOui.containsKey(o)) {
            if (uiTOemf.containsKey(o)) {
                return uiTOemf.get(o);
            }
            if (emfTOui.containsKey(o)) {
                return emfTOui.get(o);
            }

        } else {
            return null;
        }
        return null;
    }
}
