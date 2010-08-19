/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.command;

import org.kermeta.art2.Binding;
import org.kermeta.art2.ComponentInstance;
import org.kermeta.art2.ContainerNode;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.MBinding;
import org.kermeta.art2.MessageHub;
import org.kermeta.art2.Port;
import org.kermeta.art2.PortTypeRef;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;
import org.kermeta.art2.ui.framework.elements.HubPanel;
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

        /* Synch every UI Component */
        //LOAD COMPONENT TYPE
        kernel.getEditorPanel().getPalette().clear();
        for (org.kermeta.art2.ComponentTypeLibrary ctl : kernel.getModelHandler().getActualModel().getLibraries()) {
            for (org.kermeta.art2.ComponentType ct : ctl.getSubComponentTypes()) {
                ComponentTypePanel ctp = kernel.getUifactory().createComponentTypeUI(ct);
                kernel.getEditorPanel().getPalette().addComponentTypePanel(ctp, ctl.getName());
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
        for (MessageHub hub : kernel.getModelHandler().getActualModel().getMessageHub()) {
            HubPanel newhubpanel = kernel.getUifactory().createHub(hub);
            kernel.getModelPanel().addHub(newhubpanel);
        }
        
        //LOAD BINDING
        for (Binding binding : kernel.getModelHandler().getActualModel().getBindings()) {
            org.kermeta.art2.ui.framework.elements.Binding uib = kernel.getUifactory().createBinding(binding);
            kernel.getModelPanel().addBinding(uib);
        }

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
