/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class APathQuoted extends PPathQuoted {
	private TQuote _leftquote_;
	private PPathUnquoted _pathUnquoted_;
	private TQuote _rightquote_;

	public APathQuoted() {
		// Constructor
	}

	public APathQuoted(@SuppressWarnings("hiding")
	TQuote _leftquote_, @SuppressWarnings("hiding")
	PPathUnquoted _pathUnquoted_, @SuppressWarnings("hiding")
	TQuote _rightquote_) {
		// Constructor
		setLeftquote(_leftquote_);

		setPathUnquoted(_pathUnquoted_);

		setRightquote(_rightquote_);

	}

	@Override
	public Object clone() {
		return new APathQuoted(cloneNode(this._leftquote_),
				cloneNode(this._pathUnquoted_), cloneNode(this._rightquote_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAPathQuoted(this);
	}

	public TQuote getLeftquote() {
		return this._leftquote_;
	}

	public void setLeftquote(TQuote node) {
		if (this._leftquote_ != null) {
			this._leftquote_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._leftquote_ = node;
	}

	public PPathUnquoted getPathUnquoted() {
		return this._pathUnquoted_;
	}

	public void setPathUnquoted(PPathUnquoted node) {
		if (this._pathUnquoted_ != null) {
			this._pathUnquoted_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._pathUnquoted_ = node;
	}

	public TQuote getRightquote() {
		return this._rightquote_;
	}

	public void setRightquote(TQuote node) {
		if (this._rightquote_ != null) {
			this._rightquote_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._rightquote_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._leftquote_) + toString(this._pathUnquoted_)
				+ toString(this._rightquote_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._leftquote_ == child) {
			this._leftquote_ = null;
			return;
		}

		if (this._pathUnquoted_ == child) {
			this._pathUnquoted_ = null;
			return;
		}

		if (this._rightquote_ == child) {
			this._rightquote_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._leftquote_ == oldChild) {
			setLeftquote((TQuote) newChild);
			return;
		}

		if (this._pathUnquoted_ == oldChild) {
			setPathUnquoted((PPathUnquoted) newChild);
			return;
		}

		if (this._rightquote_ == oldChild) {
			setRightquote((TQuote) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
