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
		Operation
	}
	protected String label;

	protected Image image;
	
	private boolean isLocal = false;
	protected Object[] children;
	protected OutlineItem parent;
	protected String packageName;
	protected String opParameters;
	public OutlineTypes type;

	public OutlineItem() {
	}
	
	public OutlineItem(String text,OutlineItem parent) {
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
		
	}
	public void setParameters(String p){
		this.opParameters = p;
	}
	public OutlineItem(String text) {
		label = text;
		this.parent = null;
		this.packageName = "";
		this.opParameters = "";
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
	    
	    if ( isPartiallyImported() )
	    	return KermetaSpecialIcons.PACKAGE_BLUE_RED;
	    */
	    if ( isLocal )
	    	return Activator.getDefault().getImage(Activator.ImageTypes.LocalPackage);
	    else
	    	return Activator.getDefault().getImage(Activator.ImageTypes.ExtPackage);
	}
	public int getNoOfChildren(){
		if (children != null ){
			return children.length;
		} else {
			return 0;
		}
	}
	public Object[] getChildren() {
		return children;
	}
	public OutlineItem getParent(){
		return parent;
	}
}
