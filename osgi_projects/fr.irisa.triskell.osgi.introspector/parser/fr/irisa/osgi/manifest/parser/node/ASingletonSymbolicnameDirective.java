/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ASingletonSymbolicnameDirective extends
		PSymbolicnameDirective {
	private TSingleton _singleton_;
	private PBoolean _boolean_;

	public ASingletonSymbolicnameDirective() {
		// Constructor
	}

	public ASingletonSymbolicnameDirective(@SuppressWarnings("hiding")
	TSingleton _singleton_, @SuppressWarnings("hiding")
	PBoolean _boolean_) {
		// Constructor
		setSingleton(_singleton_);

		setBoolean(_boolean_);

	}

	@Override
	public Object clone() {
		return new ASingletonSymbolicnameDirective(cloneNode(this._singleton_),
				cloneNode(this._boolean_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseASingletonSymbolicnameDirective(this);
	}

	public TSingleton getSingleton() {
		return this._singleton_;
	}

	public void setSingleton(TSingleton node) {
		if (this._singleton_ != null) {
			this._singleton_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._singleton_ = node;
	}

	public PBoolean getBoolean() {
		return this._boolean_;
	}

	public void setBoolean(PBoolean node) {
		if (this._boolean_ != null) {
			this._boolean_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._boolean_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._singleton_) + toString(this._boolean_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._singleton_ == child) {
			this._singleton_ = null;
			return;
		}

		if (this._boolean_ == child) {
			this._boolean_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._singleton_ == oldChild) {
			setSingleton((TSingleton) newChild);
			return;
		}

		if (this._boolean_ == oldChild) {
			setBoolean((PBoolean) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
