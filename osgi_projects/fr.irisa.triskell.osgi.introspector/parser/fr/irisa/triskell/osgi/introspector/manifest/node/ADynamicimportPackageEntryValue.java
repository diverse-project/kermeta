/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import java.util.*;
import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ADynamicimportPackageEntryValue extends
		PDynamicimportPackageEntryValue {
	private PDynamicDescription _dynamicDescription_;
	private final LinkedList<PDynamicimportPackageValue> _dynamicimportPackageValue_ = new LinkedList<PDynamicimportPackageValue>();

	public ADynamicimportPackageEntryValue() {
		// Constructor
	}

	public ADynamicimportPackageEntryValue(@SuppressWarnings("hiding")
	PDynamicDescription _dynamicDescription_, @SuppressWarnings("hiding")
	List<PDynamicimportPackageValue> _dynamicimportPackageValue_) {
		// Constructor
		setDynamicDescription(_dynamicDescription_);

		setDynamicimportPackageValue(_dynamicimportPackageValue_);

	}

	@Override
	public Object clone() {
		return new ADynamicimportPackageEntryValue(
				cloneNode(this._dynamicDescription_),
				cloneList(this._dynamicimportPackageValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseADynamicimportPackageEntryValue(this);
	}

	public PDynamicDescription getDynamicDescription() {
		return this._dynamicDescription_;
	}

	public void setDynamicDescription(PDynamicDescription node) {
		if (this._dynamicDescription_ != null) {
			this._dynamicDescription_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._dynamicDescription_ = node;
	}

	public LinkedList<PDynamicimportPackageValue> getDynamicimportPackageValue() {
		return this._dynamicimportPackageValue_;
	}

	public void setDynamicimportPackageValue(
			List<PDynamicimportPackageValue> list) {
		this._dynamicimportPackageValue_.clear();
		this._dynamicimportPackageValue_.addAll(list);
		for (PDynamicimportPackageValue e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	@Override
	public String toString() {
		return "" + toString(this._dynamicDescription_)
				+ toString(this._dynamicimportPackageValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._dynamicDescription_ == child) {
			this._dynamicDescription_ = null;
			return;
		}

		if (this._dynamicimportPackageValue_.remove(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._dynamicDescription_ == oldChild) {
			setDynamicDescription((PDynamicDescription) newChild);
			return;
		}

		for (ListIterator<PDynamicimportPackageValue> i = this._dynamicimportPackageValue_
				.listIterator(); i.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PDynamicimportPackageValue) newChild);
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
