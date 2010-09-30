/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework;

import org.kermeta.art2.framework.message.*;

/**
 *
 * @author ffouquet
 */
public abstract class AbstractChannelFragment {

    abstract public Object dispatch(Art2Message msg);

    public java.util.List<Art2Port> getBindedPorts(){return null;} //OVERRIDE BY FACTORY

    public java.util.List<Art2ChannelFragment> getOtherFragments(){return null;} //OVERRIDE BY FACTORY

    public Object sendTo(Art2Actor delegate, Object o,Boolean synchronous){return null;} //OVERRIDE BY FACTORY

}
