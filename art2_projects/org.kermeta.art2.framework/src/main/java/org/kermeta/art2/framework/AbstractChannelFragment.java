/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework;

/**
 *
 * @author ffouquet
 */
public abstract class AbstractChannelFragment {

    abstract public Object dispatch(Object o, Boolean synchronous);

    public java.util.List<Art2Port> getBindedPorts(){return null;} //OVERRIDE BY FACTORY

    public java.util.List<Art2ChannelFragment> getOtherFragments(){return null;} //OVERRIDE BY FACTORY

    public Object sendTo(Art2Actor delegate, Object o,Boolean synchronous){return null;} //OVERRIDE BY FACTORY

}
