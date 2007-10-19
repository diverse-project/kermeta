package org.kermeta.trek.ui.views.nav;

import org.eclipse.jface.action.Action;

public class KustomAction extends Action {
	
	private KTreeObject selected;
	
	public void run() {
		System.out.println("action trigged");
	}

	public KTreeObject getSelected() {
		return selected;
	}

	public void setSelected(KTreeObject selected) {
		this.selected = selected;
	}
}
