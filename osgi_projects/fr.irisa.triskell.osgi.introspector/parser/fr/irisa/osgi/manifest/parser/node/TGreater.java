/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class TGreater extends Token {
	public TGreater() {
		super.setText(">");
	}

	public TGreater(int line, int pos) {
		super.setText(">");
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TGreater(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTGreater(this);
	}

	@Override
	public void setText(@SuppressWarnings("unused")
	String text) {
		throw new RuntimeException("Cannot change TGreater text.");
	}
}
