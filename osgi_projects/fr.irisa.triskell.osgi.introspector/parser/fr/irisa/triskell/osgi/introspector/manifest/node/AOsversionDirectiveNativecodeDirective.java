/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class AOsversionDirectiveNativecodeDirective extends
		PNativecodeDirective {
	private POsversionDirective _osversionDirective_;

	public AOsversionDirectiveNativecodeDirective() {
		// Constructor
	}

	public AOsversionDirectiveNativecodeDirective(@SuppressWarnings("hiding")
	POsversionDirective _osversionDirective_) {
		// Constructor
		setOsversionDirective(_osversionDirective_);

	}

	@Override
	public Object clone() {
		return new AOsversionDirectiveNativecodeDirective(
				cloneNode(this._osversionDirective_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAOsversionDirectiveNativecodeDirective(this);
	}

	public POsversionDirective getOsversionDirective() {
		return this._osversionDirective_;
	}

	public void setOsversionDirective(POsversionDirective node) {
		if (this._osversionDirective_ != null) {
			this._osversionDirective_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._osversionDirective_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._osversionDirective_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._osversionDirective_ == child) {
			this._osversionDirective_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._osversionDirective_ == oldChild) {
			setOsversionDirective((POsversionDirective) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
