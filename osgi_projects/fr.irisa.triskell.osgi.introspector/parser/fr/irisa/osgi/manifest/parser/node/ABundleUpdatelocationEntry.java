/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ABundleUpdatelocationEntry extends
		PBundleUpdatelocationEntry {
	private TBundleUpdatelocation _bundleUpdatelocation_;
	private PUrlValue _urlValue_;
	private final LinkedList<PParameter> _parameter_ = new LinkedList<PParameter>();

	public ABundleUpdatelocationEntry() {
		// Constructor
	}

	public ABundleUpdatelocationEntry(@SuppressWarnings("hiding")
	TBundleUpdatelocation _bundleUpdatelocation_, @SuppressWarnings("hiding")
	PUrlValue _urlValue_, @SuppressWarnings("hiding")
	List<PParameter> _parameter_) {
		// Constructor
		setBundleUpdatelocation(_bundleUpdatelocation_);

		setUrlValue(_urlValue_);

		setParameter(_parameter_);

	}

	@Override
	public Object clone() {
		return new ABundleUpdatelocationEntry(
				cloneNode(this._bundleUpdatelocation_),
				cloneNode(this._urlValue_), cloneList(this._parameter_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleUpdatelocationEntry(this);
	}

	public TBundleUpdatelocation getBundleUpdatelocation() {
		return this._bundleUpdatelocation_;
	}

	public void setBundleUpdatelocation(TBundleUpdatelocation node) {
		if (this._bundleUpdatelocation_ != null) {
			this._bundleUpdatelocation_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleUpdatelocation_ = node;
	}

	public PUrlValue getUrlValue() {
		return this._urlValue_;
	}

	public void setUrlValue(PUrlValue node) {
		if (this._urlValue_ != null) {
			this._urlValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._urlValue_ = node;
	}

	public LinkedList<PParameter> getParameter() {
		return this._parameter_;
	}

	public void setParameter(List<PParameter> list) {
		this._parameter_.clear();
		this._parameter_.addAll(list);
		for (PParameter e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	@Override
	public String toString() {
		return "" + toString(this._bundleUpdatelocation_)
				+ toString(this._urlValue_) + toString(this._parameter_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleUpdatelocation_ == child) {
			this._bundleUpdatelocation_ = null;
			return;
		}

		if (this._urlValue_ == child) {
			this._urlValue_ = null;
			return;
		}

		if (this._parameter_.remove(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._bundleUpdatelocation_ == oldChild) {
			setBundleUpdatelocation((TBundleUpdatelocation) newChild);
			return;
		}

		if (this._urlValue_ == oldChild) {
			setUrlValue((PUrlValue) newChild);
			return;
		}

		for (ListIterator<PParameter> i = this._parameter_.listIterator(); i
				.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PParameter) newChild);
					newChild.parent(this);
					oldChild.parent(null);
					return;
				}

				i.remove();
				oldChild.parent(null);
				return;
			}
		}

		throw new RuntimeException("Not a child.");
	}
}
