package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import control.Ctrl;

public class RemoveLibrary extends JPanel {
	private JButton removeLine = new JButton("Remove line");
	private JButton removeZone = new JButton("Remove zone");
	private JButton removeItem = new JButton("Remove item");
	private JButton changeItem = new JButton("Change item type");
	private JButton undo = new JButton("Undo");
	private JButton redo = new JButton("Redo");
	private Ctrl controller;

	public RemoveLibrary(Ctrl c) {
		super();
		controller = c;
		setLayout(null);
		ActionListener listener = new ButtonListener();
		removeLine.setBounds(30, 10, 140, 20);
		removeLine.addActionListener(listener);
		removeZone.setBounds(30, 40, 140, 20);
		removeZone.addActionListener(listener);
		removeItem.setBounds(30, 70, 140, 20);
		removeItem.addActionListener(listener);
		changeItem.setBounds(30, 100, 140, 20);
		changeItem.addActionListener(listener);
		undo.setBounds(30, 150, 140, 20);
		undo.addActionListener(listener);
		redo.setBounds(30, 180, 140, 20);
		redo.addActionListener(listener);
		add(removeLine);
		add(removeZone);
		add(removeItem);
		add(changeItem);
		add(undo);
		add(redo);
	}

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == removeLine)
				controller.removeLine();
			else if (e.getSource() == removeZone)
				controller.removeZone();
			else if (e.getSource() == removeItem)
				controller.removeItem();
			else if (e.getSource() == changeItem)
				controller.changeItemType();
			else if (e.getSource() == undo)
				controller.undo();
			else if (e.getSource() == redo)
				controller.redo();
		}
	}
}
