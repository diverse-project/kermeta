/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor;

import art2.ComponentInstance;
import art2.ComponentType;
import java.awt.Component;
import javax.swing.JComponent;
import org.kermeta.art2.ui.editor.command.SelectComponentCommand;
import org.kermeta.art2.ui.editor.command.SelectNodeCommand;
import org.kermeta.art2.ui.editor.listener.CommandMouseListener;
import org.kermeta.art2.ui.editor.listener.ComponentDragSourceListener;
import org.kermeta.art2.ui.editor.listener.ComponentTypeDragSourceListener;
import org.kermeta.art2.ui.editor.listener.HubDragTargetListener;
import org.kermeta.art2.ui.editor.listener.NodeDragTargetListener;
import org.kermeta.art2.ui.editor.listener.PortDragSourceListener;
import org.kermeta.art2.ui.editor.listener.PortDragTargetListener;
import org.kermeta.art2.ui.framework.elements.Binding;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;
import org.kermeta.art2.ui.framework.elements.HubPanel;
import org.kermeta.art2.ui.framework.elements.NodePanel;
import org.kermeta.art2.ui.framework.elements.PortPanel;

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

    public ComponentTypePanel createComponentTypeUI(ComponentType ct) {
        ComponentTypePanel ctui = new ComponentTypePanel(ct.getName());
        ComponentTypeDragSourceListener listener = new ComponentTypeDragSourceListener(ctui, kernel);
        mapping.bind(ctui, ct);
        return ctui;
    }

    public ComponentPanel createComponentInstance(ComponentInstance ci) {
        ComponentPanel cui = new ComponentPanel();
        ComponentDragSourceListener draglistener = new ComponentDragSourceListener(cui, kernel);
        cui.setTitle(ci.getName());

        CommandMouseListener listener = new CommandMouseListener();
        SelectComponentCommand command = new SelectComponentCommand();
        command.setKernel(kernel);
        listener.setCommand(command);
        cui.addMouseListener(listener);
        mapping.bind(cui, ci);
        return cui;
    }

    public NodePanel createComponentNode(art2.ContainerNode node) {
        NodePanel nui = new NodePanel();
        ((Component) nui).setDropTarget(new NodeDragTargetListener(nui, kernel));
        nui.setTitle(node.getName());


        CommandMouseListener listener = new CommandMouseListener();
        SelectNodeCommand command = new SelectNodeCommand();
        command.setKernel(kernel);
        listener.setCommand(command);
        nui.addMouseListener(listener);


        mapping.bind(nui, node);
        return nui;
    }

    public HubPanel createHub(art2.MessageHub hub) {
        HubPanel hui = new HubPanel();
        ((Component) hui).setDropTarget(new HubDragTargetListener(hui, kernel));
        hui.setTitle(hub.getName());
        mapping.bind(hui, hub);
        return hui;
    }

    public PortPanel createPort(art2.Port port) {
        PortPanel pui = new PortPanel();
        if (port.getPortTypeRef().getRef() instanceof art2.MessagePortType) {
            pui.setNature(PortPanel.PortNature.MESSAGE);
        }
        if (port.getPortTypeRef().getRef() instanceof art2.ServicePortType) {
            pui.setNature(PortPanel.PortNature.SERVICE);
        }
        pui.setTitle(port.getPortTypeRef().getName());
        new PortDragSourceListener(pui, kernel);
        ((Component) pui).setDropTarget(new PortDragTargetListener(pui, kernel));
        mapping.bind(pui, port);
        return pui;
    }

    public Binding createBinding(art2.Binding mb) {
        Binding bui = new Binding(Binding.Type.simple);
        PortPanel fromPortPanel = (PortPanel) kernel.getUifactory().getMapping().get(mb.getPorts().get(0));
        PortPanel toPortPanel = (PortPanel) kernel.getUifactory().getMapping().get(mb.getPorts().get(1));
        bui.setFrom(fromPortPanel);
        bui.setTo(toPortPanel);
        mapping.bind(bui, mb);
        return bui;
    }

    public Binding createMBinding(art2.MBinding mb) {
        Binding bui = new Binding(Binding.Type.multi);
        PortPanel fromPortPanel = (PortPanel) kernel.getUifactory().getMapping().get(mb.getPort());
        HubPanel toPortPanel = (HubPanel) kernel.getUifactory().getMapping().get(mb.getHub());
        bui.setFrom(fromPortPanel);
        bui.setTo(toPortPanel);
        mapping.bind(bui, mb);
        return bui;
    }
}
