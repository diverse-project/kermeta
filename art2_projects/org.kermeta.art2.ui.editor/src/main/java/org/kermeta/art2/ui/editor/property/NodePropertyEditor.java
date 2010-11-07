/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.property;

import javax.swing.JTextField;
import org.kermeta.art2.ContainerNode;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.command.*;
import org.kermeta.art2.ui.editor.widget.JCommandButton;

/**
 *
 * @author ffouquet
 */
public class NodePropertyEditor extends NamedElementPropertyEditor {

    public NodePropertyEditor(org.kermeta.art2.NamedElement elem, Art2UIKernel _kernel) {
        super(elem, _kernel);

        ContainerNode node = (ContainerNode) elem;

        JCommandButton btPush = new JCommandButton("PushModelJgroup");
        SynchPlatformCommand send = new SynchPlatformCommand();
        send.setKernel(_kernel);
        send.setDestNodeName(node.getName());
        btPush.setCommand(send);
        this.addCenter(btPush);


        JCommandButton btPushNode = new JCommandButton("PushModelJMDNS");
        SynchNodeCommand sendNode = new SynchNodeCommand();
        sendNode.setKernel(_kernel);
        sendNode.setDestNodeName(node.getName());
        btPushNode.setCommand(sendNode);
        this.addCenter(btPushNode);


        JTextField ip = new JTextField("ip:port");
        JCommandButton btPushNodeIP = new JCommandButton("PushModelIP");
        SynchNodeIPCommand sendNodeIP = new SynchNodeIPCommand();
        sendNodeIP.setField(ip);
        sendNodeIP.setKernel(_kernel);
        sendNodeIP.setDestNodeName(node.getName());
        btPushNodeIP.setCommand(sendNodeIP);
        this.addCenter(ip);
        this.addCenter(btPushNodeIP);



    }
}
