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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.kermeta.language.texteditor.eclipse.internal.Activator;
import org.kermeta.language.texteditor.eclipse.internal.outline.ItemLocalisation.LocalisationType;


public class OutlineItem {
	public enum OutlineTypes {
		Package,
		Class,
		Operation,
		Attribute,
		Reference,
		DerivedProperty,
		Enumeration,
		EnumLiteral,
		Invariant,
		Precondition,
		Postcondition,
		DefaultType
	}
	
	
	
	protected KermetaOutlineHelper helper;
	protected String label;
	protected String displayedLabel; // this is the label that will be displayed

	protected Image image;
	
	public LocalisationType localisationType = LocalisationType.External;
	public ItemLocalisation localisation;
	private Object[] children;
	protected OutlineItem parent;
	protected String namespace;
	protected String opParameters;
	public OutlineTypes type = OutlineTypes.DefaultType;
	
	

	public OutlineItem(KermetaOutlineHelper helper) {
		this.helper = helper;
	}
	
	public OutlineItem(String text, String displayedLabel, OutlineItem parent, KermetaOutlineHelper helper) {
		label = text;
		if(displayedLabel == null)
			this.displayedLabel = text;
		else
			this.displayedLabel = displayedLabel;
		this.parent = parent;
		this.namespace = "";
		this.opParameters = "";
		if (this.parent != null){
			if (this.parent.getNamespace().compareTo("") != 0){
				this.namespace = this.parent.getNamespace() + "::" + this.parent.label;
			} else {
				if (this.parent.label.compareTo("KermetaRoot") != 0){
					this.namespace = this.parent.label;
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
		this.namespace = "";
		this.opParameters = "";
		this.helper = helper;
	}
	public String getLabel() {
		if (this.type == OutlineItem.OutlineTypes.Operation){
	    	return label; 
	    }
		/*if (this.type == OutlineItem.OutlineTypes.Class){
	    	return label; 
	    }*/
		//if (this.getPackageName().compareTo("") == 0){
			return label;
		/*} else {
			return this.getPackageName() + "::" + label;
		}*/
		
	    
	}
	public String getDisplayedLabel() {
		return displayedLabel;		
	}
	public String getNamespace(){
		return this.namespace;
	}
	public Image getImage() {
		/*
		if (typeDefinitions.size() == 0)
	        return KermetaSpecialIcons.PACKAGE_GRAY;
	    
	    */
		switch(type){
		case Package:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtPackage);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalPackage);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.MixedPackage);
			}
		case Class:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtClass);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalClass);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.MixedClass);
			}
		case Operation:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtOperation);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalOperation);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.MixedOperation);
			}
		case Attribute:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtAttribute);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalAttribute);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalAttribute);
			}
		case Reference:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtReference);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalReference);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalReference);
			}
		case DerivedProperty:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtDerivedProp);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalDerivedProp);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalDerivedProp);
			}
		case Invariant:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtInvariant);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalInvariant);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalInvariant);
			}
		case Precondition:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtPre);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalPre);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalPre);
			}
		case Postcondition:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtPost);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalPost);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalPost);
			}
		case Enumeration:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtEnumeration);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalEnumeration);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalEnumeration);
			}
		case EnumLiteral:
			switch(localisationType){
			case External:
				return Activator.getDefault().getImage(Activator.ImageTypes.ExtEnumLiteral);
			case Local: 
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalEnumLiteral);
			case Mixed:
				return Activator.getDefault().getImage(Activator.ImageTypes.LocalEnumLiteral);
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
			case Enumeration:
				return helper.getTypeDefinitionChildrenCount(this);
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
			case Enumeration:
				children = helper.updateEnumeration(this);
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
	
	public boolean isSimilar(OutlineItem otherItem){
		return otherItem.namespace.equals(namespace) && otherItem.label.equals(label);
	}
	
	public String fullName(){
		if(namespace != null && !namespace.isEmpty()){
			return namespace+"::"+label;
		}
		else{
			return label;
		}
	}
	
	public void setLocalisation(ItemLocalisation loc){
		this.localisationType =  loc.localisationType;
		this.localisation = loc;
	}

	
	
}
