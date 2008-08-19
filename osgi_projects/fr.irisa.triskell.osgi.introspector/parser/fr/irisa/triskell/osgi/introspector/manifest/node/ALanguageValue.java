/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ALanguageValue extends PLanguageValue {
	private TIdentifier _identifier_;

	public ALanguageValue() {
		// Constructor
	}

	public ALanguageValue(@SuppressWarnings("hiding")
	TIdentifier _identifier_) {
		// Constructor
		setIdentifier(_identifier_);

	}

	@Override
	public Object clone() {
		return new ALanguageValue(cloneNode(this._identifier_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseALanguageValue(this);
	}

	public TIdentifier getIdentifier() {
		return this._identifier_;
	}

	public void setIdentifier(TIdentifier node) {
		if (this._identifier_ != null) {
			this._identifier_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._identifier_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._identifier_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._identifier_ == child) {
			this._identifier_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._identifier_ == oldChild) {
			setIdentifier((TIdentifier) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
