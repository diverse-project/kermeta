/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.panel;

import art2.ContainerRoot;
import art2.NamedElement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Point;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.painter.CompoundPainter;
import org.jdesktop.swingx.painter.MattePainter;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.property.ComponentPropertyEditor;
import org.kermeta.art2.ui.editor.property.NodePropertyEditor;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;
import org.kermeta.art2.ui.framework.elements.NodePanel;

/**
 *
 * @author ffouquet
 */
public class Art2EditorPanel extends JPanel {

    private Art2UIKernel kernel = new Art2UIKernel();
    private JXPanel leftpanel = new JXPanel();
    private JXPanel southpanel = new JXPanel();
    private ComponentTypePalette palette = new ComponentTypePalette();
    private CommandPanel commandPanel;

    public Art2EditorPanel() {
        kernel.setEditorPanel(this);

        leftpanel.setOpaque(false);
        southpanel.setOpaque(false);

        leftpanel.setLayout(new BorderLayout());
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
        leftpanel.add(palette, BorderLayout.CENTER);
        leftpanel.add(commandPanel, BorderLayout.NORTH);
        //leftpanel.add(trash);

        this.add(leftpanel, BorderLayout.WEST);
        this.add(southpanel, BorderLayout.SOUTH);
        southpanel.setVisible(false);

    }

    public void load(String uri) {
        ContainerRoot nroot = Art2XmiHelper.load(uri);
        kernel.getModelHandler().merge(nroot);
        palette.clear();
        for (art2.ComponentTypeLibrary ctl : kernel.getModelHandler().getActualModel().getLibrariy()) {
            for (art2.ComponentType ct : ctl.getSubComponentTypes()) {
                ComponentTypePanel ctp = kernel.getUifactory().createComponentTypeUI(ct);
                palette.addComponentTypePanel(ctp, ctl.getName());
            }
        }
        this.doLayout();
        repaint();
        revalidate();
        //TODO CLEAN PALETTE

        //Art2XmiHelper.save("/Users/ffouquet/NetBeansProjects/Entimid/org.entimid.fakeStuff/art2Merged.xmi", kernel.getModelHandler().getActualModel());
    }

    public void showPropertyFor(JPanel p) {
        southpanel.setVisible(true);
        southpanel.removeAll();
        if (p instanceof ComponentPanel) {
            art2.NamedElement elem = (NamedElement) kernel.getUifactory().getMapping().get(p);
            ComponentPropertyEditor prop = new ComponentPropertyEditor(elem, kernel);
            southpanel.add(prop);
        }
        if (p instanceof NodePanel) {
            art2.ContainerNode elem = (art2.ContainerNode) kernel.getUifactory().getMapping().get(p);
            NodePropertyEditor prop = new NodePropertyEditor(elem, kernel);
            southpanel.add(prop);
        }
    }

    public void unshowPropertyFor(JPanel p) {
        southpanel.setVisible(false);
        southpanel.removeAll();
    }
}
