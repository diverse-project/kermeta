/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.baselib.channeltype;

import org.kermeta.art2.annotation.ChannelTypeFragment;
import org.kermeta.art2.framework.AbstractChannelFragment;

/**
 *
 * @author ffouquet
 */
@ChannelTypeFragment(libName="Art2BaseChannelType")
public class DefaultServiceChannelType extends AbstractChannelFragment {

    @Override
    public Object dispatch(Object o, Boolean synchronous) {
        Object returnResult = null;
        returnResult = sendTo(getBindedPorts().get(0), o, synchronous);
        return returnResult;
    }

}
