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

import java.util.Scanner;

import org.kermeta.language.loader.kmt.scala.KMPrinter;
import org.kermeta.language.structure.Class;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Package;
import org.kermeta.language.texteditor.eclipse.internal.outline.OutlineItem.OutlineTypes;

public class KermetaOutlineHelper {
	private ModelingUnit modelingUnit;
	public KermetaOutlineHelper(ModelingUnit o){
		modelingUnit = o;
	}
	public OutlineItem getRootStructure(){
		OutlineItem base = new OutlineItem("KermetaRoot");
		base.children = new OutlineItem[this.modelingUnit.getPackages().size()];
		for (int i = 0; i < this.modelingUnit.getPackages().size(); i++) {
			OutlineItem ele = new OutlineItem(this.modelingUnit.getPackages().get(i).getName(),base);
			ele.type = OutlineTypes.Package;			
			base.children[i] = ele;
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
						OutlineItem it = new OutlineItem(label,parent);
						/*
						for(int k=0; k < op.getOwnedParameter().size(); k++){
							params += op.getOwnedParameter().get(k).getName();
							if ( k < op.getOwnedParameter().size()-1 ){
								params += ",";
							}
						}
						*/
						it.type = OutlineTypes.Operation;
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
			OutlineItem it = new OutlineItem(p.getOwnedTypeDefinition().get(i).getName(),parent);
			if (p.getOwnedTypeDefinition().get(i) instanceof ClassDefinition){
				it.type = OutlineTypes.Class;
			}
			objs[cnt] = it;
			cnt++;
		}
		for(int i=0; i < p.getNestedPackage().size(); i++){
			OutlineItem it = new OutlineItem(p.getNestedPackage().get(i).getName(),parent);
			it.type = OutlineTypes.Package;
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
}
