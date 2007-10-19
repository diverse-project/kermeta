package org.kermeta.trek.ui.views.nav;

import java.util.ArrayList;

import org.kermeta.trek.UseKaseModel;

public class KStaticElement extends KTreeObject {
	private ArrayList<KDynamicElement> childs;
	private UseKaseModel modelRoot;
	
	public UseKaseModel getModelRoot(){
		return this.modelRoot;
	}
	
	public KStaticElement(String name,UseKaseModel modelRoot,KTreeElementKind kind){
		this.setName(name);
		this.setKind(kind);
		this.modelRoot=modelRoot;
	}
	
	public void addChild(KDynamicElement child){
		this.getChilds().add(child);
		child.setParent(this);
	}
	
	public ArrayList<KDynamicElement> getChilds(){
		if(this.childs==null){
			this.childs=new ArrayList<KDynamicElement>();
		}
		return this.childs;
	}

	@Override
	public boolean hasFamily() {
		if(this.getChilds().size()>0){
			return true;
		}
		return false;
	}
}
