/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AAttribute extends PAttribute {
	private TAttributeEntry _attributeEntry_;
	private PStringEntryValue _stringEntryValue_;

	public AAttribute() {
		// Constructor
	}

	public AAttribute(@SuppressWarnings("hiding")
	TAttributeEntry _attributeEntry_, @SuppressWarnings("hiding")
	PStringEntryValue _stringEntryValue_) {
		// Constructor
		setAttributeEntry(_attributeEntry_);

		setStringEntryValue(_stringEntryValue_);

	}

	@Override
	public Object clone() {
		return new AAttribute(cloneNode(this._attributeEntry_),
				cloneNode(this._stringEntryValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAAttribute(this);
	}

	public TAttributeEntry getAttributeEntry() {
		return this._attributeEntry_;
	}

	public void setAttributeEntry(TAttributeEntry node) {
		if (this._attributeEntry_ != null) {
			this._attributeEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._attributeEntry_ = node;
	}

	public PStringEntryValue getStringEntryValue() {
		return this._stringEntryValue_;
	}

	public void setStringEntryValue(PStringEntryValue node) {
		if (this._stringEntryValue_ != null) {
			this._stringEntryValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._stringEntryValue_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._attributeEntry_)
				+ toString(this._stringEntryValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._attributeEntry_ == child) {
			this._attributeEntry_ = null;
			return;
		}

		if (this._stringEntryValue_ == child) {
			this._stringEntryValue_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._attributeEntry_ == oldChild) {
			setAttributeEntry((TAttributeEntry) newChild);
			return;
		}

		if (this._stringEntryValue_ == oldChild) {
			setStringEntryValue((PStringEntryValue) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
