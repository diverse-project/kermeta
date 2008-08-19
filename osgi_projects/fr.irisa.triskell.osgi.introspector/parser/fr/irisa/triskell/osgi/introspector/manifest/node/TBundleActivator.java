/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class TBundleActivator extends Token {
	public TBundleActivator(String text) {
		setText(text);
	}

	public TBundleActivator(String text, int line, int pos) {
		setText(text);
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TBundleActivator(getText(), getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTBundleActivator(this);
	}
}
