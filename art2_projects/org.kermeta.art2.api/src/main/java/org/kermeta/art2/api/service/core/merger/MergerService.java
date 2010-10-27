/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.api.service.core.merger;

import org.kermeta.art2.ContainerRoot;

/**
 *
 * @author ffouquet
 */
public interface MergerService {

    public ContainerRoot merge(ContainerRoot actualModel, ContainerRoot targetModel);

}
