package org.kermeta.kompren.diagram.instrument;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import javax.swing.JScrollPane;

import org.kermeta.kompren.diagram.action.MoveElement;
import org.kermeta.kompren.diagram.action.SelectElement;
import org.kermeta.kompren.diagram.action.ShowHandler;
import org.kermeta.kompren.diagram.interaction.MoveNoDrag;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.diagram.view.interfaces.Selectable;
import org.malai.action.library.MoveCamera;
import org.malai.instrument.Instrument;
import org.malai.instrument.Link;
import org.malai.interaction.library.DnD;
import org.malai.interaction.library.Press;
import org.malai.picking.Pickable;

public class Hand extends Instrument {
	protected IModelView canvas;


	public Hand(final IModelView canvas) {
		super();

		if(canvas==null)
			throw new IllegalArgumentException();

		this.canvas = canvas;
	}

	@Override
	protected void initialiseLinks() {
		try{
			addLink(new Move2ShowHandler(this));
			addLink(new Press2Select(this));
//			addLink(new DnD2Select(this));
			addLink(new DnD2MoveCamera(this));
			addLink(new DnD2MoveElement(this));
		}catch(final InstantiationException e){
			e.printStackTrace();
		}catch(final IllegalAccessException e){
			e.printStackTrace();
		}
	}


	@Override
	public void interimFeedback() {
		canvas.setCursor(Cursor.getDefaultCursor());
	}



	private class Press2Select extends Link<SelectElement, Press, Hand> {
		protected Press2Select(final Hand ins) throws InstantiationException, IllegalAccessException {
			super(ins, true, SelectElement.class, Press.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.canvas);
			Object target = interaction.getTarget();

			if(target instanceof Selectable)
				action.addSelected((Selectable)target);
		}


		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()!=MouseEvent.BUTTON2;
		}
	}



	private class Move2ShowHandler extends Link<ShowHandler, MoveNoDrag, Hand> {
		public Move2ShowHandler(final Hand ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, ShowHandler.class, MoveNoDrag.class);
		}

		@Override
		public void initAction() {
			Pickable pk = instrument.canvas.getPickableAt(interaction.getPoint().getX(), interaction.getPoint().getY());

			if(pk instanceof IRelationView) {
				action.setRel((IRelationView) pk);
				action.setModelView(instrument.canvas);
			}
		}

		@Override
		public boolean isConditionRespected() {
			return true;
		}
	}


//	private class DnD2Select extends Link<SelectElement, DnD, Hand> {
//		protected DnD2Select(final Hand ins) throws InstantiationException, IllegalAccessException {
//			super(ins, true, SelectElement.class, DnD.class);
//		}
//
//		@Override
//		public void initAction() {
//			action.setModelView(canvas);
//		}
//
//		@Override
//		public boolean isConditionRespected() {
//			return interaction.getStartObject()==null && interaction.getButton()!=MouseEvent.BUTTON2;
//		}
//	}




	private class DnD2MoveElement extends Link<MoveElement, DnD, Hand> {
		protected DnD2MoveElement(final Hand ins) throws InstantiationException, IllegalAccessException {
			super(ins, true, MoveElement.class, DnD.class);
		}

		@Override
		public void initAction() {
			action.setModelView(canvas);
		}


		@Override
		public void updateAction() {
			Point2D startPt	= canvas.getZoomedPoint(interaction.getStartPt());
			Point2D endPt	= canvas.getZoomedPoint(interaction.getEndPt());

			action.setTx(endPt.getX() - startPt.getX());
			action.setTy(endPt.getY() - startPt.getY());
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getStartObject()!=null && interaction.getButton()!=MouseEvent.BUTTON2;
		}
	}




	private class DnD2MoveCamera extends Link<MoveCamera, DnD, Hand> {
		protected DnD2MoveCamera(final Hand ins) throws InstantiationException, IllegalAccessException {
			super(ins, true, MoveCamera.class, DnD.class);
		}

		@Override
		public void initAction() {
			action.setScrollPane(canvas.getScrollpane());
		}


		@Override
		public void updateAction() {
			final Point2D startPt	= interaction.getStartPt();
			final Point2D endPt		= interaction.getEndPt();
			final JScrollPane pane	= canvas.getScrollpane();

			action.setPx(pane.getHorizontalScrollBar().getValue()+(int)(startPt.getX() - endPt.getX()));
			action.setPy(pane.getVerticalScrollBar().getValue()+(int)(startPt.getY() - endPt.getY()));
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==MouseEvent.BUTTON2;
		}


		@Override
		public void interimFeedback() {
			super.interimFeedback();
			instrument.canvas.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		}
	}
}
