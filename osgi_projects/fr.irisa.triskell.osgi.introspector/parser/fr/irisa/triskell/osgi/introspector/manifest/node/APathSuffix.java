/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class APathSuffix extends PPathSuffix {
	private TPathSep _pathSep_;
	private PPathElement _pathElement_;

	public APathSuffix() {
		// Constructor
	}

	public APathSuffix(@SuppressWarnings("hiding")
	TPathSep _pathSep_, @SuppressWarnings("hiding")
	PPathElement _pathElement_) {
		// Constructor
		setPathSep(_pathSep_);

		setPathElement(_pathElement_);

	}

	@Override
	public Object clone() {
		return new APathSuffix(cloneNode(this._pathSep_),
				cloneNode(this._pathElement_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAPathSuffix(this);
	}

	public TPathSep getPathSep() {
		return this._pathSep_;
	}

	public void setPathSep(TPathSep node) {
		if (this._pathSep_ != null) {
			this._pathSep_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._pathSep_ = node;
	}

	public PPathElement getPathElement() {
		return this._pathElement_;
	}

	public void setPathElement(PPathElement node) {
		if (this._pathElement_ != null) {
			this._pathElement_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._pathElement_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._pathSep_) + toString(this._pathElement_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._pathSep_ == child) {
			this._pathSep_ = null;
			return;
		}

		if (this._pathElement_ == child) {
			this._pathElement_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._pathSep_ == oldChild) {
			setPathSep((TPathSep) newChild);
			return;
		}

		if (this._pathElement_ == oldChild) {
			setPathElement((PPathElement) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
