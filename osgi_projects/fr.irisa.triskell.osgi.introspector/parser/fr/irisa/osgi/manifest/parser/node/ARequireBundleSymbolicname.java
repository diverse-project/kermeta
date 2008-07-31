/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ARequireBundleSymbolicname extends
		PRequireBundleSymbolicname {
	private PUniqueName _uniqueName_;
	private final LinkedList<PRequireBundleOptions> _requireBundleOptions_ = new LinkedList<PRequireBundleOptions>();

	public ARequireBundleSymbolicname() {
		// Constructor
	}

	public ARequireBundleSymbolicname(@SuppressWarnings("hiding")
	PUniqueName _uniqueName_, @SuppressWarnings("hiding")
	List<PRequireBundleOptions> _requireBundleOptions_) {
		// Constructor
		setUniqueName(_uniqueName_);

		setRequireBundleOptions(_requireBundleOptions_);

	}

	@Override
	public Object clone() {
		return new ARequireBundleSymbolicname(cloneNode(this._uniqueName_),
				cloneList(this._requireBundleOptions_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseARequireBundleSymbolicname(this);
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

	public LinkedList<PRequireBundleOptions> getRequireBundleOptions() {
		return this._requireBundleOptions_;
	}

	public void setRequireBundleOptions(List<PRequireBundleOptions> list) {
		this._requireBundleOptions_.clear();
		this._requireBundleOptions_.addAll(list);
		for (PRequireBundleOptions e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	@Override
	public String toString() {
		return "" + toString(this._uniqueName_)
				+ toString(this._requireBundleOptions_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._uniqueName_ == child) {
			this._uniqueName_ = null;
			return;
		}

		if (this._requireBundleOptions_.remove(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._uniqueName_ == oldChild) {
			setUniqueName((PUniqueName) newChild);
			return;
		}

		for (ListIterator<PRequireBundleOptions> i = this._requireBundleOptions_
				.listIterator(); i.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PRequireBundleOptions) newChild);
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
