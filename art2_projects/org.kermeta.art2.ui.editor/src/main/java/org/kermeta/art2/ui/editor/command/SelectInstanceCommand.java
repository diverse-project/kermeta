/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import org.kermeta.art2.ComponentInstance;
import java.util.List;
import javax.swing.JPanel;
import org.kermeta.art2.Instance;
import org.kermeta.art2.framework.Art2Utility;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.SelectElement;
import org.kermeta.art2.ui.framework.elements.Binding;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;

/**
 *
 * @author ffouquet
 */
public class SelectInstanceCommand implements Command {

    private Art2UIKernel kernel;
    private static SelectElement alreadySelected = null;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    @Override
    public void execute(Object p) {

        Object bObject = kernel.getUifactory().getMapping().get(p);

        if (bObject instanceof org.kermeta.art2.Instance) {

            org.kermeta.art2.Instance instance = (Instance) bObject;
            
            SelectElement component = (SelectElement) p;
            if (alreadySelected != null && alreadySelected != component ) {
                alreadySelected.setSelected(false);
            }
            alreadySelected = component;


            component.setSelected(!component.getSelected());

            if (component.getSelected()) {
                kernel.getEditorPanel().showPropertyFor((JPanel) component);
            } else {
                kernel.getEditorPanel().unshowPropertyEditor();
            }

            /* 
            List<org.kermeta.art2.MBinding> relatedbinding = Art2Utility.getRelatedBinding(instance, kernel.getModelHandler().getActualModel());
            for (org.kermeta.art2.MBinding b : relatedbinding) {
            Binding belem = (Binding) kernel.getUifactory().getMapping().get(b);
            belem.setSelected(!belem.getSelected());
            }
             */
            kernel.getModelPanel().repaint();
            kernel.getModelPanel().revalidate();
        }
    }
}
