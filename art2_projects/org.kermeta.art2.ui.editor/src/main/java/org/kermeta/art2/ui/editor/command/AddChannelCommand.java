/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import java.awt.Point;
import org.kermeta.art2.Channel;
import org.kermeta.art2.ChannelType;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.ChannelPanel;

/**
 *
 * @author ffouquet
 */
public class AddChannelCommand implements Command {

    private Art2UIKernel kernel;

    private Point point = null;

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    public void setPoint(Point p) {
        this.point = p;
    }

    @Override
    public void execute(Object p) {
        Channel newhub = org.kermeta.art2.Art2Factory.eINSTANCE.createChannel();
        ChannelType type = (ChannelType) kernel.getUifactory().getMapping().get(p);
        newhub.setTypeDefinition(type);

        //CREATE NEW NAME
        newhub.setName("hub-" + kernel.getModelHandler().getActualModel().getHubs().size());
        ChannelPanel newhubpanel = kernel.getUifactory().createHub(newhub);
        kernel.getModelHandler().getActualModel().getHubs().add(newhub);
        kernel.getModelPanel().addHub(newhubpanel);

        if ((point.x - newhubpanel.getPreferredSize().getHeight()/2 > 0 ) && (point.y - newhubpanel.getPreferredSize().getHeight()/2 > 0 )  ){
            newhubpanel.setLocation( (int)(point.x - newhubpanel.getPreferredSize().getHeight()/2), (int)(point.y - newhubpanel.getPreferredSize().getWidth()/2));
        } else {
            newhubpanel.setLocation(point.x, point.y);
        }

    }
}
