/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ANativecodeEntryValue extends PNativecodeEntryValue {
	private TSemicolon _semicolon_;
	private PTarget _target_;

	public ANativecodeEntryValue() {
		// Constructor
	}

	public ANativecodeEntryValue(@SuppressWarnings("hiding")
	TSemicolon _semicolon_, @SuppressWarnings("hiding")
	PTarget _target_) {
		// Constructor
		setSemicolon(_semicolon_);

		setTarget(_target_);

	}

	@Override
	public Object clone() {
		return new ANativecodeEntryValue(cloneNode(this._semicolon_),
				cloneNode(this._target_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseANativecodeEntryValue(this);
	}

	public TSemicolon getSemicolon() {
		return this._semicolon_;
	}

	public void setSemicolon(TSemicolon node) {
		if (this._semicolon_ != null) {
			this._semicolon_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._semicolon_ = node;
	}

	public PTarget getTarget() {
		return this._target_;
	}

	public void setTarget(PTarget node) {
		if (this._target_ != null) {
			this._target_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._target_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._semicolon_) + toString(this._target_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._semicolon_ == child) {
			this._semicolon_ = null;
			return;
		}

		if (this._target_ == child) {
			this._target_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._semicolon_ == oldChild) {
			setSemicolon((TSemicolon) newChild);
			return;
		}

		if (this._target_ == oldChild) {
			setTarget((PTarget) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
