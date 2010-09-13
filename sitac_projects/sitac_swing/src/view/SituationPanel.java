package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import control.SoiecControl;

/**The situation tab from the soiec panel. Uses a JList to display the data**/
public class SituationPanel extends JPanel{
	private JScrollPane scroll = new JScrollPane(
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	private JList list = new JList();
	private JButton addBtn = new JButton("Add");
	private JButton removeBtn = new JButton("Remove selected");
	private JTextField situationText = new JTextField();
	private List<String> desc = new ArrayList<String>();
	private SoiecControl control;
	
	public SituationPanel(List<String> desc, SoiecControl c)
	{
		super();
		control = c;
		setLayout(null);
		this.desc = desc;
		setListModel();
		scroll.setBounds(0, 0, 500, 500);
		scroll.getViewport().setView(list);
		addBtn.setBounds(330,540,80,30);
		removeBtn.setBounds(10,600,150,30);
		situationText.setBounds(10,540,300,30);
		add(scroll);
		add(addBtn);
		add(removeBtn);
		add(situationText);
		removeBtn.addActionListener(new RemoveListener());
		addBtn.addActionListener(new AddListener());
	}
	
	private void setListModel()
	{
		String[] d = new String[desc.size()];
		desc.toArray(d);
		list.setListData(d);
	}
	
	private class RemoveListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			String sel = (String)list.getSelectedValue();
			if (sel != null)
			{
				desc.remove(sel);
				setListModel();
				control.removeNode(sel);
			}
		}
	}
	
	private class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			String d = situationText.getText();
			if (d != null && !d.equals(""))
			{
				situationText.setText("");
				desc.add(d);
				setListModel();
				control.insertNode(d);
			}
		}
	}
}
