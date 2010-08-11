package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import control.Ctrl;

public class TabView extends JFrame {
	private JTabbedPane tab;
	private MapWidget map;
	private ChatPanel chat;
	private JPanel mapPanel;
	private LibToolBox toolbox;

	public TabView(Ctrl c) {
		super();
		/*try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}*/
		tab = new JTabbedPane();
		mapPanel = new JPanel();
		mapPanel.setLayout(null);
		toolbox = new LibToolBox(c);
		chat = new ChatPanel();
		map = new MapWidget(12, 48.1, -1.7, c);
		map.getMap().setBounds(10, 10, 610, 690);
		toolbox.getDesk().setBounds(630, 10, 200, 690);
		mapPanel.add(map.getMap());
		mapPanel.add(toolbox.getDesk());
		tab.addTab("Map", mapPanel);
		tab.add("Chat", chat);
		this.getContentPane().add(tab);
		this.setSize(850, 770);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JTabbedPane getTab() {
		return tab;
	}
	
	public MapWidget getMap()
	{
		return map;
	}
}
