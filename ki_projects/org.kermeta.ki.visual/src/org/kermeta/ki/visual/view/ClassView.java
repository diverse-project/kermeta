package org.kermeta.ki.visual.view;

import java.awt.Color;

public class ClassView extends EntityView {

	public ClassView(String name) {
		super(name);
	}

	
	@Override
	public Color getFillingColor(int opacity) {
		return opacity==255 ? Color.LIGHT_GRAY : new Color(192, 192, 192, opacity);
	}

	@Override
	public Color getLineColor(int opacity) {
		return opacity==255 ? Color.BLACK : new Color(0, 0, 0, opacity);
	}
}
