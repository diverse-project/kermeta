/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command;

import art2.ComponentInstance;
import art2.ComponentType;
import art2.ContainerNode;
import art2.PortTypeRef;
import java.util.Random;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;
import org.kermeta.art2.ui.framework.elements.NodePanel;
import org.kermeta.art2.ui.framework.elements.PortPanel;
import org.kermeta.art2.ui.framework.elements.PortPanel.PortType;

/**
 *
 * @author ffouquet
 */
public class AddComponentCommand implements Command {

    private NodePanel nodepanel;
    private Art2UIKernel kernel;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    public void setNodepanel(NodePanel nodepanel) {
        this.nodepanel = nodepanel;
    }

    @Override
    public void execute(Object p) {
        if(p instanceof ComponentTypePanel){
            ComponentInstance instance = art2.Art2Factory.eINSTANCE.createComponentInstance();
            
            ContainerNode node = (ContainerNode) kernel.getUifactory().getMapping().get(nodepanel);
            ComponentType type = (ComponentType) kernel.getUifactory().getMapping().get(p);
            instance.setComponentType(type);
            instance.setName(type.getName()+"-"+new Random().nextInt());
            ComponentPanel insPanel = kernel.getUifactory().createComponentInstance(instance);

            for(PortTypeRef ref : type.getProvided()){
                //INSTANCIATE MODEL ELEMENTS
                art2.Port port = art2.Art2Factory.eINSTANCE.createPort();
                instance.getProvided().add(port);
                //port.setName(ref.getName());
                port.setPortTypeRef(ref);
                
                //ADDING NEW PORT TO UI
                PortPanel portPanel = kernel.getUifactory().createPort(port);
                portPanel.setType(PortType.PROVIDED);
                insPanel.addLeft(portPanel);
            }
            for(PortTypeRef ref : type.getRequired()){
                //INSTANCIATE MODEL ELEMENTS
                art2.Port port = art2.Art2Factory.eINSTANCE.createPort();
                instance.getRequired().add(port);
                //port.setName(ref.getName());
                port.setPortTypeRef(ref);

                //ADDING NEW PORT TO UI
                PortPanel portPanel = kernel.getUifactory().createPort(port);
                portPanel.setType(PortType.REQUIRED);
                insPanel.addRight(portPanel);
            }


            nodepanel.add(insPanel);
            node.getComponents().add(instance);
        } 
    }

}
