/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import org.kermeta.art2.Channel;
import org.kermeta.art2.MBinding;
import org.kermeta.art2.Port;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.ChannelPanel;
import org.kermeta.art2.ui.framework.elements.PortPanel;
import org.kermeta.art2.ui.framework.elements.PortPanel.PortNature;

/**
 *
 * @author ffouquet
 */
public class AddMBindingCommand implements Command {

    private Art2UIKernel kernel;
    private ChannelPanel target;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    public void setTarget(ChannelPanel target) {
        this.target = target;
    }

    @Override
    public void execute(Object p) {
        if (p instanceof PortPanel) {
            PortPanel fromPanel = (PortPanel) p;
           // if (fromPanel.getNature().equals(PortNature.MESSAGE)) {
                Port fromPort = (Port) kernel.getUifactory().getMapping().get(fromPanel);
                Channel targetHub = (Channel) kernel.getUifactory().getMapping().get(target);

                //TODO CHECK CONSISTENCY
                MBinding newb = org.kermeta.art2.Art2Factory.eINSTANCE.createMBinding();
                newb.setPort(fromPort);
                newb.setHub(targetHub);

                kernel.getModelHandler().getActualModel().getMBindings().add(newb);

                org.kermeta.art2.ui.framework.elements.Binding uib = kernel.getUifactory().createMBinding(newb);
                kernel.getModelPanel().addBinding(uib);
          //  }

        }




    }
}
