/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.framework.baselib.channeltype;

import org.kermeta.art2.annotation.ChannelTypeFragment;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.framework.AbstractChannelFragment;
import org.kermeta.art2.framework.message.Art2Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ffouquet
 */
@Library(name ="art2baselib")
@ChannelTypeFragment
public class DefaultServiceChannelType extends AbstractChannelFragment {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Object dispatch(Art2Message msg) {

        System.out.println("Ok I will dispatcher !!! 3");
        Object result = null;

        if (this.getBindedPorts().size() == 1) {

            System.out.println("local dispatch");

            result = forward(getBindedPorts().get(0), msg);
        } else {
            if (this.getOtherFragments().size() == 1) {
                result = forward(getOtherFragments().get(0), msg);
            } else {
                logger.error("No Art2 port or fragment bind on this channel fragment, message lost = ", msg.getContent());
            }
        }

        System.out.println("Ok result "+result);
        return result;

    }
}
