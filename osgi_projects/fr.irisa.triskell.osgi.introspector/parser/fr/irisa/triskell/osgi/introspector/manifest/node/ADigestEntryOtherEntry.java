/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ADigestEntryOtherEntry extends POtherEntry {
	private PDigestEntry _digestEntry_;

	public ADigestEntryOtherEntry() {
		// Constructor
	}

	public ADigestEntryOtherEntry(@SuppressWarnings("hiding")
	PDigestEntry _digestEntry_) {
		// Constructor
		setDigestEntry(_digestEntry_);

	}

	@Override
	public Object clone() {
		return new ADigestEntryOtherEntry(cloneNode(this._digestEntry_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseADigestEntryOtherEntry(this);
	}

	public PDigestEntry getDigestEntry() {
		return this._digestEntry_;
	}

	public void setDigestEntry(PDigestEntry node) {
		if (this._digestEntry_ != null) {
			this._digestEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._digestEntry_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._digestEntry_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._digestEntry_ == child) {
			this._digestEntry_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._digestEntry_ == oldChild) {
			setDigestEntry((PDigestEntry) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
