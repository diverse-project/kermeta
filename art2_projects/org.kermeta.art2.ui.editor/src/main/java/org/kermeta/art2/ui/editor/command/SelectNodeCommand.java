/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.NodePanel;

/**
 *
 * @author ffouquet
 */
public class SelectNodeCommand implements Command {

    private Art2UIKernel kernel;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    @Override
    public void execute(Object p) {
        if (p instanceof NodePanel) {
            NodePanel node = (NodePanel) p;
            node.setSelected(!node.getSelected());

            org.kermeta.art2.ContainerNode instance = (org.kermeta.art2.ContainerNode) kernel.getUifactory().getMapping().get(node);

            if (node.getSelected()) {
                kernel.getEditorPanel().showPropertyFor(node);
            } else {
                kernel.getEditorPanel().unshowPropertyFor(node);
            }
        }
    }
}
