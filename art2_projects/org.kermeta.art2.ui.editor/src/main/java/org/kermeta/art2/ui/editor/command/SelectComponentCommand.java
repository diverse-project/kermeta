/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.command;

import art2.ComponentInstance;
import java.util.List;
import org.kermeta.art2.framework.Art2Utility;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.Binding;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;

/**
 *
 * @author ffouquet
 */
public class SelectComponentCommand implements Command {

    private Art2UIKernel kernel;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    @Override
    public void execute(Object p) {
        if (p instanceof ComponentPanel) {
            ComponentPanel component = (ComponentPanel) p;
            component.setSelected(!component.getSelected());

            art2.ComponentInstance instance = (ComponentInstance) kernel.getUifactory().getMapping().get(component);

            if(component.getSelected()){
                kernel.getEditorPanel().showPropertyFor(component);
            } else {
                kernel.getEditorPanel().unshowPropertyFor(component);
            }

            List<art2.Binding> relatedbinding = Art2Utility.getRelatedBinding(instance, kernel.getModelHandler().getActualModel());

            for(art2.Binding b : relatedbinding){
                Binding belem = (Binding) kernel.getUifactory().getMapping().get(b);
                belem.setSelected(!belem.getSelected());
            }

            kernel.getModelPanel().repaint();
            kernel.getModelPanel().revalidate();
        }
    }
}
