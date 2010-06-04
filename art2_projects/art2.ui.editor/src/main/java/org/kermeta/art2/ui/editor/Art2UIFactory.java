/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor;

import art2.ComponentInstance;
import art2.ComponentType;
import java.awt.Component;
import org.kermeta.art2.ui.editor.listener.ComponentTypeDragSourceListener;
import org.kermeta.art2.ui.editor.listener.NodeDragTargetListener;
import org.kermeta.art2.ui.editor.listener.PortDragSourceListener;
import org.kermeta.art2.ui.editor.listener.PortDragTargetListener;
import org.kermeta.art2.ui.framework.elements.Binding;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;
import org.kermeta.art2.ui.framework.elements.NodePanel;
import org.kermeta.art2.ui.framework.elements.PortPanel;

/**
 *
 * @author ffouquet
 */
public class Art2UIFactory {

    private Art2UIKernel kernel ;
    public Art2UIFactory(Art2UIKernel _kernel){
        kernel = _kernel;
    }

    private MappingRepository mapping = new MappingRepository();

    public MappingRepository getMapping() {
        return mapping;
    }    

    public ComponentTypePanel createComponentTypeUI(ComponentType ct){
        ComponentTypePanel ctui = new ComponentTypePanel(ct.getName());
        ComponentTypeDragSourceListener listener = new ComponentTypeDragSourceListener(ctui, kernel);
        mapping.bind(ctui, ct);
        return ctui;
    }

    public ComponentPanel createComponentInstance(ComponentInstance ci){
        ComponentPanel cui = new ComponentPanel();
        cui.setTitle(ci.getName());
        mapping.bind(cui, ci);
        return cui;
    }

    public NodePanel createComponentNode(art2.ContainerNode node){
        NodePanel nui = new NodePanel();
        ((Component)nui).setDropTarget(new NodeDragTargetListener(nui, kernel));
        nui.setTitle(node.getName());
        mapping.bind(nui, node);
        return nui;
    }

    public PortPanel createPort(art2.Port port){
        PortPanel pui = new PortPanel();
        pui.setTitle(port.getName());
        new PortDragSourceListener(pui, kernel);
        ((Component)pui).setDropTarget(new PortDragTargetListener(pui, kernel));
        mapping.bind(pui, port);
        return pui;
    }

    public Binding createBinding(art2.Binding mb){
        Binding bui = new Binding();
        PortPanel fromPortPanel = (PortPanel) kernel.getUifactory().getMapping().get(mb.getPorts().get(0));
        PortPanel toPortPanel = (PortPanel) kernel.getUifactory().getMapping().get(mb.getPorts().get(1));
        bui.setFromPort(fromPortPanel);
        bui.setToPort(toPortPanel);
        mapping.bind(bui, mb);
        return bui;
    }


}
