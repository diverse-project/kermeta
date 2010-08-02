/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import org.kermeta.art2.ContainerNode;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.panel.Art2EditorPanel;
import org.kermeta.art2.ui.framework.elements.NodePanel;

/**
 *
 * @author ffouquet
 */
public class AddNodeCommand implements Command {

    private Art2UIKernel kernel;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    @Override
    public void execute(Object p) {
        ContainerNode newnode = org.kermeta.art2.Art2Factory.eINSTANCE.createContainerNode();
        //CREATE NEW NAME
        newnode.setName("node-"+kernel.getModelHandler().getActualModel().getNodes().size());
        NodePanel newnodepanel = kernel.getUifactory().createComponentNode(newnode);
        kernel.getModelHandler().getActualModel().getNodes().add(newnode);
        kernel.getModelPanel().addNode(newnodepanel);
    }

    

}
