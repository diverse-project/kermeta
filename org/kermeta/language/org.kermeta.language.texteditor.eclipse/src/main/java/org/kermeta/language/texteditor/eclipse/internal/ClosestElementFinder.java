/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 25 mai 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.texteditor.eclipse.internal;

import org.kermeta.language.behavior.Block;
import org.kermeta.language.behavior.CallFeature;
import org.kermeta.language.behavior.Expression;
import org.kermeta.language.behavior.UnresolvedCall;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Package;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.TypeDefinition;

public class ClosestElementFinder {

	public String fileUrl;
	public KermetaEditor editor;
	public int documentOffset;
	
	/**
	 * @param fileUrl
	 * @param editor
	 * @param documentOffset
	 */
	public ClosestElementFinder(KermetaEditor editor,int documentOffset) {
		super();
		this.editor = editor;
		this.fileUrl = editor.getFile().getLocationURI().toString();
		this.documentOffset = documentOffset;
	}

	public KermetaModelElement findClosestContainerModelelement(){
		String kpIdentifier = KermetaBuilder.getDefault().findKPidentifierFromKMT(editor.getFile());
		ModelingUnit theCurrentMU = KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier); 
		
		// sometimes doesn't works due to : invalid latest modeling unit (probably because the dirty doesn't work)
		//  or works on an out of date modeling unit, and the offset are wrong
	
		return findClosestContainerModelelement(theCurrentMU);
	}
	
	public KermetaModelElement findClosestContainerModelelement(ModelingUnit mu){
		KermetaModelElement result = null;
		if (mu != null) {
			for(  org.kermeta.language.structure.Package pack : mu.getPackages()){				 
				KermetaModelElement res = findClosestContainerModelelement(pack);
				if(res != null) result = res;
			}
		}
		return result;
	}
	
	public KermetaModelElement findClosestContainerModelelement(Package pack) {
		KermetaModelElement result = null;
		if (pack != null && containsThisOffset(pack)) {
			for( org.kermeta.language.structure.TypeDefinition td : pack.getOwnedTypeDefinition()){
				// workaround polymorphism kermeta V1 compiler bug
				KermetaModelElement res;
				if(td instanceof ClassDefinition) res = findClosestContainerModelelement((ClassDefinition)td);
				else res = findClosestContainerModelelement(td);
				if(res != null) result = res;
			}
			if(result == null) result = pack;
		}
		return result;
	}

	public KermetaModelElement findClosestContainerModelelement( TypeDefinition td) {
		if (td != null && containsThisOffset(td)){
			// workaround polymorphism kermeta V1 compiler bug
			if(td instanceof ClassDefinition){
				return findClosestContainerModelelement((ClassDefinition)td);
			}
			else return td;
		}
		return null;
	}
	
	public KermetaModelElement findClosestContainerModelelement( ClassDefinition cd) {
		KermetaModelElement result = null;
		if (cd != null && containsThisOffset(cd)){
			for(org.kermeta.language.structure.Operation op : cd.getOwnedOperation() ){
				KermetaModelElement res  = findClosestContainerModelelement(op);
				if(res != null) result = res;				
			}	
			if(result == null) result = cd;
		}
		return result;
	}

	public KermetaModelElement findClosestContainerModelelement(Operation op) {
		KermetaModelElement result = null;
		if (op != null && containsThisOffset(op)){
			KermetaModelElement res = findClosestContainerModelelement(op.getBody());
			if(res != null) result = res;
			if(result == null) result = op;
			
		}
		return result;
	}
	
	public KermetaModelElement findClosestContainerModelelement( Expression expression) {
		if (expression != null && containsThisOffset(expression)){
			// workaround polymorphism kermeta V1 compiler bug
			if(expression instanceof Block){
				return findClosestContainerModelelement((Block)expression);
			}
			else if(expression instanceof CallFeature){
				return findClosestContainerModelelement((CallFeature)expression);
			}
			else  if(expression instanceof UnresolvedCall){
				return findClosestContainerModelelement((UnresolvedCall)expression);
			}
			else return expression;
		}
		return null;
	}
	
	public KermetaModelElement findClosestContainerModelelement( Block expression) {
		KermetaModelElement result = null;
		if (expression != null && containsThisOffset(expression)){
			for(Expression e : expression.getStatement()){
				KermetaModelElement res  = findClosestContainerModelelement(e);
				if(res != null) result = res;	
			}
			if(result == null) result = expression;
		}
		return result;
	}
	
	public KermetaModelElement findClosestContainerModelelement( CallFeature expression) {
		KermetaModelElement result = null;
		if (expression != null && containsThisOffset(expression)){
			KermetaModelElement res  = findClosestContainerModelelement(expression.getTarget());
			if(res != null) result = res;
			if(result == null) result = expression;
		}
		return result;
	}
	
	public KermetaModelElement findClosestContainerModelelement( UnresolvedCall expression) {
		KermetaModelElement result = null;
		if (expression != null && containsThisOffset(expression)){
			KermetaModelElement res  = findClosestContainerModelelement(expression.getTarget());
			if(res != null) result = res;
			if(result == null) result = expression;
		}
		return result;
	}

	public boolean containsThisOffset(KermetaModelElement kme){
		for(Tag tag : kme.getKOwnedTags()){
			if(tag.getName().equals("traceability_text_reference")){
				String[] val = tag.getValue().split(";");
				if(val.length == 3){
					int begin = Integer.parseInt(val[1]);
					int end = Integer.parseInt(val[2]);
					if(val[0].equals(fileUrl) && begin <= documentOffset && documentOffset <= end){
						return true;
					}
				}
			}
		}
		return false;
	}
}
