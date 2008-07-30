/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class TProcessor extends Token {
	public TProcessor(String text) {
		setText(text);
	}

	public TProcessor(String text, int line, int pos) {
		setText(text);
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TProcessor(getText(), getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTProcessor(this);
	}
}
