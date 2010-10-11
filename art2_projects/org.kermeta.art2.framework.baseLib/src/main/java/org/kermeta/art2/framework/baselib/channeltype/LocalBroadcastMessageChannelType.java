/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.baselib.channeltype;

import org.kermeta.art2.annotation.ChannelTypeFragment;
import org.kermeta.art2.framework.AbstractChannelFragment;
import org.kermeta.art2.framework.Art2Port;
import org.kermeta.art2.framework.message.Art2Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ffouquet
 */
@ChannelTypeFragment(libName="Art2BaseChannelType")
public class LocalBroadcastMessageChannelType extends AbstractChannelFragment {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Object dispatch(Art2Message msg) {

        /* WARNING FOR REMOTE BINDING */
        if(getOtherFragments().isEmpty()){
            logger.warn("No remote consumer allowed with this binding=");
        }

        /* WARNING FOR LOCAL BINDING */
        if(getBindedPorts().isEmpty()){
            logger.warn("No consumer, msg lost="+msg.getContent());
        }

        for(Art2Port p : getBindedPorts()){
            forward(p, msg);
        }

        //ALWAYS RETURN NULL - InOnly channel
        return null;
    }

}
