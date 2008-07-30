/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class TBundleVersion extends Token {
	public TBundleVersion() {
		super.setText("Bundle-Version: ");
	}

	public TBundleVersion(int line, int pos) {
		super.setText("Bundle-Version: ");
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TBundleVersion(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTBundleVersion(this);
	}

	@Override
	public void setText(@SuppressWarnings("unused")
	String text) {
		throw new RuntimeException("Cannot change TBundleVersion text.");
	}
}
