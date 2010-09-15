/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.ComponentInstance;
import org.kermeta.art2.ComponentType;
import org.kermeta.art2.ContainerNode;
import org.kermeta.art2.Port;
import org.kermeta.art2.PortTypeRef;
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
            ComponentInstance instance = Art2Factory.eINSTANCE.createComponentInstance();
            
            ContainerNode node = (ContainerNode) kernel.getUifactory().getMapping().get(nodepanel);
            ComponentType type = (ComponentType) kernel.getUifactory().getMapping().get(p);
            instance.setTypeDefinition(type);
            instance.setName(type.getName()+"-"+new Random().nextInt());
            ComponentPanel insPanel = kernel.getUifactory().createComponentInstance(instance);

            for(PortTypeRef ref : type.getProvided()){
                //INSTANCIATE MODEL ELEMENTS
                Port port = Art2Factory.eINSTANCE.createPort();
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
                Port port = Art2Factory.eINSTANCE.createPort();
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
