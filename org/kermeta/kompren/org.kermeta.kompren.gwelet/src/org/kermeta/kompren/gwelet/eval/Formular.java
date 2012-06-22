package org.kermeta.kompren.gwelet.eval;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

public class Formular extends JPanel {
	private static final long serialVersionUID = 1L;

	protected QuestionsPanel questionsPanel;
	
	protected JScrollPane diagramPane;

	protected JFrame frame;
	
	protected JPanel toolbar;
	
	protected JSpinner ageS;
	
	protected JComboBox sexCB;
	
	protected JComboBox statusCB;
	
	protected JComboBox xpMdeCB;
	
	protected JComboBox xpUmlCB;
	
	protected JButton validateB;
	
	
	public Formular(final QuestionsPanel questionsPanel, final JScrollPane scrollPane, final JPanel toolbar, final JFrame frame) {
		super();
		
		this.toolbar		= toolbar;
		this.frame			= frame;
		this.questionsPanel = questionsPanel;
		this.diagramPane	= scrollPane;
		createFormular();
		this.toolbar.setVisible(false);
		this.questionsPanel.setVisible(false);
		diagramPane.setVisible(false);
	}
	
	
	
	protected void createFormular() {
  		GridBagConstraints constraint = new GridBagConstraints();
    	constraint.gridx = 0;  		constraint.gridy = 0;
     	constraint.gridwidth = 1; 	constraint.gridheight = 1;
     	constraint.weightx = 0.1; 	constraint.weighty = 0.1;
     	constraint.fill = GridBagConstraints.HORIZONTAL;
     	constraint.anchor = GridBagConstraints.WEST;
     	
     	JPanel questionsP = new JPanel();
     	questionsP.setBorder(new TitledBorder("Required Information"));
     	questionsP.setLayout(new GridBagLayout());
     	questionsP.add(new JLabel("Age:"), constraint);
     	constraint.gridx++;
     	
		ageS = new JSpinner(new SpinnerNumberModel(20, 1, 200, 1));
		questionsP.add(ageS, constraint);
		constraint.gridx=0;
		constraint.gridy++;
		
		questionsP.add(new JLabel("Gender:"), constraint);
		constraint.gridx++;
		
		sexCB = new JComboBox(new String[]{"Male", "Female"});
		questionsP.add(sexCB, constraint);
		constraint.gridx=0;
		constraint.gridy++;
		
		questionsP.add(new JLabel("Status:"), constraint);
		constraint.gridx++;
		
		statusCB = new JComboBox(new String[]{"Student", "Ph.D. student", "Engineer", "Researcher"});
		questionsP.add(statusCB, constraint);
		constraint.gridx=0;
		constraint.gridy++;
		
		questionsP.add(new JLabel("MDE background:"), constraint);
		constraint.gridx++;
		
		xpMdeCB = new JComboBox(new String[]{"None", "0-2 years", "2-5 years", "5-10 years", "+10 years"});
		questionsP.add(xpMdeCB, constraint);
		constraint.gridx=0;
		constraint.gridy++;
		
		questionsP.add(new JLabel("UML background:"), constraint);
		constraint.gridx++;
		
		xpUmlCB = new JComboBox(new String[]{"No knowledge", "Few knowledge", "Some knowledge", "Expert"});
		questionsP.add(xpUmlCB, constraint);
		constraint.gridx=0;
		constraint.gridy++;
     	
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		JPanel buttonP = new JPanel();
		validateB = new JButton("Validate");
		buttonP.add(validateB);
		validateB.addActionListener(new ValideListener());
		
		add(questionsP);
		add(buttonP);
	}
	
	
	class ValideListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			Formular.this.setVisible(false);
			Formular.this.diagramPane.setVisible(true);
			Formular.this.questionsPanel.setVisible(true);
			Formular.this.toolbar.setVisible(false);
			Formular.this.frame.pack();
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			Formular.this.frame.setLocation((screen.width-Formular.this.frame.getWidth())/2, 
											(screen.height-Formular.this.frame.getHeight())/2);
			Formular.this.questionsPanel.setUserInformations(ageS.getValue().toString() + "\t" +
					sexCB.getSelectedItem().toString() + "\t" + statusCB.getSelectedItem().toString() +
					"\t" + xpMdeCB.getSelectedItem().toString() + "\t" + xpUmlCB.getSelectedItem().toString());
		}
		
	}
}
