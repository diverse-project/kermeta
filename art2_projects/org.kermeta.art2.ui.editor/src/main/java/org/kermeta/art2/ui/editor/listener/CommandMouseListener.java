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

    private Command leftClickCommand, rightClickCommand;

    public void setLeftClickCommand(Command command) {
        this.leftClickCommand = command;
    }

    public void setRightClickCommand(Command command) {
        this.rightClickCommand = command;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("MouseListener::MouseClicked::"+e.getButton());
        switch(e.getButton()) {
            case MouseEvent.BUTTON1 : {
                if(leftClickCommand != null) {
                    System.out.println("MouseListener::MouseClicked::executeLeftClickCommand");
                    leftClickCommand.execute(e.getComponent());
                }
            }break;
            case MouseEvent.BUTTON3 : {
                if(rightClickCommand != null) {
                    System.out.println("MouseListener::MouseClicked::executeRightClickCommand");
                    rightClickCommand.execute(e.getComponent());
                }
            }break;
        }
        
    }
}
