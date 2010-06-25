package org.entimid.fakeStuff.devices;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Logger;

import javax.swing.JFrame;
import org.entimid.framework.OnOffService;
import org.entimid.framework.SimpleActionService;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.Ports;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractComponentType;

/**
 *
 * @author ffouquet
 */
@Provides({
    @ProvidedPort(name="on",className=SimpleActionService.class),
    @ProvidedPort(name="off",className=SimpleActionService.class),
    @ProvidedPort(name="onoff",className=OnOffService.class)
})
@Requires({
    @RequiredPort(name="log",type=PortType.MESSAGE,optional=true)
})
@ComponentType(libName="fakeLights")
public class FakeSimpleLight extends AbstractComponentType {
	
    @Start
    public void init() {
        logger = Logger.getLogger(this.getClass().getName());
        frame = new MyFrame(Color.RED);
        frame.setVisible(true);
        state = false;
    }

    @Stop
    public void stop() {
        frame.dispose();
        frame = null;
    }

    @Ports({
        @Port(name="on",method="process"),
        @Port(name="onoff",method="on")
    })
    public void lightUp(){
        frame.setColor(Color.green);
        state = true;
    }

    @Ports({
        @Port(name="off",method="process"),
        @Port(name="onoff",method="off")
    })
    public void lightOff(){
        frame.setColor(Color.red);
        state = false;
    }

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    private static Logger logger;
    private MyFrame frame;
    private Boolean state = false;

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    private static class MyFrame extends JFrame {

        private Color c;

        public MyFrame(Color c) {
            super("Couleur " + c.toString());
            this.c = c;
            setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
            pack();
        }

        public void paint(Graphics g) {
            if (g instanceof Graphics2D) {
                Graphics2D g2d = Graphics2D.class.cast(g);
                g2d.setColor(c);
                g2d.fillOval(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
            } else {
                logger.warning("Graphics are not 2D. Instance of:" + g.getClass());
            }
        }

        public final void setColor(Color c) {
            this.c = c;
            repaint();
            Logger.getLogger(this.getName()).info("SetColor "+c.toString());
        }
    }

}
