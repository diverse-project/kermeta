/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.port;

import org.kermeta.language.structure.ModelingUnit;

/**
 *
 * @author ffouquet
 */
public interface PortKermetaCore {

    /*TODO CREATE KERMETA PROJECT*/
    public void load(String kermetaProject);

    public void reload(String uri);

    public ModelingUnit getLastFullMergedModel();

    //TODO CREATE ACCESSOR TO KermetaProject
    

}
