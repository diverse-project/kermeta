/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ASimpleEntry extends PSimpleEntry {
	private TEntry _entry_;
	private PSimpleEntryValue _simpleEntryValue_;

	public ASimpleEntry() {
		// Constructor
	}

	public ASimpleEntry(@SuppressWarnings("hiding")
	TEntry _entry_, @SuppressWarnings("hiding")
	PSimpleEntryValue _simpleEntryValue_) {
		// Constructor
		setEntry(_entry_);

		setSimpleEntryValue(_simpleEntryValue_);

	}

	@Override
	public Object clone() {
		return new ASimpleEntry(cloneNode(this._entry_),
				cloneNode(this._simpleEntryValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseASimpleEntry(this);
	}

	public TEntry getEntry() {
		return this._entry_;
	}

	public void setEntry(TEntry node) {
		if (this._entry_ != null) {
			this._entry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._entry_ = node;
	}

	public PSimpleEntryValue getSimpleEntryValue() {
		return this._simpleEntryValue_;
	}

	public void setSimpleEntryValue(PSimpleEntryValue node) {
		if (this._simpleEntryValue_ != null) {
			this._simpleEntryValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._simpleEntryValue_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._entry_) + toString(this._simpleEntryValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._entry_ == child) {
			this._entry_ = null;
			return;
		}

		if (this._simpleEntryValue_ == child) {
			this._simpleEntryValue_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._entry_ == oldChild) {
			setEntry((TEntry) newChild);
			return;
		}

		if (this._simpleEntryValue_ == oldChild) {
			setSimpleEntryValue((PSimpleEntryValue) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
