package org.kermeta.trek.ui.views.nav.operations;

import org.kermeta.trek.ui.views.nav.KustomAction;

public class CreateKUserStory extends KustomAction {
	public CreateKUserStory(){
		super.setText("new KUser Story");
	}
	public void run(){
		System.out.println("create user story");
	}
}
