package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import org.jdesktop.swingx.JXTreeTable;

import control.MoyenControl;

public class MoyenClipboard extends JPanel {
	private JXTreeTable table;
	private MyTreeTableModel model;
	private JScrollPane scroll;
	private MoyenControl control;
	private JButton addBtn = new JButton("+");
	private ButtonGroup group = new ButtonGroup();
	private JRadioButton engineBtn = new JRadioButton("engine");
	private JRadioButton ambulanceBtn = new JRadioButton("ambulance");
	private JButton groupBtn = new JButton("Group");

	public MoyenClipboard(MoyenControl c) {
		super();
		setLayout(null);
		control = c;
		model = control.createTreeTable();
		table = new JXTreeTable(model);
		table.setRootVisible(false);
		table.setOpenIcon(null);
		table.setClosedIcon(null);
		table.setLeafIcon(null);
		table.getTreeSelectionModel().setSelectionMode(
				TreeSelectionModel.DISCONTIGUOUS_TREE_SELECTION);
		table.setBounds(0, 0, 800, 500);
		scroll = new JScrollPane(table,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(0, 0, 800, 500);
		addBtn.setBounds(120, 520, 50, 50);
		addBtn.addActionListener(new AddListener());
		group.add(engineBtn);
		group.add(ambulanceBtn);
		engineBtn.setBounds(10, 520, 100, 20);
		ambulanceBtn.setBounds(10, 550, 100, 20);
		groupBtn.setBounds(200, 520, 100, 50);
		groupBtn.addActionListener(new GroupListener());
		add(scroll);
		add(addBtn);
		add(engineBtn);
		add(ambulanceBtn);
		add(groupBtn);
	}

	private class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (ambulanceBtn.isSelected())
				control.addMoyen(2, "VSAV");
			else
				control.addMoyen(1, "FPT");
		}
	}

	private class GroupListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			TreePath[] paths = table.getTreeSelectionModel()
					.getSelectionPaths();
			control.groupMoyens(paths);
		}

	}

	public void addChild(MyTreeNode node) {
		model.addChild(node);
	}

	public void update(MyTreeNode node) {
		model.update(node);
	}
	
	public MyTreeNode getRoot()
	{
		return (MyTreeNode)model.getRoot();
	}
}
