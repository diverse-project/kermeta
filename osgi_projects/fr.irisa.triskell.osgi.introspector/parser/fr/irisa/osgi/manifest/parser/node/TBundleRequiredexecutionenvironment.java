/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class TBundleRequiredexecutionenvironment extends Token {
	public TBundleRequiredexecutionenvironment() {
		super.setText("Bundle-RequiredExecutionEnvironment: ");
	}

	public TBundleRequiredexecutionenvironment(int line, int pos) {
		super.setText("Bundle-RequiredExecutionEnvironment: ");
		setLine(line);
		setPos(pos);
	}

	@Override
	public Object clone() {
		return new TBundleRequiredexecutionenvironment(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTBundleRequiredexecutionenvironment(this);
	}

	@Override
	public void setText(@SuppressWarnings("unused")
	String text) {
		throw new RuntimeException(
				"Cannot change TBundleRequiredexecutionenvironment text.");
	}
}
