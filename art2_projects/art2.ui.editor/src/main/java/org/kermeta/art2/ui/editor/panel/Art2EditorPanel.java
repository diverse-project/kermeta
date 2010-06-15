/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.panel;

import art2.ComponentType;
import art2.ContainerRoot;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Point;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.painter.CompoundPainter;
import org.jdesktop.swingx.painter.MattePainter;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.listener.ComponentTypeDragSourceListener;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;

/**
 *
 * @author ffouquet
 */
public class Art2EditorPanel extends JPanel {

    private Art2UIKernel kernel = new Art2UIKernel();
    private JXPanel leftpanel = new JXPanel();
    private ComponentTypePalette palette = new ComponentTypePalette();
    private CommandPanel commandPanel;

    public Art2EditorPanel() {

               


        leftpanel.setOpaque(false);
        leftpanel.setLayout(new BoxLayout(leftpanel, BoxLayout.PAGE_AXIS));
        GradientPaint grad = new GradientPaint(new Point(0, 0), new Color(60, 60, 60), new Point(0, getHeight()), new Color(51, 51, 51));
        MattePainter matte = new MattePainter(grad);
        CompoundPainter p = new CompoundPainter(matte);
        leftpanel.setBackgroundPainter(p);

        this.setLayout(new BorderLayout());


        JScrollPane scrollpane = new JScrollPane();
        scrollpane = new JScrollPane();
        scrollpane.setOpaque(false);
        //scrollpane.setPreferredSize(new Dimension(200, 400));
        //scrollpane.setLayout(new ScrollPaneLayout());
        scrollpane.getViewport().add(kernel.getModelPanel());
        //scrollpane.setAutoscrolls(true);


        this.add(scrollpane, BorderLayout.CENTER);

        /* LEFT BAR GENERATION */
        commandPanel = new CommandPanel(kernel);
        TrashPanel trash = new TrashPanel();
        leftpanel.add(palette);
        leftpanel.add(commandPanel);
        leftpanel.add(trash);

        this.add(leftpanel, BorderLayout.WEST);

    }

    public void load(String uri) {
        ContainerRoot nroot = Art2XmiHelper.load(uri);
        kernel.getModelHandler().merge(nroot);
        for (ComponentType ct : kernel.getModelHandler().getActualModel().getComponentTypes()) {
            ComponentTypePanel ctp = kernel.getUifactory().createComponentTypeUI(ct);
            palette.addComponentTypePanel(ctp);
        }
        //TODO CLEAN PALETTE

        //Art2XmiHelper.save("/Users/ffouquet/NetBeansProjects/Entimid/org.entimid.fakeStuff/art2Merged.xmi", kernel.getModelHandler().getActualModel());
    }

   

}
