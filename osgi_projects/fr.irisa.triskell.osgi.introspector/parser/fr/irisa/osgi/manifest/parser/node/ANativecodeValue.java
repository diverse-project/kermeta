/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class ANativecodeValue extends PNativecodeValue {
	private TComma _comma_;
	private PNativecodeEntry _nativecodeEntry_;

	public ANativecodeValue() {
		// Constructor
	}

	public ANativecodeValue(@SuppressWarnings("hiding")
	TComma _comma_, @SuppressWarnings("hiding")
	PNativecodeEntry _nativecodeEntry_) {
		// Constructor
		setComma(_comma_);

		setNativecodeEntry(_nativecodeEntry_);

	}

	@Override
	public Object clone() {
		return new ANativecodeValue(cloneNode(this._comma_),
				cloneNode(this._nativecodeEntry_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseANativecodeValue(this);
	}

	public TComma getComma() {
		return this._comma_;
	}

	public void setComma(TComma node) {
		if (this._comma_ != null) {
			this._comma_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._comma_ = node;
	}

	public PNativecodeEntry getNativecodeEntry() {
		return this._nativecodeEntry_;
	}

	public void setNativecodeEntry(PNativecodeEntry node) {
		if (this._nativecodeEntry_ != null) {
			this._nativecodeEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._nativecodeEntry_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._comma_) + toString(this._nativecodeEntry_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._comma_ == child) {
			this._comma_ = null;
			return;
		}

		if (this._nativecodeEntry_ == child) {
			this._nativecodeEntry_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._comma_ == oldChild) {
			setComma((TComma) newChild);
			return;
		}

		if (this._nativecodeEntry_ == oldChild) {
			setNativecodeEntry((PNativecodeEntry) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
