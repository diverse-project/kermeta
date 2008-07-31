/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ABundleManifestversionEntry extends
		PBundleManifestversionEntry {
	private TBundleManifestversion _bundleManifestversion_;
	private TManifestversion _manifestversion_;
	private final LinkedList<PParameter> _parameter_ = new LinkedList<PParameter>();

	public ABundleManifestversionEntry() {
		// Constructor
	}

	public ABundleManifestversionEntry(@SuppressWarnings("hiding")
	TBundleManifestversion _bundleManifestversion_, @SuppressWarnings("hiding")
	TManifestversion _manifestversion_, @SuppressWarnings("hiding")
	List<PParameter> _parameter_) {
		// Constructor
		setBundleManifestversion(_bundleManifestversion_);

		setManifestversion(_manifestversion_);

		setParameter(_parameter_);

	}

	@Override
	public Object clone() {
		return new ABundleManifestversionEntry(
				cloneNode(this._bundleManifestversion_),
				cloneNode(this._manifestversion_), cloneList(this._parameter_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleManifestversionEntry(this);
	}

	public TBundleManifestversion getBundleManifestversion() {
		return this._bundleManifestversion_;
	}

	public void setBundleManifestversion(TBundleManifestversion node) {
		if (this._bundleManifestversion_ != null) {
			this._bundleManifestversion_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleManifestversion_ = node;
	}

	public TManifestversion getManifestversion() {
		return this._manifestversion_;
	}

	public void setManifestversion(TManifestversion node) {
		if (this._manifestversion_ != null) {
			this._manifestversion_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._manifestversion_ = node;
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
		return "" + toString(this._bundleManifestversion_)
				+ toString(this._manifestversion_) + toString(this._parameter_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleManifestversion_ == child) {
			this._bundleManifestversion_ = null;
			return;
		}

		if (this._manifestversion_ == child) {
			this._manifestversion_ = null;
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
		if (this._bundleManifestversion_ == oldChild) {
			setBundleManifestversion((TBundleManifestversion) newChild);
			return;
		}

		if (this._manifestversion_ == oldChild) {
			setManifestversion((TManifestversion) newChild);
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
