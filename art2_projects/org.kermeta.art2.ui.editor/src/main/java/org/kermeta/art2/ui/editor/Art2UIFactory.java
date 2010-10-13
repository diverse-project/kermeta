/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor;

import org.kermeta.art2.ComponentInstance;
import org.kermeta.art2.ComponentType;
import java.awt.Component;
import org.kermeta.art2.ChannelType;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.framework.aspects.PortAspect;
import org.kermeta.art2.ui.editor.command.ContextualMenuCommand;
import org.kermeta.art2.ui.editor.command.SelectInstanceCommand;
import org.kermeta.art2.ui.editor.listener.ChannelTypeDragSourceListener;
import org.kermeta.art2.ui.editor.listener.CommandMouseListener;
import org.kermeta.art2.ui.editor.listener.ComponentDragSourceListener;
import org.kermeta.art2.ui.editor.listener.ComponentTypeDragSourceListener;
import org.kermeta.art2.ui.editor.listener.HubDragTargetListener;
import org.kermeta.art2.ui.editor.listener.ModelDragTargetListener;
import org.kermeta.art2.ui.editor.listener.NodeDragTargetListener;
import org.kermeta.art2.ui.editor.listener.PortDragSourceListener;
import org.kermeta.art2.ui.editor.listener.PortDragTargetListener;
import org.kermeta.art2.ui.framework.elements.Binding;
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
public class Art2UIFactory {

    private Art2UIKernel kernel;

    public Art2UIFactory(Art2UIKernel _kernel) {
        kernel = _kernel;
    }
    private MappingRepository mapping = new MappingRepository();

    public MappingRepository getMapping() {
        return mapping;
    }

    public ModelPanel createModelPanelUI(ContainerRoot ct) {
        ModelPanel mui = new ModelPanel();
        ((Component) mui).setDropTarget(new ModelDragTargetListener(mui, kernel));

        CommandMouseListener listener = new CommandMouseListener();
        ContextualMenuCommand command = new ContextualMenuCommand();
        command.setKernel(kernel);
        listener.setRightClickCommand(command);
        mui.addMouseListener(listener);

        mapping.bind(mui, ct);
        return mui;
    }

    public ComponentTypePanel createComponentTypeUI(ComponentType ct) {
        ComponentTypePanel ctui = new ComponentTypePanel(ct.getName());
        ComponentTypeDragSourceListener listener = new ComponentTypeDragSourceListener(ctui, kernel);
        mapping.bind(ctui, ct);
        return ctui;
    }

    public ChannelTypePanel createChannelTypeUI(ChannelType ct) {
        ChannelTypePanel ctui = new ChannelTypePanel();
        ctui.setTitle(ct.getName());
        ChannelTypeDragSourceListener listener = new ChannelTypeDragSourceListener(ctui, kernel);
        mapping.bind(ctui, ct);
        return ctui;
    }

    public ComponentPanel createComponentInstance(ComponentInstance ci) {
        ComponentPanel cui = new ComponentPanel();
        ComponentDragSourceListener draglistener = new ComponentDragSourceListener(cui, kernel);
        cui.setTitle(ci.getName());
        cui.setTypeName(ci.getTypeDefinition().getName());

        CommandMouseListener listener = new CommandMouseListener();
        SelectInstanceCommand command = new SelectInstanceCommand();
        command.setKernel(kernel);
        listener.setLeftClickCommand(command);
        cui.addMouseListener(listener);
        mapping.bind(cui, ci);
        return cui;
    }

    public NodePanel createComponentNode(org.kermeta.art2.ContainerNode node) {
        NodePanel nui = new NodePanel();
        ((Component) nui).setDropTarget(new NodeDragTargetListener(nui, kernel));
        nui.setTitle(node.getName() + " : Node");


        CommandMouseListener listener = new CommandMouseListener();
        SelectInstanceCommand command = new SelectInstanceCommand();
        command.setKernel(kernel);
        listener.setLeftClickCommand(command);
        ContextualMenuCommand rightClicCommand = new ContextualMenuCommand();
        rightClicCommand.setKernel(kernel);
        listener.setRightClickCommand(rightClicCommand);
        nui.addMouseListener(listener);


        mapping.bind(nui, node);
        return nui;
    }

    public ChannelPanel createHub(org.kermeta.art2.Channel hub) {
        ChannelPanel hui = new ChannelPanel();
        ((Component) hui).setDropTarget(new HubDragTargetListener(hui, kernel));
        hui.setTitle(hub.getName() + " : \n" + hub.getTypeDefinition().getName());


        /* ADD SELECT COMMAND */
        CommandMouseListener mouse_listener = new CommandMouseListener();
        SelectInstanceCommand command = new SelectInstanceCommand();
        command.setKernel(kernel);
        mouse_listener.setLeftClickCommand(command);
        hui.addMouseListener(mouse_listener);

        mapping.bind(hui, hub);
        return hui;
    }

    public PortPanel createPort(org.kermeta.art2.Port port) {
        PortPanel pui = new PortPanel();
        if (port.getPortTypeRef().getRef() instanceof org.kermeta.art2.MessagePortType) {
            pui.setNature(PortPanel.PortNature.MESSAGE);
        }
        if (port.getPortTypeRef().getRef() instanceof org.kermeta.art2.ServicePortType) {
            pui.setNature(PortPanel.PortNature.SERVICE);
        }
        PortAspect pa = new PortAspect(port);
        if (pa.isProvidedPort()) {
            pui.setType(PortType.PROVIDED);
        } else {
            if (pa.isRequiredPort()) {
                pui.setType(PortType.REQUIRED);
            }
        }

        pui.setTitle(port.getPortTypeRef().getName());
        new PortDragSourceListener(pui, kernel);
        ((Component) pui).setDropTarget(new PortDragTargetListener(pui, kernel));
        mapping.bind(pui, port);
        return pui;
    }

    /*
    public Binding createBinding(org.kermeta.art2.Binding mb) {
    Binding bui = new Binding(Binding.Type.simple);
    PortPanel fromPortPanel = (PortPanel) kernel.getUifactory().getMapping().get(mb.getPorts().get(0));
    PortPanel toPortPanel = (PortPanel) kernel.getUifactory().getMapping().get(mb.getPorts().get(1));
    bui.setFrom(fromPortPanel);
    bui.setTo(toPortPanel);
    mapping.bind(bui, mb);
    return bui;
    }*/
    public Binding createMBinding(org.kermeta.art2.MBinding mb) {
        Binding bui = null;
        PortAspect pa = new PortAspect(mb.getPort());
        if (pa.isProvidedPort()) {
            bui = new Binding(Binding.Type.input);
        } else {
            if (pa.isRequiredPort()) {
                bui = new Binding(Binding.Type.ouput);
            }
        }

        PortPanel fromPortPanel = (PortPanel) kernel.getUifactory().getMapping().get(mb.getPort());
        ChannelPanel toPortPanel = (ChannelPanel) kernel.getUifactory().getMapping().get(mb.getHub());
        bui.setFrom(fromPortPanel);
        bui.setTo(toPortPanel);
        mapping.bind(bui, mb);
        return bui;
    }
}
