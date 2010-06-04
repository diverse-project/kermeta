/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command;

import art2.Binding;
import art2.Port;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.PortPanel;

/**
 *
 * @author ffouquet
 */
public class AddBindingCommand implements Command {

    private Art2UIKernel kernel;
    private PortPanel target;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    public void setTarget(PortPanel target) {
        this.target = target;
    }

    @Override
    public void execute(Object p) {
        if(p instanceof PortPanel){
             PortPanel fromPanel = (PortPanel) p;
             Port fromPort = (Port) kernel.getUifactory().getMapping().get(fromPanel);
             Port targetPort = (Port) kernel.getUifactory().getMapping().get(target);

             //TODO CHECK CONSISTENCY
             Binding newb = art2.Art2Factory.eINSTANCE.createBinding();
             newb.getPorts().add(fromPort);
             newb.getPorts().add(targetPort);

             kernel.getModelHandler().getActualModel().getBindings().add(newb);

             org.kermeta.art2.ui.framework.elements.Binding uib = kernel.getUifactory().createBinding(newb);
             kernel.getModelPanel().addBinding(uib);

        }

       

        
    }

}
