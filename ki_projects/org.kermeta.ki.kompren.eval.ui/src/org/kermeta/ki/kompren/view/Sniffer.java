package org.kermeta.ki.kompren.view;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import org.kermeta.ki.diagram.view.impl.DiagramView;

public class Sniffer {
	protected DiagramView diag;

	protected Question currentQuestion;

	
	public Sniffer(final DiagramView diag) {
		super();
		
		this.diag = diag;
		SniffScrollers sniffSc = new SniffScrollers();

		diag.getScrollPane().getVerticalScrollBar().addMouseMotionListener(sniffSc);
		diag.getScrollPane().getHorizontalScrollBar().addMouseMotionListener(sniffSc);
		diag.addMouseListener(new SniffPresses());
		diag.addMouseMotionListener(new SniffMoves());
	}


	public void setQuestion(final Question question) {
		currentQuestion = question;

		if(question!=null) {
			question.nbMouseDistance = 0l;
		}
	}


	
	class SniffPresses implements MouseListener {
		@Override
		public void mouseClicked(final MouseEvent e) {
				//
		}

		@Override
		public void mousePressed(final MouseEvent e) {
			if(currentQuestion!=null) {
				currentQuestion.nbMousePress++;
			}	
		}

		@Override
		public void mouseReleased(final MouseEvent e) {
			//
		}

		@Override
		public void mouseEntered(final MouseEvent e) {
			//
		}

		@Override
		public void mouseExited(final MouseEvent e) {
			//
		}
	}



	class SniffMoves implements MouseMotionListener {
		protected int lastX;
		protected int lastY;

		public SniffMoves() {
			super();
			lastX = Integer.MIN_VALUE;
			lastY = Integer.MIN_VALUE;
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			process(e);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			process(e);
		}

		private void process(MouseEvent e) {
			if(currentQuestion!=null) {
				if(lastX==e.getXOnScreen() && lastY==e.getYOnScreen()) {// scroll
					if(e.getModifiers()==0) // only scroll
						currentQuestion.nbScrolls++;
					else
						if(e.getModifiers()==InputEvent.SHIFT_MASK || e.getModifiers()==InputEvent.CTRL_MASK)
							currentQuestion.nbZooms++;
				}else
					currentQuestion.nbMouseDistance++;
			}
			lastX = e.getXOnScreen();
			lastY = e.getYOnScreen();
		}
	}



	class SniffScrollers implements MouseMotionListener {
		@Override
		public void mouseDragged(final MouseEvent e) {
			if(currentQuestion!=null) {
				currentQuestion.nbScrolls++;
			}
		}

		@Override
		public void mouseMoved(final MouseEvent e) {
			//
		}
	}
}
