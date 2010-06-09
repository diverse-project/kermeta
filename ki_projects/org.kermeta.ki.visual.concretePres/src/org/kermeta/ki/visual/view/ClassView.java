package org.kermeta.ki.visual.view;

import java.awt.Color;
import java.util.List;

public class ClassView extends EntityView {

	protected List<Aspect> aspects;
	
	
	
	public ClassView(String name, MetamodelView metamodel) {
		super(name, metamodel);
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
