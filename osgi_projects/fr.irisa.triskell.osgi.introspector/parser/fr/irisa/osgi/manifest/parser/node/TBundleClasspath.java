/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class TBundleClasspath extends Token {
	public TBundleClasspath() {
		super.setText("Bundle-ClassPath: ");
	}

	public TBundleClasspath(int line, int pos) {
		super.setText("Bundle-ClassPath: ");
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TBundleClasspath(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTBundleClasspath(this);
	}

	@Override
	public void setText(@SuppressWarnings("unused")
	String text) {
		throw new RuntimeException("Cannot change TBundleClasspath text.");
	}
}
