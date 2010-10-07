/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.property;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.command.RemoveInstanceCommand;
import org.kermeta.art2.ui.editor.widget.JCommandButton;
import org.kermeta.art2.ui.framework.ThreePartRoundedPanel;
import org.kermeta.art2.ui.framework.TitledElement;

/**
 *
 * @author ffouquet
 */
public class NamedElementPropertyEditor extends ThreePartRoundedPanel {

    private org.kermeta.art2.NamedElement namedElem = null;
    private TitledElement gui = null;
    private Art2UIKernel kernel;

    public NamedElementPropertyEditor(org.kermeta.art2.NamedElement elem, Art2UIKernel _kernel) {
        namedElem = elem;
        kernel = _kernel;
        gui = (TitledElement) kernel.getUifactory().getMapping().get(namedElem);

        JLabel label = new JLabel("name");
        JTextField namefield = new JTextField(20);

        this.addCenter(label);
        this.addCenter(namefield);

        JCommandButton btDelete = new JCommandButton("Delete");
        RemoveInstanceCommand removecmd = new RemoveInstanceCommand(elem);
        removecmd.setKernel(kernel);
        btDelete.setCommand(removecmd);
        this.addCenter(btDelete);

        namefield.setText(namedElem.getName());

        namefield.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    updateName(e.getDocument().getText(0, e.getDocument().getLength()));
                } catch (BadLocationException ex) {
                    Logger.getLogger(NamedElementPropertyEditor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                try {
                    updateName(e.getDocument().getText(0, e.getDocument().getLength()));
                } catch (BadLocationException ex) {
                    Logger.getLogger(NamedElementPropertyEditor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                try {
                    updateName(e.getDocument().getText(0, e.getDocument().getLength()));
                } catch (BadLocationException ex) {
                    Logger.getLogger(NamedElementPropertyEditor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });


    }

    public void updateName(String newname) {
        namedElem.setName(newname);
        gui.setTitle(newname);
    }
}
