package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import model.SoiecNodeInfo;
import control.SoiecControl;

/**Represents a tab which displays a tree from the soiec panel**/
public class TreePanel extends JPanel {
	private DynamicTree tree;
	private JScrollPane scroll;
	private JButton addBtn = new JButton("Add");
	private JButton removeBtn = new JButton("Remove");
	private static SoiecControl control;
	private int level;

	public TreePanel(SoiecControl c, int level) {
		super();
		control = c;
		this.level = level;
		setLayout(null);
		tree = new DynamicTree(level);
		initTree();
		scroll = new JScrollPane(tree,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(0, 0, 500, 500);
		addBtn.setBounds(10, 540, 80, 30);
		removeBtn.setBounds(100, 540, 80, 30);
		addBtn.addActionListener(new AddListener());
		removeBtn.addActionListener(new RemoveListener());
		add(scroll);
		add(addBtn);
		add(removeBtn);
	}
	
	public void initTree()
	{
		tree.clear();
		List<SoiecNodeInfo> children = control.getRootChildren();
		switch (level)
		{
		case 3:
			for (int i=0;i<children.size();i++)
			{
				SoiecNodeInfo child = children.get(i);
				DefaultMutableTreeNode node = tree.addObject(null, child, true);
				List<SoiecNodeInfo> children1 = control.getChildren(child);
				for (int j=0;j<children1.size();j++)
					tree.addObject(node,children1.get(j),true);
			}
			break;
		case 4:
			for (int i=0;i<children.size();i++)
			{
				SoiecNodeInfo child = children.get(i);
				DefaultMutableTreeNode node = tree.addObject(null, child, true);
				List<SoiecNodeInfo> children1 = control.getChildren(child);
				for (int j=0;j<children1.size();j++)
				{
					SoiecNodeInfo child1 = children1.get(j);
					DefaultMutableTreeNode node1 = tree.addObject(node,child1,true);
					List<SoiecNodeInfo> children2 = control.getChildren(child1);
					for (int k=0;k<children2.size();k++)
						tree.addObject(node1,children2.get(k),true);
				}
			}
			break;
		case 5:
			for (int i=0;i<children.size();i++)
			{
				SoiecNodeInfo child = children.get(i);
				DefaultMutableTreeNode node = tree.addObject(null, child, true);
				List<SoiecNodeInfo> children1 = control.getChildren(child);
				for (int j=0;j<children1.size();j++)
				{
					SoiecNodeInfo child1 = children1.get(j);
					DefaultMutableTreeNode node1 = tree.addObject(node,child1,true);
					List<SoiecNodeInfo> children2 = control.getChildren(child1);
					for (int k=0;k<children2.size();k++)
					{
						SoiecNodeInfo child2 = children2.get(k);
						DefaultMutableTreeNode node2 = tree.addObject(node1,child2,true);
						List<SoiecNodeInfo> children3 = control.getChildren(child2);
						for (int l=0;l<children3.size();l++)
							tree.addObject(node2,children3.get(l),true);
					}
				}
			}
			break;
		}
	}

	private class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 SoiecNodeInfo child = new SoiecNodeInfo("New node");
			 tree.addObject(child);
			 DefaultMutableTreeNode node = (DefaultMutableTreeNode)(tree.getSelectionPath().getLastPathComponent());
			 control.insertNode(node.getUserObject(), child);
		}
	}

	private class RemoveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object[] node = tree.removeCurrentNode();
			control.removeNode(node[0], node[1]);
		}
	}
	
	public static class MyTreeModel extends DefaultTreeModel {	
		public MyTreeModel(TreeNode root)
		{
			super(root);
		}
		
		public void valueForPathChanged(TreePath path, Object newValue)
		{
			DefaultMutableTreeNode node = (DefaultMutableTreeNode)path.getLastPathComponent();
			SoiecNodeInfo n = (SoiecNodeInfo)node.getUserObject();
			TreePanel.control.updateNode(n, (String)newValue);
			super.valueForPathChanged(path, n);
		}
	}
}
