/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AMinorVersion extends PMinorVersion {
	private TDot _dot_;
	private TNumber _number_;
	private PMicroVersion _microVersion_;

	public AMinorVersion() {
		// Constructor
	}

	public AMinorVersion(@SuppressWarnings("hiding")
	TDot _dot_, @SuppressWarnings("hiding")
	TNumber _number_, @SuppressWarnings("hiding")
	PMicroVersion _microVersion_) {
		// Constructor
		setDot(_dot_);

		setNumber(_number_);

		setMicroVersion(_microVersion_);

	}

	@Override
	public Object clone() {
		return new AMinorVersion(cloneNode(this._dot_),
				cloneNode(this._number_), cloneNode(this._microVersion_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAMinorVersion(this);
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

	public TNumber getNumber() {
		return this._number_;
	}

	public void setNumber(TNumber node) {
		if (this._number_ != null) {
			this._number_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._number_ = node;
	}

	public PMicroVersion getMicroVersion() {
		return this._microVersion_;
	}

	public void setMicroVersion(PMicroVersion node) {
		if (this._microVersion_ != null) {
			this._microVersion_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._microVersion_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._dot_) + toString(this._number_)
				+ toString(this._microVersion_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._dot_ == child) {
			this._dot_ = null;
			return;
		}

		if (this._number_ == child) {
			this._number_ = null;
			return;
		}

		if (this._microVersion_ == child) {
			this._microVersion_ = null;
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

		if (this._number_ == oldChild) {
			setNumber((TNumber) newChild);
			return;
		}

		if (this._microVersion_ == oldChild) {
			setMicroVersion((PMicroVersion) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
