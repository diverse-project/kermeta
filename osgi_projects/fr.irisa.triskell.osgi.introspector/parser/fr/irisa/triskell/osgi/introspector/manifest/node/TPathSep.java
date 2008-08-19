/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class TPathSep extends Token {
	public TPathSep(String text) {
		setText(text);
	}

	public TPathSep(String text, int line, int pos) {
		setText(text);
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TPathSep(getText(), getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTPathSep(this);
	}
}
