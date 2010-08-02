/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import org.kermeta.art2.MessageHub;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.HubPanel;

/**
 *
 * @author ffouquet
 */
public class AddHubCommand implements Command {

    private Art2UIKernel kernel;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    @Override
    public void execute(Object p) {
        MessageHub newhub = org.kermeta.art2.Art2Factory.eINSTANCE.createMessageHub();
        //CREATE NEW NAME
        newhub.setName("hub-"+kernel.getModelHandler().getActualModel().getMessageHub().size());
        HubPanel newhubpanel = kernel.getUifactory().createHub(newhub);
        kernel.getModelHandler().getActualModel().getMessageHub().add(newhub);
        kernel.getModelPanel().addHub(newhubpanel);
    }


}
