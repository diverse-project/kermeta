/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class TIdentifierRequiredProfile extends Token {
	public TIdentifierRequiredProfile(String text) {
		setText(text);
	}

	public TIdentifierRequiredProfile(String text, int line, int pos) {
		setText(text);
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TIdentifierRequiredProfile(getText(), getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTIdentifierRequiredProfile(this);
	}
}
