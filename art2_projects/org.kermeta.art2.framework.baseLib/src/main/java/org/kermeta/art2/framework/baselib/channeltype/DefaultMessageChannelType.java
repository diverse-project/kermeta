/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.baselib.channeltype;

import org.kermeta.art2.annotation.ChannelTypeFragment;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractChannelFragment;
import org.kermeta.art2.framework.Art2ChannelFragment;
import org.kermeta.art2.framework.Art2Port;
import org.kermeta.art2.framework.message.Art2Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ffouquet
 */
@Library(name ="art2baselib")
@ChannelTypeFragment
public class DefaultMessageChannelType extends AbstractChannelFragment {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Object dispatch(Art2Message msg) {

        logger.info("Local node bsize"+getBindedPorts().size());

        if(getBindedPorts().isEmpty() && getOtherFragments().isEmpty()){
            logger.warn("No consumer, msg lost="+msg.getContent());
        }

        for(Art2Port p : getBindedPorts()){
            forward(p, msg);
        }
        for(Art2ChannelFragment cf : getOtherFragments()){
            if(!msg.getPassedNodes().contains(cf.getNodeName())){
                forward(cf, msg);
            }
        }

        return null;

        

    }

    @Start
    public void startHello(){
        System.out.println("Hello Channel");
    }
    @Stop
    public void stopHello(){
        System.out.println("Bye Channel");
    }
    
}
