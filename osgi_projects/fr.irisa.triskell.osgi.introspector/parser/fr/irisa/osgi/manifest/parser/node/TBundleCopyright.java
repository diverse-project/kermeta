/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class TBundleCopyright extends Token {
	public TBundleCopyright() {
		super.setText("Bundle-Copyright: ");
	}

	public TBundleCopyright(int line, int pos) {
		super.setText("Bundle-Copyright: ");
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TBundleCopyright(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTBundleCopyright(this);
	}

	@Override
	public void setText(@SuppressWarnings("unused")
	String text) {
		throw new RuntimeException("Cannot change TBundleCopyright text.");
	}
}
