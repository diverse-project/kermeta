/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AQualifierQualifierVersion extends PQualifierVersion {
	private TDot _dot_;
	private TQualifier _qualifier_;

	public AQualifierQualifierVersion() {
		// Constructor
	}

	public AQualifierQualifierVersion(@SuppressWarnings("hiding")
	TDot _dot_, @SuppressWarnings("hiding")
	TQualifier _qualifier_) {
		// Constructor
		setDot(_dot_);

		setQualifier(_qualifier_);

	}

	@Override
	public Object clone() {
		return new AQualifierQualifierVersion(cloneNode(this._dot_),
				cloneNode(this._qualifier_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAQualifierQualifierVersion(this);
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

	public TQualifier getQualifier() {
		return this._qualifier_;
	}

	public void setQualifier(TQualifier node) {
		if (this._qualifier_ != null) {
			this._qualifier_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._qualifier_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._dot_) + toString(this._qualifier_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._dot_ == child) {
			this._dot_ = null;
			return;
		}

		if (this._qualifier_ == child) {
			this._qualifier_ = null;
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

		if (this._qualifier_ == oldChild) {
			setQualifier((TQualifier) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
