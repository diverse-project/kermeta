package org.kermeta.kompren.diagram.interaction;

import java.awt.Point;

import org.malai.interaction.MoveTransition;
import org.malai.interaction.TerminalState;
import org.malai.interaction.library.PointInteraction;

public class Move extends PointInteraction {
	public Move() {
		super();
		initStateMachine();
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
				Move.this.point = new Point(getX(), getY());
			}
		};
	}
}
