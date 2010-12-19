/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.property;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import org.kermeta.art2.ContainerNode;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.NetworkProperty;
import org.kermeta.art2.NodeLink;
import org.kermeta.art2.NodeNetwork;
import org.kermeta.art2.framework.Art2PlatformHelper;

/**
 *
 * @author ffouquet
 */
public class NetworkPropertyEditor extends JPanel {

    private JPanel add_form_panel = null;
    private ContainerNode _node = null;
    private JPanel listPanel = new JPanel();

    public NetworkPropertyEditor(ContainerNode node) {
        _node = node;
        add_form_panel = new NetworkAddFormEditor(_node, this);
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.setBorder(new LineBorder(Color.WHITE));
        add(add_form_panel);
        this.setOpaque(false);
        listPanel.setOpaque(false);
        add(listPanel);
        this.refresh();
    }

    public void refresh() {
        DefaultListModel listModel = new DefaultListModel();
        ContainerRoot root = (ContainerRoot) _node.eContainer();
        for (NodeNetwork nn : root.getNodeNetworks()) {
            if (nn.getTarget().equals(_node)) {
                for (NodeLink nl : nn.getLink()) {
                    for(NetworkProperty np : nl.getNetworkProperties()){
                        listModel.addElement(np.getName()+"="+np.getValue());
                    }
                }
            }
        }
        JList list = new JList(listModel);
        JScrollPane pane = new JScrollPane(list);
        pane.setPreferredSize(new Dimension(300, 70));
        listPanel.removeAll();
        listPanel.add(pane);
        listPanel.repaint();
        listPanel.revalidate();
    }

    private class NetworkAddFormEditor extends JPanel {

        private ContainerNode _node = null;
        String[] attlistString = {
            org.kermeta.art2.framework.Constants.ART2_PLATFORM_REMOTE_NODE_IP(),
            org.kermeta.art2.framework.Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT(),
            org.kermeta.art2.framework.Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT()
        };
        JComboBox attlist = new JComboBox(attlistString);
        JTextField value = new JTextField();
        JButton bt_add = new JButton("ADD");

        public NetworkAddFormEditor(ContainerNode node, final NetworkPropertyEditor parent) {
            _node = node;
            this.setOpaque(false);
            this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
            this.add(attlist);
            value.setColumns(10);
            this.add(value);
            this.add(bt_add);

            bt_add.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent me) {
                    Art2PlatformHelper.updateNodeLinkProp((ContainerRoot) _node.eContainer(), _node.getName(), _node.getName(), attlist.getSelectedItem().toString(), value.getText(), "", 100);
                    parent.refresh();
                }
            });
        }
    }
}
