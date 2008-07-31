/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class TBundleName extends Token {
	public TBundleName() {
		super.setText("Bundle-Name: ");
	}

	public TBundleName(int line, int pos) {
		super.setText("Bundle-Name: ");
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TBundleName(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTBundleName(this);
	}

	@Override
	public void setText(@SuppressWarnings("unused")
	String text) {
		throw new RuntimeException("Cannot change TBundleName text.");
	}
}
