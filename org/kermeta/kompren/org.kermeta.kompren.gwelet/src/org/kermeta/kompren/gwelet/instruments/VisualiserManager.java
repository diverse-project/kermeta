package org.kermeta.kompren.gwelet.instruments;

import java.awt.event.MouseEvent;

import javax.swing.JLayeredPane;

import org.kermeta.kompren.gwelet.actions.SetVisibleComponent;
import org.kermeta.kompren.gwelet.view.MetamodelView;
import org.kermeta.kompren.gwelet.visualisation.MPieMenu;
import org.malai.instrument.Link;
import org.malai.instrument.WidgetInstrument;
import org.malai.interaction.library.Press;
import org.malai.ui.UIComposer;
import org.malai.widget.MLayeredPane;
import org.malai.widget.MScrollPane;

public class VisualiserManager extends WidgetInstrument {
	protected MPieMenu menu;

	/** The pane where the text field must be added. */
	protected MLayeredPane layeredPanel;

	protected MetamodelView mmView;


	public VisualiserManager(final UIComposer<?> composer, final MLayeredPane overlayedPanel, final MetamodelView mmView) {
		super(composer);
		layeredPanel = overlayedPanel;
		this.mmView = mmView;
		initialiseWidgets();
	}


	@Override
	protected void initialiseWidgets() {
		menu = new MPieMenu();
		layeredPanel.add(menu, JLayeredPane.PALETTE_LAYER);
		menu.setVisible(false);
	}


	@Override
	protected void initialiseLinks() {
		try {
			addLink(new ClickToShowPieMenu(this));
		}catch(InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}


	private class ClickToShowPieMenu extends Link<SetVisibleComponent, Press, VisualiserManager> {
		public ClickToShowPieMenu(final VisualiserManager ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, SetVisibleComponent.class, Press.class);
		}

		@Override
		public void initAction() {
			action.setComponent(instrument.menu);

			if(interaction.getButton()==MouseEvent.BUTTON3) {
				MScrollPane pane = mmView.getScrollpane();

				action.setVisible(true);
				action.setPx(interaction.getPoint().getX()-instrument.menu.getWidth()/2.-pane.getHorizontalScrollBar().getValue());
				action.setPy(interaction.getPoint().getY()-instrument.menu.getHeight()/2.-pane.getVerticalScrollBar().getValue());
			}else
				action.setVisible(false);
		}

		@Override
		public boolean isConditionRespected() {
			return true;
		}
	}


	public MPieMenu getMenu() {
		return menu;
	}
}
