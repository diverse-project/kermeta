/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ANotEqualsBooleanComparator extends PBooleanComparator {
	private TNotEquals _notEquals_;

	public ANotEqualsBooleanComparator() {
		// Constructor
	}

	public ANotEqualsBooleanComparator(@SuppressWarnings("hiding")
	TNotEquals _notEquals_) {
		// Constructor
		setNotEquals(_notEquals_);

	}

	@Override
	public Object clone() {
		return new ANotEqualsBooleanComparator(cloneNode(this._notEquals_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseANotEqualsBooleanComparator(this);
	}

	public TNotEquals getNotEquals() {
		return this._notEquals_;
	}

	public void setNotEquals(TNotEquals node) {
		if (this._notEquals_ != null) {
			this._notEquals_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._notEquals_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._notEquals_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._notEquals_ == child) {
			this._notEquals_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._notEquals_ == oldChild) {
			setNotEquals((TNotEquals) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
