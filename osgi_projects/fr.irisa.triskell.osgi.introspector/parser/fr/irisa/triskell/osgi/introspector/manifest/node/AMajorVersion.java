/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class AMajorVersion extends PMajorVersion {
	private TNumber _number_;
	private PMinorVersion _minorVersion_;

	public AMajorVersion() {
		// Constructor
	}

	public AMajorVersion(@SuppressWarnings("hiding")
	TNumber _number_, @SuppressWarnings("hiding")
	PMinorVersion _minorVersion_) {
		// Constructor
		setNumber(_number_);

		setMinorVersion(_minorVersion_);

	}

	@Override
	public Object clone() {
		return new AMajorVersion(cloneNode(this._number_),
				cloneNode(this._minorVersion_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAMajorVersion(this);
	}

	public TNumber getNumber() {
		return this._number_;
	}

	public void setNumber(TNumber node) {
		if (this._number_ != null) {
			this._number_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._number_ = node;
	}

	public PMinorVersion getMinorVersion() {
		return this._minorVersion_;
	}

	public void setMinorVersion(PMinorVersion node) {
		if (this._minorVersion_ != null) {
			this._minorVersion_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._minorVersion_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._number_) + toString(this._minorVersion_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._number_ == child) {
			this._number_ = null;
			return;
		}

		if (this._minorVersion_ == child) {
			this._minorVersion_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._number_ == oldChild) {
			setNumber((TNumber) newChild);
			return;
		}

		if (this._minorVersion_ == oldChild) {
			setMinorVersion((PMinorVersion) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
