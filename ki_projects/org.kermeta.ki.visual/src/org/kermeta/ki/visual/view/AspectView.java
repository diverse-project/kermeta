package org.kermeta.ki.visual.view;

import java.awt.Color;


public class AspectView extends EntityView {

	public AspectView(String name) {
		super(name);
	}
	
	
	
	@Override
	public Color getFillingColor(int opacity) {
		return opacity==255 ? Color.RED : new Color(255, 0, 0, opacity);
	}

	@Override
	public Color getLineColor(int opacity) {
		return opacity==255 ? Color.BLACK : new Color(0, 0, 0, opacity);
	}
}
