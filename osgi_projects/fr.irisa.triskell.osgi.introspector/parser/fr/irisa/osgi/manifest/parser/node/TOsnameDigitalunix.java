/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class TOsnameDigitalunix extends Token {
	public TOsnameDigitalunix(String text) {
		setText(text);
	}

	public TOsnameDigitalunix(String text, int line, int pos) {
		setText(text);
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TOsnameDigitalunix(getText(), getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTOsnameDigitalunix(this);
	}
}
