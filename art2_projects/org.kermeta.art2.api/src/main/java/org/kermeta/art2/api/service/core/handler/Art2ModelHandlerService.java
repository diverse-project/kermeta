package org.kermeta.art2.api.service.core.handler;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;
import org.kermeta.art2.ContainerRoot;

/**
 *
 * @author ffouquet
 */
public interface Art2ModelHandlerService {

    public ContainerRoot getLastModel();

    public void updateModel(ContainerRoot model);

    public List<ContainerRoot> getPreviousModel();

}
