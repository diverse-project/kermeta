/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class TUrlFtp extends Token {
	public TUrlFtp() {
		super.setText("ftp://");
	}

	public TUrlFtp(int line, int pos) {
		super.setText("ftp://");
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TUrlFtp(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTUrlFtp(this);
	}

	@Override
	public void setText(@SuppressWarnings("unused")
	String text) {
		throw new RuntimeException("Cannot change TUrlFtp text.");
	}
}
