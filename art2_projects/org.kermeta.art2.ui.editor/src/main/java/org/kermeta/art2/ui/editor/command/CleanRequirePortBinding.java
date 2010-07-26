/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command;

import art2.Binding;
import art2.ComponentInstance;
import art2.Port;
import java.util.ArrayList;
import java.util.List;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.PortPanel;

/**
 *
 * @author ffouquet
 */
public class CleanRequirePortBinding implements Command {

    private Art2UIKernel kernel;
    private PortPanel portpanel;

    public void setPortpanel(PortPanel portpanel) {
        this.portpanel = portpanel;
    }


    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    @Override
    public void execute(Object p) {
        Port port = (Port) kernel.getUifactory().getMapping().get(portpanel);
        ComponentInstance component = (ComponentInstance) port.eContainer();
        if(component.getRequired().contains(port)){
            List<Binding> portBindings = new ArrayList();
            for(Binding b : kernel.getModelHandler().getActualModel().getBindings()){
                if(b.getPorts().contains(port)){
                    portBindings.add(b);
                }
            }
            for(Binding b : portBindings){
                org.kermeta.art2.ui.framework.elements.Binding bp = (org.kermeta.art2.ui.framework.elements.Binding) kernel.getUifactory().getMapping().get(b);
                kernel.getModelPanel().removeBinding(bp);
                kernel.getModelHandler().getActualModel().getBindings().remove(b);
            }
        }
    }

}
