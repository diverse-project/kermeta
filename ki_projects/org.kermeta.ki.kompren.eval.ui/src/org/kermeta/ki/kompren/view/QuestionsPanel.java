package org.kermeta.ki.kompren.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.kermeta.ki.diagram.view.impl.DiagramView;

public class QuestionsPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	protected EditorPaneAntiAlias questionArea;
	
	protected EditorPaneAntiAlias answerArea;
	
	protected int nbQuestions;
	
	protected int currentNbQuestions;
	
	protected LabelAntiAlias questionLabel;
	
	protected LabelAntiAlias answerLabel;
	
	protected DiagramView diagram;
	
	protected AntiAliasButton startButton;
	
	protected AntiAliasButton answerButton;
	
	protected EditorPaneAntiAlias resultField;
	
	protected EditorPaneAntiAlias resultLabel;
	
//	protected AntiAliasButton emailButton;
	
	public QuestionsPanel(final DiagramView diagram) {
		super();
		
		this.diagram = diagram;
		nbQuestions = 5;
		currentNbQuestions = 0;
//		emailButton = new AntiAliasButton("<html><b>Create an email</b></html>");
//		emailButton.setAlignmentX(CENTER_ALIGNMENT);
//		emailButton.setMaximumSize(new Dimension(200, 50));
//		emailButton.addActionListener(new CreateEmailListener());
		
		resultLabel = new EditorPaneAntiAlias(true);
		resultLabel.setEditable(false);
		resultLabel.setAlignmentX(CENTER_ALIGNMENT);
		resultLabel.setMaximumSize(new Dimension(500, 80));
		
		resultField = new EditorPaneAntiAlias(false);
		resultField.setEditable(false);
		resultField.setBackground(Color.WHITE);
		
		startButton = new AntiAliasButton("<html><font size=\"+2\"><b>Start</b></font></html>");
		startButton.setAlignmentX(CENTER_ALIGNMENT);
		startButton.addActionListener(new ShowAnswerFieldListener());
		startButton.setMaximumSize(new Dimension(120, 50));
		
		answerButton = new AntiAliasButton("<html><font size=\"+2\"><b>Validate Answer</b></font></html>");
		answerButton.setAlignmentX(CENTER_ALIGNMENT);
		answerButton.addActionListener(new ShowQuestionFieldListener());
		answerButton.setMaximumSize(new Dimension(230, 50));
		questionLabel = new LabelAntiAlias();
		questionLabel.setAlignmentX(CENTER_ALIGNMENT);
		questionLabel.setMaximumSize(new Dimension(120, 40));
		answerLabel = new LabelAntiAlias();
		answerLabel.setText("<html><font size=\"+1\"><b>Answer</b></font></html>");
		answerLabel.setAlignmentX(CENTER_ALIGNMENT);
		answerLabel.setMaximumSize(new Dimension(120, 40));
		
		answerArea = new EditorPaneAntiAlias(false);
        answerArea.setPreferredSize(new Dimension(500, 250));
		answerArea.setMaximumSize(new Dimension(500, 250));
		answerArea.setAlignmentX(CENTER_ALIGNMENT);
		answerArea.setBackground(Color.WHITE);
		
		questionArea = new EditorPaneAntiAlias(true);
		questionArea.setBackground(Color.WHITE);
		questionArea.setEditable(false);
		questionArea.setPreferredSize(new Dimension(500, 250));
		questionArea.setMaximumSize(new Dimension(500, 250));
		questionArea.setAlignmentX(CENTER_ALIGNMENT);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(questionLabel);
		add(questionArea);
		add(Box.createVerticalStrut(10));
		add(resultLabel);
//		add(emailButton);
		add(Box.createVerticalStrut(10));
		add(startButton);
		add(Box.createVerticalStrut(15));
		add(answerLabel);
		add(answerArea);
		add(Box.createVerticalStrut(10));
		add(answerButton);
		add(resultField);
		resultLabel.setVisible(false);
		resultField.setVisible(false);
//		emailButton.setVisible(false);
		setNextQuestion();
	}
	
	
	public void setNextQuestion() {
		if(currentNbQuestions<nbQuestions) {
			currentNbQuestions++;
			
			switch(currentNbQuestions) {
				case 1: setQuestion1(); break; 
				case 2: setQuestion2(); break; 
				case 3: setQuestion3(); break; 
				case 4: setQuestion4(); break; 
				case 5: setQuestion5(); break; 
			}
		}
	}
	
	public void setQuestion1() {
		setQuestionMode();
		questionArea.setText("<html><font size=\"10\">First <b>question</b>?</font></html>");
	}

	public void setQuestion2() {
		setQuestionMode();
		questionArea.setText("<html><font size=\"10\">Second <b>question</b>?</font></html>");
	}

	public void setQuestion3() {
		setQuestionMode();
		questionArea.setText("<html><font size=\"10\">Third <b>question</b>?</font></html>");
	}
	
	public void setQuestion4() {
		setQuestionMode();
		questionArea.setText("<html><font size=\"10\">Fourth <b>question</b>?</font></html>");
	}
	
	public void setQuestion5() {
		setQuestionMode();
		questionArea.setText("<html><font size=\"10\">Last <b>question</b>?</font></html>");
	}
	
	
	public void setQuestionMode() {
		questionLabel.setText("<html><font size=\"+1\"><b>Question " + currentNbQuestions + "/" + nbQuestions+"</b></font></html>");
		startButton.setVisible(true);
		answerArea.setVisible(false);
		answerLabel.setVisible(false);
		answerButton.setVisible(false);
		diagram.setUsable(false);
	}
	
	
	public void setAnswerMode() {
		startButton.setVisible(false);
		answerArea.setText("");
		answerArea.setVisible(true);
		answerLabel.setVisible(true);
		answerButton.setVisible(true);
		diagram.setUsable(true);
	}
	
	
	public void setTerminated() {
//		emailButton.setVisible(true);
		startButton.setVisible(false);
		answerArea.setVisible(false);
		answerLabel.setVisible(false);
		answerButton.setVisible(false);
		diagram.setUsable(false);
		questionArea.setVisible(false);
		questionLabel.setVisible(false);
		resultField.setVisible(true);
		resultLabel.setVisible(true);
		resultField.setText("result");
		resultLabel.setText("<html><center>Return the results by mail to:<br><b>arnaud.blouin@inria.fr</b><br>A backup of the results called \"data.txt\"<br>has been created near the jar file you launch.</center></html>");
		Dimension dim = new Dimension(500, 500);
		resultField.setPreferredSize(dim);
		resultField.setMinimumSize(dim);
	}
	
	
//	class CreateEmailListener implements ActionListener {
//		@Override
//		public void actionPerformed(final ActionEvent e) {
//			try {
//			Desktop desktop = Desktop.getDesktop();
//			desktop.mail(new URI("mailto:arnaud.blouin@inria.fr"));
//			} catch(Exception ex) { ex.printStackTrace(); }
//		}
//	}
	

	class ShowAnswerFieldListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			QuestionsPanel.this.setAnswerMode();
		}
	}
	
	
	class ShowQuestionFieldListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			if(QuestionsPanel.this.currentNbQuestions<QuestionsPanel.this.nbQuestions)
				QuestionsPanel.this.setNextQuestion();
			else {
				QuestionsPanel.this.setTerminated();
			}
		}
	}
}


class EditorPaneAntiAlias extends JEditorPane {
	private static final long serialVersionUID = 1L;

	public EditorPaneAntiAlias(boolean html) {
		super(html ? "text/html" : "text", "");
	}
	
	@Override
	public void paint (Graphics g) {
        if(g instanceof Graphics2D) {
        	Graphics2D g2 = (Graphics2D) g;
        	g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        	g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        	g2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        	g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        }
        super.paint (g);
    }
}


class AntiAliasButton extends JButton {
	private static final long serialVersionUID = 1L;
	
	public AntiAliasButton(String text) {
		super(text);
	}
	
	@Override
	public void paint (Graphics g) {
        if(g instanceof Graphics2D) {
        	Graphics2D g2 = (Graphics2D) g;
        	g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        	g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        	g2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        	g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        }
        super.paint (g);
    }
}



class LabelAntiAlias extends JLabel {
	private static final long serialVersionUID = 1L;
	
	public LabelAntiAlias() {
		super("", SwingConstants.CENTER);
	}

	@Override
	public void paint (Graphics g) {
        if(g instanceof Graphics2D) {
        	Graphics2D g2 = (Graphics2D) g;
        	g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        	g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        	g2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        	g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        }
        super.paint (g);
    }
}
