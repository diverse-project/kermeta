/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class Start extends Node {
	private PManifest _pManifest_;
	private EOF _eof_;

	public Start() {
		// Empty body
	}

	public Start(@SuppressWarnings("hiding")
	PManifest _pManifest_, @SuppressWarnings("hiding")
	EOF _eof_) {
		setPManifest(_pManifest_);
		setEOF(_eof_);
	}

	@Override
	public Object clone() {
		return new Start(cloneNode(this._pManifest_), cloneNode(this._eof_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseStart(this);
	}

	public PManifest getPManifest() {
		return this._pManifest_;
	}

	public void setPManifest(PManifest node) {
		if (this._pManifest_ != null) {
			this._pManifest_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._pManifest_ = node;
	}

	public EOF getEOF() {
		return this._eof_;
	}

	public void setEOF(EOF node) {
		if (this._eof_ != null) {
			this._eof_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._eof_ = node;
	}

	@Override
	void removeChild(Node child) {
		if (this._pManifest_ == child) {
			this._pManifest_ = null;
			return;
		}

		if (this._eof_ == child) {
			this._eof_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(Node oldChild, Node newChild) {
		if (this._pManifest_ == oldChild) {
			setPManifest((PManifest) newChild);
			return;
		}

		if (this._eof_ == oldChild) {
			setEOF((EOF) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	public String toString() {
		return "" + toString(this._pManifest_) + toString(this._eof_);
	}
}
