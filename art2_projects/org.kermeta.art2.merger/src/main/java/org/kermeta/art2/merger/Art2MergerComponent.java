/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger;

import org.kermeta.art2.ContainerRoot;

/**
 *
 * @author ffouquet
 */
public class Art2MergerComponent implements org.kermeta.art2.api.service.core.merger.MergerService {

    private Art2RootMerger rootMerger = new Art2RootMerger();

    @Override
    public ContainerRoot merge(ContainerRoot actualModel, ContainerRoot targetModel) {
        rootMerger.merge(actualModel, targetModel);
        return actualModel;
    }

}
