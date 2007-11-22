package org.kermeta.trek.ui.views.nav;

import org.eclipse.core.runtime.IAdaptable;

public abstract class KTreeObject implements IAdaptable {

	private String name;
	private KTreeElementKind kind;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	public KTreeElementKind getKind() {
		return kind;
	}

	public void setKind(KTreeElementKind kind) {
		this.kind = kind;
	}
	
	public abstract boolean hasFamily();
	
	public String toString(){
		return this.name;
	}

}
