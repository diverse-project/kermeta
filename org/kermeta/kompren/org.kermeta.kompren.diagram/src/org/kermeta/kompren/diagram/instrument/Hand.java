package org.kermeta.kompren.diagram.instrument;

import java.awt.Point;

import org.kermeta.kompren.diagram.action.MoveElement;
import org.kermeta.kompren.diagram.action.SelectElement;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.diagram.view.interfaces.Selectable;
import org.malai.instrument.Instrument;
import org.malai.instrument.Link;
import org.malai.interaction.library.DnD;
import org.malai.interaction.library.Press;

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
			addLink(new Press2Select(this));
//			addLink(new DnD2Select(this));
			addLink(new DnD2Move(this));
		}catch(final InstantiationException e){
			e.printStackTrace();
		}catch(final IllegalAccessException e){
			e.printStackTrace();
		}
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
			return true;
		}
	}



	private class DnD2Select extends Link<SelectElement, DnD, Hand> {
		protected DnD2Select(final Hand ins) throws InstantiationException, IllegalAccessException {
			super(ins, true, SelectElement.class, DnD.class);
		}

		@Override
		public void initAction() {
			action.setModelView(canvas);
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getStartObject()==null;
		}
	}


	private class DnD2Move extends Link<MoveElement, DnD, Hand> {
		protected DnD2Move(final Hand ins) throws InstantiationException, IllegalAccessException {
			super(ins, true, MoveElement.class, DnD.class);
		}

		@Override
		public void initAction() {
			action.setModelView(canvas);
		}


		@Override
		public void updateAction() {
//			val startPt	= instrument.zoomer.zoomable.getZoomedPoint(interaction.getStartPt);
//			val endPt	= zoomer.zoomable.getZoomedPoint(interaction.getEndPt);
			Point startPt = interaction.getStartPt();
			Point endPt = interaction.getEndPt();

			action.setTx(endPt.getX() - startPt.getX());
			action.setTy(endPt.getY() - startPt.getY());
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getStartObject()!=null;
		}
	}
}
