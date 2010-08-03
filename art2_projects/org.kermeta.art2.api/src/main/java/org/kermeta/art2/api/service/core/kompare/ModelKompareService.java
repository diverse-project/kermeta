/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.api.service.core.kompare;

import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2adaptation.AdaptationModel;

/**
 *
 * @author ffouquet
 */
public interface ModelKompareService {

    public AdaptationModel kompare(ContainerRoot actualModel, ContainerRoot targetModel,String nodeName);
}
