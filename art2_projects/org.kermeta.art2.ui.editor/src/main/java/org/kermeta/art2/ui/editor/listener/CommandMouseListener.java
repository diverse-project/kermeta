/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.kermeta.art2.ui.editor.command.Command;

/**
 *
 * @author ffouquet
 */
public class CommandMouseListener extends MouseAdapter {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        command.execute(e.getComponent());
    }
}
