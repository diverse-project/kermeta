/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ANeverFragmentAttachmentValue extends
		PFragmentAttachmentValue {
	private TNever _never_;

	public ANeverFragmentAttachmentValue() {
		// Constructor
	}

	public ANeverFragmentAttachmentValue(@SuppressWarnings("hiding")
	TNever _never_) {
		// Constructor
		setNever(_never_);

	}

	@Override
	public Object clone() {
		return new ANeverFragmentAttachmentValue(cloneNode(this._never_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseANeverFragmentAttachmentValue(this);
	}

	public TNever getNever() {
		return this._never_;
	}

	public void setNever(TNever node) {
		if (this._never_ != null) {
			this._never_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._never_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._never_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._never_ == child) {
			this._never_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._never_ == oldChild) {
			setNever((TNever) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
