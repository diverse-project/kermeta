/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.command;

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
public class LoadModelCommand implements Command {

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }
    private Art2UIKernel kernel;

    /* Input expected : Model URI */
    @Override
    public void execute(Object p) {

        ContainerRoot previousModel = Art2XmiHelper.load(p.toString());
        kernel.getModelHandler().setActualModel(previousModel);
        kernel.getModelPanel().clear();

        //HACK :-)
        kernel.getUifactory().getMapping().bind(kernel.getModelPanel(), previousModel);


        /* Synch every UI Component */
        //LOAD COMPONENT TYPE
        kernel.getEditorPanel().getPalette().clear();
        for (org.kermeta.art2.TypeLibrary ctl : kernel.getModelHandler().getActualModel().getLibraries()) {
            for (org.kermeta.art2.TypeDefinition ct : ctl.getSubTypes()) {
                if (ct instanceof ComponentType) {
                    ComponentTypePanel ctp = kernel.getUifactory().createComponentTypeUI((ComponentType) ct);
                    kernel.getEditorPanel().getPalette().addTypeDefinitionPanel(ctp, ctl.getName());
                }
                if (ct instanceof ChannelType) {
                    ChannelTypePanel ctp = kernel.getUifactory().createChannelTypeUI((ChannelType) ct);
                    kernel.getEditorPanel().getPalette().addTypeDefinitionPanel(ctp, ctl.getName());
                }
            }
        }



        //LOAD NODE
        for (ContainerNode newnode : kernel.getModelHandler().getActualModel().getNodes()) {
            NodePanel newnodepanel = kernel.getUifactory().createComponentNode(newnode);
            kernel.getModelPanel().addNode(newnodepanel);
            for (ComponentInstance ci : newnode.getComponents()) {
                ComponentPanel insPanel = kernel.getUifactory().createComponentInstance(ci);
                for (Port portP : ci.getProvided()) {
                    //ADDING NEW PORT TO UI
                    PortPanel portPanel = kernel.getUifactory().createPort(portP);
                    portPanel.setType(PortType.PROVIDED);
                    insPanel.addLeft(portPanel);
                }
                for (Port portR : ci.getRequired()) {
                    //ADDING NEW PORT TO UI
                    PortPanel portPanel = kernel.getUifactory().createPort(portR);
                    portPanel.setType(PortType.REQUIRED);
                    insPanel.addRight(portPanel);
                }
                newnodepanel.add(insPanel);
                //kernel.getModelPanel().add(insPanel);
            }
        }
        //LOAD HUB
        for (Channel hub : kernel.getModelHandler().getActualModel().getHubs()) {
            ChannelPanel newhubpanel = kernel.getUifactory().createHub(hub);
            kernel.getModelPanel().addHub(newhubpanel);
        }

        //LOAD BINDING
        /*
        for (Binding binding : kernel.getModelHandler().getActualModel().getBindings()) {
        org.kermeta.art2.ui.framework.elements.Binding uib = kernel.getUifactory().createBinding(binding);
        kernel.getModelPanel().addBinding(uib);
        }*/

        //LOAD MBINDING
        for (MBinding binding : kernel.getModelHandler().getActualModel().getMBindings()) {
            org.kermeta.art2.ui.framework.elements.Binding uib = kernel.getUifactory().createMBinding(binding);
            kernel.getModelPanel().addBinding(uib);
        }


        //REFRESH UI
        kernel.getEditorPanel().doLayout();
        kernel.getEditorPanel().repaint();
        kernel.getEditorPanel().repaint();

    }
}
