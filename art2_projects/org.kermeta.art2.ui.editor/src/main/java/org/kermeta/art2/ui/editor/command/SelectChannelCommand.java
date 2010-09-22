/* $Id: SelectComponentCommand.java 12431 2010-09-15 14:52:41Z francoisfouquet $ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import org.kermeta.art2.ComponentInstance;
import java.util.List;
import org.kermeta.art2.Channel;
import org.kermeta.art2.framework.Art2Utility;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.Binding;
import org.kermeta.art2.ui.framework.elements.ChannelPanel;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;

/**
 *
 * @author ffouquet
 */
public class SelectChannelCommand implements Command {

    private Art2UIKernel kernel;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    @Override
    public void execute(Object p) {
        if (p instanceof ChannelPanel) {
            ChannelPanel cpanel = (ChannelPanel) p;
            cpanel.setSelected(!cpanel.getSelected());
            org.kermeta.art2.Channel instance = (Channel) kernel.getUifactory().getMapping().get(cpanel);

            if(cpanel.getSelected()){
                kernel.getEditorPanel().showPropertyFor(cpanel);
            } else {
                kernel.getEditorPanel().unshowPropertyFor(cpanel);
            }

            /*
            List<org.kermeta.art2.MBinding> relatedbinding = Art2Utility.getRelatedBinding(instance, kernel.getModelHandler().getActualModel());
            for(org.kermeta.art2.MBinding b : relatedbinding){
                Binding belem = (Binding) kernel.getUifactory().getMapping().get(b);
                belem.setSelected(!belem.getSelected());
            }*/

            kernel.getModelPanel().repaint();
            kernel.getModelPanel().revalidate();
        }
    }
}
