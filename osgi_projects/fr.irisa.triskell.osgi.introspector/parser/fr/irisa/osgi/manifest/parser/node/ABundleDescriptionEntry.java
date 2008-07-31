/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ABundleDescriptionEntry extends PBundleDescriptionEntry {
	private TBundleDescription _bundleDescription_;
	private TAllString _allString_;
	private final LinkedList<PParameter> _parameter_ = new LinkedList<PParameter>();

	public ABundleDescriptionEntry() {
		// Constructor
	}

	public ABundleDescriptionEntry(@SuppressWarnings("hiding")
	TBundleDescription _bundleDescription_, @SuppressWarnings("hiding")
	TAllString _allString_, @SuppressWarnings("hiding")
	List<PParameter> _parameter_) {
		// Constructor
		setBundleDescription(_bundleDescription_);

		setAllString(_allString_);

		setParameter(_parameter_);

	}

	@Override
	public Object clone() {
		return new ABundleDescriptionEntry(cloneNode(this._bundleDescription_),
				cloneNode(this._allString_), cloneList(this._parameter_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleDescriptionEntry(this);
	}

	public TBundleDescription getBundleDescription() {
		return this._bundleDescription_;
	}

	public void setBundleDescription(TBundleDescription node) {
		if (this._bundleDescription_ != null) {
			this._bundleDescription_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleDescription_ = node;
	}

	public TAllString getAllString() {
		return this._allString_;
	}

	public void setAllString(TAllString node) {
		if (this._allString_ != null) {
			this._allString_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._allString_ = node;
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
		return "" + toString(this._bundleDescription_)
				+ toString(this._allString_) + toString(this._parameter_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleDescription_ == child) {
			this._bundleDescription_ = null;
			return;
		}

		if (this._allString_ == child) {
			this._allString_ = null;
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
		if (this._bundleDescription_ == oldChild) {
			setBundleDescription((TBundleDescription) newChild);
			return;
		}

		if (this._allString_ == oldChild) {
			setAllString((TAllString) newChild);
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
