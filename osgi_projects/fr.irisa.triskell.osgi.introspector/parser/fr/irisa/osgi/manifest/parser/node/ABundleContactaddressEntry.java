/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import java.util.*;
import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class ABundleContactaddressEntry extends
		PBundleContactaddressEntry {
	private TBundleContactaddress _bundleContactaddress_;
	private TAllString _allString_;
	private final LinkedList<PParameter> _parameter_ = new LinkedList<PParameter>();

	public ABundleContactaddressEntry() {
		// Constructor
	}

	public ABundleContactaddressEntry(@SuppressWarnings("hiding")
	TBundleContactaddress _bundleContactaddress_, @SuppressWarnings("hiding")
	TAllString _allString_, @SuppressWarnings("hiding")
	List<PParameter> _parameter_) {
		// Constructor
		setBundleContactaddress(_bundleContactaddress_);

		setAllString(_allString_);

		setParameter(_parameter_);

	}

	@Override
	public Object clone() {
		return new ABundleContactaddressEntry(
				cloneNode(this._bundleContactaddress_),
				cloneNode(this._allString_), cloneList(this._parameter_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleContactaddressEntry(this);
	}

	public TBundleContactaddress getBundleContactaddress() {
		return this._bundleContactaddress_;
	}

	public void setBundleContactaddress(TBundleContactaddress node) {
		if (this._bundleContactaddress_ != null) {
			this._bundleContactaddress_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleContactaddress_ = node;
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
		return "" + toString(this._bundleContactaddress_)
				+ toString(this._allString_) + toString(this._parameter_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleContactaddress_ == child) {
			this._bundleContactaddress_ = null;
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
		if (this._bundleContactaddress_ == oldChild) {
			setBundleContactaddress((TBundleContactaddress) newChild);
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
