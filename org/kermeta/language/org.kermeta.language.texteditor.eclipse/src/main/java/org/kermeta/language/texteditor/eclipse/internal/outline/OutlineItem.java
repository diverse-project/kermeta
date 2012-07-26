/* Id: OutlineItem.java,v 2.0.1 Apr 19, 2012 3:25:44 PM
 * Project : org.kermeta.language.texteditor.eclipse
 * File : OutlineItem.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Apr 19, 2012
 * Authors : 
 * 		Suresh Pillay <suresh.pillay@irisa.fr> 
 * 
 */
package org.kermeta.language.texteditor.eclipse.internal.outline;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.kermeta.language.texteditor.eclipse.internal.Activator;


public class OutlineItem {
	public enum OutlineTypes {
		Package,
		Class,
		Operation,
		DefaultType
	}
	
	public enum LocalisationType {
		Local,
		External,
		Mixed
	}
	
	protected KermetaOutlineHelper helper;
	protected String label;

	protected Image image;
	
	public LocalisationType localisation = LocalisationType.External;
	private Object[] children;
	protected OutlineItem parent;
	protected String packageName;
	protected String opParameters;
	public OutlineTypes type = OutlineTypes.DefaultType;

	public OutlineItem(KermetaOutlineHelper helper) {
		this.helper = helper;
	}
	
	public OutlineItem(String text,OutlineItem parent, KermetaOutlineHelper helper) {
		label = text;
		this.parent = parent;
		this.packageName = "";
		this.opParameters = "";
		if (this.parent != null){
			if (this.parent.getPackageName().compareTo("") != 0){
				this.packageName = this.parent.getPackageName() + "::" + this.parent.label;
			} else {
				if (this.parent.label.compareTo("KermetaRoot") != 0){
					this.packageName = this.parent.label;
				} 
			}
		}
		this.helper = helper;
		
	}
	public void setParameters(String p){
		this.opParameters = p;
	}
	public OutlineItem(String text, KermetaOutlineHelper helper) {
		label = text;
		this.parent = null;
		this.packageName = "";
		this.opParameters = "";
		this.helper = helper;
	}
	public String getLabel() {
	    if (this.type == OutlineItem.OutlineTypes.Operation){
	    	return label; 
	    }
		if (this.getPackageName().compareTo("") == 0){
			return label;
		} else {
			return this.getPackageName() + "::" + label;
		}
	}
	public String getPackageName(){
		return this.packageName;
	}
	public Image getImage() {
		/*
		if (typeDefinitions.size() == 0)
	        return KermetaSpecialIcons.PACKAGE_GRAY;
	    
	    */
		switch(type){
		case Package:
			switch(localisation){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtPackage);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalPackage);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.MixedPackage);
			}
		case Class:
			switch(localisation){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtClass);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalClass);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.MixedClass);
			}
		case Operation:
			switch(localisation){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtOperation);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalOperation);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.MixedOperation);
			}
		default:
			URL url = Activator.getDefault().getBundle().getEntry("icons/specific/DummyClass.gif");
			if ( url != null )
				return ImageDescriptor.createFromURL(url).createImage();
			else return null;
		}
		
	    
	}
	public int getNoOfChildren(){
		if (children != null ){
			return children.length;
		} else {
			switch(type){
			case Package:
				return helper.getPackageChildrenCount(this);
			case Class:
				return helper.getClassChildrenCount(this);
			}			
		}
		return 0;
	}
	public Object[] getChildren() {
		if(children == null){
			switch(type){
			case Package:
				children = helper.updatePackage(this);
				break;
			case Class:
				children = helper.updateClass(this);
				break;
			}
		}
		return children;
	}
	public void  setChildren(Object[] children) {
		this.children = children;
	}
	public OutlineItem getParent(){
		return parent;
	}
	
	
}
