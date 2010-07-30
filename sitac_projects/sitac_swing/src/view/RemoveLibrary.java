package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RemoveLibrary extends JPanel{
	private JButton removeLine=new JButton("Remove line");
	private JButton removeZone=new JButton("Remove zone");
	
	public RemoveLibrary()
	{
		super();
		setLayout(null);
		ActionListener listener=new ButtonListener();
		removeLine.setBounds(30,10,130,20);
		removeLine.addActionListener(listener);
		removeZone.setBounds(30,40,130,20);
		removeZone.addActionListener(listener);
		add(removeLine);
		add(removeZone);
	}
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource()==removeLine)
			{
				
			}
			else
			{
				
			}
		}
	}
}
