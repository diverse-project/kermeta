/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.property;

import org.kermeta.art2.ContainerNode;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.command.SynchPlatformCommand;
import org.kermeta.art2.ui.editor.widget.JCommandButton;

/**
 *
 * @author ffouquet
 */
public class NodePropertyEditor extends NamedElementPropertyEditor {
    public NodePropertyEditor(org.kermeta.art2.NamedElement elem, Art2UIKernel _kernel) {
        super(elem, _kernel);

        ContainerNode node = (ContainerNode) elem;

        JCommandButton btPush = new JCommandButton("PushModel");
        SynchPlatformCommand send = new SynchPlatformCommand();
        send.setKernel(_kernel);
        send.setDestNodeName(node.getName());
        btPush.setCommand(send);
        this.addCenter(btPush);

    }
}
