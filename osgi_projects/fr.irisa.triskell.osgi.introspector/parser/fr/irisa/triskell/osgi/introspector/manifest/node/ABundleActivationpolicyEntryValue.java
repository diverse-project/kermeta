/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import java.util.*;
import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ABundleActivationpolicyEntryValue extends
		PBundleActivationpolicyEntryValue {
	private PActivationpolicyValue _activationpolicyValue_;
	private final LinkedList<PActivationpolicyOptions> _activationpolicyOptions_ = new LinkedList<PActivationpolicyOptions>();

	public ABundleActivationpolicyEntryValue() {
		// Constructor
	}

	public ABundleActivationpolicyEntryValue(@SuppressWarnings("hiding")
	PActivationpolicyValue _activationpolicyValue_, @SuppressWarnings("hiding")
	List<PActivationpolicyOptions> _activationpolicyOptions_) {
		// Constructor
		setActivationpolicyValue(_activationpolicyValue_);

		setActivationpolicyOptions(_activationpolicyOptions_);

	}

	@Override
	public Object clone() {
		return new ABundleActivationpolicyEntryValue(
				cloneNode(this._activationpolicyValue_),
				cloneList(this._activationpolicyOptions_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleActivationpolicyEntryValue(this);
	}

	public PActivationpolicyValue getActivationpolicyValue() {
		return this._activationpolicyValue_;
	}

	public void setActivationpolicyValue(PActivationpolicyValue node) {
		if (this._activationpolicyValue_ != null) {
			this._activationpolicyValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._activationpolicyValue_ = node;
	}

	public LinkedList<PActivationpolicyOptions> getActivationpolicyOptions() {
		return this._activationpolicyOptions_;
	}

	public void setActivationpolicyOptions(List<PActivationpolicyOptions> list) {
		this._activationpolicyOptions_.clear();
		this._activationpolicyOptions_.addAll(list);
		for (PActivationpolicyOptions e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	@Override
	public String toString() {
		return "" + toString(this._activationpolicyValue_)
				+ toString(this._activationpolicyOptions_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._activationpolicyValue_ == child) {
			this._activationpolicyValue_ = null;
			return;
		}

		if (this._activationpolicyOptions_.remove(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._activationpolicyValue_ == oldChild) {
			setActivationpolicyValue((PActivationpolicyValue) newChild);
			return;
		}

		for (ListIterator<PActivationpolicyOptions> i = this._activationpolicyOptions_
				.listIterator(); i.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PActivationpolicyOptions) newChild);
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
