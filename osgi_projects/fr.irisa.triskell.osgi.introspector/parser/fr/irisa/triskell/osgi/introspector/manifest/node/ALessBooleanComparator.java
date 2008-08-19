/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ALessBooleanComparator extends PBooleanComparator {
	private TLess _less_;

	public ALessBooleanComparator() {
		// Constructor
	}

	public ALessBooleanComparator(@SuppressWarnings("hiding")
	TLess _less_) {
		// Constructor
		setLess(_less_);

	}

	@Override
	public Object clone() {
		return new ALessBooleanComparator(cloneNode(this._less_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseALessBooleanComparator(this);
	}

	public TLess getLess() {
		return this._less_;
	}

	public void setLess(TLess node) {
		if (this._less_ != null) {
			this._less_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._less_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._less_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._less_ == child) {
			this._less_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._less_ == oldChild) {
			setLess((TLess) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
