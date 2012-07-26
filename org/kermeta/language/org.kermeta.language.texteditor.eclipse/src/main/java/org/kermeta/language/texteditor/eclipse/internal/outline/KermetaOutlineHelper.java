/* Id: KermetaOutlineHelper.java,v 2.0.1 Apr 22, 2012 1:16:33 PM
 * Project : org.kermeta.language.texteditor.eclipse
 * File : KermetaOutlineHelper.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Apr 22, 2012
 * Authors : 
 * 		Suresh Pillay <suresh.pillay@irisa.fr> 
 * 
 */
package org.kermeta.language.texteditor.eclipse.internal.outline;

import java.net.URI;
import java.util.Scanner;

import org.eclipse.core.resources.IFile;
import org.kermeta.language.loader.kmt.scala.KMPrinter;
import org.kermeta.language.structure.Class;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Package;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.texteditor.eclipse.internal.outline.OutlineItem.LocalisationType;
import org.kermeta.language.texteditor.eclipse.internal.outline.OutlineItem.OutlineTypes;

public class KermetaOutlineHelper {
	private ModelingUnit modelingUnit;
	
	protected URI outlineForFile; 
	
	public KermetaOutlineHelper(ModelingUnit o){
		modelingUnit = o;
	}
	public OutlineItem getRootStructure(){
		OutlineItem base = new OutlineItem("KermetaRoot", this);
		OutlineItem[] baseChildren = new OutlineItem[this.modelingUnit.getPackages().size()];
		base.setChildren(baseChildren);
		boolean hasChildren = false;
		for (int i = 0; i < this.modelingUnit.getPackages().size(); i++) {
			OutlineItem ele = new OutlineItem(this.modelingUnit.getPackages().get(i).getName(),base, this);
			ele.type = OutlineTypes.Package;
			ele.localisation = getLocalisationType(this.modelingUnit.getPackages().get(i));
			baseChildren[i] = ele;
			hasChildren = true;
			// initial package must know their child in order to display the open arrow
			//ele.setChildren(updatePackage(ele));
			//updateAllChildren(ele);
		}
		return base;
	}
	public OutlineItem[] getClassChildren(Package p,OutlineItem parent){
		KMPrinter opPrinter = new KMPrinter();
		for(int i=0; i < p.getOwnedTypeDefinition().size(); i++){
			if ( p.getOwnedTypeDefinition().get(i).getName().compareTo(parent.label) == 0 &&
				(p.getOwnedTypeDefinition().get(i) instanceof ClassDefinition)	){
				ClassDefinition cn = (ClassDefinition) p.getOwnedTypeDefinition().get(i);
				int size = cn.getOwnedOperation().size();
				OutlineItem[] objs = new OutlineItem[size];
				int cnt = 0;
				for(int j=0; j < cn.getOwnedOperation().size(); j++){
					if (cn.getOwnedOperation().get(j) instanceof Operation){
						Operation op = cn.getOwnedOperation().get(j);
						String label = opPrinter.convertToText(op);
						OutlineItem it = new OutlineItem(label,parent, this);
						/*
						for(int k=0; k < op.getOwnedParameter().size(); k++){
							params += op.getOwnedParameter().get(k).getName();
							if ( k < op.getOwnedParameter().size()-1 ){
								params += ",";
							}
						}
						*/
						it.type = OutlineTypes.Operation;
						it.localisation = getLocalisationType(op);
						objs[cnt] = it;
						cnt++;
					}	
				}
				return objs;
			}
		}
		return null;
		
	}
	public OutlineItem[] getPackageChildren(Package p,OutlineItem parent){
		int size = p.getOwnedTypeDefinition().size() + p.getNestedPackage().size();
		OutlineItem[] objs = new OutlineItem[size];
		int cnt = 0;
		for(int i=0; i < p.getOwnedTypeDefinition().size(); i++){
			OutlineItem it = new OutlineItem(p.getOwnedTypeDefinition().get(i).getName(),parent, this);
			if (p.getOwnedTypeDefinition().get(i) instanceof ClassDefinition){
				it.type = OutlineTypes.Class;
				it.localisation = getLocalisationType(p.getOwnedTypeDefinition().get(i));
			}
			
			objs[cnt] = it;
			cnt++;
		}
		for(int i=0; i < p.getNestedPackage().size(); i++){
			OutlineItem it = new OutlineItem(p.getNestedPackage().get(i).getName(),parent, this);
			it.type = OutlineTypes.Package;
			it.localisation = getLocalisationType(p.getNestedPackage().get(i));
			objs[cnt] = it;
			cnt++;
		}
		return objs;
	}
	public Package getNestedPackage(String name,Package parent){
		if (parent == null){
			for (int i = 0; i < this.modelingUnit.getPackages().size(); i++) {
				if (this.modelingUnit.getPackages().get(i).getName().compareTo(name) == 0){
					return this.modelingUnit.getPackages().get(i);
				}
			}
		} else {
			for(int i=0; i < parent.getNestedPackage().size(); i++){
				if ( parent.getNestedPackage().get(i).getName().compareTo(name) == 0){
					return parent.getNestedPackage().get(i);
				}
			}
		}
		return null;
	}
	public Package findPackage(String packageName){
		// Will Return the deepest Package found
		if (packageName.contains("::")){
			Package curr = null;
			String[] result = packageName.split("::");
		    for (int x=0; x<result.length; x++){
		    	Package p = getNestedPackage(result[x],curr); 
		    	if ( p != null ){
		    		curr = p; 
		    	}
		    }
			return curr;
		} else {
			return 	getNestedPackage(packageName,null); 
		}
	}
	public OutlineItem[] updatePackage(OutlineItem it){
		return getPackageChildren(findPackage(it.getLabel()),it);
	}
	public OutlineItem[] updateClass(OutlineItem it){
		return getClassChildren(findPackage(it.getPackageName()),it);
	}
	
	
	public LocalisationType getLocalisationType(KermetaModelElement elem){
		boolean localFound = false;
		boolean externalFound = false;
		String localFile = outlineForFile.toString();
		for(Tag tag : elem.getKOwnedTags()){
			if(tag.getName().equals("traceability_text_reference")){
				if(tag.getValue().contains(localFile))
					localFound = true;
				else
					externalFound = true;
			}
		}
		if(localFound && externalFound) return LocalisationType.Mixed;
		else if(localFound) return LocalisationType.Local;
		else return LocalisationType.External;
	}
	public URI getOutlineForFile() {
		return outlineForFile;
	}
	public void setOutlineForFile(URI outlineForFile) {
		this.outlineForFile = outlineForFile;
	}
	
	
	public void updateAllChildren(OutlineItem base){
		if (base.type == OutlineTypes.Package){
			base.setChildren(updatePackage(base));
		}
		if (base.type == OutlineTypes.Class){
			base.setChildren(updateClass(base));
		}
		for(Object child : base.getChildren()){
			updateAllChildren( (OutlineItem) child);
		}
		
		
	}
	public int getPackageChildrenCount(OutlineItem outlineItem) {
		Package p = findPackage(outlineItem.getLabel());
		return p.getOwnedTypeDefinition().size() + p.getNestedPackage().size();
	}
	public int getClassChildrenCount(OutlineItem outlineItem) {
		Package p = findPackage(outlineItem.getLabel());
		for(int i=0; i < p.getOwnedTypeDefinition().size(); i++){
			if ( p.getOwnedTypeDefinition().get(i).getName().compareTo(outlineItem.label) == 0 &&
				(p.getOwnedTypeDefinition().get(i) instanceof ClassDefinition)	){
				ClassDefinition cn = (ClassDefinition) p.getOwnedTypeDefinition().get(i);
				return /*cn.getOwnedAttribute().size() +*/ cn.getOwnedOperation().size();
			}
		}
		return 0;
	}
}
