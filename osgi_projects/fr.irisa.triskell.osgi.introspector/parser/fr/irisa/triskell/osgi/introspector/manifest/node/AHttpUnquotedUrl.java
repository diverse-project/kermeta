/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class AHttpUnquotedUrl extends PUnquotedUrl {
	private TUrlHttp _urlHttp_;
	private PPathUnquoted _pathUnquoted_;

	public AHttpUnquotedUrl() {
		// Constructor
	}

	public AHttpUnquotedUrl(@SuppressWarnings("hiding")
	TUrlHttp _urlHttp_, @SuppressWarnings("hiding")
	PPathUnquoted _pathUnquoted_) {
		// Constructor
		setUrlHttp(_urlHttp_);

		setPathUnquoted(_pathUnquoted_);

	}

	@Override
	public Object clone() {
		return new AHttpUnquotedUrl(cloneNode(this._urlHttp_),
				cloneNode(this._pathUnquoted_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAHttpUnquotedUrl(this);
	}

	public TUrlHttp getUrlHttp() {
		return this._urlHttp_;
	}

	public void setUrlHttp(TUrlHttp node) {
		if (this._urlHttp_ != null) {
			this._urlHttp_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._urlHttp_ = node;
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

	@Override
	public String toString() {
		return "" + toString(this._urlHttp_) + toString(this._pathUnquoted_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._urlHttp_ == child) {
			this._urlHttp_ = null;
			return;
		}

		if (this._pathUnquoted_ == child) {
			this._pathUnquoted_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._urlHttp_ == oldChild) {
			setUrlHttp((TUrlHttp) newChild);
			return;
		}

		if (this._pathUnquoted_ == oldChild) {
			setPathUnquoted((PPathUnquoted) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
