/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.entimid.fakeStuff.devices;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.entimid.framework.SimpleActionService;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractComponentType;

/**
 *
 * @author ffouquet
 */
@Requires({
    @RequiredPort(name="on",className=SimpleActionService.class),
    @RequiredPort(name="off",className=SimpleActionService.class)
})
@ComponentType
public class FakeSimpleSwitch extends AbstractComponentType {

    private static final int SWITCH_WIDTH = 50;
    private static final int SWITCH_HEIGHT = 100;
    private MyFrame frame = null;

    @Start
    public void init() {
        frame = new MyFrame("on", "off");
        frame.setVisible(true);
    }

    @Stop
    public void stop() {
        frame.dispose();
        frame = null;
    }

    private class MyFrame extends JFrame {

        private JButton on, off;
        private String onText;
        private String offText;

        public MyFrame(final String onText, final String offText) {

            this.onText = onText;
            this.offText = offText;
            setPreferredSize(new Dimension(SWITCH_WIDTH, SWITCH_HEIGHT));
            setLayout(new FlowLayout());
            on = new JButton(onText);
            on.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getPortByName("on", SimpleActionService.class).process();
                }
            });

            off = new JButton(offText);
            off.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getPortByName("off", SimpleActionService.class).process();
                }
            });

            ButtonGroup bg = new ButtonGroup();
            bg.add(on);
            bg.add(off);

            setLayout(new FlowLayout());
            add(on);
            add(off);

            pack();
            setVisible(true);
        }

        @Override
        public void repaint() {
            on.setText(onText);
            off.setText(offText);
            super.repaint();
        }

        /**
         * @param onText the onText to set
         */
        public final void setOnText(String onText) {
            this.onText = onText;
        }

        /**
         * @param offText the offText to set
         */
        public final void setOffText(String offText) {
            this.offText = offText;
        }
    }
}
