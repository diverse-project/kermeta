/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class TBundleSymbolicname extends Token {
	public TBundleSymbolicname() {
		super.setText("Bundle-SymbolicName: ");
	}

	public TBundleSymbolicname(int line, int pos) {
		super.setText("Bundle-SymbolicName: ");
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TBundleSymbolicname(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTBundleSymbolicname(this);
	}

	@Override
	public void setText(@SuppressWarnings("unused")
	String text) {
		throw new RuntimeException("Cannot change TBundleSymbolicname text.");
	}
}
