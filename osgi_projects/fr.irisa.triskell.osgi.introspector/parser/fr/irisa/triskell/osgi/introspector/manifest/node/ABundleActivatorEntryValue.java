/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import java.util.*;
import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ABundleActivatorEntryValue extends
		PBundleActivatorEntryValue {
	private PUniqueName _uniqueName_;
	private final LinkedList<PParameter> _parameter_ = new LinkedList<PParameter>();

	public ABundleActivatorEntryValue() {
		// Constructor
	}

	public ABundleActivatorEntryValue(@SuppressWarnings("hiding")
	PUniqueName _uniqueName_, @SuppressWarnings("hiding")
	List<PParameter> _parameter_) {
		// Constructor
		setUniqueName(_uniqueName_);

		setParameter(_parameter_);

	}

	@Override
	public Object clone() {
		return new ABundleActivatorEntryValue(cloneNode(this._uniqueName_),
				cloneList(this._parameter_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleActivatorEntryValue(this);
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
		return "" + toString(this._uniqueName_) + toString(this._parameter_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._uniqueName_ == child) {
			this._uniqueName_ = null;
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
		if (this._uniqueName_ == oldChild) {
			setUniqueName((PUniqueName) newChild);
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
