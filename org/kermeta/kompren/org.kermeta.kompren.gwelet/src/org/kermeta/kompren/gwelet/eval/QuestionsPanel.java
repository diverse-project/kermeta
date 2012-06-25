package org.kermeta.kompren.gwelet.eval;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.kermeta.kompren.gwelet.ui.GweletFrame;
import org.malai.widget.MToolBar;

public class QuestionsPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	protected EditorPaneAntiAlias questionArea;

	protected EditorPaneAntiAlias answerArea;

	protected int currentNbQuestions;

	protected LabelAntiAlias questionLabel;

	protected LabelAntiAlias answerLabel;

	protected LabelAntiAlias helperLabel;

	protected MToolBar toolbar;

	protected AntiAliasButton startButton;

	protected AntiAliasButton answerButton;

	protected EditorPaneAntiAlias resultField;

	protected EditorPaneAntiAlias resultLabel;

	protected List<Question> questions;

	protected long currentTime;

	protected Sniffer sniffer;

	protected String userInformations;

	protected GweletFrame frame;


	public QuestionsPanel(final GweletFrame frame, final MToolBar toolbar) {
		super();

		this.frame 		= frame;
		this.toolbar	= toolbar;
		userInformations= "";
		sniffer 		= new Sniffer(frame.getCanvas());
		questions 		= new ArrayList<Question>();
		currentNbQuestions = -1;

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

		JPanel panel = new JPanel();
		helperLabel = new LabelAntiAlias();
		helperLabel.setAlignmentX(LEFT_ALIGNMENT);
		panel.add(helperLabel);

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
		add(Box.createVerticalStrut(10));
		add(startButton);
		add(Box.createVerticalStrut(15));
		add(answerLabel);
		add(panel);
		add(answerArea);
		add(Box.createVerticalStrut(10));
		add(answerButton);
		add(resultField);
		resultLabel.setVisible(false);
		resultField.setVisible(false);
		initQuestions();
		setNextQuestion();
	}


	public void initQuestions() {
		Question question = new Question();
		question.subject = "<html><font size=\"10\">What are the super classes of the class <b>Type</b>?</font></html>";
		question.helper = "Give the name of the classes:";
		questions.add(question);

		question = new Question();
		question.subject = "<html><font size=\"10\">What is the role </font><font size=\"5\">(i.e. the name)</font><font size=\"10\"> of the relation that links the class <b>State</b> to the class <b>Comment</b>?</font></html>";
		question.helper = "Give the name of the role:";
		questions.add(question);

		question = new Question();
		question.subject = "<html><font size=\"10\">What are the classes <b>directly</b> linked </font><font size=\"5\">(by inheritance, composition, and association)</font><font size=\"10\"> to the class <b>Class?</b></font></html>";
		question.helper = "Give the name of the classes:";
		questions.add(question);

		question = new Question();
		question.subject = "<html><font size=\"10\">What are the name of the, native and inherited, relations and attributes of the class <b>Abstraction</b>?</font></html>";
		question.helper = "Enumerate the names:";
		questions.add(question);

		question = new Question();
		question.subject = "<html><font size=\"10\">Propose 3 <b>entry points</b> <font size=\"5\">(main classes)</font> into the UML metamodel.</font></html>";
		question.helper = "Give the name of the classes:";
		questions.add(question);
	}


	public void setNextQuestion() {
		currentNbQuestions++;
		if(currentNbQuestions<questions.size())
			setQuestionMode(questions.get(currentNbQuestions));
	}

	public void setQuestionMode(final Question question) {
		sniffer.setQuestion(null);
		questionArea.setText(question.subject);
		questionLabel.setText("<html><font size=\"+1\"><b>Question " + (currentNbQuestions+1) + "/" + questions.size() + "</b></font></html>");
		startButton.setVisible(true);
		answerArea.setVisible(false);
		answerLabel.setVisible(false);
		answerButton.setVisible(false);
		frame.setActivated(false);
		toolbar.setVisible(false);
		helperLabel.setVisible(false);
		helperLabel.setText(question.helper);
	}

	public void setAnswerMode() {
		sniffer.setQuestion(questions.get(currentNbQuestions));
		startButton.setVisible(false);
		answerArea.setText("");
		answerArea.setVisible(true);
		answerLabel.setVisible(true);
		answerButton.setVisible(true);
		frame.setActivated(true);
		toolbar.setVisible(true);
		helperLabel.setVisible(true);
	}


	public void setTerminated() {
		startButton.setVisible(false);
		answerArea.setVisible(false);
		answerLabel.setVisible(false);
		answerButton.setVisible(false);
		frame.setActivated(false);
		toolbar.setVisible(false);
		questionArea.setVisible(false);
		questionLabel.setVisible(false);
		resultField.setVisible(true);
		resultLabel.setVisible(true);
		resultLabel.setText("<html><center>Return the results by mail to:<br><b>arnaud.blouin@inria.fr</b><br>A backup of the results called \"data.txt\"<br>has been created near the jar file you launch.</center></html>");
		Dimension dim = new Dimension(500, 500);
		resultField.setPreferredSize(dim);
		resultField.setMinimumSize(dim);
		final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		resultField.setText((int)screenSize.getWidth() + "\t" + (int)screenSize.getHeight() + "\n" + userInformations + "\n");

		for(Question q : questions)
			resultField.setText(resultField.getText() + q);

		try {
			String fileName = "./data";
			String ext = ".txt";

			if(new File(fileName+ext).exists()) {
				int i=1;

				while(new File(fileName+i+ext).exists())
					i++;

				fileName = fileName + i;
			}

			FileWriter fw = new FileWriter(fileName+ext);
			PrintWriter out = new PrintWriter(fw);

			for(Question q : questions)
				out.print(q);

			fw.flush();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}


	class ShowAnswerFieldListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			QuestionsPanel.this.currentTime = System.currentTimeMillis();
			QuestionsPanel.this.setAnswerMode();
			frame.getCanvas().requestFocusInWindow();
		}
	}


	class ShowQuestionFieldListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			final boolean hasNextQuestion = QuestionsPanel.this.currentNbQuestions+1<QuestionsPanel.this.questions.size();
			final Question question = hasNextQuestion ? QuestionsPanel.this.questions.get(QuestionsPanel.this.currentNbQuestions) :
														QuestionsPanel.this.questions.get(QuestionsPanel.this.questions.size()-1);

			question.computeTime(QuestionsPanel.this.currentTime, System.currentTimeMillis());
			question.setAnswer(QuestionsPanel.this.answerArea.getText());

			if(hasNextQuestion)
				QuestionsPanel.this.setNextQuestion();
			else
				QuestionsPanel.this.setTerminated();
			frame.getCanvas().requestFocusInWindow();
		}
	}


	public void setUserInformations(final String userInformations) {
		this.userInformations = userInformations;
	}
}


class EditorPaneAntiAlias extends JEditorPane {
	private static final long serialVersionUID = 1L;

	public EditorPaneAntiAlias(final boolean html) {
		super(html ? "text/html" : "text", "");
	}

	@Override
	public void paint (final Graphics g) {
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

	public AntiAliasButton(final String text) {
		super(text);
	}

	@Override
	public void paint (final Graphics g) {
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
	public void paint (final Graphics g) {
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
