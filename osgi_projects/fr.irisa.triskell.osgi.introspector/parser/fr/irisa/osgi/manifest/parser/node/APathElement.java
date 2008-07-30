/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class APathElement extends PPathElement {
	private TUnquotedString _unquotedString_;

	public APathElement() {
		// Constructor
	}

	public APathElement(@SuppressWarnings("hiding")
	TUnquotedString _unquotedString_) {
		// Constructor
		setUnquotedString(_unquotedString_);

	}

	@Override
	public Object clone() {
		return new APathElement(cloneNode(this._unquotedString_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAPathElement(this);
	}

	public TUnquotedString getUnquotedString() {
		return this._unquotedString_;
	}

	public void setUnquotedString(TUnquotedString node) {
		if (this._unquotedString_ != null) {
			this._unquotedString_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._unquotedString_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._unquotedString_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._unquotedString_ == child) {
			this._unquotedString_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._unquotedString_ == oldChild) {
			setUnquotedString((TUnquotedString) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
