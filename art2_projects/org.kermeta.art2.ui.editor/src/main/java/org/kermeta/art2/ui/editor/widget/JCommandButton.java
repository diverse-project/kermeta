/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */

package org.kermeta.art2.ui.editor.widget;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import org.kermeta.art2.ui.editor.command.Command;

/**
 *
 * @author ffouquet
 */
public class JCommandButton extends JButton {

    private Command command ;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public JCommandButton(final String title){
        this.setText(title);
        this.setOpaque(false);
        this.addMouseListener(new MouseAdapter() {
        @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                command.execute(title);
            }
        });

    }

}
