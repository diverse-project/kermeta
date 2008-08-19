/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import java.util.*;
import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class AExportPackageEntryValue extends PExportPackageEntryValue {
	private PPackageName _packageName_;
	private final LinkedList<PPackageNames> _packageNames_ = new LinkedList<PPackageNames>();
	private final LinkedList<PExportPackageParameter> _exportPackageParameter_ = new LinkedList<PExportPackageParameter>();

	public AExportPackageEntryValue() {
		// Constructor
	}

	public AExportPackageEntryValue(@SuppressWarnings("hiding")
	PPackageName _packageName_, @SuppressWarnings("hiding")
	List<PPackageNames> _packageNames_, @SuppressWarnings("hiding")
	List<PExportPackageParameter> _exportPackageParameter_) {
		// Constructor
		setPackageName(_packageName_);

		setPackageNames(_packageNames_);

		setExportPackageParameter(_exportPackageParameter_);

	}

	@Override
	public Object clone() {
		return new AExportPackageEntryValue(cloneNode(this._packageName_),
				cloneList(this._packageNames_),
				cloneList(this._exportPackageParameter_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAExportPackageEntryValue(this);
	}

	public PPackageName getPackageName() {
		return this._packageName_;
	}

	public void setPackageName(PPackageName node) {
		if (this._packageName_ != null) {
			this._packageName_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._packageName_ = node;
	}

	public LinkedList<PPackageNames> getPackageNames() {
		return this._packageNames_;
	}

	public void setPackageNames(List<PPackageNames> list) {
		this._packageNames_.clear();
		this._packageNames_.addAll(list);
		for (PPackageNames e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	public LinkedList<PExportPackageParameter> getExportPackageParameter() {
		return this._exportPackageParameter_;
	}

	public void setExportPackageParameter(List<PExportPackageParameter> list) {
		this._exportPackageParameter_.clear();
		this._exportPackageParameter_.addAll(list);
		for (PExportPackageParameter e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	@Override
	public String toString() {
		return "" + toString(this._packageName_)
				+ toString(this._packageNames_)
				+ toString(this._exportPackageParameter_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._packageName_ == child) {
			this._packageName_ = null;
			return;
		}

		if (this._packageNames_.remove(child)) {
			return;
		}

		if (this._exportPackageParameter_.remove(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._packageName_ == oldChild) {
			setPackageName((PPackageName) newChild);
			return;
		}

		for (ListIterator<PPackageNames> i = this._packageNames_.listIterator(); i
				.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PPackageNames) newChild);
					newChild.parent(this);
					oldChild.parent(null);
					return;
				}

				i.remove();
				oldChild.parent(null);
				return;
			}
		}

		for (ListIterator<PExportPackageParameter> i = this._exportPackageParameter_
				.listIterator(); i.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PExportPackageParameter) newChild);
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
