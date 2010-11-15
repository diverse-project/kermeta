/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.kompare;

import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.annotation.*;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2adaptation.AdaptationModel;

/**
 *
 * @author ffouquet
 */
@Provides({
    @ProvidedPort(name = "kompareService", type = PortType.SERVICE, className = org.kermeta.art2.api.service.core.kompare.ModelKompareService.class)
})
@Library(name = "ART2Core")
@ComponentType
public class Art2KompareComponent extends AbstractComponentType {

    private Art2KompareBean bean = new Art2KompareBean();

    @Start
    public void start() {
    }

    @Stop
    public void stop() {
    }

    @Port(name="kompareService",method="kompare")
    public AdaptationModel kompare(ContainerRoot actualModel, ContainerRoot targetModel, String nodeName) {
        return bean.kompare(actualModel, targetModel, nodeName);
    }
}
