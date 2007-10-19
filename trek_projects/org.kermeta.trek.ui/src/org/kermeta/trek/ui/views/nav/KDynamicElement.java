package org.kermeta.trek.ui.views.nav;

import java.util.ArrayList;

import org.kermeta.trek.TrekModelElement;

public class KDynamicElement extends KTreeObject {
	
	private TrekModelElement element;
	
	private KDynamicElement upper;
	
	private ArrayList<KDynamicElement> lowers;
	
	private KStaticElement parent;

	public TrekModelElement getElement() {
		return element;
	}

	public void setElement(TrekModelElement element) {
		this.element = element;
	}

	public KStaticElement getParent() {
		return parent;
	}

	public void setParent(KStaticElement parent) {
		this.parent = parent;
	}

	public KDynamicElement getUpper() {
		return upper;
	}

	public void setUpper(KDynamicElement upper) {
		this.upper = upper;
	}

	public ArrayList<KDynamicElement> getLowers() {
		return lowers;
	}

	public void setLowers(ArrayList<KDynamicElement> lowers) {
		if(this.lowers==null){
			this.lowers=new ArrayList<KDynamicElement>();
		}
		this.lowers = lowers;
	}

	@Override
	public boolean hasFamily() {
		if(this.getLowers().size()>0){
			return true;
		}
		return false;
	}
	
}
