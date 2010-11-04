/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.framework;

import java.util.HashMap;
import org.kermeta.art2.framework.message.Art2Message;

/**
 *
 * @author ffouquet
 */
public interface ChannelFragment {

    public Object dispatch(Art2Message msg);

    public java.util.List<Art2Port> getBindedPorts();

    public java.util.List<Art2ChannelFragment> getOtherFragments();

    public Object forward(Art2Actor delegate, Art2Message msg);

    public HashMap<String, Object> getDictionary();
}
