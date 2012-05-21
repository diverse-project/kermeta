package org.kermeta.kompren.gwelet.ui;

import java.awt.Frame;

import javax.swing.JFrame;

import org.kermeta.kompren.gwelet.model.Model;
import org.malai.instrument.Instrument;
import org.malai.ui.UI;

public class GweletFrame extends UI {
	private static final long serialVersionUID = 1L;
	
	protected Model model;
	
	protected Canvas canvas;
	
	protected JFrame proxiedFrame;
	

	public GweletFrame() {
		super();
		proxiedFrame = (JFrame) canvas.view.getFrame();
		proxiedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		proxiedFrame.setExtendedState(proxiedFrame.getExtendedState() | Frame.MAXIMIZED_BOTH);
	}


	@Override
	public Instrument[] getInstruments() {
		return new Instrument[]{};
	}


	@Override
	public void initialisePresentations() {
		model = new Model();
		canvas = new Canvas();
	}
	
	
	@Override
	public void setVisible(final boolean visible) {
		proxiedFrame.setVisible(visible);
	}
}
