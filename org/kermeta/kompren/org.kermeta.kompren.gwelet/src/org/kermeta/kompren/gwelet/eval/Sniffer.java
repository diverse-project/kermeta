package org.kermeta.kompren.gwelet.eval;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import org.kermeta.kompren.gwelet.ui.GweletFrame;
import org.kermeta.kompren.gwelet.view.MetamodelView;
import org.malai.action.Action;
import org.malai.action.ActionHandler;
import org.malai.action.ActionsRegistry;
import org.malai.action.library.Scroll;
import org.malai.action.library.Zoom;
import org.malai.undo.Undoable;

public class Sniffer implements ActionHandler {
	protected GweletFrame frame;

	protected Question currentQuestion;


	public Sniffer(final GweletFrame frame) {
		super();

		ActionsRegistry.INSTANCE.addHandler(this);
		this.frame = frame;
//		SniffScrollers sniffSc = new SniffScrollers();

		MetamodelView diag = frame.getCanvas();
//		diag.getScrollpane().getVerticalScrollBar().addMouseMotionListener(sniffSc);
//		diag.getScrollpane().getHorizontalScrollBar().addMouseMotionListener(sniffSc);
		diag.addMouseListener(new SniffPresses());
		diag.addMouseMotionListener(new SniffMoves());

		frame.getVisualiser().getFlat().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				currentQuestion.nbFlat++;
			}
		});

		frame.getVisualiser().getPruning().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				currentQuestion.nbPruning++;
			}
		});

		frame.getVisualiser().getSuperClasses().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				currentQuestion.nbHierachy++;
			}
		});

		frame.getUndoredoer().getUndoB().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				currentQuestion.nbUndoRedo++;
			}
		});

		frame.getUndoredoer().getRedoB().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				currentQuestion.nbUndoRedo++;
			}
		});
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
		public void mouseDragged(final MouseEvent e) {
			process(e);
		}

		@Override
		public void mouseMoved(final MouseEvent e) {
			process(e);
		}

		private void process(final MouseEvent e) {
			if(currentQuestion!=null) {
				if(lastX==e.getXOnScreen() && lastY==e.getYOnScreen()) {// scroll
//					if(e.getModifiers()==0) // only scroll
//						currentQuestion.nbScrolls++;
//					else
//						if(e.getModifiers()==InputEvent.SHIFT_MASK || e.getModifiers()==InputEvent.CTRL_MASK)
//							currentQuestion.nbZooms++;
				}else
					currentQuestion.nbMouseDistance++;
			}
			lastX = e.getXOnScreen();
			lastY = e.getYOnScreen();
		}
	}



//	class SniffScrollers implements MouseMotionListener {
//		@Override
//		public void mouseDragged(final MouseEvent e) {
//			if(currentQuestion!=null) {
//				currentQuestion.nbScrolls++;
//			}
//		}
//
//		@Override
//		public void mouseMoved(final MouseEvent e) {
//			//
//		}
//	}


	@Override
	public void onUndoableAdded(final Undoable undoable) {
		//
	}


	@Override
	public void onUndoableUndo(final Undoable undoable) {
		//
	}


	@Override
	public void onUndoableRedo(final Undoable undoable) {
		//
	}


	@Override
	public void onActionCancelled(final Action action) {
		//
	}


	@Override
	public void onActionAdded(final Action action) {
		//
	}


	@Override
	public void onActionAborted(final Action action) {
		//
	}


	@Override
	public void onActionExecuted(final Action action) {
		//
	}


	@Override
	public void onActionDone(final Action action) {
		if(action instanceof Zoom)
			currentQuestion.nbZooms++;
		if(action instanceof Scroll)
			currentQuestion.nbScrolls++;
	}
}
