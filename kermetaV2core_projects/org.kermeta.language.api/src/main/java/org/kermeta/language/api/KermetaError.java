/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api;

/**
 *
 * @author ffouquet
 */
public interface KermetaError {
    public String getMessage();
    public fr.irisa.triskell.kermeta.language.structure.NamedElement getModelElement();
    public KermetaResource getResources();
}
