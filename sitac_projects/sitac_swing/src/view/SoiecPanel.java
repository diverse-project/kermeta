package view;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import control.SoiecControl;

public class SoiecPanel extends JTabbedPane {
	private JPanel situation;
	private TreePanel objective;
	private TreePanel idm;
	private TreePanel exec;
	private JPanel cdt = new JPanel();
	private SoiecControl control;

	public SoiecPanel(SoiecControl c) {
		super();
		control = c;
		List<String> desc = control.getRootChildrenDesc();
		situation = new SituationPanel(desc, control);
		objective = new TreePanel(control,3);
		idm = new TreePanel(control,4);
		exec = new TreePanel(control,5);
		
		this.addTab("Situation", situation);
		this.addTab("Objectif", objective);
		this.addTab("IDM", idm);
		this.addTab("Exec", exec);
		this.addTab("Cdt", cdt);
	}
	
	public void updateView()
	{
		objective.initTree();
		idm.initTree();
		exec.initTree();
	}
}
