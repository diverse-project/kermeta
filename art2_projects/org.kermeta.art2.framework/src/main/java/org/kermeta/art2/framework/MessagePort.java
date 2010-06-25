/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework;

import org.apache.camel.InOnly;

@InOnly
public interface MessagePort extends Port {

    @InOnly
    public void process(Object obj);

}




