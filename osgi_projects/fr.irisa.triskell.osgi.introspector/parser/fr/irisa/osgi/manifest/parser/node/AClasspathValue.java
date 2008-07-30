/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AClasspathValue extends PClasspathValue {
	private TComma _comma_;
	private PClasspathEntry _classpathEntry_;

	public AClasspathValue() {
		// Constructor
	}

	public AClasspathValue(@SuppressWarnings("hiding")
	TComma _comma_, @SuppressWarnings("hiding")
	PClasspathEntry _classpathEntry_) {
		// Constructor
		setComma(_comma_);

		setClasspathEntry(_classpathEntry_);

	}

	@Override
	public Object clone() {
		return new AClasspathValue(cloneNode(this._comma_),
				cloneNode(this._classpathEntry_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAClasspathValue(this);
	}

	public TComma getComma() {
		return this._comma_;
	}

	public void setComma(TComma node) {
		if (this._comma_ != null) {
			this._comma_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._comma_ = node;
	}

	public PClasspathEntry getClasspathEntry() {
		return this._classpathEntry_;
	}

	public void setClasspathEntry(PClasspathEntry node) {
		if (this._classpathEntry_ != null) {
			this._classpathEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._classpathEntry_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._comma_) + toString(this._classpathEntry_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._comma_ == child) {
			this._comma_ = null;
			return;
		}

		if (this._classpathEntry_ == child) {
			this._classpathEntry_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._comma_ == oldChild) {
			setComma((TComma) newChild);
			return;
		}

		if (this._classpathEntry_ == oldChild) {
			setClasspathEntry((PClasspathEntry) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
