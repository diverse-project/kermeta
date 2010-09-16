/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.baselib.channeltype;

import org.kermeta.art2.annotation.ChannelTypeFragment;
import org.kermeta.art2.framework.AbstractChannelFragment;
import org.kermeta.art2.framework.Art2Port;

/**
 *
 * @author ffouquet
 */
@ChannelTypeFragment(libName="Art2BaseChannelType")
public class DefaultMessageChannelType extends AbstractChannelFragment {
    
    @Override
    public Object dispatch(Object o, Boolean synchronous) {
        
        for(Art2Port p : getBindedPorts()){
            sendTo(p, o, synchronous);
        }



        return null;

        

    }


    
}
