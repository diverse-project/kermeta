/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.framework.baselib.channeltype;

import org.kermeta.art2.annotation.ChannelTypeFragment;
import org.kermeta.art2.framework.AbstractChannelFragment;
import org.kermeta.art2.framework.message.Art2Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ffouquet
 */
@ChannelTypeFragment(libName = "Art2BaseChannelType")
public class DefaultServiceChannelType extends AbstractChannelFragment {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Object dispatch(Art2Message msg) {

        if (this.getBindedPorts().size() == 1) {
            return forward(getBindedPorts().get(0), msg);
        } else {
            if (this.getOtherFragments().size() == 1) {
                return forward(getOtherFragments().get(0), msg);
            } else {
                logger.error("No Art2 port or fragment bind on this channel fragment, message lost = ", msg.getContent());
                return null;
            }
        }

    }
}
