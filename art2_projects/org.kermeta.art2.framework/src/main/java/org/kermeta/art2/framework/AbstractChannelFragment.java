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
public abstract class AbstractChannelFragment implements ChannelFragment {

    public java.util.List<Art2Port> getBindedPorts(){return null;} //OVERRIDE BY FACTORY

    public java.util.List<Art2ChannelFragment> getOtherFragments(){return null;} //OVERRIDE BY FACTORY

    public Object forward(Art2Actor delegate, Art2Message msg){return null;} //OVERRIDE BY FACTORY

}
