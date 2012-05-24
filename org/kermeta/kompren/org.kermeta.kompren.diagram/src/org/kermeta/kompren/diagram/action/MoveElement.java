package org.kermeta.kompren.diagram.action;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.interfaces.Moveable;
import org.malai.action.Action;

public class MoveElement extends Action {

	List<Moveable> elts;


	public MoveElement() {
		super();
		elts = new ArrayList<Moveable>();
	}


	@Override
	public boolean isRegisterable() {
		return false;
	}


	@Override
	protected void doActionBody() {
		// TODO Auto-generated method stub

	}


	@Override
	public boolean canDo() {
		return !elts.isEmpty();
	}


	public void addMoveable(final Moveable moveable) {
		if(moveable!=null)
			elts.add(moveable);
	}
}
