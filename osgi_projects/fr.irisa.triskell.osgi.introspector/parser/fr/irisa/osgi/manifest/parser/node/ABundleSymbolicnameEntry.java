/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ABundleSymbolicnameEntry extends PBundleSymbolicnameEntry {
	private TBundleSymbolicname _bundleSymbolicname_;
	private PUniqueName _uniqueName_;
	private final LinkedList<PSymbolicnameOption> _symbolicnameOption_ = new LinkedList<PSymbolicnameOption>();

	public ABundleSymbolicnameEntry() {
		// Constructor
	}

	public ABundleSymbolicnameEntry(@SuppressWarnings("hiding")
	TBundleSymbolicname _bundleSymbolicname_, @SuppressWarnings("hiding")
	PUniqueName _uniqueName_, @SuppressWarnings("hiding")
	List<PSymbolicnameOption> _symbolicnameOption_) {
		// Constructor
		setBundleSymbolicname(_bundleSymbolicname_);

		setUniqueName(_uniqueName_);

		setSymbolicnameOption(_symbolicnameOption_);

	}

	@Override
	public Object clone() {
		return new ABundleSymbolicnameEntry(
				cloneNode(this._bundleSymbolicname_),
				cloneNode(this._uniqueName_),
				cloneList(this._symbolicnameOption_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleSymbolicnameEntry(this);
	}

	public TBundleSymbolicname getBundleSymbolicname() {
		return this._bundleSymbolicname_;
	}

	public void setBundleSymbolicname(TBundleSymbolicname node) {
		if (this._bundleSymbolicname_ != null) {
			this._bundleSymbolicname_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleSymbolicname_ = node;
	}

	public PUniqueName getUniqueName() {
		return this._uniqueName_;
	}

	public void setUniqueName(PUniqueName node) {
		if (this._uniqueName_ != null) {
			this._uniqueName_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._uniqueName_ = node;
	}

	public LinkedList<PSymbolicnameOption> getSymbolicnameOption() {
		return this._symbolicnameOption_;
	}

	public void setSymbolicnameOption(List<PSymbolicnameOption> list) {
		this._symbolicnameOption_.clear();
		this._symbolicnameOption_.addAll(list);
		for (PSymbolicnameOption e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	@Override
	public String toString() {
		return "" + toString(this._bundleSymbolicname_)
				+ toString(this._uniqueName_)
				+ toString(this._symbolicnameOption_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleSymbolicname_ == child) {
			this._bundleSymbolicname_ = null;
			return;
		}

		if (this._uniqueName_ == child) {
			this._uniqueName_ = null;
			return;
		}

		if (this._symbolicnameOption_.remove(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._bundleSymbolicname_ == oldChild) {
			setBundleSymbolicname((TBundleSymbolicname) newChild);
			return;
		}

		if (this._uniqueName_ == oldChild) {
			setUniqueName((PUniqueName) newChild);
			return;
		}

		for (ListIterator<PSymbolicnameOption> i = this._symbolicnameOption_
				.listIterator(); i.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PSymbolicnameOption) newChild);
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
