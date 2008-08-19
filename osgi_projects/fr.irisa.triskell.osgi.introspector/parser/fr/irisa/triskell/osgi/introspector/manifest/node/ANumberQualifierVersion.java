/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ANumberQualifierVersion extends PQualifierVersion {
	private TDot _dot_;
	private TNumber _number_;

	public ANumberQualifierVersion() {
		// Constructor
	}

	public ANumberQualifierVersion(@SuppressWarnings("hiding")
	TDot _dot_, @SuppressWarnings("hiding")
	TNumber _number_) {
		// Constructor
		setDot(_dot_);

		setNumber(_number_);

	}

	@Override
	public Object clone() {
		return new ANumberQualifierVersion(cloneNode(this._dot_),
				cloneNode(this._number_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseANumberQualifierVersion(this);
	}

	public TDot getDot() {
		return this._dot_;
	}

	public void setDot(TDot node) {
		if (this._dot_ != null) {
			this._dot_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._dot_ = node;
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

	@Override
	public String toString() {
		return "" + toString(this._dot_) + toString(this._number_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._dot_ == child) {
			this._dot_ = null;
			return;
		}

		if (this._number_ == child) {
			this._number_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._dot_ == oldChild) {
			setDot((TDot) newChild);
			return;
		}

		if (this._number_ == oldChild) {
			setNumber((TNumber) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
