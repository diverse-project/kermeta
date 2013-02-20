package org.kermeta.kompren.gwelet.instruments;

import org.kermeta.kompren.gwelet.actions.ReinitView;
import org.kermeta.kompren.gwelet.ui.MPieMenuButton;
import org.kermeta.kompren.gwelet.view.MetamodelView;
import org.malai.instrument.Link;
import org.malai.instrument.WidgetInstrument;
import org.malai.interaction.library.ButtonPressed;
import org.malai.ui.UIComposer;

public class ViewReiniter extends WidgetInstrument {
	protected MPieMenuButton reinit;

	protected MetamodelView canvas;


	public ViewReiniter(final MetamodelView canvas, final UIComposer<?> composer) {
		super(composer);
		this.canvas = canvas;
		initialiseWidgets();
	}

	@Override
	protected void initialiseWidgets() {
		reinit = new MPieMenuButton("Reinit");
		reinit.setToolTipText("Reinitialises the view.");
	}

	@Override
	protected void initialiseLinks() {
		try {
			addLink(new Button2ReinitView(this));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public MPieMenuButton getReinit() {
		return reinit;
	}


	private class Button2ReinitView extends Link<ReinitView, ButtonPressed, ViewReiniter> {
		public Button2ReinitView(final ViewReiniter ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, ReinitView.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.canvas);
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.reinit;
		}
	}
}
