/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AOptionalUniqueNameWildcardSuffix extends
		PUniqueNameWildcardSuffix {
	private TDot _dot_;
	private TOptional _optional_;

	public AOptionalUniqueNameWildcardSuffix() {
		// Constructor
	}

	public AOptionalUniqueNameWildcardSuffix(@SuppressWarnings("hiding")
	TDot _dot_, @SuppressWarnings("hiding")
	TOptional _optional_) {
		// Constructor
		setDot(_dot_);

		setOptional(_optional_);

	}

	@Override
	public Object clone() {
		return new AOptionalUniqueNameWildcardSuffix(cloneNode(this._dot_),
				cloneNode(this._optional_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAOptionalUniqueNameWildcardSuffix(this);
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

	public TOptional getOptional() {
		return this._optional_;
	}

	public void setOptional(TOptional node) {
		if (this._optional_ != null) {
			this._optional_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._optional_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._dot_) + toString(this._optional_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._dot_ == child) {
			this._dot_ = null;
			return;
		}

		if (this._optional_ == child) {
			this._optional_ = null;
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

		if (this._optional_ == oldChild) {
			setOptional((TOptional) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
