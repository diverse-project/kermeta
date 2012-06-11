package org.kermeta.kompren.gwelet.actions;

import org.malai.action.library.SetWidgetPosition;

public class SetVisibleComponent extends SetWidgetPosition {
	protected boolean visible;


	public SetVisibleComponent() {
		super();
		visible = false;
		px = 0;
		py = 0;
	}


	@Override
	public boolean isRegisterable() {
		return false;
	}


	@Override
	protected void doActionBody() {
		component.setVisible(visible);
		component.repaint();
		if(visible)
			super.doActionBody();
	}


	@Override
	public boolean canDo() {
		return super.canDo();
	}


	public void setVisible(final boolean visible) {
		this.visible = visible;
	}
}
