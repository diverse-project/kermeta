/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.command;

import art2.ComponentInstance;
import art2.ContainerNode;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;
import org.kermeta.art2.ui.framework.elements.NodePanel;

/**
 *
 * @author ffouquet
 */
public class MoveComponentCommand implements Command {

    private NodePanel nodepanel;
    private Art2UIKernel kernel;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    public void setNodepanel(NodePanel nodepanel) {
        this.nodepanel = nodepanel;
    }

    @Override
    public void execute(Object p) {
        if (p instanceof ComponentPanel) {

            ComponentPanel panel = (ComponentPanel) p ;
            ContainerNode node = (ContainerNode) kernel.getUifactory().getMapping().get(nodepanel);
            ComponentInstance type = (ComponentInstance) kernel.getUifactory().getMapping().get(p);

            if(!node.getComponents().contains(type)){
                panel.getParent().remove(panel);
                nodepanel.add(panel);
                node.getComponents().add(type);
            }
        }
    }
}
