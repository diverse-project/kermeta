package org.kermeta.trek.ui.views.nav.operations;

import org.kermeta.trek.ui.views.nav.KustomAction;

public class CreateKTag extends KustomAction{

	public CreateKTag(){
		super.setText("new KTag");
	}
	public void run(){
		// launch wizard
		System.out.println("create tag");
	}
}
