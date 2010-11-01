/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.command;

import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.Channel;
import org.kermeta.art2.ChannelType;
import org.kermeta.art2.ComponentInstance;
import org.kermeta.art2.ComponentType;
import org.kermeta.art2.ContainerNode;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.MBinding;
import org.kermeta.art2.Port;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;
import org.kermeta.art2.ui.framework.elements.ChannelPanel;
import org.kermeta.art2.ui.framework.elements.ChannelTypePanel;
import org.kermeta.art2.ui.framework.elements.ModelPanel;
import org.kermeta.art2.ui.framework.elements.NodePanel;
import org.kermeta.art2.ui.framework.elements.PortPanel;
import org.kermeta.art2.ui.framework.elements.PortPanel.PortType;

/**
 *
 * @author ffouquet
 */
public class ClearModelCommand implements Command {

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }
    private Art2UIKernel kernel;

    /* Input expected : Model URI */
    @Override
    public void execute(Object p) {

        ContainerRoot previousModel = Art2Factory.eINSTANCE.createContainerRoot();
        kernel.getModelHandler().setActualModel(previousModel);
        kernel.getModelPanel().clear();
        kernel.getUifactory().flushRegisteredLib();
        kernel.getEditorPanel().getPalette().clear();
        kernel.getEditorPanel().unshowPropertyEditor();
        kernel.getEditorPanel().revalidate();
        kernel.getEditorPanel().repaint();


    }
}
