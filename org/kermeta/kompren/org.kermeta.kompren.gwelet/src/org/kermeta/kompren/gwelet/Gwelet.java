package org.kermeta.kompren.gwelet;

import org.kermeta.kompren.gwelet.ui.GweletFrame;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicerrunner.MainRunner;

public class Gwelet {
	public static void main(final String[] args) {
		MainRunner.init();

		GweletFrame frame = new GweletFrame();
		frame.getComposer().compose(null);
		frame.getViewBuilder().build("/home/ablouin/workspace/org.kermeta.kompren.gwelet/examples/beforeSetting.km");
		frame.setVisible(true);
	}
}
