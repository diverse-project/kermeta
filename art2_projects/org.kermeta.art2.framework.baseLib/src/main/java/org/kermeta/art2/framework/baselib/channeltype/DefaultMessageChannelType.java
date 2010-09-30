/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.baselib.channeltype;

import org.kermeta.art2.annotation.ChannelTypeFragment;
import org.kermeta.art2.framework.AbstractChannelFragment;
import org.kermeta.art2.framework.Art2ChannelFragment;
import org.kermeta.art2.framework.Art2Port;
import org.kermeta.art2.framework.message.Art2Message;

/**
 *
 * @author ffouquet
 */
@ChannelTypeFragment(libName="Art2BaseChannelType")
public class DefaultMessageChannelType extends AbstractChannelFragment {

    @Override
    public Object dispatch(Art2Message msg) {
        
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


    
}
