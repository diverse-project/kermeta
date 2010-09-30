/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework;

import org.kermeta.art2.framework.message.Art2Message;

/**
 *
 * @author ffouquet
 */
public interface ChannelFragment {

    public Object dispatch(Art2Message msg);

}
