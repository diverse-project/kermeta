/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class AOsnameWindowsntOsnameValue extends POsnameValue {
	private TOsnameWindowsnt _osnameWindowsnt_;

	public AOsnameWindowsntOsnameValue() {
		// Constructor
	}

	public AOsnameWindowsntOsnameValue(@SuppressWarnings("hiding")
	TOsnameWindowsnt _osnameWindowsnt_) {
		// Constructor
		setOsnameWindowsnt(_osnameWindowsnt_);

	}

	@Override
	public Object clone() {
		return new AOsnameWindowsntOsnameValue(
				cloneNode(this._osnameWindowsnt_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAOsnameWindowsntOsnameValue(this);
	}

	public TOsnameWindowsnt getOsnameWindowsnt() {
		return this._osnameWindowsnt_;
	}

	public void setOsnameWindowsnt(TOsnameWindowsnt node) {
		if (this._osnameWindowsnt_ != null) {
			this._osnameWindowsnt_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._osnameWindowsnt_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._osnameWindowsnt_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._osnameWindowsnt_ == child) {
			this._osnameWindowsnt_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._osnameWindowsnt_ == oldChild) {
			setOsnameWindowsnt((TOsnameWindowsnt) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
