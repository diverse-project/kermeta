package org.kermeta.kompren.diagram.interaction;

import java.awt.Point;

import org.malai.interaction.MoveTransition;
import org.malai.interaction.TerminalState;

public class MoveNoDrag extends Move {

	public MoveNoDrag() {
		super();
	}


	@SuppressWarnings("unused")
	@Override
	protected void initStateMachine() {
		TerminalState end = new TerminalState("moved");
		addState(end);
		new MoveTransition(initState, end) {
			@Override
			public void action() {
				super.action();
				MoveNoDrag.this.point = new Point(getX(), getY());
			}

			@Override
			public boolean isGuardRespected() {
				return super.isGuardRespected() && !pressed;
			}
		};


	}
}
