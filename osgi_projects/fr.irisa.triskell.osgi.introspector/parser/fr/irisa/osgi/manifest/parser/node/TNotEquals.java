/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class TNotEquals extends Token {
	public TNotEquals() {
		super.setText("!=");
	}

	public TNotEquals(int line, int pos) {
		super.setText("!=");
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TNotEquals(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTNotEquals(this);
	}

	@Override
	public void setText(@SuppressWarnings("unused")
	String text) {
		throw new RuntimeException("Cannot change TNotEquals text.");
	}
}
