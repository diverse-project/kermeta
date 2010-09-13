package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import control.Ctrl;
import control.MoyenControl;
import control.SoiecControl;

public class TabView extends JFrame {
	private JTabbedPane tab;
	private MapWidget map;
	private ChatPanel chat;
	private JPanel mapPanel;
	private LibToolBox toolbox;
	private SoiecPanel soiec;
	private MoyenClipboard moyen;

	public TabView(Ctrl c, SoiecControl soiecCtrl, MoyenControl moyenCtrl) {
		super();
		tab = new JTabbedPane();
		mapPanel = new JPanel();
		mapPanel.setLayout(null);
		toolbox = new LibToolBox(c, moyenCtrl);
		chat = new ChatPanel();
		soiec = new SoiecPanel(soiecCtrl);
		soiecCtrl.addView(soiec);
		map = new MapWidget(12, 48.08333, -1.68333, c);
		map.getMap().setBounds(10, 10, 610, 690);
		toolbox.getDesk().setBounds(630, 10, 200, 690);
		mapPanel.add(map.getMap());
		mapPanel.add(toolbox.getDesk());
		moyen = new MoyenClipboard(moyenCtrl);
		moyenCtrl.addView(moyen);
		tab.addTab("Map", mapPanel);
		tab.addTab("SOIEC", soiec);
		tab.addTab("Clipboard", moyen);
		tab.addTab("Chat", chat);
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
	
	public void setDrawLineState(boolean b)
	{
		toolbox.setDrawLineState(b);
	}
	
	public void setDrawZoneState(boolean b)
	{
		toolbox.setDrawZoneState(b);
	}
}
