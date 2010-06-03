/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.framework;

import org.jdesktop.swingx.JXTitledSeparator;

/**
 *
 * @author ffouquet
 */
public class RoundedTitledPanel extends RoundPanel {

    public void setTitle(String title){
        JXTitledSeparator titlebar = new JXTitledSeparator();
        titlebar.setTitle(title);
        this.up.add(titlebar);
    }


}
