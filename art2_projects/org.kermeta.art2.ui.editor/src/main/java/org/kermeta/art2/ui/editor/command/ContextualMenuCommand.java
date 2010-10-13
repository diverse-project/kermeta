/* $Id: AddNodeCommand.java 11975 2010-08-02 16:02:55Z dvojtise $ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.ModelPanel;
import org.kermeta.art2.ui.framework.elements.NodePanel;

/**
 *
 * @author ffouquet
 */
public class ContextualMenuCommand implements Command {

    private Art2UIKernel kernel;
    private JPopupMenu current;
    private JPopupMenu modelPanelMenu, nodePanelMenu;
    private MouseListener menuCloser;

    public ContextualMenuCommand() {

        menuCloser = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (current.isVisible()) {
                    kernel.getModelPanel().removeMouseListener(menuCloser);
                    current.setVisible(false);
                }
            }
        };

        createModelPanelContextualMenu();
        createNodePanelContextualMenu();
    }

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    private void createModelPanelContextualMenu() {

        modelPanelMenu = new JPopupMenu();

        JMenuItem addNode = new JMenuItem("Add Node");
        addNode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kernel.getModelPanel().removeMouseListener(menuCloser);
                modelPanelMenu.setVisible(false);
                AddNodeCommand addNodeCommand = new AddNodeCommand();
                addNodeCommand.setKernel(kernel);
                addNodeCommand.execute(e);
            }
        });
        modelPanelMenu.add(addNode);

    }


    private void createNodePanelContextualMenu() {

        nodePanelMenu = new JPopupMenu();

        JMenuItem deploy = new JMenuItem("Deploy");
        deploy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kernel.getModelPanel().removeMouseListener(menuCloser);
                nodePanelMenu.setVisible(false);
            }
        });
        nodePanelMenu.add(deploy);

        JMenuItem delete = new JMenuItem("Delete");
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kernel.getModelPanel().removeMouseListener(menuCloser);
                nodePanelMenu.setVisible(false);
            }
        });
        nodePanelMenu.add(delete);
    }


    @Override
    public void execute(final Object p) {

        System.out.println("ContextualMenuCommand:: called from " + p.getClass().getSimpleName());
        
        if (p instanceof ModelPanel) {
            System.out.println("RightClick on editor panel");
            kernel.getModelPanel().addMouseListener(menuCloser);
            current = modelPanelMenu;
            Point pointer = MouseInfo.getPointerInfo().getLocation();
            current.setLocation(pointer.x, pointer.y);
            current.setVisible(true);

        } else if (p instanceof NodePanel) {
            System.out.println("RichtClick on node");
            kernel.getModelPanel().addMouseListener(menuCloser);
            current = nodePanelMenu;
            Point pointer = MouseInfo.getPointerInfo().getLocation();
            current.setLocation(pointer.x, pointer.y);
            current.setVisible(true);
        }





        /*
         *
         * *************    TO BE REMOVED *****************
         *
        ContainerNode newnode = org.kermeta.art2.Art2Factory.eINSTANCE.createContainerNode();
        //CREATE NEW NAME
        newnode.setName("node-"+kernel.getModelHandler().getActualModel().getNodes().size());
        NodePanel newnodepanel = kernel.getUifactory().createComponentNode(newnode);
        kernel.getModelHandler().getActualModel().getNodes().add(newnode);
        kernel.getModelPanel().addNode(newnodepanel);
         *
         */
    }
}
